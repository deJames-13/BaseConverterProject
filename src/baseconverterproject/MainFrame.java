package baseconverterproject;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    private final BaseConverter baseConverter = new BaseConverter();
    private String input;
    private int fromBase;
    private int toBase;

    // #########################################################################    
    // COLORS
    // white            - 248, 244, 255                                         
    // night black      - 17, 17, 17                                            
    // keppel mint      - 58, 176, 158                                          
    // saffron gold     - 231, 187, 65                                           
    // ash gray         - 178, 190, 181
    // #########################################################################
    public MainFrame() {
        // #####################################################################
        // INITIALIZE ON START UP
        // #####################################################################  
        initComponents();
        initializeBases();
        // #####################################################################

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
                case 2:
                    str += "(binary)";
                    break;
                case 8:
                    str += "(octal)";
                    break;
                case 16:
                    str += "(hexadecimal)";
                    break;
                case 10:
                    str += "(decimal)";
                    break;
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

    private int getBaseInt(String baseStr) {
        int base = 0;
        baseStr = baseStr.split(" ")[0].strip();
        base = Integer.parseInt(baseStr);
        return base;
    }

    public void setFromBase(int base) {
        this.fromBase = base;
    }

    public void setToBase(int base) {
        this.toBase = base;
    }

    private boolean isNumeric(String str) {
        try {
            // Try parsing the string to a number
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            // If an exception is thrown, the string is not numeric
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

    // #########################################################################    
    // GENERATED CODE
    // #########################################################################    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainWindow = new javax.swing.JPanel();
        topWrapper = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        windowTitle = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        pillar = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtNumber = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        cmbFromBase = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        cmbToBase = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        txtConverted = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMaximizedBounds(new java.awt.Rectangle(300, 300, 800, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 410));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        mainWindow.setBackground(java.awt.Color.white);
        mainWindow.setForeground(new java.awt.Color(0, 0, 0));
        mainWindow.setMinimumSize(new java.awt.Dimension(800, 480));
        mainWindow.setLayout(new java.awt.BorderLayout());

        topWrapper.setBackground(new java.awt.Color(58, 176, 158));
        topWrapper.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(231, 187, 65)));
        topWrapper.setMinimumSize(new java.awt.Dimension(800, 80));
        topWrapper.setPreferredSize(new java.awt.Dimension(800, 70));
        topWrapper.setLayout(new javax.swing.BoxLayout(topWrapper, javax.swing.BoxLayout.LINE_AXIS));

        topPanel.setBackground(java.awt.Color.white);
        topPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        topPanel.setForeground(java.awt.Color.white);
        topPanel.setOpaque(false);
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        windowTitle.setFont(new java.awt.Font("Lexend ExtraBold", 0, 36)); // NOI18N
        windowTitle.setForeground(new java.awt.Color(248, 244, 255));
        windowTitle.setText("Base Converter");
        topPanel.add(windowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 50));

        topWrapper.add(topPanel);

        mainWindow.add(topWrapper, java.awt.BorderLayout.PAGE_START);

        mainPanel.setBackground(new java.awt.Color(204, 255, 204));
        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 20));
        mainPanel.setForeground(new java.awt.Color(248, 244, 255));
        mainPanel.setMinimumSize(new java.awt.Dimension(800, 410));
        mainPanel.setLayout(new java.awt.BorderLayout());

        pillar.setBackground(new java.awt.Color(231, 187, 65));
        pillar.setToolTipText("");
        pillar.setMinimumSize(new java.awt.Dimension(100, 410));

        javax.swing.GroupLayout pillarLayout = new javax.swing.GroupLayout(pillar);
        pillar.setLayout(pillarLayout);
        pillarLayout.setHorizontalGroup(
            pillarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pillarLayout.setVerticalGroup(
            pillarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        mainPanel.add(pillar, java.awt.BorderLayout.LINE_END);

        contentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 20, 20));
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new java.awt.BorderLayout());

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
        inputPane.setMaximumSize(new java.awt.Dimension(620, 290));
        inputPane.setMinimumSize(new java.awt.Dimension(620, 290));
        inputPane.setPreferredSize(new java.awt.Dimension(620, 290));
        inputPane.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setMaximumSize(new java.awt.Dimension(260, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Lexend Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 31, 13));
        jLabel1.setText("Enter a number:");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        inputPane.add(jPanel1, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setMaximumSize(new java.awt.Dimension(260, 50));
        jPanel4.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Lexend Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 31, 13));
        jLabel2.setText("Convert Base From:");
        jPanel4.add(jLabel2, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        inputPane.add(jPanel4, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel5.setMaximumSize(new java.awt.Dimension(260, 50));
        jPanel5.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Lexend Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 31, 13));
        jLabel3.setText("Convert Base To:");
        jPanel5.add(jLabel3, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        inputPane.add(jPanel5, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel6.setMaximumSize(new java.awt.Dimension(260, 50));
        jPanel6.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Lexend Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 31, 13));
        jLabel4.setText("Value Converted:");
        jPanel6.add(jLabel4, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        inputPane.add(jPanel6, gridBagConstraints);

        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 10));
        jPanel7.setMaximumSize(new java.awt.Dimension(260, 50));
        jPanel7.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel7.setLayout(new java.awt.BorderLayout());

        txtNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtNumber.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        txtNumber.setForeground(new java.awt.Color(13, 13, 13));
        txtNumber.setText("0");
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });
        jPanel7.add(txtNumber, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        inputPane.add(jPanel7, gridBagConstraints);

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 10));
        jPanel8.setMaximumSize(new java.awt.Dimension(260, 50));
        jPanel8.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel8.setLayout(new java.awt.BorderLayout());

        cmbFromBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "8", "16" }));
        cmbFromBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFromBaseActionPerformed(evt);
            }
        });
        jPanel8.add(cmbFromBase, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        inputPane.add(jPanel8, gridBagConstraints);

        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 10));
        jPanel9.setMaximumSize(new java.awt.Dimension(260, 50));
        jPanel9.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel9.setLayout(new java.awt.BorderLayout());

        cmbToBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "8", "16" }));
        cmbToBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbToBaseActionPerformed(evt);
            }
        });
        jPanel9.add(cmbToBase, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        inputPane.add(jPanel9, gridBagConstraints);

        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 10));
        jPanel10.setMaximumSize(new java.awt.Dimension(260, 50));
        jPanel10.setMinimumSize(new java.awt.Dimension(260, 50));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel10.setLayout(new java.awt.BorderLayout());

        txtConverted.setBackground(new java.awt.Color(255, 255, 255));
        txtConverted.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        txtConverted.setForeground(new java.awt.Color(13, 13, 13));
        txtConverted.setText("0");
        txtConverted.setFocusable(false);
        txtConverted.setRequestFocusEnabled(false);
        jPanel10.add(txtConverted, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        inputPane.add(jPanel10, gridBagConstraints);

        mainContent.add(inputPane, java.awt.BorderLayout.CENTER);

        contentPanel.add(mainContent, java.awt.BorderLayout.CENTER);

        mainPanel.add(contentPanel, java.awt.BorderLayout.CENTER);

        mainWindow.add(mainPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainWindow);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

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

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        String input = txtNumber.getText();
        if (!isNumeric(input)) {
            return;
        }

        try {

            String result = baseConverter.convertBase(input, fromBase, toBase);
            txtConverted.setText(result);
        } catch (Exception e) {
            showErrorDialog(e.getMessage(), "Error while converting.");
        }

    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        cmbFromBase.setSelectedIndex(0);
        cmbToBase.setSelectedIndex(0);
        txtNumber.setText("0");
        txtConverted.setText("0");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapActionPerformed
        // TODO add your handling code here:
        int temp = cmbFromBase.getSelectedIndex();
        cmbFromBase.setSelectedIndex(cmbToBase.getSelectedIndex());
        cmbToBase.setSelectedIndex(temp);
    }//GEN-LAST:event_btnSwapActionPerformed
    // #########################################################################    
    // EVENTS ^
    // #########################################################################    
    // MAIN FUNCTION / RUNNER FUNC
    // #########################################################################        

    public static void main(String args[]) {
        try {

            FlatAtomOneDarkIJTheme.setup();
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // #########################################################################    
    // FUNCTIONS
    // #########################################################################    
    // #########################################################################    
    // VARIABLE COMPONENTS
    // #########################################################################    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSwap;
    private javax.swing.JPanel buttonsPane;
    private javax.swing.JComboBox<String> cmbFromBase;
    private javax.swing.JComboBox<String> cmbToBase;
    private javax.swing.JPanel contentPanel;
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
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainWindow;
    private javax.swing.JPanel pillar;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel topWrapper;
    private javax.swing.JTextField txtConverted;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JLabel windowTitle;
    // End of variables declaration//GEN-END:variables
}
