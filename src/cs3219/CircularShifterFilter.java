package cs3219;
import java.util.*;

public class CircularShifterFilter {
    private ArrayList<String> output;

    public CircularShifterFilter(ArrayList<String> wordsToIgnore, ArrayList<String> titles){
        output = new ArrayList<String>();

        for(String title : titles){
            String[] wordsInTitle = title.split(" ");
            Queue<String> queueTitle = new LinkedList<String>();
            for(String word : wordsInTitle){
                queueTitle.offer(word);
            }
            for(int i = 0; i< wordsInTitle.length; i++){
                String wordToCheck = queueTitle.peek();
                boolean shouldIgnore = false;
                for(String word : wordsToIgnore){
                    if(wordToCheck.equalsIgnoreCase(word)){
                        shouldIgnore = true;
                        break;
                    }
                }
                if(!shouldIgnore){
                    output.add(queueToString(queueTitle));
                }
                shift(queueTitle);
            }
        }
    }

    public ArrayList<String> getOutput() {
        return output;
    }

    //helper methods
    private String queueToString(Queue<String> title){
        Queue<String> tempTitle = new LinkedList<String>(title);
        String newTitle = "";
        while(tempTitle.peek() != null){
            if(newTitle == ""){
                newTitle = newTitle.concat(tempTitle.poll());}
            else
                newTitle = newTitle.concat(" " + tempTitle.poll());
        }
        return newTitle;
    }

    private void shift(Queue<String> title){
        String firstWord = title.poll();
        title.offer(firstWord);
    }
}
