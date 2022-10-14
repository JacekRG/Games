package games.parts;

import games.parts.LotteryParameters;
import games.parts.NumbersGenerator;
import org.junit.jupiter.api.Assertions;

class NumbersGeneratorTest {

    @org.junit.jupiter.api.Test
    void generateNumbers() {
       NumbersGenerator testLuckyNumbers = new NumbersGenerator();
        Assertions.assertEquals(false, testLuckyNumbers.generateNumbers().isEmpty());
        Assertions.assertEquals(LotteryParameters.lotterySize,testLuckyNumbers.generateNumbers().size());
    }
}