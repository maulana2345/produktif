package pkgstatic;
public class minggu5 {
    
    public static void main(String[] args) {
        minggu5 m5 = new minggu5(); /*UNTUK VOID NON STATIC
                                     m5 ITU OBJECT*/
        mStatic();  //VOID STATIC                         
        m5.penjumlahan(); //VOID NON STATIC
        System.out.println(m5.perhitungan()); //NON VOID NON STATIC      
        classB cB = new classB(); //UNTUK VOID BEDA CLASS
        cB.pembagian(); //UNTUK CLASS B PEMBAGIAN
        
        
    }
    
    //KONTRUKSI
    public minggu5(){
        System.out.println("INI ADALAH KONSTRUKTOR");
    }
    
    //VOID STATIC
    public static void mStatic(){
        System.out.println("BLA");
    }
    
    //VOID NON STATIC
    public void penjumlahan(){
        System.out.println("BLE");
    }
    
    //NON VOID NON STATIC
    public int perhitungan(){
        int a = 1;
        int b = 2;
        int c = a + b;
        return c;                
    }    
    
   
}
