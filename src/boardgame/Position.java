
package boardgame;


public class Position {
    private int row;
    private int calumn;

    public Position(int row, int calumn) {
        this.row = row;
        this.calumn = calumn;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCalumn() {
        return calumn;
    }

    public void setCalumn(int calumn) {
        this.calumn = calumn;
    }
    @Override
    public String toString(){
        return row+", "+calumn;
    }
}
