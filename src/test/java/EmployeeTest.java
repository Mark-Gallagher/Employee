import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    @DisplayName("TestTitle")
    public void test_getTitle () {
        Employee emp = new Employee();
        assertEquals("Mr", emp.getTitle());
    }
    @Test
    @DisplayName("TestName")
    public void test_getName() {
        Employee emp = new Employee();
        assertEquals("Brian", emp.getName());
    }








}
