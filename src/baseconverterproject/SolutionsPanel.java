package baseconverterproject;

import java.util.LinkedHashMap;
import java.util.Map;

public class SolutionsPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    public final BaseConverter baseConverter;

    public SolutionsPanel(MainFrame mainFrame, BaseConverter bc) {
        this.mainFrame = mainFrame;
        this.baseConverter = bc;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainContent = new javax.swing.JPanel();
        contentWrapper = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollPanel = new javax.swing.JPanel();
        infoContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInput = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFromBase = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblToBase = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(644, 374));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(644, 374));
        setRequestFocusEnabled(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        mainContent.setBackground(new java.awt.Color(128, 213, 200));
        mainContent.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 1, 1), 2, true), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        mainContent.setLayout(new java.awt.BorderLayout());

        contentWrapper.setBackground(new java.awt.Color(248, 244, 255));
        contentWrapper.setAutoscrolls(true);
        contentWrapper.setMinimumSize(new java.awt.Dimension(644, 374));
        contentWrapper.setName(""); // NOI18N
        contentWrapper.setPreferredSize(new java.awt.Dimension(644, 374));
        contentWrapper.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(100, 32767));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(100, 100));
        jScrollPane1.setOpaque(true);

        scrollPanel.setBackground(new java.awt.Color(248, 244, 255));
        scrollPanel.setMaximumSize(new java.awt.Dimension(999999, 99999));
        scrollPanel.setLayout(new javax.swing.BoxLayout(scrollPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(scrollPanel);

        contentWrapper.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        infoContainer.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(15, 10, 15, 10), null));
        infoContainer.setMaximumSize(new java.awt.Dimension(9999, 60));
        infoContainer.setMinimumSize(new java.awt.Dimension(250, 60));
        infoContainer.setOpaque(false);
        infoContainer.setPreferredSize(new java.awt.Dimension(250, 60));

        jLabel1.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Input: ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 30));
        infoContainer.add(jLabel1);

        lblInput.setFont(new java.awt.Font("Lexend SemiBold", 0, 18)); // NOI18N
        lblInput.setForeground(new java.awt.Color(30, 30, 30));
        lblInput.setText("10");
        lblInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 30));
        infoContainer.add(lblInput);

        jLabel2.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setText("From Base:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 30));
        infoContainer.add(jLabel2);

        lblFromBase.setFont(new java.awt.Font("Lexend SemiBold", 0, 18)); // NOI18N
        lblFromBase.setForeground(new java.awt.Color(30, 30, 30));
        lblFromBase.setText("10");
        lblFromBase.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 30));
        infoContainer.add(lblFromBase);

        jLabel4.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 30, 30));
        jLabel4.setText("To Base:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 30));
        infoContainer.add(jLabel4);

        lblToBase.setFont(new java.awt.Font("Lexend SemiBold", 0, 18)); // NOI18N
        lblToBase.setForeground(new java.awt.Color(30, 30, 30));
        lblToBase.setText("16");
        lblToBase.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 30));
        infoContainer.add(lblToBase);

        contentWrapper.add(infoContainer, java.awt.BorderLayout.PAGE_START);

        mainContent.add(contentWrapper, java.awt.BorderLayout.CENTER);

        add(mainContent, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        lblInput.setText(baseConverter.getInput());
        lblToBase.setText(baseConverter.getToBase()+"");
        lblFromBase.setText(baseConverter.getFromBase()+"");

        LinkedHashMap<String, Object> messageMap = baseConverter.getSolutionMap();
        for (Map.Entry<String, Object> entry : messageMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            switch (key.split("_")[0]) {
                case "title" -> scrollPanel.add(new TitleContainer((String) value));
                case "theader" -> scrollPanel.add(new TableRow((String[]) value, true));
                case "trow" -> scrollPanel.add(new TableRow((String[]) value));
                default -> {
                }
            }
        }
        scrollPanel.add((new TableRow(new String[]{})));
        scrollPanel.add(new TitleContainer((String) "CONVERETED Result: " + baseConverter.getResult()));

    }//GEN-LAST:event_formComponentShown

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        scrollPanel.removeAll();
    }//GEN-LAST:event_formComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentWrapper;
    private javax.swing.JPanel infoContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFromBase;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblToBase;
    private javax.swing.JPanel mainContent;
    private javax.swing.JPanel scrollPanel;
    // End of variables declaration//GEN-END:variables
}
