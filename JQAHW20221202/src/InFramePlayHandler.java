public class InFramePlayHandler extends PlayHandler {

    //        Песня не может играть дольше 10 секунд
    @Override
    public void play(int duration) {

        for (int i = 0; i <= duration && i <= 10; i += 5) {
            System.out.println("play1 (int duration): " + i + ":00");
        }
        if (duration > 10) {
            System.out.println("Song cannot be played for more than 10 seconds");
        }
    }

    @Override
    public void play(long duration) {

        for (int i = 0; i <= duration && i <= 10; i += 5) {
            System.out.println("play (long duration): " + i + ":00");
        }
        if (duration > 10) {
            System.out.println("Song cannot be played for more than 10 seconds");
        }
    }

    @Override
    public void play(double duration) {

        for (int i = 0; i <= duration && i <= 10; i += 5) {
            System.out.println("play (double duration): " + i + ":00");
        }
        if (duration > 10) {
            System.out.println("Song cannot be played for more than 10 seconds");
        }
    }

    @Override
    public void play(float duration) {

        for (int i = 0; i <= duration && i <= 10; i += 5) {
            System.out.println("play (float duration): " + i + ":00");
        }
        if (duration > 10) {
            System.out.println("Song cannot be played for more than 10 seconds");
        }
    }
    //    ===============================================================================
    //    Песня не может играть дольше 10 секунд
    //    Песня не может играть больше одного раза


    // переопределила пока только одну версию метода - может, можно было это красивее сделать (через try/catch) - расскажите на занятии, пожалуйста!
    @Override
    public void play(double duration, boolean repeat) {
        int n = repeat ? 1 : 0;

        for (int i = 0; i <= duration && i <= 10; i += 5) {
            System.out.println("play (double duration, " + repeat + "):  " + i + ":00");
        }
        if (duration > 10) {
            System.out.println("Song cannot be played for more than 10 seconds");
        }
        if (n == 1) {
            System.out.println("The song cannot be played more than once");
        }
    }


    //    ===============================================================================
    @Override
    public void play(float duration, boolean repeat, String[] lyrics) {
        int n = repeat ? 1 : 0;
        String lyricsStr;
            for (int i = 0, k = 0; i <= duration && i <= 10; i += 5, k++) {
                if (k < lyrics.length) {
                    lyricsStr = lyrics[k];
                } else lyricsStr = "";
                System.out.println("play (float duration, " + repeat + ", String[] lyrics):  " + i + ":00 " + lyricsStr);
            }
        if (duration > 10) {
            System.out.println("Song cannot be played for more than 10 seconds");
        }
        if (n == 1) {
            System.out.println("The song cannot be played more than once");
        }
    }
}
