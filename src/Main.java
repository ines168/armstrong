public class Main {
    public static void main(String[] args) {
        //Armstrong brojevi do 10000, brojevi jednaki sumi kubova svojih znamenaka
        int maxBroj =100000;
        int suma;
        for(int i=100; i<= maxBroj; i++) {
            suma = 0; //resetiraj sumu
            int testiraniBroj = i;
            int testBrojZnamenke = i;
            int brojZnamenaka = 0;

            //otkrij broj znamenaka
            while (testBrojZnamenke > 0) {
                testBrojZnamenke /= 10;
                brojZnamenaka++;
            }

            //odvoji znamenke, potenciraj i zbroji
            while (testiraniBroj > 0) {
                int znam = testiraniBroj % 10;
                suma += Math.pow(znam, brojZnamenaka);
                testiraniBroj /= 10;
            }

            if(suma == i) {
                System.out.println(i);
            }


        }
    }
}
