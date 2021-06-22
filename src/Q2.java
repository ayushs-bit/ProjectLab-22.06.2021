import java.util.Scanner;
class Node
{
    int data;
    Node Next;
}
public class Q2
{
    Node Front,Rear;
    Q2()
    {
        Front=null;
        Rear=null;
    }
    void insertatlast()
    {
        System.out.println("Enter data");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        Node newnode = new Node();
        newnode.data=item;
        newnode.Next=null;

        if(Front == null)
        {
            Front = newnode;
            Rear=newnode;
        }
        else
        {
            Node current=Rear;
            while(current.Next!=null)
            {
                current = current.Next;
            }
            current.Next=newnode;
        }
        System.out.println("Data Inserted ....");
    }
    void deleteatbegin()
    {
        if(Front==null)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("Deleted :"+Front.data);
            Front = Front.Next;
        }
    }
    void traverse()
    {
        if(Front == null || Rear ==  null)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println(".....SinglyQueueLinkedlist.....");
            Node current;
            for(current = Front ; current != null ; current=current.Next)
            {
                System.out.print(" "+current.data);
            }
        }
    }
    public static void main(String args[])
    {
        Q2 obj = new Q2();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for Exit");

            System.out.println("Enter your choice");
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