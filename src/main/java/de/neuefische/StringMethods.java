package de.neuefische;

public class StringMethods {

    public static void main(String[]args){
        String task = "Klaus ist total fancy";

        task.length();
        System.out.println(resultLength(task));
        resultLength(task);
        System.out.println(resultFancy(task));
        System.out.println(resultLength(task) && resultFancy(task));
    }

    private static boolean resultLength(String s){

        return s.length() > 20;

    }

    private static boolean resultFancy(String s){

        return s.contains("fancy");

    }
}
