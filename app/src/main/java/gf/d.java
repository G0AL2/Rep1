package gf;

import com.google.android.gms.common.api.Api;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import fe.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mf.e0;
import mf.r;

/* compiled from: Hpack.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final c[] f30884a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<mf.i, Integer> f30885b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f30886c;

    static {
        d dVar = new d();
        f30886c = dVar;
        mf.i iVar = c.f30877f;
        mf.i iVar2 = c.f30878g;
        mf.i iVar3 = c.f30879h;
        mf.i iVar4 = c.f30876e;
        f30884a = new c[]{new c(c.f30880i, ""), new c(iVar, "GET"), new c(iVar, "POST"), new c(iVar2, "/"), new c(iVar2, "/index.html"), new c(iVar3, "http"), new c(iVar3, "https"), new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c(Analytics.Param.SERVER, ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f30885b = dVar.d();
    }

    private d() {
    }

    private final Map<mf.i, Integer> d() {
        c[] cVarArr = f30884a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = f30884a;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f30882b)) {
                linkedHashMap.put(cVarArr2[i10].f30882b, Integer.valueOf(i10));
            }
        }
        Map<mf.i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        qe.k.e(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final mf.i a(mf.i iVar) throws IOException {
        qe.k.f(iVar, "name");
        int A = iVar.A();
        for (int i10 = 0; i10 < A; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte k10 = iVar.k(i10);
            if (b10 <= k10 && b11 >= k10) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.E());
            }
        }
        return iVar;
    }

    public final Map<mf.i, Integer> b() {
        return f30885b;
    }

    public final c[] c() {
        return f30884a;
    }

    /* compiled from: Hpack.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f30887a;

        /* renamed from: b  reason: collision with root package name */
        private final mf.h f30888b;

        /* renamed from: c  reason: collision with root package name */
        public c[] f30889c;

        /* renamed from: d  reason: collision with root package name */
        private int f30890d;

        /* renamed from: e  reason: collision with root package name */
        public int f30891e;

        /* renamed from: f  reason: collision with root package name */
        public int f30892f;

        /* renamed from: g  reason: collision with root package name */
        private final int f30893g;

        /* renamed from: h  reason: collision with root package name */
        private int f30894h;

        public a(e0 e0Var, int i10, int i11) {
            qe.k.f(e0Var, "source");
            this.f30893g = i10;
            this.f30894h = i11;
            this.f30887a = new ArrayList();
            this.f30888b = r.d(e0Var);
            c[] cVarArr = new c[8];
            this.f30889c = cVarArr;
            this.f30890d = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f30894h;
            int i11 = this.f30892f;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            fe.k.k(this.f30889c, null, 0, 0, 6, null);
            this.f30890d = this.f30889c.length - 1;
            this.f30891e = 0;
            this.f30892f = 0;
        }

        private final int c(int i10) {
            return this.f30890d + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f30889c.length;
                while (true) {
                    length--;
                    i11 = this.f30890d;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f30889c[length];
                    qe.k.c(cVar);
                    int i13 = cVar.f30881a;
                    i10 -= i13;
                    this.f30892f -= i13;
                    this.f30891e--;
                    i12++;
                }
                c[] cVarArr = this.f30889c;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f30891e);
                this.f30890d += i12;
            }
            return i12;
        }

        private final mf.i f(int i10) throws IOException {
            if (h(i10)) {
                return d.f30886c.c()[i10].f30882b;
            }
            int c10 = c(i10 - d.f30886c.c().length);
            if (c10 >= 0) {
                c[] cVarArr = this.f30889c;
                if (c10 < cVarArr.length) {
                    c cVar = cVarArr[c10];
                    qe.k.c(cVar);
                    return cVar.f30882b;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, c cVar) {
            this.f30887a.add(cVar);
            int i11 = cVar.f30881a;
            if (i10 != -1) {
                c cVar2 = this.f30889c[c(i10)];
                qe.k.c(cVar2);
                i11 -= cVar2.f30881a;
            }
            int i12 = this.f30894h;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f30892f + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f30891e + 1;
                c[] cVarArr = this.f30889c;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f30890d = this.f30889c.length - 1;
                    this.f30889c = cVarArr2;
                }
                int i14 = this.f30890d;
                this.f30890d = i14 - 1;
                this.f30889c[i14] = cVar;
                this.f30891e++;
            } else {
                this.f30889c[i10 + c(i10) + d10] = cVar;
            }
            this.f30892f += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f30886c.c().length - 1;
        }

        private final int i() throws IOException {
            return ze.c.b(this.f30888b.readByte(), 255);
        }

        private final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f30887a.add(d.f30886c.c()[i10]);
                return;
            }
            int c10 = c(i10 - d.f30886c.c().length);
            if (c10 >= 0) {
                c[] cVarArr = this.f30889c;
                if (c10 < cVarArr.length) {
                    List<c> list = this.f30887a;
                    c cVar = cVarArr[c10];
                    qe.k.c(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) throws IOException {
            g(-1, new c(f(i10), j()));
        }

        private final void o() throws IOException {
            g(-1, new c(d.f30886c.a(j()), j()));
        }

        private final void p(int i10) throws IOException {
            this.f30887a.add(new c(f(i10), j()));
        }

        private final void q() throws IOException {
            this.f30887a.add(new c(d.f30886c.a(j()), j()));
        }

        public final List<c> e() {
            List<c> N;
            N = x.N(this.f30887a);
            this.f30887a.clear();
            return N;
        }

        public final mf.i j() throws IOException {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long m10 = m(i10, 127);
            if (z10) {
                mf.f fVar = new mf.f();
                k.f31040d.b(this.f30888b, m10, fVar);
                return fVar.g0();
            }
            return this.f30888b.o0(m10);
        }

        public final void k() throws IOException {
            while (!this.f30888b.w0()) {
                int b10 = ze.c.b(this.f30888b.readByte(), 255);
                if (b10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    l(m(b10, 127) - 1);
                } else if (b10 == 64) {
                    o();
                } else if ((b10 & 64) == 64) {
                    n(m(b10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int m10 = m(b10, 31);
                    this.f30894h = m10;
                    if (m10 >= 0 && m10 <= this.f30893g) {
                        a();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f30894h);
                    }
                } else if (b10 != 16 && b10 != 0) {
                    p(m(b10, 15) - 1);
                } else {
                    q();
                }
            }
        }

        public final int m(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public /* synthetic */ a(e0 e0Var, int i10, int i11, int i12, qe.g gVar) {
            this(e0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* compiled from: Hpack.kt */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f30895a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30896b;

        /* renamed from: c  reason: collision with root package name */
        public int f30897c;

        /* renamed from: d  reason: collision with root package name */
        public c[] f30898d;

        /* renamed from: e  reason: collision with root package name */
        private int f30899e;

        /* renamed from: f  reason: collision with root package name */
        public int f30900f;

        /* renamed from: g  reason: collision with root package name */
        public int f30901g;

        /* renamed from: h  reason: collision with root package name */
        public int f30902h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f30903i;

        /* renamed from: j  reason: collision with root package name */
        private final mf.f f30904j;

        public b(int i10, boolean z10, mf.f fVar) {
            qe.k.f(fVar, "out");
            this.f30902h = i10;
            this.f30903i = z10;
            this.f30904j = fVar;
            this.f30895a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f30897c = i10;
            c[] cVarArr = new c[8];
            this.f30898d = cVarArr;
            this.f30899e = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f30897c;
            int i11 = this.f30901g;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            fe.k.k(this.f30898d, null, 0, 0, 6, null);
            this.f30899e = this.f30898d.length - 1;
            this.f30900f = 0;
            this.f30901g = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f30898d.length;
                while (true) {
                    length--;
                    i11 = this.f30899e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f30898d[length];
                    qe.k.c(cVar);
                    i10 -= cVar.f30881a;
                    int i13 = this.f30901g;
                    c cVar2 = this.f30898d[length];
                    qe.k.c(cVar2);
                    this.f30901g = i13 - cVar2.f30881a;
                    this.f30900f--;
                    i12++;
                }
                c[] cVarArr = this.f30898d;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f30900f);
                c[] cVarArr2 = this.f30898d;
                int i14 = this.f30899e;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f30899e += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f30881a;
            int i11 = this.f30897c;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f30901g + i10) - i11);
            int i12 = this.f30900f + 1;
            c[] cVarArr = this.f30898d;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f30899e = this.f30898d.length - 1;
                this.f30898d = cVarArr2;
            }
            int i13 = this.f30899e;
            this.f30899e = i13 - 1;
            this.f30898d[i13] = cVar;
            this.f30900f++;
            this.f30901g += i10;
        }

        public final void e(int i10) {
            this.f30902h = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f30897c;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f30895a = Math.min(this.f30895a, min);
            }
            this.f30896b = true;
            this.f30897c = min;
            a();
        }

        public final void f(mf.i iVar) throws IOException {
            qe.k.f(iVar, "data");
            if (this.f30903i) {
                k kVar = k.f31040d;
                if (kVar.d(iVar) < iVar.A()) {
                    mf.f fVar = new mf.f();
                    kVar.c(iVar, fVar);
                    mf.i g02 = fVar.g0();
                    h(g02.A(), 127, 128);
                    this.f30904j.Y(g02);
                    return;
                }
            }
            h(iVar.A(), 127, 0);
            this.f30904j.Y(iVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List<gf.c> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.d.b.g(java.util.List):void");
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f30904j.writeByte(i10 | i12);
                return;
            }
            this.f30904j.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f30904j.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f30904j.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, mf.f fVar, int i11, qe.g gVar) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, fVar);
        }
    }
}
