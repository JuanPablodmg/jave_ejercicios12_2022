/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel2;

/**
 *
 * @author xp
 */
public class EjerciciosNivel2 {
    public boolean esEscaleraPalabras(char[][] listaPalabras){
    
        for (int i=0; i<listaPalabras.length-1; i++){
            int contador = 0;
            for (int j=0; j<listaPalabras[0].length; j++){
            if (listaPalabras[i][j] != listaPalabras[i+1][j]){
            contador++;
        }
    }
            if (contador != 1){//si contador es distinto de uno retorna falso
                //se diferencia en mas de una caracter
                return false;
                
        }
                

    }
            return true;
    }
    public boolean esEscaleraDePalabras2(char[][] lista){
        for (int j=0; j<lista.length-1; j++){
          
        int contador = 0;
        for( int i = 0; i<lista[0].length; i++){
            if (lista[j][i] != lista[j+1][i]){
                contador ++;
            }
        }
        if (contador != 1){
            return false;
        }
        }
        
        return true;
    }
    private int costeErroresADN (String uno, String dos){
        int coste = 0;
        for(int i=0; i<uno.length(); i++){
        if(uno.charAt(i)=='-' || dos.charAt(i)=='-'){coste+=2;}
        else{
            if(uno.charAt(i)=='C' && dos.charAt(i)!='G'){
                if(uno.charAt(i)=='G' && dos.charAt(i)!='C'){
                    if(uno.charAt(i)=='A' && dos.charAt(i)!='T'){
                        if(uno.charAt(i)=='T' && dos.charAt(i)!='A'){
                            coste ++;
                            }
                        }
                    }
                }
            }
        }
        return coste;
    }
    public int comparaDosStrings(String cadena1, String cadena2){
        for (int i=0; i< cadena1.length(); i++){
            int contadorFallos = 0;
                for (int j=i+1; j< cadena2.length(); j++){
                    if (cadena1.charAt(i) != cadena2.charAt(j)){
                        return ++contadorFallos;
                    }else{
                        return 0;
                    }
                }
            }
        return 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [][] listaPalabras = { 
            {'P', 'A', 'T', 'A'}, 
            {'P', 'A', 'T', 'O'}, 
            {'R', 'A', 'T', 'O'}, 
            {'R', 'A', 'M', 'O'}, 
            {'G', 'A', 'M', 'O'}, 
            {'G', 'A', 'T', 'O'}, 
            {'M', 'A', 'T', 'O'}
        };
        EjerciciosNivel2 e = new EjerciciosNivel2();
        System.out.println(e.esEscaleraPalabras(listaPalabras));
        System.out.println(e.esEscaleraDePalabras2(listaPalabras));
        System.out.println(e.costeErroresADN("ACGT", "TGCA"));
        System.out.println(e.costeErroresADN("TTTT", "TTTA"));
                System.out.println(e.costeErroresADN("T-TT", "AAAA"));

        }
    }
