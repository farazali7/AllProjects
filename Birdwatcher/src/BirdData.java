/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faraz
 */

import java.util.*;


public class BirdData {
    
    private ArrayList<Bird> birds;
   
    
    public BirdData() {
        birds = new ArrayList<Bird>();
        
    }
    
    public void add(Bird bird) {
        this.birds.add(bird);
    }
    
    public void Observation(String obs) {
        for (Bird check : birds) {
            if (StringForm.Match(check.getName(), obs)) {
                check.countAdd();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void printStats() {
        for (Bird print : birds) {
            System.out.println(print);
        }
    }
    
    public void printBird(String word) {
        for (Bird find : birds) {
            if (StringForm.Match(find.getName(), word)) {
                System.out.println(find);
            }
        }
    }
    
    
    
    
    
}
