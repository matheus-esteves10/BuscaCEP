import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();


        System.out.println("Bem vindo ao BuscaCEP. Informe um CEP para receber as informações referentes ao CEP informado: ");
        String cep = scanner.nextLine();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorArquivo geradorArquivo = new GeradorArquivo();
            geradorArquivo.salvaJson(novoEndereco);

        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}
