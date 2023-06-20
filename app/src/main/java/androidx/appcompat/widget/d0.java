package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton.java */
/* loaded from: classes.dex */
public class d0 extends ToggleButton implements androidx.core.view.x {

    /* renamed from: a  reason: collision with root package name */
    private final e f1469a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1470b;

    /* renamed from: c  reason: collision with root package name */
    private n f1471c;

    public d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1471c == null) {
            this.f1471c = new n(this);
        }
        return this.f1471c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1469a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1470b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // androidx.core.view.x
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1469a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1469a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1469a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1469a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1469a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1469a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public d0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1469a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1470b = b0Var;
        b0Var.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
