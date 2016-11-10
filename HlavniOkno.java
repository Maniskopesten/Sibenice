package net.sevecek;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JPanel contentPane;
    JLabel labC1;
    JLabel labZ;
    JLabel labE;
    JLabel labC2;
    JLabel labH;
    JLabel labT;
    JLabel labA;
    JLabel labS;
    JLabel labI;
    JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public HlavniOkno() {
        initComponents();
    }

    private void priStiskuPismena(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_C) {
            labC1.setText("c");
            labC2.setText("c");
        }
        if (e.getKeyCode() == KeyEvent.VK_Z) {
            labZ.setText("z");
        }
        if (e.getKeyCode() == KeyEvent.VK_E) {
            labE.setText("e");
        }
        if (e.getKeyCode() == KeyEvent.VK_H) {
            labH.setText("h");
        }
        if (e.getKeyCode() == KeyEvent.VK_I) {
            labI.setText("i");
        }
        if (e.getKeyCode() == KeyEvent.VK_T) {
            labT.setText("t");
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            labA.setText("a");
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            labS.setText("s");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        contentPane = new JPanel();
        labC1 = new JLabel();
        labZ = new JLabel();
        labE = new JLabel();
        labC2 = new JLabel();
        labH = new JLabel();
        labT = new JLabel();
        labA = new JLabel();
        labS = new JLabel();
        labI = new JLabel();
        label1 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sibenice");
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                priStiskuPismena(e);
            }
        });
        Container contentPane2 = getContentPane();
        contentPane2.setLayout(new BorderLayout());

        //======== contentPane ========
        {
            contentPane.setFont(new Font("Segoe UI", Font.PLAIN, 39));
            contentPane.setBackground(Color.pink);
            contentPane.setLayout(null);

            //---- labC1 ----
            labC1.setText("*");
            labC1.setFont(new Font("Segoe UI", Font.BOLD, 42));
            labC1.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(labC1);
            labC1.setBounds(10, 150, 40, 40);

            //---- labZ ----
            labZ.setText("*");
            labZ.setFont(new Font("Segoe UI", Font.BOLD, 42));
            labZ.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(labZ);
            labZ.setBounds(50, 150, 40, 40);

            //---- labE ----
            labE.setText("*");
            labE.setFont(new Font("Segoe UI", Font.BOLD, 42));
            labE.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(labE);
            labE.setBounds(90, 150, 40, 40);

            //---- labC2 ----
            labC2.setText("*");
            labC2.setFont(new Font("Segoe UI", Font.BOLD, 42));
            labC2.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(labC2);
            labC2.setBounds(130, 150, 40, 40);

            //---- labH ----
            labH.setText("*");
            labH.setFont(new Font("Segoe UI", Font.BOLD, 42));
            labH.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(labH);
            labH.setBounds(170, 150, 40, 40);

            //---- labT ----
            labT.setText("*");
            labT.setFont(new Font("Segoe UI", Font.BOLD, 42));
            labT.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(labT);
            labT.setBounds(250, 150, 40, 40);

            //---- labA ----
            labA.setText("*");
            labA.setFont(new Font("Segoe UI", Font.BOLD, 42));
            labA.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(labA);
            labA.setBounds(290, 150, 40, 40);

            //---- labS ----
            labS.setText("*");
            labS.setFont(new Font("Segoe UI", Font.BOLD, 42));
            labS.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(labS);
            labS.setBounds(330, 150, 40, 40);

            //---- labI ----
            labI.setText("*");
            labI.setFont(new Font("Segoe UI", Font.BOLD, 42));
            labI.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(labI);
            labI.setBounds(210, 150, 40, 40);

            //---- label1 ----
            label1.setText("Uhodni slovo na 9 znaku pomoci pismen na klavesnici");
            label1.setFont(new Font("Segoe UI", Font.ITALIC, 16));
            contentPane.add(label1);
            label1.setBounds(new Rectangle(new Point(25, 50), label1.getPreferredSize()));

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < contentPane.getComponentCount(); i++) {
                    Rectangle bounds = contentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = contentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                contentPane.setMinimumSize(preferredSize);
                contentPane.setPreferredSize(preferredSize);
            }
        }
        contentPane2.add(contentPane, BorderLayout.CENTER);
        setSize(500, 395);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
