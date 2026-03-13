import java.util.Scanner;
public class Fattoriale{
    static int fatt(int n){
        if (n == 0)
            return 1;
        else {
            //Caso ricorsivo
            System.out.println("fatt("+n+") = " + n + " * fatt(" + (n - 1) + ")");
            return n * fatt(n - 1);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci N : ");
        int n = scan.nextInt();
        System.out.println("Il fattoriale de numero inserito è " + fatt(n));
    }
}
