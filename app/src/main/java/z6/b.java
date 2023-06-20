package z6;

/* compiled from: AnimatedPropertyType.java */
/* loaded from: classes.dex */
enum b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;

    public static b a(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    c10 = 0;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c10 = 1;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1910893003:
                if (str.equals("scaleXY")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return OPACITY;
            case 1:
                return SCALE_X;
            case 2:
                return SCALE_Y;
            case 3:
                return SCALE_XY;
            default:
                throw new IllegalArgumentException("Unsupported animated property: " + str);
        }
    }
}
