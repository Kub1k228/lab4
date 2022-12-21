public class vidiocard  implements Priceable{
    String name;
    int price ;

    public vidiocard(String name, int Price) {
        this.name = name;
        price = Price;
    }

    public int GetPrise() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class monitor implements Priceable{
    String name;
    int price ;

    public monitor(String name, int Price) {
        this.name = name;
        price = Price;
    }

    public int GetPrise() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class start{
    public static void main(String[] args) {
        Priceable obj = new vidiocard("Nvidia rtx 3080", 240000);
        System.out.println("цена = " + obj.GetPrise() + "руб");
        Priceable obj1 = new monitor("AOC", 12000);
        System.out.println("цена = " + obj1.GetPrise() + "руб");
    }
}
