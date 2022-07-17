public class Main {
    public static void main(String[] args) {
        // ex 1
        var box = 1;
        byte a = 13;
        short b = 313;
        int c = 131313;
        long d = 131313131313131L;
        float e = 13.13f;
        double f = 13.13131313;

        //  ex2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float boxersWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров " + boxersWeight);
        float diffBoxersWeight = boxer2 - boxer1;
        System.out.println("Разница в весе боксеров " + diffBoxersWeight);

    }
}