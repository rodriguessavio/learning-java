public class Student {

    public String nome;
    public double n1;
    public double n2;
    public double n3;


    @Override
    public String toString() {
        return "Student [nome=" + nome + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + "]";
    }

    public String aproved() {
        double total = n1+n2+n3;
            if (total >= 90) {
                return "FINAL GRADE = "+ total+"\nPASS";
            } else {
                return "FINAL GRADE = "+ total+"\nFAILED\nMISSING "+ (90-total)+ " POINTS";
            }
    }

    
}
