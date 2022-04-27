public class Employee implements Reportable {

    private String name;
    private String id;
    private String details;

    public Employee(String name, String id) {
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
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

    public void setId(String id) {
        if(id.length() >= 8 && id.length() <= 12){
            this.id = id;
        }
        else{
            String message = "Invalid id entered!";
            throw new IllegalArgumentException(message);
        }
    }

    @Override
    public void getReportDetails(String details) {
       
    }
}
