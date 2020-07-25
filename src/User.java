public class User {
    private static int counter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String address;
    private int zip;
    private int phone;


    public User(int id, String firstName, String lastName, String eMail, String address, int zip, int phone) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.address = address;
        this.zip = zip;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getAddress() {
        return address;
    }

    public int getZip() {
        return zip;
    }

    public int getPhone() {
        return phone;
    }












    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                ", phone=" + phone +
                '}';
    }
}
