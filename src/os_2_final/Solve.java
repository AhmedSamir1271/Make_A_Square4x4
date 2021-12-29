/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_2_final;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author egahm
 */
public class Solve{
    List<int[][]> pieces;
    int[][] square;
            
    void Solve(int[][] square, List<int[][]> pieces){
        this.pieces = pieces;
        this.square = square;
    }
    
    int[][] get_res() throws InterruptedException{
        boolean test =false;
    int count=0;
    for(int i=0; i<pieces.size(); i++)
    {
        for (int x =0 ;x<pieces.get(i).length;x++)
        {
            for (int y=0;y<pieces.get(i)[0].length;y++)
            {
                if(pieces.get(i)[x][y] != 0)
                   count++;
            }
        }
    }
         if (count!=16)
         {
             System.out.println("No Solution..");
             System.exit(0);
         }
               
        for (int i=0;i<pieces.size();i++)
        {
          if (pieces.get(i).length>4 ||pieces.get(i)[0].length>4 )
          { 
          System.out.println("No Solution..");
          System.exit(0);
          }
          
          for (int _try_ =1 ;_try_<=2;_try_++)
          {
                      //get all posibble shapes
                      int [][] p_sh1 = new int [pieces.get(i).length ][ pieces.get(i)[0].length] ;
                      System.arraycopy(pieces.get(i), 0, p_sh1, 0, p_sh1.length);
                      int [][] p_sh2 = Rotating_Fliping.rotate(p_sh1);
                      int [][] p_sh3 = Rotating_Fliping.rotate(p_sh2);
                      int [][] p_sh4 = Rotating_Fliping.rotate(p_sh3);
                      int[][] squareCopy = new int[4][4];
                      System.arraycopy(square, 0, squareCopy, 0, squareCopy.length);
                      //start trying
                      //first shape trying
                      th1 ob1 = new th1();
                      ob1.setPiece(p_sh1);
                      ob1.setSquare(squareCopy);
                      Thread t1= new Thread(ob1);  
                      t1.start(); 
                      t1.join();
                      test=ob1.isRes();
                      if(test == false )
                      {
                          System.arraycopy(square, 0, squareCopy, 0, square.length);
                      }
                      else 
                      {
                          System.arraycopy(squareCopy ,0,square,0,square.length);
                         
                          break;
                      }
                      //END 1st try
                      
                      //second shape trying
                      th1 ob2 =  new th1();
                      ob2.setPiece(p_sh2);
                      ob2.setSquare(squareCopy);
                      Thread t2= new Thread(ob2);  
                      t2.start(); 
                      t2.join();
                      test=ob2.isRes();
                      if(test == false )
                      {
                          System.arraycopy(square, 0, squareCopy, 0, squareCopy.length);
                      }
                      else 
                      {
                          System.arraycopy(squareCopy ,0,square,0,square.length);
                          
                          break;
                      }
                      //END 1st try
                      
                      //third shape trying
                      th1 ob3 = new th1();
                      ob3.setPiece(p_sh3);
                      ob3.setSquare(squareCopy);
                      Thread t3= new Thread(ob3);  
                      t3.start(); 
                      t3.join();
                      test=ob1.isRes();
                      if(test == false )
                      {
                          System.arraycopy(square, 0, squareCopy, 0, squareCopy.length);
                      }
                      else 
                      {
                          System.arraycopy(squareCopy ,0,square,0,square.length);
                  
                          break;
                      }
                      //END 1st try
                      
                      //first shape trying
                      th1 ob4 = new th1();
                      ob4.setPiece(p_sh4);
                      ob4.setSquare(squareCopy);
                      Thread t4= new Thread(ob4);  
                      t4.start(); 
                      t4.join();
                      test=ob4.isRes();
                      if(test == false )
                      {
                          System.arraycopy(square, 0, squareCopy, 0, squareCopy.length);
                      }
                      else 
                      {
                          System.arraycopy(squareCopy ,0,square,0,square.length);
                         
                          break;
                      }
                      //END 4st try
                      //////////////////END all times/////////////
                      Rotating_Fliping.flip(pieces.get(i));
             }
          
          
        }
        
        return square;
    }

    
}

