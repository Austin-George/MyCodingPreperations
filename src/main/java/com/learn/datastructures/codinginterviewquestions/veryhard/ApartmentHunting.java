package com.learn.datastructures.codinginterviewquestions.veryhard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApartmentHunting {
    public static int solution(List<Map<String, Boolean>> blocks, String[] reqs) {
        int result = 0;
        int size = blocks.size();
        ArrayList<Map<String, Integer>> leftSideBuildings = new ArrayList<>();
        ArrayList<Map<String, Integer>> rightSideBuildings = new ArrayList<>();

        Map<String, Boolean> block = blocks.get(0);
        Map<String, Integer> blockBuildings = new HashMap<>();
        for(int j = 0; j < reqs.length; j++) {
            if(block.get(reqs[j])) {
                blockBuildings.put(reqs[j], 0);
            } else {
                blockBuildings.put(reqs[j], Integer.MAX_VALUE);
            }
        }
        leftSideBuildings.add(blockBuildings);
        for (int i = 1; i < size; i++) {
            blockBuildings = new HashMap<>();
            block = blocks.get(i);
            for (int j = 0; j < reqs.length; j++) {
                if(block.get(reqs[j])) {
                    blockBuildings.put(reqs[j], 0);
                } else if (leftSideBuildings.get(i - 1).get(reqs[j]) != Integer.MAX_VALUE){
                    blockBuildings.put(reqs[j], leftSideBuildings.get(i - 1).get(reqs[j]) + 1);
                } else {
                    blockBuildings.put(reqs[j], Integer.MAX_VALUE);
                }
            }
            leftSideBuildings.add(blockBuildings);
        }

        blockBuildings = new HashMap<>();
        block = blocks.get(blocks.size() - 1);
        for(int j = 0; j < reqs.length; j++) {
            if(block.get(reqs[j])) {
                blockBuildings.put(reqs[j], 0);
            } else {
                blockBuildings.put(reqs[j], Integer.MAX_VALUE);
            }
        }
        rightSideBuildings.add(blockBuildings);
        for (int i = size - 2; i >= 0; i--) {
            blockBuildings = new HashMap<>();
            block = blocks.get(i);
            for (int j = 0; j < reqs.length; j++) {
                if(block.get(reqs[j])) {
                    blockBuildings.put(reqs[j], 0);
                } else if(rightSideBuildings.get(size - i - 2).get(reqs[j]) != Integer.MAX_VALUE) {
                    blockBuildings.put(reqs[j], rightSideBuildings.get(size - i - 2).get(reqs[j]) + 1);
                } else {
                    blockBuildings.put(reqs[j], Integer.MAX_VALUE);
                }
            }
            rightSideBuildings.add(blockBuildings);
        }
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            int distanceMax = 0;
            Map<String, Integer> leftblockBuildings = leftSideBuildings.get(i);
            Map<String, Integer> rightblockBuildings = rightSideBuildings.get(size - 1 - i);
            Map<String, Integer> minBlock = new HashMap<>();
            for (int j = 0; j < reqs.length; j++) {
                String building = reqs[j];
                if(leftblockBuildings.get(building) <= rightblockBuildings.get(building)) {
                    distanceMax = Math.max(leftblockBuildings.get(building), distanceMax);
                    minBlock.put(building, leftblockBuildings.get(building));
                } else {
                    distanceMax = Math.max(rightblockBuildings.get(building), distanceMax);
                    minBlock.put(building, rightblockBuildings.get(building));
                }
            }
            if(distanceMax < distance) {
                distance = distanceMax;
                result = i;
            }
            System.out.println(minBlock);
        }
        return result;
    }
}
