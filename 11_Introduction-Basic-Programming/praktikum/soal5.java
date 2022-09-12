public class soal5 {
    public static void main(String[] args) {
        int i;
        int number = 10;
        boolean primeNumber = true;

        if (number == 0 || number == 1) {
            primeNumber = false;
        }
        else {
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
        }
        System.out.println(primeNumber);
    }
}
