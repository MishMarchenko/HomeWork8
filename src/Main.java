import exception.InvalidDoorsNumberException;
import exception.InvalidSteeringWheelNumberException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("First and Second part HW");
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
        System.out.println("Third part HW");
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++){
            list.add(i);
        }
        System.out.println(list);
        list.remove(9);
        list.remove(8);
        list.remove(7);
//        list.remove(7); можно и так удалить последние три, он будет удалять 7й индекс пока он не станет последний и потом его тоже клоцнет)
//        list.remove(7);
//        list.remove(7);
        list.set(6, 10);
        System.out.println(list);
    }
}