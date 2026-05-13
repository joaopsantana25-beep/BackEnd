
import java.util.ArrayList;
import java.util.List;

public class ValidarSequencia {
    public static void main(String[] args) {
        boolean status = false;
        boolean avaliacao = true;
        List<String> avaliacoes = new ArrayList();
        List<String> operacoes1 = List.of("LOGIN", "UPLOAD", "DOWNLOAD", "LOGOUT");
        List<String> operacoes2 = List.of("UPLOAD", "LOGIN", "DELETE");
        List<String> operacoes3 = List.of("LOGIN", "LOGIN", "LOGOUT");
        List<String> operacoes4 = List.of("LOGIN", "UPLOAD", "UPLOAD", "DOWNLOAD", "DELETE", "LOGOUT");
        List<String> operacoes5 = List.of("LOGIN", "LOGOUT", "LOGOUT");
        List<String> operacoes6 = List.of("LOGIN", "UPLOAD", "LOGOUT", "DELETE");
        List<List<String>> Operacoes = new ArrayList();
        Operacoes.add(operacoes1);
        Operacoes.add(operacoes2);
        Operacoes.add(operacoes3);
        Operacoes.add(operacoes4);
        Operacoes.add(operacoes5);
        Operacoes.add(operacoes6);

        for(List<String> operacao : Operacoes) {
            status = false;
            avaliacao = true;

            for(String comando : operacao) {
                if (comando.equals("LOGIN")) {
                    if (status) {
                        avaliacao = false;
                        break;
                    }

                    status = true;
                } else if (comando.equals("LOGOUT")) {
                    if (!status) {
                        avaliacao = false;
                        break;
                    }

                    status = false;
                } else if (!status) {
                    avaliacao = false;
                    break;
                }
            }

            if (avaliacao) {
                avaliacoes.add("Válido");
            } else {
                avaliacoes.add("Inválido");
            }
        }

        System.out.println(avaliacoes);
    }
}
