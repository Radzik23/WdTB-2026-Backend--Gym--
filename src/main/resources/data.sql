-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);
insert into user_account (email, display_name, role, created_at) values
    ('s714628@student.wroclaw.merito.pl', 'Dominika', 'USER', current_timestamp),
    ('s871744@student.wroclaw.merito.pl', 'Jakub', 'USER', current_timestamp),
    ('trener@gym.pl', 'Trener', 'USER', current_timestamp);

-- ===== LAB 02 - membership =====
insert into membership (name, price, duration_days, active) values
    ('Karnet Open', 150.00, 30, true),
    ('Karnet Poranny', 99.00, 30, true),
    ('Wejscie Jednorazowe', 35.00, 1, false);
-- ===== LAB 02 - fitness_class =====
insert into fitness_class (class_name, instructor_name, max_participants, category) values
    ('Joga dla poczatkujacych', 'Anna Kowalska', 15, 'RELAX'),
    ('Zumba', 'Ewa Nowak', 20, 'CARDIO'),
    ('Trening Silowy', 'Jan Kowalski', 10, 'STRENGTH');
-- ===== LAB 02 - member =====