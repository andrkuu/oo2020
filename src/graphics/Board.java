package graphics;

public class Board {
    private Tile[][] state = {{},{},{}};

    Board(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                state[i][j] = new Tile();
                System.out.println(i);
            }

        }
    }

    public void setState(int x, int y, String state) {
        this.state[x][y].setState(state);
    }

}
