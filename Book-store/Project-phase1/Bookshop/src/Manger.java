public class Manger extends Person{
    private String Password;
    private double Salary;
    private double Wage;
    private int WorkingHours;

    public Manger() {
    }

    public Manger(String name, int ID, String password, double salary, double wage, int workingHours) {
        super(name, ID);
        Password = password;
        Salary = salary;
        Wage = wage;
        WorkingHours = workingHours;
    }
    public void CheckAvailability (){

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

    public double getWage() {
        return Wage;
    }

    public void setWage(double wage) {
        Wage = wage;
    }

    public int getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {
        WorkingHours = workingHours;
    }
    public double CalculateSalary (){
        return 0.0;
    }
}
