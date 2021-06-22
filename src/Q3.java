
import java.util.Scanner;
public class Q3
{
    int ar[];
    int Front,Rear;
    Q3()
    {
        ar = new int[5];
        Front=-1;
        Rear=-1;
    }
    void insertatlast()
    {
        if((Front == 0 && Rear == 4) || (Rear==Front-1))
        {
            System.out.println("Queue Full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();

            if(Front == -1)
            {
                Front=0;
            }
            if(Rear==4)
            {
                Rear=0;
            }
            else
            {
                Rear = Rear+1;
            }
            ar[Rear]=data;
            System.out.println(".....Data Entered.....");
        }
    }
    void deleteatbegin()
    {
        if(Front == -1)
        {
            System.out.println("Queue already Empty");
        }
        else
        {
            System.out.println("Deleted :"+ar[Front]);
            if(Front==Rear)
            {
                Front=-1;
                Rear=-1;
            }
            else if(Front==4)
            {
                Front=0;
            }
            else
            {
                Front=Front + 1;
            }
        }
    }
    void traverse()
    {
        if(Front == -1 || Rear == -1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            if(Front < Rear)
            {
                for(int i = Front;i<=Rear;i++)
                {
                    System.out.print(" "+ar[i]);
                }
            }
            else
            {
                for(int i=Front;i<=4;i++)
                {
                    System.out.print(" "+ar[i]);
                }
                for(int j=0;j<=Rear;j++)
                {
                    System.out.print(" "+ar[j]);
                }
            }
        }
    }
    public static void main(String args[])
    {
        Q3 obj = new Q3();
        while(true)
        {
            System.out.println("\npress 1 for insertatlast");
            System.out.println("press 2 for deleteatbegin");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for Exit");

            System.out.println("Enter ur choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    obj.insertatlast();
                    break;
                case 2:
                    obj.deleteatbegin();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");

            }
        }
    }

}