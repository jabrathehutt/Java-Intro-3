
// Mit import kann man Module die von anderen Java Programmierern geschrieben wurden sind importieren und nutzen
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;



public class Main {


    // void steht für den Rückgabewert der Funktion. Es heißt, dass diese Funktion keinen Rückgabewert hat, da sie nur einen
    //String auf der Konsole ausgibt
    static void hallo(){
        System.out.println("Hallo");
    }

    //Diese Funktion nimmt einen String als Parameter in den runden Klammern, das heißt in der Main Methode kann dieser
    // Funktion ein String übergeben werden. Der Parameter dieser Funktion beschreibt nur den Datentyp während in der Main Methode
    // der konkrete Wert übergeben wird.
    static String begrüßung(String name){

        //Wenn eine Funktion einen Rückgabewert hat gibt man ihm mit dem return Keyword zurück
        return "Hallo mein Name ist " + name;
    }

    static int anzahlTageDesMonats(int monat){
        int tage=-1;
        // switch Statements sind eine Alternative zu langen if else Ketten
        switch(monat){
            case 1,3,5,7,8,10,12:
                tage = 31;
                break;
            case 2:
                tage = 28;
                break;
            case 4,6,9,11:
                tage = 30;
                break;

            default:
                tage = -1;



        }
        return tage;
    }

    public static int[] lotto(){
        Random random= new Random();
        int[] lottoZahlen=new int[7];
        for(int i=0;i<7;i++){
            lottoZahlen[i]=random.nextInt(1,50);
        }

        return lottoZahlen;
    }

    public void add(int element, ArrayList<Integer> liste){
        if(liste==null){
            System.out.println("Liste existiert nicht");

        }
        else{

        }
    }
    public static void main(String[] args) {

       // hallo();

        //Funktionsaufruf
        String name1="Viktor";

        System.out.println(begrüßung(name1));


        // Aufgabe 1: Implementiere die Funktion "square"

        String vorname="Viktor";
        // Es gibt speziell für Strings zur Verfügung gestellte Funktionen
        System.out.println(vorname.length());
        System.out.println(vorname.charAt(0));
        System.out.println(vorname.compareTo("viktor"));
        System.out.println(vorname.toLowerCase().compareTo("viktor"));

        // Funktionen mit Rückgabewert können in Variablen mit passenden Datentypen gespeichert werden
        int tageDesMonats = anzahlTageDesMonats(8);
        System.out.println(tageDesMonats);
        System.out.println(Arrays.toString(lotto()));

        //Listen sind wie Arrays, aber die Größe der Liste kann sich verändern. Man kann ihnen Elemente hinzufügen oder entfernen

        ArrayList<Integer> zahlen=new ArrayList<>();
        System.out.println(zahlen.size());

        //Aufgabe 2: Schreibe eine Funktion addElement die der Liste das als Parameter übergebene Element hinzufügt. Tipp gebe zahlen. ein
        // um die verfügbaren Funktionen des Listenmoduls sehen

        // Aufgabe 3: Schreibe eine Funktion removeElement, die der Liste das Element am übergebenen Index entfert

        // Aufgabe 4: Schreibe eine Funktion setElement, die der Liste das Element am übergebenen Index entfert

        // Aufgabe 5: Führe ein paar der vorher beschriebenen Funktionen über Funktionsaufrufe aus und printe die Liste nach jeder Operation
        // auf der Konsole. Benutze daführ zahlen.toString()

        // Aufgabe 6: Schreibe eine Funktion zifferToString die eine Zahl zwischen 0 und 9 als Parameter pbergeben bekommt
        // und diese Zahl als String ausgibt. Benutze ein switch Statement.


    }
}