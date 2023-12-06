package org.singleton;

public class Main {
    public static void main(String[] args) {

        String a="ammar";
        var message = """
                %s
                Ammar
                %s
                """.formatted(a,a);
        System.out.println(message);
    }
}