import java.util.Scanner;
/**
 * dz5
 */
public class dz5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введиде size: ");
        int n = Integer.parseInt(sc.nextLine());
        int [] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.println("elem: ");
            arr[i] = Integer.parseInt(sc.nextLine());
            if(i%2==0){
                sum =+arr[i];
            }
        }
        System.out.println(sum);
        for(int i = 0; i < n; i+=2){
            System.out.println(arr[i]);
        }
    }
}