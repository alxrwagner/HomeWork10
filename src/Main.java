public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1(){
        Car lada = new Car();
        Car audi = new Car();
        Car bmw = new Car();
        Car kia = new Car();
        Car hyundai = new Car();

        lada.setBrand("Lada");
        lada.setModel("Granta");
        lada.setProductionYear(2015);
        lada.setProductionCountry("Россия");
        lada.setColor("Желтый");
        lada.setEngineVolume(1.7f);

        audi.setBrand("Audi");
        audi.setModel("A8 50 L TDI quattro");
        audi.setProductionYear(2020);
        audi.setProductionCountry("Германия");
        audi.setColor("Черный");
        audi.setEngineVolume(3.0f);

        bmw.setBrand("BMW");
        bmw.setModel("Z8");
        bmw.setProductionYear(2021);
        bmw.setProductionCountry("Германия");
        bmw.setColor("Черный");
        bmw.setEngineVolume(3.0f);

        kia.setBrand("Kia");
        kia.setModel("Sportage 4");
        kia.setProductionYear(2018);
        kia.setProductionCountry("Южная Корея");
        kia.setColor("Красный");
        kia.setEngineVolume(2.4f);

        hyundai.setBrand("Hyundai");
        hyundai.setModel("Avante");
        hyundai.setProductionYear(2016);
        hyundai.setProductionCountry("Южная Корея");
        hyundai.setColor("Оранжевый");
        hyundai.setEngineVolume(1.6f);

        lada.printInfo();
        audi.printInfo();
        bmw.printInfo();
        kia.printInfo();
        hyundai.printInfo();
    }

    public static void task2(){
        Car2 lada = new Car2("Lada", "Granta", "Желтый", "Россия", 2015, 1.7f);
        Car2 audi = new Car2("Audi ", "A8 50 L TDI quattro", "Черный ", "Германия", 2020, 3.0f);
        Car2 bmw = new Car2("BMW", "Z8", "Черный", "Германия", 2021  , 3.0f);
        Car2 kia = new Car2("Kia ", "Sportage 4-го поколения", "Красный", "Южная Корея", 2018 , 2.4f);
        Car2 hyundai = new Car2("Hyundai ", "Avante", "Оранжевый", "Южная Корея", 2016 , 1.6f);

        lada.printInfo();
        audi.printInfo();
        bmw.printInfo();
        kia.printInfo();
        hyundai.printInfo();
    }

    public static void task3(){
        Car2 lada = new Car2("", "Granta", "Желтый", "", 2015, 1.7f);
        Car2 audi = new Car2("Audi ", "A8 50 L TDI quattro", " ", "Германия", 0, 3.0f);
        Car2 bmw = new Car2("BMW", "Z8", "Черный", "Германия", 2021  , 0);
        Car2 kia = new Car2("Kia ", "Sportage 4-го поколения", "Красный", "Южная Корея", 2018 , 2.4f);
        Car2 hyundai = new Car2(null, " ", "", "",  0, 0);

        lada.printInfo();
        audi.printInfo();
        bmw.printInfo();
        kia.printInfo();
        hyundai.printInfo();
    }
}