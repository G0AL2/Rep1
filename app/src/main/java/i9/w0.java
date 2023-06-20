package i9;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j8.g;
import j8.p1;
import java.util.Arrays;

/* compiled from: TrackGroup.java */
/* loaded from: classes2.dex */
public final class w0 implements j8.g {

    /* renamed from: e */
    public static final g.a<w0> f31845e = new g.a() { // from class: i9.v0
        @Override // j8.g.a
        public final j8.g a(Bundle bundle) {
            return w0.a(bundle);
        }
    };

    /* renamed from: a */
    public final int f31846a;

    /* renamed from: b */
    public final String f31847b;

    /* renamed from: c */
    private final p1[] f31848c;

    /* renamed from: d */
    private int f31849d;

    public w0(p1... p1VarArr) {
        this("", p1VarArr);
    }

    public static /* synthetic */ w0 a(Bundle bundle) {
        return f(bundle);
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ w0 f(Bundle bundle) {
        return new w0(bundle.getString(e(1), ""), (p1[]) ea.b.c(p1.H, bundle.getParcelableArrayList(e(0)), jb.s.t()).toArray(new p1[0]));
    }

    private static void g(String str, String str2, String str3, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("Different ");
        sb2.append(str);
        sb2.append(" combined in one TrackGroup: '");
        sb2.append(str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i10);
        sb2.append(")");
        ea.r.d("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    private static String h(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int i(int i10) {
        return i10 | 16384;
    }

    private void j() {
        String h10 = h(this.f31848c[0].f32700c);
        int i10 = i(this.f31848c[0].f32702e);
        int i11 = 1;
        while (true) {
            p1[] p1VarArr = this.f31848c;
            if (i11 >= p1VarArr.length) {
                return;
            }
            if (!h10.equals(h(p1VarArr[i11].f32700c))) {
                p1[] p1VarArr2 = this.f31848c;
                g("languages", p1VarArr2[0].f32700c, p1VarArr2[i11].f32700c, i11);
                return;
            } else if (i10 != i(this.f31848c[i11].f32702e)) {
                g("role flags", Integer.toBinaryString(this.f31848c[0].f32702e), Integer.toBinaryString(this.f31848c[i11].f32702e), i11);
                return;
            } else {
                i11++;
            }
        }
    }

    public w0 b(String str) {
        return new w0(str, this.f31848c);
    }

    public p1 c(int i10) {
        return this.f31848c[i10];
    }

    public int d(p1 p1Var) {
        int i10 = 0;
        while (true) {
            p1[] p1VarArr = this.f31848c;
            if (i10 >= p1VarArr.length) {
                return -1;
            }
            if (p1Var == p1VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f31846a == w0Var.f31846a && this.f31847b.equals(w0Var.f31847b) && Arrays.equals(this.f31848c, w0Var.f31848c);
    }

    public int hashCode() {
        if (this.f31849d == 0) {
            this.f31849d = ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f31847b.hashCode()) * 31) + Arrays.hashCode(this.f31848c);
        }
        return this.f31849d;
    }

    public w0(String str, p1... p1VarArr) {
        ea.a.a(p1VarArr.length > 0);
        this.f31847b = str;
        this.f31848c = p1VarArr;
        this.f31846a = p1VarArr.length;
        j();
    }
}
