package test6;

public class User {
    private String Username;
    private String Userpasswd;
    private String shenfennumber;
    private String phonenumber;
    public User()
    {

    }

    public User(String username, String userpasswd, String shenfennumber, String phonenumber) {
        Username = username;
        Userpasswd = userpasswd;
        this.shenfennumber = shenfennumber;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUserpasswd() {
        return Userpasswd;
    }

    public void setUserpasswd(String userpasswd) {
        Userpasswd = userpasswd;
    }

    public String getShenfennumber() {
        return shenfennumber;
    }

    public void setShenfennumber(String shenfennumber) {
        this.shenfennumber = shenfennumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
