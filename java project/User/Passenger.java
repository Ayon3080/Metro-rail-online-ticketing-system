package User;

public class Passenger extends User{
    public Passenger(String name, String PhoneNum, String email, String password){
        super(name, PhoneNum, email, password);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getPhoneNum(){
        return phoneNum;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
    public void showPassengerDetails() {

        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Email Address: " + email);
        System.out.println("Password: " + password);

    }
}
