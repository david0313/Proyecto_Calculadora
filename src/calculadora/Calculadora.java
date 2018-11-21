
package calculadora;
import javax.swing.JOptionPane;

public class Calculadora {

    
    public static void main(String[] args) {
        operacion ope = new operacion();

        int opcion=0;
        int num1, num2;
        double num3, num4;
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("¿Que operacion desea realizar?\n 1.-Suma\n 2.-Resta\n 3.-Multiplicacion\n 4.-Division\n 5.-Salir\n Ingrese la operacion a realizar: "));
            switch(opcion){
                case 1:
                    num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor: "));
                    num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
                    JOptionPane.showMessageDialog(null,"La suma es: " + operacion.suma(num1, num2));
                break;
                    
                case 2:
                    num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor:"));
                    num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
                    JOptionPane.showMessageDialog(null,"La resta es: " + operacion.resta(num1,num2));
                break; 
                    
                case 3:
                    num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor:"));
                    num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
                    JOptionPane.showMessageDialog(null,"La multiplicacion es: " + operacion.multiplicacion(num1,num2));
                break;
               
               case 4:
                   num3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor:"));
                   num4=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
                   JOptionPane.showMessageDialog(null,"La division es: " + operacion.division(num3, num4));
                break; 
                   
               case 5:
                   break;
            }       
        
        }while(opcion!=5);
    
    }
}

