package tn.esprit.studentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.studentmanagement.entities.Enrollment;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    // Récupérer toutes les inscriptions d'un étudiant via son id
    List<Enrollment> findByStudentIdStudent(Long idStudent);
}
