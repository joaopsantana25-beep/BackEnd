#Primeira Orientacao a objeto
'''class MyString(Sequence[str]):

    def casefold(self) -> str:
        return self.lower()

    def center(selfself,_width:int,_fillchar:str='') -> str:
        return self.center(_width,_fillchar)

    def count(self,x: str, _start: Optional[int] =0,_end: Optional[int] = None) ->int:
        return self.count(x,_start,_end)
'''

class tv:
    def __init__(self,nome,cor,tamanho):
        self.nome = nome
        self.cor=cor
        self.ligada = False
        self.tamanho = tamanho
        self.canal="Netlifx"
        self.volume = 16

    def mudar_canal(self, novo_canal):
        self.canal=novo_canal
        print(f"\nTv {self.nome} Canal mudado para: {self.canal}")

    def mudar_volume(self):
        self.volume = 20
        print(f"\nTv {self.nome} Volume alterado para: {self.volume}")

    def ligar_desligar(self):
        self.ligada = not self.ligada
        estado = "ligou" if self.ligada else "desligou"
        print(f"\nTv {self.nome} {estado}")

tv_sala = tv("Sala","Branca","55")
tv_quarto = tv("Quarto","Preto","30")

print(f'\nA Tv {tv_sala.nome} é {tv_sala.cor} e seu tamanho é {tv_sala.tamanho}"')
print(f'\nA Tv {tv_quarto.nome} é {tv_quarto.cor} e seu tamanho é {tv_quarto.tamanho}"')