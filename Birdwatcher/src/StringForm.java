/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faraz
 */
public class StringForm {
    public static boolean Match(String word, String searched) {
        String word1 = word.toUpperCase().trim();
        String word2 = searched.toUpperCase().trim();
        
        return word1.equals(word2);
    }
}
