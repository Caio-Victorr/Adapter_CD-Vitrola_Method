public class EntradaVitrola extends Entrada<ConexaoVitrola> {
    @Override
    public String conecta(ConexaoVitrola conexao) {
        return conexao.obtemconexao() + getNomeConexao();
    }

    @Override
    public String getNomeConexao() {
        return "Conexao Vitrola";
    }

}
