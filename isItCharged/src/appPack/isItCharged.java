/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appPack;

/**
 *
 * @author hp18
 */
public class isItCharged {
    String[] species = {"Carbon atom in a diamond", "Sodium in NaCl", "Chloride in NaCl", "Iron in FeCl3", "Magnesium in MgO"};
    String[] answers = {"0", "+1", "-1", "+3", "+2"};
    String[] information ={};
    int randomSpecies;
    String speciesQuestion;
    
    public isItCharged(){
        
    }
    
    String selectElement(){
        
        double rando;
        rando = Math.random();
        System.out.println(rando);
        randomSpecies = (int)(rando*4);
        System.out.println(randomSpecies);
        speciesQuestion = species[randomSpecies];
        return speciesQuestion;
    }
    
    boolean checkAnswer(String answer){
        boolean verdict = false;
        if ( answer.equals(answers[randomSpecies]) ){
            verdict = true;
        }
        return verdict;
    }
}
