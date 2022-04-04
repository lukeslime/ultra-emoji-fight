public class pessoa {
    private double peso, altura;
    private String gender;

    public double calcular(double peso, double altura){
        double calculo = peso / (altura * altura);
        return calculo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
