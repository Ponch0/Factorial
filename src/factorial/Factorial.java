package factorial;
import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,i,factorial=1;
        System.out.print("Digita un número: ");
        numero=entrada.nextInt();
        for(i=numero; i>0; i--){
            factorial*=i;
            System.out.println(i);
        }
        System.out.println(factorial);
    }
}
