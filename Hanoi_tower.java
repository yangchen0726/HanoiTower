/**
 *
 * @author yangchen
 */
public class Hanoi_tower {

    //static int nDisks = 5;

    public static void main(String[] args) {
    
        //get number of plates from input
        int nDisks = args[0]
        
        doTowers(nDisks, 'A', 'B', 'C');
        
        System.exit(0);
    }

    public static void doTowers(int topN, char from, char inter, char to) {
    
        //move top plate
        if (topN == 1) {
            System.out.println("Plate 1 from " + from + "moved to" + to);
        } else {
        
            //recursion, using middle tower as a buffer,
            //move nDisks-1 plates to the buffer tower.
            
            doTowers(topN - 1, from, to, inter);
            
            //print
            System.out.println("Plate  " + topN + " from " + from + " moved to" + to);
            
            //move nSidks-1 plates to 'to' tower after moving last plate.
            doTowers(topN - 1, inter, from, to);
        }
    }
}
