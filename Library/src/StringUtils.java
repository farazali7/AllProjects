/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faraz
 */
public class StringUtils {
    public static boolean included(String word, String searched) {
        
        if (word.isEmpty() || searched.isEmpty()) {
            return false;
        }
        
        return word.contains(searched.trim()) || word.toUpperCase().contains(searched.trim()) || word.contains(searched.toUpperCase().trim());
        
        
    }
    
}
