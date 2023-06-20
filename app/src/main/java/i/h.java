package i;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.g0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f31475c;

    /* renamed from: d  reason: collision with root package name */
    f0 f31476d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31477e;

    /* renamed from: b  reason: collision with root package name */
    private long f31474b = -1;

    /* renamed from: f  reason: collision with root package name */
    private final g0 f31478f = new a();

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<e0> f31473a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes.dex */
    class a extends g0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f31479a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f31480b = 0;

        a() {
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            int i10 = this.f31480b + 1;
            this.f31480b = i10;
            if (i10 == h.this.f31473a.size()) {
                f0 f0Var = h.this.f31476d;
                if (f0Var != null) {
                    f0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.g0, androidx.core.view.f0
        public void c(View view) {
            if (this.f31479a) {
                return;
            }
            this.f31479a = true;
            f0 f0Var = h.this.f31476d;
            if (f0Var != null) {
                f0Var.c(null);
            }
        }

        void d() {
            this.f31480b = 0;
            this.f31479a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f31477e) {
            Iterator<e0> it = this.f31473a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f31477e = false;
        }
    }

    void b() {
        this.f31477e = false;
    }

    public h c(e0 e0Var) {
        if (!this.f31477e) {
            this.f31473a.add(e0Var);
        }
        return this;
    }

    public h d(e0 e0Var, e0 e0Var2) {
        this.f31473a.add(e0Var);
        e0Var2.h(e0Var.c());
        this.f31473a.add(e0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f31477e) {
            this.f31474b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f31477e) {
            this.f31475c = interpolator;
        }
        return this;
    }

    public h g(f0 f0Var) {
        if (!this.f31477e) {
            this.f31476d = f0Var;
        }
        return this;
    }

    public void h() {
        if (this.f31477e) {
            return;
        }
        Iterator<e0> it = this.f31473a.iterator();
        while (it.hasNext()) {
            e0 next = it.next();
            long j10 = this.f31474b;
            if (j10 >= 0) {
                next.d(j10);
            }
            Interpolator interpolator = this.f31475c;
            if (interpolator != null) {
                next.e(interpolator);
            }
            if (this.f31476d != null) {
                next.f(this.f31478f);
            }
            next.j();
        }
        this.f31477e = true;
    }
}
