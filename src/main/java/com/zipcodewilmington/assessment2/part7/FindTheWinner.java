package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {
    public String winner(Integer[] leon, Integer[] wilhelm, String type){
        switch (type){
            case "Even":
                return evenCase(leon, wilhelm);
            case "Odd":
                return oddCase(leon, wilhelm);
        }
        return null;
    }

    private String evenCase(Integer[] leon, Integer[] wilhelm){
        int leonScore = 0;
        int wilhelmScore = 0;
        for (int i = 0; i < leon.length; i+=2){
            leonScore += (leon[i] - wilhelm[i]);
            wilhelmScore += (wilhelm[i] - leon[i]);
        }
        if (leonScore > wilhelmScore) return "Leon";
        else if (wilhelmScore > leonScore) return "Wilhelm";
        else return "Draw";
    }

    private String oddCase(Integer[] leon, Integer[] wilhelm){
        int leonScore = 0;
        int wilhelmScore = 0;
        for (int j = 1; j < leon.length; j += 2){
            leonScore += (leon[j] - wilhelm[j]);
            wilhelmScore += (wilhelm[j] - leon[j]);
        }
        if (leonScore > wilhelmScore) return "Leon";
        else if (wilhelmScore > leonScore) return "Wilhelm";
        else return "Draw";
    }
}
