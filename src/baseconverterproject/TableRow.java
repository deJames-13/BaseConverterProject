package baseconverterproject;

public class TableRow extends javax.swing.JPanel {

    boolean isHeader = false;

    public TableRow(String[] values, boolean isHeader) {
        initComponents();
        this.isHeader = isHeader;
        for (String v : values) {
            createHeader(v);
        }
    }
    public TableRow(String[] values) {
        initComponents();
        for (String v : values) {
            createHeader(v);
        }
    }


    private void createHeader(String text) {
        javax.swing.JLabel header = new javax.swing.JLabel();
        header.setFont(new java.awt.Font("Lexend", isHeader ? 1 : 0, 14)); // NOI18N
        header.setForeground(new java.awt.Color(30, 30, 30));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText(text);
        header.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        headerWrapper.add(header);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerWrapper = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(99999, 40));
        setMinimumSize(new java.awt.Dimension(620, 40));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(620, 40));
        setVerifyInputWhenFocusTarget(false);

        headerWrapper.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10), null));
        headerWrapper.setMaximumSize(new java.awt.Dimension(9999, 40));
        headerWrapper.setMinimumSize(new java.awt.Dimension(620, 40));
        headerWrapper.setOpaque(false);
        headerWrapper.setPreferredSize(new java.awt.Dimension(620, 40));
        headerWrapper.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(headerWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(headerWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerWrapper;
    // End of variables declaration//GEN-END:variables
}
