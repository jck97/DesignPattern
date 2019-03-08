package learn;

import java.util.*;


public class Main {
    @FunctionalInterface
    public interface Hello{
        public void hello();
    }
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getTime());
        //List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//get count of not empty string
        //List<String> proNames = Arrays.asList(new String[]{"Ni","Hao","Lambda"});

        //List<String> lowercaseNames3 = proNames.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
}
