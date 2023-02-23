public class MetodusokGyak1 {
    public static void main(String[] args) {
        int osszeg=elso10SzamOsszege();
        String kimenet="Az első 10 szám összege:"+ osszeg+"\n";

        int szam1=7 , szam2=4;
        kiir("%d+%d= %d\n".formatted(szam1, szam2, osszeg));



        int szam3=14,szam4=8;
        int osszeg2=osszead(osszead(szam1,szam2),osszead(szam3,szam4));

        kiir("%d+%d+%d+%d= %d\n".formatted(szam1,szam2,szam3,szam4,osszeg2));


    }
    private static int elso10SzamOsszege(){
        int osszeg=0;
        for (int i =0 ; i<10 ;i++){
            osszeg+=1;
        }
        return osszeg;
    }
    private static void kiir(String szoveg){
        System.out.println(szoveg);
    }
    private static int osszead(int a, int b){
      return a+b;
    }
}
