package tasks;

public class FootballMatch {

    static int resultOfFootballMatch(int firstGame, int secondGame, int firstRate, int secondRate) {

        return firstGame == firstRate && secondGame == secondRate ? 2 :
                firstGame >= secondGame && firstRate >= secondRate ||
                firstGame <= secondGame && firstRate <= secondRate ? 1 : 0;
    }
}
