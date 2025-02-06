package org.string_buffer.concatenate_strings;

import java.util.Arrays;

public class ConcatenateStrings1 {

    public static String concatenateString(String[] arr){
        StringBuffer str=new StringBuffer();

        for(String s:arr){
            str.append(s);
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String[] arr=new String[5];
        arr[0]="Good";
        arr[1]=" Morning";
        arr[2]=" Everyone";
        arr[3]=", Happy";
        arr[4]=" new year.";

        System.out.println("String array is: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Concatenated String is: " + concatenateString(arr));

    }
}
