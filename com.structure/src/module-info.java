import factory.Factory;
import factory.impl.NumberFactory;

module com.structure {
    exports factory;
    provides Factory with NumberFactory;
}