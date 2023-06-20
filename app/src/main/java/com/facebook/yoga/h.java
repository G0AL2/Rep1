package com.facebook.yoga;

/* compiled from: YogaDirection.java */
/* loaded from: classes.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f16604a;

    h(int i10) {
        this.f16604a = i10;
    }

    public static h a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return RTL;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i10);
            }
            return LTR;
        }
        return INHERIT;
    }

    public int f() {
        return this.f16604a;
    }
}
