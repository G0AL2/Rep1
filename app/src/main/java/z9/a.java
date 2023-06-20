package z9;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.inmobi.media.fq;
import ea.a0;
import ea.n0;
import ea.r;
import ib.d;
import java.util.List;
import r9.b;
import r9.e;
import r9.f;
import r9.h;

/* compiled from: Tx3gDecoder.java */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: n  reason: collision with root package name */
    private final a0 f40474n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f40475o;

    /* renamed from: p  reason: collision with root package name */
    private final int f40476p;

    /* renamed from: q  reason: collision with root package name */
    private final int f40477q;

    /* renamed from: r  reason: collision with root package name */
    private final String f40478r;

    /* renamed from: s  reason: collision with root package name */
    private final float f40479s;

    /* renamed from: t  reason: collision with root package name */
    private final int f40480t;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f40474n = new a0();
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f40476p = bArr[24];
            this.f40477q = ((bArr[26] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
            this.f40478r = "Serif".equals(n0.E(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.f40480t = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f40475o = z10;
            if (z10) {
                this.f40479s = n0.p(((bArr[11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f40479s = 0.85f;
                return;
            }
        }
        this.f40476p = 0;
        this.f40477q = -1;
        this.f40478r = "sans-serif";
        this.f40475o = false;
        this.f40479s = 0.85f;
        this.f40480t = -1;
    }

    private void B(a0 a0Var, SpannableStringBuilder spannableStringBuilder) throws h {
        int i10;
        C(a0Var.a() >= 12);
        int J = a0Var.J();
        int J2 = a0Var.J();
        a0Var.Q(2);
        int D = a0Var.D();
        a0Var.Q(1);
        int n10 = a0Var.n();
        if (J2 > spannableStringBuilder.length()) {
            int length = spannableStringBuilder.length();
            StringBuilder sb2 = new StringBuilder(68);
            sb2.append("Truncating styl end (");
            sb2.append(J2);
            sb2.append(") to cueText.length() (");
            sb2.append(length);
            sb2.append(").");
            r.h("Tx3gDecoder", sb2.toString());
            i10 = spannableStringBuilder.length();
        } else {
            i10 = J2;
        }
        if (J >= i10) {
            StringBuilder sb3 = new StringBuilder(60);
            sb3.append("Ignoring styl with start (");
            sb3.append(J);
            sb3.append(") >= end (");
            sb3.append(i10);
            sb3.append(").");
            r.h("Tx3gDecoder", sb3.toString());
            return;
        }
        int i11 = i10;
        E(spannableStringBuilder, D, this.f40476p, J, i11, 0);
        D(spannableStringBuilder, n10, this.f40477q, J, i11, 0);
    }

    private static void C(boolean z10) throws h {
        if (!z10) {
            throw new h("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void F(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String G(a0 a0Var) throws h {
        char g10;
        C(a0Var.a() >= 2);
        int J = a0Var.J();
        if (J == 0) {
            return "";
        }
        if (a0Var.a() >= 2 && ((g10 = a0Var.g()) == 65279 || g10 == 65534)) {
            return a0Var.B(J, d.f31907e);
        }
        return a0Var.B(J, d.f31905c);
    }

    @Override // r9.e
    protected f z(byte[] bArr, int i10, boolean z10) throws h {
        this.f40474n.N(bArr, i10);
        String G = G(this.f40474n);
        if (G.isEmpty()) {
            return b.f40481b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G);
        E(spannableStringBuilder, this.f40476p, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder, this.f40477q, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f40478r, 0, spannableStringBuilder.length());
        float f10 = this.f40479s;
        while (this.f40474n.a() >= 8) {
            int e10 = this.f40474n.e();
            int n10 = this.f40474n.n();
            int n11 = this.f40474n.n();
            if (n11 == 1937013100) {
                C(this.f40474n.a() >= 2);
                int J = this.f40474n.J();
                for (int i11 = 0; i11 < J; i11++) {
                    B(this.f40474n, spannableStringBuilder);
                }
            } else if (n11 == 1952608120 && this.f40475o) {
                C(this.f40474n.a() >= 2);
                f10 = n0.p(this.f40474n.J() / this.f40480t, 0.0f, 0.95f);
            }
            this.f40474n.P(e10 + n10);
        }
        return new b(new b.C0490b().o(spannableStringBuilder).h(f10, 0).i(0).a());
    }
}
