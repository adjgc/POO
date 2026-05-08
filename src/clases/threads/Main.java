package clases.threads;

public class Main {
    public static void main(String[] args) {
        Hilo hilo = new Hilo();

        Thread hiloRunnable = new Thread(new HiloRunnable());

        hilo.start();
        hiloRunnable.start();
    }
}
