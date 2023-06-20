package o0;

import android.os.Build;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f34839a;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: o0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0462a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f34840a;

        /* renamed from: b  reason: collision with root package name */
        private final g f34841b;

        C0462a(EditText editText, boolean z10) {
            this.f34840a = editText;
            g gVar = new g(editText, z10);
            this.f34841b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(o0.b.getInstance());
        }

        @Override // o0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new e(keyListener);
        }

        @Override // o0.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f34840a, inputConnection, editorInfo);
        }

        @Override // o0.a.b
        void c(boolean z10) {
            this.f34841b.c(z10);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        void c(boolean z10) {
        }
    }

    public a(EditText editText, boolean z10) {
        h0.g.g(editText, "editText cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f34839a = new b();
        } else {
            this.f34839a = new C0462a(editText, z10);
        }
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f34839a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f34839a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f34839a.c(z10);
    }
}
