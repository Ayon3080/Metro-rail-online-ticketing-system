package User;

import java.lang.*;

public abstract class User{
    protected String name;
    protected String phoneNum;
    protected String email;
    protected String password;

    User(String name, String phoneNum, String email, String password) {
        this.name=name;
        this.phoneNum=phoneNum;
        this.email=email;
        this.password=password;
    }
    public abstract String getName();
    public abstract String getPhoneNum();
    public abstract String getEmail();
    public abstract String getPassword();

}

