package activity;

public class Activity implements Runnable{
    protected int n=0;
    protected String name;
    public Activity(String name){
        this.name=name;
    }
    @Override
    public void run(){
        try{
            System.out.println(name+" start");
            Thread.sleep((int) (Math.random() * 4000) + 500);
            n++;
            System.out.println(name+" end "+n);
        } catch(InterruptedException e){
            System.out.println(name+" blocked");
        }
    }
}
