package s9;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import ea.a0;
import ea.n0;
import ea.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r9.b;
import r9.h;
import r9.k;

/* compiled from: Cea608Decoder.java */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: h  reason: collision with root package name */
    private final int f36826h;

    /* renamed from: i  reason: collision with root package name */
    private final int f36827i;

    /* renamed from: j  reason: collision with root package name */
    private final int f36828j;

    /* renamed from: k  reason: collision with root package name */
    private final long f36829k;

    /* renamed from: n  reason: collision with root package name */
    private List<r9.b> f36832n;

    /* renamed from: o  reason: collision with root package name */
    private List<r9.b> f36833o;

    /* renamed from: p  reason: collision with root package name */
    private int f36834p;

    /* renamed from: q  reason: collision with root package name */
    private int f36835q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f36836r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f36837s;

    /* renamed from: t  reason: collision with root package name */
    private byte f36838t;

    /* renamed from: u  reason: collision with root package name */
    private byte f36839u;

    /* renamed from: w  reason: collision with root package name */
    private boolean f36841w;

    /* renamed from: x  reason: collision with root package name */
    private long f36842x;

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f36823y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f36824z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {DownloadResource.STATUS_PAUSED_BY_APP, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, DownloadResource.STATUS_RUNNING, DownloadResource.STATUS_WAITING_TO_RETRY, DownloadResource.STATUS_DEVICE_NOT_FOUND_ERROR, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {DownloadResource.STATUS_WAITING_FOR_NETWORK, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, DownloadResource.STATUS_QUEUED_FOR_WIFI, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    private final a0 f36825g = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<C0497a> f36830l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private C0497a f36831m = new C0497a(0, 4);

    /* renamed from: v  reason: collision with root package name */
    private int f36840v = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cea608Decoder.java */
    /* renamed from: s9.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0497a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0498a> f36843a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<SpannableString> f36844b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f36845c = new StringBuilder();

        /* renamed from: d  reason: collision with root package name */
        private int f36846d;

        /* renamed from: e  reason: collision with root package name */
        private int f36847e;

        /* renamed from: f  reason: collision with root package name */
        private int f36848f;

        /* renamed from: g  reason: collision with root package name */
        private int f36849g;

        /* renamed from: h  reason: collision with root package name */
        private int f36850h;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: Cea608Decoder.java */
        /* renamed from: s9.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0498a {

            /* renamed from: a  reason: collision with root package name */
            public final int f36851a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f36852b;

            /* renamed from: c  reason: collision with root package name */
            public int f36853c;

            public C0498a(int i10, boolean z10, int i11) {
                this.f36851a = i10;
                this.f36852b = z10;
                this.f36853c = i11;
            }
        }

        public C0497a(int i10, int i11) {
            j(i10);
            this.f36850h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f36845c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = -1;
            int i15 = -1;
            boolean z10 = false;
            while (i10 < this.f36843a.size()) {
                C0498a c0498a = this.f36843a.get(i10);
                boolean z11 = c0498a.f36852b;
                int i16 = c0498a.f36851a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0498a.f36853c;
                i10++;
                if (i17 != (i10 < this.f36843a.size() ? this.f36843a.get(i10).f36853c : length)) {
                    if (i11 != -1 && !z11) {
                        q(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z11) {
                        i11 = i17;
                    }
                    if (i12 != -1 && !z10) {
                        o(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z10) {
                        i12 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i13, i17, i14);
                        i14 = i15;
                        i13 = i17;
                    }
                }
            }
            if (i11 != -1 && i11 != length) {
                q(spannableStringBuilder, i11, length);
            }
            if (i12 != -1 && i12 != length) {
                o(spannableStringBuilder, i12, length);
            }
            if (i13 != length) {
                n(spannableStringBuilder, i13, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f36845c.length() < 32) {
                this.f36845c.append(c10);
            }
        }

        public void f() {
            int length = this.f36845c.length();
            if (length > 0) {
                this.f36845c.delete(length - 1, length);
                for (int size = this.f36843a.size() - 1; size >= 0; size--) {
                    C0498a c0498a = this.f36843a.get(size);
                    int i10 = c0498a.f36853c;
                    if (i10 != length) {
                        return;
                    }
                    c0498a.f36853c = i10 - 1;
                }
            }
        }

        public r9.b g(int i10) {
            float f10;
            int i11 = this.f36847e + this.f36848f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f36844b.size(); i13++) {
                spannableStringBuilder.append(n0.Y0(this.f36844b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(n0.Y0(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f36849g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
                    i10 = (this.f36849g != 2 || i14 <= 0) ? 0 : 2;
                } else {
                    i10 = 1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f36846d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f36849g == 1) {
                i15 -= this.f36850h - 1;
            }
            return new b.C0490b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i15, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f36843a.isEmpty() && this.f36844b.isEmpty() && this.f36845c.length() == 0;
        }

        public void j(int i10) {
            this.f36849g = i10;
            this.f36843a.clear();
            this.f36844b.clear();
            this.f36845c.setLength(0);
            this.f36846d = 15;
            this.f36847e = 0;
            this.f36848f = 0;
        }

        public void k() {
            this.f36844b.add(h());
            this.f36845c.setLength(0);
            this.f36843a.clear();
            int min = Math.min(this.f36850h, this.f36846d);
            while (this.f36844b.size() >= min) {
                this.f36844b.remove(0);
            }
        }

        public void l(int i10) {
            this.f36849g = i10;
        }

        public void m(int i10) {
            this.f36850h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f36843a.add(new C0498a(i10, z10, this.f36845c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        this.f36829k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f36826h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f36828j = 0;
            this.f36827i = 0;
        } else if (i10 == 2) {
            this.f36828j = 1;
            this.f36827i = 0;
        } else if (i10 == 3) {
            this.f36828j = 0;
            this.f36827i = 1;
        } else if (i10 != 4) {
            r.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f36828j = 0;
            this.f36827i = 0;
        } else {
            this.f36828j = 1;
            this.f36827i = 1;
        }
        M(0);
        L();
        this.f36841w = true;
        this.f36842x = -9223372036854775807L;
    }

    private static boolean A(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean B(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean E(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean F(boolean z10, byte b10, byte b11) {
        if (z10 && E(b10)) {
            if (this.f36837s && this.f36838t == b10 && this.f36839u == b11) {
                this.f36837s = false;
                return true;
            }
            this.f36837s = true;
            this.f36838t = b10;
            this.f36839u = b11;
        } else {
            this.f36837s = false;
        }
        return false;
    }

    private static boolean G(byte b10) {
        return (b10 & 247) == 20;
    }

    private static boolean H(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean I(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean J(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void K(byte b10, byte b11) {
        if (J(b10)) {
            this.f36841w = false;
        } else if (G(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f36841w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f36841w = true;
        }
    }

    private void L() {
        this.f36831m.j(this.f36834p);
        this.f36830l.clear();
        this.f36830l.add(this.f36831m);
    }

    private void M(int i10) {
        int i11 = this.f36834p;
        if (i11 == i10) {
            return;
        }
        this.f36834p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f36830l.size(); i12++) {
                this.f36830l.get(i12).l(i10);
            }
            return;
        }
        L();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f36832n = Collections.emptyList();
        }
    }

    private void N(int i10) {
        this.f36835q = i10;
        this.f36831m.m(i10);
    }

    private boolean O() {
        return (this.f36829k == -9223372036854775807L || this.f36842x == -9223372036854775807L || j() - this.f36842x < this.f36829k) ? false : true;
    }

    private boolean P(byte b10) {
        if (z(b10)) {
            this.f36840v = q(b10);
        }
        return this.f36840v == this.f36828j;
    }

    private static char p(byte b10) {
        return (char) B[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int q(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<r9.b> r() {
        int size = this.f36830l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            r9.b g10 = this.f36830l.get(i11).g(RecyclerView.UNDEFINED_DURATION);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f36491i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            r9.b bVar = (r9.b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.f36491i != i10) {
                    bVar = (r9.b) ea.a.e(this.f36830l.get(i12).g(i10));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char s(byte b10) {
        return (char) D[b10 & 31];
    }

    private static char t(byte b10) {
        return (char) E[b10 & 31];
    }

    private static char u(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return s(b11);
        }
        return t(b11);
    }

    private static char v(byte b10) {
        return (char) C[b10 & 15];
    }

    private void w(byte b10) {
        this.f36831m.e(' ');
        this.f36831m.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void x(byte b10) {
        if (b10 == 32) {
            M(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    M(1);
                    N(2);
                    return;
                case 38:
                    M(1);
                    N(3);
                    return;
                case 39:
                    M(1);
                    N(4);
                    return;
                default:
                    int i10 = this.f36834p;
                    if (i10 == 0) {
                        return;
                    }
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f36832n = Collections.emptyList();
                                int i11 = this.f36834p;
                                if (i11 == 1 || i11 == 3) {
                                    L();
                                    return;
                                }
                                return;
                            case 45:
                                if (i10 != 1 || this.f36831m.i()) {
                                    return;
                                }
                                this.f36831m.k();
                                return;
                            case 46:
                                L();
                                return;
                            case 47:
                                this.f36832n = r();
                                L();
                                return;
                            default:
                                return;
                        }
                    }
                    this.f36831m.f();
                    return;
            }
        } else {
            M(3);
        }
    }

    private void y(byte b10, byte b11) {
        int i10 = f36823y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f36831m.f36846d) {
            if (this.f36834p != 1 && !this.f36831m.i()) {
                C0497a c0497a = new C0497a(this.f36834p, this.f36835q);
                this.f36831m = c0497a;
                this.f36830l.add(c0497a);
            }
            this.f36831m.f36846d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f36831m.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f36831m.f36847e = f36824z[i11];
        }
    }

    private static boolean z(byte b10) {
        return (b10 & 224) == 0;
    }

    @Override // s9.e
    protected r9.f e() {
        List<r9.b> list = this.f36832n;
        this.f36833o = list;
        return new f((List) ea.a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0018 A[SYNTHETIC] */
    @Override // s9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void f(r9.j r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.a.f(r9.j):void");
    }

    @Override // s9.e, m8.d
    public void flush() {
        super.flush();
        this.f36832n = null;
        this.f36833o = null;
        M(0);
        N(4);
        L();
        this.f36836r = false;
        this.f36837s = false;
        this.f36838t = (byte) 0;
        this.f36839u = (byte) 0;
        this.f36840v = 0;
        this.f36841w = true;
        this.f36842x = -9223372036854775807L;
    }

    @Override // s9.e, m8.d
    /* renamed from: h */
    public k b() throws h {
        k i10;
        k b10 = super.b();
        if (b10 != null) {
            return b10;
        }
        if (!O() || (i10 = i()) == null) {
            return null;
        }
        this.f36832n = Collections.emptyList();
        this.f36842x = -9223372036854775807L;
        i10.p(j(), e(), Long.MAX_VALUE);
        return i10;
    }

    @Override // s9.e
    protected boolean k() {
        return this.f36832n != this.f36833o;
    }

    @Override // s9.e, m8.d
    public void release() {
    }
}
