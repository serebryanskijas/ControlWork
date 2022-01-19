package controlWork2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car /*implements Comparable<Car>*/ {
    protected String brand = ""; //Модель авто



    protected String driver = ""; //водитель
    private final Date dateTime; // Дата и время простоя
    protected String sDateTime;
    protected double averageLoadCapacity; // Средняя грузоподъемность


    Car(String sDateTime, double averageLoadCapacity, String driver) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy-hh:mm");
        this.dateTime = dateFormat.parse(sDateTime);
        this.sDateTime = sDateTime;
        this.averageLoadCapacity = averageLoadCapacity;
        this.driver=driver;
    }
    public String getBrand() {
        return brand;
    }

    public String getDriver() {
        return driver;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public String getsDateTime() {
        return sDateTime;
    }

    public double getAverageLoadCapacity() {
        return averageLoadCapacity;
    }


  /*  @Override
    public int compareTo(Car car) {

        double afc1 = getAverageFuelConsumption();
        double afc2 = car.getAverageFuelConsumption();
        String sAfc1 = String.valueOf(afc1);
        String sAfc2 = String.valueOf(afc2);
        return sAfc1.compareTo(sAfc2);
    }*/


}