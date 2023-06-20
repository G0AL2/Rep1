package com.facebook.hermes.intl;

import android.os.Build;

/* compiled from: LocaleObject.java */
/* loaded from: classes.dex */
public class i {
    public static a a() {
        return Build.VERSION.SDK_INT >= 24 ? k.i() : j.i();
    }

    public static a b(String str) throws i5.d {
        if (Build.VERSION.SDK_INT >= 24) {
            return k.j(str);
        }
        return j.j(str);
    }
}
