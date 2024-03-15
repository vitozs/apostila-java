package br.com.caelum.threads;

public class Programa implements Runnable{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    private int id;
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println("Programa: " + id + " valor: " + i);
        }
    }

    public void setId(int id) {
        this.id = id;
    }
}
