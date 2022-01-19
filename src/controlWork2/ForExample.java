package controlWork2;

import java.util.ArrayList;
import java.util.List;

/*Грузовые перевозки. Имеются автомобили разной грузоподъемности. К каждому автомобилю прикреплен водитель. Вывести список свободных автомобилей,
        находящихся в автопарке и подходящих по грузоподъемности для перевозки указанного груза. Вывести список автомобилей,
        находящихся в рейсе на указанное время; их водителей, информацию о маршруте перевозки и грузе.*/
public class ForExample {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addCar(new Model("Ivanov Ivan", 8, 14, 4.0,
                "NewYork - SanAntonio", "Rock", ModelCars.N3_5, Status.BUSY));
        garage.addCar(new Model("Petrov Petr", 9, 15, 5.5,
                "Brest - Minsk", "Wood", ModelCars.N6_9, Status.BUSY));
        garage.addCar(new Model("Sidorov Sidr", 10, 16, 7.0,
                "Moscow - Penza", "Drugs", ModelCars.N6_9, Status.BUSY));
        garage.addCar(new Model("Latin Lat", 11, 17, 10.5,
                "Vilnus - Praga", "Air", ModelCars.N9_12, Status.BUSY));
        garage.addCar(new Model("Andreyko Andrey", 11.5, ModelCars.N9_12, Status.FREE));
        garage.addCar(new Model("Borisovich Boris", 7.5, ModelCars.N6_9, Status.FREE));
        garage.addCar(new Model("Volodko Vladimir", 9.5, ModelCars.N9_12, Status.FREE));
        garage.addCar(new Model("Gringo Grigory", 4.0, ModelCars.N3_5, Status.FREE));

        System.out.println("\n-------------------Control work #2---------------------\n");
        System.out.println(garage);

        System.out.println("-------" +
                "Вывести список свободных автомобилей, находящихся в автопарке и подходящих по " +
                "грузоподъемности для перевозки груза.--------\n");
        ArrayList<Car> freeCars = garage.getFreeCars(6.96);
        for (Car car : freeCars)
            System.out.println(car);
        System.out.println("--------------------------------------------------------------------" +
                "---------------------------------------------------\n");

        System.out.println("-------" +
                "Вывести список автомобилей, находящихся в рейсе на указанное время, их водителей," +
                " информацию о маршруте перевозки и грузе.--------\n");

        ArrayList<Car> busyCars = garage.getBusyCars(10);
        for (Car car : busyCars)
            System.out.println(car);
    }
}

class Garage {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Garage: ALL CAR LIST \n");
        for (Car car : cars) {
            String sCar = car.toString();
            stringBuilder.append(sCar);
        }
        return stringBuilder.toString();
    }

    public ArrayList<Car> getFreeCars(double loadCapacity) {
        ArrayList<Car> freeCars = new ArrayList<>();
        for (Car car : cars)
            if (car.getAverageLoadCapacity() / loadCapacity >= 1.0 && car.getAverageLoadCapacity() / loadCapacity <= 1.5
                    && car.getKindCargo() == null)
                freeCars.add(car);
        return freeCars;
    }

    public ArrayList<Car> getBusyCars(int hour) {
        ArrayList<Car> busyCars = new ArrayList<>();
        for (Car car : cars)
            if (car.getEndHour() >= hour && hour >= car.getStartHour())
                busyCars.add(car);
        return busyCars;
    }
}