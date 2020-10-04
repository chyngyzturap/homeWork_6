public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(200, 20);
        System.out.println(boss.getInfo());
        Weapon weapon = new Weapon();
        weapon.setName("Frostmourne");
        weapon.setType("Sword");
        System.out.println(weapon.getInfo());
    }

}
