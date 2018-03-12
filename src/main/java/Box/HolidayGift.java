package Box;


import java.util.UUID;

/**
 * @autor Hagel Yuri
 */
public class HolidayGift {
    UUID uniqueKey = UUID.randomUUID();
    private Double price;
    private String name;
    private int weight;
    private static long id = 1;
    public static String createID(){
        return  String.valueOf(id++);
    }

    public HolidayGift(String name, int weight, Double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
        UUID uniqueKey = UUID.randomUUID();
    }

    @Override
    public  String toString(){
        return "Item id: " + uniqueKey + "\n" +
                "name= " + name + " " + "\n" +
                "price= " + price + " " + "\n" +
                "weight= " + weight + " ";
    }

    public int getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }
    public static void infoGift(HolidayGift[] somebox){
        getComposition(somebox);
        getSummaryWeight(somebox);
        getSummaryPrice(somebox);
    }

    public static void getComposition(HolidayGift[] somebox){
        System.out.println("Gift №" + createID() + "have:");
        for (int i = 0; i < somebox.length ; i++) {
            System.out.println((i + 1) + ")" + somebox[i].toString());

        }
    }

    public static void getSummaryWeight(HolidayGift[] somebox){
        int sumWeight = 0;
        for (int i = 0; i < somebox.length; i++) {
            sumWeight = sumWeight + somebox[i].getWeight();
        }
        System.out.println("empty");
        System.out.println("Summary gift weight: " + sumWeight);
    }

    public static void  getSummaryPrice(HolidayGift[] somebox){
        Double Total = 0.0;
        for (int i = 0; i < somebox.length; i++) {
            Total += somebox[i].getPrice();
        }
        System.out.println("Summary gift price:" + Total + "\n");
    }

    public static void makeHolidayGift() {
        Jellybean jellybean = new Jellybean("Skittles", 100, 2.2);
        Candy candy = new Candy("Starburst", 200, 2.5);
        Coal coal = new Coal("Coal for discobedient boys", "Black", 666, 0.0);

        HolidayGift[] goodGift = new HolidayGift[]{candy, jellybean};
        HolidayGift[] badGift = new HolidayGift[]{coal};
        HolidayGift.infoGift(goodGift);
        HolidayGift.infoGift(badGift);
    }


}
