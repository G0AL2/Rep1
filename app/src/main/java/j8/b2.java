package j8;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.metadata.Metadata;
import j8.g;
import java.util.Arrays;
import java.util.List;

/* compiled from: MediaMetadata.java */
/* loaded from: classes2.dex */
public final class b2 implements g {
    public static final b2 H = new b().G();
    public static final g.a<b2> I = new g.a() { // from class: j8.a2
        @Override // j8.g.a
        public final g a(Bundle bundle) {
            return b2.a(bundle);
        }
    };
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;

    /* renamed from: a */
    public final CharSequence f32276a;

    /* renamed from: b */
    public final CharSequence f32277b;

    /* renamed from: c */
    public final CharSequence f32278c;

    /* renamed from: d */
    public final CharSequence f32279d;

    /* renamed from: e */
    public final CharSequence f32280e;

    /* renamed from: f */
    public final CharSequence f32281f;

    /* renamed from: g */
    public final CharSequence f32282g;

    /* renamed from: h */
    public final Uri f32283h;

    /* renamed from: i */
    public final u2 f32284i;

    /* renamed from: j */
    public final u2 f32285j;

    /* renamed from: k */
    public final byte[] f32286k;

    /* renamed from: l */
    public final Integer f32287l;

    /* renamed from: m */
    public final Uri f32288m;

    /* renamed from: n */
    public final Integer f32289n;

    /* renamed from: o */
    public final Integer f32290o;

    /* renamed from: p */
    public final Integer f32291p;

    /* renamed from: q */
    public final Boolean f32292q;
    @Deprecated

    /* renamed from: r */
    public final Integer f32293r;

    /* renamed from: s */
    public final Integer f32294s;

    /* renamed from: t */
    public final Integer f32295t;

    /* renamed from: u */
    public final Integer f32296u;

    /* renamed from: v */
    public final Integer f32297v;

    /* renamed from: w */
    public final Integer f32298w;

    /* renamed from: x */
    public final Integer f32299x;

    /* renamed from: y */
    public final CharSequence f32300y;

    /* renamed from: z */
    public final CharSequence f32301z;

    /* compiled from: MediaMetadata.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private Integer A;
        private Integer B;
        private CharSequence C;
        private CharSequence D;
        private CharSequence E;
        private Bundle F;

        /* renamed from: a */
        private CharSequence f32302a;

        /* renamed from: b */
        private CharSequence f32303b;

        /* renamed from: c */
        private CharSequence f32304c;

        /* renamed from: d */
        private CharSequence f32305d;

        /* renamed from: e */
        private CharSequence f32306e;

        /* renamed from: f */
        private CharSequence f32307f;

        /* renamed from: g */
        private CharSequence f32308g;

        /* renamed from: h */
        private Uri f32309h;

        /* renamed from: i */
        private u2 f32310i;

        /* renamed from: j */
        private u2 f32311j;

        /* renamed from: k */
        private byte[] f32312k;

        /* renamed from: l */
        private Integer f32313l;

        /* renamed from: m */
        private Uri f32314m;

        /* renamed from: n */
        private Integer f32315n;

        /* renamed from: o */
        private Integer f32316o;

        /* renamed from: p */
        private Integer f32317p;

        /* renamed from: q */
        private Boolean f32318q;

        /* renamed from: r */
        private Integer f32319r;

        /* renamed from: s */
        private Integer f32320s;

        /* renamed from: t */
        private Integer f32321t;

        /* renamed from: u */
        private Integer f32322u;

        /* renamed from: v */
        private Integer f32323v;

        /* renamed from: w */
        private Integer f32324w;

        /* renamed from: x */
        private CharSequence f32325x;

        /* renamed from: y */
        private CharSequence f32326y;

        /* renamed from: z */
        private CharSequence f32327z;

        public b2 G() {
            return new b2(this);
        }

        public b H(byte[] bArr, int i10) {
            if (this.f32312k == null || ea.n0.c(Integer.valueOf(i10), 3) || !ea.n0.c(this.f32313l, 3)) {
                this.f32312k = (byte[]) bArr.clone();
                this.f32313l = Integer.valueOf(i10);
            }
            return this;
        }

        public b I(b2 b2Var) {
            if (b2Var == null) {
                return this;
            }
            CharSequence charSequence = b2Var.f32276a;
            if (charSequence != null) {
                k0(charSequence);
            }
            CharSequence charSequence2 = b2Var.f32277b;
            if (charSequence2 != null) {
                N(charSequence2);
            }
            CharSequence charSequence3 = b2Var.f32278c;
            if (charSequence3 != null) {
                M(charSequence3);
            }
            CharSequence charSequence4 = b2Var.f32279d;
            if (charSequence4 != null) {
                L(charSequence4);
            }
            CharSequence charSequence5 = b2Var.f32280e;
            if (charSequence5 != null) {
                V(charSequence5);
            }
            CharSequence charSequence6 = b2Var.f32281f;
            if (charSequence6 != null) {
                j0(charSequence6);
            }
            CharSequence charSequence7 = b2Var.f32282g;
            if (charSequence7 != null) {
                T(charSequence7);
            }
            Uri uri = b2Var.f32283h;
            if (uri != null) {
                a0(uri);
            }
            u2 u2Var = b2Var.f32284i;
            if (u2Var != null) {
                o0(u2Var);
            }
            u2 u2Var2 = b2Var.f32285j;
            if (u2Var2 != null) {
                b0(u2Var2);
            }
            byte[] bArr = b2Var.f32286k;
            if (bArr != null) {
                O(bArr, b2Var.f32287l);
            }
            Uri uri2 = b2Var.f32288m;
            if (uri2 != null) {
                P(uri2);
            }
            Integer num = b2Var.f32289n;
            if (num != null) {
                n0(num);
            }
            Integer num2 = b2Var.f32290o;
            if (num2 != null) {
                m0(num2);
            }
            Integer num3 = b2Var.f32291p;
            if (num3 != null) {
                X(num3);
            }
            Boolean bool = b2Var.f32292q;
            if (bool != null) {
                Z(bool);
            }
            Integer num4 = b2Var.f32293r;
            if (num4 != null) {
                e0(num4);
            }
            Integer num5 = b2Var.f32294s;
            if (num5 != null) {
                e0(num5);
            }
            Integer num6 = b2Var.f32295t;
            if (num6 != null) {
                d0(num6);
            }
            Integer num7 = b2Var.f32296u;
            if (num7 != null) {
                c0(num7);
            }
            Integer num8 = b2Var.f32297v;
            if (num8 != null) {
                h0(num8);
            }
            Integer num9 = b2Var.f32298w;
            if (num9 != null) {
                g0(num9);
            }
            Integer num10 = b2Var.f32299x;
            if (num10 != null) {
                f0(num10);
            }
            CharSequence charSequence8 = b2Var.f32300y;
            if (charSequence8 != null) {
                p0(charSequence8);
            }
            CharSequence charSequence9 = b2Var.f32301z;
            if (charSequence9 != null) {
                R(charSequence9);
            }
            CharSequence charSequence10 = b2Var.A;
            if (charSequence10 != null) {
                S(charSequence10);
            }
            Integer num11 = b2Var.B;
            if (num11 != null) {
                U(num11);
            }
            Integer num12 = b2Var.C;
            if (num12 != null) {
                l0(num12);
            }
            CharSequence charSequence11 = b2Var.D;
            if (charSequence11 != null) {
                Y(charSequence11);
            }
            CharSequence charSequence12 = b2Var.E;
            if (charSequence12 != null) {
                Q(charSequence12);
            }
            CharSequence charSequence13 = b2Var.F;
            if (charSequence13 != null) {
                i0(charSequence13);
            }
            Bundle bundle = b2Var.G;
            if (bundle != null) {
                W(bundle);
            }
            return this;
        }

        public b J(Metadata metadata) {
            for (int i10 = 0; i10 < metadata.g(); i10++) {
                metadata.f(i10).Z0(this);
            }
            return this;
        }

        public b K(List<Metadata> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                Metadata metadata = list.get(i10);
                for (int i11 = 0; i11 < metadata.g(); i11++) {
                    metadata.f(i11).Z0(this);
                }
            }
            return this;
        }

        public b L(CharSequence charSequence) {
            this.f32305d = charSequence;
            return this;
        }

        public b M(CharSequence charSequence) {
            this.f32304c = charSequence;
            return this;
        }

        public b N(CharSequence charSequence) {
            this.f32303b = charSequence;
            return this;
        }

        public b O(byte[] bArr, Integer num) {
            this.f32312k = bArr == null ? null : (byte[]) bArr.clone();
            this.f32313l = num;
            return this;
        }

        public b P(Uri uri) {
            this.f32314m = uri;
            return this;
        }

        public b Q(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b R(CharSequence charSequence) {
            this.f32326y = charSequence;
            return this;
        }

        public b S(CharSequence charSequence) {
            this.f32327z = charSequence;
            return this;
        }

        public b T(CharSequence charSequence) {
            this.f32308g = charSequence;
            return this;
        }

        public b U(Integer num) {
            this.A = num;
            return this;
        }

        public b V(CharSequence charSequence) {
            this.f32306e = charSequence;
            return this;
        }

        public b W(Bundle bundle) {
            this.F = bundle;
            return this;
        }

        public b X(Integer num) {
            this.f32317p = num;
            return this;
        }

        public b Y(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b Z(Boolean bool) {
            this.f32318q = bool;
            return this;
        }

        public b a0(Uri uri) {
            this.f32309h = uri;
            return this;
        }

        public b b0(u2 u2Var) {
            this.f32311j = u2Var;
            return this;
        }

        public b c0(Integer num) {
            this.f32321t = num;
            return this;
        }

        public b d0(Integer num) {
            this.f32320s = num;
            return this;
        }

        public b e0(Integer num) {
            this.f32319r = num;
            return this;
        }

        public b f0(Integer num) {
            this.f32324w = num;
            return this;
        }

        public b g0(Integer num) {
            this.f32323v = num;
            return this;
        }

        public b h0(Integer num) {
            this.f32322u = num;
            return this;
        }

        public b i0(CharSequence charSequence) {
            this.E = charSequence;
            return this;
        }

        public b j0(CharSequence charSequence) {
            this.f32307f = charSequence;
            return this;
        }

        public b k0(CharSequence charSequence) {
            this.f32302a = charSequence;
            return this;
        }

        public b l0(Integer num) {
            this.B = num;
            return this;
        }

        public b m0(Integer num) {
            this.f32316o = num;
            return this;
        }

        public b n0(Integer num) {
            this.f32315n = num;
            return this;
        }

        public b o0(u2 u2Var) {
            this.f32310i = u2Var;
            return this;
        }

        public b p0(CharSequence charSequence) {
            this.f32325x = charSequence;
            return this;
        }

        public b() {
        }

        private b(b2 b2Var) {
            this.f32302a = b2Var.f32276a;
            this.f32303b = b2Var.f32277b;
            this.f32304c = b2Var.f32278c;
            this.f32305d = b2Var.f32279d;
            this.f32306e = b2Var.f32280e;
            this.f32307f = b2Var.f32281f;
            this.f32308g = b2Var.f32282g;
            this.f32309h = b2Var.f32283h;
            this.f32310i = b2Var.f32284i;
            this.f32311j = b2Var.f32285j;
            this.f32312k = b2Var.f32286k;
            this.f32313l = b2Var.f32287l;
            this.f32314m = b2Var.f32288m;
            this.f32315n = b2Var.f32289n;
            this.f32316o = b2Var.f32290o;
            this.f32317p = b2Var.f32291p;
            this.f32318q = b2Var.f32292q;
            this.f32319r = b2Var.f32294s;
            this.f32320s = b2Var.f32295t;
            this.f32321t = b2Var.f32296u;
            this.f32322u = b2Var.f32297v;
            this.f32323v = b2Var.f32298w;
            this.f32324w = b2Var.f32299x;
            this.f32325x = b2Var.f32300y;
            this.f32326y = b2Var.f32301z;
            this.f32327z = b2Var.A;
            this.A = b2Var.B;
            this.B = b2Var.C;
            this.C = b2Var.D;
            this.D = b2Var.E;
            this.E = b2Var.F;
            this.F = b2Var.G;
        }
    }

    public static /* synthetic */ b2 a(Bundle bundle) {
        return c(bundle);
    }

    public static b2 c(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.k0(bundle.getCharSequence(d(0))).N(bundle.getCharSequence(d(1))).M(bundle.getCharSequence(d(2))).L(bundle.getCharSequence(d(3))).V(bundle.getCharSequence(d(4))).j0(bundle.getCharSequence(d(5))).T(bundle.getCharSequence(d(6))).a0((Uri) bundle.getParcelable(d(7))).O(bundle.getByteArray(d(10)), bundle.containsKey(d(29)) ? Integer.valueOf(bundle.getInt(d(29))) : null).P((Uri) bundle.getParcelable(d(11))).p0(bundle.getCharSequence(d(22))).R(bundle.getCharSequence(d(23))).S(bundle.getCharSequence(d(24))).Y(bundle.getCharSequence(d(27))).Q(bundle.getCharSequence(d(28))).i0(bundle.getCharSequence(d(30))).W(bundle.getBundle(d(1000)));
        if (bundle.containsKey(d(8)) && (bundle3 = bundle.getBundle(d(8))) != null) {
            bVar.o0(u2.f32809a.a(bundle3));
        }
        if (bundle.containsKey(d(9)) && (bundle2 = bundle.getBundle(d(9))) != null) {
            bVar.b0(u2.f32809a.a(bundle2));
        }
        if (bundle.containsKey(d(12))) {
            bVar.n0(Integer.valueOf(bundle.getInt(d(12))));
        }
        if (bundle.containsKey(d(13))) {
            bVar.m0(Integer.valueOf(bundle.getInt(d(13))));
        }
        if (bundle.containsKey(d(14))) {
            bVar.X(Integer.valueOf(bundle.getInt(d(14))));
        }
        if (bundle.containsKey(d(15))) {
            bVar.Z(Boolean.valueOf(bundle.getBoolean(d(15))));
        }
        if (bundle.containsKey(d(16))) {
            bVar.e0(Integer.valueOf(bundle.getInt(d(16))));
        }
        if (bundle.containsKey(d(17))) {
            bVar.d0(Integer.valueOf(bundle.getInt(d(17))));
        }
        if (bundle.containsKey(d(18))) {
            bVar.c0(Integer.valueOf(bundle.getInt(d(18))));
        }
        if (bundle.containsKey(d(19))) {
            bVar.h0(Integer.valueOf(bundle.getInt(d(19))));
        }
        if (bundle.containsKey(d(20))) {
            bVar.g0(Integer.valueOf(bundle.getInt(d(20))));
        }
        if (bundle.containsKey(d(21))) {
            bVar.f0(Integer.valueOf(bundle.getInt(d(21))));
        }
        if (bundle.containsKey(d(25))) {
            bVar.U(Integer.valueOf(bundle.getInt(d(25))));
        }
        if (bundle.containsKey(d(26))) {
            bVar.l0(Integer.valueOf(bundle.getInt(d(26))));
        }
        return bVar.G();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public b b() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b2.class != obj.getClass()) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return ea.n0.c(this.f32276a, b2Var.f32276a) && ea.n0.c(this.f32277b, b2Var.f32277b) && ea.n0.c(this.f32278c, b2Var.f32278c) && ea.n0.c(this.f32279d, b2Var.f32279d) && ea.n0.c(this.f32280e, b2Var.f32280e) && ea.n0.c(this.f32281f, b2Var.f32281f) && ea.n0.c(this.f32282g, b2Var.f32282g) && ea.n0.c(this.f32283h, b2Var.f32283h) && ea.n0.c(this.f32284i, b2Var.f32284i) && ea.n0.c(this.f32285j, b2Var.f32285j) && Arrays.equals(this.f32286k, b2Var.f32286k) && ea.n0.c(this.f32287l, b2Var.f32287l) && ea.n0.c(this.f32288m, b2Var.f32288m) && ea.n0.c(this.f32289n, b2Var.f32289n) && ea.n0.c(this.f32290o, b2Var.f32290o) && ea.n0.c(this.f32291p, b2Var.f32291p) && ea.n0.c(this.f32292q, b2Var.f32292q) && ea.n0.c(this.f32294s, b2Var.f32294s) && ea.n0.c(this.f32295t, b2Var.f32295t) && ea.n0.c(this.f32296u, b2Var.f32296u) && ea.n0.c(this.f32297v, b2Var.f32297v) && ea.n0.c(this.f32298w, b2Var.f32298w) && ea.n0.c(this.f32299x, b2Var.f32299x) && ea.n0.c(this.f32300y, b2Var.f32300y) && ea.n0.c(this.f32301z, b2Var.f32301z) && ea.n0.c(this.A, b2Var.A) && ea.n0.c(this.B, b2Var.B) && ea.n0.c(this.C, b2Var.C) && ea.n0.c(this.D, b2Var.D) && ea.n0.c(this.E, b2Var.E) && ea.n0.c(this.F, b2Var.F);
    }

    public int hashCode() {
        return ib.i.b(this.f32276a, this.f32277b, this.f32278c, this.f32279d, this.f32280e, this.f32281f, this.f32282g, this.f32283h, this.f32284i, this.f32285j, Integer.valueOf(Arrays.hashCode(this.f32286k)), this.f32287l, this.f32288m, this.f32289n, this.f32290o, this.f32291p, this.f32292q, this.f32294s, this.f32295t, this.f32296u, this.f32297v, this.f32298w, this.f32299x, this.f32300y, this.f32301z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    private b2(b bVar) {
        this.f32276a = bVar.f32302a;
        this.f32277b = bVar.f32303b;
        this.f32278c = bVar.f32304c;
        this.f32279d = bVar.f32305d;
        this.f32280e = bVar.f32306e;
        this.f32281f = bVar.f32307f;
        this.f32282g = bVar.f32308g;
        this.f32283h = bVar.f32309h;
        this.f32284i = bVar.f32310i;
        this.f32285j = bVar.f32311j;
        this.f32286k = bVar.f32312k;
        this.f32287l = bVar.f32313l;
        this.f32288m = bVar.f32314m;
        this.f32289n = bVar.f32315n;
        this.f32290o = bVar.f32316o;
        this.f32291p = bVar.f32317p;
        this.f32292q = bVar.f32318q;
        this.f32293r = bVar.f32319r;
        this.f32294s = bVar.f32319r;
        this.f32295t = bVar.f32320s;
        this.f32296u = bVar.f32321t;
        this.f32297v = bVar.f32322u;
        this.f32298w = bVar.f32323v;
        this.f32299x = bVar.f32324w;
        this.f32300y = bVar.f32325x;
        this.f32301z = bVar.f32326y;
        this.A = bVar.f32327z;
        this.B = bVar.A;
        this.C = bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
        this.G = bVar.F;
    }
}
