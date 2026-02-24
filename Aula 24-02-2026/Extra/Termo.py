#Esse projeto tem como objetivo criar um protótipo do termo para passar depois para o canva

import os

def limpar_terminal():
    os.system('cls' if os.name == 'nt' else 'clear')



resposta = "perto"
numero_de_tentativas = 6
tamanho_da_resposta=len(resposta)
letras_acertadas=["_"]*tamanho_da_resposta


def Conferencia(chute):
    for letra in chute:
        if letra in resposta and letra not in letras_acertadas:
                print(f"A letra '{letra}' está na resposta")

    for i in range(tamanho_da_resposta):
        if chute[i] == resposta[i]:
            letras_acertadas[i] = chute[i]
    
   

def Tentativas():
    global numero_de_tentativas

    numero_de_tentativas-=1

    if numero_de_tentativas>=1:
        print(f"Você tem mais {numero_de_tentativas} tentativas")

    if numero_de_tentativas==0:
        limpar_terminal()
        print("Acabou as tentativas")
        print(f"A palavra era '{resposta}'. Obrigado por jogar!!!")
        
def Checar_tentativas():
    global numero_de_tentativas

    if numero_de_tentativas==0:
        return True
    return False

def Simbolo():
    print("\n" + " ".join(letras_acertadas) + "\n")

while True:
    Simbolo()
    guess = input("Insira a palavra: ")

    if not guess:
        print("Por favor insira algo!")
        continue

    if len(guess)!=tamanho_da_resposta:
        print(f"A palavra digitada deve possuir {tamanho_da_resposta} letras")
        continue


    if guess==resposta:
        print(f"Parabéns, a resposta era '{resposta}'")
        break

    Conferencia(guess)

    Tentativas()
    if Checar_tentativas():
        break
 

    continuar = input("Aperte enter para continuar: ")

    if continuar == "sair":
        print("Obrigado por jogar")
        break

    else:
        limpar_terminal()


