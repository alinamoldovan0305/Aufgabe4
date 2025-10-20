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
    //Schreiben Sie eine Methode, welche den teuersten Gegenstand zurückgibt.
    public static int teuerstenGegenstand(int [] tastatur, int [] USB){
        int max=tastatur[0];
        for(int i=0;i<tastatur.length;i++){
        if(tastatur[i]>max)
            max=tastatur[i];
        }
        for(int i=0;i<USB.length;i++){
            if(USB[i]>max)
                max=USB[i];
        }
        return max;
    }

    }
