import java.util.Scanner;
/**
 * dz2
 */
public class dz2 {

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Введиде n: ");
        int n = Integer.parseInt(sc.nextLine());
        int n_fact = 1;
        int i = 2;
        while(i <= n){   // нахождение фактариала
          n_fact *= i ;
          i++;
          System.out.println(n_fact);  
        }
        
        
        System.out.println("Введиде n_1: ");
        int n_1 = Integer.parseInt(sc.nextLine());
        int n_tr = 0;
        int j = 1;
        while(j<=n_1){   // нахождение треугольного числа
            n_tr+=j;
            j++;
            System.out.println(n_tr);
        }
    }
}