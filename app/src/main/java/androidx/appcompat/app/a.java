package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import i.b;

/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract View i();

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(int i10);

    public abstract void s(boolean z10);

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(boolean z10);

    public abstract void w(boolean z10);

    public abstract void x(CharSequence charSequence);

    public abstract void y(CharSequence charSequence);

    public i.b z(b.a aVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0033a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f820a;

        public C0033a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f820a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f28890t);
            this.f820a = obtainStyledAttributes.getInt(d.j.f28895u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0033a(int i10, int i11) {
            super(i10, i11);
            this.f820a = 0;
            this.f820a = 8388627;
        }

        public C0033a(C0033a c0033a) {
            super((ViewGroup.MarginLayoutParams) c0033a);
            this.f820a = 0;
            this.f820a = c0033a.f820a;
        }

        public C0033a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f820a = 0;
        }
    }
}
