import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
            int count=0;   
            
            //using loop to count nodes until we get null in link part of node.
            Node curr = head;
            while(curr!=null){ 
                
                //updating pointer to the next node.
                curr=curr.next;
                //updating counter.
                count++;
            }
            //returning the number of nodes.
            return count;
    }
}
    
class LinkedList{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            Solution ob = new Solution();
            System.out.println(ob.getCount(head));
        }
    }   
}
