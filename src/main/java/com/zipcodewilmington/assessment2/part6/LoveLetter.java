package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {

    public Integer[] mystery(String[] strings){
        Integer[] answer = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer[i] = decipher(strings[i]);
        }
        return answer;
    }

    private Integer decipher(String string){
        int answer = 0;
        for (int j = 0; j < string.length()/2; j++){
            if (string.charAt(j) < string.charAt(string.length() - (j+1))){
                int value = string.charAt(string.length() - (j+1)) - string.charAt(j);
                answer += value;
            } else if (string.charAt(string.length() - (j+1)) < string.charAt(j)){
                int value = string.charAt(j) - string.charAt(string.length() - (j+1));
                answer += value;
            }
        }
        return answer;
    }
}
