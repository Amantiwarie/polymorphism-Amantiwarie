package com.driver;

public class Main {

    // Task 1: Create a class Product inside Main class
    static class Product {

        // Task 3: method with two int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: overloaded method with three int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product
        Product p = new Product();

        // Call method with 2 integers
        System.out.println("Product of 2 ints: " + p.product(5, 10));

        // Call method with 3 integers
        System.out.println("Product of 3 ints: " + p.product(2, 3, 4));

        // Call method with 2 doubles
        System.out.println("Product of 2 doubles: " + p.product(2.5, 4.5));
    }
}
