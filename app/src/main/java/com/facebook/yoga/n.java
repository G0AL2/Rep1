package com.facebook.yoga;

/* compiled from: YogaMeasureMode.java */
/* loaded from: classes.dex */
public enum n {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    n(int i10) {
    }

    public static n a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return AT_MOST;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i10);
            }
            return EXACTLY;
        }
        return UNDEFINED;
    }
}
