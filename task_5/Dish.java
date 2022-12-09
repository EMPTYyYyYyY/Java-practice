abstract class Dish{
    public String name;

    public Dish(String name){this.name = name;}

    public abstract String getName();
}

class Plate extends Dish {
    public Plate(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Название посуды: " + this.name;
    }
}

class TaskDish {
    public static void main(String[] args) {
        Plate p = new Plate("Тарелка");
        Dish d = new Plate("Таралка 2");

        System.out.println(p.getName());
        System.out.println(d.getName());
    }
}