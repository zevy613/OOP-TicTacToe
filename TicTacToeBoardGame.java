public class TicTacToeBoardGame
{
  public String [] [] a;
 
 public TicTacToeBoardGame( int x, int y )
  {
   a = new String [x][y];
   
   for ( int i = 0; i < a.length; i++)
    {
     for ( int j = 0; j < a.length; j++)
      {
       a[i][j] = "[   ]";
      }
     System.out.println ( );
    }   
  }
 
 public void setXPiece( int i, int j )
  {
   a[i][j] = "  X ";
  }
 
 public void setOPiece( int i, int j )
  {
   a[i][j] = "  O ";
  }
   
 public String getPiece( int i, int j)
  {
   return( a[i][j] );
  }    
 
 public void PrintBoard()
  {
   for(int i = 0; i < a.length; i++)
    {
     for ( int j = 0; j < a.length; j++)
       {
        System.out.print( a[i][j] + " \t " );
       }
     System.out.println( "\n"); 
    }      
  }
 
 public void ClearBoard()
  {
   for ( int i = 0; i < a.length; i++)
    {
     for ( int j = 0; j < a[i].length; j++)
      {
       a[i][j] = "[  ]";
      }
    } 
  }         
} 