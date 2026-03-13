import java.util.Scanner;
public class MaggioriDiN {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];   
        for (int i = 0; i < array.length; ++i){
            array[i] = (int)(8 + Math.random()*(20 - 8 + 1));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Inserisci N : "); 
        int n = scan.nextInt();
        if (traduzione(array, n))
            System.out.println("Tutti i numeri sono maggiori di " + n + "!");
        else 
            System.out.println("Non tutti i numeri sono maggiori di " + n +"!");
    }
    public static boolean traduzione(int[] array,int n, int indice){
        if (indice < 0)
            return true; 
        else if (array[indice] <= n)
            return false; 
        else 
            return traduzione(array, n, indice - 1); 
    }

    public static boolean traduzione(int[] array, int n){
        return traduzione(array, n, array.length - 1); 
    }
}
