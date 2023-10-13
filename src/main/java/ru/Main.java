package ru;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 1, 5, 4};
        System.out.println(map(arr));
    }

    public static HashMap<Integer, Integer> map(int[] arr) {
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        int count = 1;
        for (int j : arr) {
            if (resultMap.containsKey(j)) {
                resultMap.put(j, resultMap.get(j) + 1);
            } else {
                resultMap.put(j, count);
            }
        }
        return resultMap;
    }
}