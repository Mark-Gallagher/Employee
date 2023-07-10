public class Employee  {

    private String name;
    private String id;
    private Integer age;
    private String address;
    private double salary;
    private String profession;

    public Employee(String name, String id, Integer age, String address, double salary,String profession) {
       setName(name);
       setId(id);
       setAge(age);
       setAddress(address);
       setSalary(salary);
       setProfession(profession);
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3 && name.length() <= 24){
            this.name = name;
        }
        else{
            String message = "Invalid name entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length() >= 3 && id.length() <= 6){
            this.id = id;
        }
        else{
            String message = "Invalid id entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age >= 18 && age <= 40){
            this.age = age;
        }else{
            String message = "Invalid age entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(Character.isUpperCase(address.charAt(0)) && address.length() >= 4){
            this.address = address;
        }else{
            String message = "Invalid address entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", profession='" + profession + '\'' +
                '}';
    }
}
