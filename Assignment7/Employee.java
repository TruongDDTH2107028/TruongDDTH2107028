package Assignment7;
public class Employee {

    private String name;
    private int age;
    private int employeeId;
    public Employee (String name, int age, int employeeId) {
        super ();
        this.name =name;
        this.age= age;
        this.enployeeId= employeeId;
    }
    public String getNane () {return name;}
    public void setName (String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public int getEmployeeId() { return employeeId;}
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId;}

    @Override
    public String toString(){
        return "com.example.model.Employee [name=" + name + ", age="+ age +" employeeId="+ employeeId + "]";
    }
}