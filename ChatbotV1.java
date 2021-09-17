/**
 * This is a chatbot that talks back to you
 * @author Dr. Jolly
 * @version 1.0
 */
import java.util.Scanner;
public class ChatbotV1
{
  public static void main (String[] args)
  {
    // Creating a scanner object to get the input from the keyboard
    Scanner kboard = new Scanner(System.in);
    // Asking the user for their name
    System.out.print("Please enter your name: ");
    String name = kboard.nextLine();
    // Greeting the user
    System.out.print("Hi " + name + "! How are you doing? ");
    String input = kboard.nextLine();
    System.out.println("I am glad that you are " + input);
    // Asking the user for their age
    System.out.print("So, " + name + ", how old are you? ");
    int age = kboard.nextInt();
    // Remember what happens if you forget this line
    kboard.nextLine();
    // Equivalent code to replace lines 22-24
    //String input = kboard.nextLine();
    //int age = Integer.parseInt(input);
    // Asking the user one more question based on their age
    if (age > 25)
    {
      System.out.print("Where did you go to college? ");
    }
    else if (age > 5)
    {
      System.out.print("Which school do you go to? ");
    }
    else
    {
      System.out.print("Hi baby!! Have you eaten yet? ");
    }
    String response = kboard.nextLine();
    System.out.println(response + "! Nice!");
  }
}
