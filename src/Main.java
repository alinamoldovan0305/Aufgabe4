public class Main {
    public static void main(String[] args) {
        int [] tastatur={30, 45, 60, 20, 55};
        int [] USB={30, 50, 15, 35};
        //1-ter Unterpunkt
        System.out.println("Billligste Tastatur ist: "+aufgabe4.billigsteTastatur(tastatur));
        //2-ter Unterpunkt
        System.out.println("Teurster Gegenstand ist: "+aufgabe4.teuerstenGegenstand(tastatur, USB));
    }
}