public class Btree {
    private Node root;

    public Btree(){

        root = null;
    }
    public void insertIteratively(int newData){

        Node current = this.getRoot();
        if(root == null){
            this.setRoot(new Node(newData));
        }
        else{

            while(true){
                if(current.getData() > newData){
                    if(current.getLeft() == null){
                        current.setLeft(new Node(newData));
                        break;
                    }
                    current = current.getLeft();
                }else{
                    if(current.getRight() == null){
                        current.setRight(new Node(newData));
                        break;
                    }
                    current = current.getRight();
                }
            }
        }

    }
    public void insertIteratively(Word word){
        String newData  =word.getWord();
        Node current = this.getRoot();
        if(root == null){
            this.setRoot(new Node(word));
        }
        else{
        int data = word.getID();
            while(true){
                if(current.getData() > data){
                    if(current.getLeft() == null){
                        current.setLeft(new Node(word));
                        break;
                    }
                    current = current.getLeft();
                }else{
                    if(current.getRight() == null){
                        current.setRight(new Node(word));
                        break;
                    }
                    current = current.getRight();
                }
            }
        }

    }



    public Node insertRecursively(int newData, Node root){
        if(root == null){
            root = new Node(newData);
            return root;
        }
        if(root.getData() > newData)
            root.setLeft(insertRecursively(newData, root.getLeft()));
        else
            root.setRight(insertRecursively(newData, root.getRight()));
        return root;
    }

    public void printPreOrder(Node current){

        if(current == null)
            return;

        System.out.println(current + " ");
        printPreOrder(current.getLeft());
        printPreOrder(current.getRight());
    }


    public Node getRoot(){ return root;}
    public void setRoot(Node r){ this.root = r;}


    public Node deleteNode(Node root, int key){

        //If tree is empty...
        if(root == null)
            return null;

        //Otherwise go left or right subtree...
        if(key < root.getData())
            root.setLeft(deleteNode(root.getLeft(),key));
        else if(key > root.getData())
            root.setRight(deleteNode(root.getRight(),key));

            //if key is same as root's key then This is the node to be deleted...
        else{
            //if with only one child or no child...
            if(root.getLeft() == null)
                return root.getRight();
            else if(root.getRight() == null)
                return root.getLeft();

            //node with two childeren:Get the inorder succesor(smallest in the right subtree)
            root.setData(minValue(root.getRight()));
            root.setRight(deleteNode(root.getRight(),root.getData()));
        }
        return root;
    }
    public int minValue(Node root){
        int min = root.getData();

        while(root.getLeft() != null){
            min     = root.getLeft().getData();
            root    = root.getLeft();
        }
        return min;
    }

}
