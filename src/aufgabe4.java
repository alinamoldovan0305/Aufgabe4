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

    //Schreiben Sie eine Methode, welche das teuerste USB Laufwerk, das Markus kaufen
    //kann, zurückgibt
    public static int USBmitBudget(int [] USB, int budget){
        int [] leistbar= new int[USB.length];
        int index=0;
        for(int i=0;i<USB.length;i++){
            if(USB[i]<=budget){
                leistbar[index]=USB[i];
                index++;
            }
        }
        if(index==0){
            System.err.println("Unzureichendes Budget");
            return -1;
        }
        else {
            int max = leistbar[0];
            for (int i = 0; i < leistbar.length; i++) {
                if (leistbar[i] > max) {
                    max = leistbar[i];
                }
            }
            return max;
        }

    }

    //maximalen Geldbetrag
    public static int maximaleGeldbetrag(int [] tastatur, int [] USB, int budget){
        int max=-1;
        for(int i=0;i<tastatur.length;i++){
            for(int j=0;j<USB.length;j++){
                int sum=tastatur[i]+USB[j];
                if(sum<=budget && sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}
