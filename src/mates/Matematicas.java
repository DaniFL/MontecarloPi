package mates;
public class Matematicas {

    public static double generarNumeroPi(long numeroIntentos){ 
    long aciertos = 0; 
    long areaCuadrado = 4; 

        for(int i=1; i <= numeroIntentos ; i++){
            double x = Math.random()*2-1; 
            double y = Math.random()*2-1;
            if ((x*x) + (y*y) <= 1){
                aciertos = aciertos++; 
            }
            } 
    int radio = 1; 
    long areaCirculo = areaCuadrado * (aciertos/numeroIntentos); 
    double aproximacionPi = areaCirculo/Math.pow(radio, 2);
    return aproximacionPi; 
    }
}
