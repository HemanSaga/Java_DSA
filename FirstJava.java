import java.util.Scanner;
class FirstJava{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        
        System.out.println("Enter your name");
        String name = sc.nextLine();
        
        // Output of the input 
         
        System.out.println("The input is : "+ name);
    }
}
