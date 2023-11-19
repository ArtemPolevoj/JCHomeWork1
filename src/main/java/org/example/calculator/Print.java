package org.example.calculator;

public class Print {
    Calculator calculator = new Calculator();
    /**
     * Метод вывода сложения двух чисел
     *
     * @param a первое значение
     * @param b первое значение
     */
    public void sum(double a, double b){
        double result = calculator.sum(a, b);
        System.out.printf("%.2f + %.2f = %.2f\n",a, b, result);
    }
    /**
     * Метод вывода вычитания двух чисел
     *
     * @param a первое значение
     * @param b первое значение
     */
    public void difference(double a, double b){
        double result = calculator.difference(a, b);
        System.out.printf("%.2f - %.2f = %.2f\n",a, b, result);
    }
    /**
     * Метод вывода умножения двух чисел
     *
     * @param a первое значение
     * @param b первое значение
     */
    public void multiply(double a, double b){
        double result = calculator.multiply(a, b);
        System.out.printf("%.2f * %.2f = %.2f\n",a, b, result);
    }
    /**
     * Метод вывода деления двух чисел
     *
     * @param a первое значение
     * @param b первое значение
     */
    public void division(double a, double b){
        double result = calculator.division(a, b);
        System.out.printf("%.2f / %.2f = %.2f\n",a, b, result);
    }
}
