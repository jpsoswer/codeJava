package ATM;

public class ATMDemo {
    private String username="jss";
    private String password="123456";
    private double money=20000;

    public ATMDemo() {
    }

    public ATMDemo(String username, String password, double money) {
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
