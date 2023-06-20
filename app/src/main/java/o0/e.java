package o0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: EmojiKeyListener.java */
/* loaded from: classes.dex */
final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final KeyListener f34851a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34852b;

    /* compiled from: EmojiKeyListener.java */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(Editable editable, int i10, KeyEvent keyEvent) {
            return androidx.emoji2.text.d.f(editable, i10, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f34851a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f34851a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f34852b.a(editable, i10, keyEvent) || this.f34851a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f34851a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f34851a.onKeyUp(view, editable, i10, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f34851a = keyListener;
        this.f34852b = aVar;
    }
}
