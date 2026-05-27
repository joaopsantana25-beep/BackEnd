import pygame
pygame.init()

# Configuração da tela
tela = pygame.display.set_mode((400, 300))
cor = (0, 128, 255) # Azul
centro = (200, 150)
raio = 50

# Loop do jogo
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
    
    tela.fill((255, 255, 255)) # Fundo branco
    # Desenhar: superfície, cor, centro, raio, espessura(0=preenchido)
    pygame.draw.circle(tela, cor, centro, raio, 2)
    pygame.display.flip()

pygame.quit()
