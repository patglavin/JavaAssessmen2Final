package com.zipcodewilmington.assessment2.part5;

public class VoteTally {
    private String name;
    private int votes;

    public VoteTally(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }

    public void addVote(){
        this.votes = votes + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
