package Transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {



    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private final String bodyType;
    private final int numberOfSeats;
    private String transmission;
    private String registrationNumber;
    private String typeOfRubber;
    private Key key;
    private Insurance insurance;


    public class Key {

        private String remoteLaunch;
        private String keylessEntry;

        public Key(String remoteLaunch, String keylessEntry) {
            if (remoteLaunch == null || remoteLaunch.isEmpty() || remoteLaunch.isBlank()) {
                this.remoteLaunch = "default";
            } else {
                this.remoteLaunch = remoteLaunch;
            }
            if (keylessEntry == null || keylessEntry.isBlank() || keylessEntry.isEmpty()) {
                this.keylessEntry = "default";
            } else {
                this.keylessEntry = keylessEntry;
            }

        }

        public String getRemoteLaunch() {
            return remoteLaunch;
        }

        public void setRemoteLaunch(String remoteLaunch) {
            this.remoteLaunch = remoteLaunch;
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(String keylessEntry) {
            this.keylessEntry = keylessEntry;
        }
    }

    public class Insurance {

        private Integer validityPeriod;
        private Integer cost;
        private String number;

        public Insurance(Integer validityPeriod, Integer cost, String number) {
            if (validityPeriod <= 0 || validityPeriod == null) {
                this.validityPeriod = 2022;
            } else {
                this.validityPeriod = validityPeriod;
            }
            if (cost <= 0 || cost == null) {
                this.cost = 10000;
            } else {
                this.cost = cost;
            }
            if (number.isEmpty() || number.isBlank() || number == null) {
                this.number = "00000000";
            } else {
                this.number = number;
            }

        }

        public Integer getValidityPeriod() {
            return validityPeriod;
        }

        public void setValidityPeriod(Integer validityPeriod) {
            this.validityPeriod = validityPeriod;
        }

        public Integer getCost() {
            return cost;
        }

        public void setCost(Integer cost) {
            this.cost = cost;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String bodyType, int numberOfSeats, String registrationNumber, String typeOfRubber) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "белого";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = "не указан";
        } else {
            this.bodyType = bodyType;
        }
        if (numberOfSeats <= 0 || numberOfSeats > 8) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "не указано";
        } else {
            this.transmission = transmission;
        }
        if (typeOfRubber == null || typeOfRubber.isEmpty() || typeOfRubber.isBlank()) {
            this.typeOfRubber = "не указано";
        } else {
            this.typeOfRubber = typeOfRubber;
        }
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public Car changeRubberType(Car car) {
        if (car.getTypeOfRubber() == "Зимняя") {
            car.setTypeOfRubber("Летняя");
        } else {
            car.setTypeOfRubber("Зимняя");
        }
        return car;
    }

    public String checkNumber(String registrationNumber) {
        if (Pattern.matches("[А-я][0-9]{3}[А-я]{2}[0-9]{3}", registrationNumber)) {
            return registrationNumber;
        } else {
            System.out.println("Номер некорректный");
            return "x000xx000";
        }
    }

    public void checkValidityInsurance () {
        if (this.insurance.getValidityPeriod() < LocalDate.now().getYear()) {
            System.out.println("Необходимо оформить новую страховку");
        }
    }

    public String checkNumbInsurance() {
        String num = this.insurance.getNumber();
        if (num.length() != 9) {
            System.out.println("Номер страховки некорректный");
        } else {
            System.out.println("Номер страховки верный");
        }
        return num;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        registrationNumber = registrationNumber;
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(String typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", transmission='" + transmission + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", typeOfRubber='" + typeOfRubber + '\'' +
                ", insurance=" + insurance +
                '}';
    }
}
