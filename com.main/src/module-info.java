import executer.StringFactory;
import factory.Factory;

module com.main {
    requires com.structure;
    uses Factory;
    provides Factory with StringFactory;
}