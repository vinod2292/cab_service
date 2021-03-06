package admin;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author reena
 */
public class Map extends javax.swing.JFrame {
    Landmark Landmarks[];
    int num_of_landmarks;
    /**
     * Creates new form Map
     */
    public Map() {
        initComponents();
        Landmarks = new Landmark[40];
        num_of_landmarks=0;
        groupButton();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        add_landmark = new javax.swing.JRadioButton();
        add_road = new javax.swing.JRadioButton();
        delete = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        buttonGroup1.add(add_landmark);
        add_landmark.setText("Add Landmark");
        add_landmark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_landmarkMouseClicked(evt);
            }
        });
        add_landmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_landmarkActionPerformed(evt);
            }
        });

        buttonGroup1.add(add_road);
        add_road.setText("Add Road");
        add_road.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_roadActionPerformed(evt);
            }
        });

        delete.setText("Delete Landmark");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete)
                    .addComponent(add_road)
                    .addComponent(add_landmark))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_landmark)
                .addGap(18, 18, 18)
                .addComponent(add_road)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void groupButton( ) {

ButtonGroup bg1 = new ButtonGroup( );

bg1.add(add_landmark);
bg1.add(add_road);
bg1.add(delete);

}
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        if(delete.isSelected()){
            String Landmark="";
            Landmark=JOptionPane.showInputDialog("Delete Landmark");
        Graphics2D g = (Graphics2D) jPanel1.getGraphics();
       g.setColor(Color.getHSBColor(255, 255, 204));
        int from = index(Landmark);
        g.fillOval(Landmarks[from].x-10, Landmarks[from].y-10, 20, 20);
        
        
       
            
        }
        if(add_landmark.isSelected()){
            String Landmark="";
            Landmark=JOptionPane.showInputDialog("Add Landmark");
        Graphics2D g = (Graphics2D) jPanel1.getGraphics();
       g.setColor(Color.red);
        g.fillOval(evt.getX()-10, evt.getY()-10, 20, 20);
        
        g.drawString(Landmark, evt.getX(),evt.getY()-20);
        
        // initialise landmark array 
        
        Landmarks [num_of_landmarks]= new Landmark();
        Landmarks[num_of_landmarks].x = evt.getX();
        Landmarks[num_of_landmarks].y = evt.getY();
        Landmarks[num_of_landmarks].Landmark = Landmark;
        
        num_of_landmarks++;
        
        }
        if(add_road.isSelected()){
            Graphics2D g = (Graphics2D) jPanel1.getGraphics();
            g.drawLine(WIDTH, WIDTH, WIDTH, WIDTH);
            
        }
    }//GEN-LAST:event_jPanel1MousePressed

    //function to find index of landmarks
    int index (String Landmark){
        
        for(int i=0; i<num_of_landmarks; i++){
            if(Landmarks [i].Landmark.equals(Landmark))
                return i;
            
        } return 0;
    }
    
    private void add_landmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_landmarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_landmarkActionPerformed

    private void add_landmarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_landmarkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_add_landmarkMouseClicked

    private void add_roadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_roadActionPerformed
        // TODO add your handling code here:
        String from_mark="";
        String to_mark="";
        double distance=0.0;
        if(add_road.isSelected()){
            from_mark=JOptionPane.showInputDialog("From Landmark");
            to_mark=JOptionPane.showInputDialog("To Landmark");
            distance=Double.parseDouble(JOptionPane.showInputDialog("Enter Distance"));
            Graphics2D g = (Graphics2D) jPanel1.getGraphics();
            int from = index(from_mark);
            int to = index(to_mark);
            g.drawLine(Landmarks[from].x, Landmarks[from].y, Landmarks[to].x, Landmarks[to].y);
            
        }
        
      
    }//GEN-LAST:event_add_roadActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_deleteActionPerformed

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_deleteMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Map().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton add_landmark;
    private javax.swing.JRadioButton add_road;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton delete;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
