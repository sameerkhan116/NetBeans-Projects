/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sameerkhan
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> unique;
    private int count;
    
    public PersonalDuplicateRemover() {
        this.unique = new HashSet<String>();
        this.count = 0;
    }
    
    @Override
    public void add(String characterString) {
        if(!unique.contains(characterString)) {
            unique.add(characterString);
        } else {
            this.count++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.count; 
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.unique;
    }

    @Override
    public void empty() {
        this.unique = new HashSet<String>();
        this.count = 0;
    }
    
}
