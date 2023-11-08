
package mycalculator;

public class CalculatorJFrame extends javax.swing.JFrame {
double num1,num2,res;
String operator,ans;
    private String s;

    
    public CalculatorJFrame() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        choice1 = new java.awt.Choice();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTextField_display = new javax.swing.JTextField();
        jButton_1 = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_6 = new javax.swing.JButton();
        jButton_7 = new javax.swing.JButton();
        jButton_8 = new javax.swing.JButton();
        jButton_9 = new javax.swing.JButton();
        jButton_plus = new javax.swing.JButton();
        jButton_minus = new javax.swing.JButton();
        jButton_multiply = new javax.swing.JButton();
        jButton_divider = new javax.swing.JButton();
        jButton_0 = new javax.swing.JButton();
        jButton_equal = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jTextField_display.setBackground(java.awt.SystemColor.activeCaption);
        jTextField_display.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_displayActionPerformed(evt);
            }
        });

        jButton_1.setBackground(new java.awt.Color(9, 112, 147));
        jButton_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_1.setText("1");
        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });

        jButton_2.setBackground(new java.awt.Color(9, 112, 147));
        jButton_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_2.setText("2");
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });

        jButton_3.setBackground(new java.awt.Color(9, 112, 147));
        jButton_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_3.setText("3");
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });

        jButton_4.setBackground(new java.awt.Color(9, 112, 147));
        jButton_4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_4.setText("4");
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });

        jButton_5.setBackground(new java.awt.Color(9, 112, 147));
        jButton_5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_5.setText("5");
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });

        jButton_6.setBackground(new java.awt.Color(9, 112, 147));
        jButton_6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_6.setText("6");
        jButton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_6ActionPerformed(evt);
            }
        });

        jButton_7.setBackground(new java.awt.Color(9, 112, 147));
        jButton_7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_7.setText("7");
        jButton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_7ActionPerformed(evt);
            }
        });

        jButton_8.setBackground(new java.awt.Color(9, 112, 147));
        jButton_8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_8.setText("8");
        jButton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_8ActionPerformed(evt);
            }
        });

        jButton_9.setBackground(new java.awt.Color(9, 112, 147));
        jButton_9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_9.setText("9");
        jButton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_9ActionPerformed(evt);
            }
        });

        jButton_plus.setBackground(java.awt.SystemColor.activeCaption);
        jButton_plus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_plus.setText("+");
        jButton_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_plusActionPerformed(evt);
            }
        });

        jButton_minus.setBackground(java.awt.SystemColor.activeCaption);
        jButton_minus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_minus.setText("-");
        jButton_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_minusActionPerformed(evt);
            }
        });

        jButton_multiply.setBackground(java.awt.SystemColor.activeCaption);
        jButton_multiply.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_multiply.setText("*");
        jButton_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_multiplyActionPerformed(evt);
            }
        });

        jButton_divider.setBackground(java.awt.SystemColor.activeCaption);
        jButton_divider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_divider.setText("/");
        jButton_divider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dividerActionPerformed(evt);
            }
        });

        jButton_0.setBackground(new java.awt.Color(9, 112, 147));
        jButton_0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_0.setText("0");
        jButton_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_0ActionPerformed(evt);
            }
        });

        jButton_equal.setBackground(new java.awt.Color(9, 112, 147));
        jButton_equal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_equal.setText("=");
        jButton_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_equalActionPerformed(evt);
            }
        });

        jButton_Clear.setBackground(new java.awt.Color(9, 112, 147));
        jButton_Clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Clear.setText("C");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField_display)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton_0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton_divider, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton_8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton_9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton_minus, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addComponent(jButton_plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_2, jButton_3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTextField_display, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_1)
                    .addComponent(jButton_2)
                    .addComponent(jButton_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_plus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_4)
                    .addComponent(jButton_5)
                    .addComponent(jButton_6)
                    .addComponent(jButton_minus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_7)
                    .addComponent(jButton_8)
                    .addComponent(jButton_9)
                    .addComponent(jButton_multiply))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_equal, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jButton_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_divider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>                        

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String s=jTextField_display.getText();
        if(s.startsWith("0"))
        jTextField_display.setText("3");
         else
        jTextField_display.setText(s+"3");
    }                                         

    private void jButton_6ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         String s=jTextField_display.getText();
         if(s.startsWith("0"))
        jTextField_display.setText("6");
         else
        jTextField_display.setText(s+"6");        
    }                                         

    private void jButton_9ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         String s=jTextField_display.getText();
         if(s.startsWith("0"))
        jTextField_display.setText("9");
         else
        jTextField_display.setText(s+"9");        
    }                                         

    private void jButton_minusActionPerformed(java.awt.event.ActionEvent evt) {                                              
        num1=Double.parseDouble(jTextField_display.getText());
        jTextField_display.setText("");
        operator="-";
    }                                             

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String s=jTextField_display.getText();
       if(s.startsWith("0"))
        jTextField_display.setText("2");
         else
        jTextField_display.setText(s+"2");     
    }                                         

    private void jButton_8ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String s=jTextField_display.getText();
        if(s.startsWith("0"))
        jTextField_display.setText("8");
         else
        jTextField_display.setText(s+"8");
    }                                         

    private void jButton_multiplyActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        num1=Double.parseDouble(jTextField_display.getText());
        jTextField_display.setText("");
        operator="*";
    }                                                

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String s=jTextField_display.getText();
        if(s.startsWith("0"))
        jTextField_display.setText("1");
         else
        jTextField_display.setText(s+"1");
    }                                         

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         String s=jTextField_display.getText();
         if(s.startsWith("0"))
        jTextField_display.setText("4");
         else
        jTextField_display.setText(s+"4");
    }                                         

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String s=jTextField_display.getText();
       if(s.startsWith("0"))
        jTextField_display.setText("5");
         else
        jTextField_display.setText(s+"5");
    }                                         

    private void jButton_7ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String s=jTextField_display.getText();
       if(s.startsWith("0"))
        jTextField_display.setText("7");
         else
        jTextField_display.setText(s+"7");
    }                                         

    private void jButton_0ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         String s=jTextField_display.getText();
         if(s.startsWith("0"))
        jTextField_display.setText("0");
         else
        jTextField_display.setText(s+"0");
    }                                         

    private void jButton_dividerActionPerformed(java.awt.event.ActionEvent evt) {                                                
        num1=Double.parseDouble(jTextField_display.getText());
        jTextField_display.setText("");
        operator="/";
    }                                               

    private void jButton_plusActionPerformed(java.awt.event.ActionEvent evt) {                                             
        num1=Double.parseDouble(jTextField_display.getText());
        jTextField_display.setText("");
        operator="+";
    }                                            

    private void jButton_equalActionPerformed(java.awt.event.ActionEvent evt) {                                              
        num2=Double.parseDouble(jTextField_display.getText());
        switch(operator)
        {
            case"+" -> {
                res=num1+num2;
                ans=String.format("%.0f",res);
                jTextField_display.setText(ans);
                break;
                
        }
            
             case"-" -> {
                 res=num1-num2;
                 ans=String.format("%.0f",res);
                 jTextField_display.setText(ans);
                 break;
        }
            
             case"*" -> {
                 res=num1*num2;
                 ans=String.format("%.0f",res);
                 jTextField_display.setText(ans);
                 break;
        }
             case"/" -> {
                 res=num1/num2;
                 ans=String.format("%.0f",res);
                 jTextField_display.setText(ans);
                 break;
        }
            
            
        }
    }                                             

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {                                              
        jTextField_display.setText("");
    }                                             

    private void jTextField_displayActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
    }                                                  

    
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton_0;
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_8;
    private javax.swing.JButton jButton_9;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_divider;
    private javax.swing.JButton jButton_equal;
    private javax.swing.JButton jButton_minus;
    private javax.swing.JButton jButton_multiply;
    private javax.swing.JButton jButton_plus;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_display;
    // End of variables declaration                   

    private static class jTextFiled_display {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        public jTextFiled_display() {
        }
    }
}
