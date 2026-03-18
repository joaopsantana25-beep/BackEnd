#Conta Corrente
#----------------

from datetime import datetime
import pytz
from random import randint


class ContaCorrente:

    @staticmethod
    def _data_hora():
        fusoBR = pytz.timezone('Brazil/East')
        horario_BR = datetime.now(fusoBR)
        return horario_BR.strftime('%d/%m/%Y %H:%M:%S')

    def __init__(self, nome, cpf, agencia, num_conta):
        self._nome = nome
        self.cpf = cpf
        self.__saldo = 0
        self.limite = -1000  # Definindo o limite diretamente
        self.agencia = agencia
        self.num_conta = num_conta
        self.transacoes = []
        self._cartoes = []


    #criação do cartão de credito

    class CartaoCredito:

#criação da def
        def __init__(self, titular, conta_corrente):
            self.numero = None
            self.titular = titular
            self.validade = None
            self.cod_seguranca = None
            self.limite = None
            self.conta_corrente = conta_corrente
            conta_corrente._cartoes.append(self)



    def consultar_saldo(self):
        print("Seu saldo atual é de R${:.2f}".format(self.__saldo))

    def depositar_dinheiro(self, valor):
        self.__saldo += valor
        self.transacoes.append((valor, self.__saldo, ContaCorrente._data_hora()))  # Corrigido para uma tupla
        print(f"Você depositou R${valor:.2f}. Seu novo saldo é R${self.__saldo:.2f}")

    def sacar_dinheiro(self, valor):
        if self.__saldo - valor < self.limite:
            print('Você não tem saldo suficiente para sacar esse valor.')
            self.consultar_saldo()
        else:
            self.__saldo -= valor
            self.transacoes.append((valor, self.__saldo, ContaCorrente._data_hora()))  # Corrigido para uma tupla
            print(f"Você sacou R${valor:.2f}. Seu novo saldo é R${self.__saldo:.2f}")

    #transferir para outra conta corrente
    def transferir(self, valor, conta_destino):
        self.__saldo -= valor
        self.transacoes.append((-valor, self.__saldo, ContaCorrente._data_hora()))
        conta_destino.__saldo += valor
        conta_destino.transacoes.append((valor, conta_destino.__saldo, ContaCorrente._data_hora()))


    def consultar_historico_transacoes(self):
        print('Histórico de Transações:')
        for transacao in self.transacoes:
            print(f"Valor: R${transacao[0]:.2f} | Saldo: R${transacao[1]:.2f} | Data: {transacao[2]}")


# Programa principal

# Conta do Pedro
conta_pedro = ContaCorrente("Pedro", "165.235.718-95", "Agência 123", "12345-6")


'''
# Consultando saldo
conta_pedro.consultar_saldo()

# Depositando dinheiro na conta
conta_pedro.depositar_dinheiro(1000)

# Consultando saldo após depósito
conta_pedro.consultar_saldo()

# Sacando dinheiro
conta_pedro.sacar_dinheiro(1100)

# Consultando saldo após saque
conta_pedro.consultar_saldo()

#transferência para outra conta
conta_mae_Pedro = ContaCorrente("Maria", "142.125.814-93", 5555, 656565)
conta_pedro.transferir(200, conta_mae_Pedro)

# Consultando o histórico de transações
conta_pedro.consultar_historico_transacoes()
conta_mae_Pedro.consultar_historico_transacoes()



'''

#Cartão de credito

from datetime import datetime
import pytz
from random import randint

 #criar uma classe
class CartaoCredito:
    @staticmethod

#definir os atributos
    def __init__(self, titular, conta_corrente):
        self.numero = 1000000,999999
        self.titular = titular
        self.validade ='{}/{}'.format(
            CartaoCredito._data_hora().month,
            CartaoCredito._data_hora().year+4)

        self.cod_seguranca = '{}{}{}'.format(
            randint(0,9),randint(0,9),randint(0,9)
        )
        self.limite = 1000
        self._senha ='1234'
        self.conta_corrente = conta_corrente
        conta_corrente._cartoes.append(self)

    #metodo getter
    @property
    def senha(self):
        return self._senha

    # metodo setter
    @senha.setter
    def senha(self,valor):
        if len(valor)==4 and valor.isnumeric():
            self._senha = valor
        else:
            print("Nova senha incorreta!!!")


#cartão de Credito
cartao_pedro = ContaCorrente.CartaoCredito("Pedro", conta_pedro)
#print(" O número do cartão é:", cartao_pedro.conta_corrente.num_conta)
cartao_pedro.numero =123


cartao_pedro=ContaCorrente.CartaoCredito("Pedro", conta_pedro)
cartao_pedro.numero ="1234-5678-9101-1121"
cartao_pedro.senha=1234

print(cartao_pedro.numero,
      cartao_pedro.titular,
      cartao_pedro.validade,
      cartao_pedro.cod_seguranca,
      cartao_pedro.limite
      )

print(cartao_pedro.__dict__)