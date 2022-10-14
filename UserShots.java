package games.parts;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserShots {
    HashSet<Integer> typedNumbers = new HashSet<>();

    public HashSet<Integer> typing() {
        Scanner userInputNo = new Scanner(System.in);
        int typingCounter = 1;
        while (typedNumbers.size() < LotteryParameters.lotterySize) {
            System.out.println("Insert " + typingCounter + " of 6 numbers");
            int userProposal;
            try {
                userProposal = userInputNo.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The value entered is not a number, you have wasted your coupon");
                break;
            }
            if (userProposal < 1 || userProposal > LotteryParameters.numbersRange) {
                System.out.println("Number out of range");
            } else if (!typedNumbers.contains(userProposal)) {
                typingCounter++;
                typedNumbers.add(userProposal);
            } else System.out.println("You have already entered this number");
        }
        return typedNumbers;
    }
}
