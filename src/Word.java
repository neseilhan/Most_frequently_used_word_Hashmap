import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz : "); //asking user for entering text.
        String text = inp.nextLine(); //as type of String
        System.out.println(text);

        HashMap<String, Integer> wordsCount = new HashMap<>(); //created HashMap words are key, counts are value
        String[] words = text.split(" "); //words splitted

        for(String word : words){

            word = word.toLowerCase(); //make all words to lower case.
            Integer count = wordsCount.get(word); // a counter for words

            if(count == null){
                wordsCount.put(word,1);
            }
            else{
                wordsCount.put(word, count+1); //if the word exists increase counter by 1.
            }
        }
        System.out.println(wordsCount);
        int maxCount = 0;
        String mostFrequentWord = "";
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) { //This loop loops through each entry of the HashMap named wordsCount:
            if(entry.getValue() > maxCount){ //Checks value of keys and compares with maxCount
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }

        }
        System.out.println("Most frequently used word : " +mostFrequentWord+" and its count : "+maxCount);

    }
}
