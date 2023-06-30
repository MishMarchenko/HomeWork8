import exception.InvalidDoorsNumberException;
import exception.InvalidSteeringWheelNumberException;
import exception.InvalidWheelsNumberException;

public class Car {
    private String name;
    private int wheels;
    private int doors;
    private int steeringWheel;
    public Car(String name, int wheels, int doors, int steeringWheel){
        this.name = name;
        this.wheels = wheels;
        this.doors = doors;
        this.steeringWheel = steeringWheel;
    }

    @Override
    public String toString() {
        return "Car " +
                "name = '" + name + '\'' +
                ", wheels = " + wheels +
                ", doors = " + doors +
                ", steeringWheel = " + steeringWheel;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        if (wheels > 4 || wheels < 3){
            throw new InvalidWheelsNumberException("we produce machines with 4 wheels. as an exception, there may be 3");
        }
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors > 5 || doors < 3) {
            throw new InvalidDoorsNumberException("pattern violation. we produce cars with 3,4,5 doors");
        }
        this.doors = doors;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(int steeringWheel) {
        if (steeringWheel != 1) {
                throw new InvalidSteeringWheelNumberException("Only ONE steering wheel can use");
        }
        this.steeringWheel = steeringWheel;
    }
}
