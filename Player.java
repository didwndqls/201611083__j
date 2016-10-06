class Player {
    private String name=null;
    private int num=0;
    public Player(String name) {
        this.name=name;
    }
    public void play() {
        Dice d=new Dice();
        num=d.roll();
    }
    public int getNum() {
	return this.num;
    }
    public String getName() {
	return this.name;
    }
}