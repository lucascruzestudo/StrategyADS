public class Disciplina {
    private ICalcMedia calcMedia;
    private double media;
    private String nome;
    private double p1;
    private double p2;
    private String situacao;

    public Disciplina(ICalcMedia calculo) {
        setCalculo(calculo);
    }

    public void setCalculo(ICalcMedia calculo) {
        this.calcMedia = calculo;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;

    }

    private void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void CalcularMedia(double p1, double p2) {
        double media = calcMedia.CalcularMedia(p1, p2);
        String situacao = calcMedia.Situacao(media);
        setMedia(media);
        setSituacao(situacao);
    }

}
