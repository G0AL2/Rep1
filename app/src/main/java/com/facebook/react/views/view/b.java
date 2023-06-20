package com.facebook.react.views.view;

/* compiled from: ColorUtil.java */
/* loaded from: classes.dex */
public class b {
    public static int a(int i10) {
        int i11 = i10 >>> 24;
        if (i11 == 255) {
            return -1;
        }
        return i11 == 0 ? -2 : -3;
    }

    public static int b(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }
}
