import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee emp;

    @BeforeEach
    void setUp(){
        emp = new Employee("Brian Walsh", "412550",38,"Kerry",60000.00, "Construction Worker");
    }

    @Test
    @DisplayName("Test Name")
    public void testName() {
        assertEquals("Brian Walsh", emp.getName());
    }

    @Test
    @DisplayName("Test Id")
    public void testId(){
        assertEquals("412550",emp.getId());
    }

    @Test
    void testConstructorInvalidName(){
        final String invalid_Title = "Invalid name entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("BBrriiaann WWaallsshh","412550",38,"Kerry",60000.00, "Construction Worker"));
        assertEquals(invalid_Title,exception.getMessage());
    }
    
    @Test
    void testConstructorInvalidId(){
        final String invalid_Id = "Invalid id entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("Brian Walsh","41255062",38,"Kerry",60000.00, "Construction Worker"));
        assertEquals(invalid_Id,exception.getMessage());
    }
}
