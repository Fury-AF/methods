public class MetodusokGyak1 {
    public static void main(String[] args) {
        kiir("%d+%d= %d\n"+osszead(3,4)+','+elso10SzamOsszege());
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
