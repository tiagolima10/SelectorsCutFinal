/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectorsCut;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Vencedor41S extends javax.swing.JFrame {
    public void ExportarArray (MainInfS mi){
        exp0.setText(mi.getA());
        exp1.setText(mi.getB());
    exp2.setText(mi.getC());
     exp3.setText(mi.getD());  
       exp4.setText(mi.getE());
        exp5.setText(mi.getF());
    exp6.setText(mi.getG());   
    
    }
      public void ExportarArray2 (MainInf2S mi2){
         exp7.setText(mi2.getH());     
       exp8.setText(mi2.getI());
        exp9.setText(mi2.getJ());
    exp10.setText(mi2.getK());
     exp11.setText(mi2.getL());    
       exp12.setText(mi2.getM());
        exp13.setText(mi2.getN());
    exp14.setText(mi2.getO());
     exp15.setText(mi2.getP());      
      }
    public Vencedor41S() {
     
        initComponents();
        getContentPane().setBackground(Color.darkGray);
         Thread t = new Thread (new Runnable() {
            @Override
            
            public void run() {
                
               
                       String [] numeros = new String[16];
       numeros[0] = exp0.getText();
        numeros[1] = exp1.getText();
         numeros[2] = exp2.getText();
          numeros[3] = exp3.getText();     
          numeros[4] = exp4.getText();
        numeros[5] =exp5.getText();
         numeros[6] = exp6.getText();
          numeros[7] =exp7.getText();
          numeros[8] = exp8.getText();
        numeros[9] = exp9.getText();
        numeros[10] = exp10.getText();
          numeros[11] = exp11.getText();
          numeros[12] = exp12.getText();
        numeros[13] = exp13.getText();
         numeros[14] = exp14.getText();
          numeros[15] = exp15.getText();
       
                
            
         
        
          int jn = 1;     
       ImageIcon img0 = new ImageIcon(getClass().getResource("GoT.jpg"));
        ImageIcon img1 = new ImageIcon(getClass().getResource("breakingbad.jpg"));
        ImageIcon img2 = new ImageIcon(getClass().getResource("euphoria.png"));
        ImageIcon img3 = new ImageIcon(getClass().getResource("flash.PNG"));
        ImageIcon img4 = new ImageIcon(getClass().getResource("friends.jpg"));
        ImageIcon img5 = new ImageIcon(getClass().getResource("lcpapel.jpg"));
        ImageIcon img6 = new ImageIcon(getClass().getResource("loki.png"));
        ImageIcon img7 = new ImageIcon(getClass().getResource("lucifer.PNG"));
        ImageIcon img8 = new ImageIcon(getClass().getResource("peakyb.jpg"));
        ImageIcon img9 = new ImageIcon(getClass().getResource("round6.jpg"));
        ImageIcon img10 = new ImageIcon(getClass().getResource("st.jpg"));
        ImageIcon img11 = new ImageIcon(getClass().getResource("suits.jpg"));
        ImageIcon img12 = new ImageIcon(getClass().getResource("supernatural.jpg"));
        ImageIcon img13 = new ImageIcon(getClass().getResource("theboys.PNG"));
        ImageIcon img14 = new ImageIcon(getClass().getResource("thewalkingdead.PNG"));
        ImageIcon img15 = new ImageIcon(getClass().getResource("vikings.jpg"));
         ImageIcon m = new ImageIcon(getClass().getResource("miozin.JPG"));
           melhor.setIcon(m);       
             for (int z = 0; z < 16; z++) { 
                if (numeros[z] == "65"){
                 if (jn == 1){
                     janela1.setIcon(img0);
                     titulo1.setText("GoT");
                     jn = 2;
                 } 
               
                }
                 if (numeros[z] == "66"){
                 if (jn == 1){
                     janela1.setIcon(img1);
                     titulo1.setText("Breaking Bad");
                     jn = 2;
                 } 
                
                }
                  if (numeros[z] == "67"){
                 if (jn == 1){
                     janela1.setIcon(img2);
                     titulo1.setText("Euphoria");
                     jn = 2;
                 } 
               
                }
                   if (numeros[z] == "68"){
                 if (jn == 1){
                     janela1.setIcon(img3);
                     titulo1.setText("The Flash");
                     jn = 2;
                 } 
                 
                }
                 if (numeros[z] == "69"){
                 if (jn == 1){
                     janela1.setIcon(img4);
                     titulo1.setText("Friends");
                     jn = 2;
                 } 
                
                }
                   if (numeros[z] == "70"){
                 if (jn == 1){
                     janela1.setIcon(img5);
                     titulo1.setText("Casa de Papel");
                     jn = 2;
                 } 
                
                }
                 if (numeros[z] == "71"){
                 if (jn == 1){
                     janela1.setIcon(img6);
                     titulo1.setText("Loki");
                     jn = 2;
                 } 
                
                }
                 if (numeros[z] == "72"){
                 if (jn == 1){
                     janela1.setIcon(img7);
                     titulo1.setText("Lucifer");
                     jn = 2;
                 } 
                
                }
              if (numeros[z] == "73"){
                 if (jn == 1){
                     janela1.setIcon(img8);
                     titulo1.setText("Peaky Blinders");
                     jn = 2;
                 } 
                
                }
                  if (numeros[z] == "74"){
                 if (jn == 1){
                     janela1.setIcon(img9);
                     titulo1.setText("Round 6");
                     jn = 2;
                 } 
                 
                }
                  if (numeros[z] == "75"){
                 if (jn == 1){
                     janela1.setIcon(img10);
                     titulo1.setText("Stranger Things");
                     jn = 2;
                 } 
                
                }
                  if (numeros[z] == "76"){
                 if (jn == 1){
                     janela1.setIcon(img11);
                     titulo1.setText("Suits");
                     jn = 2;
                 } 
                
                }
                 if (numeros[z] == "77"){
                 if (jn == 1){
                     janela1.setIcon(img12);
                     titulo1.setText("Supernatural");
                     jn = 2;
                 } 
                
                }
                  if (numeros[z] == "78"){
                 if (jn == 1){
                     janela1.setIcon(img13);
                     titulo1.setText("The Boys");
                     jn = 2;
                 } 
               
                }
                   if (numeros[z] == "79"){
                 if (jn == 1){
                     janela1.setIcon(img14);
                     titulo1.setText("Walking Dead");
                     jn = 2;
                 } 
                 
                }
                  if (numeros[z] == "80"){
                 if (jn == 1){
                     janela1.setIcon(img15);
                     titulo1.setText("Vikings");
                     jn = 2;
                 } 
                 
                }
                
                 
                    
                   
                } 
        
            }
         
        });
         t.start();       
    }
      
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        janela1 = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        exp3 = new javax.swing.JLabel();
        exp4 = new javax.swing.JLabel();
        exp5 = new javax.swing.JLabel();
        exp6 = new javax.swing.JLabel();
        exp7 = new javax.swing.JLabel();
        exp8 = new javax.swing.JLabel();
        exp9 = new javax.swing.JLabel();
        exp10 = new javax.swing.JLabel();
        exp11 = new javax.swing.JLabel();
        exp12 = new javax.swing.JLabel();
        exp13 = new javax.swing.JLabel();
        exp14 = new javax.swing.JLabel();
        exp15 = new javax.swing.JLabel();
        exp2 = new javax.swing.JLabel();
        exp1 = new javax.swing.JLabel();
        exp0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        melhor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selector´s Cut");

        janela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janela1ActionPerformed(evt);
            }
        });

        titulo1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 102, 102));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setBorder(new javax.swing.border.MatteBorder(null));

        exp3.setForeground(new java.awt.Color(64, 64, 64));

        exp4.setForeground(new java.awt.Color(64, 64, 64));

        exp5.setForeground(new java.awt.Color(64, 64, 64));

        exp6.setForeground(new java.awt.Color(64, 64, 64));

        exp7.setForeground(new java.awt.Color(64, 64, 64));

        exp8.setForeground(new java.awt.Color(64, 64, 64));

        exp9.setForeground(new java.awt.Color(64, 64, 64));

        exp10.setForeground(new java.awt.Color(64, 64, 64));

        exp11.setForeground(new java.awt.Color(64, 64, 64));

        exp12.setForeground(new java.awt.Color(64, 64, 64));

        exp13.setForeground(new java.awt.Color(64, 64, 64));

        exp14.setForeground(new java.awt.Color(64, 64, 64));

        exp15.setForeground(new java.awt.Color(64, 64, 64));

        exp2.setForeground(new java.awt.Color(64, 64, 64));

        exp1.setForeground(new java.awt.Color(64, 64, 64));

        exp0.setForeground(new java.awt.Color(64, 64, 64));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vencedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(exp11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exp7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exp12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exp14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exp15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exp2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addComponent(melhor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(janela1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exp3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(exp13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(exp4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(exp5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exp6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exp9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exp0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exp1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exp10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(exp8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(exp12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exp14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exp15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exp2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exp11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(106, 106, 106))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(exp7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(117, 117, 117)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(melhor, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(janela1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exp4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exp10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(exp5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exp9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exp6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exp1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exp8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exp0, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void janela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janela1ActionPerformed
    
    }//GEN-LAST:event_janela1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            public void run() {
                
                new Vencedor41S().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exp0;
    private javax.swing.JLabel exp1;
    private javax.swing.JLabel exp10;
    private javax.swing.JLabel exp11;
    private javax.swing.JLabel exp12;
    private javax.swing.JLabel exp13;
    private javax.swing.JLabel exp14;
    private javax.swing.JLabel exp15;
    private javax.swing.JLabel exp2;
    private javax.swing.JLabel exp3;
    private javax.swing.JLabel exp4;
    private javax.swing.JLabel exp5;
    private javax.swing.JLabel exp6;
    private javax.swing.JLabel exp7;
    private javax.swing.JLabel exp8;
    private javax.swing.JLabel exp9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton janela1;
    private javax.swing.JLabel melhor;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables

   

  

    }

