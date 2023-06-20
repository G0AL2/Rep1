package j8;

import android.os.Bundle;
import j8.g;
import j8.n3;
import java.util.Arrays;
import java.util.List;

/* compiled from: TracksInfo.java */
/* loaded from: classes2.dex */
public final class n3 implements g {

    /* renamed from: b */
    public static final n3 f32654b = new n3(jb.s.t());

    /* renamed from: a */
    private final jb.s<a> f32655a;

    /* compiled from: TracksInfo.java */
    /* loaded from: classes2.dex */
    public static final class a implements g {

        /* renamed from: e */
        public static final g.a<a> f32656e = new g.a() { // from class: j8.m3
            @Override // j8.g.a
            public final g a(Bundle bundle) {
                return n3.a.a(bundle);
            }
        };

        /* renamed from: a */
        private final i9.w0 f32657a;

        /* renamed from: b */
        private final int[] f32658b;

        /* renamed from: c */
        private final int f32659c;

        /* renamed from: d */
        private final boolean[] f32660d;

        public a(i9.w0 w0Var, int[] iArr, int i10, boolean[] zArr) {
            int i11 = w0Var.f31846a;
            ea.a.a(i11 == iArr.length && i11 == zArr.length);
            this.f32657a = w0Var;
            this.f32658b = (int[]) iArr.clone();
            this.f32659c = i10;
            this.f32660d = (boolean[]) zArr.clone();
        }

        public static /* synthetic */ a a(Bundle bundle) {
            return e(bundle);
        }

        private static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ a e(Bundle bundle) {
            i9.w0 w0Var = (i9.w0) ea.b.d(i9.w0.f31845e, bundle.getBundle(d(0)));
            ea.a.e(w0Var);
            return new a(w0Var, (int[]) ib.g.a(bundle.getIntArray(d(1)), new int[w0Var.f31846a]), bundle.getInt(d(2), -1), (boolean[]) ib.g.a(bundle.getBooleanArray(d(3)), new boolean[w0Var.f31846a]));
        }

        public int b() {
            return this.f32659c;
        }

        public boolean c() {
            return mb.a.b(this.f32660d, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32659c == aVar.f32659c && this.f32657a.equals(aVar.f32657a) && Arrays.equals(this.f32658b, aVar.f32658b) && Arrays.equals(this.f32660d, aVar.f32660d);
        }

        public int hashCode() {
            return (((((this.f32657a.hashCode() * 31) + Arrays.hashCode(this.f32658b)) * 31) + this.f32659c) * 31) + Arrays.hashCode(this.f32660d);
        }
    }

    public n3(List<a> list) {
        this.f32655a = jb.s.p(list);
    }

    public jb.s<a> a() {
        return this.f32655a;
    }

    public boolean b(int i10) {
        for (int i11 = 0; i11 < this.f32655a.size(); i11++) {
            a aVar = this.f32655a.get(i11);
            if (aVar.c() && aVar.b() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        return this.f32655a.equals(((n3) obj).f32655a);
    }

    public int hashCode() {
        return this.f32655a.hashCode();
    }
}
