import java.util.Scanner;

public class palindromeNum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        int num = sc.nextInt();

        int orgNum = num;

        int rev = 0;


        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        {
            System.out.println(rev);

        }
        if (rev==orgNum){
            System.out.println(orgNum+" is a palindrome number.");
        }
        else{
            System.out.println(orgNum+" is not a palindrome number");
        }

    }
}
