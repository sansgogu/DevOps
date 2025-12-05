package tn.esprit.studentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.studentmanagement.entities.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

        // Chercher par email
        Student findByEmail(String email);

        // Chercher par nom
        List<Student> findByLastName(String lastName);

        // Chercher par nom + prénom
        List<Student> findByFirstNameAndLastName(String firstName, String lastName);

        // Chercher tous les étudiants d'un département
        List<Student> findByDepartmentIdDepartment(Long idDepartment);
    }

