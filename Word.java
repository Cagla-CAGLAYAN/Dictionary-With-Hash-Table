public class Word {

    private String word = "";
    private int ID = -1;


    /* Constructors */
    public Word(){}

    private void setSelf(String word, int id) {
        this.word = word;
        this.ID = id;
    }

    public Word(String word) {

        setSelf(word, -1);
    }

    public Word(String word, int ID) {

        setSelf(word, ID);
    }

    public Word(String word, boolean autoID) {
        if(autoID) {
            setSelf(word, stringToInt(word));
        } else {
            setSelf(word, -1);
        }

    }
    /* Constructors */

    /* Getters & Setters */
    public void setWord(String word) {

        this.word = word;
    }

    public void setID(int id) {

        this.ID = id;
    }

    public String getWord(){

        return word;
    }

    public int getID(){

        return ID;
    }
    /* Getters & Setters */

    /* Helpful Methods */
    public int stringToInt(String word) {
        int ASCII = 0;
        for(int i = 0; i < word.length(); i++) {
            ASCII += word.charAt(i);
        }
        return ASCII;
    }

    @Override
    public String toString() {

        return this.word + "(" + this.ID + ")";
    }

}
