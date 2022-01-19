package controlWork2;

public class Car {
    protected String brand = "Track";
    protected String driver; //водитель
    protected int startHour; // Время начала рейса
    protected int endHour; // Время окончания рейса
    protected double averageLoadCapacity; // Средняя грузоподъемность
    protected String routeInfo; //инфо о маршруте
    protected String kindCargo; //Вид груза

    public Car(String driver, int startHour, int endHour, double averageLoadCapacity, String routeInfo, String kindCargo) {

        this.driver = driver;
        this.startHour = startHour;
        this.endHour = endHour;
        this.averageLoadCapacity = averageLoadCapacity;
        this.routeInfo = routeInfo;
        this.kindCargo = kindCargo;
    }

    public Car(String driver, double averageLoadCapacity) {
        this.driver = driver;
        this.averageLoadCapacity = averageLoadCapacity;
    }

    public String getDriver() {
        return driver;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public double getAverageLoadCapacity() {
        return averageLoadCapacity;
    }

    public String getRouteInfo() {
        return routeInfo;
    }

    public String getKindCargo() {
        return kindCargo;
    }

}