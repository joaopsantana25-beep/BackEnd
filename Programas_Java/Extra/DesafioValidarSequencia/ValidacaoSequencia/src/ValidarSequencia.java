/*
Desafio — Validação de Sequência de Operações

Você está implementando um sistema que valida uma sequência de operações realizadas por um usuário em uma aplicação.

Cada operação é representada por uma string:

"LOGIN"
"LOGOUT"
"UPLOAD"
"DELETE"
"DOWNLOAD"

Objetivo
Dado um array operacoes, determine se a sequência é válida.

Uma sequência é válida se:

Regras
O usuário só pode fazer operações diferentes de LOGIN se estiver logado
O usuário não pode fazer LOGIN duas vezes seguidas sem LOGOUT
O usuário começa sempre como deslogado
Se qualquer regra for quebrada, a sequência é inválida

Resultado esperado
Retorne:

"Valido" → se todas as operações respeitam as regras
"Invalido" → caso contrário
 */

import java.util.List;
import java.util.ArrayList;

public class ValidarSequencia {
    public static void main(String[] args) {
        //Variável de Controle e Lista de Controle
        boolean status = false;
        boolean avaliacao = true;
        List<String> avaliacoes = new ArrayList<>();

        //Lista de comandos
        List<String> operacoes1 = List.of(
                "LOGIN",
                "UPLOAD",
                "DOWNLOAD",
                "LOGOUT"
        );

        List<String> operacoes2 = List.of(
                "UPLOAD",
                "LOGIN",
                "DELETE"
        );

        List<String> operacoes3 = List.of(
                "LOGIN",
                "LOGIN",
                "LOGOUT"
        );

        List<String> operacoes4 = List.of(
                "LOGIN",
                "UPLOAD",
                "UPLOAD",
                "DOWNLOAD",
                "DELETE",
                "LOGOUT"
        );

        List<String> operacoes5 = List.of(
                "LOGIN",
                "LOGOUT",
                "LOGOUT"
        );

        List<String> operacoes6 = List.of(
                "LOGIN",
                "UPLOAD",
                "LOGOUT",
                "DELETE"
        );

        List<List<String>> Operacoes = new ArrayList<>();

        Operacoes.add(operacoes1);
        Operacoes.add(operacoes2);
        Operacoes.add(operacoes3);
        Operacoes.add(operacoes4);
        Operacoes.add(operacoes5);
        Operacoes.add(operacoes6);

        //Programa

        for(List<String>operacao : Operacoes) {
            status = false;
            avaliacao = true;

            for (String comando : operacao) {
                if (comando.equals("LOGIN")) {
                    if (status) {
                        avaliacao = false;
                        break;
                    } else {
                        status = true;
                    }
                } else if (comando.equals("LOGOUT")) {

                    if (!status) {
                        avaliacao = false;
                        break;
                    } else {
                        status = false;
                    }
                } else {
                    if (!status) {
                        avaliacao = false;
                        break;
                    }

                }
            }

            if(avaliacao){
                avaliacoes.add("Válido");
            }
            else{
                avaliacoes.add("Inválido");
            }

        }

        //Fim do laço For pra verificar se a sequencia é valida ou não

        System.out.println(avaliacoes);


        }
    }
