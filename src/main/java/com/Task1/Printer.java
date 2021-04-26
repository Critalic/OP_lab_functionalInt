package com.Task1;

 class Printer {
     void print(double[] values, double result) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Input: ");

        for (double i: values) {
            stringBuilder.append(i).append(", ");
        }
        stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length());
        stringBuilder.append("\nResult: ").append(result).append("\n");
        System.out.println(stringBuilder.toString());
    }
}
