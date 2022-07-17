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

        // ex3
        var banana = 80;
        int bananas = banana * 5;
        var milk = 105;
        int allMilk = milk * 2;
        var iceCream = 100;
        int allIceCream = iceCream * 2;
        var egg = 70;
        int eggs = egg * 4;
        int allProducts = bananas + allMilk + allIceCream + eggs;
        System.out.println("Вес продуктов " + allProducts + " грамм");
        float breakfast = allProducts / 1000f;
        System.out.println("Вес продуктов " + breakfast + " кг");

        //ex4
        int allWeight = 7;
        int allWeightInKg = allWeight * 1000;
        int smallEverydayWeight = 250;
        int smallEverydayLoose = allWeightInKg / smallEverydayWeight;
        System.out.println("Понадобится " + smallEverydayLoose + " дней при потере в 250 грамм");
        int bigEverydayWeight = 500;
        int bigEverydayLoose = allWeightInKg / bigEverydayWeight;
        System.out.println("Понадобится " + bigEverydayLoose + " дней при потере в 500 грамм");
        int allDays = (smallEverydayLoose + bigEverydayLoose) / 2;
        System.out.println("В среднем получится " + allDays + " день");

        //ex5
        int mashaSalary = 67760;
        int mashaNewSalary = mashaSalary * 110 / 100;
        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisSalary = 83690;
        int denisNewSalary = denisSalary * 110 / 100;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int krisSalary = 76230;
        int krisNewSalary = krisSalary * 110 / 100;
        int krisDifference = (krisNewSalary - krisSalary) * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на "  + mashaDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary+ " рублей. Годовой доход вырос на "  + denisDifference + " рублей.");
        System.out.println("Кристина теперь получает " + krisNewSalary + " рублей. Годовой доход вырос на "  + krisDifference + " рублей.");




    }
}