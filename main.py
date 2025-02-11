import sys

def paridad(num):
    """Determina si el numero es par o impar, e imprime los numeros pares/impares respectivamente en orden descendiente hasta el 0/1"""
    if num % 2 == 0:            # Determina paridad del numero
        print("Par")
    else: 
        print("Impar")

    # No hace falta comprobar cada la paridad de numero, iterando cada 2 numeros nos deja con los numeros deseados
    if num < 0:                 # Caso para numeros negativos
        for i in range(num,1,2):       # Desde numero (negativo), hasta +1, aumentando de 2 en 2
            print(i)
    else:                       # Caso numeros positivos
        for i in range(num,-1,-2):      # Desde numero, hasta -1, descendiendo de 2 en 2
            print(i)


def ejercicio_1():
    NUMERO = input("Introduzca un numero entero:")
    try:
        num = int(NUMERO)
        paridad(num)

    except ValueError:
        print("Debe ser un numero entero")
    
def estadisticas_personas(lista):
    """Imprime estadísticas de sexo y edad de la lista de personas que recibe"""
    total = len(lista)
    cont = 0        # Mayores de edad
    cont2 = 0       # Mujeres
    cont3 = 0       # Hombres mayores de edad
    cont4 = 0       # Mujeres menores de edad
   
    for persona in lista:
        if persona[1] >= 18:
            cont += 1
            if persona[0] == 'M':
                cont3 +=1
        if persona[0] == 'F':
            cont2 += 1
            if persona[1] < 18:
                cont4 += 1        
            
    print(f"Cantidad de personas mayores de edad: {cont}")
    print(f"Cantidad de personas menores de edad: {total - cont}")
    print(f"Cantidad de personas masculinas mayores de edad: {cont3}")
    print(f"Cantidad de personas femeninas menores de edad: {cont4}")
    print(f"Porcentaje de mayores de edad respecto al total: {cont2/total:.2f}%")
    print(f"Porcentaje de mujeres respecto al total: {(cont2)/total:.2f}%")
    

def ejercicio_2():
    lista_sexos = ['M','F','M','M','M','F','M','F','F','F','M']     # M = 'Male' -- F = 'Female'
    lista_edades = [16,32,27,12,13,23,29,13,17,21,50]
    lista_ejemplo = [(sexo, edad) for sexo, edad in zip(lista_sexos,lista_edades)]
    print(f"Lista de ejemplo: {lista_ejemplo}")
    estadisticas_personas(lista_ejemplo)
    if len(sys.argv) > 1:           # Si hay argumentos en la ejecución    
        PERSONAS = sys.argv[1]      # Se pasaría el vector de datos como parámetro al ejecutar el programa (main.py)
        estadisticas_personas(PERSONAS)     # Ver las estadísticas de la lista que se ha pasado como input.
  


if __name__ == "__main__":
    ejercicio_1()
    ejercicio_2()
    