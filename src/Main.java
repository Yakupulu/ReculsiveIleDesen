import  java.util.Scanner;

public class Main {

    static void pattern(int a) {
        if (a > 0) {
            System.out.print(a+" ");
            pattern(a-5);
        }
        System.out.print(a+" ");
    }

    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        n=input.nextInt();

        pattern(n);
    }
}
