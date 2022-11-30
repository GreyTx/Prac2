package OOP;

public class Deskphone implements ITelephone {

    private int myNumber;
    private  boolean isRising;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone doesn't have a power button");
    }

    @Override
    public void dial(int number) {
        System.out.println("Now ringing " + number + " on deskphone");
    }

    @Override
    public void answer() {
        if(isRising){
            System.out.println("Answering the desk phone");
            isRising = false;
        }

    }

    @Override
    public boolean callPhone(int number) {
        if(number == myNumber){
            isRising = true;
            System.out.println("Ring ring");
        } else {
            isRising =  false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRising;
    }
}
