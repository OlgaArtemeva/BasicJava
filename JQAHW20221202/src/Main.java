public class Main {
    public static void main(String[] args) {
        PlayHandler playHandler = new PlayHandler();
        PlayHandler inFramePlayHandler = new InFramePlayHandler();

        System.out.println("===== object PlayHandler =====");
        playHandler.play(15L);
        playHandler.play(15.0,false);
        playHandler.play(15F,true, new String[]{"My name is Phillip", "I'm, a poet", "I wrote this song just to show it"});

        System.out.println("===== object InFramePlayHandler =====");
        inFramePlayHandler.play(15L);
        inFramePlayHandler.play(15.0, true);
        inFramePlayHandler.play(15F, false, new String[]{"My name is Phillip", "I'm, a poet", "I wrote this song just to show it"});

        System.out.println("===== String =====");
        System.out.println("parse1: " + ExpressionValidator.parse1("f8h"));
        System.out.println("parse2: " + ExpressionValidator.parse2("f8h"));
        System.out.println("parse1: " + ExpressionValidator.parse1("234"));
        System.out.println("parse2: " + ExpressionValidator.parse2("234"));

        System.out.println("===== char[] =====");
        System.out.println("parse1: " + ExpressionValidator.parse1(new char[]{'a', 'b', 'c'}));
        System.out.println("parse2: " + ExpressionValidator.parse2(new char[]{'a', 'b', 'c'}));
        System.out.println("parse1: " + ExpressionValidator.parse1(new char[]{'1', '2', '3'}));
        System.out.println("parse2: " + ExpressionValidator.parse2(new char[]{'1', '2', '3'}));

        System.out.println("===== String[] =====");
        System.out.println("parse1: " + ExpressionValidator.parse1(new String[]{"fka", "/ib", "cnnn"}));
        System.out.println("parse2: " + ExpressionValidator.parse2(new String[]{"fka", "/ib", "cnnn"}));
        System.out.println("parse1: " + ExpressionValidator.parse1(new String[]{"asd", "jkl", "463"}));
        System.out.println("parse2: " + ExpressionValidator.parse2(new String[]{"asd", "jkl", "463"}));

        System.out.println("===== String String =====");
        System.out.println("parse1: " + ExpressionValidator.parse1("fgh", "ghj"));
        System.out.println("parse2: " + ExpressionValidator.parse2("fgh", "ghj"));
        System.out.println("parse1: " + ExpressionValidator.parse1("tyu", "234"));
        System.out.println("parse2: " + ExpressionValidator.parse2("tyu", "234"));

        System.out.println("===== char =====");
        System.out.println("parse1: " + ExpressionValidator.parse1('a'));
        System.out.println("parse2: " + ExpressionValidator.parse2('a'));
        System.out.println("parse1: " + ExpressionValidator.parse1('1'));
        System.out.println("parse2: " + ExpressionValidator.parse2('1'));

        System.out.println("============================================================");
/*
        System.out.println("===== int duration =====");
        PlayHandler.play (10);  // если play - static
        System.out.println("===== long duration =====");
        PlayHandler.play (10l);
        System.out.println("===== double duration =====");
        PlayHandler.play (10.0);
        System.out.println("===== float duration =====");
        PlayHandler.play (10f);

        System.out.println("===== int duration, boolean repeat =====");
        PlayHandler.play (10, true);
        System.out.println("===== long duration, boolean repeat =====");
        PlayHandler.play (10l, true);
        System.out.println("===== double duration, boolean repeat =====");
        PlayHandler.play (10.0, false);
        System.out.println("===== float duration, boolean repeat =====");
        PlayHandler.play (10f, false);

        System.out.println("===== int duration, boolean repeat, String[] lyrics =====");
        PlayHandler.play(5, false, new String[]{"My name is Phillip", "I'm, a poet", "I wrote this song just to show it"});
        System.out.println("===== long duration, boolean repeat, String[] lyrics =====");
        PlayHandler.play(10l, false, new String[]{"My name is Phillip", "I'm, a poet", "I wrote this song just to show it"});
        System.out.println("===== double duration, boolean repeat, String[] lyrics =====");
        PlayHandler.play(15.0, false, new String[]{"My name is Phillip", "I'm, a poet", "I wrote this song just to show it"});
        System.out.println("===== float duration, boolean repeat, String[] lyrics =====");
        PlayHandler.play(20f, false, new String[]{"My name is Phillip", "I'm, a poet", "I wrote this song just to show it"});
*/
    }
}