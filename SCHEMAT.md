# Schemat bazy danych

Plik generują reguły projektu (panel Maven → Lifecycle → verify). Nie edytujcie go ręcznie.

Tabele: 6 · kolumny: 33 · relacje: 4 × @ManyToOne, 1 × @OneToMany, 1 × @OneToOne, 0 × @ManyToMany

| Tabela | Encja | Kolumny | Klucze obce |
|---|---|---|---|
| class_reservation | ClassReservation | 5 | fitness_class_id, member_id |
| fitness_class | FitnessClass | 5 | trainer_id |
| member | Member | 8 | membership_id, user_account_id |
| membership | Membership | 5 | — |
| trainer | Trainer | 5 | — |
| user_account | UserAccount | 5 | — |

```mermaid
erDiagram
    class_reservation {
        Long id PK
        Long fitness_class_id FK
        Long member_id FK
        String notes
        LocalDate reservation_date
    }
    fitness_class {
        Long id PK
        ClassCategory category
        String class_name
        Integer max_participants
        Long trainer_id FK
    }
    member {
        Long id PK
        String city
        String first_name
        LocalDate join_date
        String last_name
        Long membership_id FK
        String phone
        Long user_account_id FK
    }
    membership {
        Long id PK
        Boolean active
        Integer duration_days
        String name
        BigDecimal price
    }
    trainer {
        Long id PK
        String first_name
        BigDecimal hourly_rate
        String last_name
        String specialization
    }
    user_account {
        Long id PK
        LocalDateTime created_at
        String display_name
        String email
        AccountRole role
    }
    fitness_class ||--o{ class_reservation : "fitness_class_id"
    member ||--o{ class_reservation : "member_id"
    membership ||--o{ member : "membership_id"
    trainer ||--o{ fitness_class : "trainer_id"
    user_account |o--o| member : "user_account_id"
```
