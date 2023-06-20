package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* compiled from: AppCompatRadioButton.java */
/* loaded from: classes.dex */
public class v extends RadioButton implements androidx.core.widget.m, androidx.core.view.x {

    /* renamed from: a  reason: collision with root package name */
    private final j f1741a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1742b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f1743c;

    /* renamed from: d  reason: collision with root package name */
    private n f1744d;

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.F);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1744d == null) {
            this.f1744d = new n(this);
        }
        return this.f1744d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1742b;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1743c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        j jVar = this.f1741a;
        return jVar != null ? jVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.x
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1742b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1742b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f1741a;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f1741a;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1742b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1742b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f1741a;
        if (jVar != null) {
            jVar.f();
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
        e eVar = this.f1742b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1742b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f1741a;
        if (jVar != null) {
            jVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f1741a;
        if (jVar != null) {
            jVar.h(mode);
        }
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        j jVar = new j(this);
        this.f1741a = jVar;
        jVar.e(attributeSet, i10);
        e eVar = new e(this);
        this.f1742b = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1743c = b0Var;
        b0Var.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(e.a.b(getContext(), i10));
    }
}
