package OOP.InheritanceChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    // you forgot to check that if we add toner by using addToner() it will not make toner level greater then 100.
    public int addToner(int tonerAmount) {

        if (tonerAmount > 0 && tonerAmount <= 100 && tonerAmount+tonerLevel <= 100) {
            return tonerAmount+tonerLevel;
        } else {
            return -1;
        }

    }

    public int printPages(int pages) {
//you forgot to assign value of pages thos pagesTOprint as initial value
        if(duplex) {
            pagesPrinted+=pages;
            return pages;
        } else {
            pagesPrinted+=pages*2;
            return pages*2;
        }

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
