package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;

/* compiled from: DecorToolbar.java */
/* loaded from: classes.dex */
public interface f0 {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, j.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    void j(CharSequence charSequence);

    Menu k();

    int l();

    androidx.core.view.e0 m(int i10, long j10);

    ViewGroup n();

    void o(boolean z10);

    void p();

    void q(boolean z10);

    void r();

    View s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(r0 r0Var);

    void u(int i10);

    void v(j.a aVar, e.a aVar2);

    int w();

    void x(View view);

    void y();
}
