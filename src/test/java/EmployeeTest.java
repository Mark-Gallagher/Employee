import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {


    @BeforeEach
    public void testSetup(){
        Employee emp = new Employee();
    }

    @Test
    @DisplayName("TestTitle")
    public void test_getTitle () {
        //Employee emp = new Employee();
        assertEquals("Mr", emp.getTitle());
    }
    @Test
    @DisplayName("TestTitle")
    public void test_getName() {
        //Employee emp = new Employee();
        assertEquals("Brian", emp.getName());
    }








}
