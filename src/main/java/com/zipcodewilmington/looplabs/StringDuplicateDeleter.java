package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArr){
        super(intArr);
    }

    public long countNumDuplicates(String s){
        return Arrays.stream(array).filter(x -> x == s).count();

    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter(i -> countNumDuplicates(i) < maxNumberOfDuplications).toArray(String[]:: new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(i -> countNumDuplicates(i) != exactNumberOfDuplications).toArray(String[]::new);
    }
}
