package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if ("gold".equals(fuzzies.get(i).color)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int left = 0;
        int right = fuzzies.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midColor = fuzzies.get(mid).color;

            int compare = midColor.compareTo("gold");

            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }
}