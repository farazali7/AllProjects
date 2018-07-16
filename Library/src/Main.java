public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        
        library.addBook(new Book("Faraz 1", "Penguins", 1978));
        library.addBook(new Book("Faraz 2", "House of Penguins", 2005));
        library.addBook(new Book("Faraz 3", "Giraffes", 2005));
        
        for (Book list : library.searchByPublisher("PENGUINS    ")) {
            System.out.println(list);
        }
    }
}
