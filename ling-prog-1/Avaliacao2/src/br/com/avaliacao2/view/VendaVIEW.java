package br.com.avaliacao2.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import br.com.avaliacao2.dto.VendaDTO;
import br.com.avaliacao2.ctr.VendaCTR;
import br.com.avaliacao2.dto.LivroDTO;
import br.com.avaliacao2.ctr.LivroCTR;
import br.com.avaliacao2.dto.ClienteDTO;
import br.com.avaliacao2.ctr.ClienteCTR;
import java.util.Date;

public class VendaVIEW extends javax.swing.JInternalFrame {

    VendaCTR vendaCTR = new VendaCTR();
    VendaDTO vendaDTO = new VendaDTO();
    LivroCTR livroCTR = new LivroCTR();
    LivroDTO livroDTO = new LivroDTO();
    ClienteDTO clienteDTO = new ClienteDTO();
    ClienteCTR clienteCTR = new ClienteCTR();
    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_cli;
    DefaultTableModel modelo_jtl_consultar_pro;
    DefaultTableModel modelo_jtl_consultar_pro_selecionado;

    public VendaVIEW() {
        initComponents();
        liberaCampos(false);
        LiberaBotoes(true, false, false, true);
        modelo_jtl_consultar_cli = (DefaultTableModel) jtl_consultar_cli.getModel();
        modelo_jtl_consultar_pro = (DefaultTableModel) jtl_consultar_pro.getModel();
        modelo_jtl_consultar_pro_selecionado = (DefaultTableModel) jtl_consultar_pro_selecionado.getModel();
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void gravar() {
        vendaDTO.setDat_vend(new Date());
        vendaDTO.setVal_vend(Double.parseDouble(TotalVenda.getText()));
        clienteDTO.setId_cli(Integer.parseInt(String.valueOf(
                jtl_consultar_cli.getValueAt(jtl_consultar_cli.getSelectedRow(), 0))));
        JOptionPane.showMessageDialog(null,
                vendaCTR.inserirVenda(vendaDTO, clienteDTO, jtl_consultar_pro_selecionado)
        );
    }

    private void preencheTabelaCliente(String nome_cli) {
        try {
            modelo_jtl_consultar_cli.setNumRows(0);
            clienteDTO.setNome_cli(nome_cli);
            rs = clienteCTR.consultarCliente(clienteDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_cli.addRow(new Object[]{
                    rs.getString("id_cli"),
                    rs.getString("nome_cli")
                });
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        }
    }

    private void preencheTabelaLivro(String nome_livro) {
        try {
            modelo_jtl_consultar_pro.setNumRows(0);
            livroDTO.setNome_livro(nome_livro);
            rs = livroCTR.consultarLivro(livroDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_pro.addRow(new Object[]{
                    rs.getString("id_livro"),
                    rs.getString("nome_livro"),
                    rs.getDouble("p_venda_livro")
                });
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        }
    }

    private void calculaTotalVenda() {
        try {
            double total = 0;
            for (int cont = 0; cont < jtl_consultar_pro_selecionado.getRowCount(); cont++) {
                total += (Double.parseDouble(String.valueOf(jtl_consultar_pro_selecionado.getValueAt(cont, 2)))
                        * Integer.parseInt(String.valueOf(jtl_consultar_pro_selecionado.getValueAt(cont, 3))));
            }
            TotalVenda.setText(String.valueOf(total));
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        }
    }

    private void adicionaLivroSelecionado(int id_livro, String nome_livro, double p_venda_livro) {
        try {
            modelo_jtl_consultar_pro_selecionado.addRow(new Object[]{
                id_livro,
                nome_livro,
                p_venda_livro
            });
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        }
    }

    private void removeLivroSelecionado(int linha_selecionada) {
        try {
            if (linha_selecionada >= 0) {
                modelo_jtl_consultar_pro_selecionado.removeRow(linha_selecionada);
                calculaTotalVenda();
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        }
    }

    private void liberaCampos(boolean a) {
        pesquisa_nome_cli.setEnabled(a);
        btnPesquisarCli.setEnabled(a);
        jtl_consultar_cli.setEnabled(a);
        pesquisa_nome_pro.setEnabled(a);
        btnPesquisarPro.setEnabled(a);
        jtl_consultar_pro.setEnabled(a);
        btnProAdd.setEnabled(a);
        btnProRem.setEnabled(a);
        jtl_consultar_pro_selecionado.setEnabled(a);
        TotalVenda.setText("0.00");
    }

    private void limpaCampos() {
        pesquisa_nome_cli.setText("");
        modelo_jtl_consultar_cli.setNumRows(0);
        pesquisa_nome_pro.setText("");
        modelo_jtl_consultar_pro.setNumRows(0);
        modelo_jtl_consultar_pro_selecionado.setNumRows(0);
    }

    private void LiberaBotoes(boolean a, boolean b, boolean c, boolean d) {
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnSair.setEnabled(d);
    }

    private boolean verificaPreenchimento() {
        if (jtl_consultar_cli.getSelectedRowCount() <= 0) {
            JOptionPane.showMessageDialog(null, "Deve ser selecionado um Cliente");
            jtl_consultar_cli.requestFocus();
            return false;
        } else {
            if (jtl_consultar_pro_selecionado.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "É necessário adicionar pelo menos um livro no pedido");
                jtl_consultar_pro_selecionado.requestFocus();
                return false;
            } else {
                int verifica = 0;
                for (int cont = 0; cont < jtl_consultar_pro_selecionado.getRowCount(); cont++) {
                    if (String.valueOf(jtl_consultar_pro_selecionado.getValueAt(
                            cont, 3)).equalsIgnoreCase("null")) {
                        verifica++;
                    }
                }
                if (verifica > 0) {
                    JOptionPane.showMessageDialog(null,
                            "A quantidade de cada livro vendido deve ser informado");
                    jtl_consultar_pro_selecionado.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pesquisa_nome_cli = new javax.swing.JTextField();
        btnPesquisarCli = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_cli = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TotalVenda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_pro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        pesquisa_nome_pro = new javax.swing.JTextField();
        btnPesquisarPro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtl_consultar_pro_selecionado = new javax.swing.JTable();
        btnProAdd = new javax.swing.JButton();
        btnProRem = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Vendas"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel1.setText("Cliente:");

        btnPesquisarCli.setText("OK");
        btnPesquisarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCliActionPerformed(evt);
            }
        });

        jtl_consultar_cli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jScrollPane2.setViewportView(jtl_consultar_cli);

        jLabel3.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel3.setText("Total Venda:");

        TotalVenda.setFont(new java.awt.Font("Utsaah", 1, 36)); // NOI18N
        TotalVenda.setForeground(new java.awt.Color(0, 204, 0));
        TotalVenda.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pesquisa_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65)
                        .addComponent(TotalVenda)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pesquisa_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCli))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TotalVenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendas"));

        jtl_consultar_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jtl_consultar_pro);

        jLabel2.setText("Descricao:");

        btnPesquisarPro.setText("OK");
        btnPesquisarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProActionPerformed(evt);
            }
        });

        jtl_consultar_pro_selecionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor", "qro"
            }
        ));
        jtl_consultar_pro_selecionado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtl_consultar_pro_selecionadoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jtl_consultar_pro_selecionado);

        btnProAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2/view/imagens/prod_add.png"))); // NOI18N
        btnProAdd.setText("baixo");
        btnProAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProAddActionPerformed(evt);
            }
        });

        btnProRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2/view/imagens/prod_rem.png"))); // NOI18N
        btnProRem.setText("cima");
        btnProRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProRemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pesquisa_nome_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnProAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnProRem)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pesquisa_nome_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPro))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProAdd)
                    .addComponent(btnProRem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setText("cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setText("sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnCancelar)
                        .addComponent(btnSair))
                    .addComponent(btnNovo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCliActionPerformed
        preencheTabelaCliente(pesquisa_nome_cli.getText());
    }//GEN-LAST:event_btnPesquisarCliActionPerformed

    private void btnPesquisarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProActionPerformed
        preencheTabelaLivro(pesquisa_nome_pro.getText());
    }//GEN-LAST:event_btnPesquisarProActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        LiberaBotoes(false, true, true, true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_cli.setNumRows(0);
        modelo_jtl_consultar_pro.setNumRows(0);
        LiberaBotoes(true, false, false, true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnProAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProAddActionPerformed
        adicionaLivroSelecionado(
                Integer.parseInt(String.valueOf(jtl_consultar_pro.getValueAt(
                        jtl_consultar_pro.getSelectedRow(), 0))),
                String.valueOf(jtl_consultar_pro.getValueAt(jtl_consultar_pro.getSelectedRow(), 1)),
                Double.parseDouble(String.valueOf(jtl_consultar_pro.getValueAt(
                        jtl_consultar_pro.getSelectedRow(), 2)))
        );
    }//GEN-LAST:event_btnProAddActionPerformed

    private void btnProRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProRemActionPerformed
        removeLivroSelecionado(jtl_consultar_pro_selecionado.getSelectedRow());
    }//GEN-LAST:event_btnProRemActionPerformed

    private void jtl_consultar_pro_selecionadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtl_consultar_pro_selecionadoKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            calculaTotalVenda();
        }
    }//GEN-LAST:event_jtl_consultar_pro_selecionadoKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (verificaPreenchimento()) {
            gravar();
            limpaCampos();
            liberaCampos(false);
            LiberaBotoes(true, false, false, true);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalVenda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarCli;
    private javax.swing.JButton btnPesquisarPro;
    private javax.swing.JButton btnProAdd;
    private javax.swing.JButton btnProRem;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtl_consultar_cli;
    private javax.swing.JTable jtl_consultar_pro;
    private javax.swing.JTable jtl_consultar_pro_selecionado;
    private javax.swing.JTextField pesquisa_nome_cli;
    private javax.swing.JTextField pesquisa_nome_pro;
    // End of variables declaration//GEN-END:variables
}
