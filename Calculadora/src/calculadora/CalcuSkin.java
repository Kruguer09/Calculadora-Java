/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author usuario_tarde
 */
public class CalcuSkin extends JFrame {

    private JLabel pantalla = new JLabel(new GridLayout(1, 1) + "");
    private JPanel botones = new JPanel(new GridLayout(5, 4));
    private JButton signo, cero, coma, igual, uno, dos, tres, mas, cuatro, cinco,
            seis, menos, siete, ocho, nueve, por, sci, imp, clear, div;
    private boolean nueva = true;
    private String operacion = "";
    private double operadorUno = 0;
    private double operadorDos = 0;
    Font txtUno = new Font("TimesRoman", Font.BOLD, 18);
    Font txtDos = new Font("TimesRoman", Font.BOLD, 50);
    //Color rojo=new Color(255,0,0); sentencia para crear los colores no predefinidos de la clase color.

    public CalcuSkin() {
        //JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //SubstanceLookAndFeel.setSkin("2org.jvnet.substance.skin.CremeSkin");

        //setLayout(null);nos permite poner los elementos por coordenadas
        setTitle("Calculadora basica");
        //pantalla = new JLabel(new GridLayout(1,1)+"0");
        pantalla.setText("0");
        pantalla.setHorizontalAlignment(JLabel.RIGHT);
        //pantalla.setBounds(5, 5, 515, 150);
        pantalla.setFont(txtDos);
        //this.setLayout(new GridLayout(2,1));
        this.add(pantalla, BorderLayout.NORTH);
        this.add(botones, BorderLayout.CENTER);
        sci = new JButton("SCI");
        //sci.setBounds(5, 160, 125, 125);
        sci.setFont(txtUno);
        sci.setForeground(Color.RED);
        botones.add(sci);
        sci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    setDefaultLookAndFeelDecorated(true);
                    SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaSkin");
                    Scif calcsci = new Scif();
                    calcsci.setBounds(0, 0, 445, 550);
                    calcsci.setTitle("Calculadora cientifica");
                    ImageIcon img = new ImageIcon("calc.png");
                    calcsci.setIconImage(img.getImage());
                    calcsci.setVisible(true);
                    //calcsci.setResizable(false);
                    calcsci.setLocationRelativeTo(null);
                    setVisible(false);
                    calcsci.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            dispose();
                        }
                    });

                } catch (Exception err) {
                }

            }
        });

        imp = new JButton("PRINT");
        //imp.setBounds(135, 160, 125, 125);
        imp.setFont(txtUno);
        imp.setForeground(Color.RED);
        botones.add(imp);
        imp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    FileReader lector=new FileReader("pantalla.txt");
                    BufferedReader portador= new BufferedReader(lector);
                    String texto="";
                    String linea;
                    while((linea=portador.readLine())!=null){
                        texto=texto+linea;
                    }
                    portador.close();
                    lector.close();
                    pantalla.setText(texto);
                    /*FileWriter escritor = new FileWriter("pantalla.txt");

                    escritor.write("Resultado = " + pantalla.getText());

                    escritor.close();*/
                } catch (Exception err) {
                }

            }
        });
        clear = new JButton("C");
        //clear.setBounds(265, 160, 125, 125);
        clear.setFont(txtUno);
        clear.setForeground(Color.BLUE);
        botones.add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                pantalla.setText("0");
                operadorUno = operadorDos = 0;
                operacion = "";
            }
        });
        div = new JButton("/");
        //div.setBounds(395, 160, 125, 125);
        div.setFont(txtUno);
        botones.add(div);
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (operadorUno != 0) {
                        operadorUno = operadorUno / Double.parseDouble(pantalla.getText());
                    } else {
                        operadorUno = Double.parseDouble(pantalla.getText());
                    }
                    operacion = "division";
                    pantalla.setText("0");
                } catch (Exception err) {
                }
            }
        });
        siete = new JButton("7");
        //siete.setBounds(5, 290, 125, 125);
        siete.setFont(txtUno);
        botones.add(siete);
        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "7");
            }
        });
        ocho = new JButton("8");
        //ocho.setBounds(135, 290, 125, 125);
        ocho.setFont(txtUno);
        botones.add(ocho);
        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "8");
            }
        });
        nueve = new JButton("9");
        //nueve.setBounds(265, 290, 125, 125);
        nueve.setFont(txtUno);
        botones.add(nueve);
        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "9");
            }
        });
        por = new JButton("x");
        //por.setBounds(395, 290, 125, 125);
        por.setFont(txtUno);
        botones.add(por);
        por.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (operadorUno != 0) {
                        operadorUno = operadorUno * Double.parseDouble(pantalla.getText());
                    } else {
                        operadorUno = Double.parseDouble(pantalla.getText());
                    }
                    operacion = "multiplicacion";
                    pantalla.setText("0");
                } catch (Exception err) {
                }
            }
        });
        cuatro = new JButton("4");
        //cuatro.setBounds(5, 420, 125, 125);
        cuatro.setFont(txtUno);
        botones.add(cuatro);
        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "4");
            }
        });
        cinco = new JButton("5");
        //cinco.setBounds(135, 420, 125, 125);
        cinco.setFont(txtUno);
        botones.add(cinco);
        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "5");
            }
        });
        seis = new JButton("6");
        //seis.setBounds(265, 420, 125, 125);
        seis.setFont(txtUno);
        botones.add(seis);
        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "6");
            }
        });
        menos = new JButton("-");
        //menos.setBounds(395, 420, 125, 125);
        menos.setFont(txtUno);
        botones.add(menos);
        menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (operadorUno != 0) {
                        operadorUno = operadorUno - Double.parseDouble(pantalla.getText());
                    } else {
                        operadorUno = Double.parseDouble(pantalla.getText());
                    }
                    operacion = "resta";
                    pantalla.setText("0");
                } catch (Exception err) {
                }
            }
        });

        uno = new JButton("1");
        //uno.setBounds(5, 550, 125, 125);
        uno.setFont(txtUno);
        botones.add(uno);
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "1");
            }
        });
        dos = new JButton("2");
        //dos.setBounds(135, 550, 125, 125);
        dos.setFont(txtUno);
        botones.add(dos);
        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "2");
            }
        });
        tres = new JButton("3");
        //tres.setBounds(265, 550, 125, 125);
        tres.setFont(txtUno);
        botones.add(tres);
        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "3");
            }
        });
        mas = new JButton("+");
        //mas.setBounds(395, 550, 125, 125);
        mas.setFont(txtUno);
        botones.add(mas);
        mas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (operadorUno != 0) {
                        operadorUno = operadorUno + Double.parseDouble(pantalla.getText());
                    } else {
                        operadorUno = Double.parseDouble(pantalla.getText());
                    }
                    operacion = "suma";
                    pantalla.setText("0");
                } catch (Exception err) {
                }
            }
        });
        signo = new JButton("+/-");
        //signo.setBounds(5, 680, 125, 125);
        signo.setFont(txtUno);
        botones.add(signo);
        signo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText("-" + pantalla.getText());
            }
        });
        cero = new JButton("0");
        //cero.setBounds(135, 680, 125, 125);
        cero.setFont(txtUno);
        botones.add(cero);
        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "0");
            }
        });
        coma = new JButton(",");
        //coma.setBounds(265, 680, 125, 125);
        coma.setFont(txtUno);
        botones.add(coma);
        coma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (nueva) {
                    pantalla.setText("0");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + ".");
            }
        });
        igual = new JButton("=");
        //igual.setBounds(395, 680, 125, 125);
        igual.setFont(txtUno);
        igual.setBackground(Color.GRAY);
        igual.setForeground(Color.white);
        botones.add(igual);
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    operadorDos = Double.parseDouble(pantalla.getText());
                } catch (Exception err) {
                }
                if (operacion.equals("suma")) {
                    double res = operadorUno + operadorDos;
                    pantalla.setText(String.valueOf(res));
                    operadorUno = operadorDos = 0;
                    operacion = "";
                } else if (operacion.equals("resta")) {
                    double res = operadorUno - operadorDos;
                    pantalla.setText(String.valueOf(res));
                    operadorUno = operadorDos = 0;
                    operacion = "";
                } else if (operacion.equals("multiplicacion")) {
                    double res = operadorUno * operadorDos;
                    pantalla.setText(String.valueOf(res));
                    operadorUno = operadorDos = 0;
                    operacion = "";
                } else if (operacion.equals("division")) {
                    double res = operadorUno / operadorDos;
                    pantalla.setText(String.valueOf(res));
                    operadorUno = operadorDos = 0;
                    operacion = "";
                }
                nueva = true;
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaSkin");
        CalcuSkin calc = new CalcuSkin();

        calc.setBounds(0, 0, 345, 550);
        calc.setTitle("Calculadora");
        ImageIcon img = new ImageIcon("calc.png");
        calc.setIconImage(img.getImage());

        calc.setVisible(true);
        //calc.setResizable(false);

        calc.setLocationRelativeTo(null);
    }

}
