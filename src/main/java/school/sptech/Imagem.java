package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem(List<Figura> figuras) {
        this.figuras = new ArrayList<>();
    }
    public Imagem() {
    }
    public void adicionar(Figura figura){
        figuras.add(figura);
    }
    public Double calcularSomaDasAreas(){
        Double totalArea=0.0;

        for (Figura figura : figuras) {
            totalArea += figura.calcularArea();
        }
        return totalArea;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasGeometricas = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea()>20){
                figurasGeometricas.add(figura);
            }
        }
        return figurasGeometricas;
    }
    public List<Figura> buscarQuadrados(){
        List<Figura> figurasGeometricasQuadrado = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado quadrado){
                figurasGeometricasQuadrado.add(quadrado);
            }
        }
        return  figurasGeometricasQuadrado;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }
}
