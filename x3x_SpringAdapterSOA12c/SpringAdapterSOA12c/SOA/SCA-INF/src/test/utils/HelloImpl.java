package test.utils;

public class HelloImpl implements IHello {
    
    @Override
    public String saySomething(String inputParameter) {
        /*
         * Acciones que realizara la operacion "saySomething"
         */
        return "Hello" + inputParameter;
    }
}