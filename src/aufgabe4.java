public class aufgabe4 {
    //Markus will ein USB Laufwerk und eine Tastatur kaufen. Der Elektronik- Shop hat
    //verschiedene USB Laufwerke und Tastaturen mit verschiedene Preise.
    //Schreiben Sie eine Methode, welche die billigste Tastatur zurückgibt.
    public static int billigsteTastatur(int [] tastatur){
        int min=tastatur[0];
        for(int i=0;i<tastatur.length;i++){
            if(tastatur[i]<min){
                min=tastatur[i];
            }
        }
        return min;
    }

}
