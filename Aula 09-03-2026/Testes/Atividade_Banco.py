#Bibliotecas

from datetime import datetime
import pytz


class ContaBancaria:

    @staticmethod
    def _data_hora():
        fusoBR = pytz.timezone('Brazil/East')
        horario_BR = datetime.now(fusoBR)
        return horario_BR.strftime("%d/%m/%Y %H:%M:%S")


    def __init__(self, nome,cpf,agencia, num_conta,saldo=0):
        self.nome = nome
        self.cpf = cpf
        self.saldo = saldo
        self.limit = nome
        self.agencia = agencia
        self.num_conta = num_conta
        self.transacoes = []



    #Função para depositar dinheiro

    def depositar_dinheiro(self,valor_deposito):
        if valor_deposito>0:
            self.saldo+=valor_deposito
            self.transacoes.append(("Depósito",valor_deposito,self.saldo-valor_deposito,self.saldo, ContaBancaria._data_hora()))
            print(f"\nFoi depositado R$ {valor_deposito:.2f} reais. O saldo atual é R$ {self.saldo:.2f} reais.\nTenha um ótimo dia :) !!!")

        else:
            print("\nOperação Cancela.Por favor deposite um valor válido")

    #__________________________________________________________________________________
    #Função para sacar dinheiro

    def sacar_dinheiro(self,valor_sacado):
        if self.saldo-valor_sacado<self._limite_conta() or valor_sacado<=0:
            print("\nOperação Cancelada.Por favor, saque um valor válido")
        else:
            self.saldo-=valor_sacado
            self.transacoes.append(("Saque",-valor_sacado,self.saldo+valor_sacado,self.saldo,ContaBancaria._data_hora()))
            print(f"\nFoi sacado R$ {valor_sacado:.2f} reais.\nO saldo atual é R$ {self.saldo:.2f} reais.\nTenha um ótimo dia :) !!!")


    # __________________________________________________________________________________
    #Função para consultar o saldo da conta

    def consultar_saldo(self):
        print(f"\nO saldo de {self.nome} atualmente é R$ {self.saldo:.2f} reais.\nTenha um ótimo dia :) !!!")


    # __________________________________________________________________________________
    #Função para transferir dinheiro de uma conta para outra

    def transferir_dinheiro(self,conta_transferida,valor_transferido):
        if valor_transferido>self.saldo or valor_transferido<=0:
            print("\nOperação Cancelada. Por favor digite um valor válido")

        else:
            conta_transferida.saldo+=valor_transferido
            self.saldo-=valor_transferido

            self.transacoes.append(("Transferencia", -valor_transferido, self.saldo+valor_transferido,self.saldo, ContaBancaria._data_hora()))
            conta_transferida.transacoes.append(("Transferencia",valor_transferido,conta_transferida.saldo-valor_transferido,conta_transferida.saldo,ContaBancaria._data_hora()))

            print(f"\nTransferência realizada de R$ {valor_transferido:.2f} reais para {conta_transferida.nome}.")
            self.consultar_saldo()


    # __________________________________________________________________________________
    #Criar limite

    def _limite_conta(self):
        self.limite = -1000
        return self.limite

    # __________________________________________________________________________________
    # Histórico de transações

    def consultar_historico_transacoes(self):
        print("Histórico de Transações")
        for tipo,valor,saldo_anterior,saldo_atual,horaraio in self.transacoes:
            print(f"Tipo: {tipo} | Valor: {valor} | Saldo Anterior: {saldo_anterior} | Saldo Atual: {saldo_atual} | Horario: {horaraio}")
            print("*"*30)


#____________________________________________________________________________________________________________

conta_Joao = ContaBancaria("João","500.500.500-40","100-1","54110-01",500)
conta_Pedro = ContaBancaria("Pedro","500.500.510-40","100-1","54110-02",500)

