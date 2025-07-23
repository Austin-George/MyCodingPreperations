package com.learn.algoexpert.codinginterviewquestions.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {
    public static String solution(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> winnerTable = new HashMap<>();
        int highestScore = 0;
        String team = "";
        for(int i = 0; i < competitions.size(); i++) {
            String homeTeam = competitions.get(i).get(0);
            String awayTeam = competitions.get(i).get(1);
            int result = results.get(i);
            if(result == 1) {
                if(!winnerTable.containsKey(homeTeam)) {
                    winnerTable.put(homeTeam, 3);
                } else {
                    winnerTable.put(homeTeam, winnerTable.get(homeTeam) + 3);
                }
                if(highestScore < winnerTable.get(homeTeam)) {
                    highestScore = winnerTable.get(homeTeam);
                    team = homeTeam;
                }
            } else {
                if(!winnerTable.containsKey(awayTeam)) {
                    winnerTable.put(awayTeam, 3);
                } else {
                    winnerTable.put(awayTeam, winnerTable.get(awayTeam) + 3);
                }
                if(highestScore < winnerTable.get(awayTeam)) {
                    highestScore = winnerTable.get(awayTeam);
                    team = awayTeam;
                }
            }
        }
        return team;
    }
}
