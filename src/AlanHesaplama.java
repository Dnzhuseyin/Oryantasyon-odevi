import java.util.Scanner;
public class AlanHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen capi giriniz");
        int cap = scanner.nextInt();
        if(cap<0){
            System.out.println("yanlış girdiniz");
        }
        else {
            double alan = cap * cap * 3.14159;
            System.out.println("Alan: "+ alan);


        }

    }
}
