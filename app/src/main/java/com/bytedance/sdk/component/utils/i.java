package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* compiled from: LanguageUtils.java */
/* loaded from: classes.dex */
public class i {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static Context f10456a;

    public static void a(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            Configuration b10 = b(context, str, str2);
            if (Build.VERSION.SDK_INT >= 17) {
                f10456a = context.createConfigurationContext(b10);
            }
        } catch (Throwable th) {
            l.b(th.getMessage());
        }
        t.a(f10456a);
    }

    private static Configuration b(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(new Locale(str, str2));
        }
        return configuration;
    }
}
