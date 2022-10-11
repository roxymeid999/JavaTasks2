package interview_tasks;

public class PrimeNumber {

    public static String primeNum(int num) {

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return "Not Prime Number";
            }
        }
        return "Prime Number";
    }

    public static void main(String[] args) {
        System.out.println("primeNum(111) = " + primeNum(111));
        System.out.println("primeNum(112) = " + primeNum(112));
        System.out.println("primeNum(11) = " + primeNum(11));
        System.out.println("primeNum(17) = " + primeNum(17));
        System.out.println("primeNum(83) = " + primeNum(83));
        System.out.println("primeNum(85) = " + primeNum(85));
        System.out.println("primeNum(49) = " + primeNum(49));
    }
}