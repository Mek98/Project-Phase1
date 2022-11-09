public class Worker extends Person{
    private String Password;
    private double Salary;
    private int ID;
    private int WorkingHours;

    public Worker() {
    }

    public Worker(String name, int ID, String password, double salary, int ID1, int workingHours) {
        super(name, ID);
        Password = password;
        Salary = salary;
        this.ID = ID1;
        WorkingHours = workingHours;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {
        WorkingHours = workingHours;
    }
}
