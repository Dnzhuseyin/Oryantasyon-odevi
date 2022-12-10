import java.util.Scanner;
public class HangiSayıBuyuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sayi1 giriniz");
        int sayı1=scanner.nextInt();
        System.out.println("lutfen sayi2 giriniz");
        int sayı2=scanner.nextInt();

        if(sayı1==sayı2){
            System.out.println("sayi1 esittir sayi2'ye");
        }else if (sayı1>sayı2){
            System.out.println("sayi1 sayi2 buyuktur");
        }else {
            System.out.println("sayı2 sayı1'den buyuktur");
        }



    }
}
