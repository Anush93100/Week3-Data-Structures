package org.linear_search.SpecificWordInAListOfSentences;

public class SpecificWordInAListOfSentences2 {
    public static String linearSearch(String[] sentences, String word){

        for(String sentence : sentences){
            if(sentence.contains(word)){
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences=new String[5];
        sentences[0]="Hello world";
        sentences[1]="Good morning sir";
        sentences[2]="How are you";
        sentences[3]="Today the sky looks beautiful";
        sentences[4]="you are welcome";

        String word="you";
        String found=linearSearch(sentences,word);

        if(found.equals("Not Found")){
            System.out.println("Given word not found.");
        }else{
            System.out.println("Found: " + found);
        }
    }
}
