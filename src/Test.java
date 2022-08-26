import java.util.Scanner;

public class Test {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0, lastNuber;
        while (temp!=0){
            lastNuber = temp%10;
            reverseNumber=reverseNumber*10+lastNuber;
            temp/=10;
        }
        if(number==reverseNumber) // Tek satır yapılacaksa süslü parantez konmayabilir.
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.print("Sayıyı giriniz:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(isPalindrom(a)==true){
            System.out.println("Girdiğiniz sayı Palindrom sayıdır.");
        }else{
            System.out.println("Girdiğiniz sayı Palindrom sayı değildir.");
        }

    }
}
