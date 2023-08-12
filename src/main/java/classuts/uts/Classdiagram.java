package classuts.uts;

import org.apache.tomcat.util.digester.SystemPropertySource;

public class Classdiagram {
    private String noktp;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private int numberOfStays;
    private String infocheckin;
    private String infocheckout;
    private int totalbayar;
    private String pesananmakan;

    public Classdiagram(String noktp, String name, String address, String phoneNumber, String email, String infocheckin, String infocheckout, String pesananmakan) {
        this.noktp = noktp;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.numberOfStays = 0;
        this.infocheckin = infocheckin;
        this.infocheckout = infocheckout;
        this.totalbayar = 150000;
        this.pesananmakan = pesananmakan;
         //Awalnya belum pernah menginap
    }

    // Getter and Setter methods for attributes
    public String getKTP() {
        return noktp;
    }
     

    public void setKTP(String noktp) {
        this.noktp = noktp;
    }
    public String getName() {
        return name;
    }
     

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getpesanmakan() {
        return pesananmakan;
    }
    public void setpesanmakan(String pesananmakan) {
        this.pesananmakan = pesananmakan;
    }
    public String getinfoin() {
        return infocheckin;
    }
     public void setinfoin(String infocheckin) {
        this.infocheckin = infocheckin;
    }
    public String getinfoout() {
        return infocheckout;
    }
     public void setinfoout(String infocheckout) {
        this.infocheckout = infocheckout;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfStays() {
        return numberOfStays;
    }

    public void setNumberOfStays(int numberOfStays) {
        this.numberOfStays = numberOfStays;
    }

    // Method to increment the number of stays
    public void incrementStays() {
        numberOfStays++;
    }
    public int gettotalbayar() {
        return totalbayar;
    }
    public void settotalbayar(int totalbayar) {
        this.totalbayar = totalbayar;
    }
    public void incrementbayar() {
        totalbayar++;
    }



    // Method to display customer information
    public void displayInfo() {
        System.out.println("Info Tamu : ");
        System.out.println("No KTP: " + noktp);
        System.out.println("Nama: " + name);
        System.out.println("Alamat: " + address);
        System.out.println("Nomer telepon: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Nomor kamar: " + numberOfStays);
        System.out.println("Info checkin : " + infocheckin);
        System.out.println("Info checkout : " + infocheckout);
        System.out.println("Total bayar: " + totalbayar);
        System.out.println("pesanan makan: " + pesananmakan);
    }

    public static void main(String[] args) {

        Classdiagram customer = new Classdiagram("0837986429534","Oktaviko", "Kebumen", "0813911502822", "oktaviko@gmail.com", "2023-10-7", "2023-10-14", "Ayam Geprek");
        customer.incrementStays();
        customer.incrementStays();
        customer.displayInfo();
    }
}
