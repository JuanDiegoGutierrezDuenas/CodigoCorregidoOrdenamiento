
package ordenamientoenjava;
import java.util.*;
public class OrdenamientoEnJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("¿Cuantos elementos quiere implementar?");
        int n = sc.nextInt();
  
        int arr[] = new int[n];
        
        for(int i = 0; i<n ; i++){
            arr[i] = rand.nextInt(201)-100;
        }
        
        ordenar(arr);
        System.out.println("El arreglo ordenado es: ");
        for(int num :arr){
      System.out.print(num + " ");
    }
}
    public static void ordenar(int v[]){
        for(int i = 0 ; i< v.length-1; i++){
            for( int j = i+1;j< v.length;j++)
                if (v[i] > v[j]){
                    int W = v[j];
                    v[j] = v[i];
                    v[i] =W;
                    
                }
        }
        
    }
    
}
