package baseconverterproject;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MainContentPanel extends javax.swing.JPanel {
    
    private MainFrame mainFrame;
    private String input;
    private int fromBase;
    private int toBase;
    public final BaseConverter baseConverter;

    public MainContentPanel(MainFrame mainFrame, BaseConverter bc) {
        this.mainFrame = mainFrame;
        this.baseConverter = bc;

        initComponents();
        this.setMinimumSize(new Dimension(644, 374));
        initializeBases();
    }
    // #########################################################################    
    // CODE
    // #########################################################################
    
    // initialize values for combo boxes
    private void initializeBases() {
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 2; i < 37; i++) {
            String str = i + " ";
            switch (i) {
                case 2 -> str += "(binary)";
                case 8 -> str += "(octal)";
                case 16 -> str += "(hexadecimal)";
                case 10 -> str += "(decimal)";
            }
            stringList.add(str);
        }

        DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(stringList.toArray(String[]::new));
        DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(stringList.toArray(String[]::new));

        cmbFromBase.setModel(model1);
        cmbToBase.setModel(model2);
        cmbFromBase.setSelectedIndex(0);
        cmbToBase.setSelectedIndex(0);
        txtNumber.setText("0");
        txtConverted.setText("0");

    }
    
    public void setFromBase(int base) {
        this.fromBase = base;
    }

    public void setToBase(int base) {
        this.toBase = base;
    }


    private int getBaseInt(String baseStr) {
        int base = 0;
        baseStr = baseStr.split(" ")[0].strip();
        base = Integer.parseInt(baseStr);
        return base;
    }

    private boolean isNumeric(String str) {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void showErrorDialog(String message, String title) {
        JOptionPane.showMessageDialog(
                this,
                message,
                title,
                JOptionPane.ERROR_MESSAGE
        );
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainContent = new javax.swing.JPanel();
        buttonsPane = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnConvert = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnSwap = new javax.swing.JButton();
        inputPane = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNumber = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cmbFromBase = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        cmbToBase = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtConverted = new javax.swing.JTextField();

        setBackground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(644, 374));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        mainContent.setBackground(new java.awt.Color(128, 213, 200));
        mainContent.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 1, 1), 2, true), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        mainContent.setLayout(new java.awt.BorderLayout());

        buttonsPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        buttonsPane.setMinimumSize(new java.awt.Dimension(616, 60));
        buttonsPane.setOpaque(false);
        buttonsPane.setPreferredSize(new java.awt.Dimension(616, 60));
        buttonsPane.setLayout(new java.awt.GridLayout(1, 3, 20, 0));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        btnConvert.setBackground(new java.awt.Color(231, 187, 65));
        btnConvert.setFont(new java.awt.Font("Lexend SemiBold", 0, 18)); // NOI18N
        btnConvert.setForeground(new java.awt.Color(13, 13, 13));
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });
        jPanel3.add(btnConvert, java.awt.BorderLayout.CENTER);

        buttonsPane.add(jPanel3);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        btnReset.setBackground(new java.awt.Color(178, 190, 181));
        btnReset.setFont(new java.awt.Font("Lexend SemiBold", 0, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(13, 13, 13));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, java.awt.BorderLayout.CENTER);

        buttonsPane.add(jPanel2);

        jPanel11.setBackground(java.awt.Color.white);
        jPanel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        btnSwap.setBackground(new java.awt.Color(178, 190, 181));
        btnSwap.setFont(new java.awt.Font("Lexend SemiBold", 0, 18)); // NOI18N
        btnSwap.setForeground(new java.awt.Color(13, 13, 13));
        btnSwap.setText("Swap");
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });
        jPanel11.add(btnSwap, java.awt.BorderLayout.CENTER);

        buttonsPane.add(jPanel11);

        mainContent.add(buttonsPane, java.awt.BorderLayout.PAGE_END);

        inputPane.setBackground(new java.awt.Color(248, 244, 255));
        inputPane.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray), javax.swing.BorderFactory.createEmptyBorder(20, 30, 20, 30)));
        inputPane.setAutoscrolls(true);
        inputPane.setMaximumSize(new java.awt.Dimension(1000, 1000));
        inputPane.setMinimumSize(new java.awt.Dimension(620, 290));
        inputPane.setPreferredSize(new java.awt.Dimension(620, 290));
        inputPane.setLayout(new java.awt.GridLayout(4, 2, 10, 5));

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Lexend Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 31, 13));
        jLabel1.setText("Enter a number:");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        inputPane.add(jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jPanel4.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel4.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        txtNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtNumber.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        txtNumber.setForeground(new java.awt.Color(13, 13, 13));
        txtNumber.setText("0");
        txtNumber.setMaximumSize(new java.awt.Dimension(1000, 50));
        txtNumber.setMinimumSize(new java.awt.Dimension(250, 50));
        txtNumber.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel4.add(txtNumber);

        inputPane.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jPanel5.setMaximumSize(new java.awt.Dimension(500, 50));
        jPanel5.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Lexend Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 31, 13));
        jLabel2.setText("Convert Base From:");
        jPanel5.add(jLabel2, java.awt.BorderLayout.CENTER);

        inputPane.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jPanel6.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel6.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        cmbFromBase.setBackground(new java.awt.Color(248, 244, 255));
        cmbFromBase.setForeground(java.awt.Color.black);
        cmbFromBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "8", "16" }));
        cmbFromBase.setMaximumSize(new java.awt.Dimension(1000, 50));
        cmbFromBase.setMinimumSize(new java.awt.Dimension(250, 50));
        cmbFromBase.setOpaque(true);
        cmbFromBase.setPreferredSize(new java.awt.Dimension(250, 50));
        cmbFromBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFromBaseActionPerformed(evt);
            }
        });
        jPanel6.add(cmbFromBase);

        inputPane.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jPanel7.setMaximumSize(new java.awt.Dimension(500, 50));
        jPanel7.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Lexend Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 31, 13));
        jLabel3.setText("Convert Base To:");
        jPanel7.add(jLabel3, java.awt.BorderLayout.CENTER);

        inputPane.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jPanel8.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel8.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        cmbToBase.setBackground(new java.awt.Color(248, 244, 255));
        cmbToBase.setForeground(java.awt.Color.black);
        cmbToBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "8", "16" }));
        cmbToBase.setMaximumSize(new java.awt.Dimension(1000, 50));
        cmbToBase.setMinimumSize(new java.awt.Dimension(250, 50));
        cmbToBase.setPreferredSize(new java.awt.Dimension(250, 50));
        cmbToBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbToBaseActionPerformed(evt);
            }
        });
        jPanel8.add(cmbToBase);

        inputPane.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jPanel9.setMaximumSize(new java.awt.Dimension(500, 50));
        jPanel9.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Lexend Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 31, 13));
        jLabel4.setText("Value Converted:");
        jPanel9.add(jLabel4, java.awt.BorderLayout.CENTER);

        inputPane.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jPanel10.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel10.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        txtConverted.setBackground(new java.awt.Color(255, 255, 255));
        txtConverted.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        txtConverted.setForeground(new java.awt.Color(13, 13, 13));
        txtConverted.setText("0");
        txtConverted.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        txtConverted.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtConverted.setEnabled(false);
        txtConverted.setMaximumSize(new java.awt.Dimension(1000, 50));
        txtConverted.setMinimumSize(new java.awt.Dimension(250, 50));
        txtConverted.setPreferredSize(new java.awt.Dimension(250, 50));
        txtConverted.setRequestFocusEnabled(false);
        jPanel10.add(txtConverted);

        inputPane.add(jPanel10);

        mainContent.add(inputPane, java.awt.BorderLayout.CENTER);

        add(mainContent, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapActionPerformed
        // TODO add your handling code here:
        int temp = cmbFromBase.getSelectedIndex();
        cmbFromBase.setSelectedIndex(cmbToBase.getSelectedIndex());
        cmbToBase.setSelectedIndex(temp);
    }//GEN-LAST:event_btnSwapActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        cmbFromBase.setSelectedIndex(0);
        cmbToBase.setSelectedIndex(0);
        txtNumber.setText("0");
        txtConverted.setText("0");
        mainFrame.btnWrapper.setVisible(false);
        baseConverter.clearMap();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        input = txtNumber.getText();
   
        try {
            baseConverter.clearMap();   
            String result = baseConverter.convertBase(input, fromBase, toBase);
            txtConverted.setText(result);
            if (!mainFrame.btnWrapper.isVisible() && !txtConverted.getText().isEmpty()) {
                mainFrame.btnWrapper.setVisible(true);
            }
        } catch (Exception e) {
            showErrorDialog(e.getMessage(), "Error while converting.");
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void cmbFromBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFromBaseActionPerformed
        String selectedBase = (String) cmbFromBase.getSelectedItem();
        int base = this.getBaseInt(selectedBase);
        this.setFromBase(base);
    }//GEN-LAST:event_cmbFromBaseActionPerformed

    private void cmbToBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbToBaseActionPerformed
        String selectedBase = (String) cmbToBase.getSelectedItem();
        int base = this.getBaseInt(selectedBase);
        this.setToBase(base);
    }//GEN-LAST:event_cmbToBaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSwap;
    private javax.swing.JPanel buttonsPane;
    private javax.swing.JComboBox<String> cmbFromBase;
    private javax.swing.JComboBox<String> cmbToBase;
    private javax.swing.JPanel inputPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel mainContent;
    public javax.swing.JTextField txtConverted;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
