package ISSUD;


    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    public class Password extends JFrame implements ActionListener {
        JLabel l1 = new JLabel("Enter the password");
        JPasswordField p = new JPasswordField();
        JButton b1 = new JButton("Login");
        Password(){
            setTitle("Password");
            setSize(410,300);
            setVisible(true);
            setResizable(false);
            setLocation(600,250);
            Font f1 = new Font("Dialog",Font.ROMAN_BASELINE,25);
//       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Font f = new Font("Dialog",Font.BOLD,20);
            l1.setBounds(110,50 , 350, 30);
            l1.setFont(f);
            add(l1);
            //password/////////////////////////
            p.setBounds(50, 100, 300, 40);
            add(p);
            p.setFont(f1);
            //button/////////////////////////////
            b1.setBounds(150, 155, 100, 50);
            add(b1);
            b1.setFont(f);
            ////////////////////////////////////
            b1.addActionListener(this);
            setLayout(null);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b1){
                String s;
                s=p.getText();
                String pass = "123456";
                if(s.equals(pass)){
                    DisplayAll d = new DisplayAll();
                    setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null, " Wrong Password ");
                    p.setText("");
                }
            }

        }

    }

