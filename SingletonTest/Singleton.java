package SingletonTest;

import java.util.*;

public class Singleton {
    private static Singleton sing;
    public static List<Integer> numbersList = new ArrayList<>();

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (sing != null) {
            return sing;
        }

        return sing = new Singleton();
    }

    public void addBatch() {
        for (int i = 0; i < 100; i++) {
            numbersList.add(i);
        }
    }

    public static int getListSize() {
        return numbersList.size();
    }


}
