package activity;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Activity a = new Activity("A");
        Activity b = new Activity("B");

        Cycle cycle = new Cycle(new Activity[] {a,b});
        cycle.start();
        Thread.sleep(8000);
        cycle.interrupt();
    }
}