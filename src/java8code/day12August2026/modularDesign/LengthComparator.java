package java8code.day12August2026.modularDesign;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2){
        return Integer.compare(s1.length(),s2.length());
    }
}
