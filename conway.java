import java.util.*;

public class conway
{
    public static void printGrid(int a[][],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void gameOfLife(int a[][] )
    {
        int row=a.length;
        int col=a[0].length;
        int dx[] = {-1,-1,-1,0,0,1,1,1};
        int dy[] = {-1,0,1,-1,1,-1,0,1};
        int upd[][]=new int[row][col];
        int alive=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                for(int k=0;k<8;k++)
                {
                    int ni=i+dx[k];
                    int nj=j+dy[k];
                    if(ni>=0&&ni<row&&nj>=0&&nj<col)
                    {
                        if(a[ni][nj]==1)
                            alive++;
                    }
                }
                if(a[i][j]==1)
                {
                    if(alive>3)
                        upd[i][j]=0;
                    if(alive<2)
                        upd[i][j]=0;
                    if(alive==2 || alive==3)
                        upd[i][j]=1;
                }
                else
                {
                    if(alive==3)
                        upd[i][j]=1;
                }
                alive=0;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=upd[i][j];
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Rows: ");
        int row=sc.nextInt();
        System.out.print("Columns: ");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        System.out.println("Enter values");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Generations: ");
        int gen=sc.nextInt();
        System.out.println("\nInitial Grid");
        printGrid(a,row,col);
        for(int g=1;g<=gen;g++)
        {
            gameOfLife(a);
            System.out.println("\nGeneration "+g);
            printGrid(a,row,col);
        }
    }
}