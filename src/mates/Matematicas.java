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

    public static double generarNumeroPi(long numeroIntentos){ 
    double aciertos = 0.0; 
    double areaCuadrado = 4.0; 

        for(int i=1; i <= numeroIntentos ; i++){
            double x = Math.random()*2-1; 
            double y = Math.random()*2-1;
            if ((x*x) + (y*y) <= 1){ 
                numeroIntentos++; 
                aciertos++; 
            }
            } 
    double radio = 1.0; 
    double areaCirculo = areaCuadrado * (aciertos/numeroIntentos); 
    double aproximacionPi = areaCirculo/Math.pow(radio, 2);
    return aproximacionPi; 
    }
}
