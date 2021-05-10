-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public."Users"
(
    "Id" integer NOT NULL GENERATED ALWAYS AS IDENTITY ,
    "Email" character varying(50) NOT NULL,
    "Password" character varying(50) NOT NULL,
    PRIMARY KEY ("Id")
);

CREATE TABLE public."JobseekerUsers"
(
    "UserId" integer NOT NULL,
    "FirstName" character varying(50) NOT NULL,
    "LastName" character varying(50) NOT NULL,
    "NationalIdentity" character varying(11) NOT NULL,
    "BirthOfYear" smallint NOT NULL,
    PRIMARY KEY ("UserId")
);

CREATE TABLE public."EmployerUsers"
(
    "UserId" integer NOT NULL,
    "CompanyName" character varying(50) NOT NULL,
    "CompanyWebsite" character varying(50) NOT NULL,
    "PhoneNumber" character varying(11) NOT NULL,
    PRIMARY KEY ("UserId")
);

CREATE TABLE public."Positions"
(
    "Id" integer NOT NULL GENERATED ALWAYS AS IDENTITY,
    "Name" character varying(50) NOT NULL,
    PRIMARY KEY ("Id")
);

CREATE TABLE public."EmployeeUsers"
(
    "UserId" integer NOT NULL,
    "FirstName" character varying(50) NOT NULL,
    "LastName" character varying(50) NOT NULL,
    PRIMARY KEY ("UserId")
);

ALTER TABLE public."Users"
    ADD FOREIGN KEY ("Id")
    REFERENCES public."JobseekerUsers" ("UserId")
    NOT VALID;


ALTER TABLE public."Users"
    ADD FOREIGN KEY ("Id")
    REFERENCES public."EmployerUsers" ("UserId")
    NOT VALID;


ALTER TABLE public."Users"
    ADD FOREIGN KEY ("Id")
    REFERENCES public."EmployeeUsers" ("UserId")
    NOT VALID;

END;