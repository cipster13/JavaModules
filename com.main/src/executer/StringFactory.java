package executer;

import factory.Factory;

public class StringFactory implements Factory<String> {
    @Override
    public String generateSomething() {
        return "Dio cane";
    }
}
