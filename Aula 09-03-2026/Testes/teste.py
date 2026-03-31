import matplotlib.pyplot as plt

x=[]
y=[]

for i in range (-5000,5000,1):
    x.append(i/100)

for valor in x:
    y.append(valor**2 - 5)


plt.plot(x,y)
plt.xlabel("Eixo X")
plt.xlabel("Eixo Y")
plt.title("Mostrar um função de segundo grau")
plt.grid(True)
plt.show()