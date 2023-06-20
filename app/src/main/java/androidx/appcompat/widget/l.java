package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* compiled from: AppCompatEditText.java */
/* loaded from: classes.dex */
public class l extends EditText implements androidx.core.view.x, androidx.core.view.u {

    /* renamed from: a  reason: collision with root package name */
    private final e f1584a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1585b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f1586c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.core.widget.k f1587d;

    /* renamed from: e  reason: collision with root package name */
    private final m f1588e;

    public l(Context context) {
        this(context, null);
    }

    @Override // androidx.core.view.u
    public androidx.core.view.c a(androidx.core.view.c cVar) {
        return this.f1587d.a(this, cVar);
    }

    void b(m mVar) {
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
        e eVar = this.f1584a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1585b;
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
        e eVar = this.f1584a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1584a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT < 28 && (a0Var = this.f1586c) != null) {
            return a0Var.a();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] F;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1585b.r(this, onCreateInputConnection, editorInfo);
        InputConnection a10 = o.a(onCreateInputConnection, editorInfo, this);
        if (a10 != null && Build.VERSION.SDK_INT <= 30 && (F = androidx.core.view.z.F(this)) != null) {
            k0.a.d(editorInfo, F);
            a10 = k0.b.b(this, a10, editorInfo);
        }
        return this.f1588e.d(a10, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (x.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1584a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1584a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1588e.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1588e.a(keyListener));
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1584a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1584a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1585b;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT < 28 && (a0Var = this.f1586c) != null) {
            a0Var.b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.B);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public l(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1584a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1585b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        this.f1586c = new a0(this);
        this.f1587d = new androidx.core.widget.k();
        m mVar = new m(this);
        this.f1588e = mVar;
        mVar.c(attributeSet, i10);
        b(mVar);
    }
}
