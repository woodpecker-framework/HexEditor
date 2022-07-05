import at.HexLib.library.HexLib;
import org.fife.ui.hex.swing.HexEditor;

import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        HexLib hexLib = new HexLib();
        hexLib.setConvertBytesLen(true);
        hexLib.setASCIIEditorVisible(true);
        hexLib.setHexEditorVisible(true);
        hexLib.setByteContent("xewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhw".getBytes());
        HexEditor hexEditor = new HexEditor();
        hexEditor.open(new ByteArrayInputStream("xewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhwxewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhwxewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhwxewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhwxewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhwxewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhwxewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhwxewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhwxewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhwxewewewojfwofjiwoiefjwoijwofijwfoijwnvdihefwihwiurhwirhwirhwirhw".getBytes()));
        hexEditor.setHighlightSelectionInAsciiDump(true);
        frame.add(hexEditor,BorderLayout.CENTER);
        frame.setSize(1000,800);
        frame.setVisible(true);
    }
}
