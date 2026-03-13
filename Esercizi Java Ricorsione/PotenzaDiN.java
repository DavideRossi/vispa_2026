import java.util.Scanner;
public class PotenzaDiN{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Inserisci il numero : ");
    int n = scan.nextInt();
    
    System.out.print("Inserisci la potenza : ");
    int p = scan.nextInt();
    
    System.out.println("Risultato : " + potenza(n,p));
    }

    static int potenza(int n, int p){
        if (p == 0){
            return 1;
        }
        return n * potenza(n, p - 1);
    }

}
