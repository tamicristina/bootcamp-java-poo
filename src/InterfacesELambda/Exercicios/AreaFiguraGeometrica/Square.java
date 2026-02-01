package InterfacesELambda.Exercicios.AreaFiguraGeometrica;

//record é um tipo de classe imutável criada para armazenar dados de forma simples
public record Square(double side) implements GeometricForm {
    @Override
    public double getArea() {
        return side * side;
    }
}
