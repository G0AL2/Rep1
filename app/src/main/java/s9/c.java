package s9;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ea.a0;
import ea.r;
import ea.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import r9.b;
import r9.j;
import s9.c;

/* compiled from: Cea708Decoder.java */
/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: g */
    private final a0 f36855g = new a0();

    /* renamed from: h */
    private final z f36856h = new z();

    /* renamed from: i */
    private int f36857i = -1;

    /* renamed from: j */
    private final int f36858j;

    /* renamed from: k */
    private final b[] f36859k;

    /* renamed from: l */
    private b f36860l;

    /* renamed from: m */
    private List<r9.b> f36861m;

    /* renamed from: n */
    private List<r9.b> f36862n;

    /* renamed from: o */
    private C0499c f36863o;

    /* renamed from: p */
    private int f36864p;

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: c */
        private static final Comparator<a> f36865c = new Comparator() { // from class: s9.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.a.a((c.a) obj, (c.a) obj2);
            }
        };

        /* renamed from: a */
        public final r9.b f36866a;

        /* renamed from: b */
        public final int f36867b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            b.C0490b n10 = new b.C0490b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f36866a = n10.a();
            this.f36867b = i14;
        }

        public static /* synthetic */ int a(a aVar, a aVar2) {
            return c(aVar, aVar2);
        }

        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f36867b, aVar.f36867b);
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* renamed from: w */
        public static final int f36868w = h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f36869x;

        /* renamed from: y */
        public static final int f36870y;

        /* renamed from: z */
        private static final int[] f36871z;

        /* renamed from: a */
        private final List<SpannableString> f36872a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f36873b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f36874c;

        /* renamed from: d */
        private boolean f36875d;

        /* renamed from: e */
        private int f36876e;

        /* renamed from: f */
        private boolean f36877f;

        /* renamed from: g */
        private int f36878g;

        /* renamed from: h */
        private int f36879h;

        /* renamed from: i */
        private int f36880i;

        /* renamed from: j */
        private int f36881j;

        /* renamed from: k */
        private boolean f36882k;

        /* renamed from: l */
        private int f36883l;

        /* renamed from: m */
        private int f36884m;

        /* renamed from: n */
        private int f36885n;

        /* renamed from: o */
        private int f36886o;

        /* renamed from: p */
        private int f36887p;

        /* renamed from: q */
        private int f36888q;

        /* renamed from: r */
        private int f36889r;

        /* renamed from: s */
        private int f36890s;

        /* renamed from: t */
        private int f36891t;

        /* renamed from: u */
        private int f36892u;

        /* renamed from: v */
        private int f36893v;

        static {
            int h10 = h(0, 0, 0, 0);
            f36869x = h10;
            int h11 = h(0, 0, 0, 3);
            f36870y = h11;
            f36871z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{h10, h11, h10, h10, h11, h10, h10};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                ea.a.c(r4, r0, r1)
                ea.a.c(r5, r0, r1)
                ea.a.c(r6, r0, r1)
                ea.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = 0
                goto L23
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L23
            L21:
                r7 = 255(0xff, float:3.57E-43)
            L23:
                if (r4 <= r1) goto L28
                r4 = 255(0xff, float:3.57E-43)
                goto L29
            L28:
                r4 = 0
            L29:
                if (r5 <= r1) goto L2e
                r5 = 255(0xff, float:3.57E-43)
                goto L2f
            L2e:
                r5 = 0
            L2f:
                if (r6 <= r1) goto L33
                r0 = 255(0xff, float:3.57E-43)
            L33:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: s9.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 == '\n') {
                this.f36872a.add(d());
                this.f36873b.clear();
                if (this.f36887p != -1) {
                    this.f36887p = 0;
                }
                if (this.f36888q != -1) {
                    this.f36888q = 0;
                }
                if (this.f36889r != -1) {
                    this.f36889r = 0;
                }
                if (this.f36891t != -1) {
                    this.f36891t = 0;
                }
                while (true) {
                    if ((!this.f36882k || this.f36872a.size() < this.f36881j) && this.f36872a.size() < 15) {
                        return;
                    }
                    this.f36872a.remove(0);
                }
            } else {
                this.f36873b.append(c10);
            }
        }

        public void b() {
            int length = this.f36873b.length();
            if (length > 0) {
                this.f36873b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:68:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00ae  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public s9.c.a c() {
            /*
                Method dump skipped, instructions count: 199
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s9.c.b.c():s9.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f36873b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f36887p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f36887p, length, 33);
                }
                if (this.f36888q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f36888q, length, 33);
                }
                if (this.f36889r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f36890s), this.f36889r, length, 33);
                }
                if (this.f36891t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f36892u), this.f36891t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f36872a.clear();
            this.f36873b.clear();
            this.f36887p = -1;
            this.f36888q = -1;
            this.f36889r = -1;
            this.f36891t = -1;
            this.f36893v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f36874c = true;
            this.f36875d = z10;
            this.f36882k = z11;
            this.f36876e = i10;
            this.f36877f = z13;
            this.f36878g = i11;
            this.f36879h = i12;
            this.f36880i = i15;
            int i18 = i13 + 1;
            if (this.f36881j != i18) {
                this.f36881j = i18;
                while (true) {
                    if ((!z11 || this.f36872a.size() < this.f36881j) && this.f36872a.size() < 15) {
                        break;
                    }
                    this.f36872a.remove(0);
                }
            }
            if (i16 != 0 && this.f36884m != i16) {
                this.f36884m = i16;
                int i19 = i16 - 1;
                q(D[i19], f36870y, C[i19], 0, A[i19], B[i19], f36871z[i19]);
            }
            if (i17 == 0 || this.f36885n == i17) {
                return;
            }
            this.f36885n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, F[i20], E[i20]);
            n(f36868w, G[i20], f36869x);
        }

        public boolean i() {
            return this.f36874c;
        }

        public boolean j() {
            return !i() || (this.f36872a.isEmpty() && this.f36873b.length() == 0);
        }

        public boolean k() {
            return this.f36875d;
        }

        public void l() {
            e();
            this.f36874c = false;
            this.f36875d = false;
            this.f36876e = 4;
            this.f36877f = false;
            this.f36878g = 0;
            this.f36879h = 0;
            this.f36880i = 0;
            this.f36881j = 15;
            this.f36882k = true;
            this.f36883l = 0;
            this.f36884m = 0;
            this.f36885n = 0;
            int i10 = f36869x;
            this.f36886o = i10;
            this.f36890s = f36868w;
            this.f36892u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f36887p != -1) {
                if (!z10) {
                    this.f36873b.setSpan(new StyleSpan(2), this.f36887p, this.f36873b.length(), 33);
                    this.f36887p = -1;
                }
            } else if (z10) {
                this.f36887p = this.f36873b.length();
            }
            if (this.f36888q == -1) {
                if (z11) {
                    this.f36888q = this.f36873b.length();
                }
            } else if (z11) {
            } else {
                this.f36873b.setSpan(new UnderlineSpan(), this.f36888q, this.f36873b.length(), 33);
                this.f36888q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f36889r != -1 && this.f36890s != i10) {
                this.f36873b.setSpan(new ForegroundColorSpan(this.f36890s), this.f36889r, this.f36873b.length(), 33);
            }
            if (i10 != f36868w) {
                this.f36889r = this.f36873b.length();
                this.f36890s = i10;
            }
            if (this.f36891t != -1 && this.f36892u != i11) {
                this.f36873b.setSpan(new BackgroundColorSpan(this.f36892u), this.f36891t, this.f36873b.length(), 33);
            }
            if (i11 != f36869x) {
                this.f36891t = this.f36873b.length();
                this.f36892u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f36893v != i10) {
                a('\n');
            }
            this.f36893v = i10;
        }

        public void p(boolean z10) {
            this.f36875d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f36886o = i10;
            this.f36883l = i15;
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* renamed from: s9.c$c */
    /* loaded from: classes2.dex */
    public static final class C0499c {

        /* renamed from: a */
        public final int f36894a;

        /* renamed from: b */
        public final int f36895b;

        /* renamed from: c */
        public final byte[] f36896c;

        /* renamed from: d */
        int f36897d = 0;

        public C0499c(int i10, int i11) {
            this.f36894a = i10;
            this.f36895b = i11;
            this.f36896c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        this.f36858j = i10 == -1 ? 1 : i10;
        if (list != null) {
            ea.d.h(list);
        }
        this.f36859k = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f36859k[i11] = new b();
        }
        this.f36860l = this.f36859k[0];
    }

    private void A() {
        int h10 = b.h(this.f36856h.h(2), this.f36856h.h(2), this.f36856h.h(2), this.f36856h.h(2));
        int h11 = b.h(this.f36856h.h(2), this.f36856h.h(2), this.f36856h.h(2), this.f36856h.h(2));
        this.f36856h.r(2);
        this.f36860l.n(h10, h11, b.g(this.f36856h.h(2), this.f36856h.h(2), this.f36856h.h(2)));
    }

    private void B() {
        this.f36856h.r(4);
        int h10 = this.f36856h.h(4);
        this.f36856h.r(2);
        this.f36860l.o(h10, this.f36856h.h(6));
    }

    private void C() {
        int h10 = b.h(this.f36856h.h(2), this.f36856h.h(2), this.f36856h.h(2), this.f36856h.h(2));
        int h11 = this.f36856h.h(2);
        int g10 = b.g(this.f36856h.h(2), this.f36856h.h(2), this.f36856h.h(2));
        if (this.f36856h.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f36856h.g();
        int h12 = this.f36856h.h(2);
        int h13 = this.f36856h.h(2);
        int h14 = this.f36856h.h(2);
        this.f36856h.r(8);
        this.f36860l.q(h10, g10, g11, h11, h12, h13, h14);
    }

    private void D() {
        C0499c c0499c = this.f36863o;
        int i10 = c0499c.f36897d;
        int i11 = c0499c.f36895b;
        if (i10 != (i11 * 2) - 1) {
            int i12 = c0499c.f36894a;
            StringBuilder sb2 = new StringBuilder(115);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((i11 * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(i10);
            sb2.append(" (sequence number ");
            sb2.append(i12);
            sb2.append(");");
            r.b("Cea708Decoder", sb2.toString());
        }
        z zVar = this.f36856h;
        C0499c c0499c2 = this.f36863o;
        zVar.o(c0499c2.f36896c, c0499c2.f36897d);
        int h10 = this.f36856h.h(3);
        int h11 = this.f36856h.h(5);
        if (h10 == 7) {
            this.f36856h.r(2);
            h10 = this.f36856h.h(6);
            if (h10 < 7) {
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Invalid extended service number: ");
                sb3.append(h10);
                r.h("Cea708Decoder", sb3.toString());
            }
        }
        if (h11 == 0) {
            if (h10 != 0) {
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("serviceNumber is non-zero (");
                sb4.append(h10);
                sb4.append(") when blockSize is 0");
                r.h("Cea708Decoder", sb4.toString());
            }
        } else if (h10 != this.f36858j) {
        } else {
            boolean z10 = false;
            int e10 = this.f36856h.e() + (h11 * 8);
            while (this.f36856h.b() > 0 && this.f36856h.e() < e10) {
                int h12 = this.f36856h.h(8);
                if (h12 == 16) {
                    int h13 = this.f36856h.h(8);
                    if (h13 <= 31) {
                        s(h13);
                    } else {
                        if (h13 <= 127) {
                            x(h13);
                        } else if (h13 <= 159) {
                            t(h13);
                        } else if (h13 <= 255) {
                            y(h13);
                        } else {
                            StringBuilder sb5 = new StringBuilder(37);
                            sb5.append("Invalid extended command: ");
                            sb5.append(h13);
                            r.h("Cea708Decoder", sb5.toString());
                        }
                        z10 = true;
                    }
                } else if (h12 <= 31) {
                    q(h12);
                } else {
                    if (h12 <= 127) {
                        v(h12);
                    } else if (h12 <= 159) {
                        r(h12);
                    } else if (h12 <= 255) {
                        w(h12);
                    } else {
                        StringBuilder sb6 = new StringBuilder(33);
                        sb6.append("Invalid base command: ");
                        sb6.append(h12);
                        r.h("Cea708Decoder", sb6.toString());
                    }
                    z10 = true;
                }
            }
            if (z10) {
                this.f36861m = p();
            }
        }
    }

    private void E() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f36859k[i10].l();
        }
    }

    private void o() {
        if (this.f36863o == null) {
            return;
        }
        D();
        this.f36863o = null;
    }

    private List<r9.b> p() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f36859k[i10].j() && this.f36859k[i10].k() && (c10 = this.f36859k[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f36865c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f36866a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void q(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f36861m = p();
            } else if (i10 != 8) {
                switch (i10) {
                    case 12:
                        E();
                        return;
                    case 13:
                        this.f36860l.a('\n');
                        return;
                    case 14:
                        return;
                    default:
                        if (i10 >= 17 && i10 <= 23) {
                            StringBuilder sb2 = new StringBuilder(55);
                            sb2.append("Currently unsupported COMMAND_EXT1 Command: ");
                            sb2.append(i10);
                            r.h("Cea708Decoder", sb2.toString());
                            this.f36856h.r(8);
                            return;
                        } else if (i10 >= 24 && i10 <= 31) {
                            StringBuilder sb3 = new StringBuilder(54);
                            sb3.append("Currently unsupported COMMAND_P16 Command: ");
                            sb3.append(i10);
                            r.h("Cea708Decoder", sb3.toString());
                            this.f36856h.r(16);
                            return;
                        } else {
                            StringBuilder sb4 = new StringBuilder(31);
                            sb4.append("Invalid C0 command: ");
                            sb4.append(i10);
                            r.h("Cea708Decoder", sb4.toString());
                            return;
                        }
                }
            } else {
                this.f36860l.b();
            }
        }
    }

    private void r(int i10) {
        b bVar;
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f36864p != i12) {
                    this.f36864p = i12;
                    this.f36860l = this.f36859k[i12];
                    return;
                }
                return;
            case 136:
                while (i11 <= 8) {
                    if (this.f36856h.g()) {
                        this.f36859k[8 - i11].e();
                    }
                    i11++;
                }
                return;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f36856h.g()) {
                        this.f36859k[8 - i13].p(true);
                    }
                }
                return;
            case 138:
                while (i11 <= 8) {
                    if (this.f36856h.g()) {
                        this.f36859k[8 - i11].p(false);
                    }
                    i11++;
                }
                return;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f36856h.g()) {
                        this.f36859k[8 - i14].p(!bVar.k());
                    }
                }
                return;
            case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
                while (i11 <= 8) {
                    if (this.f36856h.g()) {
                        this.f36859k[8 - i11].l();
                    }
                    i11++;
                }
                return;
            case 141:
                this.f36856h.r(8);
                return;
            case 142:
                return;
            case 143:
                E();
                return;
            case 144:
                if (!this.f36860l.i()) {
                    this.f36856h.r(16);
                    return;
                } else {
                    z();
                    return;
                }
            case 145:
                if (!this.f36860l.i()) {
                    this.f36856h.r(24);
                    return;
                } else {
                    A();
                    return;
                }
            case 146:
                if (!this.f36860l.i()) {
                    this.f36856h.r(16);
                    return;
                } else {
                    B();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED /* 150 */:
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid C1 command: ");
                sb2.append(i10);
                r.h("Cea708Decoder", sb2.toString());
                return;
            case 151:
                if (!this.f36860l.i()) {
                    this.f36856h.r(32);
                    return;
                } else {
                    C();
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                u(i15);
                if (this.f36864p != i15) {
                    this.f36864p = i15;
                    this.f36860l = this.f36859k[i15];
                    return;
                }
                return;
        }
    }

    private void s(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f36856h.r(8);
        } else if (i10 <= 23) {
            this.f36856h.r(16);
        } else if (i10 <= 31) {
            this.f36856h.r(24);
        }
    }

    private void t(int i10) {
        if (i10 <= 135) {
            this.f36856h.r(32);
        } else if (i10 <= 143) {
            this.f36856h.r(40);
        } else if (i10 <= 159) {
            this.f36856h.r(2);
            this.f36856h.r(this.f36856h.h(6) * 8);
        }
    }

    private void u(int i10) {
        b bVar = this.f36859k[i10];
        this.f36856h.r(2);
        boolean g10 = this.f36856h.g();
        boolean g11 = this.f36856h.g();
        boolean g12 = this.f36856h.g();
        int h10 = this.f36856h.h(3);
        boolean g13 = this.f36856h.g();
        int h11 = this.f36856h.h(7);
        int h12 = this.f36856h.h(8);
        int h13 = this.f36856h.h(4);
        int h14 = this.f36856h.h(4);
        this.f36856h.r(2);
        int h15 = this.f36856h.h(6);
        this.f36856h.r(2);
        bVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f36856h.h(3), this.f36856h.h(3));
    }

    private void v(int i10) {
        if (i10 == 127) {
            this.f36860l.a((char) 9835);
        } else {
            this.f36860l.a((char) (i10 & 255));
        }
    }

    private void w(int i10) {
        this.f36860l.a((char) (i10 & 255));
    }

    private void x(int i10) {
        if (i10 == 32) {
            this.f36860l.a(' ');
        } else if (i10 == 33) {
            this.f36860l.a((char) 160);
        } else if (i10 == 37) {
            this.f36860l.a((char) 8230);
        } else if (i10 == 42) {
            this.f36860l.a((char) 352);
        } else if (i10 == 44) {
            this.f36860l.a((char) 338);
        } else if (i10 == 63) {
            this.f36860l.a((char) 376);
        } else if (i10 == 57) {
            this.f36860l.a((char) 8482);
        } else if (i10 == 58) {
            this.f36860l.a((char) 353);
        } else if (i10 == 60) {
            this.f36860l.a((char) 339);
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    this.f36860l.a((char) 9608);
                    return;
                case 49:
                    this.f36860l.a((char) 8216);
                    return;
                case 50:
                    this.f36860l.a((char) 8217);
                    return;
                case 51:
                    this.f36860l.a((char) 8220);
                    return;
                case 52:
                    this.f36860l.a((char) 8221);
                    return;
                case 53:
                    this.f36860l.a((char) 8226);
                    return;
                default:
                    switch (i10) {
                        case 118:
                            this.f36860l.a((char) 8539);
                            return;
                        case 119:
                            this.f36860l.a((char) 8540);
                            return;
                        case 120:
                            this.f36860l.a((char) 8541);
                            return;
                        case 121:
                            this.f36860l.a((char) 8542);
                            return;
                        case 122:
                            this.f36860l.a((char) 9474);
                            return;
                        case 123:
                            this.f36860l.a((char) 9488);
                            return;
                        case 124:
                            this.f36860l.a((char) 9492);
                            return;
                        case 125:
                            this.f36860l.a((char) 9472);
                            return;
                        case 126:
                            this.f36860l.a((char) 9496);
                            return;
                        case 127:
                            this.f36860l.a((char) 9484);
                            return;
                        default:
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Invalid G2 character: ");
                            sb2.append(i10);
                            r.h("Cea708Decoder", sb2.toString());
                            return;
                    }
            }
        } else {
            this.f36860l.a((char) 8480);
        }
    }

    private void y(int i10) {
        if (i10 == 160) {
            this.f36860l.a((char) 13252);
            return;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("Invalid G3 character: ");
        sb2.append(i10);
        r.h("Cea708Decoder", sb2.toString());
        this.f36860l.a('_');
    }

    private void z() {
        this.f36860l.m(this.f36856h.h(4), this.f36856h.h(2), this.f36856h.h(2), this.f36856h.g(), this.f36856h.g(), this.f36856h.h(3), this.f36856h.h(3));
    }

    @Override // s9.e
    protected r9.f e() {
        List<r9.b> list = this.f36861m;
        this.f36862n = list;
        return new f((List) ea.a.e(list));
    }

    @Override // s9.e
    protected void f(j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) ea.a.e(jVar.f34290c);
        this.f36855g.N(byteBuffer.array(), byteBuffer.limit());
        while (this.f36855g.a() >= 3) {
            int D = this.f36855g.D() & 7;
            int i10 = D & 3;
            boolean z10 = (D & 4) == 4;
            byte D2 = (byte) this.f36855g.D();
            byte D3 = (byte) this.f36855g.D();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        o();
                        int i11 = (D2 & 192) >> 6;
                        int i12 = this.f36857i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            E();
                            int i13 = this.f36857i;
                            StringBuilder sb2 = new StringBuilder(71);
                            sb2.append("Sequence number discontinuity. previous=");
                            sb2.append(i13);
                            sb2.append(" current=");
                            sb2.append(i11);
                            r.h("Cea708Decoder", sb2.toString());
                        }
                        this.f36857i = i11;
                        int i14 = D2 & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        C0499c c0499c = new C0499c(i11, i14);
                        this.f36863o = c0499c;
                        byte[] bArr = c0499c.f36896c;
                        int i15 = c0499c.f36897d;
                        c0499c.f36897d = i15 + 1;
                        bArr[i15] = D3;
                    } else {
                        ea.a.a(i10 == 2);
                        C0499c c0499c2 = this.f36863o;
                        if (c0499c2 == null) {
                            r.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0499c2.f36896c;
                            int i16 = c0499c2.f36897d;
                            int i17 = i16 + 1;
                            c0499c2.f36897d = i17;
                            bArr2[i16] = D2;
                            c0499c2.f36897d = i17 + 1;
                            bArr2[i17] = D3;
                        }
                    }
                    C0499c c0499c3 = this.f36863o;
                    if (c0499c3.f36897d == (c0499c3.f36895b * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // s9.e, m8.d
    public void flush() {
        super.flush();
        this.f36861m = null;
        this.f36862n = null;
        this.f36864p = 0;
        this.f36860l = this.f36859k[0];
        E();
        this.f36863o = null;
    }

    @Override // s9.e
    protected boolean k() {
        return this.f36861m != this.f36862n;
    }
}
