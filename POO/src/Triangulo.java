public class Triangulo {
    public double ladoA;
    public double ladoB;
    public double ladoC;

    Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public String toString() {
        return "Triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "]";
    }

    public double calcularArea() {

        double p = (ladoA+ladoB+ladoC)/2;

        double area = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
        return area;
    }
}
