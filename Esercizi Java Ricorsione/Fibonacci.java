import java.util.Scanner;
public class Fibonacci{
    static int fibonacci(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Complicazione inutile del metodo (ma potrebbe essere più chiara nella comprensione)
    static int fibonacci2(int y){
        int res;
        if (y == 0 || y == 1)
            res = 1;
        else
            res = fibonacci2(y - 1) + fibonacci2(y - 2);
        return res;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci N : ");
        int n = scan.nextInt();
        System.out.println("Fibonacci del numero inserito è " + fibonacci(n));
        System.out.println("Fibonacci2 del numero inserito è " + fibonacci2(n));
    }
}


