/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class StringUtils {
    
    public static boolean included(String word, String searched) {
        word = word.trim().toLowerCase();
        searched = searched.trim().toLowerCase();
        if(word.contains(searched)) {
            return true;
        } else if (searched == null || word == null) {
            return false;
        }
        return false;
    }
}
