public class Geometrica implements ICalcMedia {

    @Override
    public double CalcularMedia(double a, double b) {
        return (Math.sqrt(a * b));
    }

    @Override
    public String Situacao(double media) {
        String situacao = "Reprovado";
        if (media > 7 && media <= 10) {
            situacao = "Aprovado";
        }
        return situacao;
    }

}
