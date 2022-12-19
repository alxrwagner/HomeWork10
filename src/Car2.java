public class Car2 {

    private final String brand;
    private final String model;
    private final String color;
    private final String productionCountry;

    private final int productionYear;
    private final float engineVolume;

    public Car2(String brand, String model, String color, String productionCountry, int productionYear, float engineVolume) {
        if (brand == null || brand.isBlank()){
            this.brand = "default";
        }else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()){
            this.model = "default";
        }else {
            this.model = model;
        }

        if (color == null || color.isBlank()){
            this.color = "Белый";
        }else {
            this.color = color;
        }

        if (productionCountry == null || productionCountry.isBlank()){
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;
        }

        if (productionYear <= 0){
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }

        if (engineVolume <= 0 ){
            this.engineVolume = 1.5f;
        }
        else {
            this.engineVolume = engineVolume;
        }
    }

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
    public void printInfo(){
        System.out.println(toString());
    }
}
