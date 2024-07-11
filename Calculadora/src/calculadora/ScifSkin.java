/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author usuario_tarde
 */
public class ScifSkin extends JFrame{
     private JLabel pantalla= new JLabel(new GridLayout(1,1)+"");
    private JPanel botones = new JPanel(new GridLayout(7,5));
    private JButton signo, cero, coma, igual, uno, dos, tres, mas, cuatro, cinco,
            seis, menos, siete, ocho, nueve, por, imp, clear, div, ln, log, 
            xy, x2, raiz, memMenos, memMas, mem, fracc, seno, coseno, e, pi, basic,
            facto, delete;
    private boolean nueva=true;
    private String operacion="";
    private double operadorUno=0, operadorDos=0, memoria=0 ;
    Font txtUno= new Font("TimesRoman", Font. BOLD, 16);
    Font txtDos= new Font("TimesRoman", Font. BOLD, 50);

    public ScifSkin()  {
        //setLayout(null);//nos permite poner los elementos por coordenadas
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora cientifica");
        pantalla.setText("0");
        pantalla.setHorizontalAlignment(JLabel.RIGHT);    
        //pantalla.setBounds(5, 5, 515, 150);
        pantalla.setFont(txtDos);
        this.add(pantalla, BorderLayout.NORTH);
        this.add(botones, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        clear = new JButton("C");
        //clear.setBounds(5, 160, 100, 100);
        clear.setFont(txtUno);
        clear.setForeground(Color.BLUE);
        botones.add(clear);
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                pantalla.setText("0");
                operadorUno=operadorDos=0;
                operacion="";
            }
        });
        delete= new JButton("Del");
        //delete.setBounds(110,160,100,100);
        delete.setFont(txtUno);
        delete.setForeground(Color.BLUE);
        botones.add(delete);
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(pantalla.getText().length()!=0)
                        pantalla.setText(pantalla.getText().substring(0,pantalla.getText().length()-1));
                    
                }catch(Exception err){}
            }
        });
        facto=new JButton("n!");
        //facto.setBounds(215, 160, 100, 100);
        facto.setFont(txtUno);
        facto.setForeground(Color.orange);
        botones.add(facto);
        facto.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    
                    if(pantalla.getText().length()!=0){
                        double res=1;
                        while(operadorDos>0){
                            res=res*operadorDos;
                            operadorDos--;
                        }
                        pantalla.setText(String.valueOf(res));
                    }
                        
                    
                }catch(Exception err){}
            }
        });
        
        imp = new JButton("PRINT");
        //imp.setBounds(320, 160, 100, 100);
        imp.setFont(txtUno);
        imp.setForeground(Color.RED);
        botones.add(imp);
        imp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
            FileWriter escritor=new FileWriter("pantallaSci.txt");
            
            escritor.write(pantalla.getText());
            
            escritor.close();;
        }catch(Exception err){}
            
            }
        });
        
        
        
        basic= new JButton("Basic");
        //basic.setBounds(425,160,100,100);
        basic.setFont(txtUno);
        basic.setForeground(Color.RED);
        botones.add(basic);
        basic.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
        setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaBrickWallSkin");
            Calculadora calcsci = new Calculadora();
        calcsci.setBounds(0, 0, 345, 550);
        calcsci.setTitle("Calculadora");
        ImageIcon img=new ImageIcon("calc.png");
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
        }catch(Exception err){}
            
            }
        });
        fracc=new JButton("1/x");
        //fracc.setBounds(5,265,100,100);
        fracc.setFont(txtUno);
        fracc.setForeground(Color.BLUE);
        botones.add(fracc);
        fracc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    
                    if(pantalla.getText().length()!=0){
                        double res=1/operadorDos;
                        pantalla.setText(String.valueOf(res));
                    }
                        
                    
                }catch(Exception err){}
            }
        });
        seno=new JButton("seno");
        //seno.setBounds(110,265,100,100);
        seno.setFont(txtUno);
        seno.setForeground(Color.BLUE);
        botones.add(seno);
        seno.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    
                    if(pantalla.getText().length()!=0){
                        double res=Math.sin(operadorDos);
                        pantalla.setText(String.valueOf(res));
                    }
                        
                    
                }catch(Exception err){}
            }
        });
        coseno=new JButton("coseno");
        //coseno.setBounds(215,265,100,100);
        coseno.setFont(txtUno);
        coseno.setForeground(Color.BLUE);
        botones.add(coseno);
        coseno.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    
                    if(pantalla.getText().length()!=0){
                        double res=Math.cos(operadorDos);
                        pantalla.setText(String.valueOf(res));
                    }
                        
                    
                }catch(Exception err){}
            }
        });
        e=new JButton("e");
        //e.setBounds(320,265,100,100);
        e.setFont(txtUno);
        e.setForeground(Color.orange);
        botones.add(e);
        e.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    
                    if(pantalla.getText().length()!=0){
                        pantalla.setText(String.valueOf(Math.E));
                    }
                        
                    
                }catch(Exception err){}
            }
        });
        pi=new JButton("Pi");
        //pi.setBounds(425,265,100,100);
        pi.setFont(txtUno);
        pi.setForeground(Color.orange);
        botones.add(pi);
        pi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
               pantalla.setText(String.valueOf(Math.PI));}
                catch(Exception err){}
            }
        });
        raiz=new JButton("√");
        //raiz.setBounds(5,370,100,100);
        raiz.setFont(txtUno);
        raiz.setForeground(Color.blue);
        botones.add(raiz);
        raiz.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    if(pantalla.getText().length()!=0){
                        double res=Math.sqrt(operadorDos);
                        pantalla.setText(String.valueOf(res));
                    }
                    
               
                } catch(Exception err){}
            }
        });
        memMenos=new JButton("M-");
        //memMenos.setBounds(110,370,100,100);
        memMenos.setFont(txtUno);
        memMenos.setForeground(Color.red);
        botones.add(memMenos);
        memMenos.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    memoria=memoria-operadorDos;
                    
            }catch(Exception err){}
                
            }
        });
        memMas=new JButton("M+");
        //memMas.setBounds(215,370,100,100);
        memMas.setFont(txtUno);
        memMas.setForeground(Color.red);
        botones.add(memMas);
        memMas.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    memoria=memoria+operadorDos;
                    
            }catch(Exception err){}
                
            }
        });
        mem=new JButton("M");
        //mem.setBounds(320,370,100,100);
        mem.setFont(txtUno);
        mem.setForeground(Color.red);
        botones.add(mem);
        mem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    pantalla.setText(String.valueOf(memoria));
                    
            }catch(Exception err){}
                
            }
        });
        div = new JButton("/");
        //div.setBounds(425, 370, 100, 100);
        div.setFont(txtUno);
        botones.add(div);
        div.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(operadorUno!=0)
                        operadorUno=operadorUno/Double.parseDouble(pantalla.getText());
                    else
                        operadorUno=Double.parseDouble(pantalla.getText());
                    operacion="division";
                    pantalla.setText("0");
                }catch(Exception err){}
            }
        });
        x2=new JButton();
        //x2.setBounds(5,475,100,100);
        x2.setFont(txtUno);
        x2.setForeground(Color.BLUE);
        x2.setText("<html>X<sup>2</sup></html>");
        botones.add(x2);
        x2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    if(pantalla.getText().length()!=0){
                        double res=Math.pow(operadorDos,2);
                        pantalla.setText(String.valueOf(res));
                    }
                    
               
                } catch(Exception err){}
            }
        });
        siete = new JButton("7");
        //siete.setBounds(110, 475, 100, 100);
        siete.setFont(txtUno);
        botones.add(siete);
        siete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"7");
            }
        });        
        ocho = new JButton("8");
        //ocho.setBounds(215, 475, 100, 100);
        ocho.setFont(txtUno);
        botones.add(ocho);
        ocho.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"8");
            }
        });  
        nueve = new JButton("9");
        //nueve.setBounds(320, 475, 100, 100);
        nueve.setFont(txtUno);
        botones.add(nueve);
        nueve.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"9");
            }
        });  
        por = new JButton("x");
        //por.setBounds(425, 475, 100, 100);
        por.setFont(txtUno);
        botones.add(por);
        por.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(operadorUno!=0)
                        operadorUno=operadorUno*Double.parseDouble(pantalla.getText());
                    else
                        operadorUno=Double.parseDouble(pantalla.getText());
                    operacion="multiplicacion";
                    pantalla.setText("0");
                }catch(Exception err){}
            }
        });
        xy=new JButton();
        //xy.setBounds(5,580,100,100);
        xy.setFont(txtUno);
        xy.setForeground(Color.blue);
        xy.setText("<html>X<sup>y</sup></html>");
        botones.add(xy);
        xy.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(operadorUno!=0)
                        operadorUno=operadorUno*Double.parseDouble(pantalla.getText());
                    else
                        operadorUno=Double.parseDouble(pantalla.getText());
                    operacion="potencia";
                    pantalla.setText("");
                }catch(Exception err){}
            }
        });
        cuatro = new JButton("4");
        //cuatro.setBounds(110, 580, 100, 100);
        cuatro.setFont(txtUno);
        botones.add(cuatro);
        cuatro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"4");
            }
        });  
        cinco = new JButton("5");
        //cinco.setBounds(215, 580, 100, 100);
        cinco.setFont(txtUno);
        botones.add(cinco);
        cinco.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"5");
            }
        });  
        seis = new JButton("6");
        //seis.setBounds(320, 580, 100,100);
        seis.setFont(txtUno);
        botones.add(seis);
        seis.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"6");
            }
        });  
        menos = new JButton("-");
        //menos.setBounds(425, 580, 100, 100);
        menos.setFont(txtUno);
        botones.add(menos);
        menos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(operadorUno!=0)
                        operadorUno=operadorUno-Double.parseDouble(pantalla.getText());
                    else
                        operadorUno=Double.parseDouble(pantalla.getText());
                    operacion="resta";
                    pantalla.setText("0");
                }catch(Exception err){}
            }
        });
        log=new JButton("log");
        //log.setBounds(5,685,100,100);
        log.setFont(txtUno);
        log.setForeground(Color.blue);
        botones.add(log);
        log.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    if(pantalla.getText().length()!=0){
                        double res=Math.log10(operadorDos);
                        pantalla.setText(String.valueOf(res));
                    }
                    
               
                } catch(Exception err){}
            }
        });

        uno = new JButton("1");
        //uno.setBounds(110, 685, 100, 100);
        uno.setFont(txtUno);
        botones.add(uno);
        uno.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"1");
            }
        });  
        dos = new JButton("2");
        //dos.setBounds(215, 685, 100, 100);
        dos.setFont(txtUno);
        botones.add(dos);
        dos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"2");
            }
        });  
        tres = new JButton("3");
        //tres.setBounds(320, 685, 100, 100);
        tres.setFont(txtUno);
        botones.add(tres);
        tres.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"3");
            }
        });  
        mas = new JButton("+");
        //mas.setBounds(425, 685, 100, 100);
        mas.setFont(txtUno);
        botones.add(mas);
        mas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(operadorUno!=0)
                        operadorUno=operadorUno+Double.parseDouble(pantalla.getText());
                    else
                        operadorUno=Double.parseDouble(pantalla.getText());
                    operacion="suma";
                    pantalla.setText("0");
                }catch(Exception err){}
            }
        });  
        ln=new JButton("ln");
        //ln.setBounds(5,790,100,100);
        ln.setFont(txtUno);
        ln.setForeground(Color.BLUE);
        botones.add(ln);
        ln.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                    if(pantalla.getText().length()!=0){
                        double res=Math.log(operadorDos);
                        pantalla.setText(String.valueOf(res));
                    }
                    
               
                } catch(Exception err){}
            }
        });
        signo = new JButton("+/-");
        //signo.setBounds(110, 790, 100, 100);
        signo.setFont(txtUno);
        botones.add(signo);
        signo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText("-"+pantalla.getText());
            }
        }); 
        cero = new JButton("0");
        //cero.setBounds(215, 790, 100, 100);
        cero.setFont(txtUno);
        botones.add(cero);
        cero.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+"0");
            }
        });  
        coma = new JButton(",");
        //coma.setBounds(320, 790, 100, 100);
        coma.setFont(txtUno);
        botones.add(coma);
        coma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){pantalla.setText("");nueva=false;}
                pantalla.setText(pantalla.getText()+".");
            }
        });
        igual = new JButton("=");
        //igual.setBounds(425, 790, 100, 100);
        igual.setFont(txtUno);
        igual.setBackground(Color.GRAY);
        igual.setForeground(Color.white);
        botones.add(igual);
        igual.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    operadorDos=Double.parseDouble(pantalla.getText());
                }catch(Exception err){}
                if(operacion.equals("suma")){
                    double res=operadorUno+operadorDos;
                    pantalla.setText(String.valueOf(res));
                    operadorUno=operadorDos=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double res=operadorUno-operadorDos;
                    pantalla.setText(String.valueOf(res));
                    operadorUno=operadorDos=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double res=operadorUno*operadorDos;
                    pantalla.setText(String.valueOf(res));
                    operadorUno=operadorDos=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double res=operadorUno/operadorDos;
                    pantalla.setText(String.valueOf(res));
                    operadorUno=operadorDos=0;
                    operacion="";
                }else if(operacion.equals("potencia")){
                    double res=Math.pow(operadorUno, operadorDos);
                    pantalla.setText(String.valueOf(res));
                    operadorUno=operadorDos=0;
                    operacion="";
                }
                nueva=true;
            }
        });
        
    }
    public static void main(String[] args) {
        setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaBrickWallSkin");
        ScifSkin calc = new ScifSkin();
        calc.setBounds(0, 0, 445, 550);
        calc.setTitle("Calculadora cientifica");
        ImageIcon img=new ImageIcon("calc.png");
        calc.setIconImage(img.getImage());
        calc.setVisible(true);
        //calc.setResizable(false);
        calc.setLocationRelativeTo(null);
    }
    
}
