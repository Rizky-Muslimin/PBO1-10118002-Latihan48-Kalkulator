
package pbo1.pkg10118002.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA  : Rizky Muslimin
 * KELAS : IF 1
 * NIM   : 10118002
 * Deskripsi Program : Program ini untuk membuat operasi kalkulator.
 */
public class PBO110118002Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kalkulator objKal = new Kalkulator();
        objKal.setValue1(7.0);
        objKal.setValue2(5.0);
        System.out.println("VALUE 1 = "+objKal.getValue1());
        System.out.println("VALUE 2 = "+objKal.getValue2());
        objKal.setNameProject();
        objKal.setNoteProject("");
        System.out.println("Result Add is = "+objKal.add());
        System.out.println("Result Minus is = "+objKal.minus());
        System.out.println("Result Multiple is = "+objKal.multiplication());
        System.out.println("Result Division is = "+objKal.division());
    }
    
}
