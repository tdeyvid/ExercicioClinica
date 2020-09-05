/*Leia uma relação de pacientes de uma clínica,cada um com o nome, o sexo, o peso, a idade e a altura.
 *Para sinalizar o fim da lista será fornecido “fim” no nome do último paciente.
    Exiba um relatório contendo:
        i. a quantidade de pacientes.
        ii.a média de idade dos homens.
        iii.a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
        iv.a quantidade de pessoas com idade entre 18 e 25.
        v.o nome do paciente mais velho.
        vi.o nome da mulher mais baixa.
        vii.neste item, você cria uma situação interessante constrói o algoritmo correspondente.   
         */
package exercicioclinica;
import java.util.Scanner;
public class ExercicioClinica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        String nome, sexo, nomeMulherMaisBaixa="",
               PacienteMaisVelho = "";
        double peso,altura,alturaMaisBaixa=10;
        int idade, qtdeTotal = 0, qtdeMasc=0, mediaIdadeFem = 0,
            mediaIdadeMasc=0, qtdeIdade18e25=0,    qtdeFem=0,    
            qtdeFemAlturaPeso=0, idadeMaisVelha = 0;
        int totalPaciente;
        
        while (true){
            System.out.print("Digite o nome do paciente: ");
            nome = new Scanner (System.in).next();
            if (nome.equals("fim"))
                break;
            qtdeTotal++;
            System.out.print("Digite o sexo (M ou F): ");
            sexo = new Scanner (System.in).next();
            System.out.print("Digite o peso: ");
            peso = new Scanner (System.in).nextDouble();
            System.out.print("Digite a idade: ");
            idade = new Scanner (System.in).nextInt();
            System.out.print("Digite a atura: ");
            altura = new Scanner(System.in).nextDouble();
            
            if (sexo.equals("M")){
                qtdeMasc++;
                mediaIdadeMasc = mediaIdadeMasc + idade; //ii. media de idade dos homens.
            }
            
            if (sexo.equals("F")){
                qtdeFem++;
                mediaIdadeFem = mediaIdadeFem + idade; //vii. media de idade das mulheres.
                //iii. a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
                if(altura>=1.60 && altura<=1.70 && peso>70) {  
                    qtdeFemAlturaPeso++;
                }
                // vi.  o nome da mulher mais baixa.
                if(altura<alturaMaisBaixa){
                alturaMaisBaixa = altura;
                nomeMulherMaisBaixa = nome;
            }
            }
            //iv.  a quantidade de pessoas com idade entre 18 e 25.
            if (idade >= 18 && idade <=25){
                qtdeIdade18e25++;
            }
            //v.   o nome do paciente mais velho.
            if (idade > idadeMaisVelha){
                idadeMaisVelha = idade;
                PacienteMaisVelho = nome;
            }
        }
        System.out.println("Quantidade de pacientes: "+qtdeTotal);
        System.out.println("Média idade dos homens: "+(double)mediaIdadeMasc/qtdeMasc);
        System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "+qtdeFemAlturaPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: "+qtdeIdade18e25);
        System.out.println("Nome do paciente mais velho: "+PacienteMaisVelho);
        System.out.println("Nome da mulher mais baixa: "+nomeMulherMaisBaixa);
        System.out.println("Média idade das mulheres: "+(double)mediaIdadeFem/qtdeFem);
    }
    
}
