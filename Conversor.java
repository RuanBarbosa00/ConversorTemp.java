package ucsal;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opcao;
        double valor1, resultado;
        
        System.out.println("Informe a opção desejada: "
                + " (a) Celsius -> Kelvin"
                + " (b) Celsius -> Fahrenheit "
                + " (c) Kelvin -> Celsius"
                + " (d) Kelvin -> Fahrenheit"
                + "(e) Fahrenheit -> Celsius"
                + "(f) Fahrenheit -> Kelvin");
        opcao = input.next().charAt(0);
        
        System.out.println("Informe o valor: ");
        valor1 = input.nextDouble();
        
             
          switch (opcao) {
                case 'a':
                    resultado = valor1 + 273.15;
                    System.out.println("O resultado da conversao Celsius -> Kelvin foi "+ resultado);
                    break;

                case 'b':
                    resultado = 1.8 * (valor1 +32);
                    System.out.println("O resultado da conversao Celsius -> Fahrenheit foi "+ resultado);
                    break;

                case 'c':
                    resultado = valor1 - 273.15;
                    System.out.println("O resultado da conversao Kelvin -> Celsius foi "+ resultado);
                    break;

                case 'd':
                        resultado = (valor1 - 273.15) * 1.8 +32;
                        System.out.println("O resultado da conversao Kelvin -> Fahrenheit foi "+ resultado);
                    break;

                case 'e':
                	resultado = (valor1 - 32)/1.8;
                	System.out.println("O resultado da conversao Fahrenheit -> Celsius foi "+ resultado);
                    break;

                case 'f':
                	resultado = (valor1 - 32) * 5/9 + 273.15;
                	System.out.println("O resultado da conversao Fahrenheit -> Kelvin foi "+ resultado);
                    break;

                default:
                    System.out.println("ERRO: operação inválida");
                    break;
            }
        }
      }
    
