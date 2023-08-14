/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportadora;

/**
 *
 * @author Leonardo
 */
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes
        Transportadora transportadoraNautica = new TransporteNautico();
        Transportadora transportadoraTerrestre = new TransporteTerrestre();

        
        int altura = 5;
        int largura = 10;
        
        // Calculando o frete para transporte náutico e terrestre
        double freteNautico = transportadoraNautica.calculaFrete(altura, largura);
        double freteTerrestre = transportadoraTerrestre.calculaFrete(altura, largura);

        System.out.println("Frete para transporte náutico: " + freteNautico);
        System.out.println("Frete para transporte terrestre: " + freteTerrestre);
    }
}