package DataStructure;

import Gemastik.H;
import Gemastik.I;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class LinkedList {
    Node head;


    public void addFront(int data){
        if(head==null){
            head=new Node(data);
        }else{
            Node newNode=new Node(data);
            Node next=head.next;

            head=newNode;
            head.next=next;
        }

    }

    public void append(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;

        }else{
            Node iterator=head;
            while(true){


                if(iterator.next==null){
                    iterator.next=newNode;
                    break;
                }
                iterator=iterator.next;
            }

        }

    }

    public void printList(){
        Node iterator=head;
        while(iterator!=null){

            System.out.print(iterator.data+" ");
            iterator=iterator.next;
        }
    }
    public int get(int index){
        Node iterator=head;
        int idx=0;
        while(true){
            if(index==idx){
                return iterator.data;
            }
            iterator=iterator.next;
            idx++;
        }

    }
    public void deleteNode(int index){
        Node iterator=head;
        Node temp=null;
        if(head==null){
            return;
        }
        int idx=0;
        while(true){
            if(index==idx){
                if(idx==0){
                    head=head.next;
                    break;
                }
                temp.next=iterator.next;
                break;

            }
            temp=iterator;
            iterator=iterator.next;

            idx++;
        }
    }
    public void deleteLinkedList(){
        head=null;
    }
   /* public int size(){
        Node iterator=head;
        int count=1;
        while(true){

            iterator=iterator.next;
            if(iterator==null){
                break;
            }
            count++;
        }
        return count;
    }*/
    public int size(){
        return getCount(head);
    }
    public int getCount(Node head){
        if(head==null){
            return 0;
        }


        return 1+getCount(head.next);
    }

    public boolean search(Node head,int x){
        if(head==null){
            return false;
        }
        if(head.data==x){
            return true;
        }

        return search(head.next,x);
    }

    public void printFromTheLast(int x){
        System.out.println(this.get(this.size()-x));
    }

    public boolean detectLoop(){

        Node iterator=head;
        HashSet<Node> h=new HashSet<>();

        for(;true;){
            h.add(iterator);
            iterator=iterator.next;
            if(h.contains(iterator)){
                return true;
            }
            if(iterator==null){
                return false;
            }

        }

    }


    public static void main(String[] args) {
        LinkedList arr=new LinkedList();
















    }
    private static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
