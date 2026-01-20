package model;

public class car {

    private Long id;

    private String brand;
    private String model;
    private String year;
    private String licensePlate;
    private String mileage;

    private CarStatus status;
    private FuelType fuelType;

    private double price;


    public car(){
        //required by frameworks
    }

    public car(String brand, String model, String year, String licensePlate, String mileage, double price, CarStatus status, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.mileage = mileage;
        this.price = price;
        this.status = status.AVAILABLE;
        this.fuelType = fuelType;
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

    public CarStatus getStatus() {
        return status;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }
}
