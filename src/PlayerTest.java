import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PlayerTest {
    public static void main(String[] args) throws IOException {
        CreatePlayerList playerTest = new CreatePlayerList();
        ArrayList<Player> lists = playerTest.getPlayers();
        Export export = new Export();

        Collections.sort(lists);
        export.ExportCsv(lists);
    }
}