import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee emp;

    @BeforeEach
    void setUp(){
        emp = new Employee("Brian Walsh", "412550197");
    }

    @Test
    @DisplayName("Test Name")
    public void testName() {
        assertEquals("Brian Walsh", emp.getName());
    }

    @Test
    @DisplayName("Test Id")
    public void testId(){
        assertEquals("412550197",emp.getId());
    }

    @Test
    void testConstructorInvalidName(){
        final String invalid_Title = "Invalid name entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("BBrriiaann WWaallsshh12345","412550197"));
        assertEquals(invalid_Title,exception.getMessage());
    }
    
    @Test
    void testConstructorInvalidId(){
        final String invalid_Id = "Invalid id entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("Brian Walsh","41255019758637"));
        assertEquals(invalid_Id,exception.getMessage());
    }
}
