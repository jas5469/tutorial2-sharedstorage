package cs3219;

import java.util.ArrayList;

public class SharedDataStorage {
    private ArrayList<String> wordsToIgnore;
    private ArrayList<String> titles;
    private ArrayList<String> listOfStringsAfterCircularShift;
    private ArrayList<String> listOfStringsAfterAlphabetize;

    public SharedDataStorage(){
        wordsToIgnore = new ArrayList<String>() ;
        titles = new ArrayList<String>();
        listOfStringsAfterCircularShift= new ArrayList<String>();
        listOfStringsAfterAlphabetize= new ArrayList<String>();
    }

    public ArrayList<String> getInputWordsToIgnoreList(){
        return wordsToIgnore;
    }

    public void writeToWordsToIgnoreList(String wordToIgnore){
        wordsToIgnore.add(wordToIgnore);
    }

    public ArrayList<String> getInputTitleList(){
        return titles;
    }

    public void writeToTitlesList(String title){
        titles.add(title);
    }

    public void writeToListOfStringsAfterCircularShift(ArrayList<String> output){
        listOfStringsAfterCircularShift = output;
    }

    public ArrayList<String> getListOfStringsAfterCircularShift(){
        return listOfStringsAfterCircularShift;
    }

    public void writeTolistOfStringsAfterAlphabetize(ArrayList<String> output){
        listOfStringsAfterAlphabetize = output;
    }

    public ArrayList<String> getlistOfStringsAfterAlphabetize(){
        return listOfStringsAfterAlphabetize;
    }

}
