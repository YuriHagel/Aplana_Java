package Box;

public class Coal extends HolidayGift {
    private String color;

    public Coal(String name, String color, int weight, Double price) {
        super(name, weight, price);
        this.color = color;
    }

    @Override
    public String toString() {
                    return "Candy + [" + super.toString() + ", color" + color + "]";
        }
    }

