package ru.nordic.lesson7.hm;

import java.util.Scanner;

class Shop {
    public static void main(String[] args) {
        System.out.println("Выберите режим: 1-Продаван | 2-Покупатель");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a==2){
            System.out.println("Выберите тип продукта:");
            ProductType[] types= ProductType.values();
            for (ProductType t :types){
                System.out.println(t);
            }
            Scanner sc1=new Scanner(System.in);
            String s=sc1.toString();
        }
        Product product = new Product("Vishnya",23);

    }
 }
