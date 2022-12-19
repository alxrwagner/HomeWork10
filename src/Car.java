public class Car {
    private String brand;
    private String model;
    private String color;
    private String productionCountry;

    private int productionYear;
    private float engineVolume;

    @Override
    public String toString() {
        return "Автомобиль: " +
                "Бренд: " + brand +
                ", Модель: " + model +
                ", Цвет: " + color +
                ", Страна-производитель: " + productionCountry +
                ", Год выпуска: " + productionYear +
                ", Объем двигателя: " + engineVolume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void printInfo(){
        System.out.println(toString());
    }
}
