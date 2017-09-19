import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{
    private Button btnexit =new Button("exit");
    private Button btnadd =new Button("ADD");
    private Button btnmin =new Button("MINUS");
    private Label lab =new Label("0");
    private int n=0;
    public MainFrame() {
        initComp();
    }



    public void initComp(){

        btnexit.setBounds(130,70,100,30);
        btnadd.setBounds(130,100,100,30);
        btnadd.setBackground(new Color(255,0,0));
        btnmin.setBounds(130,130,100,30);
        btnmin.setBackground(new Color(0,255,0));
        lab.setBounds(130,160,100,30);

        this.setBounds(100,120,400,300);
        this.add(btnexit);
        this.add(btnadd);
        this.add(btnmin);
        this.add(lab);

        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lab.setText(Integer.toString(n));
            }
        });
        btnmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n--;
                lab.setText(Integer.toString(n));
            }
        });
        btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLayout(null);


    }

}
