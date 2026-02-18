class Node{
    int data;
    Node l,r;
    
    Node(int a){
        this.data=a;
        this.l =this.r = null;
    }
    
    // recursive  method
    void TreeTraverse(Node n){
        //base condition
        if(n==null)return;
        TreeTraverse(n.l);
        TreeTraverse(n.r);
        //post order traversal
        System.out.println(n.data);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        
        //linking
        a.l=b;
        a.r=c;
        b.l=d;
        
         System.out.println("post order traversal");
         a.TreeTraverse(a);
         
        
        
                       
                       
                       
                       
                       
    }
}
