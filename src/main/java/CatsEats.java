public class CatsEats {
    public static void main(String[] args) {
        Cat [] cat = {new Cat(" Barsik", 10, false),
                new Cat(" Дымок", 95, false),
                new Cat(" Рыжик", 20, false)};
        Plate plate = new Plate(100);
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            cat[i].catInfo();
        }

        System.out.println("_________________________");

        for (Cat i: cat) {
            i.eat(plate);
        }
        System.out.println("___________________________");

        plate.info();

        plate.increaseFood(50);
        plate.info();
        cat[1].eat(plate);
        plate.info();
        plate.increaseFood(1000);
        plate.info();
    }
}
