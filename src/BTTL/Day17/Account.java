package BTTL.Day17;

public class Account {
    private int id;
    private static int idUp=1;
    private String username;
    private String pass;
    private String fullName;
    private String phoneNumber;
    private String address;

    public Account() {
    }

    public Account( String username, String pass, String fullName, String phoneNumber, String address) {
        this.id = idUp++;
        this.username = username;
        this.pass = pass;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account "+
                "id=" + id +
                ", username='" + username +
                ", pass='" + pass +
                ", fullName='" + fullName +
                ", phoneNumber='" + phoneNumber +
                ", address='" + address ;
    }
}
