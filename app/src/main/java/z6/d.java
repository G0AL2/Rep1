package z6;

import java.util.Locale;

/* compiled from: InterpolatorType.java */
/* loaded from: classes.dex */
enum d {
    LINEAR,
    EASE_IN,
    EASE_OUT,
    EASE_IN_EASE_OUT,
    SPRING;

    public static d a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case -1965056864:
                if (lowerCase.equals("easeout")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1310315117:
                if (lowerCase.equals("easein")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1102672091:
                if (lowerCase.equals("linear")) {
                    c10 = 2;
                    break;
                }
                break;
            case -895679987:
                if (lowerCase.equals("spring")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1164546989:
                if (lowerCase.equals("easeineaseout")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return EASE_OUT;
            case 1:
                return EASE_IN;
            case 2:
                return LINEAR;
            case 3:
                return SPRING;
            case 4:
                return EASE_IN_EASE_OUT;
            default:
                throw new IllegalArgumentException("Unsupported interpolation type : " + str);
        }
    }
}
