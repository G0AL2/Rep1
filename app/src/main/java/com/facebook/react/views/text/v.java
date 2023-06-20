package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

/* compiled from: TextInlineImageSpan.java */
/* loaded from: classes.dex */
public abstract class v extends ReplacementSpan implements j {
    public static void g(Spannable spannable, TextView textView) {
        v[] vVarArr;
        for (v vVar : (v[]) spannable.getSpans(0, spannable.length(), v.class)) {
            vVar.c();
            vVar.h(textView);
        }
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void h(TextView textView);
}
