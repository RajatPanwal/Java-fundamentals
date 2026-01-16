
enum Laptop {
    Macbook(2000), Lenovo(2200), ThinkPad, Del(2400), Hp(2500);

    private int price;

    private Laptop() {
        this.price = 500;
        System.out.println("In default " + this.name());
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In para " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class enum2 {

    public static void main(String args[]) {

        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }

    }

}
