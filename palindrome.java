import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rev =0;
        // read the number 
        
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int og = num;
        // check for palindrome
        
        while(num > 0){
            int digit = num%10;
            rev = rev *10 + digit;
            num /= 10;
        }
        
        // let's compare the numbers
        
        if(rev == og)
        System.out.println("The given number is a palindrome");
        else
        System.out.println("The given number is not a palindrome");
        
        // close the Scanner
        sc.close();
    }
}
