package br.com.caelum.concorrente_e_locks;

import java.util.Collection;

public class ProduzMensagens implements Runnable{
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
    private int comeco;
    private int fim;
    private Collection<String> mensagens;

    public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }
    @Override
    public void run() {
        for(int i = comeco; i < fim; i++){
            synchronized (mensagens){
                mensagens.add("Mensagem " + i);
            }
        }
    }
}
