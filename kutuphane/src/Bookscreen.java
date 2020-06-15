
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Bookscreen extends javax.swing.JFrame {

    public Bookscreen() throws SQLException, ClassNotFoundException {
        initComponents();
        Showbooks();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jButton1.setText("Duzenle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Kitap Adi");

        jLabel2.setText("Tur");

        jLabel3.setText("Yazar");

        jLabel4.setText("Sayfa Sayisi");

        jLabel5.setText("Kitap Puani");

        jButton2.setText("Yeni Kitap");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SIL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Kullaniciyi Sil");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addComponent(jTextField1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       
        try {
            Tablokaydet();
        } catch (SQLException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Showbooks();
        } catch (SQLException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed


    }//GEN-LAST:event_jTextField1ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
    }//GEN-LAST:event_table1MouseClicked

    private void table1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MousePressed
 
    try {
        for(int a=0;5>a;a++){
        String tablogelen =table1.getValueAt(table1.getSelectedRow(),a).toString();
        
        if(a==1){jTextField1.setText(tablogelen);}
        if(a==2){jTextField2.setText(tablogelen);}
        if(a==3){jTextField3.setText(tablogelen);}
        if(a==4){jTextField4.setText(tablogelen);}
        if(a==0){jTextField5.setText(tablogelen);}
        }
        } catch (Exception e) {
            System.out.println("250");
        }       
    }//GEN-LAST:event_table1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Yenitablo();
        } catch (SQLException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Showbooks();
        } catch (SQLException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Screen screen=new Screen();
screen.setVisible(true);
setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Sil();
        } catch (SQLException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Showbooks();
        } catch (SQLException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        
        if(JOptionPane.showConfirmDialog(null, "kullanici silinsinmi?", "!!!DIKKAT!!!",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        
        try {
            Kullanicisil();
        } catch (SQLException ex) {
            Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) throws SQLException, ClassNotFoundException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bookscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Bookscreen().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Bookscreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    int Rowcount() throws SQLException {
        String kullanici = Screen.kullaniciadi;
        int bb = 0;
        String sorgu = "select*from kitaplar";

        Connection connectt = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane", "root", "12345678");
        Statement statementt = connectt.createStatement();
        ResultSet rs = statementt.executeQuery(sorgu);

        while (rs.next()) {
            String a = rs.getString("kullanici");

            if (a.equalsIgnoreCase(kullanici)) {
                bb++;
            }
        }
        return bb;

    }

    public void Showbooks() throws SQLException, ClassNotFoundException {
        String kullanici = Screen.kullaniciadi;

        String baslik[] = new String[]{"Kitap Puani","Kitap Adı", "Tür", "Yazar", "Sayfa Sayısı",};

        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane", "root", "12345678");
        String sorgu = "select*from kitaplar";
        Statement statement = connect.createStatement();
        ResultSet rs = statement.executeQuery(sorgu);

        int i = 0;

        Object data[][] = new Object[Rowcount()][];
        while (rs.next()) {
            String a = rs.getString("kullanici");

            if (a.equalsIgnoreCase(kullanici)) {

                data[i] = new Object[]{
                    rs.getString("kitappuan"),
                    rs.getString("kitapadi"),
                    rs.getString("tur"),
                    rs.getString("yazar"),
                    rs.getString("sayfasayisi")
                };

                i++;
            }
        }

        connect.close();
        table1.setModel(new DefaultTableModel(data, baslik));
        
       
    }
        void Yenitablo() throws SQLException{
        String sorgu = "select*from kitaplar";
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane","root","12345678");
        Statement statement=connect.createStatement();
        ResultSet rs = statement.executeQuery(sorgu);
        String kullanici = Screen.kullaniciadi;
        
        String kitappuan=jTextField5.getText();
        String kitapadi=jTextField1.getText();
        String tur=jTextField2.getText();
        String yazar=jTextField3.getText();
        String sayfasayisi=jTextField4.getText();
        int kitapid=0;
        while(rs.next()){kitapid=rs.getInt("id")+1;}
        
            
        
        
        String stmt="insert into kitaplar(id,kitappuan,kitapadi,tur,yazar,sayfasayisi,kullanici)VALUES ("+
                "'"+kitapid+"',"+
                "'"+kitappuan+"',"+
                "'"+kitapadi+"',"+
                "'"+tur+"',"+
                "'"+yazar+"',"+
                "'"+sayfasayisi+"',"+
                "'"+kullanici+"'"+
                ")";
            statement.executeUpdate(stmt);
            connect.close();
    }
        void Tablokaydet() throws SQLException{
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane","root","12345678");
        Statement statement=connect.createStatement();
        String ojkitapadi = null;
        String kitappuan=jTextField5.getText();
        String kitapadi=jTextField1.getText();
        String tur=jTextField2.getText();
        String yazar=jTextField3.getText();
        String sayfasayisi=jTextField4.getText();
            try {
                ojkitapadi =table1.getValueAt(table1.getSelectedRow(),1).toString();
            } catch (Exception e) {
            ojkitapadi=kitapadi;
            }
        String stmt="UPDATE `kutuphane`.`kitaplar` SET "+
                "`kitappuan` = "+"'"+kitappuan+"',"+
                "`kitapadi` = "+"'"+kitapadi+"',"+
                "`tur` = "+"'"+tur+"',"+
                "`yazar` = "+"'"+yazar+"',"+
                "`sayfasayisi` = "+"'"+sayfasayisi+"'"+
                "WHERE (`kitapadi` = '"+ojkitapadi+"')";
            statement.executeUpdate(stmt);
            connect.close();
            
    }
        void Sil() throws SQLException{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane","root","12345678");
            Statement statement=connect.createStatement();
            String sorgu = "select*from kitaplar";
            ResultSet rs = statement.executeQuery(sorgu);
            String ojkitapadi = null;
            String kitapadi=jTextField1.getText();
            int a=0;
            String kullanici = Screen.kullaniciadi;
            
            try {
                ojkitapadi =table1.getValueAt(table1.getSelectedRow(),1).toString();
            } catch (Exception e) {
            ojkitapadi=kitapadi;
            }
            while(rs.next()){
                
                
                if(kitapadi.equalsIgnoreCase(rs.getString("kitapadi"))){
                if(kullanici.equalsIgnoreCase(rs.getString("kullanici")))
                {   
                    a=rs.getInt("id");
                    
                }}
            }
        
        String stmt="DELETE FROM `kutuphane`.`kitaplar` WHERE (`id` = '"+a+"')";
        statement.executeUpdate(stmt);
        connect.close();
            
        }
        static void Kullanicisil() throws SQLException{
            
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane","root","12345678");
        Statement statement=connect.createStatement();
        String stmt="DELETE FROM `kutuphane`.`users` WHERE (`name` = '"+Screen.kullaniciadi+"')";
        statement.executeUpdate(stmt);
        connect.close();
            
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
