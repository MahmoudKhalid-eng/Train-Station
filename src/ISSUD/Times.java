package ISSUD;
    import java.awt.*;
    import javax.swing.*;
    public class Times extends JFrame {
            JTable tab;
            String columns []= new String []{" TO " , "Times","Times","Times","Times","Times","Times","Times","Times"};
            String data[][] = new String [][]{{"Cairo" ,"4:10","4:40","5:10","5:40","6.00","6:30","7:00","7:40"},
                    {"Tanta","4:00","4:30","5:15","5:08","6.10","6:40","7:30","7:55"},
                    {"Alexandria","4:00","4:30","5:00","5:45","6.00","6:20","7:10","7:45"},
                    {"Mansoura","4:05","4:55","5:20","5:25","6.54","6:14","7:15","7:25"},
                    {"Sharkia","4:10","4:40","5:00","5:13","6.10","6:45","7:10","7:19"},
                    {"Fayoum","4:05","4:45","5:15","5:45","6.10","6:40","7:10","7:55"},
                    {"Aswan","4:10","4:40","5:10","5:40","6.00","6:30","7:00","7:40"}


            };

            ////////////////////////////
            JPanel p1 = new JPanel();
            Times(){
                setTitle("Times");
                setSize(500,300);
                setVisible(true);
                setResizable(false);
                //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLocation(430,80);
                Font f = new Font("Dialog",Font.BOLD,12);
                p1.setBackground(Color.white);
                tab =new JTable(data,columns);
                add(tab);
                //tab.setFont(f);
                tab.setBackground(Color.pink);
                // tab.setForeground(Color.white);

            }

    }

