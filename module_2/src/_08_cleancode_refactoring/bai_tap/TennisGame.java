package _08_cleancode_refactoring.bai_tap;

public class TennisGame {
    public static Object getScore(String namePlayer1, String namePlayer2, int scorePlayer1, int scorePlayer2) {
        boolean isTie = scorePlayer1 == scorePlayer2;
        boolean isAdvantage = scorePlayer1 >= 4 || scorePlayer2 >= 4;

        if (isTie) {
            return getTieScore(scorePlayer1);
        } else if (isAdvantage) {
            return getAvantage(scorePlayer1, scorePlayer2);
        } else {
            String scorePlayer = getScorePlayer(scorePlayer1) + "-" + getScorePlayer(scorePlayer2);
            return scorePlayer;
        }

    }


    public static String getTieScore(int scorePlayer1) {
        switch (scorePlayer1)
        {
            case 0:
                 return  "Love-All";

            case 1:
                return  "Fifteen-All";

            case 2:
                return  "Thirty-All";

            case 3:
                return "Forty-All";

            default:
                return  "Deuce";

        }
    }

    public static String getAvantage(int scorePlayer1, int scorePlayer2) {
        int resultScore = scorePlayer1 - scorePlayer2;
        if (resultScore == 1) {
            return "Advantage player1";
        } else if (resultScore == -1) {
            return  "Advantage player2";
        } else if (resultScore >= 2) {
            return  "Win for player1";
        } else {
            return  "Win for player2";
        }
    }
    public static String getScorePlayer(int scorePlayer) {

            switch(scorePlayer)
            {
                case 0:
                    return  "Love";

                case 1:
                    return  "Fifteen";

                case 2:
                   return  "Thirty";

                default:
                    return  "Forty";
            }
    }
}
