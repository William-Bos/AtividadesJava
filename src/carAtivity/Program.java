package carAtivity;

import java.util.Scanner;
import carAtivity.Car;
public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Enter car data:");
        System.out.println("Brand:");
        car.brand = sc.nextLine();
        System.out.println("Model:");
        car.model = sc.nextLine();
        System.out.println("Year:");
        car.year = sc.nextInt();
        System.out.println(car);
        System.out.println("How much do you want to accelerate?");
        double speed = sc.nextDouble();
        car.accelerate(speed);
        System.out.printf("You accelerate" + car.speed);
        System.out.println(car);
    }
}
