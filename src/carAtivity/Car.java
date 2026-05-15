package carAtivity;

public class Car {
    String brand;
    String model;
    int year;
    double speed;

    public String toString(){
        return String.format(
                "Car data:%nBrand: %s%nModel: %s%nYear: %d%nCurrent speed: %.2f",
                brand,
                model,
                year,
                speed
        );
    }
    public double accelerate(double speed){
        return this.speed += speed;
    }

}
