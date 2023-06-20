package com.inmobi.media;

/* compiled from: Orientation.java */
/* loaded from: classes3.dex */
public enum df {
    PORTRAIT(0),
    LANDSCAPE(90),
    REVERSE_PORTRAIT(180),
    REVERSE_LANDSCAPE(270);
    

    /* renamed from: e  reason: collision with root package name */
    public final int f25102e;

    df(int i10) {
        this.f25102e = i10;
    }

    public final boolean a() {
        int i10 = this.f25102e;
        return i10 == LANDSCAPE.f25102e || i10 == REVERSE_LANDSCAPE.f25102e;
    }

    public static df a(int i10) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return PORTRAIT;
                }
                return REVERSE_LANDSCAPE;
            }
            return LANDSCAPE;
        }
        return REVERSE_PORTRAIT;
    }
}
