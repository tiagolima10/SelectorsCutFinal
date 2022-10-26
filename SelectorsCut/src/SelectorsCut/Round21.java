/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectorsCut;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;


public class Round21 extends javax.swing.JFrame {
   
    /**
     * Creates new form Imagem
     */
      public void ExportarArray (MainInf mi){
        exp0.setText(mi.getA());
        exp1.setText(mi.getB());
    exp2.setText(mi.getC());
     exp3.setText(mi.getD());  
       exp4.setText(mi.getE());
        exp5.setText(mi.getF());
    exp6.setText(mi.getG());   
    
    }
      public void ExportarArray2 (MainInf2 mi2){
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
    public Round21() {
     
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
          ImageIcon img0 = new ImageIcon(getClass().getResource("Aladdin.JPG"));
         ImageIcon img1 = new ImageIcon(getClass().getResource("Carros.jpg"));
        ImageIcon img2 = new ImageIcon(getClass().getResource("Divertidamente.jpg"));
             ImageIcon img3 = new ImageIcon(getClass().getResource("GatoBotas.jpg"));
              ImageIcon img4 = new ImageIcon(getClass().getResource("MMV.JPG"));
         ImageIcon img5 = new ImageIcon(getClass().getResource("Madacascar.jpg"));
        ImageIcon img6 = new ImageIcon(getClass().getResource("MonsterSA.JPG"));
             ImageIcon img7 = new ImageIcon(getClass().getResource("Nemo.jpg"));
              ImageIcon img8 = new ImageIcon(getClass().getResource("OsIncriveis.jpg"));
         ImageIcon img9 = new ImageIcon(getClass().getResource("ReiLeao.jpg"));
        ImageIcon img10 = new ImageIcon(getClass().getResource("Rio.JPG"));
             ImageIcon img11 = new ImageIcon(getClass().getResource("Shrek.JPG"));
              ImageIcon img12 = new ImageIcon(getClass().getResource("ToyStory.JPG"));
         ImageIcon img13 = new ImageIcon(getClass().getResource("Up.jpg"));
        ImageIcon img14 = new ImageIcon(getClass().getResource("Wall.JPG"));
             ImageIcon img15 = new ImageIcon(getClass().getResource("kungfu.jpg"));
           ImageIcon vs = new ImageIcon(getClass().getResource("vs.png"));
           versus.setIcon(vs);
             for (int z = 0; z < 4; z++) { 
                if (numeros[z] == "17"){
                 if (jn == 1){
                     janela1.setIcon(img0);
                     titulo1.setText("Aladdin");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img0);
                 titulo2.setText("Aladdin");
                }
                }
                 if (numeros[z] == "18"){
                 if (jn == 1){
                     janela1.setIcon(img1);
                     titulo1.setText("Carros 2");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img1);
                 titulo2.setText("Carros 2");
                }
                }
                  if (numeros[z] == "19"){
                 if (jn == 1){
                     janela1.setIcon(img2);
                     titulo1.setText("Divertidamente");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img2);
                 titulo2.setText("Divertidamente");
                }
                }
                   if (numeros[z] == "20"){
                 if (jn == 1){
                     janela1.setIcon(img3);
                     titulo1.setText("GatoBotas");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img3);
                 titulo2.setText("GatoBotas");
                }
                }
                 if (numeros[z] == "21"){
                 if (jn == 1){
                     janela1.setIcon(img4);
                     titulo1.setText("Malvado Favorito");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img4);
                 titulo2.setText("Malvado Favorito");
                }
                }
                   if (numeros[z] == "22"){
                 if (jn == 1){
                     janela1.setIcon(img5);
                     titulo1.setText("Madagascar");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img5);
                 titulo2.setText("Madagascar");
                }
                }
                 if (numeros[z] == "23"){
                 if (jn == 1){
                     janela1.setIcon(img6);
                     titulo1.setText("Monster S.A.");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img6);
                 titulo2.setText("Monster S.A.");
                }
                }
                 if (numeros[z] == "24"){
                 if (jn == 1){
                     janela1.setIcon(img7);
                     titulo1.setText("Nemo");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img7);
                 titulo2.setText("Nemo");
                }
                }
              if (numeros[z] == "25"){
                 if (jn == 1){
                     janela1.setIcon(img8);
                     titulo1.setText("Os Incríveis");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img8);
                 titulo2.setText("Os Incríveis");
                }
                }
                  if (numeros[z] == "26"){
                 if (jn == 1){
                     janela1.setIcon(img9);
                     titulo1.setText("Rei Leão");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img9);
                 titulo2.setText("Rei Leão");
                }
                }
                  if (numeros[z] == "27"){
                 if (jn == 1){
                     janela1.setIcon(img10);
                     titulo1.setText("Rio");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img10);
                 titulo2.setText("Rio");
                }
                }
                  if (numeros[z] == "28"){
                 if (jn == 1){
                     janela1.setIcon(img11);
                     titulo1.setText("Shrek");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img11);
                 titulo2.setText("Shrek");
                }
                }
                 if (numeros[z] == "29"){
                 if (jn == 1){
                     janela1.setIcon(img12);
                     titulo1.setText("Toy Story 3");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img12);
                 titulo2.setText("Toy Story 3");
                }
                }
                  if (numeros[z] == "30"){
                 if (jn == 1){
                     janela1.setIcon(img13);
                     titulo1.setText("Up");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img13);
                 titulo2.setText("Up");
                }
                }
                   if (numeros[z] == "31"){
                 if (jn == 1){
                     janela1.setIcon(img14);
                     titulo1.setText("Wall-E");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img14);
                 titulo2.setText("Wall-E");
                }
                }
                  if (numeros[z] == "32"){
                 if (jn == 1){
                     janela1.setIcon(img15);
                     titulo1.setText("Kung Fu Panda");
                     jn = 2;
                 } 
                 if (jn == 2) {
                 janela2.setIcon(img15);
                 titulo2.setText("Kung Fu Panda");
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

        janela2 = new javax.swing.JButton();
        janela1 = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        versus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selector´s Cut");

        janela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janela2ActionPerformed(evt);
            }
        });

        janela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janela1ActionPerformed(evt);
            }
        });

        titulo1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 102, 102));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setBorder(new javax.swing.border.MatteBorder(null));

        titulo2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 102, 102));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Round 1/4");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filmes de Animação");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(janela1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exp4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exp6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exp3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exp5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addComponent(janela2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(exp0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(exp1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exp2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exp15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exp10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(exp9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(exp14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exp8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exp7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exp13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exp12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exp11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(versus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(janela1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(janela2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exp5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exp6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exp3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exp4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87)
                        .addComponent(versus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(exp0, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(exp12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(exp2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(exp8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void janela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janela2ActionPerformed
     
       String[] aqui = new String[16];
       
       aqui[0] = exp0.getText();
        aqui[1] =exp1.getText();
         aqui[2] = exp2.getText();
          aqui[3] = exp3.getText();
          aqui[4] =exp4.getText();
        aqui[5] = exp5.getText();
         aqui[6] = exp6.getText();
          aqui[7] = exp7.getText();
          aqui[8] = exp8.getText();
        aqui[9] = exp9.getText();
         aqui[10] =exp10.getText();
          aqui[11] = exp11.getText();
          aqui[12] = exp12.getText();
        aqui[13] = exp13.getText();
         aqui[14] = exp14.getText();
          aqui[15] = exp15.getText();
            
           for (int z = 2; z < 4; z++) {  
                if (aqui[z] == "17"){
                aqui[2] = "33";
                    
                }
                 if (aqui[z] == "18"){
               
                 aqui[2]="34";    
                     
                }
                  if (aqui[z] == "19"){
              
                    aqui[2] = "35";  
                      
                }
                   if (aqui[z] == "20"){
               
                       aqui[2] = "36";  
                       
                }
                   if (aqui[z] == "21"){
                aqui[2] = "37";
                    
                }
                 if (aqui[z] == "22"){
               
                 aqui[2] = "38";    
                     
                }
                  if (aqui[z] == "23"){
              
                    aqui[2] = "39";  
                      
                }
                   if (aqui[z] == "24"){
               
                       aqui[2] = "40";  
                       
                }
                   if (aqui[z] == "25"){
                aqui[2] = "41";
                    
                }
                 if (aqui[z] == "26"){
               
                 aqui[2] = "42";    
                     
                }
                  if (aqui[z] == "27"){
              
                    aqui[2] = "43";  
                      
                }
                   if (aqui[z] == "28"){
               
                       aqui[2] = "44";  
                       
                }
                   if (aqui[z] == "29"){
                aqui[2] = "45";
                    
                }
                 if (aqui[z] == "30"){
               
                 aqui[2] = "46";    
                     
                }
                  if (aqui[z] == "31"){
              
                    aqui[2] = "47";  
                      
                }
                   if (aqui[z] == "32"){
               
                       aqui[2] = "48";  
                       
                }
                    
                    
                   
                } 
             MainInf mi = new MainInf();
          
         String a;
             a = aqui[0];
               String b;
             b = aqui[1];
               String c;
             c = aqui[2];
               String d;
             d = aqui[3];
               String e;
             e = aqui[4];
               String f;
             f = aqui[5];
               String g;
             g = aqui[6];
               String h;
             h = aqui[7];
               String i;
             i = aqui[8];
               String j;
             j = aqui[9];
               String k;
             k = aqui[10];
               String l;
             l = aqui[11];
               String m;
             m = aqui[12];
               String n;
             n = aqui[13];
               String o;
             o = aqui[14];
              String p;
             p = aqui[15];
               
              exp0.setText(a);
              exp1.setText(b);
              exp2.setText(c);
              exp3.setText(d);
              exp4.setText(e);
              exp5.setText(f);
              exp6.setText(g);
              exp7.setText(h);
              exp8.setText(i);
              exp9.setText(j);
              exp10.setText(k);
              exp11.setText(l);
              exp12.setText(m);
              exp13.setText(n);
              exp14.setText(o);
              exp15.setText(p);
             
             
             
             
             
             
            MainInf2 mi2 = new MainInf2();   
       mi.setA(exp0.getText());
          System.out.println("");
          mi.setB(exp1.getText());
          System.out.println("");
          mi.setC(exp2.getText());
          System.out.println("");
         mi.setD(exp3.getText());
         System.out.println("");
         mi.setE(exp4.getText());
         System.out.println("");
              mi.setF(exp5.getText());
              System.out.println("");
          mi.setG(exp6.getText());
          System.out.println("");
          mi2.setH(exp7.getText());
          System.out.println("");
         mi2.setI(exp8.getText());
         System.out.println("");
         mi2.setJ(exp9.getText());
         System.out.println("");
      mi2.setK(exp10.getText());
        System.out.println("");
          mi2.setL(exp11.getText());
          System.out.println("");
          mi2.setM(exp12.getText());
          System.out.println("");
         mi2.setN(exp13.getText());
         System.out.println("");
         mi2.setO(exp14.getText());
         System.out.println("");
       mi2.setP(exp15.getText());     
        System.out.println("");
          
                       Vencedor21 v = new Vencedor21();
                  v.ExportarArray(mi);
              v.ExportarArray2(mi2);
             
              v.setVisible(true);
             
       dispose();  
             
      
    }//GEN-LAST:event_janela2ActionPerformed

    private void janela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janela1ActionPerformed
        
      String[] aqui = new String[16];
       
       aqui[0] = exp0.getText();
        aqui[1] =exp1.getText();
         aqui[2] = exp2.getText();
          aqui[3] = exp3.getText();
          aqui[4] =exp4.getText();
        aqui[5] = exp5.getText();
         aqui[6] = exp6.getText();
          aqui[7] = exp7.getText();
          aqui[8] = exp8.getText();
        aqui[9] = exp9.getText();
         aqui[10] =exp10.getText();
          aqui[11] = exp11.getText();
          aqui[12] = exp12.getText();
        aqui[13] = exp13.getText();
         aqui[14] = exp14.getText();
          aqui[15] = exp15.getText();
      for (int z = 0; z < 2; z++) {  
                if (aqui[z] == "17"){
                aqui[1] = "33";
                    
                }
                 if (aqui[z] == "18"){
               
                 aqui[1]="34";    
                     
                }
                  if (aqui[z] == "19"){
              
                    aqui[1] = "35";  
                      
                }
                   if (aqui[z] == "20"){
               
                       aqui[1] = "36";  
                       
                }
                   if (aqui[z] == "21"){
                aqui[1] = "37";
                    
                }
                 if (aqui[z] == "22"){
               
                 aqui[1] = "38";    
                     
                }
                  if (aqui[z] == "23"){
              
                    aqui[1] = "39";  
                      
                }
                   if (aqui[z] == "24"){
               
                       aqui[1] = "40";  
                       
                }
                   if (aqui[z] == "25"){
                aqui[1] = "41";
                    
                }
                 if (aqui[z] == "26"){
               
                 aqui[1] = "42";    
                     
                }
                  if (aqui[z] == "27"){
              
                    aqui[1] = "43";  
                      
                }
                   if (aqui[z] == "28"){
               
                       aqui[1] = "44";  
                       
                }
                   if (aqui[z] == "29"){
                aqui[1] = "45";
                    
                }
                 if (aqui[z] == "30"){
               
                 aqui[1] = "46";    
                     
                }
                  if (aqui[z] == "31"){
              
                    aqui[1] = "47";  
                      
                }
                   if (aqui[z] == "32"){
               
                       aqui[1] = "48";  
                       
                }
                    
                    
                   
                } 
             MainInf mi = new MainInf();
          
           String a;
             a = aqui[0];
               String b;
             b = aqui[1];
               String c;
             c = aqui[2];
               String d;
             d = aqui[3];
               String e;
             e = aqui[4];
               String f;
             f = aqui[5];
               String g;
             g = aqui[6];
               String h;
             h = aqui[7];
               String i;
             i = aqui[8];
               String j;
             j = aqui[9];
               String k;
             k = aqui[10];
               String l;
             l = aqui[11];
               String m;
             m = aqui[12];
               String n;
             n = aqui[13];
               String o;
             o = aqui[14];
              String p;
             p = aqui[15];
               
              exp0.setText(a);
              exp1.setText(b);
              exp2.setText(c);
              exp3.setText(d);
              exp4.setText(e);
              exp5.setText(f);
              exp6.setText(g);
              exp7.setText(h);
              exp8.setText(i);
              exp9.setText(j);
              exp10.setText(k);
              exp11.setText(l);
              exp12.setText(m);
              exp13.setText(n);
              exp14.setText(o);
              exp15.setText(p);
             
             
             
             
             
             
          MainInf2 mi2 = new MainInf2();   
       mi.setA(exp0.getText());
          System.out.println("");
          mi.setB(exp1.getText());
          System.out.println("");
          mi.setC(exp2.getText());
          System.out.println("");
         mi.setD(exp3.getText());
         System.out.println("");
         mi.setE(exp4.getText());
         System.out.println("");
              mi.setF(exp5.getText());
              System.out.println("");
          mi.setG(exp6.getText());
          System.out.println("");
          mi2.setH(exp7.getText());
          System.out.println("");
         mi2.setI(exp8.getText());
         System.out.println("");
         mi2.setJ(exp9.getText());
         System.out.println("");
      mi2.setK(exp10.getText());
        System.out.println("");
          mi2.setL(exp11.getText());
          System.out.println("");
          mi2.setM(exp12.getText());
          System.out.println("");
         mi2.setN(exp13.getText());
         System.out.println("");
         mi2.setO(exp14.getText());
         System.out.println("");
       mi2.setP(exp15.getText());     
        System.out.println("");
      
          
                       Vencedor21 v = new Vencedor21();
                  v.ExportarArray(mi);
              v.ExportarArray2(mi2);
             
              v.setVisible(true);
             
       dispose();  
             
    }//GEN-LAST:event_janela1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            public void run() {
                
                new Round21().setVisible(true);
                
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton janela1;
    private javax.swing.JButton janela2;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel versus;
    // End of variables declaration//GEN-END:variables

   

  

    }

