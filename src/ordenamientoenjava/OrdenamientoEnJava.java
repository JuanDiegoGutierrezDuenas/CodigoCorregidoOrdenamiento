
package ordenamientoenjava;
import java.util.*;
public class OrdenamientoEnJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos elementos quiere implementar?");
        int n = sc.nextInt();
  
        int arr[] = new int[n];
        
      
        
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
