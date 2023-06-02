public class Node {
    private int data;
    private Node left;
    private Node right;
    private String word;

    public Node(int x){
        data    = x;
        left    = null;
        right   = null;

    }

    public Node(Word x){
        int totalval= stringToInt(x.getWord());
        this.word = x.getWord();
        data    = totalval;
        left    = null;
        right   = null;


    }

    public int stringToInt(String x){
        String[] y = x.split("");
        int totalval = 0;

        for(int i = 0; i < y.length ;i++){
            totalval += y[i].charAt(0);
        }

        return totalval;
    }

    @Override
    public String toString(){
        return this.word + "(" + this.data + ")";
    }
    public void setLeft(Node l){
        left = l;
    }
    public void setRight(Node r){
        right = r;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public int getData(){
        return data;}
    public void setData(int d){
        data = d;}
}
