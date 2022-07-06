package JavaLevel1.Lessons_L1.Lesson5;

public class Auto {
    private String name;
    public String plateNumber;
    public String vin;
    int productionYear;
    private float fuelContainer;

    public Auto(String name, String vin, int productionYear, float fuelContainer) {
        this.name = name;
        this.vin = vin;
        this.productionYear = productionYear;
        this.fuelContainer = fuelContainer;
    }

    public String getName() {
        return name;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getVin() {
        return vin;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public float getFuelContainer() {
        return fuelContainer;
    }

    void drive() {

    }
}
