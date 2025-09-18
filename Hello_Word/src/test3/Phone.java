package test3;

public class Phone {
    private String phonename;
    private int phoneage;

    public Phone() {
    }

    public Phone(String phonename, int phoneage) {
        this.phonename = phonename;
        this.phoneage = phoneage;
    }

    public String getPhonename() {
        return phonename;
    }

    public void setPhonename(String phonename) {
        this.phonename = phonename;
    }

    public int getPhoneage() {
        return phoneage;
    }

    public void setPhoneage(int phoneage) {
        this.phoneage = phoneage;
    }
}
