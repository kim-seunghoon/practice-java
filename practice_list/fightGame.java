package practice_list;

public class fightGame {
    public static void main(String[] args) {
        character h1 = new character("아서스", 120);
        character h2 = new character("디아블로", 270);
        h1.attack(h2);
        h1.attack(h2);
        h1.attack(h2);
        h1.attack(h2);
        h2.attack(h1);
        h2.attack(h1);
        h2.attack(h1);
        h2.attack(h1);
    }
}

class character {
    String name;
    int HP;

    character(String _name, int _HP) {
        name = _name;
        HP = _HP;
    }

    void attack(character enemy) {
        enemy.HP -= 20;
        System.out.printf("[%s] 공격!\n", name);
        System.out.printf("\t[%s] 공격 받았습니다. HP : %d\n", enemy.name, enemy.HP);
    }
}
