import javax.swing.JOptionPane;
public class procedimiento {
    public static void main (String args[]){
        cuentaDig p = new cuentaDig();
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Nro."));
        p.cuenta_dig(n);
        System.out.println("El número de dígitos es: "+p.re);
        p.nro_divisible(n);
        System.out.println("El número de divisibilidades es: "+p.re);

        if(p.re==2)
            System.out.println("Es primo");
        else
            System.out.println("NO Es primo");

    }
}
