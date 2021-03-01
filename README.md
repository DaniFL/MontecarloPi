Copyright [2021] [Daniel Fernández López]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

# Creador: 

* Daniel Fernández López 
# Objetivo: 

Este programa ha sido diseñado para poder realizar una aproximación al número Pi a partir del método de Monte Carlo.

El método de Monte Carlo consiste en inscribir una circunferencia dentro un cuadrado, (siendo el diámetro de la circunferencia igual que uno de los lados del cuadrado) y mediante la generación de puntos aleatorios sobre la superficie dibujada se establece una relación entre los puntos interiores (aciertos) y puntos totales; con la que se podrá llevar a cabo la aproximción. 

Además, de esta manera suponemos que ambas figuras se encontrarán representadas en los ejes de coordenadas (X) e (Y), situando el centro del círculo en el punto (0,0) y los cuatro vértices del cuadrado en los puntos (-1,-1), (-1,1), (1,-1), (1,1).


# Funcionalidad: 

* Para inicializar el programa: "java -jar ap-Matematicas.jar 100000"
