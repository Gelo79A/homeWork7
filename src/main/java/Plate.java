public class Plate {
    private int food;
    private  int limit;

        public Plate(int food) {
        this.food = food;
        this.limit = food;
    }

    public void info() {
        System.out.println("plate " + food);
    }

    public boolean decreaseFood(int p, String n) {
        if (food >= p) {
            food = food - p;
           System.out.println(" кот " + n + " наелся");

            return true;
        } else {

            System.out.println("В тарелке не хватает еды " + " для кота " + n);
            return false;
        }

    }

    public void increaseFood(int p) {
            // или просто ничего не принимает food = limit
          if (food + p > limit) {
              food = limit;
          } else {
              food = food + p;
          }
        //food = Math.min((food + p), limit);
    }

}


