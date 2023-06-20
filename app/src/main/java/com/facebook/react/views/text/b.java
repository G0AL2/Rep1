package com.facebook.react.views.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: CustomLineHeightSpan.java */
/* loaded from: classes.dex */
public class b implements LineHeightSpan, j {

    /* renamed from: a  reason: collision with root package name */
    private final int f16186a;

    public b(float f10) {
        this.f16186a = (int) Math.ceil(f10);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = this.f16186a;
        if (i14 > i15) {
            int min = Math.min(i15, i14);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
            return;
        }
        int i16 = fontMetricsInt.ascent;
        if ((-i16) + i14 > i15) {
            fontMetricsInt.bottom = i14;
            int i17 = (-i15) + i14;
            fontMetricsInt.ascent = i17;
            fontMetricsInt.top = i17;
            return;
        }
        int i18 = fontMetricsInt.bottom;
        if ((-i16) + i18 > i15) {
            fontMetricsInt.top = i16;
            fontMetricsInt.bottom = i16 + i15;
            return;
        }
        int i19 = fontMetricsInt.top;
        if ((-i19) + i18 > i15) {
            fontMetricsInt.top = i18 - i15;
            return;
        }
        double d10 = i19;
        double d11 = (i15 - ((-i19) + i18)) / 2.0f;
        fontMetricsInt.top = (int) (d10 - Math.ceil(d11));
        int floor = (int) (fontMetricsInt.bottom + Math.floor(d11));
        fontMetricsInt.bottom = floor;
        fontMetricsInt.ascent = fontMetricsInt.top;
        fontMetricsInt.descent = floor;
    }
}
