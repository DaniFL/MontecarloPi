/*
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
*/
package mates;
public class Matematicas {
    //Método constructor de programa que devuleve la aproximación al número Pi 
    public static double generarNumeroPi(long numeroIntentos){ 
    //Esta variable almacena los puntos que caen aleatoriamente en la circunferencia
    double aciertos = 0.0; 
    //Esta variable delimita la superficie sobre la que se lanzarán aleatoriamente los puntos
    double areaCuadrado = 4.0; 
        //Bucle (estructura lógica) que permite realizar una acción de manera reiterada siempre y cuando la condición expresada se cumpla
        for(int i=1; i <= numeroIntentos ; i++){
            //Creación de dos números aleatorios (x) e (y) comprendidos entre (-1) y (1)
            double x = Math.random()*2-1; 
            double y = Math.random()*2-1;
            //Bucle que realiza una acción si se cumple la condición establecida, en este caso se sumará un intento y un acierto 
            if ((x*x) + (y*y) <= 1){ 
                numeroIntentos++; 
                aciertos++; 
            }
            } 
    //Esta variable almacena el valor del radio de la circunferencia
    double radio = 1.0; 
    //Esta variable define el cálculo del area de la circunferencia 
    double areaCirculo = areaCuadrado * (aciertos/numeroIntentos); 
    //Esta variable define el cálculo de la aproximación al número Pi 
    double aproximacionPi = areaCirculo/Math.pow(radio, 2);
    //Devuelve aproximación a Pi
    return aproximacionPi; 
    }
}
