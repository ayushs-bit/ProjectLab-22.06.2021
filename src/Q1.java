
import java.util.Scanner;
public class Q1
{
    int ar[];
    int Front,Rear;
    Q1()
    {
        ar=new int[5];
        Front = -1;
        Rear = -1;
    }
    void insertatlast()
    {
        if(Rear==4)
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
                Front = 0;
            }

            Rear = Rear + 1;
            ar[Rear] = data;
            System.out.println("Data Insert......");
        }
    }
    void deleteatbegin()
    {
        if(Front==-1 || Rear==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            if(Front == Rear)
            {
                System.out.println("Deleted :"+ar[Front]);
                Front = -1;
                Rear = -1;
            }
            else
            {
                System.out.println("Deleted :"+ar[Front]);
                Front= Front + 1;
            }
        }
    }
    void traverse()
    {
        if(Front==-1 || Rear==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("..........singly queue..........");
            for(int i=Front;i<=Rear;i++)
            {
                System.out.print(" "+ar[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Q1 obj = new Q1();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
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