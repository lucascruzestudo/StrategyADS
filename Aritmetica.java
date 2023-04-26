public class Aritmetica implements ICalcMedia {

    @Override
    public double CalcularMedia(double a, double b) {
        return ((a + b) / 2);
    }

    @Override
    public String Situacao(double media) {
        String situacao = "Reprovado";
        if (media > 5) {
            situacao = "Aprovado";
        }
        return situacao;
    }

}
