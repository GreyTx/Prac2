package OOP.BillBurger;

public class DeluxeBurger extends Hamburger {

  public  DeluxeBurger(){
     super.price = 19.10;
  }

    @Override
    public void addHamburgerAddition1(String addition1Name, double price) {
        System.out.println("You have ordered a delux burger. No additions available fo this option");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double price) {
        System.out.println("You have ordered a delux burger. No additions available fo this option");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double price) {
        System.out.println("You have ordered a delux burger. No additions available fo this option");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double price) {
        System.out.println("You have ordered a delux burger. No additions available fo this option");
    }


}
