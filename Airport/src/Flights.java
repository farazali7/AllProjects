
import java.util.ArrayList;
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
public class Flights {
    private ArrayList<String> locations;
    
    public Flights() {
        locations = new ArrayList<String>();
    }
    
    public void add(String dept, String dest) {
        String location = dept + "-" + dest;
        locations.add(location);
    }
    
    public ArrayList<String> getList() {
        return this.locations;
    }
    
    
    
    
}
