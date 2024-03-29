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
    @DisplayName("Test Age")
    public void testAge(){
        assertEquals(38,emp.getAge());
    }

    @Test
    @DisplayName("Test Address")
    public void testAddress(){
        assertEquals("Kerry",emp.getAddress());
    }

    @Test
    @DisplayName("Test Salary")
    public void testSalary(){
        assertEquals(60000.00, emp.getSalary());
    }
    @Test
    @DisplayName("Test Profession")
    public void testProfession(){
        assertEquals("Construction Worker",emp.getProfession());
    }

    @Test
    @DisplayName("Test toString")
    public void testToString(){
        assertEquals(
                "Employee{" +
                        "name='" + emp.getName() + '\'' +
                        ", id='" + emp.getId() + '\'' +
                        ", age=" + emp.getAge() +
                        ", address='" + emp.getAddress() + '\'' +
                        ", salary=" + emp.getSalary() +
                        ", profession='" + emp.getProfession() + '\'' +
                        '}', emp.toString());
    }

    @Test
    void testConstructorInvalidName(){
        final String invalid_Title = "Invalid name entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("BBrriiaann--WWaallsshheeyy","412550",38,"Kerry",60000.00, "Construction Worker"));
        assertEquals(invalid_Title,exception.getMessage());
    }
    
    @Test
    void testConstructorInvalidId(){
        final String invalid_Id = "Invalid id entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("Brian Walsh","41255062",38,"Kerry",60000.00, "Construction Worker"));
        assertEquals(invalid_Id,exception.getMessage());
    }

    @Test
    void testConstructorInvalidAge(){
        final String invalid_Age = "Invalid age entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("Brian Walsh","412550",42,"Kerry",60000.00, "Construction Worker"));
        assertEquals(invalid_Age, exception.getMessage());
    }

    @Test
    void testConstructorInvalidAddress(){
        final String invalid_Address = "Invalid address entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("Brian Walsh","412550",38,"ker",60000.00, "Construction Worker"));
        assertEquals(invalid_Address, exception.getMessage());
    }

    @Test
    void testConstructorInvalidSalary(){
        final String invalid_Salary = "Invalid salary entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("Brian Walsh","412550",38,"Kerry",20000.00, "Construction Worker"));
        assertEquals(invalid_Salary, exception.getMessage());
    }

    @Test
    void testConstructorInvalidProfession(){
        final String invalid_Profession = "Invalid profession entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("Brian Walsh","412550",38,"Kerry",60000.00, ""));
        assertEquals(invalid_Profession,exception.getMessage());
    }
}
