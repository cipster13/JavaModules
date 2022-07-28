package executer;

import factory.Factory;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        Iterable<Factory> factories = ServiceLoader.load(Factory.class);
        factories.forEach(factory -> System.out.println(factory.generateSomething()));
    }
}
