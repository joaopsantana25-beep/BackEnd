package com.Santana.transacao_api.business.services;

import com.Santana.transacao_api.controller.dtos.EstatisticasResponseDTO;
import com.Santana.transacao_api.controller.dtos.TransacaoRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class EstatisticasService {

    public final TransacaoServices transacaoServices;

    public EstatisticasResponseDTO calcularEstatisticasTransacoes(int intervaloBusca){

        log.info("Iniciada busca de estisticas de transações pelo periodo de tempo" + intervaloBusca);

        List<TransacaoRequestDTO> transacoes=  transacaoServices.buscarTransacoes(intervaloBusca);

        if(transacoes.isEmpty()){
            return new EstatisticasResponseDTO(0,0.0,0.0,0.0,0.0);
        }


        DoubleSummaryStatistics estatisticasTransacoes = transacoes.stream().mapToDouble(TransacaoRequestDTO::valor).summaryStatistics();

        log.info("Estatísticas retornadas com sucesso");

        return new EstatisticasResponseDTO(
                estatisticasTransacoes.getCount(),
                estatisticasTransacoes.getSum(),
                estatisticasTransacoes.getAverage(),
                estatisticasTransacoes.getMin(),
                estatisticasTransacoes.getMax());
}};
