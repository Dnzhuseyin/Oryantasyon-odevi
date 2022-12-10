import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int faktoriyel =1;
        int sayı = scanner.nextInt();
        for(int i = 1 ; i <= sayı ; i++){
            faktoriyel*=i;
        }
        System.out.println("faktoriyel: "+ faktoriyel);





    }
}
