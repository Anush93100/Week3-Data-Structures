package org.string_builder.remove_duplicates;

import java.util.HashSet;

public class RemoveDuplicates2 {
    public static String removeDuplicates(String s){
        StringBuilder rev = new StringBuilder();
        HashSet<Character> hashSet=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hashSet.contains(c)){
                hashSet.add(c);
                rev.append(c);
            }
        }

        return rev.toString();
    }

    public static void main(String[] args) {
        String s="HelloWorld";
        String rev=removeDuplicates(s);
        System.out.println("String with duplicated : " + s);
        System.out.println("String without duplicate : " + rev);
    }
}
