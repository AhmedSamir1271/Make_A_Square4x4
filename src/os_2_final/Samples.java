package os_2_final;

import java.util.ArrayList;


public class Samples extends javax.swing.JFrame {
    
    int s;
    ArrayList<int[][]> pieces = new ArrayList<int[][]>(); /*{p1, p2, p3, p4}*/
            
    void Samples(int sample){
        this.s = sample;
    }
    
    ArrayList<int[][]> chooseSample(){
        
        switch (s) {
            case 1: /*First Sample ()*/
                {
                    int [][] s1_piece1 = { {1,1,1} , {1,0,1} };
                    int [][] s1_piece2 = { {0,2} , {0,2},{2,2},{0,2} };
                    int [][] s1_piece3 = { {3} , {3} };
                    int [][] s1_piece4 = { {4,0},{4,0},{4,4} };
                    pieces.add(s1_piece1);
                    pieces.add(s1_piece2);
                    pieces.add(s1_piece3);
                    pieces.add(s1_piece4);
                    //add_pieces(p1,p2,p3,p4);
                    break;
                }
            case 2: /*Second Sample ()*/
                {
                    int [][] s2_piece1 = {{1,1,1,1}};
                    int [][] s2_piece2 = {{2,2,2,2}};
                    int [][] s2_piece3 = {{3,3,3,3}};
                    int [][] s2_piece4 = {{4,4,4,4}};
                    pieces.add(s2_piece1);
                    pieces.add(s2_piece2);
                    pieces.add(s2_piece3);
                    pieces.add(s2_piece4);
                    //add_pieces(p1,p2,p3,p4);
                    break;
                }
            case 3: /*Third Sample ()*/
                {
                    int [][] s3_piece1 = { {1,1},{1,1}};
                    int [][] s3_piece2 = { {2,2},{2,2}};
                    int [][] s3_piece3 = { {3,3},{3,3}};
                    int [][] s3_piece4 = { {4,4},{4,4}};
                    pieces.add(s3_piece1);
                    pieces.add(s3_piece2);
                    pieces.add(s3_piece3);
                    pieces.add(s3_piece4);
                    //add_pieces(p1,p2,p3,p4,p5);
                    break;
                }
            case 4: /*Fourth Sample ()*/
                {
                    //System.out.println("Invalid Input");
                    int [][] s4_piece1 = {{1,1,1,1,1,1}};
                    int [][] s4_piece2 = {{2,2,2,2}};
                    int [][] s4_piece3 = {{3,3,3,3}};
                    int [][] s4_piece4 = {{4,4,4,4}};
                    pieces.add(s4_piece1);
                    pieces.add(s4_piece2);
                    pieces.add(s4_piece3);
                    pieces.add(s4_piece4);
                    //add_pieces(p1,p2,p3,p4);
                    break;
                }
        }
        return pieces;
    }
    
}












/* Second Sample ()*/

        /*int[][] p1 ={ { 1, 1, 1,1 } };
        int[][] p2 ={ { 2, 2, 2, 2 } };
        int[][] p3 ={ { 3, 3, 3, 3 } };
        int[][] p4 ={ { 4,4, 4 }, { 0, 0,4 } };*/

        /* Third Sample ()*/ 
            
        /*int[][] p1 ={ { 1, 1 }, { 1, 1 } };
        int[][] p2 ={ { 2, 2, 2 }, { 2, 0, 0 } };
        int[][] p3 ={ { 3, 3 }, { 0, 3 }, { 0, 3 } };
        int[][] p4 ={ { 4, 4, 4 } };
        int[][] p5 = {{ 5 } };*/
        
        /*Fourth Sample*/
        /*int[][] p1 ={ { 1, 0, 1, 1 } };
        int[][] p2 ={ { 2, 2, 2, 2 } };
        int[][] p3 ={ { 3, 3, 3, 3 } };
        int[][] p4 ={ { 4, 4, 4, 4 } };
        int[][] p5 ={ {5} };*/
