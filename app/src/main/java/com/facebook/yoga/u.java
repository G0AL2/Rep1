package com.facebook.yoga;

/* compiled from: YogaUnit.java */
/* loaded from: classes.dex */
public enum u {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f16653a;

    u(int i10) {
        this.f16653a = i10;
    }

    public static u a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return AUTO;
                    }
                    throw new IllegalArgumentException("Unknown enum value: " + i10);
                }
                return PERCENT;
            }
            return POINT;
        }
        return UNDEFINED;
    }

    public int f() {
        return this.f16653a;
    }
}
