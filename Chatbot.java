import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {
        
        //set up scanner. 
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHello. What is your name?");
        //Pick up user's name and store it. 
        String name = scan.nextLine();

                           
        
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
        String location = scan.nextLine();

                        

       
        System.out.println("\nI hear it's beautiful at " + location + "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        //Pick up age and store it.
        int Age = scan.nextInt();

        scan.nextLine();
        
        System.out.println("\nSo you're " + Age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/Age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        String lang = scan.nextLine();

        
        System.out.println("\n" + lang + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        //close scanner. 
        scan.close();
        
    }
}
