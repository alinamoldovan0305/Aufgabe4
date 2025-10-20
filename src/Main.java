public class Main {
    public static void main(String[] args) {
        int [] tastatur={30, 45, 60, 20, 55};
        int [] USB={30, 45, 15, 35};
        int budget=50;
        //1-ter Unterpunkt
        System.out.println("Billligste Tastatur ist: "+aufgabe4.billigsteTastatur(tastatur));
        //2-ter Unterpunkt
        System.out.println("Teurster Gegenstand ist: "+aufgabe4.teuerstenGegenstand(tastatur, USB));
        //3-ter Unterpunkt
        System.out.println("Teuerste USB aber mit Budget: "+aufgabe4.USBmitBudget(USB, budget));
        //4-ter Unterpunkt
        System.out.println("Tastatur und USB mit Budget: "+aufgabe4.maximaleGeldbetrag(tastatur,USB,budget));
    }
}