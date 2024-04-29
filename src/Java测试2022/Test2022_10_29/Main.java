package Test2022_10_29;

public class Main {
    public static void main(String[] args) {
        Roadblock roadblock = new Roadblock();
        Fixed_Armament fixed_armament = new Fixed_Armament();
        Mobile_Artillery mobile_artillery = new Mobile_Artillery();
        Weapon w1=roadblock;
        Weapon w2=fixed_armament;
        Weapon w3=mobile_artillery;
        Army army = new Army();
//        army.army_weapon_max();
        army.addWeapon(w1);
        army.addWeapon(w2);
        army.addWeapon(w3);
        army.attackAll();
        army.moveAll();
        army.BL();
    }
}
