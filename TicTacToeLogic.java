import java.util.Scanner;
public class TicTacToeLogic
{
 Scanner kbd = new Scanner(System.in);
 
 boolean x = false;
 int winnerCount = 0;
 int a, b;
 int agian = 0;
 
public TicTacToeLogic()
{  
  System.out.println ( " please type how big you would like your board to be" );
  TicTacToeBoardGame b1 = new TicTacToeBoardGame( kbd.nextInt(), kbd.nextInt() );
  b1.PrintBoard();
 
 while( ( x == false ) && (winnerCount < 9) )
  {
   if ( winnerCount % 2 != 0 )
    {
     // player two 
     System.out.println ( " player 2 please enter the coordinates for where you would like to go: " );
     a = kbd.nextInt();
     b = kbd.nextInt();
     b1.setOPiece( a, b);
     b1.PrintBoard();
     winnerCount++;
     
     if ( winnerCount >= 5 )
      {
       x = Winner(b1.a);
       if ( x == true )
        {
         System.out.println ( " O is the winner. if you would like to play agian press 1 . if not press 0. " ) ;
         agian = kbd.nextInt(); 
         if ( agian == 1 )
          {
           x = false;
           winnerCount = 0;
           b1.ClearBoard();
          }  
        }
      }
           
    }
   
   else if ( winnerCount % 2 == 0 )
    {
     // player one 
     System.out.println ( " player 1 please enter the coordinates for where you would like to go: " );
     a = kbd.nextInt();
     b = kbd.nextInt();
     b1.setXPiece( a, b);
     b1.PrintBoard();
     winnerCount++;
     
     if ( winnerCount >= 5 )
      {
       x = Winner(b1.a);
       
       if ( x == true )
        {
           System.out.println ( " X is the winner. if you would like to play agian press 1 . if not press 0. " ) ;
           agian = kbd.nextInt(); 
           if ( agian == 1 )
            {
             x = false;
             winnerCount = 0;
             b1.ClearBoard();
            }
         }
        }      
         
         if (( winnerCount == 9 ) && ( x == false ))
          {
           System.out.println ( " cats game. if you would like to play agian press 1. if not press 0." );
           agian = kbd.nextInt();
           if ( agian == 1 )
            {
             x = false;
             winnerCount = 0;
             b1.ClearBoard();
            }
           else
           {
            x = true;
           }        
          }
     }  
  }
 }   
 public static boolean Winner( String [] [] a ) 
 { 
 // ----------------------------------------------checking if X won ---------------------------------------------------\\
    int i = 0;
    int j = 0;
 // row 0 col 0   
      if ((( a[i][j] == "  X " ) && ( a[i][j+1] == "  X ") && (a[i][j+2] == "  X "))
       ||(( a[i][j] == "  X " ) && ( a[i+1][j+1] == "  X " ) && (a[i+2][j+2] == "  X " ))
       ||(( a[i][j] == "  X " ) && ( a[i+1][j] == "  X " ) && ( a[i+2][j] == "  X " )))
      {
       return( true );
      }
// row 0 col 1     
      j = 1;
      if (( a[i][j] == "  X ") && ( a[i+1][j] == "  X " ) && ( a[i+2][j] == "  X " ))
       {
        return( true );
       }
// row 0 col 2       
     j = 2;
     if ((( a[i][j] == "  X " ) && ( a[i+1][j] == "  X " ) && ( a[i+2][j] == "  X " ))
      ||(( a[i][j] == "  X " ) && ( a[i+1][j-1] == "  X " ) && ( a[i+2][j-2] == "  X " )))
      {
       return( true );
      }
      
 //row 1 col 0             
     i = 1;
     j = 0;
     if (( a[i][j] == "  X " ) && ( a[i][j+1] == "  X ") && (a[i][j+2] == "  X "))
      {
       return( true );
      }
// row 1 col 1    
    
// row 2 col 0
     i = 2;
     if (( a[i][j] == "  X " ) && ( a[i][j+1] == "  X ") && (a[i][j+2] == "  X "))
      {
       return( true );
      }
// row 2 col 1 

// row 2 col 2
//------------------------------------------ checking if O won --------------------------------------------------------- \\
     i = 0;
     j = 0;
 // row 0 col 0   
      if ((( a[i][j] == "  O " ) && ( a[i][j+1] == "  O ") && (a[i][j+2] == "  O "))
       ||(( a[i][j] == "  O " ) && ( a[i+1][j+1] == "  O " ) && (a[i+2][j+2] == "  O " ))
       ||(( a[i][j] == "  O " ) && ( a[i+1][j] == "  O " ) && ( a[i+2][j] == "  O " )))
      {
       return( true );
      }
// row 0 col 1     
      j = 1;
      if (( a[i][j] == "  O ") && ( a[i+1][j] == "  O " ) && ( a[i+2][j] == "  O " ))
       {
        return( true );
       }
// row 0 col 2       
     j = 2;
     if ((( a[i][j] == "  O " ) && ( a[i+1][j] == "  O " ) && ( a[i+2][j] == "  O " ))
      ||(( a[i][j] == "  O " ) && ( a[i+1][j-1] == "  O " ) && ( a[i+2][j-2] == "  O " )))
      {
       return( true );
      }
      
 //row 1 col 0             
     i = 1;
     j = 0;
     if (( a[i][j] == "  O " ) && ( a[i][j+1] == "  O ") && (a[i][j+2] == "  O "))
      {
       return( true );
      }
// row 1 col 1    
    
// row 2 col 0
     i = 2;
     if (( a[i][j] == "  O " ) && ( a[i][j+1] == "  O ") && (a[i][j+2] == "  O "))
      {
       return( true );
      }
// row 2 col 1 

// row 2 col 2      
     else
     {
      return( false );
     } 
 }
}  