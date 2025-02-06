package org.string_builder.reverse_string;

public class ReverseString1 {
    public static String reverseString(String s){
        StringBuilder rev=new StringBuilder();
        rev.append(s);
        rev.reverse();
        return rev.toString();
    }

    public static void main(String[] args) {
        String s="Hello world";
        String rev=reverseString(s);
        System.out.println("Normal String: " + s);
        System.out.println("Reverse String: " + rev);

    }
}
