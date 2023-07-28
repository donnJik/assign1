import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //int min = scanner.nextInt();

        //for (int i = 1; i < n; i++) {
        //int m = scanner.nextInt();
        //if (m < min) {
        //min = m;
        //}
        //}
        //System.out.println(min);
        //}
//--------------------------------------
        //int n = scanner.nextInt();
        //int m = 0;
        //for (int i = 0; i < n; i++) {
        //int k = scanner.nextInt();
        //m += k;
        //}
        //double d= (double)m/n;
        //System.out.println(d);

//________________________________________________-
        //int n= scanner.nextInt();
        //if(!isPrime(n)){
        //System.out.println("Composite");
        //}else System.out.println("Prime");
//-------------------------------------------------
        //int n= scanner.nextInt();
        //int rez=factorial(n);
        //System.out.println(rez);
//--------------------------------------------------
        //int n= scanner.nextInt();
        //int rez=fibonacci(n);
        //System.out.println(rez);
//---------------------------------------------------

        //int a= scanner.nextInt();
        //int n= scanner.nextInt();
        //System.out.println(power(a,n));

//---------------------------------------------------
    //String s=scanner.nextLine();
        //if(!findDigits(s)){
            //System.out.println("No");
        //}else System.out.println("Yes");
//---------------------------------------------------
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int rez= gcd(a,b);
        System.out.println(rez);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1);
                }
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: F(0) = 0
        } else if (n == 1) {
            return 1; // Base case: F(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * power(a, n - 1);
        } else {
            return 1 / power(a, -n);
        }
    }
    public static boolean findDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
