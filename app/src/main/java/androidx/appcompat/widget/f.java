package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* compiled from: AppCompatButton.java */
/* loaded from: classes.dex */
public class f extends Button implements androidx.core.view.x, androidx.core.widget.b, androidx.core.widget.n {

    /* renamed from: a  reason: collision with root package name */
    private final e f1498a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1499b;

    /* renamed from: c  reason: collision with root package name */
    private n f1500c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f28671q);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1500c == null) {
            this.f1500c = new n(this);
        }
        return this.f1500c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1498a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f2806a0) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            return b0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f2806a0) {
            return super.getAutoSizeMinTextSize();
        }
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            return b0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f2806a0) {
            return super.getAutoSizeStepGranularity();
        }
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            return b0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f2806a0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b0 b0Var = this.f1499b;
        return b0Var != null ? b0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f2806a0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            return b0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.s(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.x
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1498a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1498a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1499b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1499b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            b0Var.o(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b0 b0Var = this.f1499b;
        if (b0Var == null || androidx.core.widget.b.f2806a0 || !b0Var.l()) {
            return;
        }
        this.f1499b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (androidx.core.widget.b.f2806a0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            b0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (androidx.core.widget.b.f2806a0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            b0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (androidx.core.widget.b.f2806a0) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            b0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1498a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1498a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            b0Var.s(z10);
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1498a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1498a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1499b.w(colorStateList);
        this.f1499b.b();
    }

    @Override // androidx.core.widget.n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1499b.x(mode);
        this.f1499b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (androidx.core.widget.b.f2806a0) {
            super.setTextSize(i10, f10);
            return;
        }
        b0 b0Var = this.f1499b;
        if (b0Var != null) {
            b0Var.A(i10, f10);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1498a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1499b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
