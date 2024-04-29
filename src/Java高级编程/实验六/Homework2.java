package Java高级编程.实验六;

import java.util.*;

public class Homework2 {
    private int id;
    private String name;
    private double price;

    public Homework2(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "编号：" + id + "，名称：" + name + "，单价：" + price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Homework2> products = new HashMap<>();

        System.out.println("请输入商品信息（格式：编号 商品名 单价），输入 exit 结束：");
        while (true) {
            String line = sc.nextLine();
            if ("exit".equals(line)) {
                break;
            }

            String[] parts = line.split(" ");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);

            Homework2 product = new Homework2(id, name, price);
            products.put(id, product);
        }

        System.out.println("商品信息列表：");
        for (Homework2 product : products.values()) {
            System.out.println(product);
        }
    }
}
