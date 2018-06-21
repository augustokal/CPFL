/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Classes.Faturas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author thais
 */
public class FaturasTableModel extends AbstractTableModel {

    private List<Faturas> dados;
    private String[] colunas = {"Data Vencimento","Valor Total"};

    public String getColumnName(int c) {
        return colunas[c];
    }

    @Override
    public int getRowCount() {
        if (dados == null) {
            return 0;
        }
        //dados.size retorna o tamanho da lista
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getDt_venc();
            case 1:
                return dados.get(linha).getValorTotal();
            case 2:
                return dados.get(linha).getDt_fatura();
            case 3:
                return dados.get(linha).getId_usuario();
            case 4:
                return dados.get(linha).getVal_kw();
            case 5:
                return dados.get(linha).getKwGastos();
            case 6:
                return dados.get(linha).getPorcentagem();
            case 7:
                return dados.get(linha).getVal_imposto();
            case 8:
                return dados.get(linha).getCor();                
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente!");
        }
    }

    public Faturas getRowValue(int l) {
        return dados.get(l);
    }

    public void setDados(List<Faturas> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }
}
