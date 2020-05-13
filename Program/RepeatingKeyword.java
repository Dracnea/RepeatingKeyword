import java.util.ArrayList;
import java.util.Scanner;

public class RepeatingKeyword {
    private static ArrayList<LetterCount> list = new ArrayList<LetterCount>();
    private static int length;
    private static String text;

    public static void main(String args[]) {

        System.out.println("Welcome to the Repeating Keyword Assister.\nThis program will count alphabetic instances for a repeating keyword cipher.");
        System.out.print("Please enter assumed keyword length: ");

        Scanner input = new Scanner(System.in);
        length = input.nextInt();

        System.out.print("Please enter text: ");
        //need a while loop to check for next lines indefinitely
        input = new Scanner(System.in);
        text = input.nextLine();

        cleanInput();
        createArray();
        countChars();

        System.out.println();
        printArray();
        /*
        LetterCount l = new LetterCount();
        System.out.println(l.toString());
        for (IntChar i : IntChar.values()){
            System.out.print(i.ordinal() + " ");
        }
        System.out.println(l.getCount('a'));
        l.increaseCount('a');
        System.out.println(l.getCount('a'));
        */

    }

    //The below methods are used to break up the work of the main method / this class in organized chunks.

    public static void cleanInput(){
        //make lowercase
        text = text.toLowerCase();
        //remove spaces
        text = text.replaceAll(" ", "");
        //remove other unwanted characters
    }

    public static void createArray(){
        for(int i = 0; i < length; i++){
            list.add(new LetterCount());
        }
    }

    public static void countChars(){
        //read each character while constantly looping through the array list to add values to each LetterCount instance
        char temp;
        //need to use modulo for constantly looping in cycle through array list
        int mod = 0;
        for(int i = 0; i < text.length(); i++){
                temp = text.charAt(i);
                list.get(mod).increaseCount(temp);
                mod++;
                mod = mod % length;
        }
    }

    public static void printArray(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }

}
