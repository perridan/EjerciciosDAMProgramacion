package educativo;

import java.io.IOException;

public class ClearScreen {
    public static void clear() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls");
            processBuilder.inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
