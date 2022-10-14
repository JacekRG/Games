package games.parts;

import java.util.HashSet;

public class NumbersGenerator {
    HashSet<Integer> luckyNumbers = new HashSet<>();
    public HashSet<Integer> generateNumbers() {
        while (luckyNumbers.size() < LotteryParameters.lotterySize) {
            luckyNumbers.add((int) (Math.floor(Math.random() * LotteryParameters.numbersRange) + 1));
        }
        return luckyNumbers;
    }
}
