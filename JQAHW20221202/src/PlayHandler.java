public class PlayHandler {

    public void play (int duration){
        for (int i = 0; i <= duration; i+=5) {
            System.out.println("play (int duration):  " + i + ":00");
        }
    }
    public void play (long duration){
        for (int i = 0; i <= duration; i+=5) {
            System.out.println("play (long duration):  " + i + ":00");
        }
    }
    public void play (double duration){
        for (int i = 0; i <= duration; i+=5) {
            System.out.println("play (double duration):  " + i + ":00");
        }
    }
    public void play (float duration){
        for (int i = 0; i <= duration; i+=5) {
            System.out.println("play (float duration):  " + i + ":00");
        }
    }

    //    ===============================================================================

    public void play (int duration, boolean repeat){
        int n = repeat ? 1 : 0;
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i <= duration; i += 5) {
                System.out.println("play (int duration, " + repeat + "):  " + i + ":00");
            }
        }
    }
    public void play (long duration, boolean repeat){
        int n = repeat ? 1 : 0;
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i <= duration; i += 5) {
                System.out.println("play (long duration, " + repeat + "):  " + i + ":00");
            }
        }
    }
    public void play (double duration, boolean repeat){
        int n = repeat ? 1 : 0;
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i <= duration; i += 5) {
                System.out.println("play (double duration, " + repeat + "):  " + i + ":00");
            }
        }
    }
    public void play (float duration, boolean repeat){
        int n = repeat ? 1 : 0;
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i <= duration; i += 5) {
                System.out.println("play (float duration, " + repeat + "):  " + i + ":00");
            }
        }
    }

    //    ===============================================================================

    public void play (int duration, boolean repeat, String[] lyrics){
        int n = repeat ? 1 : 0;
        String lyricsStr;
        for (int j = 0; j <= n; j++) {
            for (int i = 0, k=0; i <= duration; i += 5, k++) {
                if (k < lyrics.length){
                    lyricsStr = lyrics[k];
                } else lyricsStr = "";
                System.out.println("play (int duration, " + repeat + ", String[] lyrics):  " + i + ":00 " + lyricsStr);
            }
        }
    }
    public void play (long duration, boolean repeat, String[] lyrics){
        int n = repeat ? 1 : 0;
        String lyricsStr;
        for (int j = 0; j <= n; j++) {
            for (int i = 0, k=0; i <= duration; i += 5, k++) {
                if (k < lyrics.length){
                    lyricsStr = lyrics[k];
                } else lyricsStr = "";
                System.out.println("play (long duration, " + repeat + ", String[] lyrics):  " + i + ":00 " + lyricsStr);
            }
        }
    }
    public void play (double duration, boolean repeat, String[] lyrics){
        int n = repeat ? 1 : 0;
        String lyricsStr;
        for (int j = 0; j <= n; j++) {
            for (int i = 0, k=0; i <= duration; i += 5, k++) {
                if (k < lyrics.length){
                    lyricsStr = lyrics[k];
                } else lyricsStr = "";
                System.out.println("play (double duration, " + repeat + ", String[] lyrics):  " + i + ":00 " + lyricsStr);
            }
        }
    }
    public void play (float duration, boolean repeat, String[] lyrics){
        int n = repeat ? 1 : 0;
        String lyricsStr;
        for (int j = 0; j <= n; j++) {
            for (int i = 0, k=0; i <= duration; i += 5, k++) {
                if (k < lyrics.length){
                    lyricsStr = lyrics[k];
                } else lyricsStr = "";
                System.out.println("play (float duration, " + repeat + ", String[] lyrics):  " + i + ":00 " + lyricsStr);
            }
        }
    }
}
