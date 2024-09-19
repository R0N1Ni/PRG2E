package OOP.game;



public class Maze {
    int[][] mazeArray;
    char wall;
    char playerIcon;
    char enemyIcon;
    char freeSpace;
    char treasure;
    char weaponIcon;
    Character player;
    Character enemy;
    Weapon weapon;

    public Maze(int[][] mazeArray, char wall, char playerIcon, char freeSpace, 
                char treasure, char enemyIcon, char weaponIcon, Character player,
                Character enemy,Weapon weapon) {
        this.mazeArray = mazeArray;
        this.wall = wall;
        this.playerIcon = playerIcon;
        this.freeSpace = freeSpace;
        this.treasure = treasure;
        this.player = player;
        this.enemyIcon = enemyIcon;
        this.weaponIcon = weaponIcon;
        this.enemy = enemy;
        this.weapon = weapon;
    }

    void printMaze(){
        for (int i = 0; i < mazeArray.length; i++) {
            for (int j = 0; j < mazeArray[i].length; j++) {
                if (i == player.x && j == player.y){
                    System.out.print(playerIcon);
                }else {
                    System.out.print(getIcon(mazeArray[i][j]));
                }
            }
            System.out.println();

        }
    }

    char getIcon(int mazeValue){
        switch (mazeValue){
            case 0: return freeSpace;
            case 1: return wall;
            case 2: return playerIcon;
            case 3: return treasure;
            case 4: return enemyIcon;
            case 5: return weaponIcon;
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
            } else if (hitEnemy()) {
                System.out.println(enemy.toString());
                boolean survived = battle(player,enemy);
                if (!survived){
                    System.out.println("Umrel si");
                    break;
                }
                else {
                    System.out.println("Zvitezil si");
                }
            } else if (findWeapon()) {
                System.out.println("Mythical weapon encountered");
                player.takeWeaponWithHand(weapon);
                printMaze();

            }
        }
        System.out.println("Nice");
    }
    boolean hitWall(){
        return mazeArray[player.x][player.y] == 1;
    }

    boolean hitEnemy(){return mazeArray[player.x][player.y] == 4;}
    boolean findWeapon(){return mazeArray[player.x][player.y] == 5;}

    public static void main(String[] args) {
        int[][] mazeArray = {
                {1,1,1,1,1,1,1,1},
                {1,0,0,5,0,0,0,1},
                {1,0,1,1,1,0,0,1},
                {1,0,1,0,4,0,0,1},
                {1,0,1,3,1,0,0,1},
                {1,1,1,1,1,1,1,1}

        };

        Character player = new Character("John", 100,100,150,4,1);
        Character enemy = new Character("Dexter", 400,1,250,4,1);
        Weapon weapon = new Weapon("Suitcase",9000,20);
        Maze m = new Maze(mazeArray,'#','@',' ', '+',
                'X','*', player, enemy, weapon );
        m.printMaze();
        m.game();
    }

    static Boolean battle(Character player, Character enemy) {
        while (true) {
            int damage = enemy.defend(player.getAttack());
            System.out.println("Utoci " + player.toString() + " a dava " + damage + " zraneni");
            if (!(enemy.isAlive())) {
                return true;
            }
            damage = player.defend(enemy.getAttack());
            System.out.println("Utoci " + enemy.toString() + " a dava " + damage + " zraneni");
            if (!(player.isAlive())) {

                return false;
            }

        }

    }
    static void armCharacter(Character player, Weapon left, Weapon right) {
        if (left != null) {
            player.takeWeapon(Hand.LEFT, left);
        }

        if (right != null) {
            player.takeWeapon(Hand.RIGHT, right);
        }


    }


}
