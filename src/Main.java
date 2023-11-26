// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String text1 = "Buongiorno";
        String text2 = "buongiorno";
        comparaStringhe("CIAO","CIAO");
    }
    static  void comparaStringhe(String text1,String text2){
        String risultato;
        if(text1.equals(text2)){
            risultato =  "Le due stringhe sono uguali";
        }
        else
            risultato = "Le due stringhe sono diverse";
        System.out.println(risultato);
    }

}