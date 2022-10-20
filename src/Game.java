import java.util.Scanner;
public class Game {


    Holder holder;
    Player player1, player2;

    boolean playing = true;

    Game() {
    }

    public void play () {
        Scanner scanner = new Scanner(System.in);
        while(playing){
        //Player 1
        System.out.println("Spiller 1 kast med terningerne");
        System.out.println("Tryk på enter spiller 1");
        String p1 = scanner.nextLine();
        System.out.println("Spiller 1 du slog ");
        System.out.println("Hvad der blev slået");
        System.out.println("Du landede på "); //efter plus skal feltet og beskrivelsen af feltets effekt stå
        System.out.println("Din sum er nu "); //efter plus skal spiller 1 pointsum stå

        //Player 2
        System.out.println("Spiller 2 kast med terningerne");
        System.out.println("Spiller 2 tryk på enter ");
        String p2 = scanner.nextLine();
            System.out.println("Spiller 1 du slog ");
            System.out.println("Hvad der blev slået");
            System.out.println("Du landede på "); //efter plus skal feltet og beskrivelsen af feltets effekt stå
            System.out.println("Din sum er nu "); //efter plus skal spiller 2 pointsum stå


        }
    }
}




