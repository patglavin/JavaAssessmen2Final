package com.zipcodewilmington.assessment2.part5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class ElectionLand {
    TreeMap<String, VoteTally> voteTree = new TreeMap<>();

    public String electionWinner(String[] votes){
        int highestNumber = 0;
        for (String vote:votes) {
            if (!this.voteTree.containsKey(vote)){
                voteTree.put(vote, new VoteTally(vote, 1));
            } else {
                voteTree.get(vote).addVote();
                if (voteTree.get(vote).getVotes() > highestNumber) highestNumber = voteTree.get(vote).getVotes();
            }
        }
        ArrayList<String> winners = new ArrayList<>();
        for (VoteTally voteTally:voteTree.values()) {
            if (voteTally.getVotes() == highestNumber){
                winners.add(voteTally.getName());
            }
        }
        Collections.sort(winners);
        return winners.get(winners.size()-1);
    }
}
