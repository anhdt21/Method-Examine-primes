public class ExaminePrimes {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to la: ");
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i))
                System.out.print(i+"\t");
        }
    }
    static boolean isPrime(int number) {
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
