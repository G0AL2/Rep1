package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f;
import i.b;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class h extends Dialog implements e {

    /* renamed from: a  reason: collision with root package name */
    private f f901a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f902b;

    /* compiled from: AppCompatDialog.java */
    /* loaded from: classes.dex */
    class a implements f.a {
        a() {
        }

        @Override // androidx.core.view.f.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.c(keyEvent);
        }
    }

    public h(Context context, int i10) {
        super(context, b(context, i10));
        this.f902b = new a();
        f a10 = a();
        a10.I(b(context, i10));
        a10.t(null);
    }

    private static int b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(d.a.f28680z, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    public f a() {
        if (this.f901a == null) {
            this.f901a = f.j(this, this);
        }
        return this.f901a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i10) {
        return a().C(i10);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().u();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.f.e(this.f902b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) a().k(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().q();
        super.onCreate(bundle);
        a().t(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().z();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(i.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(i.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public i.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        a().D(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().J(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().E(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().F(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        a().J(getContext().getString(i10));
    }
}
