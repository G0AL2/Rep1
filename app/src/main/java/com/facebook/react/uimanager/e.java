package com.facebook.react.uimanager;

/* compiled from: FloatUtil.java */
/* loaded from: classes.dex */
public class e {
    public static boolean a(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) && Float.isNaN(f11) : Math.abs(f11 - f10) < 1.0E-5f;
    }
}
