package TableModel;

import Classes.Endereco;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author thais
 */
public class FuncionarioTableModel extends AbstractTableModel {

    private List<Endereco> dados;
    private String[] colunas = {"Nome", "CEP", "Rua", "Numero_Casa", "Bairro", "Cidade", "UF","Cargo", "Usuário", "Senha"};

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
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getCep();
            case 2:
                return dados.get(linha).getRua();
            case 3:
                return dados.get(linha).getNum_casa();
            case 4:
                return dados.get(linha).getBairro();
            case 5:
                return dados.get(linha).getCidade();
            case 6:
                return dados.get(linha).getUF();
            case 7:
                return dados.get(linha).getTipo();
            case 8:
                return dados.get(linha).getUsuario();
            case 9:
                return dados.get(linha).getSenha();
            case 10:
                return dados.get(linha).getId_end();
            case 11:
                return dados.get(linha).getId_usuario();
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente!");
        }
    }

    public Endereco getRowValue(int l) {
        return dados.get(l);
    }

    public void setDados(List<Endereco> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }
}
