package controlWork2;

import java.text.ParseException;

enum Status {
    FREE, BUSY
}

enum ModelCars {
    N3_5, N6_9, N9_12
}

class Model extends Car {
    private ModelCars model;
    private Status status;

    public Model(String driver, int startHour, int endHour, double averageLoadCapacity, String routeInfo, String kindCargo, ModelCars model, Status status) {
        super(driver, startHour, endHour, averageLoadCapacity, routeInfo, kindCargo);
        this.model = model;
        this.status = status;
    }

    public Model(String driver, double averageLoadCapacity, ModelCars model, Status status) {
        super(driver, averageLoadCapacity);
        this.model = model;
        this.status = status;
    }


    public ModelCars getModel() {
        return model;
    }

    public Status getStatus() {
        return status;
    }

    public String toString() {
        String result = "";
        if (getStatus().equals(Status.BUSY))
            result = String.format("""
                            [%s - %s, Driver mr. %s
                            Track is busy with %d:00 from %d:00
                            Average load capacity: %.1f tons, route is %s, kind cargo is %s]%n""",
                    brand, getModel().toString(), getDriver(), getStartHour(), getEndHour(), getAverageLoadCapacity(),
                    getRouteInfo(), getKindCargo());
        else
            result = String.format("[%s - %s, Driver mr. %s, Track is %s, average load capacity: %.2f tons]%n",
                    brand, getModel().toString(), getDriver(), getStatus().toString(), getAverageLoadCapacity());

        return result;
    }
}