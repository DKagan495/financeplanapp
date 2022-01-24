create table "user"
(
    id          int          not null primary key,
    first_name  varchar(36)  not null,
    middle_name varchar(45)  not null,
    last_name   varchar(36)  not null,
    birth_date  timestamp    not null,
    email       varchar(127) not null,
    password    varchar(255) not null,
    enabled     timestamp,
    blocked     timestamp,
    deleted     timestamp
);

create table plan
(
    id           int              not null primary key,
    name         varchar(127)     not null,
    description  varchar(500),
    income       double precision not null,
    "left"       double precision not null,
    left_planned double precision not null,
    status       varchar(32)      not null,
    fk_user      int              not null
);

alter table plan
    add constraint fk_user_fk_plan foreign key (fk_user) references "user" (id);