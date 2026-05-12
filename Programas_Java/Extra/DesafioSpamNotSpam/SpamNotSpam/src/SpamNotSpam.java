/*
Desafio — Detector de Spam

Uma empresa está desenvolvendo um sistema simples para identificar mensagens de spam automaticamente.

Você receberá:

um array palavrasSpam, contendo palavras frequentemente utilizadas em mensagens suspeitas;
um array frases, contendo mensagens que devem ser analisadas.

Seu objetivo é criar uma função que retorne um novo array classificando cada frase como:

"Spam" → quando a frase possuir pelo menos 2 palavras presentes em palavrasSpam;
"NotSpam" → caso contrário.
Regras
A verificação deve ignorar letras maiúsculas e minúsculas.
As palavras da frase são separadas por espaço.
A ordem das palavras não importa.
 */

import java.util.ArrayList;
import java.util.List;

public class SpamNotSpam {
    public static void main(String[] args){
        //Variáveis
        int contadorDePalavras;


        //Listas
        List<String>avaliacoes = new ArrayList<>();

        List<String>palavrasSpam = List.of(
                "gratis",
                "promoção",
                "desconto",
                "clique",
                "urgente",
                "oferta",
                "dinheiro",
                "ganhe",
                "premio",
                "cartao",
                "credito",
                "emprestimo",
                "bitcoin",
                "pix",
                "cashback",
                "imperdivel",
                "limited",
                "winner",
                "bonus",
                "gift"
        );

        List<String>frases = List.of(
                "clique aqui para ganhar dinheiro rapido",
                "bom dia como voce esta",
                "oferta imperdivel com desconto exclusivo",
                "vamos marcar uma reuniao amanhã",
                "ganhe premio gratis hoje mesmo",
                "o relatorio foi enviado por email",
                "pix bonus cashback para novos clientes",
                "preciso comprar pão no mercado",
                "urgente atualize os dados do cartao credito",
                "parabens voce e winner de um gift",
                "a aula de algoritmos começa as oito",
                "emprestimo aprovado com dinheiro imediato",
                "podemos viajar no feriado",
                "promoção limitada clique agora",
                "o sistema foi atualizado com sucesso"

        );


        //Código
        for(String frase : frases){

            contadorDePalavras=0;


            String[] palavrasDasFrases = frase.toLowerCase().split(" ");

            for(String palavra : palavrasDasFrases){
                    if(palavrasSpam.contains(palavra)){
                        contadorDePalavras++;
                    }

                    if(contadorDePalavras==2){
                        break;
                    }
                }


            if(contadorDePalavras>=2){
                avaliacoes.add("Spam");
            }
            else{
                avaliacoes.add("NotSpam");
            }

        }


        System.out.println(avaliacoes);
    }
}



