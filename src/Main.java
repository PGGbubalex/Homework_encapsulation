import Transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        Human Maksim = new Human(-1988, "Максим", "Минск", "бренд-менеджер");
        Maksim.humanInfo();
        Human Anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Anya.humanInfo();
        Human Katya = new Human(1992, "", "Калининград", "продакт-менеджер");
        Katya.humanInfo();
        Human Artem = new Human(1995, "Артем", "Москва", "");
        Artem.humanInfo();
        Human Vova = new Human(LocalDate.now().getYear() - 21, "Владимир", "Казань", null);
        Vova.humanInfo();

        // Задание 2

        System.out.println("//////////////////////////////////");
        flower rose = new flower("Роза", null, "Голандия", 35.59, 0);
        rose.flowerInfo();
        flower chrysanthemum = new flower("Хризантема", null, null, 15, 5);
        chrysanthemum.flowerInfo();
        flower pion = new flower("Пион", null, "Англия", 69.9, 1);
        pion.flowerInfo();
        flower gypsophila = new flower("Гипсофила", null, "Турция", 19.5, 1);
        gypsophila.flowerInfo();

        // Задание 3
        System.out.println("//////////////////////////////////");
        Car Lada = new Car("", "Granta", 1.7, "", 2015, "России", "", 3, "а123xн545", "Зимняя");
        Lada.changeRubberType(Lada);
        Car.Insurance ladaIns = Lada.new Insurance(2021, 140000,"140000");
        System.out.println(Lada);
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, " ", 2020, "Германии", "", 2, "x000xx000", "Летняя");
        Car.Insurance audiIns = Audi.new Insurance(2023, 140000, "140000");
        System.out.println(Audi);
        Car BMW = new Car("BMW", "Z8", -1, " черного", 2021, "", "", 4, "", "Зимняя");
        Car.Insurance bmwIns = BMW.new Insurance(2024, 140000, "123456789");
        BMW.setInsurance(bmwIns);
        BMW.checkNumbInsurance();
        System.out.println(BMW);
        Car Kia = new Car("Kia", "Sportage 4-го поколения", 2.4, " красного", 2018, "Южной Корее", "", 5, "", "Летняя");
        System.out.println(Kia);
        Car Hyundai = new Car("Hyundai", "", 1.6, "оранжевого", 2016, "Южной Корее", "", -4, "", "");
        System.out.println(Hyundai);
    }
}