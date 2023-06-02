public class myHash {
    private final Btree[] keys;

    public myHash(int tableSize) {

        this.keys = new Btree[2 * tableSize];

        for(int i = 0; i < 2 * tableSize; i++)
            this.keys[i] = new Btree();

    }

    public void add(int newValue){

        int indx = hash(newValue);
        Node newdata = new Node(newValue);
        this.keys[indx].insertIteratively(newValue);

    }
    public int hash(int newValue){

        if(newValue < 50)
            return newValue % 10;
        else
            return newValue % 10 + 10;

    }
    public void removeItem(int Item){

        int indx = this.hash(Item);
        this.keys[indx].deleteNode(this.keys[indx].getRoot(), Item);

    }


    public void printMap(){
        for(int i = 0; i< this.keys.length; i++){
            System.out.print("[" + i +"]" + "--->");
            this.keys[i].printPreOrder(this.keys[i].getRoot());
            System.out.println("");
        }
    }

}
