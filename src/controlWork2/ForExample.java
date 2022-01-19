package controlWork2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Грузовые перевозки. Имеются автомобили разной грузоподъемности. К каждому автомобилю прикреплен водитель. Вывести список свободных автомобилей,
        находящихся в автопарке и подходящих по грузоподъемности для перевозки указанного груза. Вывести список автомобилей,
        находящихся в рейсе на указанное время; их водителей, информацию о маршруте перевозки и грузе.*/
public class ForExample {
    public static void main(String[] args) throws ParseException {
        Garage garage = new Garage();
        garage.addCar(new Model("20.01.2022-10:00", 5.0, "Ivanov", ModelCars.A1, Status.ACTIVE));
       /* garage.addCar(new Model("20.01.2022-09:00", 6.5, "Petrov", ModelCars.A2 ));
        garage.addCar(new Model("20.01.2022-08:00", 7.0, "Sidorov", ModelCars.A3 ));*/


        ArrayList<Car> freeCars = garage.getFreeCars(4.0,8.0);
        for (Car car:freeCars)
            System.out.println(car.toString());
    }
}

class Garage {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

   /* public double getPrice() {
        double sum = 0;
        for (Car car : cars)
            sum += car.getPrice();
        return sum;
    }

    public void sort() {
        Collections.sort(cars);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Garage: \n");
        for (Car car : cars) {
            String sCar = car.toString();
            stringBuilder.append(sCar);
        }
        return stringBuilder.toString();
    }*/

    public ArrayList<Car> getFreeCars(double minLoadCapacity, double maxLoadCapacity) {
        ArrayList<Car> freeCars = new ArrayList<>();
        for (Car car : cars)
            if (car.getAverageLoadCapacity() >= minLoadCapacity && car.getAverageLoadCapacity() <= maxLoadCapacity)
                freeCars.add(car);
        return freeCars;
    }
}