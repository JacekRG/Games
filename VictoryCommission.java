package games.parts;

public class VictoryCommission {
    NumbersGenerator dailyLuckyNumbers = new NumbersGenerator();
    UserShots userShots = new UserShots();

    public void winnerChoosing() {
        if (dailyLuckyNumbers.generateNumbers().equals(userShots.typing())) {
            System.out.println("Lucky numbers today: " + dailyLuckyNumbers.luckyNumbers);
            System.out.println("You won $ " + LotteryParameters.cashPrize);
        } else
            System.out.println("Lucky numbers today: " + dailyLuckyNumbers.luckyNumbers + "\n Your types: " + userShots.typedNumbers + "\n Maybe next time");
    }
}
