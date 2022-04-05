import java.util.Locale;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        pessoa Pessoa = new pessoa();

        Scanner s = new Scanner(System.in);

        System.out.println("Qual seu gênero? (H para homem e M para mulher)");
        String gender = s.nextLine();
        System.out.println("Digite o seu peso");
        double peso = s.nextDouble();
        if(peso>200.0){
            throw new IllegalArgumentException("Peso inválido");
        }
        System.out.println("Digite a sua altura");
        double altura = s.nextDouble();
        if(altura>2.4){
            throw new IllegalArgumentException("altura inválida");
        }

        Pessoa.setGender(gender);
        Pessoa.setAltura(altura);
        Pessoa.setPeso(peso);

        Pessoa.calcular(peso, altura);

        if(Pessoa.calcular(peso,altura) >= 43 && Pessoa.getGender().equals("H") ||
                Pessoa.calcular(peso, altura) >= 39 && Pessoa.getGender().equals("M")){
            System.out.println("Seu IMC é de: " + Pessoa.calcular(peso,altura) + "e se qualifica como Obesidade Mórbida");
        }
        else if(Pessoa.calcular(peso,altura)>=30 && Pessoa.getGender().equals("H")
                || Pessoa.calcular(peso,altura)>=29 && Pessoa.getGender().equals("M")){
            System.out.println("Seu IMC é de: " + Pessoa.calcular(peso,altura) + "e se qualifica como Obesidade Moderada");
        }
        else if(Pessoa.calcular(peso,altura)>=25 && Pessoa.getGender().equals("H")
                || Pessoa.calcular(peso,altura)>=24 && Pessoa.getGender().equals("M")){
            System.out.println("Seu IMC é de: " + Pessoa.calcular(peso,altura) + "e se qualifica como Obesidade Leve");
        }
        else if(Pessoa.calcular(peso,altura)>=20 && Pessoa.getGender().equals("H")
                || Pessoa.calcular(peso,altura)>=19 && Pessoa.getGender().equals("M")){
            System.out.println("Seu IMC é de: " + Pessoa.calcular(peso,altura) + "e se qualifica como Peso Normal");
        }
        else if(Pessoa.calcular(peso,altura)<20 && Pessoa.getGender().equals("H")
                || Pessoa.calcular(peso,altura)<19 && Pessoa.getGender().equals("M")){
            System.out.println("Seu IMC é de: " + Pessoa.calcular(peso,altura) + "e se qualifica como Abaixo do Normal");
        }



    }
}
