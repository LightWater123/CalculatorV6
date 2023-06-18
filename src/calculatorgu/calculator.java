/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorgu;

/**
 *
 * @author Red
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    
    double num,ans;
    int calculation;
    int calculation2;
    int calculation3;
    int calculation4;
    String parenthesisType;
    
    
    public calculator() {
        initComponents();
        
        jRadioButton1.setEnabled(false); // disables ON button
    }
    
    // methods
    
    public void artihmethic_operation()
    {
        switch(calculation)
        {
            case 1: // ADD
                ans = num + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
            case 2: // SUBTRACT
                ans = num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
            case 3: // MULTIPLY
                ans = num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
            case 4: // DIVIDE
                double divisor = Double.parseDouble(jTextField1.getText());
                if (divisor != 0) 
                {
                ans = num / divisor;
                jTextField1.setText(Double.toString(ans));
                } else 
                {
                jTextField1.setText("Error: Division by zero");
                }
    break;  
            
        }
    }
    
    
    public void assignment_operator()
    {
        switch(calculation2)
        {
            case 1: //modulus
                double divisor = Double.parseDouble(jTextField1.getText());
                if (divisor != 0) 
                {
                ans = num % divisor;
                jTextField1.setText(Double.toString(ans));
                } else 
                {
                jTextField1.setText("Error: Division by zero");
                }
                break;
            case 2 : // plus equal
                ans = num += Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
            case 3 : // minus equal
                ans = num -= Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
            case 4 : // multi equal
               ans = num *= Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
            case 5 : // divide equal
                double divisorr = Double.parseDouble(jTextField1.getText());
                if (divisorr != 0) 
                {
                ans = num /= divisorr;
                jTextField1.setText(Double.toString(ans));
                } else 
                {
                jTextField1.setText("Error: Division by zero");
                }
    break;
            case 6 : //plus x2
                ans = ++num;
                jTextField1.setText(Double.toString(ans));
                break;
            case 7 : // --
                ans = --num;
                jTextField1.setText(Double.toString(ans));
                break;
            
                
                
        }
    }
    public void logical_operator()
    {
        switch(calculation3)
        {
            case 1 : // !
                double input = Double.parseDouble(jTextField1.getText());
                boolean notInput = !(input != 0);
                jTextField1.setText(Boolean.toString(notInput));
                break;  
            case 2: // And 
                double secondInput = Double.parseDouble(jTextField1.getText());
                boolean input1 = num > 0;
                boolean input2 = secondInput < 10;
                boolean ans = input1 && input2;
                jTextField1.setText(Boolean.toString(ans));
                break;
                
            case 3 : // OR
               double thirdInput = Double.parseDouble(jTextField1.getText());
                boolean resultOr = num < 0 || thirdInput > 20;
                jTextField1.setText(resultOr ? "true" : "false");
                break;
            case 4 : // ^ bitwise 
                int intInput = Integer.parseInt(jTextField1.getText());
                int resultXor = (int) num ^ intInput;
                jTextField1.setText(Integer.toString(resultXor));
                break;
            
        }
    }
    public void relational_operator()
    {
        switch(calculation4)
        {
            case 1 : //greater than and less than equal to >=
                double inputt = Double.parseDouble(jTextField1.getText());
                
                if (num >= inputt){
                    jTextField1.setText("true");
                }
                else
                {
                    jTextField1.setText("false");
                }
                    break;
            case 2 : // greater than or less than >
               double input = Double.parseDouble(jTextField1.getText());
               
                    if (num > input) 
            {
                        jTextField1.setText("true");
            }       
                    else 
            {
                         jTextField1.setText("false");
            }
                    break; 
            case 3 : // not equal to !=
                
                double inputtt = Double.parseDouble(jTextField1.getText());
                
                if(num != inputtt)
                {
                    jTextField1.setText("true");
                }else
                {
                    jTextField1.setText("false");
                }
                break;
            case 4 : // Unary NOT operator !
                boolean booleanInput = num != 0;
                boolean resultNot = !booleanInput;
                jTextField1.setText(Boolean.toString(resultNot));
                break;
            case 5 : // equal ==
                double input4 = Double.parseDouble(jTextField1.getText());
                
                if(num == input4)
                {
                    jTextField1.setText("true");
                }else
                {
                    jTextField1.setText("false");
                }
                break;
        }
    }
    public void parenthesis()
    {
        String currentText = jTextField1.getText();
        
        switch(parenthesisType)
        {
            case "opening": // (
                currentText += "(";
                break;
            case "closing": // )
                currentText += ")";
                break;
        }
    }
    
    public void enable()
    {
        jTextField1.setEnabled(true);
        jRadioButton1.setEnabled(false); // ON button disable
        jRadioButton2.setEnabled(true); // OFF button disable
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);
        jButton25.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
        jButton30.setEnabled(true);
        jButton31.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        
    }
    
    public void disable() 
    {
      jTextField1.setEnabled(false); // ON button enabled
      jRadioButton1.setEnabled(true); // OFF button disable 
      
      jButton1.setEnabled(false);
      jButton2.setEnabled(false);
      jButton3.setEnabled(false);
      jButton4.setEnabled(false);
      jButton5.setEnabled(false);
      jButton6.setEnabled(false);
      jButton7.setEnabled(false);
      jButton8.setEnabled(false);
      jButton9.setEnabled(false);
      jButton10.setEnabled(false);
      jButton11.setEnabled(false);
      jButton12.setEnabled(false);
      jButton13.setEnabled(false);
      jButton14.setEnabled(false);
      jButton15.setEnabled(false);
      jButton16.setEnabled(false);
      jButton17.setEnabled(false);
      jButton18.setEnabled(false);
      jButton20.setEnabled(false);
      jButton21.setEnabled(false);
      jButton21.setEnabled(false);
      jButton22.setEnabled(false);
      jButton23.setEnabled(false);
      jButton24.setEnabled(false);
      jButton25.setEnabled(false);
      jButton26.setEnabled(false);
      jButton27.setEnabled(false);
      jButton28.setEnabled(false);
      jButton29.setEnabled(false);
      jButton30.setEnabled(false);
      jButton31.setEnabled(false);
      jButton32.setEnabled(false);
      jButton33.setEnabled(false);
      jButton34.setEnabled(false);
      jButton35.setEnabled(false);
      
      
    }
    
    public void arithmethicOP()
    {
      jRadioButton3.setEnabled(false);
      jRadioButton4.setEnabled(true);
      jRadioButton6.setEnabled(true);
      jRadioButton5.setEnabled(true);
      
      jButton2.setEnabled(true);
      jButton6.setEnabled(true);
      jButton10.setEnabled(true);
      jButton11.setEnabled(true);
      jButton18.setEnabled(false);
      jButton20.setEnabled(false);
      jButton21.setEnabled(false);
      jButton21.setEnabled(false);
      jButton22.setEnabled(false);
      jButton23.setEnabled(false);
      jButton24.setEnabled(false);
      jButton25.setEnabled(false);
      jButton26.setEnabled(false);
      jButton27.setEnabled(false);
      jButton28.setEnabled(false);
      jButton29.setEnabled(false);
      jButton30.setEnabled(false);
      jButton31.setEnabled(false);
      jButton32.setEnabled(false);
      jButton33.setEnabled(false);
      jButton34.setEnabled(false);
    }
    
    public void relational()
    {
      jRadioButton4.setEnabled(false);
      jRadioButton3.setEnabled(true);
      jRadioButton6.setEnabled(true);
      jRadioButton5.setEnabled(true);
      
      
      jButton18.setEnabled(true);
      jButton20.setEnabled(true);
      jButton28.setEnabled(true);
      jButton29.setEnabled(true);
      jButton30.setEnabled(true);
      jButton34.setEnabled(true);
      jButton2.setEnabled(false);
      jButton6.setEnabled(false);
      jButton10.setEnabled(false);
      jButton11.setEnabled(false);
      jButton21.setEnabled(false);
      jButton22.setEnabled(false);
      jButton23.setEnabled(false);
      jButton24.setEnabled(false);
      jButton25.setEnabled(false);
      jButton26.setEnabled(false);
      jButton27.setEnabled(false);
      jButton28.setEnabled(true);     
      jButton31.setEnabled(false);
      jButton32.setEnabled(false);
      jButton33.setEnabled(false);
    }
    
    public void assignment()
    {
      jRadioButton6.setEnabled(false);
      jRadioButton4.setEnabled(true);
      jRadioButton3.setEnabled(true);
      jRadioButton5.setEnabled(true);
      
      jButton2.setEnabled(false);
      jButton6.setEnabled(false);            
      jButton10.setEnabled(false);
      jButton11.setEnabled(false);
      jButton18.setEnabled(false);
      jButton20.setEnabled(false);
      jButton21.setEnabled(true);
      jButton22.setEnabled(true);
      jButton23.setEnabled(true);
      jButton24.setEnabled(true);
      jButton25.setEnabled(true);
      jButton26.setEnabled(true);
      jButton27.setEnabled(true);
      jButton28.setEnabled(false);
      jButton29.setEnabled(false);
      jButton30.setEnabled(false);
      jButton31.setEnabled(false);
      jButton32.setEnabled(false);
      jButton33.setEnabled(false);
      jButton34.setEnabled(false);
      
      
      
    }
    public void logical()
    {
     jRadioButton5.setEnabled(false);
     jRadioButton3.setEnabled(true);
     jRadioButton4.setEnabled(true);
     jRadioButton6.setEnabled(true);
     
     
     jButton31.setEnabled(true);
     jButton32.setEnabled(true);
     jButton33.setEnabled(true);
     
     jButton2.setEnabled(false);
     jButton6.setEnabled(false);            
     jButton10.setEnabled(false);
     jButton11.setEnabled(false);
     jButton18.setEnabled(false);
     jButton20.setEnabled(false);
     jButton21.setEnabled(false);
     jButton22.setEnabled(false);
     jButton23.setEnabled(false);
     jButton24.setEnabled(false);
     jButton25.setEnabled(false);
     jButton26.setEnabled(false);
     jButton27.setEnabled(false);
     jButton28.setEnabled(false);
     jButton29.setEnabled(false);
     jButton30.setEnabled(false);
     jButton34.setEnabled(false);
     
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setToolTipText("");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("COCOGOOSE ", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(153, 102, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(153, 102, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 51, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("7");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("8");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 0, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("9");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 51, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 0, 0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("4");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("5");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 0, 0));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("6");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 51, 0));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("*");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 51, 0));
        jButton11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("/");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(153, 0, 0));
        jButton12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("1");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(153, 0, 0));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("3");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(153, 0, 0));
        jButton14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("2");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(153, 0, 0));
        jButton15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("0");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(153, 51, 0));
        jButton16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText(".");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 51, 51));
        jButton17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("=");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 0, 51));
        jButton19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("<-");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButton18.setBackground(new java.awt.Color(204, 51, 0));
        jButton18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("<");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(204, 51, 0));
        jButton20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText(">");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(204, 102, 0));
        jButton21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("%=");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(204, 102, 0));
        jButton22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("-=");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(204, 102, 0));
        jButton23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("+=");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(204, 102, 0));
        jButton24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("/=");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(204, 102, 0));
        jButton25.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("*=");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(204, 102, 0));
        jButton26.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("++");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(204, 102, 0));
        jButton27.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("--");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(153, 102, 0));
        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Arithmethic");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(153, 102, 0));
        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Relational");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(153, 102, 0));
        jRadioButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Assignment");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(255, 0, 51));
        jButton28.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("<=");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(204, 51, 0));
        jButton29.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText(">=");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(204, 51, 0));
        jButton30.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("!=");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(153, 102, 0));
        jRadioButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Logical");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(255, 153, 0));
        jButton31.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("&&");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(255, 153, 0));
        jButton32.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("||");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(255, 153, 0));
        jButton33.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("^");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(204, 51, 0));
        jButton34.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("==");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(153, 51, 0));
        jButton35.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("!");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(27, 27, 27)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        enable(); // enable method
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        num = Double.parseDouble(jTextField1.getText());
        calculation =1;
        jTextField1.setText("");
        jLabel2.setText(num + "+");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation =2;
        jTextField1.setText("");
        jLabel2.setText(num + "-");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation =3;
        jTextField1.setText("");
        jLabel2.setText(num + "*");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation =4;
        jTextField1.setText("");
        jLabel2.setText(num + "/");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
          jTextField1.setText(jTextField1.getText() + "0"); 
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       disable(); // disable method
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length() - 1;
        String store;
        
        if(length > 0)
        {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField1.setText(store);
            
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        artihmethic_operation();
        assignment_operator();
        relational_operator();
        logical_operator();
        
        jLabel2.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation4 =2;
        jTextField1.setText("");
        jLabel2.setText(num + ">");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation4 =2;
        jTextField1.setText("");
        jLabel2.setText(num + "<");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation2 = 1;
        jTextField1.setText("");
        jLabel2.setText(num + "%=");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation2 = 3;
        jTextField1.setText("");
        jLabel2.setText(num + "-=");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation2 = 2;
        jTextField1.setText("");
        jLabel2.setText(num + "+=");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation2 = 5;
        jTextField1.setText("");
        jLabel2.setText(num + "/=");
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation2 = 4;
        jTextField1.setText("");
        jLabel2.setText(num + "*=");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation2 = 6;
        jTextField1.setText("");
        jLabel2.setText(num + "++");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation2 = 7;
        jTextField1.setText("");
        jLabel2.setText(num + "--");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
       arithmethicOP();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        relational();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        assignment();
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation4 =1;
        jTextField1.setText("");
        jLabel2.setText(num + "<=");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation4 =1;
        jTextField1.setText("");
        jLabel2.setText(num + ">=");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation4 = 3;
        jTextField1.setText("");
        jLabel2.setText(num + "!=");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        logical();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation3 = 2;
        jTextField1.setText("");
        jLabel2.setText(num + "&&");
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation3 = 3;
        jTextField1.setText("");
        jLabel2.setText(num + "||");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation3 = 4;
        jTextField1.setText("");
        jLabel2.setText(num + "^");
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation4 = 5;
        jTextField1.setText("");
        jLabel2.setText(num + "==");
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation3 = 1;
        jTextField1.setText("");
        jLabel2.setText("!");
    }//GEN-LAST:event_jButton35ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
