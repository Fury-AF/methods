public class MetodusokGyak1 {

   /* A main-ben csak egy metodus legyen a többit szervezzük ki*/

    public static void main(String[] args) {
    feladatok();

    }
    private static void feladatok(){
        f1_Elso10SzamOsszegeKiiras();
    }

    private static void f1_Elso10SzamOsszegeKiiras(){

        int osszeg=elso10SzamOsszege();
        String kimenet="Az első 10 szám összege:"+ osszeg+"\n";
        System.out.println(kimenet);

    }



   /*Amit ki kell szervezni */
    /*public static void main(String[] args) {

        int osszeg=elso10SzamOsszege();
        String kimenet="Az első 10 szám összege:"+ osszeg+"\n";

        int szam1=7 , szam2=4;
        kiir("%d+%d= %d\n".formatted(szam1, szam2, osszeg));



        int szam3=14,szam4=8;
        int osszeg2=osszead(osszead(szam1,szam2),osszead(szam3,szam4));

        kiir("%d+%d+%d+%d= %d\n".formatted(szam1,szam2,szam3,szam4,osszeg2));

       int osszeg3= osszead(osszead(szam1,szam2),szam3);
       double gyok=Math.sqrt(osszeg3);
       String s="%d+%d+%d= %d\n".formatted(szam1,szam2,szam3);
       kimenet=String.format("s% %.4f\n", s,gyok);
       kiir(kimenet);

    }*/
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
