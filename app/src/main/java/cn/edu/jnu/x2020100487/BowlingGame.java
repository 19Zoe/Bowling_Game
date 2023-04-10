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
            //如果一个不重，则加上下下一个球的分数
            if(scoreIndex<19) {
                if (10 == pins[scoreIndex] + pins[scoreIndex + 1]) {
                    totalScore += pins[scoreIndex + 2];
                }
            }
        }
        return totalScore;
    }
}
