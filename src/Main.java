public class Main {
    public static void main(String[] args) {
       SaidaCD saiCd = new SaidaCD();
       ConexaoVitrola conVitrola = new ConexaoVitrola();
       ConexaoCD ConCd = new ConexaoCD();
       Adaptador adapt = new Adaptador();

       System.out.println(adapt.conecta(ConCd));
    }
}