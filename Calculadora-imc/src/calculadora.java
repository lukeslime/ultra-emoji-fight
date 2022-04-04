import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double peso, altura;
        double calcular;
        String genero;
        System.out.println("Qual seu gênero? (H para homem e M para mulher)");
        genero = s.nextLine();
        System.out.println("Digite o seu peso");
        peso = s.nextDouble();
        System.out.println("Digite a sua altura");
        altura = s.nextDouble();

        calcular = peso / (altura * altura);

        if(calcular >= 43 && genero.equals("H") || calcular >= 39 && genero.equals("M")){
            System.out.println("Seu IMC é de: " + calcular + "e se qualifica como Obesidade Mórbida");
        }
        else if(calcular>=30 && genero.equals("H") || calcular>=29 && genero.equals("M")){
            System.out.println("Seu IMC é de: " + calcular + "e se qualifica como Obesidade Moderada");
        }
        else if(calcular>=25 && genero.equals("H") || calcular>=24 && genero.equals("M")){
            System.out.println("Seu IMC é de: " + calcular + "e se qualifica como Obesidade Leve");
        }
        else if(calcular>=20 && genero.equals("H") || calcular>=19 && genero.equals("M")){
            System.out.println("Seu IMC é de: " + calcular + "e se qualifica como Peso Normal");
        }
        else if(calcular<20 && genero.equals("H") || calcular<19 && genero.equals("M")){
            System.out.println("Seu IMC é de: " + calcular + "e se qualifica como Abaixo do Normal");
        }



    }
}
