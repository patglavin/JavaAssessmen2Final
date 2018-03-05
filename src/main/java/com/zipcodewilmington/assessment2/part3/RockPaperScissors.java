package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int id;

    RockPaperScissors(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public RockPaperScissors getWinningSign(){
        switch (this.getId()){
            case 1:
                return PAPER;
            case 2:
                return SCISSORS;
            case 3:
                return ROCK;
        }
        return null;
    }

    public RockPaperScissors getLosingSign(){
        switch (this.getId()){
            case 1:
                return SCISSORS;
            case 2:
                return ROCK;
            case 3:
                return PAPER;
        }
        return null;
    }

}
