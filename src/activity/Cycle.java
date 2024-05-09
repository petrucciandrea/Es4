package activity;

public class Cycle extends Thread{
    protected Activity[] act;

    public Cycle(Activity[] act){
        this.act = act;
    }

    @Override
    public void run(){
        Thread[] t_act= new Thread[act.length];
        try{
            while(true){
                for(int i=0; i<act.length; i++){
                    t_act[i] = new Thread(act[i]);
                    t_act[i].start();
                }
                for (Thread t: t_act) {
                    t.join();
                }
            }
        } catch(InterruptedException e){
            System.out.println("Cycle stop");
            for(Thread t: t_act){
                t.interrupt();
            }
        }
    }
}
