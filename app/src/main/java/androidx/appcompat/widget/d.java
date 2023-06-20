package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: AppCompatAutoCompleteTextView.java */
/* loaded from: classes.dex */
public class d extends AutoCompleteTextView implements androidx.core.view.x {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f1465d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    private final e f1466a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1467b;

    /* renamed from: c  reason: collision with root package name */
    private final m f1468c;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f28670p);
    }

    void a(m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a10 = mVar.a(keyListener);
            if (a10 == keyListener) {
                return;
            }
            super.setKeyListener(a10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1466a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1467b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.s(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.x
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1466a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1466a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1468c.d(o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1466a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1466a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.t(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(e.a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1468c.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1468c.a(keyListener));
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1466a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1466a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1467b;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        z0 v10 = z0.v(getContext(), attributeSet, f1465d, i10, 0);
        if (v10.s(0)) {
            setDropDownBackgroundDrawable(v10.g(0));
        }
        v10.w();
        e eVar = new e(this);
        this.f1466a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1467b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        m mVar = new m(this);
        this.f1468c = mVar;
        mVar.c(attributeSet, i10);
        a(mVar);
    }
}
