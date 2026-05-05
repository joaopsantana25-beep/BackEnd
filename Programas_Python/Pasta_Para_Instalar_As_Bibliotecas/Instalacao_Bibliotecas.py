import pyautogui as gui

gui.PAUSE=2

gui.hotkey('ctrl','"')
gui.write("pip install -r 'D:/Joao_Santana/Segundo Semestre/BackEnd2/Pasta_Para_Instalar_As_Bibliotecas/Bibliotecas.txt'")
gui.press('enter')