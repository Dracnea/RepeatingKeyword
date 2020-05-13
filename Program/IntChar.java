public enum IntChar {
    A('a',0),
    B('b',1),
    C('c',2),
    D('d',3),
    E('e',4),
    F('f',5),
    G('g',6),
    H('h',7),
    I('i',8),
    J('j',9),
    K('k',10),
    L('l',11),
    M('m',12),
    N('n',13),
    O('o',14),
    P('p',15),
    Q('q',16),
    R('r',17),
    S('s',18),
    T('t',19),
    U('u',20),
    V('v',21),
    W('w',22),
    X('x',23),
    Y('y',24),
    Z('z',25);

    private final char label;
    private final int num;

    private IntChar(char label, int num) {
        this.label = label;
        this.num = num;
    }

    public char getLabel(){
        return this.label;
    }

    /*
    public char getLabel(int i){
        return 'a';
    }
    */
    public int getNum(){
        return this.num;
    }

    /*
    public int getNum(char a){
        for (IntChar i : IntChar.values()){
            if(i.getLabel() == a)
                return i.getNum();
        }
        return -1;
    }
    */
}
