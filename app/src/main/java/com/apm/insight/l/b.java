package com.apm.insight.l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static DateFormat f6476a;

    public static DateFormat a() {
        if (f6476a == null) {
            f6476a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f6476a;
    }
}
