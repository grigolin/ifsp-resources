package br.com.avaliacao2.view;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.avaliacao2.dto.FornecedorDTO;
import br.com.avaliacao2.ctr.FornecedorCTR;
import br.com.avaliacao2.dto.LivroDTO;
import br.com.avaliacao2.ctr.LivroCTR;


public class LivroVIEW extends javax.swing.JInternalFrame {
       
    FornecedorDTO fornecedorDTO = new FornecedorDTO(); //Cria um objeto fornecedorDTO
    FornecedorCTR fornecedorCTR = new FornecedorCTR(); //Cria um objeto fornecedorCTR
    LivroDTO livroDTO = new LivroDTO(); //Cria um objeto livroDTO
    LivroCTR livroCTR = new LivroCTR(); //Cria um objeto livroCTR
    
    int gravar_alterar; //Variavel usada para saber se esta alterando ou incluindo
    
    
    ResultSet rs; //Variavel usada para preenchimeto da tabela e dos campos
    DefaultTableModel modelo_jtl_consultar_livro; //Variavel para guardar o modelo da tabela
    DefaultTableModel modelo_jtl_consultar_fornecedor; //Variavel para guardar o modelo da tabela

    /**
     * Creates new form LivroVIEW
     */
    public LivroVIEW() {
        initComponents();
        
        //Chama todos os métodos liberaCampos
        liberaCampos(false);
        //Chama o método liberaBotoes
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_livro = (DefaultTableModel) jtl_consultar_livro.getModel();
        modelo_jtl_consultar_fornecedor = (DefaultTableModel) jtl_consultar_fornecedor.getModel();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome_livro = new javax.swing.JTextField();
        desc_livro = new javax.swing.JTextField();
        cod_bar_livro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesquisa_nome_livro = new javax.swing.JTextField();
        btnPesquisarLivro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_livro = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        p_custo_livro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        p_venda_livro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_fornecedor = new javax.swing.JTable();
        pesquisa_nome_fornecedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnPesquisarFornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");

        nome_livro.setNextFocusableComponent(desc_livro);

        desc_livro.setNextFocusableComponent(cod_bar_livro);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Livro");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nome:");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2/view/imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Descrição:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Código:");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2/view/imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2/view/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2/view/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Consulta");

        btnPesquisarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLivroActionPerformed(evt);
            }
        });

        jtl_consultar_livro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_livro.getTableHeader().setReorderingAllowed(false);
        jtl_consultar_livro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_livroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_livro);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("P. Custo:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("P. Venda:");

        jtl_consultar_fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_fornecedor.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtl_consultar_fornecedor);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fornecedor:");

        btnPesquisarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(desc_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nome_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cod_bar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p_custo_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p_venda_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pesquisa_nome_fornecedor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisa_nome_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nome_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(desc_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cod_bar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(p_venda_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(p_custo_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPesquisarFornecedor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(pesquisa_nome_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(pesquisa_nome_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPesquisarLivro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(gravar_alterar == 1){
            gravar();
            gravar_alterar = 0;
        }
        else{
            if(gravar_alterar == 2){
                alterar();
                gravar_alterar = 0;
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro no Sistema!!!");
            }
        }
          
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLivroActionPerformed
        preencheTabelaLivro(pesquisa_nome_livro.getText());
        
    }//GEN-LAST:event_btnPesquisarLivroActionPerformed

    private void jtl_consultar_livroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_livroMouseClicked
        //Pega o id do livro selecionado e chama preencheCampos
        preencheCamposLivro(Integer.parseInt(String.valueOf(
                jtl_consultar_livro.getValueAt(
                jtl_consultar_livro.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_livroMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_livro.setNumRows(0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_livro.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar=0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFornecedorActionPerformed
         preencheTabelaFornecedor(pesquisa_nome_fornecedor.getText());
    }//GEN-LAST:event_btnPesquisarFornecedorActionPerformed


    /**
     * Método para centralizar o internalFrame.
     */
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }//Fecha método setPosicao()
    
    
    
    /**
     * Método utilizado para gravar os dados do livro.
     */
    private void gravar(){
        try{           
            livroDTO.setNome_livro(nome_livro.getText());
            livroDTO.setDesc_livro(desc_livro.getText());
            livroDTO.setCod_bar_livro(cod_bar_livro.getText());
            livroDTO.setP_custo_livro(Double.parseDouble(p_custo_livro.getText()));
            livroDTO.setP_venda_livro(Double.parseDouble(p_venda_livro.getText()));
            fornecedorDTO.setId_for(Integer.parseInt(String.valueOf(
                    jtl_consultar_fornecedor.getValueAt(
                    jtl_consultar_fornecedor.getSelectedRow(), 0))));

            JOptionPane.showMessageDialog(null,
                    livroCTR.inserirLivro(livroDTO, fornecedorDTO)
            );
        }
        catch(Exception e){
            System.out.println("Erro ao Gravar" + e.getMessage());
        }
    }//Fecha método gravar()
    
    
    /**
     * Método utilizado para alterar os dados do livro.
     */
    private void alterar(){
        try{
            livroDTO.setNome_livro(nome_livro.getText());
            livroDTO.setDesc_livro(desc_livro.getText());
            livroDTO.setCod_bar_livro(cod_bar_livro.getText());
            livroDTO.setP_custo_livro(Double.parseDouble(p_custo_livro.getText()));
            livroDTO.setP_venda_livro(Double.parseDouble(p_venda_livro.getText()));
            fornecedorDTO.setId_for(Integer.parseInt(String.valueOf(
                    jtl_consultar_fornecedor.getValueAt(
                    jtl_consultar_fornecedor.getSelectedRow(), 0))));
            
            JOptionPane.showMessageDialog(null,
                    livroCTR.alterarLivro(livroDTO, fornecedorDTO)
            );
        }
        catch(Exception e){
            System.out.println("Erro ao Alterar" + e.getMessage());
        }
    }//Fecha método alterar()
    
    
    /**
     * Método utilizado para excluir os dados do livro.
     */
    private void excluir(){
       if(JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Livro?","Aviso", 
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    livroCTR.excluirLivro(livroDTO)
            );
       }
    }//Fecha método excluir()
    
    
    
    /**
     * Método utilizado para liberar/bloquear os campos da tela.
     * @param a, boolean com true(libera) false(bloqueia).
     */
    private void liberaCampos(boolean a){
        nome_livro.setEnabled(a);
        desc_livro.setEnabled(a);
        cod_bar_livro.setEnabled(a);
        p_custo_livro.setEnabled(a);
        p_venda_livro.setEnabled(a);
        pesquisa_nome_fornecedor.setEnabled(a);
        btnPesquisarFornecedor.setEnabled(a);
        jtl_consultar_fornecedor.setEnabled(a);
    }//Fecha método liberaCampos(boolean a)
    
    
    /**
     * Método utilizado para liberar os botões da tela.
     * @param a, boolean com true(libera) false(bloqueia) para o btnNovo.
     * @param b, boolean com true(libera) false(bloqueia) para o btnSalvar.
     * @param c, boolean com true(libera) false(bloqueia) para o btnCancelar.
     * @param d, boolean com true(libera) false(bloqueia) para o btnExcluir.
     * @param e, boolean com true(libera) false(bloqueia) para o btnSair.
     */
    private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e){
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnExcluir.setEnabled(d);
        btnSair.setEnabled(e);
    }//Fecha método liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e)
    
    
    /**
     * Método utilizado para limpar os campos da tela.
     */
    private void limpaCampos(){
        nome_livro.setText("");
        desc_livro.setText("");
        cod_bar_livro.setText("");
        p_custo_livro.setText("");
        p_venda_livro.setText("");
        pesquisa_nome_fornecedor.setText("");
        modelo_jtl_consultar_fornecedor.setNumRows(0);
    }//Fecha método limpaCampos()
    
    
    /**
     * Método utilizado para preencher/contruir a Jtable.
     * @param nome_livro, String com o nome do livro
     */
    private void preencheTabelaLivro(String nome_livro){
        try{
            //Limpa todas as linhas
            modelo_jtl_consultar_livro.setNumRows(0);
            //Enquanto tiver linhas - faça
            livroDTO.setNome_livro(nome_livro);
            rs = livroCTR.consultarLivro(livroDTO, 1); //1 = é a pesquisa por nome na classe DAO
            while(rs.next()){
                modelo_jtl_consultar_livro.addRow(new Object[]{
                  rs.getString("id_livro"),
                  rs.getString("nome_livro"),
                });
            }        
        }
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        } 
        finally{
            livroCTR.CloseDB();
        }
    }//Fecha método preencheTabelaLivro(String nome_livro)
    
    /**
     * Método utilizado para preencher os campos da tela com 
     * valores do livro.
     * @param id_livro, int com o id do livro.
     */
    private void preencheCamposLivro(int id_livro){
        try{
            livroDTO.setId_livro(id_livro);
            rs = livroCTR.consultarLivro(livroDTO, 2); //2 = é a pesquisa no id na classe DAO
            if(rs.next()){
                limpaCampos();
                
                nome_livro.setText(rs.getString("nome_livro"));
                desc_livro.setText(rs.getString("desc_livro"));
                cod_bar_livro.setText(rs.getString("cod_bar_livro"));
                p_custo_livro.setText(rs.getString("p_custo_livro"));
                p_venda_livro.setText(rs.getString("p_venda_livro"));
               
                /////Colocando os dados do fornecedor
                modelo_jtl_consultar_fornecedor.setNumRows(0);
                modelo_jtl_consultar_fornecedor.addRow(new Object[]{rs.getInt("id_for"), rs.getString("nome_for"),});
                jtl_consultar_fornecedor.setRowSelectionInterval(0, 0);
                
                gravar_alterar = 2;
                liberaCampos(true);
            }//fecha if(rs.next)
        }//fecha try
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        }  
        finally{
            livroCTR.CloseDB();
        }
    }//Fecha método preencheCamposLivro(int id_for)
    
    
    /**
     * Método utilizado para preencher/contruir a Jtable.
     * @param nome_for, String com o nome do fornecedor
     */
    private void preencheTabelaFornecedor(String nome_for){
        try{
            //Limpa todas as linhas
            modelo_jtl_consultar_fornecedor.setNumRows(0);
            //Enquanto tiver linhas - faça
            fornecedorDTO.setNome_for(nome_for);
            rs = fornecedorCTR.consultarFornecedor(fornecedorDTO, 1); //1 = é a pesquisa por nome na classe DAO
            while(rs.next()){
                modelo_jtl_consultar_fornecedor.addRow(new Object[]{
                  rs.getString("id_for"),
                  rs.getString("nome_for"),
                });
            }        
        }
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        } 
        finally{
            livroCTR.CloseDB();
        }
    }//Fecha método preencheTabelaFornecedor(String nome_for)

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarFornecedor;
    private javax.swing.JButton btnPesquisarLivro;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cod_bar_livro;
    private javax.swing.JTextField desc_livro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtl_consultar_fornecedor;
    private javax.swing.JTable jtl_consultar_livro;
    private javax.swing.JTextField nome_livro;
    private javax.swing.JTextField p_custo_livro;
    private javax.swing.JTextField p_venda_livro;
    private javax.swing.JTextField pesquisa_nome_fornecedor;
    private javax.swing.JTextField pesquisa_nome_livro;
    // End of variables declaration//GEN-END:variables
}
