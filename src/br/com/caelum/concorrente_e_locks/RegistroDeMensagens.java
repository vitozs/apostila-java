package br.com.caelum.concorrente_e_locks;

import java.util.ArrayDeque;
import java.util.Collection;

public class RegistroDeMensagens {
    public static void main(String[] args) throws InterruptedException {
        Collection<String> mensagens = new ArrayDeque<>();
        Thread t1 = new Thread(new ProduzMensagens(0, 1000, mensagens));
        Thread t2 = new Thread(new ProduzMensagens(1000, 3000, mensagens));
        Thread t3 = new Thread(new ProduzMensagens(3000, 5000, mensagens));

        t1.start();
        t2.start();
        t3.start();

        // Faz com que a Thread a qual roda o main aguarde o fim dessas:
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Threads produtoras de mensagens finalizadas!");
        if (mensagens.contains(null)) {
            throw new IllegalStateException("não devia ter null aqui dentro!");
        }

        System.out.println("Fim da execucao com sucesso");

    }
}
