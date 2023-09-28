/*
Em uma empresa de logística há o processo de embarque de cargas.
O software pergunta ao seu motorista qual a carga máxima de seu caminhão.
Respondida a carga, o software pergunta se ele gostaria de cadastrar seu 
caminhão para serviços.
Caso ele digite “s”, de sim, o sistema executa um processo de conexão com banco
de dados e registro do caminhão que ele demonstra através de mensagens
“Conectando ao Banco de Dados”, “Caminhão Cadastrado!”. Depois, ele realiza um 
cálculo de transbordo, onde ele calcula a carga máxima que o caminhão poderá 
transportar, retirando uma margem de 5% de segurança. Essa carga efetiva de 
transporte deve ser multiplicada por uma taxa de R$120,54, que é o preço por 
tonelada transbordada (imprima o valor a ser pago).
Caso ele digite “n” , de não, o sistema deve agradecer e finalizar.
*/

package aula5ex3_v1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula5Ex3_v1 {

    public static void main(String[] args) {
        float cargaMaxima;
        String resposta = "";
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual a carga, em toneladas, máxima de seu caminhão?");
        cargaMaxima = ler.nextFloat();
        while(resposta.isEmpty()) {
            System.out.println("Gostaria de cadastrar seu caminhão para os serviços?");
            resposta = ler.next();
            
            switch (resposta) { 
                case "S", "s" -> {
                    ConexaoComBancoDeDados();
                    CadastroDoCaminhao();
                    ValorDoServico(cargaMaxima);
                }
                case "N", "n" -> System.out.println("Obrigado.");
                    
                default -> {
                        System.out.println("Resposta inválida.");
                        resposta = "";
                }
            }
        }
    }
    
    public static void ConexaoComBancoDeDados() {
        System.out.println("Conectando ao Banco de Dados...");
        System.out.println("Conectado!");
    }
    
    public static void CadastroDoCaminhao() {
        System.out.println("Caminhão cadastrado com sucesso!");
    }
    
    public static float CalculoDeTransbordo(float cargaMaxima) {
        return cargaMaxima * 0.95f;
    }
    
    public static float CalculoDoValorDoServico(float cargaMaxima) {
        return CalculoDeTransbordo(cargaMaxima) * 120.54f;
    }
    
    public static void ValorDoServico(float cargaMaxima) {
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("O valor do serviço é de R$" + deci.format(CalculoDoValorDoServico(cargaMaxima)) + ".");
    }
    
}
