import java.util.Scanner;
public class TekmiCiftmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayı = scanner.nextInt();
        if(sayı%2==0){
            System.out.println("cift");
        }else {
            System.out.println("tek");
        }

    }
}
