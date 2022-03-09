public class Employee {

    private String title;
    private String name;
    private String ppsid;
    private String phone;
    private String employmentType;
    private int age;

    public Employee(String title, String name, String pps, String phone, String employmentType, int age) {
        this.title = title;
        this.name = name;
        this.ppsid= pps;
        this.phone = phone;
        this.employmentType = employmentType;
        this.age = age;
    }

    public String getTitle() {
        if(title == "Mr" || title == "Mrs" || title == "Ms"){
            System.out.println(title);
            return title;
        }
        else{
            String message = "Invalid title entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        if(name.length() >= 3 && name.length() <= 25 ){
            System.out.println(name);
            return name;
        }
        else{
            String message = "Invalid title entered!";
            throw new IllegalArgumentException(message);
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPps() {
        if(pps)
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
