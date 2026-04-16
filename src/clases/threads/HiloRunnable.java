package clases.threads;

public class HiloRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Ejecutando hilo con Runnable");
    }
}
