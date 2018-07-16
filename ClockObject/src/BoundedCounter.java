/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faraz
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        this.value++;
        
        if (this.value > this.upperLimit) {
                this.value = 0;
            }
    }
    
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int number) {
        if (number < 0 || number > upperLimit) {
            
        } else{
            this.value = number;
        }
    }
    
}
