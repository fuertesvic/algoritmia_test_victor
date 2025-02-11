
def paridad(num):
    """Determina si el numero es par o impar, e imprime los numeros pares/impares respectivamente en orden descendiente hasta el 0/1"""
    if num % 2 == 0:            # Determina paridad del numero
        print("Par")
    else: 
        print("Impar")

    # Imprime todos los pares/impares descendientes hasta 0/1
    # No hace falta comprobar cada la paridad de numero, iterando cada 2 numeros nos deja con los numeros deseados.


    if num < 0:                 # Caso para numeros negativos
        for i in range(0,num,-2):       
            print(num-i)
    else:
        for i in range(0,num,2):
            print(num-i)


def ejercicio_1():
    NUMERO = input("Introduzca un numero entero:")
    try:
        num = int(NUMERO)
    except ValueError:
        print("Debe ser un numero entero")
    paridad(num)

if __name__ == "__main__":
    ejercicio_1()