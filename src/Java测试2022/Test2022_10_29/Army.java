package Test2022_10_29;

import java.util.Objects;
import java.util.Scanner;

public class Army {
    int a = army_weapon_max();
    public Weapon[] w = new Weapon[a];

    public int army_weapon_max() {
        System.out.println("请输入一个整数为军队设置武器上限");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    public void addWeapon(Weapon wa) {
        for (int i = 0; i <= w.length - 1; i++) {
            if (w[i] == null) {
                w[i] = wa;
                return;
            }

        }
    }

    public void attackAll() {
        for (int i = 0; i <= w.length - 1; i++) {
            if (Objects.requireNonNull(w[i]).attackAll().equals("true")) {
                System.out.println("武器" + i + "攻击了");
            }
        }
    }

    public void moveAll() {
        for (int i = 0; i <= w.length - 1; i++) {
            if (Objects.requireNonNull(w[i]).moveAll().equals("true")) {
                System.out.println("武器" + i + "移动了");
            }
        }
    }
    public void BL() {
        for (int i = 0; i <= w.length - 1; i++) {
                System.out.println(w [i]);
            }
        }
    }
