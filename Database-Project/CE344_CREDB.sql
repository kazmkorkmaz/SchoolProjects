DROP TABLE logincode;
DROP TABLE loginattempt;
DROP TABLE banktransaction;
DROP TABLE orderhistory;
DROP TABLE price;
DROP TABLE temporaryportfolio;
DROP TABLE assettransaction;
DROP TABLE portfolio;
DROP TABLE ordertable;
DROP TABLE exchange_board;
DROP TABLE customer;
DROP TABLE asset;

CREATE TABLE asset
(asset_id NUMBER CONSTRAINT asset_asset_id_pk PRIMARY KEY,
 asset_name VARCHAR2(20) CONSTRAINT asset_asset_name_nn NOT NULL,
 asset_abbreviation VARCHAR2(3) CONSTRAINT asset_asset_abbreviation_nn NOT NULL,
 asset_description VARCHAR2(100) CONSTRAINT asset_asset_description_nn NOT NULL,
 is_active VARCHAR2(5) CONSTRAINT asset_isactive_nn NOT NULL,
 CONSTRAINT asset_asset_abbreviation_uk UNIQUE(asset_abbreviation),
 CONSTRAINT asset_asset_name_uk UNIQUE(asset_name));

CREATE TABLE customer
(customer_id NUMBER CONSTRAINT customer_customer_id_pk PRIMARY KEY,
customer_name VARCHAR2(20) CONSTRAINT customer_customer_name_nn NOT NULL,
customer_lastname VARCHAR2(20) CONSTRAINT customer_customer_lastname_nn NOT NULL,
email VARCHAR2(50) CONSTRAINT customer_email_nn NOT NULL,
password VARCHAR2(20) CONSTRAINT customer_password_nn NOT NULL,
bank_account_number VARCHAR2(32) CONSTRAINT customer_bank_acc_numb_nn NOT NULL,
national_id VARCHAR2(15) CONSTRAINT customer_national_id_nn NOT NULL,
mobile_phone_number VARCHAR2(15) CONSTRAINT customer_mobile_p_number_nn NOT NULL,
date_of_birth DATE CONSTRAINT customer_date_of_birth_nn NOT NULL,
address VARCHAR2(100),
educational_history VARCHAR2(200),
level_of_experience NUMBER,
CONSTRAINT customer_email_uk UNIQUE(email),
CONSTRAINT customer_bank_acc_num_uk UNIQUE(bank_account_number),
CONSTRAINT customer_national_id_uk UNIQUE(national_id),
CONSTRAINT customer_mobile_p_number_uk UNIQUE(mobile_phone_number));

CREATE TABLE loginattempt
(login_attempt_id NUMBER CONSTRAINT loginattempt_log_att_id_pk PRIMARY KEY,
login_email VARCHAR2(50) CONSTRAINT loginattempt_log_email_nn NOT NULL,
login_password VARCHAR2(20) CONSTRAINT loginattempt_log_password_nn NOT NULL,
login_attempt_time DATE CONSTRAINT loginattempt_log_att_time_nn NOT NULL,
login_attempt_status VARCHAR2(5) CONSTRAINT loginattempt_log_att_sta_nn NOT NULL,
login_attempt_exit_time DATE,
login_duration VARCHAR2(50),
customer_id NUMBER CONSTRAINT loginattempt_customer_id_fk REFERENCES customer(customer_id));

CREATE TABLE logincode
(code_id NUMBER CONSTRAINT logincode_code_id_pk PRIMARY KEY,
code_content VARCHAR2(20) CONSTRAINT logincode_code_content_nn NOT NULL,
login_attempt_id NUMBER CONSTRAINT logincode_log_att_id_nn NOT NULL,
CONSTRAINT logincode_code_content_uk UNIQUE(code_content),
CONSTRAINT logincode_log_att_id_fk FOREIGN KEY (login_attempt_id) REFERENCES loginattempt(login_attempt_id));

CREATE TABLE banktransaction
(bank_transaction_id NUMBER CONSTRAINT banktra_bank_tra_id_pk PRIMARY KEY,
bank_transaction_date DATE CONSTRAINT banktra_bank_tra_date_nn NOT NULL,
sender_account VARCHAR2(32) CONSTRAINT banktra_sender_acc_nn NOT NULL,
receiver_account VARCHAR2(32) CONSTRAINT banktra_receiver_acc_nn NOT NULL,
customer_id NUMBER CONSTRAINT banktra_customer_id_nn NOT NULL,
asset_id NUMBER CONSTRAINT banktra_asset_id_nn NOT NULL,
amount NUMBER(18,6) CONSTRAINT banktra_amount_nn NOT NULL,
CONSTRAINT banktra_customer_id_fk FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
CONSTRAINT banktra_asset_id_fk FOREIGN KEY (asset_id) REFERENCES asset(asset_id));

CREATE TABLE portfolio
(portfolio_id NUMBER CONSTRAINT portfolio_portfolio_id_pk PRIMARY KEY,
quantity NUMBER(18,6) CONSTRAINT portfolio_quantity_nn NOT NULL,
customer_id NUMBER CONSTRAINT portfolio_customer_id_nn NOT NULL,
asset_id NUMBER CONSTRAINT portfolio_asset_id_nn NOT NULL,
CONSTRAINT portfolio_customer_id_fk FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
CONSTRAINT portfolio_asset_id_fk FOREIGN KEY (asset_id) REFERENCES asset(asset_id));

CREATE TABLE exchange_board
(exchange_board_id NUMBER CONSTRAINT ex_board_ex_board_id_pk PRIMARY KEY);

CREATE TABLE price
(price_id NUMBER CONSTRAINT price_price_id_pk PRIMARY KEY,
ptime DATE CONSTRAINT price_ptime_nn NOT NULL,
is_active VARCHAR2(5) CONSTRAINT price_is_active_nn NOT NULL,
asset_id NUMBER CONSTRAINT price_asset_id_nn NOT NULL,
exchange_board_id NUMBER CONSTRAINT price_ex_board_id_nn NOT NULL,
buy_price NUMBER(18,6) CONSTRAINT price_buy_price_nn NOT NULL,
sell_price NUMBER(18,6) CONSTRAINT price_sell_price_nn NOT NULL,
CONSTRAINT price_asset_id_fk FOREIGN KEY (asset_id) REFERENCES asset(asset_id));

CREATE TABLE ordertable
(order_id NUMBER CONSTRAINT ordertable_order_id_pk PRIMARY KEY,
asset VARCHAR2(20) CONSTRAINT ordertable_asset_nn NOT NULL,
order_date DATE CONSTRAINT ordertable_order_date_nn NOT NULL,
quantity NUMBER(18,6) CONSTRAINT ordertable_quantity_nn NOT NULL,
price NUMBER(18,6) CONSTRAINT ordertable_price_nn NOT NULL,
amount NUMBER(18,6) CONSTRAINT ordertable_amount_nn NOT NULL,
commission_rate NUMBER(3,3) CONSTRAINT ordertable_comm_rate_nn NOT NULL,
commission_value NUMBER(18,6) CONSTRAINT ordertable_comm_value_nn NOT NULL,
is_active VARCHAR2(5) CONSTRAINT ordertable_is_active_nn NOT NULL,
order_type VARCHAR2(25) CONSTRAINT ordertable_order_type_nn NOT NULL,
exchange_board_id NUMBER CONSTRAINT ordertable_ex_board_id_nn NOT NULL,
asset_id NUMBER CONSTRAINT ordertable_asset_id_nn NOT NULL,
customer_id NUMBER CONSTRAINT ordertable_customer_id_nn NOT NULL,
CONSTRAINT ordertable_ex_board_id_fk FOREIGN KEY (exchange_board_id) REFERENCES exchange_board(exchange_board_id),
CONSTRAINT ordertable_asset_id_fk FOREIGN KEY (asset_id) REFERENCES asset(asset_id),
CONSTRAINT ordertable_customer_id_fl FOREIGN KEY (customer_id) REFERENCES customer(customer_id));

CREATE TABLE orderhistory
(order_history_id NUMBER CONSTRAINT orderhistory_ord_his_id_pk PRIMARY KEY,
order_status VARCHAR2(10) CONSTRAINT orderhistory_ord_status_nn NOT NULL,
order_id NUMBER CONSTRAINT orderhistory_order_id_nn NOT NULL,
order_history_date DATE CONSTRAINT orderhistory_ord_his_date_nn NOT NULL,
CONSTRAINT orderhistory_order_id_fk FOREIGN KEY (order_id) REFERENCES ordertable(order_id));

CREATE TABLE assettransaction
(asset_transaction_id NUMBER CONSTRAINT assetra_asset_tra_id_pk PRIMARY KEY,
asset_transaction_date DATE CONSTRAINT assettra_asset_tra_date_nn NOT NULL,
order_id NUMBER CONSTRAINT assettra_order_id_nn NOT NULL,
asset_id NUMBER CONSTRAINT assettra_asset_id_nn NOT NULL,
customer_id NUMBER CONSTRAINT assettra_customer_id_nn NOT NULL,
CONSTRAINT assettra_order_id_fk FOREIGN KEY (order_id) REFERENCES ordertable(order_id),
CONSTRAINT assettra_asset_id_fk FOREIGN KEY (asset_id) REFERENCES asset(asset_id),
CONSTRAINT assettra_customer_id_fk FOREIGN KEY (customer_id) REFERENCES customer(customer_id));

CREATE TABLE temporaryportfolio
(t_portfolio_id NUMBER CONSTRAINT temport_t_port_id_pk PRIMARY KEY,
quantity NUMBER(18,6) CONSTRAINT temport_quantity_nn NOT NULL,
portfolio_id NUMBER CONSTRAINT temport_portfolio_id_nn NOT NULL,
order_id NUMBER CONSTRAINT temport_order_id_nn NOT NULL,
CONSTRAINT temport_portfolio_id_fk FOREIGN KEY (portfolio_id) REFERENCES portfolio(portfolio_id),
CONSTRAINT temport_order_id_fk FOREIGN KEY (order_id) REFERENCES ordertable(order_id));









