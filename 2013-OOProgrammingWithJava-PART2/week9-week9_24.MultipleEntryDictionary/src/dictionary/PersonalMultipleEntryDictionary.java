/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author sameerkhan
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> complete;
    
    public PersonalMultipleEntryDictionary() {
        this.complete = new HashMap<String, Set<String>>();
    }
    
    @Override
    public void add(String word, String entry) {
        if(!this.complete.containsKey(word)) {
            this.complete.put(word, new HashSet<String>());
        }
        
        Set<String> ent = this.complete.get(word);
        ent.add(entry);
    }
    
    @Override
    public Set<String> translate(String word) {
        return this.complete.get(word);
    }
    
    @Override
    public void remove(String word) {
        if(this.complete.containsKey(word)) {
            this.complete.remove(word);
        }
    }
}
