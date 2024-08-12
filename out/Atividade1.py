def ComprimentoLista(tamanho):
    for cont in range(tamanho):
        valor = int(input('Digite um valor: '))
        valores.append(valor)
        print(valores)
    return valores

def VerificarLista(valores):
    for cont in range(len(valores)):
        if valores[cont] % 2 == 0:
            print(f'{valores[cont]} - Número par')
        elif valores[cont] % 3 == 0:
            print(f'{valores[cont]} - Número múltiplo por 3')
        else:
            print(f'{valores[cont]} - Número impar')
    return valores

valores = []
tamanho = int(input('Digite o tamanho da lista: '))
preencherlista = ComprimentoLista(tamanho)
print('---------------Resultado---------------')
resultado = VerificarLista(valores)
 