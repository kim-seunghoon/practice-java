public class fightGame2 {
    public static void main(String[] args) throws InterruptedException{
        Avengers IronMan = new Avengers("아이언맨", 200);
        Avengers SpiderMan = new Avengers("스파이더맨", 120);

        Avengers.battle(IronMan, SpiderMan);

    }
}
class Avengers {
    String name;
    int hp;

    Avengers(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void attack(Avengers enemy) {
        enemy.hp -= 20;
        System.out.printf("\"%s\"(이)가 공격합니다.\n", name);
        if(enemy.hp >= 0) {
            System.out.printf("\"%s\"(이)가 공격받았습니다. 남은 체력 : %d\n", enemy.name, enemy.hp);
        } else {
            System.out.printf("\"%s\"(이)가 공격받았습니다. 남은 체력 : 0\n", enemy.name);
        }
        System.out.println();
    }
    void skill(Avengers enemy) {
        enemy.hp -= 40;
        System.out.printf("\"%s\"(이)가 스킬을 사용합니다.\n", name);
        if(enemy.hp >= 0) {
            System.out.printf("\"%s\"(이)가 강한 공격받았습니다. 남은 체력 : %d\n", enemy.name, enemy.hp);
        } else {
            System.out.printf("\"%s\"(이)가 강한 공격받았습니다. 남은 체력 : 0\n", enemy.name);
        }
        System.out.println();
    }
    static void battle(Avengers a, Avengers b) throws InterruptedException{
        while (a.hp > 0 && b.hp> 0) {
            Avengers attacker, defender;
            if (Math.random() > 0.5) {
                attacker = a;
                defender = b;
            } else {
                attacker = b;
                defender = a;
            }

            if (Math.random() > 0.5) {
                attacker.attack(defender);
            } else {
                if (attacker == a) {
                    System.out.print("아이언빔\n");
                    attacker.skill(defender);
                } else {
                    System.out.print("스파이더 그물\n");
                    attacker.skill(defender);
                }
            }

            if (a.hp <= 0 || b.hp <= 0) {
                System.out.printf("%s(이)가 사망했습니다.", defender.name);
            }

            Thread.sleep(1000);
        }
    }
}