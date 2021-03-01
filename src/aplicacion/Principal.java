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
package aplicacion;
//Importa las variables de la clase Matemáticas
import mates.Matematicas;

public class Principal {
    
    //Método Main sobre el que se inicializa la ejecución del programa   
    public static void main(String[] args) {
            //Esta variable almacena el valor de intentos realizados
            long numeroIntentos = Long.parseLong(args[0]);
            //Imprime por pantalla el resultado del programa 
            System.out.print("El número PI es: " + Matematicas.generarNumeroPi(numeroIntentos));
        
    }
}
