import java.util.concurrent.TimeUnit;

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Ассинхронный привет");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ассинхронный пока");
    }
}