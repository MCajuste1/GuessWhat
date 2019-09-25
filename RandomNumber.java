package com.guessThis;
import javax.swing.JOptionPane;
// class is used to provide standard dialog boxes such as message dialog box, confirm dialog box and input dialog box.
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {

    public static void main(String[] args) {

//Random object
        Random random = new Random();
 // Int random number
        int RandomNumber = random.nextInt(10);
 // True or false
        boolean userCorrect = false;
        String userInputString;
        int userGuessNumber;
        int numberOfGuesses = 0;
        Set<Integer> set = new HashSet<>();

//Has to be true for this to run

        while (!userCorrect) {
            numberOfGuesses = numberOfGuesses +1;
            userInputString = JOptionPane.showInputDialog("Guess this number dawg");
            //Meaning trying to convert something to a integer
            userGuessNumber = Integer.parseInt(userInputString);


            if (userGuessNumber > RandomNumber) {
 // null is going to center the message
                JOptionPane.showMessageDialog(null,"(" + RandomNumber + ")Too Large son");
                set.add(userGuessNumber);

                } else if ( userGuessNumber < RandomNumber){
                JOptionPane.showMessageDialog(null,"(" + RandomNumber + ")Too small juuheard:");
                set.add(userGuessNumber);
            }else{
 //Set.size equals amount inside the collection
                JOptionPane.showMessageDialog(null, "(" + RandomNumber + ")Correct guess my guy in " + set.size() + " guesses");
                userCorrect = true;
            }
        }
 //Indicates that the program runs successfully
        System.exit(0);
    }
}
