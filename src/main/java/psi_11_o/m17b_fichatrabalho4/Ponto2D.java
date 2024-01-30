package psi_11_o.m17b_fichatrabalho4;

public class Ponto2D {
    private int x;
    private int y;
    
    /**
     * 
     */
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    /**
     * 
     * @param x
     * @param y 
     */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    /**
     * 
     * @param a
     * @return 
     */
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    

    
    
}
