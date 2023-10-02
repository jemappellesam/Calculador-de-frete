public class PorTamanho implements TipoDeEnvio {

    @Override
    public double calcular(Produto produto) {
        return produto.getAltura() * produto.getLargura();
    }
}
