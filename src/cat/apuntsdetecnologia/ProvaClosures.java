package cat.apuntsdetecnologia;

/**
 *
 * @author albert
 */
public class ProvaClosures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ProvaClosures();
    }
    
    interface g {
        int operation(int x);
    }    

    public ProvaClosures() {
        
        class f {
            int z_f;
            
            g init(int x) {
                z_f = x;
                
                g g1 = (y) -> {
                    this.z_f++;
                    return y + this.z_f;
                };
                
                return g1;
            }
        }
            
        g g1 = (new f()).init(1);
        g g2 = (new f()).init(2);
        g g3 = (new f()).init(3);

        System.out.println("Value g1.operation(3): " + g1.operation(3));
        System.out.println("Value g2.operation(3): " + g2.operation(3));
        System.out.println("Value g3.operation(3): " + g3.operation(3));
        System.out.println("---------------------------------------");
        System.out.println("Value g1.operation(3): " + g1.operation(3));
        System.out.println("Value g2.operation(3): " + g2.operation(3));
        System.out.println("Value g3.operation(3): " + g3.operation(3));
        System.out.println("---------------------------------------");
        System.out.println("Value g1.operation(3): " + g1.operation(3));
        System.out.println("Value g2.operation(3): " + g2.operation(3));
        System.out.println("Value g3.operation(3): " + g3.operation(3));       
    }
}
