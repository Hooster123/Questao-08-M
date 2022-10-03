

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);

       double salario;
       double horas;
       double total;

       //Requisito 1: Perguntar quanto voce ganha por hora
       System.out.println("Quanto voce ganha por hora? ");
       salario = sc.nextDouble();

       //Requisito 2: Perguntar quantas horas voce trabalhou este mês

       System.out.println("Quantas horas você trabalhou este mês? ");
       horas = sc.nextDouble();

       //Requisito 3: Calcular e mostrar o salário no referido mês
        total = salario * horas;


       System.out.println("O seu salário deste mês, total é: " +total);

       sc.close();

        
        }

    }