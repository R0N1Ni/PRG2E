package OOP.game;



public class Maze {
    int[][] mazeArray;
    char wall, playerIcon, freeSpace, treasure,enemy, weapon;
    Character player;

    public Maze(int[][] mazeArray, char wall, char playerIcon, char freeSpace, char treasure, char enemy, char weapon, Character player) {
        this.mazeArray = mazeArray;
        this.wall = wall;
        this.playerIcon = playerIcon;
        this.freeSpace = freeSpace;
        this.treasure = treasure;
        this.player = player;
        this.enemy = enemy;
        this.weapon = weapon;
    }

    void printMaze(){
        for (int i = 0; i < mazeArray.length; i++) {
            for (int j = 0; j < mazeArray[i].length; j++) {
                if (i == player.x && j == player.y){
                    System.out.print(playerIcon);
                }else {
                    System.out.print(getCharacter(mazeArray[i][j]));
                }
            }
            System.out.println();

        }
    }

    char getCharacter(int mazeValue){
        switch (mazeValue){
            case 0: return freeSpace;
            case 1: return wall;
            case 2: return playerIcon;
            case 3: return treasure;
            case 4: return enemy;
        }
        return 'X';
    }

    void game(){
        while (mazeArray[player.x][player.y] != 3){
            player.readMove();
            printMaze();
            if (hitWall()){
                System.out.println("posral si to");
                break;
            }
        }
        System.out.println("Nice");
    }
    boolean hitWall(){
        return mazeArray[player.x][player.y] == 1;
    }

    boolean hitEnemy(){return mazeArray[player.x][player.y] == 4;}

    public static void main(String[] args) {
        int[][] mazeArray = {
                {1,1,1,1,1,1,1},
                {1,0,0,0,0,0,1},
                {1,0,1,1,1,0,1},
                {1,0,1,0,0,0,1},
                {1,0,1,3,1,0,1},
                {1,1,1,1,1,1,1}

        };

        Character john = new Character("John", 40,100,20,4,1);
        Maze m = new Maze(mazeArray,'#','@',' ', '+','X','*', john);
        m.printMaze();
        m.game();
    }


}
