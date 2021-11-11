CREATE KEYSPACE springcloud
    WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3};

use springcloud;

CREATE TABLE accounts(
                    id int PRIMARY KEY,
                    username text,
                    name text,
                    pwd text,
                    email varint,
                    birth_date date,
                    created_at timestamp,
                    is_active boolean,
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
