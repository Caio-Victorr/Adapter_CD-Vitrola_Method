public class Adaptador extends EntradaVitrola {
    public String conecta(ConexaoCD conexaoCD){
        return conexaoCD.obtemconexao() + getNomeConexao();
    }
}
