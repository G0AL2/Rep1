package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings.java */
/* loaded from: classes2.dex */
class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(long j10) {
        return b(j10, Locale.getDefault());
    }

    static String b(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return n.b(locale).format(new Date(j10));
        }
        return n.f(locale).format(new Date(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(long j10) {
        return d(j10, Locale.getDefault());
    }

    static String d(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return n.m(locale).format(new Date(j10));
        }
        return n.f(locale).format(new Date(j10));
    }
}
