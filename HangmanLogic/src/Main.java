public class Main {

    public static void main(String[] args) {
        HangmanLogic logic = new HangmanLogic("faizan");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
    }
}
