package org.example.tema2.exercitiu4;

public class Main {
    public static void main(String[] args) {
        SistemPropiu sistemPropriu = new SistemPropiu();
        SistemExistent sistemExistent = new SistemExistent();
        AdaptorJsonToXml adaptor = new AdaptorJsonToXml(sistemExistent);

        String json = sistemPropriu.genereazaJSON();
        adaptor.trimiteDate(json);//xml: <data><nume>Barbu</nume><varsta>18</varsta></data>

        //Explicatie de ce clasele adaptor pot fi utile in aplicatii reale:
// Clasele adaptor ajuta la integrarea unor sisteme incompatibile fara a modifica codul existent.
// Astfel dependenta scade, fara a fi nevoie sa aduce modificari la codul existent, fiind o metoda flexibila de comunicare
    }
}