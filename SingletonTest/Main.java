package SingletonTest;

public class Main {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            (Singleton.getInstance()).addBatch();
            System.gc();
            // Thread.sleep(1);
        }

        System.out.println(Singleton.getListSize());
    }
}
