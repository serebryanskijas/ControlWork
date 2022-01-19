package controlWork2;

import java.text.ParseException;

enum Status {
    FREE, ACTIVE
}

enum ModelCars {
    N1, N2, N3, A1, A2, A3
}

class Model extends Car {
    private ModelCars model;
    private Status status;

    public Model(String sDateTimeNotActive, double averageLoadCapacity, String driver, ModelCars model, Status status) throws ParseException {
        super(sDateTimeNotActive, averageLoadCapacity, driver);
        this.brand = "Track";
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
        String result;
        //if (sDateTimeActive.isEmpty())
            result = String.format("[%s - %s, Driver mr. %s" + "\nOn the date: %s have a status: $s average load capacity: %f tons]%n",
                    getBrand(), getModel().toString(), getDriver(), getsDateTime, getStatus().toString(), getAverageLoadCapacity());
      /*  else
            result = String.format("[%s - %s, Car is busy: %s, average load capacity: %f tons]%n",
                    getBrand(), getModel().toString(), getsDateTimeActive(), getAverageLoadCapacity());*/
        return result;
    }
}