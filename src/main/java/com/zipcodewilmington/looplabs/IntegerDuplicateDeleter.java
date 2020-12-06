package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray){
        super(intArray);
    }

    public long countNumDuplicates(Integer i){
        return Arrays.stream(array).filter(j -> j == i).count();
        //predicate function will traverse through Integer arrays and search for Integer i
        //predicate returns a Boolean
        // .count will increment when j == i
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter(i -> countNumDuplicates(i) < maxNumberOfDuplications).toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(i -> countNumDuplicates(i) != exactNumberOfDuplications).toArray(Integer[]::new);
    }
}
