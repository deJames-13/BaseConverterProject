package baseconverterproject;

public class TitleContainer extends javax.swing.JPanel {
    
    
    public TitleContainer(String title, int textAlign, int style) {
        initComponents();
        this.titleLabel.setText(title);
        this.titleLabel.setFont(new java.awt.Font("Lexend", style, 20));
        this.titleLabel.setHorizontalAlignment(textAlign);
        this.setVisible(true);
    }
    public TitleContainer(String title) {
        initComponents();
        this.titleLabel.setText(title);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleContainer = new javax.swing.JPanel();
        linetop = new javax.swing.JPanel();
        titleContainer1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        linebot = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(999999, 45));
        setMinimumSize(new java.awt.Dimension(620, 45));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(620, 45));

        titleContainer.setMaximumSize(new java.awt.Dimension(9999, 45));
        titleContainer.setMinimumSize(new java.awt.Dimension(620, 45));
        titleContainer.setOpaque(false);
        titleContainer.setPreferredSize(new java.awt.Dimension(620, 45));
        titleContainer.setLayout(new javax.swing.BoxLayout(titleContainer, javax.swing.BoxLayout.Y_AXIS));

        linetop.setMaximumSize(new java.awt.Dimension(9999, 2));
        linetop.setMinimumSize(new java.awt.Dimension(9999, 2));
        linetop.setPreferredSize(new java.awt.Dimension(250, 2));
        linetop.setLayout(new javax.swing.BoxLayout(linetop, javax.swing.BoxLayout.X_AXIS));
        titleContainer.add(linetop);

        titleContainer1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10), null));
        titleContainer1.setMaximumSize(new java.awt.Dimension(9999, 30));
        titleContainer1.setMinimumSize(new java.awt.Dimension(250, 40));
        titleContainer1.setOpaque(false);
        titleContainer1.setPreferredSize(new java.awt.Dimension(250, 40));
        titleContainer1.setLayout(new java.awt.GridLayout(1, 0));

        titleLabel.setFont(new java.awt.Font("Lexend", 1, 16)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(30, 30, 30));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Title Label");
        titleLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 30));
        titleContainer1.add(titleLabel);

        titleContainer.add(titleContainer1);

        linebot.setMaximumSize(new java.awt.Dimension(9999, 2));
        linebot.setMinimumSize(new java.awt.Dimension(9999, 2));
        linebot.setPreferredSize(new java.awt.Dimension(250, 2));
        linebot.setLayout(new javax.swing.BoxLayout(linebot, javax.swing.BoxLayout.X_AXIS));
        titleContainer.add(linebot);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(titleContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(titleContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel linebot;
    private javax.swing.JPanel linetop;
    private javax.swing.JPanel titleContainer;
    private javax.swing.JPanel titleContainer1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
