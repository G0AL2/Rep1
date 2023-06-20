package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* loaded from: classes.dex */
public class AnimationButton extends TextView implements b {

    /* renamed from: a  reason: collision with root package name */
    a f9524a;

    /* renamed from: b  reason: collision with root package name */
    private float f9525b;

    /* renamed from: c  reason: collision with root package name */
    private float f9526c;

    /* renamed from: d  reason: collision with root package name */
    private float f9527d;

    public AnimationButton(Context context) {
        super(context);
        this.f9524a = new a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.b
    public float getMarqueeValue() {
        return this.f9527d;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.b
    public float getRippleValue() {
        return this.f9525b;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.b
    public float getShineValue() {
        return this.f9526c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f9524a.a(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f9524a.a(this, i10, i11);
    }

    public void setMarqueeValue(float f10) {
        this.f9527d = f10;
        postInvalidate();
    }

    public void setRippleValue(float f10) {
        this.f9525b = f10;
        postInvalidate();
    }

    public void setShineValue(float f10) {
        this.f9526c = f10;
        postInvalidate();
    }
}
