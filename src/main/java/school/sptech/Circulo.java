package school.sptech;

public class Circulo extends Figura {
    private Double raio;

    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    public Circulo(String cor, Integer espessura) {
        super(cor, espessura);
    }
    public Circulo(){

    }

    @Override
    public Double calcularArea() {
        return Math.PI*(raio*raio);
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                "} " + super.toString();
    }
}
