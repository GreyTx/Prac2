package OOP.BillBurger;

public class Hamburger {


    String name;
    String meat;
    double price;
    String breadRollType;

    String addition1Name;
    double addition1Price;
    String addition2Name;
    double addition2Price;
    String addition3Name;
    double addition3Price;
    String addition4Name;
    double addition4Price;

    public Hamburger(){

    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHamburgerAddition1(String addition1Name, double price){
        this.addition1Name = addition1Name;
        addition1Price+=price;
    }

    public void addHamburgerAddition2(String addition2Name, double price){
        this.addition2Name = addition2Name;
        addition2Price+=price;
    }
    public void addHamburgerAddition3(String addition3Name, double price){
        this.addition3Name = addition3Name;
        addition3Price+=price;
    }
    public void addHamburgerAddition4(String addition4Name, double price){
        this.addition4Name = addition4Name;
        addition4Price+=price;
    }

    public  double itemizehamburger(){
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
     }


}
