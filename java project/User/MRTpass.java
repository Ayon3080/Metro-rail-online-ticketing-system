package User;

public class MRTpass extends User{
    String nidNum;
    String passNum;
    String time;
    String root;
    public MRTpass(String name, String PhoneNum, String email, String password, String nidNum, String passNum, String time, String root){
        super(name, PhoneNum, email, password);
        this.nidNum=nidNum;
        this.passNum=passNum;
        this.time = time;
        this.root = root;

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
    public String getNidNum() {
        return nidNum;
    }
    public String getPassNum(){
        return passNum;
    }
    public String getYearsExp() {
        return time;
    }

    public String getCarType() {

        return root;

    }
    public void showMRTpassDetails() {

        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Email Address: " + email);
        System.out.println("Password: "+ password);
        System.out.println("NID Number: "+nidNum);
        System.out.println("MRT Pass Number: " + passNum);

    }
}
