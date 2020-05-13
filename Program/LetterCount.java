public class LetterCount {
    private int[] counts = new int[26];
    //need an enum or something similar to connect chars to ints, perhaps a switch

    //Constructor
    public LetterCount() {
        for(int i = 0; i < counts.length; i++){
            counts[i] = 0;
        }
    }

    //want default constructor for shift to assign default values to whatever shift

    /**
     * This method will tell how many of a given char has been counted for this array
     * @return the current count for the specific char
     */
    public int getCount(char a){
        for (IntChar i : IntChar.values()){
            if(i.getLabel() == a)
                return counts[i.getNum()];
        }
        return -1;
    }

    /**
     * This method will take in a char (which should be lowercased) and increase the position of the
     * array accordingly to the char.
     * @param a is the char to be increased for this array
     * @return the current count value at array position designated to this char
     */
    public int increaseCount(char a){
        for (IntChar i : IntChar.values()){
            if(i.getLabel() == a)
                return ++counts[i.getNum()];
        }
        return -1;
    }

    /**
     * This will overload the toString method.
     * The point of this is to print out all array values with the char and then the count.
     * @return
     */
    public String toString(){
        String countInfo = "";
        int num = 0;
        for (IntChar i : IntChar.values()){
            countInfo += i.toString() + ": " + counts[num] + " ";
            num++;
        }
        return countInfo;
    }
}
