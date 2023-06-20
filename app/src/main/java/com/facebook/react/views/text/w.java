package com.facebook.react.views.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: TextInlineViewPlaceholderSpan.java */
/* loaded from: classes.dex */
public class w extends ReplacementSpan implements j {

    /* renamed from: a  reason: collision with root package name */
    private int f16275a;

    /* renamed from: b  reason: collision with root package name */
    private int f16276b;

    /* renamed from: c  reason: collision with root package name */
    private int f16277c;

    public w(int i10, int i11, int i12) {
        this.f16275a = i10;
        this.f16276b = i11;
        this.f16277c = i12;
    }

    public int a() {
        return this.f16277c;
    }

    public int b() {
        return this.f16275a;
    }

    public int c() {
        return this.f16276b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = -this.f16277c;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f16276b;
    }
}
