package com.testproject;
public class Main {

    // Функция, которая возвращает сумму двух чисел
    public static int add(int a, int b) {
        return a + b;
    }

    // Функция, которая возвращает факториал числа
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Функция, которая проверяет, является ли строка палиндромом
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleaned = str.replaceAll("\\W", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        // Тестирование функции add
        System.out.println("Testing add function:");
        System.out.println("add(3, 5) = " + add(3, 5)); // Ожидается: 8

        // Тестирование функции factorial
        System.out.println("\nTesting factorial function:");
        System.out.println("factorial(5) = " + factorial(5)); // Ожидается: 120

        // Тестирование функции isPalindrome
        System.out.println("\nTesting isPalindrome function:");
        System.out.println("isPalindrome('A man, a plan, a canal, Panama') = " +
                isPalindrome("A man, a plan, a canal, Panama")); // Ожидается: true
        System.out.println("isPalindrome('Hello') = " + isPalindrome("Hello")); // Ожидается: false
    }
}
