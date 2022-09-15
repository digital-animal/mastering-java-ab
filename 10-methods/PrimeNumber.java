public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
        System.out.println(isPrime(25));
        System.out.println(isPrime(47));
        System.out.println(isPrime(101));
        System.out.println(isPrime(571));
        System.out.println();

        primeSeries(100);
    }

    public static boolean isPrime(int num) {
	if(num < 2) return false;
	else if(num != 2 && num % 2 == 0) return false;

	int bound = (int)Math.sqrt(num);
        for(int i=2; i<=bound; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void primeSeries(int range) {
        for(int i=2; i<=range; i++) {
            if(isPrime(i))
                System.out.print(i+" ");
        }
	System.out.println();
    }
}
