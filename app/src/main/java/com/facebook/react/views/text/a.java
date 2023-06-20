package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: CustomLetterSpacingSpan.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class a extends MetricAffectingSpan implements j {

    /* renamed from: a  reason: collision with root package name */
    private final float f16183a;

    public a(float f10) {
        this.f16183a = f10;
    }

    private void a(TextPaint textPaint) {
        if (Float.isNaN(this.f16183a)) {
            return;
        }
        textPaint.setLetterSpacing(this.f16183a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
