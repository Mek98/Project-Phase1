public class User extends Person{
    private int Age;
    private String Address;
    private int PhoneNumber;

    public User() {

    }

    public User(String name, int ID, int age, String address, int phoneNumber) {
        super(name, ID);
        Age = age;
        Address = address;
        PhoneNumber = phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
