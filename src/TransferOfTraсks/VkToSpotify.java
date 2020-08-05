package TransferOfTraсks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VkToSpotify {
    public static void main(String[] args) {                           //js console
        try (FileReader Reader = new FileReader("tracks.txt"); //document.getElementsByClassName("audio_page__audio_rows _audio_page__audio_rows")[0].innerText;
             FileWriter out = new FileWriter("Spotify.txt")) {
            Scanner reader = new Scanner(Reader);
            String str = "";
            int i = 0;
            while (reader.hasNext()) {
                i++;
                if (i % 3 == 1) {
                    str += reader.nextLine();
                } else if (i % 3 == 2) {
                    str += " - " + reader.nextLine();
                } else {
                    reader.nextLine();
                    str += "\n";
                }
            }
            System.out.println(str);
            out.write(str);
            out.flush(); // https://www.tunemymusic.com/ru
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
