package Pattern1_Puzzle;

public class CharacterTest {
    public static void main(String[] args) {
        Character p1 = new Knight();
        Character p2 = new Troll();

        p1.fight();
        p1.setWeapon(new Axe());
        p1.fight();

        p2.fight();
    }
}
