from psutil import cpu_freq


class ContaBancaria:

    def __init__(self, nome,cpf,saldo=0):
        self.nome = nome
        self.cpf = cpf
        self.saldo = saldo

    def depositar_dinheiro(self,valor_deposito):
        if valor_deposito>0:
            self.saldo+=valor_deposito
            print(f"\nFoi depositado R$ {valor_deposito:.2f} reais. O saldo atual é R$ {self.saldo:.2f} reais.\nTenha um ótimo dia :) !!!")
        else:
            print("\nOperação Cancela.Por favor deposite um valor válido")

    def sacar_dinheiro(self,valor_sacado):
        if valor_sacado>self.saldo or valor_sacado<=0:
            print("\nOperação Cancelada.Por favor, saque um valor válido")
        else:
            self.saldo-=valor_sacado
            print(f"\nFoi sacado R$ {valor_sacado:.2f} reais.\nO saldo atual é R$ {self.saldo:.2f} reais.\nTenha um ótimo dia :) !!!")

    def consultar_saldo(self):
        print(f"\nO saldo de {self.nome} atualmente é R$ {self.saldo:.2f} reais.\nTenha um ótimo dia :) !!!")

    def transferir_dinheiro(self,conta_transferida,valor_transferido):
        if valor_transferido>self.saldo or valor_transferido<=0:
            print("\nOperação Cancelada. Por favor digite um valor válido")
        else:
            conta_transferida.saldo+=valor_transferido
            self.saldo-=valor_transferido
            print(f"\nTransferência realizada de R$ {valor_transferido:.2f} reais para {conta_transferida.nome}.")
            self.consultar_saldo()






conta_Joao = ContaBancaria("João","500.500.500-40",500)
conta_Pedro=ContaBancaria("Pedro","500.500.500-45",500)

conta_Joao.consultar_saldo()
conta_Pedro.consultar_saldo()

conta_Pedro.transferir_dinheiro(conta_Joao,500)

conta_Joao.consultar_saldo()
conta_Pedro.consultar_saldo()
