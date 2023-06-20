package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: ResourceHelp.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static String f10469a;

    /* renamed from: b  reason: collision with root package name */
    private static Resources f10470b;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c  reason: collision with root package name */
    private static Context f10471c;

    public static void a(String str) {
        f10469a = str;
    }

    private static String b(Context context) {
        if (f10469a == null) {
            f10469a = context.getPackageName();
        }
        return f10469a;
    }

    public static Drawable c(Context context, String str) {
        return context.getResources().getDrawable(d(context, str));
    }

    public static int d(Context context, String str) {
        return a(context, str, "drawable");
    }

    public static int e(Context context, String str) {
        return a(context, str, "id");
    }

    public static int f(Context context, String str) {
        return a(context, str, "layout");
    }

    public static int g(Context context, String str) {
        return a(context, str, "style");
    }

    public static int h(Context context, String str) {
        return a(context, str, "attr");
    }

    public static int i(Context context, String str) {
        return a(context, str, "dimen");
    }

    public static int j(Context context, String str) {
        return context.getResources().getColor(k(context, str));
    }

    public static int k(Context context, String str) {
        return a(context, str, "color");
    }

    public static int l(Context context, String str) {
        return a(context, str, "anim");
    }

    public static int m(Context context, String str) {
        return a(context, str, "integer");
    }

    public static int n(Context context, String str) {
        return context.getResources().getInteger(m(context, str));
    }

    private static int a(Context context, String str, String str2) {
        if (f10470b == null) {
            f10470b = context.getResources();
        }
        return f10470b.getIdentifier(str, str2, b(context));
    }

    public static int b(Context context, String str) {
        return a(context, str, "string");
    }

    public static String a(Context context, String str) {
        Context context2 = f10471c;
        if (context2 == null) {
            return context.getResources().getString(b(context, str));
        }
        return context2.getResources().getString(b(f10471c, str));
    }

    public static void a(Context context) {
        f10471c = context;
    }
}
