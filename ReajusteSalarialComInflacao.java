import java.util.Scanner;

public class ReajusteSalarialComInflacao {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salario atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();
        
        double percentualReajuste = 0;
        
        if (salarioAtual <= 280) {
            percentualReajuste = 0.20; 
        } else if (salarioAtual <= 700) {
            percentualReajuste = 0.15; 
        } else if (salarioAtual <= 1500) {
            percentualReajuste = 0.10; 
        } else {
            percentualReajuste = 0.05;
        }
        
        double aumento = salarioAtual * percentualReajuste;
        double salarioComReajuste = salarioAtual + aumento;
        
        double inflacao = 0.038;
        
        double salarioComReajusteEInflacao = salarioComReajuste * (1 + inflacao);
        
        System.out.println("\nDetalhes do reajuste:");
        System.out.println("Salario antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de reajuste: " + (percentualReajuste * 100) + "%");
        System.out.println("O valor do aumento: R$ " + aumento);
        System.out.println("Novo salario apos reajuste: R$ " + salarioComReajuste);
        System.out.println("Valor do aumento real apos inflacao de 3,8%: R$ " + salarioComReajusteEInflacao);
        
        scanner.close();
    }
}