package SiniflarBoksMaci;



public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Player1", 10, 120, 100,50);
        Fighter f2 = new Fighter("Player2", 20, 85, 85,60);

        Match match = new Match(f1, f2, 85, 100);
        match.run();

    }
}