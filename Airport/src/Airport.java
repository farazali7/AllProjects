
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faraz
 */
public class Airport {
    private Scanner reader;
    private HashMap<Airplane, Flights> airport;
    private ArrayList<Airplane> planes = new ArrayList<Airplane>();
    
    public Airport(Scanner reader) {
        airport = new HashMap<Airplane, Flights>();
        this.reader = reader;
    }
    
    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------" + "\n");
        
        while (true) {
            //Airport
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            
            String input = reader.nextLine();
            
            if (input.equals("1")) {
                addAirplane();
            }
            
            else if (input.equals("2")) {
                addFlight();
            }
            
            else if (input.equals("x")) {
                break;
            }
            
            
        }
        
        System.out.println("Flight service");
        System.out.println("------------" + "\n");
        
        while (true) {
            //Flight service
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
           
            String input = reader.nextLine();
            
            if (input.equals("1")) {
                printPlanes();
            }
            
            else if(input.equals("2")) {
                printFlights();
            }
            
            else if(input.equals("3")) {
                printPlaneInfo();
            }
            
            else if(input.equals("x")) {
                break;
            }
        }
        
    }
    
    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String ID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int cap = Integer.parseInt(reader.nextLine());
        
        airport.put(new Airplane(ID, cap), new Flights());
    }
    
    
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String ID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String dept = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String dest = reader.nextLine();
        
        for (Airplane plane:airport.keySet()) {
            if(ID.equals(plane.getname())) {
                airport.get(plane).add(dept, dest);
            }
        }
        
        
        
    }
    
    public void printPlanes() {
        for (Airplane plane:airport.keySet()) {
            System.out.println(plane);
        }
    }
    
    public void printFlights() {
        for (Flights flight:airport.values()) {
            for (String location:flight.getList()) {
                for (Airplane plane: airport.keySet()) {
                    if (airport.get(plane) == flight) {
                        System.out.println(plane + " (" + location + ")");
                    }
                }
            }
        }
    }
    
    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String input = reader.nextLine();
        
        for (Airplane plane:airport.keySet()) {
            if (input.equals(plane.getname())) {
                System.out.println(plane);
            }
        }
    }
}
