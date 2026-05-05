import pygame
import sys

# 1. Inicialização
pygame.init()
screen = pygame.display.set_mode((600, 200))
clock = pygame.time.Clock()
font = pygame.font.SysFont("Arial", 40)

# Variáveis do input
user_text = ''
input_rect = pygame.Rect(150, 80, 300, 50) # Retângulo para "caixa" de texto
color_active = pygame.Color('lightskyblue3')
color_passive = pygame.Color('gray15')
color = color_passive
active = False

run = True
while run:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False
            
        if event.type == pygame.MOUSEBUTTONDOWN:
            if input_rect.collidepoint(event.pos):
                active = True
            else:
                active = False
        
        # 2. Processar entrada de teclado
        if active:
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_BACKSPACE:
                    user_text = user_text[:-1] # Apaga o último caractere
                elif event.key == pygame.K_RETURN:
                    print(f"Texto digitado: {user_text}") # Exemplo de uso
                else:
                    user_text += event.unicode # Adiciona o caractere

    # Desenho
    screen.fill((30, 30, 30))
    
    # Atualiza cor da caixa se ativo/passivo
    if active:
        color = color_active
    else:
        color = color_passive
        
    pygame.draw.rect(screen, color, input_rect, 2)
    
    # 3. Renderizar o texto
    text_surface = font.render(user_text, True, (255, 255, 255))
    screen.blit(text_surface, (input_rect.x + 5, input_rect.y + 5))
    
    # Ajusta o tamanho da caixa se o texto for grande
    input_rect.w = max(250, text_surface.get_width() + 10)
    
    pygame.display.flip()
    clock.tick(60)

pygame.quit()
sys.exit()
