/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondscalculator;
import java.util.*;
import java.io.*;
/**
  * @author Sack
 */
public class SecondsCalculator {
public static BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //PUNTO CLAVE: INICIALIZAR VARIABLES EN INT y UN CONTADOR
        int horas=0;
        int minutos=0;
        int segundos=0;
        int a=0;
        
        //PEDIMOS AL USUARIO QUE INGRESE SUS VALORES EN UNA MISMA LINEA
        System.out.println("<Buenas tardes mi estimado.>");
        //INICIO DEL CICLO DO WHILE
        
        while (horas>23 || horas<1 || minutos>60 || minutos<1 || segundos>60 || segundos<1  || a==1 ) {
        System.out.println("--------------------------------------");
        System.out.println("Ingresa el valor de tus horas, minutos y segundos separados por dos puntos");
        System.out.println("Ejemplo: 12:50:20 - NOTA: El máximo de horas es 23 y en lo demás 60");
    
    //EL USUARIO ESCRIBIRA EL TEXTO DE RESPUESTA
    String respuesta=(teclado.readLine());
    //EJEMPLO: respuesta="20:40:10";
    
    //CREAMOS UN NUEVO TOKENIZER EN FUNCION A LA RESPUESTA Y EL DELIMITADOR
    StringTokenizer calculo= new StringTokenizer(respuesta,":");
    
    //CICLO PARA REPETIR EJERCICIO EN CASO DE INGRESAR DATOS DE MAS, O DE MENOS
    if (calculo.countTokens()==3){
            
    //ASIGNAMOS A LAS VARIABLES EL VALOR DE CADA TOKEN
     horas=Integer.parseInt(calculo.nextToken());
     minutos=Integer.parseInt(calculo.nextToken());
    segundos=Integer.parseInt(calculo.nextToken());
    
    //INICIO DE CONDICIONES PARA MOSTRAR AL USUARIO
    if (horas>23 || horas<1){
        System.out.println("Escribe un valor de horas correcto");
    }
    if (minutos>60 || minutos<1){
        System.out.println("Escribe un valor de minutos correcto");
    }
    if (segundos>60 || segundos<1){
        System.out.println("Escribe un valor de segundos correcto");
    }
    //SE CIERRA EL BUCLE DE CONTAR LOS TOKENS DE TIEMPO
    a=0;
    
    //CIERRE DE PRIMER IF DEL CONTADOR DE TOKEN Y MOSTRAMOS MENSAJE DE ERROR
    }else {
        a=1;
        System.out.println("Ingresa EXACTAMENTE 3 valores: horas:minutos:segundos");
    }
    
    //CIERRE DEL CICLO WHILE, EL CUAL SIGUE LAS CONDICIONES PREVIAMENTE DADAS
        } 
        
    //REALIZAMOS LA OPERACION Y LA MOSTRAMOS AL USUARIO
    int operacion= (horas*3600)+(minutos*60)+segundos;
    System.out.println("///////////////////////////////////////");
        System.out.println("<Tus datos son>");
        System.out.println("Horas: "+horas+" \nMinutos: "+minutos+" \nSegundos: "+segundos);
        System.out.println("El total de segundos que tienes es de: "+operacion);
    }
    
}
