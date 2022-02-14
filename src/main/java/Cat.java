public class Cat {
    private  String name;
    private  int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite, name);

    }

    public void catInfo(){
        System.out.println("Кот" + name + ", " + appetite + ", " + satiety +";");
    }

}
