import java.awt.*;

public class L9 {
    private int size;
    public L9(int s){
        size=s;

    }
public void draw(Graphics2D g2){
        int x,y,row,col;
        for (row=0;row<8;row++){
            for (col=0;col<8;col++){
                x=col*size;
                y=row*size;
                if ((row%2)==(col%2))
                    g2.setColor(Color.white);
                else
                    g2.setColor(Color.black);
                g2.fillRect(x,y,size,size);
            }
        }
}
}
