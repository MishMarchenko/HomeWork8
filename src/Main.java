import exception.InvalidDoorsNumberException;
import exception.InvalidSteeringWheelNumberException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Car bmv = new Car("BMVx5", 4, 5, 1);
        Car opel = new Car("OpelZafira", 4,5,1);
        try {
            bmv.setSteeringWheel(8);
        } catch (InvalidSteeringWheelNumberException e){
            System.out.println(e.getMessage());
        }
        try {
            bmv.setDoors(8);
        }catch (InvalidDoorsNumberException ignored){
        }
        System.out.println(bmv);
        System.out.println(opel);
    }
}