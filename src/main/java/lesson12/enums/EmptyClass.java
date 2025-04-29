package lesson12.enums;

public class EmptyClass {

        public static final  EmptyClass emptyClass1 = new EmptyClass("",1);
        public static final  EmptyClass emptyClass2 = new EmptyClass("",2);
        public static final  EmptyClass emptyClass3 = new EmptyClass("",3);

    private String name;

    public EmptyClass(String name, int code) {
        this.name = name;
        this.code = code;
    }

    private int code;

    }

