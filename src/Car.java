public class Car {
    private String name;
    private String color;
    private int maxGuest;
    private int price;

    public Car(String name, String color, int maxGuest, int price) {
        this.name = name;
        this.color = color;
        this.maxGuest = maxGuest;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxGuest=" + maxGuest +
                ", price=" + price +
                '}';
    }
}
