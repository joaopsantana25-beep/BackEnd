package com.Santana.transacao_api.business.services;

import com.Santana.transacao_api.controller.dtos.TransacaoRequestDTO;
import com.Santana.transacao_api.infrastructure.exceptions.UnprocessableEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class TransacaoServices {

    //Criação de um banco de dados na forma de array list
    public final List<TransacaoRequestDTO> listaTransacoes = new ArrayList<>();

    public void adicionarTransacoes(TransacaoRequestDTO dto){

        log.info("Iniciado o processamento de gravar transações "+dto);

        //Verifica se a data hora da transação é superios/veio depois da data atual
        if(dto.dataHora().isAfter(OffsetDateTime.now())){
            log.error("Data e hora miaores que a data atual");
            throw new UnprocessableEntity("Data e hora maiores que a data e hora atual");
        }

        //Teste para verificar se o valor da transação é menor do que 0
        if(dto.valor()<0){
            log.error("Valor não poder ser menor que 0");
            throw new UnprocessableEntity(("Valor não pode ser menor que 0"));
        }

        log.info("Transações adicionadas com sucesso");
        listaTransacoes.add(dto);
    }

    public void limparTransacoes(){
        log.info("Iniciado processamento para deletar transações");
        listaTransacoes.clear();
        log.info("Transações deletas com sucesso");
    }

    public List<TransacaoRequestDTO> buscarTransacoes(int intervaloBusca){

        //Busca todas as transações na lista que aconteceram no intervalo de tempo
        log.info("Iniciadas buscas de transações por tempo "+ intervaloBusca);
        OffsetDateTime dataHoraIntervalo = OffsetDateTime.now().minusSeconds(intervaloBusca);

        log.info("Retorno de transações com sucesso");
        return listaTransacoes.stream().
        filter(transacao -> transacao.dataHora().isAfter(dataHoraIntervalo))
                .toList();
    }

}
