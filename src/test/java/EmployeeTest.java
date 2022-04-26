import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    private Employee emp;

    @BeforeEach
    public void employeeCstr(){
        emp = new Employee("Mr","Brian Walsh");
    }

    @Test
    @DisplayName("TestTitle")
    public void test_getTitle () {
        assertEquals("Mr", emp.getTitle());
    }
    @Test
    @DisplayName("TestName")
    public void test_getName() {
        assertEquals("Brian", emp.getName());
    }











}
