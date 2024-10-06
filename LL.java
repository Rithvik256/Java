class LL {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        newNode=head;
    }
    public static void main(String args[]){
        LL list= new LL();
        addfirst("a");
        addfirst("is");
        
    }
}
