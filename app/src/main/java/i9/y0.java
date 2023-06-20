package i9;

import android.os.Bundle;
import j8.g;

/* compiled from: TrackGroupArray.java */
/* loaded from: classes2.dex */
public final class y0 implements j8.g {

    /* renamed from: d */
    public static final y0 f31861d = new y0(new w0[0]);

    /* renamed from: e */
    public static final g.a<y0> f31862e = new g.a() { // from class: i9.x0
        @Override // j8.g.a
        public final j8.g a(Bundle bundle) {
            return y0.a(bundle);
        }
    };

    /* renamed from: a */
    public final int f31863a;

    /* renamed from: b */
    private final jb.s<w0> f31864b;

    /* renamed from: c */
    private int f31865c;

    public y0(w0... w0VarArr) {
        this.f31864b = jb.s.q(w0VarArr);
        this.f31863a = w0VarArr.length;
        f();
    }

    public static /* synthetic */ y0 a(Bundle bundle) {
        return e(bundle);
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ y0 e(Bundle bundle) {
        return new y0((w0[]) ea.b.c(w0.f31845e, bundle.getParcelableArrayList(d(0)), jb.s.t()).toArray(new w0[0]));
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f31864b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f31864b.size(); i12++) {
                if (this.f31864b.get(i10).equals(this.f31864b.get(i12))) {
                    ea.r.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public w0 b(int i10) {
        return this.f31864b.get(i10);
    }

    public int c(w0 w0Var) {
        int indexOf = this.f31864b.indexOf(w0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y0.class != obj.getClass()) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f31863a == y0Var.f31863a && this.f31864b.equals(y0Var.f31864b);
    }

    public int hashCode() {
        if (this.f31865c == 0) {
            this.f31865c = this.f31864b.hashCode();
        }
        return this.f31865c;
    }
}
