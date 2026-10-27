
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtde = 20;
        int numeros[] = new int[qtde];
        
        for(int i = 0; i < qtde; i++) {
            numeros[i] = leia.nextInt();
        }
        
        for(int i = 0; i < qtde - 1; i++) {
            for (int j = i + 1; j < qtde; j++) {
                if (numeros[i] > numeros[j]) {
                int aux = numeros[j];
                numeros[j] = numeros[i];
                numeros[i] = aux;
                }
            }
        }
        
        for (int i = 0; i < qtde; i++) {
            System.out.println(numeros[i]);
        }
        
    }
}
