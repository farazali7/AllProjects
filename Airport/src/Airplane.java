
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faraz
 */
public class Airplane {
    private String name;
    private int cap;
    
    public Airplane(String name, int cap) {
        this.name = name;
        this.cap = cap;
    }
   
    
    public String getname() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.cap + " ppl)";
    }
    
}
