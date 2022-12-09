interface Priceable{
    int getPrice();
}

class Car implements Priceable{
    private int price;
    public Car(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class TaskPriceable {
    public static void main(String[] args) {
        Car c = new Car(1000000);
        System.out.print(String.format("Цена автомобиля: %d\n", c.getPrice()));
    }
}