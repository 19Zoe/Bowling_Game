package cn.edu.jnu.x2020100487;

public class BowlingGame {
    int pins[]=new int[21];
    int currentPinIndex=0;
    public void roll(int pin) {
        pins[currentPinIndex++]+=pin;
    }

    public int score() {
        int totalScore=0;
        for(int scoreIndex=0;scoreIndex<pins.length;scoreIndex++){
            totalScore+=pins[scoreIndex];
            if(scoreIndex<19) {
                if (isaSpare(scoreIndex)) {
                    totalScore += pins[scoreIndex + 2];
                }
            }
        }
        return totalScore;
    }

    //是一个补中
    private boolean isaSpare(int scoreIndex) {
        return 10 == pins[scoreIndex] + pins[scoreIndex + 1];
    }
}
