import java.util.ArrayList;
import java.util.Scanner;

public class CreatePlayerList {
    public ArrayList<Player> getPlayers() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Player> playerList = new ArrayList<>();
        String stoper = "stop";
        String line;
        do {
            System.out.println("Podaj wynik kolejnego gracza (lub stop): Imie nazwisko wynik");
            line = scan.nextLine();
            if (!line.equals(stoper)) {
                String[] s = line.split(" ");
                playerList.add(new Player(s[0], s[1], Integer.valueOf(s[2])));
            }
        } while (!line.equals(stoper));
        return playerList;
    }
}

