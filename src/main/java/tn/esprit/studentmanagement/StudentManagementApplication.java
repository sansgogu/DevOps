package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")   // 👉 très important : sur la classe
class StudentManagementApplicationTests {

    @Test
    void contextLoads() {
        // test vide : on vérifie juste que le contexte Spring démarre
    }
}
