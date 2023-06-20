package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2644a;

    /* renamed from: b  reason: collision with root package name */
    private InterfaceC0051b f2645b;

    /* compiled from: ActionProvider.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0051b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f2644a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f2645b = null;
    }

    public void i(a aVar) {
    }

    public void j(InterfaceC0051b interfaceC0051b) {
        if (this.f2645b != null && interfaceC0051b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2645b = interfaceC0051b;
    }
}
