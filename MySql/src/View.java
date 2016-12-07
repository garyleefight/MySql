import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

/**
 * Created by lsr on 2016/12/2.
 */
public class View extends JFrame implements MouseListener {
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JTextArea input;
    JTextArea load;
    JTextArea show;
    String str;
    Executor executor;
    public void draw(){
//        Graphics graphics = new
        JButton button = new JButton();
        JButton button1 = new JButton();
        JLabel jLabel = new JLabel("Input Sql");
        JLabel jLabel1 = new JLabel("File");
        JLabel jLabel2 = new JLabel("Console");
        JFileChooser jFileChooser = new JFileChooser();
//        JScrollPane jScrollPane = new JScrollPane(show);
        JButton button2 = new JButton();
        button2.setText("Watch Our Source Code Now!");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(new URI("https://github.com/garyleefight/MySql/tree/master/MySql"));
                } catch (IOException e1) {
                    System.out.println("Something Wrong!");
                } catch (URISyntaxException e1) {
                    System.out.println("Wrong Url!");
                }
            }
        });

        button.setText("input sql");
        button.addMouseListener(this);

        jLabel.setBounds(10,5,80,40);
        input.setBounds(110,15,380,20);
        button.setBounds(510,5,80,40);

        button1.setText("load text file");
        button1.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jFileChooser.showOpenDialog(null);
                    File file = jFileChooser.getSelectedFile();
                    if(file!=null) {
                        String path = file.getPath();
                        load.setText(path);
                        Scanner scanner = new Scanner(file);
                        long st = System.currentTimeMillis();
                        int i = 0;
                        while (scanner.hasNextLine()) {
                            i++;
                            System.out.println("line:" + i);
                            str = scanner.nextLine();
                            executor.execute(str);
                        }
                        long ed = System.currentTimeMillis();
                        double sted = (ed-st)/1000;
                        System.out.println("");
                        System.out.println("****************************************************");
                        System.out.println("****************************************************");
                        System.out.println("finish test");
                        System.out.println("Total time:"+sted+"s");
                    }else{
                        System.out.print("do not select files");
                    }
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }

            }
        });



        jLabel1.setBounds(10,55,80,40);
        load.setBounds(110,65,380,20);
        button1.setBounds(510,55,80,40);

        button2.setBounds(200,110,200,60);

//        jLabel2.setBounds(10,105,80,40);
//        jScrollPane.setBounds(110,120,480,400);

//        show.setText("");
//        show.setLineWrap(true);
//        show.setWrapStyleWord(true);


//        panel1.setLayout(null);
//        panel1.setBounds(0,0,600,50);
//        panel2.setLayout(null);
//        panel2.setBounds(0,50,600,50);
//        panel3.setLayout(null);
//        panel3.setBounds(0,100,600,300);




//        panel1.add(jLabel);
//        panel1.add(input);
//        panel1.add(button);
//
//        panel2.add(jLabel1);
//        panel2.add(load);
//        panel2.add(button1);

        this.setLayout(null);
        this.setTitle("MySql---Author:Gary Lee && Ruicong Cai");
//        this.add(panel1);
//        this.add(panel2);
//        this.add(panel3);
        this.add(jLabel);
        this.add(jLabel1);
        this.add(input);
        this.add(load);
        this.add(button2);
//        this.add(jScrollPane);
        this.add(jLabel2);
        this.add(button);
        this.add(button1);
        this.setSize(600,200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public View() {
        this.executor = new Executor();
        this.panel1 = new JPanel();
        this.panel2 = new JPanel();
        this.panel3 = new JPanel();
        this.input = new JTextArea();
        this.load = new JTextArea();
        this.show = new JTextArea();
//        MyPrintStream myPrintStream = new MyPrintStream(System.out,show);
//        System.setOut(myPrintStream);
//        System.setErr(myPrintStream);
        this.str = null;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
            String str = input.getText();
            executor.execute(str);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
