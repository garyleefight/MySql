import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by lsr on 2016/12/2.
 */
public class MyPrintStream extends PrintStream {

    private JTextArea text;
    private StringBuffer sb = new StringBuffer();

    public MyPrintStream(OutputStream out, JTextArea text) {
        super(out);
        this.text = text;
    }


    @Override
    public void write(byte[] buf, int off, int len) {
        final String message = new String(buf, off, len);
                text.append(message);
//                text.setSelectionStart(text.getText().length());
        text.setCaretPosition(text.getDocument().getLength());
        text.paintImmediately(text.getBounds());
//                text.repaint();
    }

    }

//    public void println(Object o){
//        text.setText(o+"\n");
//    }

