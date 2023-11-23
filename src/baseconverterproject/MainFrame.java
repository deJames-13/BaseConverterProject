package baseconverterproject;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class MainFrame extends javax.swing.JFrame {

    private final static BaseConverter baseConverter = new BaseConverter();
    private final MainContentPanel inputPanel;
    private final SolutionsPanel solutionsPanel;
    private final String currentDirectory = System.getProperty("user.dir");

    private final ImagePanel btnBgImg_Active = new ImagePanel(currentDirectory + "/img/icons-calculator-inactive.png");

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
        this.setResizable(true);
        this.setMinimumSize(new Dimension(800, 480));
        this.setLocationRelativeTo(null);

        inputPanel = new MainContentPanel(this, baseConverter);
        solutionsPanel = new SolutionsPanel(this, baseConverter);
        contentPanel.add(inputPanel);
        contentPanel.add(solutionsPanel);
        solutionsPanel.setVisible(false);

        btnBgImg_Active.setOpaque(false);
        // #####################################################################
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
        btnWrapper = new javax.swing.JPanel();
        btnSwitchPage = new javax.swing.JPanel();
        lblPage = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base Converter");
        setLocation(new java.awt.Point(200, 100));
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(300, 300, 2147483647, 2147483647));
        setSize(new java.awt.Dimension(800, 480));
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
        pillar.setMaximumSize(new java.awt.Dimension(110, 410));
        pillar.setMinimumSize(new java.awt.Dimension(110, 410));
        pillar.setPreferredSize(new java.awt.Dimension(110, 410));
        pillar.setLayout(new java.awt.GridBagLayout());

        btnWrapper.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        btnWrapper.setMaximumSize(new java.awt.Dimension(80, 80));
        btnWrapper.setMinimumSize(new java.awt.Dimension(80, 80));
        btnWrapper.setName(""); // NOI18N
        btnWrapper.setOpaque(false);
        btnWrapper.setLayout(new java.awt.BorderLayout());

        btnSwitchPage.setMaximumSize(new java.awt.Dimension(80, 80));
        btnSwitchPage.setMinimumSize(new java.awt.Dimension(50, 50));
        btnSwitchPage.setOpaque(false);
        btnSwitchPage.setPreferredSize(new java.awt.Dimension(80, 80));
        btnSwitchPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSwitchPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSwitchPageMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSwitchPageMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSwitchPageMouseReleased(evt);
            }
        });
        btnSwitchPage.setLayout(new java.awt.BorderLayout());
        btnSwitchPage.add(btnBgImg_Active);
        btnWrapper.add(btnSwitchPage, java.awt.BorderLayout.CENTER);

        lblPage.setFont(new java.awt.Font("Lexend", 1, 10)); // NOI18N
        lblPage.setForeground(new java.awt.Color(30, 30, 30));
        lblPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPage.setText("View Solution");
        btnWrapper.add(lblPage, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        pillar.add(btnWrapper, gridBagConstraints);

        mainPanel.add(pillar, java.awt.BorderLayout.LINE_END);

        contentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new javax.swing.OverlayLayout(contentPanel));
        mainPanel.add(contentPanel, java.awt.BorderLayout.CENTER);

        mainWindow.add(mainPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainWindow);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSwitchPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSwitchPageMouseEntered
        if (inputPanel.isVisible()) {
            btnBgImg_Active.setBackgroundImage(currentDirectory + "/img/icons-calculator-hover.png");
        }
    }//GEN-LAST:event_btnSwitchPageMouseEntered

    private void btnSwitchPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSwitchPageMouseExited
        if (inputPanel.isVisible()) {
            btnBgImg_Active.setBackgroundImage(currentDirectory + "/img/icons-calculator-inactive.png");
        }
    }//GEN-LAST:event_btnSwitchPageMouseExited

    private void btnSwitchPageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSwitchPageMouseReleased
        btnSwitchPage.setBorder(null);
        if (inputPanel.isVisible()) {
            btnBgImg_Active.setBackgroundImage(currentDirectory + "/img/icons-calculator-hover.png");
        } else {
            Border eb = BorderFactory.createEmptyBorder(15, 15, 15, 15);
            btnSwitchPage.setBorder(eb);
            btnBgImg_Active.setBackgroundImage(currentDirectory + "/img/icons-back.png");
        }
    }//GEN-LAST:event_btnSwitchPageMouseReleased

    private void btnSwitchPageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSwitchPageMousePressed
        Border eb = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        btnSwitchPage.setBorder(eb);
        if (inputPanel.isVisible()) {
            btnBgImg_Active.setBackgroundImage(currentDirectory + "/img/icons-calculator-active.png");
        }

        if (inputPanel.txtConverted.getText().isEmpty() || "0".equals(inputPanel.txtConverted.getText())) {
            return;
        }

        inputPanel.setVisible(!inputPanel.isVisible());
        solutionsPanel.setVisible(!solutionsPanel.isVisible());
        windowTitle.setText(inputPanel.isVisible() ? "Base Converter" : "Solution");
        lblPage.setText(inputPanel.isVisible() ? "View Solution" : "Go Back");
    }//GEN-LAST:event_btnSwitchPageMousePressed
    // #########################################################################    
    // EVENTS ^
    // #########################################################################    
    // MAIN FUNCTION / RUNNER FUNC
    // #########################################################################        

    // #########################################################################    
    // FUNCTIONS
    // #########################################################################    
    // #########################################################################    
    // VARIABLE COMPONENTS
    // #########################################################################    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSwitchPage;
    public javax.swing.JPanel btnWrapper;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel lblPage;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainWindow;
    private javax.swing.JPanel pillar;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel topWrapper;
    private javax.swing.JLabel windowTitle;
    // End of variables declaration//GEN-END:variables

}
