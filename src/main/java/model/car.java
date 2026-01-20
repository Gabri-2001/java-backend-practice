package model;

public class car {

    private Long id;

    private String brand;
    private String model;
    private String year;



    private String licensePlate;
    private String mileage;

    private double price;


    public car(){
        //required by frameworks
    }

    public car(String brand, String model, String year, String licensePlate, String mileage, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.mileage = mileage;
        this.price = price;
    }

    public Long getId(){
        return id;
    }

    public String getBrand(){
        return brand;
    }

    public String model(){
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
