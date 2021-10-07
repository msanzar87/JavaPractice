public class Machine1 {
    private Item1[][] item1s;

    public Machine1(Item1[][] item1s) {
        this.item1s = new Item1[item1s.length][item1s[0].length];
        for (int i = 0; i < item1s.length; i++) {
            for (int j = 0; j < item1s[i].length; j++) {
                this.item1s[i][j] = new Item1(item1s[i][j]);
            }
        }
    }
    
    public Item1 getItem(int row, int spot) {
        return new Item1(this.item1s[row][spot]);
    }
    
    public void setItem(Item1 item1, int row, int spot) {
        this.item1s[row][spot] = new Item1(item1);
    }

    public boolean dispense(int row, int spot) {
        if (this.item1s[row][spot].getQuantity() > 0) {
            item1s[row][spot].setQuantity(item1s[row][spot].getQuantity() - 1);
            return true;
        } 
        return false;
    }

    public String toString() {

        String temp = "";
        for (int i = 0; i < item1s.length; i++) {
            temp += "\t";
            for (int j = 0; j < item1s[i].length; j++) {
                temp += item1s[i][j].toString() + " ";
            }
            temp += "\n\n";
        }
        temp += "\t************************************************";
        return temp;
    }

}
