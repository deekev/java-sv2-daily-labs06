package day02.cars;

public class Car {

    private String type;
    private double sizeOfMotor;
    private Color color;
    private int price;

    public Car(String type, double sizeOfMotor, Color color, int price) {
        this.type = type;
        this.sizeOfMotor = sizeOfMotor;
        this.color = color;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getSizeOfMotor() {
        return sizeOfMotor;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void decreasePrice(int percent) {
        price = (int) (price * (1 - percent / 100D));
    }
}