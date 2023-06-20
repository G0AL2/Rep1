package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.h0;

/* compiled from: FragmentController.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final j<?> f3151a;

    private h(j<?> jVar) {
        this.f3151a = jVar;
    }

    public static h b(j<?> jVar) {
        return new h((j) h0.g.g(jVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        j<?> jVar = this.f3151a;
        jVar.f3156d.k(jVar, jVar, fragment);
    }

    public void c() {
        this.f3151a.f3156d.z();
    }

    public void d(Configuration configuration) {
        this.f3151a.f3156d.B(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f3151a.f3156d.C(menuItem);
    }

    public void f() {
        this.f3151a.f3156d.D();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f3151a.f3156d.E(menu, menuInflater);
    }

    public void h() {
        this.f3151a.f3156d.F();
    }

    public void i() {
        this.f3151a.f3156d.H();
    }

    public void j(boolean z10) {
        this.f3151a.f3156d.I(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f3151a.f3156d.K(menuItem);
    }

    public void l(Menu menu) {
        this.f3151a.f3156d.L(menu);
    }

    public void m() {
        this.f3151a.f3156d.N();
    }

    public void n(boolean z10) {
        this.f3151a.f3156d.O(z10);
    }

    public boolean o(Menu menu) {
        return this.f3151a.f3156d.P(menu);
    }

    public void p() {
        this.f3151a.f3156d.R();
    }

    public void q() {
        this.f3151a.f3156d.S();
    }

    public void r() {
        this.f3151a.f3156d.U();
    }

    public boolean s() {
        return this.f3151a.f3156d.b0(true);
    }

    public FragmentManager t() {
        return this.f3151a.f3156d;
    }

    public void u() {
        this.f3151a.f3156d.U0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3151a.f3156d.v0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        j<?> jVar = this.f3151a;
        if (jVar instanceof h0) {
            jVar.f3156d.i1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable x() {
        return this.f3151a.f3156d.k1();
    }
}
