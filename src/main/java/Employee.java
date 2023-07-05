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
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
