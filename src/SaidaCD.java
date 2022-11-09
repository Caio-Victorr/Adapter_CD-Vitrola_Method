public class SaidaCD extends Saida<ConexaoCD> {
    @Override
    public String conecta(ConexaoCD conexao) {
        return conexao.obtemconexao() + getNomeConexao();
    }

    @Override
    public String getNomeConexao() {
        return "Conexao CD";
    }
}
