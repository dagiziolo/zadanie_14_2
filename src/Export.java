import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Export {
    public void ExportCsv(ArrayList<Player> lists) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("plik.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < lists.size(); i++) {
                bw.write(String.valueOf(lists.get(i)));
                bw.newLine();
                bw.flush();
            }
        }catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
