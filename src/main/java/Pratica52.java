/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
import  utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

public class Pratica52 {
    public static void main(String[] args) {
        Equacao2Grau x = new Equacao2Grau (3,7,56);
        Equacao2Grau y = new Equacao2Grau (2,4,2);
        Equacao2Grau z = new Equacao2Grau (1,8,9);
                
        try{
            System.out.println("x1 = "+x.getRaiz1());
            System.out.println("x2 = "+x.getRaiz2());
        } catch(RuntimeException rte){            
        }
        
        try{
        System.out.println("y1 = "+y.getRaiz1());
        System.out.println("y2 = "+y.getRaiz2());
        }catch(RuntimeException rte){
            
        }
        try{
        System.out.println("z1 = "+z.getRaiz1());
        System.out.println("z2 = "+z.getRaiz2());
        }catch(RuntimeException rte){
            
        }
    }
}
