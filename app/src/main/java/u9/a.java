package u9;

import android.graphics.Bitmap;
import ea.a0;
import ea.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import r9.b;
import r9.e;
import r9.f;
import r9.h;

/* compiled from: PgsDecoder.java */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: n  reason: collision with root package name */
    private final a0 f37665n;

    /* renamed from: o  reason: collision with root package name */
    private final a0 f37666o;

    /* renamed from: p  reason: collision with root package name */
    private final C0515a f37667p;

    /* renamed from: q  reason: collision with root package name */
    private Inflater f37668q;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PgsDecoder.java */
    /* renamed from: u9.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0515a {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f37669a = new a0();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f37670b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f37671c;

        /* renamed from: d  reason: collision with root package name */
        private int f37672d;

        /* renamed from: e  reason: collision with root package name */
        private int f37673e;

        /* renamed from: f  reason: collision with root package name */
        private int f37674f;

        /* renamed from: g  reason: collision with root package name */
        private int f37675g;

        /* renamed from: h  reason: collision with root package name */
        private int f37676h;

        /* renamed from: i  reason: collision with root package name */
        private int f37677i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(a0 a0Var, int i10) {
            int G;
            if (i10 < 4) {
                return;
            }
            a0Var.Q(3);
            int i11 = i10 - 4;
            if ((a0Var.D() & 128) != 0) {
                if (i11 < 7 || (G = a0Var.G()) < 4) {
                    return;
                }
                this.f37676h = a0Var.J();
                this.f37677i = a0Var.J();
                this.f37669a.L(G - 4);
                i11 -= 7;
            }
            int e10 = this.f37669a.e();
            int f10 = this.f37669a.f();
            if (e10 >= f10 || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, f10 - e10);
            a0Var.j(this.f37669a.d(), e10, min);
            this.f37669a.P(e10 + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(a0 a0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f37672d = a0Var.J();
            this.f37673e = a0Var.J();
            a0Var.Q(11);
            this.f37674f = a0Var.J();
            this.f37675g = a0Var.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(a0 a0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            a0Var.Q(2);
            Arrays.fill(this.f37670b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int D = a0Var.D();
                int D2 = a0Var.D();
                int D3 = a0Var.D();
                int D4 = a0Var.D();
                int D5 = a0Var.D();
                double d10 = D2;
                double d11 = D3 - 128;
                int i13 = i12;
                double d12 = D4 - 128;
                this.f37670b[D] = n0.q((int) (d10 + (d12 * 1.772d)), 0, 255) | (n0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (D5 << 24) | (n0.q((int) ((1.402d * d11) + d10), 0, 255) << 16);
                i12 = i13 + 1;
            }
            this.f37671c = true;
        }

        public r9.b d() {
            int i10;
            if (this.f37672d == 0 || this.f37673e == 0 || this.f37676h == 0 || this.f37677i == 0 || this.f37669a.f() == 0 || this.f37669a.e() != this.f37669a.f() || !this.f37671c) {
                return null;
            }
            this.f37669a.P(0);
            int i11 = this.f37676h * this.f37677i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int D = this.f37669a.D();
                if (D != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f37670b[D];
                } else {
                    int D2 = this.f37669a.D();
                    if (D2 != 0) {
                        i10 = ((D2 & 64) == 0 ? D2 & 63 : ((D2 & 63) << 8) | this.f37669a.D()) + i12;
                        Arrays.fill(iArr, i12, i10, (D2 & 128) == 0 ? 0 : this.f37670b[this.f37669a.D()]);
                    }
                }
                i12 = i10;
            }
            return new b.C0490b().f(Bitmap.createBitmap(iArr, this.f37676h, this.f37677i, Bitmap.Config.ARGB_8888)).k(this.f37674f / this.f37672d).l(0).h(this.f37675g / this.f37673e, 0).i(0).n(this.f37676h / this.f37672d).g(this.f37677i / this.f37673e).a();
        }

        public void h() {
            this.f37672d = 0;
            this.f37673e = 0;
            this.f37674f = 0;
            this.f37675g = 0;
            this.f37676h = 0;
            this.f37677i = 0;
            this.f37669a.L(0);
            this.f37671c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f37665n = new a0();
        this.f37666o = new a0();
        this.f37667p = new C0515a();
    }

    private void B(a0 a0Var) {
        if (a0Var.a() <= 0 || a0Var.h() != 120) {
            return;
        }
        if (this.f37668q == null) {
            this.f37668q = new Inflater();
        }
        if (n0.r0(a0Var, this.f37666o, this.f37668q)) {
            a0Var.N(this.f37666o.d(), this.f37666o.f());
        }
    }

    private static r9.b C(a0 a0Var, C0515a c0515a) {
        int f10 = a0Var.f();
        int D = a0Var.D();
        int J = a0Var.J();
        int e10 = a0Var.e() + J;
        r9.b bVar = null;
        if (e10 > f10) {
            a0Var.P(f10);
            return null;
        }
        if (D != 128) {
            switch (D) {
                case 20:
                    c0515a.g(a0Var, J);
                    break;
                case 21:
                    c0515a.e(a0Var, J);
                    break;
                case 22:
                    c0515a.f(a0Var, J);
                    break;
            }
        } else {
            bVar = c0515a.d();
            c0515a.h();
        }
        a0Var.P(e10);
        return bVar;
    }

    @Override // r9.e
    protected f z(byte[] bArr, int i10, boolean z10) throws h {
        this.f37665n.N(bArr, i10);
        B(this.f37665n);
        this.f37667p.h();
        ArrayList arrayList = new ArrayList();
        while (this.f37665n.a() >= 3) {
            r9.b C = C(this.f37665n, this.f37667p);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
