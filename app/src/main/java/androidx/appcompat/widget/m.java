package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
class m {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f1622a;

    /* renamed from: b  reason: collision with root package name */
    private final o0.a f1623b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(EditText editText) {
        this.f1622a = editText;
        this.f1623b = new o0.a(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f1623b.a(keyListener) : keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1622a.getContext().obtainStyledAttributes(attributeSet, d.j.f28811d0, i10, 0);
        try {
            int i11 = d.j.f28881r0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1623b.b(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.f1623b.c(z10);
    }
}
