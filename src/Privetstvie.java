/**
 * Created by Николай on 28.09.2014.
 */
public class Privetstvie {
    public static void main(String[] args) {
        String [] names = {"Никита","Стас","Гена","Турбо", "Дюша Метелкин"};
        String [] privet = new String[names.length];
        for (int i=0; i<names.length; i=i+1) {
            privet [i] = "Привет, " + names[i]+"!";
            System.out.println(privet[i]);
        }
    }
}