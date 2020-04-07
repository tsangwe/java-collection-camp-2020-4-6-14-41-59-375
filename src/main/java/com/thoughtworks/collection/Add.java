package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sumOfProcessedOdds = 0;

        for (int currNumber: arrayList) {
            if (currNumber % 2 != 0) {
                sumOfProcessedOdds += currNumber * 3 + 5;
            }
        }

        return sumOfProcessedOdds;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        Integer[] resultArray = new Integer[arrayList.size()];
        int evenIndex = 0;
        int oddIndex = arrayList.size() - 1;

        for (int currNumber: arrayList) {
            if (currNumber % 2 == 0) {
                resultArray[evenIndex] = currNumber;
                evenIndex++;
            } else {
                resultArray[oddIndex] = currNumber;
                oddIndex--;
            }
        }

        return Arrays.asList(resultArray);
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        for (int currNumber: arrayList) {
            if (currNumber % 2 == 0 && currNumber == specialElement) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> resultList = new LinkedList<Integer>();
        for (int currNumber: arrayList) {
            if (currNumber % 2 == 0) {
                resultList.add(currNumber);
            } else {
                resultList.add(currNumber * 3 + 2);
            }
        }
        return resultList;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sumTripleAndAddTwo = 0;

        for (int currNumber: arrayList) {
            sumTripleAndAddTwo += currNumber * 3 + 2;
        }

        return sumTripleAndAddTwo;
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sumOfEvens = 0;
        int start = leftBorder;
        int end = rightBorder;
        
        if (leftBorder > rightBorder) {
            start = rightBorder;
            end = leftBorder ;
        }
        if (start % 2 != 0) {
            start++;
        }
        for (int currNumber = start; currNumber <= end; currNumber+=2) {
            sumOfEvens += currNumber;
        }
        
        return sumOfEvens;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sumOfOdds = 0;
        int start = leftBorder;
        int end = rightBorder;
        
        if (leftBorder > rightBorder) {
            start = rightBorder;
            end = leftBorder ;
        }
        if (start % 2 == 0) {
            start++;
        }
        for (int currNumber = start; currNumber <= end; currNumber+=2) {
            sumOfOdds += currNumber;
        }
        
        return sumOfOdds;
    }

}
