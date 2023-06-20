package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;

/* compiled from: NativeViewHierarchyOptimizer.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final x0 f15909a;

    /* renamed from: b  reason: collision with root package name */
    private final k0 f15910b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f15911c = new SparseBooleanArray();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeViewHierarchyOptimizer.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d0 f15912a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15913b;

        a(d0 d0Var, int i10) {
            this.f15912a = d0Var;
            this.f15913b = i10;
        }
    }

    public o(x0 x0Var, k0 k0Var) {
        this.f15909a = x0Var;
        this.f15910b = k0Var;
    }

    private void a(d0 d0Var, d0 d0Var2, int i10) {
        f6.a.a(d0Var2.V() != m.PARENT);
        for (int i11 = 0; i11 < d0Var2.b(); i11++) {
            d0 a10 = d0Var2.a(i11);
            f6.a.a(a10.c0() == null);
            int p10 = d0Var.p();
            if (a10.V() == m.NONE) {
                d(d0Var, a10, i10);
            } else {
                b(d0Var, a10, i10);
            }
            i10 += d0Var.p() - p10;
        }
    }

    private void b(d0 d0Var, d0 d0Var2, int i10) {
        d0Var.r(d0Var2, i10);
        this.f15909a.H(d0Var.O(), null, new y0[]{new y0(d0Var2.O(), i10)}, null);
        if (d0Var2.V() != m.PARENT) {
            a(d0Var, d0Var2, i10 + 1);
        }
    }

    private void c(d0 d0Var, d0 d0Var2, int i10) {
        int o10 = d0Var.o(d0Var.a(i10));
        if (d0Var.V() != m.PARENT) {
            a s10 = s(d0Var, o10);
            if (s10 == null) {
                return;
            }
            d0 d0Var3 = s10.f15912a;
            o10 = s10.f15913b;
            d0Var = d0Var3;
        }
        if (d0Var2.V() != m.NONE) {
            b(d0Var, d0Var2, o10);
        } else {
            d(d0Var, d0Var2, o10);
        }
    }

    private void d(d0 d0Var, d0 d0Var2, int i10) {
        a(d0Var, d0Var2, i10);
    }

    private void e(d0 d0Var) {
        int O = d0Var.O();
        if (this.f15911c.get(O)) {
            return;
        }
        this.f15911c.put(O, true);
        int C = d0Var.C();
        int v10 = d0Var.v();
        for (d0 parent = d0Var.getParent(); parent != null && parent.V() != m.PARENT; parent = parent.getParent()) {
            if (!parent.R()) {
                C += Math.round(parent.E());
                v10 += Math.round(parent.B());
            }
        }
        f(d0Var, C, v10);
    }

    private void f(d0 d0Var, int i10, int i11) {
        if (d0Var.V() != m.NONE && d0Var.c0() != null) {
            this.f15909a.R(d0Var.b0().O(), d0Var.O(), i10, i11, d0Var.T(), d0Var.I());
            return;
        }
        for (int i12 = 0; i12 < d0Var.b(); i12++) {
            d0 a10 = d0Var.a(i12);
            int O = a10.O();
            if (!this.f15911c.get(O)) {
                this.f15911c.put(O, true);
                f(a10, a10.C() + i10, a10.v() + i11);
            }
        }
    }

    public static void j(d0 d0Var) {
        d0Var.P();
    }

    private static boolean n(f0 f0Var) {
        if (f0Var == null) {
            return true;
        }
        if (!f0Var.g("collapsable") || f0Var.b("collapsable", true)) {
            ReadableMapKeySetIterator keySetIterator = f0Var.f15851a.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                if (!f1.a(f0Var.f15851a, keySetIterator.nextKey())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private void q(d0 d0Var, boolean z10) {
        if (d0Var.V() != m.PARENT) {
            for (int b10 = d0Var.b() - 1; b10 >= 0; b10--) {
                q(d0Var.a(b10), z10);
            }
        }
        d0 c02 = d0Var.c0();
        if (c02 != null) {
            int q10 = c02.q(d0Var);
            c02.D(q10);
            this.f15909a.H(c02.O(), new int[]{q10}, null, z10 ? new int[]{d0Var.O()} : null);
        }
    }

    private void r(d0 d0Var, f0 f0Var) {
        d0 parent = d0Var.getParent();
        if (parent == null) {
            d0Var.G(false);
            return;
        }
        int Y = parent.Y(d0Var);
        parent.J(Y);
        q(d0Var, false);
        d0Var.G(false);
        this.f15909a.B(d0Var.U(), d0Var.O(), d0Var.y(), f0Var);
        parent.x(d0Var, Y);
        c(parent, d0Var, Y);
        for (int i10 = 0; i10 < d0Var.b(); i10++) {
            c(d0Var, d0Var.a(i10), i10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transitioning LayoutOnlyView - tag: ");
        sb2.append(d0Var.O());
        sb2.append(" - rootTag: ");
        sb2.append(d0Var.W());
        sb2.append(" - hasProps: ");
        sb2.append(f0Var != null);
        sb2.append(" - tagsWithLayout.size: ");
        sb2.append(this.f15911c.size());
        z3.a.o("NativeViewHierarchyOptimizer", sb2.toString());
        f6.a.a(this.f15911c.size() == 0);
        e(d0Var);
        for (int i11 = 0; i11 < d0Var.b(); i11++) {
            e(d0Var.a(i11));
        }
        this.f15911c.clear();
    }

    private a s(d0 d0Var, int i10) {
        while (d0Var.V() != m.PARENT) {
            d0 parent = d0Var.getParent();
            if (parent == null) {
                return null;
            }
            i10 = i10 + (d0Var.V() == m.LEAF ? 1 : 0) + parent.o(d0Var);
            d0Var = parent;
        }
        return new a(d0Var, i10);
    }

    public void g(d0 d0Var, n0 n0Var, f0 f0Var) {
        d0Var.G(d0Var.y().equals(ReactViewManager.REACT_CLASS) && n(f0Var));
        if (d0Var.V() != m.NONE) {
            this.f15909a.B(n0Var, d0Var.O(), d0Var.y(), f0Var);
        }
    }

    public void h(d0 d0Var) {
        if (d0Var.d0()) {
            r(d0Var, null);
        }
    }

    public void i(d0 d0Var, int[] iArr, int[] iArr2, y0[] y0VarArr, int[] iArr3) {
        boolean z10;
        for (int i10 : iArr2) {
            int i11 = 0;
            while (true) {
                if (i11 >= iArr3.length) {
                    z10 = false;
                    break;
                } else if (iArr3[i11] == i10) {
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
            q(this.f15910b.c(i10), z10);
        }
        for (y0 y0Var : y0VarArr) {
            c(d0Var, this.f15910b.c(y0Var.f16078a), y0Var.f16079b);
        }
    }

    public void k(d0 d0Var, ReadableArray readableArray) {
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            c(d0Var, this.f15910b.c(readableArray.getInt(i10)), i10);
        }
    }

    public void l(d0 d0Var) {
        e(d0Var);
    }

    public void m(d0 d0Var, String str, f0 f0Var) {
        if (d0Var.d0() && !n(f0Var)) {
            r(d0Var, f0Var);
        } else if (d0Var.d0()) {
        } else {
            this.f15909a.S(d0Var.O(), str, f0Var);
        }
    }

    public void o() {
        this.f15911c.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(d0 d0Var) {
        this.f15911c.clear();
    }
}
