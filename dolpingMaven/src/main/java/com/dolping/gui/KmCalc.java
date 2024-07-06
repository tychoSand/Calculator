package com.dolping.gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringBufferInputStream;


public class KmCalc { //Km_80
    private JPanel panelMain;
    private JTextField textField1;
    private JButton ACButton ;
    private JButton button2  ;
    private JButton button3  ;
    private JButton button4  ;
    private JButton button5  ;
    private JButton button6  ;
    private JButton a7Button ;
    private JButton a4Button ;
    private JButton a1Button ;
    private JButton a00Button ;
    private JButton button11  ;
    private JButton a8Button ;
    private JButton a5Button  ;
    private JButton a2Button ;
    private JButton a0Button ;
    private JButton button16 ;
    private JButton a9Button  ;
    private JButton a6Button ;
    private JButton a3Button ;
    private JButton button20 ;


    double a, b, result;
    String op;

    public KmCalc() {
        ACButton.addActionListener(new ActionListener()  {
  
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                }
            });


        a7Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a7Button.getText()) ;
            }
        });

        a8Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a8Button.getText()) ;
            }
        });
        a9Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a9Button.getText()) ;
            }
        });
        a4Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a4Button.getText()) ;
            }
        });
        a5Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a5Button.getText()) ;
            }
        });
        a6Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a6Button.getText()) ;
            }
        });
        a1Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a1Button.getText()) ;
            }
        });
        a2Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a2Button.getText()) ;
            }
        });
        a3Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a3Button.getText()) ;
            }
        });
        a0Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a0Button.getText()) ;
            }
        });
        a00Button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a00Button.getText()) ;
            }
        });
        button16.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().contains(".")) {
                    double pm = Double.parseDouble(textField1.getText());
                    pm = pm * -1;
                    textField1.setText(String.valueOf(pm));
                } else {
                    long PM = Long.parseLong(textField1.getText());
                    PM = PM * -1;
                    textField1.setText(String.valueOf(PM));
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (!textField1.getText().contains(".")) {

                    textField1.setText(textField1.getText() + button20.getText()) ;
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText()) ;
                op = "+" ;
                textField1.setText("") ;
            }
    });
        button2.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(textField1.getText()) ;
            op = "-" ;
            textField1.setText("") ;
            }
    });
         button3.addActionListener(new ActionListener() {
        
         public void actionPerformed(ActionEvent e) {
        a = Double.parseDouble(textField1.getText()) ;
        op = "*" ;
        textField1.setText("") ;
            }
    });
        button4.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
        a = Double.parseDouble(textField1.getText()) ;
        op = "/" ;
        textField1.setText("") ;
            }
    });
        button6.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
        String backspace = null ;

        if(textField1.getText().length() > 0)
        {
            StringBuilder strB = new StringBuilder(textField1.getText()) ;
            strB.deleteCharAt(textField1.getText().length() - 1) ;
            backspace = String.valueOf(strB) ;
            textField1.setText(backspace) ;
            }
        }
        });
        button5.addActionListener(new ActionListener() {
    
    public void actionPerformed (ActionEvent e){
        b = Double.parseDouble(textField1.getText());

        if (op == "+") {
            result = a + b;
            textField1.setText(String.valueOf(result));
        } else if (op == "-") {
            result = a - b;
            textField1.setText(String.valueOf(result));
        } else if (op == "*") {
        }
        result = a * b;
        textField1.setText(String.valueOf(result));
    //} else if (op == "/") {
        result = a / b;
        textField1.setText(String.valueOf(result));
        }
    });

    };


        //button1.addActionListener(new ActionListener() {
           // 
            //public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Hello Guapo");
            //}

        //});
    //}

    public void KmCalc () {
        JFrame frame = new JFrame("KmCalc");
        frame.setContentPane(new KmCalc().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void openGui() {
        KmCalc();
    }
}
