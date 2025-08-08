package com.learn.algoexpert.codinginterviewquestions.medium;

public class BestSeat {
    public static int solution(int[] seats) {
        int result = -1;
        int i = 0;
        int size = seats.length;
        int seatCount = 0;
        int currentSpace = 0;
        while (i < size) {
            if(seats[i] == 1) {
                if(seatCount != 0 && seatCount > currentSpace) {
                    result = i - seatCount / 2 - 1;
                    currentSpace = seatCount;
                }
                seatCount = 0;
            } else {
                seatCount++;
            }
            i++;
            System.out.println(" "+seatCount +" " + currentSpace);
        }
        return result;
    }
}
