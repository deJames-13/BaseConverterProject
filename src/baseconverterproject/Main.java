package baseconverterproject;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;

public class Main {
    public static void main(String args[]) {
        try {

            FlatAtomOneDarkIJTheme.setup();
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
