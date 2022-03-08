package ru.nordic.lesson7.hm;

import java.util.Objects;

class Product {
    private String name;
    private double weight;

    public Product(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product: " +
                "name='" + name + '\'' +
                ", weight=" + weight;
    }
}
