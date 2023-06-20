package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: ShadowStyleSpan.java */
/* loaded from: classes.dex */
public class s extends CharacterStyle implements j {

    /* renamed from: a  reason: collision with root package name */
    private final float f16238a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16239b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16240c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16241d;

    public s(float f10, float f11, float f12, int i10) {
        this.f16238a = f10;
        this.f16239b = f11;
        this.f16240c = f12;
        this.f16241d = i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f16240c, this.f16238a, this.f16239b, this.f16241d);
    }
}
