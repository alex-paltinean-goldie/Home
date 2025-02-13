INSERT INTO user (id, created_at, updated_at, user_id, email, password, role)
VALUES ('1a899bdb-41e7-42ca-843d-9de024c9a4d0', '2025-02-12 19:24:22.234916', '2025-02-12 19:24:22.234916', null,
        'alex.paltinean@yahoo.com', '$2a$10$SwXxr5.NHmTkipSAASyfbOOJdZ50XIUlOlweVFlza1fhLm9m0wiH6', 'ROLE_USER');
INSERT INTO person (id, created_at, updated_at, user_id, birthdate, gender, height, weight)
VALUES ('3a827ebf-ab76-47e9-94db-f16465639a72', null, '2025-02-13 04:25:05.686183',
        '1a899bdb-41e7-42ca-843d-9de024c9a4d0', '2025-02-12 19:24:22.309000', null, 1, 0);
