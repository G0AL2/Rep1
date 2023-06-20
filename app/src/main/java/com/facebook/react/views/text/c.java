package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: CustomStyleSpan.java */
/* loaded from: classes.dex */
public class c extends MetricAffectingSpan implements j {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f16187a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16188b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16189c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16190d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16191e;

    public c(int i10, int i11, String str, String str2, AssetManager assetManager) {
        this.f16188b = i10;
        this.f16189c = i11;
        this.f16190d = str;
        this.f16191e = str2;
        this.f16187a = assetManager;
    }

    private static void a(Paint paint, int i10, int i11, String str, String str2, AssetManager assetManager) {
        Typeface a10 = q.a(paint.getTypeface(), i10, i11, str2, assetManager);
        paint.setFontFeatureSettings(str);
        paint.setTypeface(a10);
        paint.setSubpixelText(true);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.f16188b, this.f16189c, this.f16190d, this.f16191e, this.f16187a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.f16188b, this.f16189c, this.f16190d, this.f16191e, this.f16187a);
    }
}
