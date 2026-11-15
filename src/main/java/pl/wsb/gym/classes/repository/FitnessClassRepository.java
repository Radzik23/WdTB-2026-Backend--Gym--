package pl.wsb.gym.classes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wsb.gym.classes.entity.FitnessClass;
import java.util.List;

public interface FitnessClassRepository extends JpaRepository<FitnessClass, Long> {

    // Szuka zajęć poprzez relację (trener -> jego nazwisko)
    List<FitnessClass> findByTrainer_LastName(String lastName);
}