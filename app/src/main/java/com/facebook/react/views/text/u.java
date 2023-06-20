package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* compiled from: TextAttributes.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private boolean f16268a = true;

    /* renamed from: b  reason: collision with root package name */
    private float f16269b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    private float f16270c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    private float f16271d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    private float f16272e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    private float f16273f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    private z f16274g = z.UNSET;

    public u a(u uVar) {
        float f10;
        float f11;
        u uVar2 = new u();
        uVar2.f16268a = this.f16268a;
        uVar2.f16269b = !Float.isNaN(uVar.f16269b) ? uVar.f16269b : this.f16269b;
        uVar2.f16270c = !Float.isNaN(uVar.f16270c) ? uVar.f16270c : this.f16270c;
        uVar2.f16271d = !Float.isNaN(uVar.f16271d) ? uVar.f16271d : this.f16271d;
        if (!Float.isNaN(uVar.f16272e)) {
            f10 = uVar.f16272e;
        } else {
            f10 = this.f16272e;
        }
        uVar2.f16272e = f10;
        if (!Float.isNaN(uVar.f16273f)) {
            f11 = uVar.f16273f;
        } else {
            f11 = this.f16273f;
        }
        uVar2.f16273f = f11;
        z zVar = uVar.f16274g;
        if (zVar == z.UNSET) {
            zVar = this.f16274g;
        }
        uVar2.f16274g = zVar;
        return uVar2;
    }

    public boolean b() {
        return this.f16268a;
    }

    public int c() {
        double ceil;
        float f10 = !Float.isNaN(this.f16269b) ? this.f16269b : 14.0f;
        if (this.f16268a) {
            ceil = Math.ceil(com.facebook.react.uimanager.r.f(f10, f()));
        } else {
            ceil = Math.ceil(com.facebook.react.uimanager.r.c(f10));
        }
        return (int) ceil;
    }

    public float d() {
        float c10;
        if (Float.isNaN(this.f16271d)) {
            return Float.NaN;
        }
        if (this.f16268a) {
            c10 = com.facebook.react.uimanager.r.f(this.f16271d, f());
        } else {
            c10 = com.facebook.react.uimanager.r.c(this.f16271d);
        }
        return c10 / c();
    }

    public float e() {
        float c10;
        if (Float.isNaN(this.f16270c)) {
            return Float.NaN;
        }
        if (this.f16268a) {
            c10 = com.facebook.react.uimanager.r.f(this.f16270c, f());
        } else {
            c10 = com.facebook.react.uimanager.r.c(this.f16270c);
        }
        return !Float.isNaN(this.f16273f) && (this.f16273f > c10 ? 1 : (this.f16273f == c10 ? 0 : -1)) > 0 ? this.f16273f : c10;
    }

    public float f() {
        if (Float.isNaN(this.f16272e)) {
            return 0.0f;
        }
        return this.f16272e;
    }

    public float g() {
        return this.f16269b;
    }

    public float h() {
        return this.f16273f;
    }

    public float i() {
        return this.f16271d;
    }

    public float j() {
        return this.f16270c;
    }

    public float k() {
        return this.f16272e;
    }

    public z l() {
        return this.f16274g;
    }

    public void m(boolean z10) {
        this.f16268a = z10;
    }

    public void n(float f10) {
        this.f16269b = f10;
    }

    public void o(float f10) {
        this.f16273f = f10;
    }

    public void p(float f10) {
        this.f16271d = f10;
    }

    public void q(float f10) {
        this.f16270c = f10;
    }

    public void r(float f10) {
        if (f10 != 0.0f && f10 < 1.0f) {
            throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
        }
        this.f16272e = f10;
    }

    public void s(z zVar) {
        this.f16274g = zVar;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + b() + "\n  getFontSize(): " + g() + "\n  getEffectiveFontSize(): " + c() + "\n  getHeightOfTallestInlineViewOrImage(): " + h() + "\n  getLetterSpacing(): " + i() + "\n  getEffectiveLetterSpacing(): " + d() + "\n  getLineHeight(): " + j() + "\n  getEffectiveLineHeight(): " + e() + "\n  getTextTransform(): " + l() + "\n  getMaxFontSizeMultiplier(): " + k() + "\n  getEffectiveMaxFontSizeMultiplier(): " + f() + "\n}";
    }
}
