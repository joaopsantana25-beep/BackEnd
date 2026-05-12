package com.Santana.transacao_api.controller;

import com.Santana.transacao_api.business.services.TransacaoServices;
import com.Santana.transacao_api.controller.dtos.TransacaoRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/transacao")

public class TransacaoController {

    public final TransacaoServices transacaoServices;

    @PostMapping
    /*@Operation(description = "Endpoint responsáel por adicionar transações")
    @ApiResonse(value = {
          @ApiResponse(responseCode = "201", description = "Transação gravada com sucesso"),
          @ApiResponse(respondeCode = "422", description = "Campos não atendem os requisitos da transação"),
          @ApiResponse(responseCode = "400", description = "Errpo de requisição"),
          @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
          }*/


    public ResponseEntity<Void> adicionarTransacao(@RequestBody TransacaoRequestDTO dto){

        transacaoServices.adicionarTransacoes(dto);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
       /*@Operation(description = "Endpoint responsáel por deletar transações")
    @ApiResonse(value = {
          @ApiResponse(responseCode = "201", description = "Transação gravada com sucesso"),
          @ApiResponse(respondeCode = "422", description = "Campos não atendem os requisitos da transação"),
          @ApiResponse(responseCode = "400", description = "Errpo de requisição"),
          @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
          }*/
    public ResponseEntity<Void> deletarTransacoes(){
        transacaoServices.limparTransacoes();
        return ResponseEntity.ok().build();

    }
}
