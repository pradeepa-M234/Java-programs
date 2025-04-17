public class Binary Search Tree{
     class node{
     int key:;
     Node left,high;
     public Node(int item){
        key=item;
        left=night=null;
        }
     }
     Node root;
     Binary Search Tree(){
        root=null;
     }
     void insert (int key){
     root=insert Rec (root,key)
     }
     Node insert Rec(Node root,int key)
       if(root==null){
          root=New Node (keu);
           return root;
           }
       if(key<root.key)
       root.left=insert Rec (root.left,key);
       else is(key>root.key)
       root.right=insert Rec (root.right,key);
       return root;
       }
       void printtype(){
          print Tree(root);
       }
       void printTree(Node Node)
       {
       if(Node!=null){
       print Tree (Node.left);
       System.out.print(node.key + " ");
       print Tree (Node.right);
          }
       }
       public static void main(String[] args){
              Binary Search Tree terr=new Binary Search Tree();
                   tree.insert(50); 
                   tree.insert(30);
                   tree.insert(20); 
                   tree.insert(40);
                   tree.insert(70);
                   tree.insert(60); 
                   tree.insert(80);
              System.out.println("Binary Search Tree:");
                tree.printTree();
                 }
              }








      
       
  
    