/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingsentences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class SortingSentences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<>();
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Sentence: ");
        String input = kb.nextLine();
        
        String[] words = input.split(" ");
       
        a.addAll(Arrays.asList(words));
        
        sort(a);
        System.out.print("Sorted: " + a + "\n");
    }
    
   
     public static void sort(ArrayList<String> word){
    
      ArrayList<String> word2 = word;
        String temp;
        for(int i=0; i<word.size(); i++){
            for(int j=0; j<word.size(); j++){
            
                if(word.get(i).compareTo(word2.get(j)) < word2.get(j).compareTo(word.get(i))){
                
                    temp = word.get(i);
                    word.set(i, word2.get(j));
                    word2.set(j, temp);
                }
            }
        }  
    }


}
