package okhttp3.internal.publicsuffix;

import ee.u;
import fe.n;
import fe.o;
import fe.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import mf.h;
import mf.r;
import qe.g;
import qe.k;
import ue.d;
import ue.j;
import ve.q;
import ze.c;

/* compiled from: PublicSuffixDatabase.kt */
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f35279f;

    /* renamed from: g  reason: collision with root package name */
    private static final PublicSuffixDatabase f35280g;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f35282a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f35283b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private byte[] f35284c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f35285d;

    /* renamed from: h  reason: collision with root package name */
    public static final a f35281h = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f35278e = {(byte) 42};

    /* compiled from: PublicSuffixDatabase.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int b10;
            int b11;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != ((byte) 10)) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == ((byte) 10)) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        b10 = 46;
                        z10 = false;
                    } else {
                        z10 = z11;
                        b10 = c.b(bArr2[i17][i18], 255);
                    }
                    b11 = b10 - c.b(bArr[i14 + i19], 255);
                    if (b11 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    } else if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else if (i17 == bArr2.length - 1) {
                        break;
                    } else {
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (b11 >= 0) {
                    if (b11 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset charset = StandardCharsets.UTF_8;
                                k.e(charset, "UTF_8");
                                return new String(bArr, i14, i16, charset);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i14 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f35280g;
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        List<String> d10;
        d10 = o.d("*");
        f35279f = d10;
        f35280g = new PublicSuffixDatabase();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
        r4 = ve.q.j0(r8, new char[]{'.'}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f7, code lost:
        r1 = ve.q.j0(r5, new char[]{'.'}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<java.lang.String> b(java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(java.util.List):java.util.List");
    }

    private final void d() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        h d10 = r.d(new mf.o(r.k(resourceAsStream)));
        try {
            byte[] b02 = d10.b0(d10.readInt());
            byte[] b03 = d10.b0(d10.readInt());
            u uVar = u.f29813a;
            ne.a.a(d10, null);
            synchronized (this) {
                k.c(b02);
                this.f35284c = b02;
                k.c(b03);
                this.f35285d = b03;
            }
            this.f35283b.countDown();
        } finally {
        }
    }

    private final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    okhttp3.internal.platform.h.f35277c.g().k("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> f(String str) {
        List<String> j02;
        List<String> w10;
        j02 = q.j0(str, new char[]{'.'}, false, 0, 6, null);
        if (k.a((String) n.D(j02), "")) {
            w10 = x.w(j02, 1);
            return w10;
        }
        return j02;
    }

    public final String c(String str) {
        int size;
        int size2;
        d v10;
        d d10;
        String g10;
        k.f(str, "domain");
        String unicode = IDN.toUnicode(str);
        k.e(unicode, "unicodeDomain");
        List<String> f10 = f(unicode);
        List<String> b10 = b(f10);
        if (f10.size() != b10.size() || b10.get(0).charAt(0) == '!') {
            if (b10.get(0).charAt(0) == '!') {
                size = f10.size();
                size2 = b10.size();
            } else {
                size = f10.size();
                size2 = b10.size() + 1;
            }
            v10 = x.v(f(str));
            d10 = j.d(v10, size - size2);
            g10 = j.g(d10, ".", null, null, 0, null, null, 62, null);
            return g10;
        }
        return null;
    }
}
