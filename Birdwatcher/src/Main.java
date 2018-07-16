import java.util.Scanner;
import java.util.Collections;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdData Watcher = new BirdData();
        
        
        while (true) {
            System.out.print("? ");
            String input = reader.nextLine();
            if (StringForm.Match("Add", input)) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                
                Watcher.add(new Bird(name, latinName));
                
            } else if (StringForm.Match("Observation", input)) {
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                Watcher.Observation(name);
                
            } else if (StringForm.Match("Statistics", input)) {
                Watcher.printStats();
                
            } else if (StringForm.Match("Show", input)) {
                System.out.print("What? ");
                String name = reader.nextLine();
                Watcher.printBird(name);
            }
            
            if (StringForm.Match("Quit", input)) {
                break;
            }
        }
                
        
        
        
        
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }

}
