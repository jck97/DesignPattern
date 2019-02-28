package learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    @FunctionalInterface
    public interface Hello{
        public void hello();
    }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//get count of not empty string
        List<String> proNames = Arrays.asList(new String[]{"Ni","Hao","Lambda"});

        List<String> lowercaseNames3 = proNames.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
}
