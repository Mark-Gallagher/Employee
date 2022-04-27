public class Employee {

    private String title;
    private String name;

    public Employee(String title, String name) {
        this.title = title;
        this.name = name;

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
            String message = "Invalid name entered!";
            throw new IllegalArgumentException(message);
        }

    }

    public void setName(String name) {
        this.name = name;
    }



}
