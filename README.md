# Preparando la Receta

## Descripción del problema
Ricardo es un excelente cocinero. No
hay receta que no sea capaz de preparar.
¡El problema es que a menudo olvida
comprar los ingredientes!
Por esta razón, decidió preparar un
listado de los ingredientes que tiene en
la heladera. La heladera contiene en total
H ingredientes. Además de este, decidió
preparar un listado de los ingredientes que
necesita para la receta que le interesa
cocinar. Para esta receta se necesitan R
ingredientes.
Como es algo desorganizado al redactar,
a veces hay ingredientes repetidos
(de forma innecesaria) en estos listados.
Debes ayudar a Ricardo escribiendo
una función que determine cuántos ingredientes
le faltan, y (para puntaje completo)
cuáles son.

## Detalles de implementación
Debes implementar la función
receta(heladera,ingredientes,faltantes),
que dados dos arreglos de strings
heladera e ingredientes con todos los
ingredientes presentes en la heladera y
los necesarios para la receta, respectivamente;
retorne la cantidad de ingredientes
que hace falta comprar para que Ricardo
prepare la receta. Además, la función
debe almacenar un listado de estos
ingredientes (sin repetir) en el parámetro
faltantes. Cualquier orden en el que se
listen los ingredientes es válido.

## Evaluador local
El evaluador local lee de la entrada
estándar:
Una primera línea con dos enteros,
correspondientes a H y R: la cantidad
de ingredientes en la heladera, y
la cantidad de ingredientes necesarios
para la receta, en ese orden.
Una segunda línea con los H nombres
de los ingredientes de la heladera,
separados por espacios.
Una tercera línea con los R nombres
de los ingredientes necesarios para
la receta, separados por espacios.
Devuelve dos líneas por la salida estándar.
El resultado de llamar a la función
receta en la primera línea, y el listado
almacenado en el parámetro faltantes
en la segunda línea, con las palabras
separadas por espacio.

## Cotas
```
0 <= H <= 1.000
1 <= R <= 1.000
```
Los nombres de los ingredientes tendrán
a lo sumo 8 letras, y utilizarán
únicamente letras minúsculas del
alfabeto inglés (compuesto por 26
letras desde ’a’ hasta ’z’).

## Example
Input:
```
4 8
limon limon pan panceta
limon palometa choclo pan limon papa cordero papa
```
Output:
```
4
papa choclo cordero palometa
```
Notar que en algunos casos puede haber
ingredientes repetidos en la receta y/o
en la heladera (pero el resultado deberá
ser el mismo que si aparecieran una única
vez).
