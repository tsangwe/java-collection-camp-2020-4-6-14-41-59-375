package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {

        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
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
        if (start%2 != 0) {
            start++;
        }
        for (int currNumber = start; currNumber <= end; currNumber+=2) {
            sumOfEvens += currNumber;
        }
        
        return sumOfEvens;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

}
