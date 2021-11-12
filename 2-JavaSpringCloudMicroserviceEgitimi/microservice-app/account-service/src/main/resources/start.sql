CREATE KEYSPACE springcloud
    WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3};

use springcloud;

CREATE TABLE emp(
                    emp_id int PRIMARY KEY,
                    emp_name text,
                    emp_city text,
                    emp_sal varint,
                    emp_phone varint
);

select * from emp;

CREATE TABLE accounts(
                         id text PRIMARY KEY,
                         uname text,
                         name text,
                         surname text,
                         pwd text,
                         email text,
                         birth_date date,
                         created_at timestamp,
                         is_active boolean,
);
