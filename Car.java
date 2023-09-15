import java.util.Scanner;

public class Car {

    protected void reverse(int num){
    
        //     Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an Number to Reverse It: ");
        // int num = sc.nextInt();

        int rev = 0;
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if(temp==rev){
            System.out.println("Palindrome...............");
        }
        else{
        System.out.println("NOT Palindrome................");
        }
        }
     
    
    public static void main(String[] args) {

    Car cc=new Car();
    cc.reverse(4568);
    cc.reverse(666);
    cc.reverse(767);

    }
}
