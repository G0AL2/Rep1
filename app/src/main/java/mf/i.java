package mf;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: ByteString.kt */
/* loaded from: classes3.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: a  reason: collision with root package name */
    private transient int f34463a;

    /* renamed from: b  reason: collision with root package name */
    private transient String f34464b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f34465c;

    /* renamed from: e  reason: collision with root package name */
    public static final a f34462e = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final i f34461d = new i(new byte[0]);

    /* compiled from: ByteString.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ i g(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = bArr.length;
            }
            return aVar.f(bArr, i10, i11);
        }

        public final i a(String str) {
            qe.k.f(str, "$this$decodeBase64");
            byte[] a10 = mf.a.a(str);
            if (a10 != null) {
                return new i(a10);
            }
            return null;
        }

        public final i b(String str) {
            qe.k.f(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) ((nf.b.b(str.charAt(i11)) << 4) + nf.b.b(str.charAt(i11 + 1)));
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final i c(String str, Charset charset) {
            qe.k.f(str, "$this$encode");
            qe.k.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            qe.k.e(bytes, "(this as java.lang.String).getBytes(charset)");
            return new i(bytes);
        }

        public final i d(String str) {
            qe.k.f(str, "$this$encodeUtf8");
            i iVar = new i(b.a(str));
            iVar.x(str);
            return iVar;
        }

        public final i e(byte... bArr) {
            qe.k.f(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            qe.k.e(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new i(copyOf);
        }

        public final i f(byte[] bArr, int i10, int i11) {
            byte[] g10;
            qe.k.f(bArr, "$this$toByteString");
            c.b(bArr.length, i10, i11);
            g10 = fe.k.g(bArr, i10, i11 + i10);
            return new i(g10);
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    public i(byte[] bArr) {
        qe.k.f(bArr, "data");
        this.f34465c = bArr;
    }

    public static final i h(String str) {
        return f34462e.a(str);
    }

    public static final i j(String str) {
        return f34462e.d(str);
    }

    public static final i t(byte... bArr) {
        return f34462e.e(bArr);
    }

    public final int A() {
        return n();
    }

    public final boolean B(i iVar) {
        qe.k.f(iVar, "prefix");
        return u(0, iVar, 0, iVar.A());
    }

    public i C() {
        byte b10;
        for (int i10 = 0; i10 < l().length; i10++) {
            byte b11 = l()[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] l10 = l();
                byte[] copyOf = Arrays.copyOf(l10, l10.length);
                qe.k.e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new i(copyOf);
            }
        }
        return this;
    }

    public byte[] D() {
        byte[] l10 = l();
        byte[] copyOf = Arrays.copyOf(l10, l10.length);
        qe.k.e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public String E() {
        String o10 = o();
        if (o10 == null) {
            String b10 = b.b(q());
            x(b10);
            return b10;
        }
        return o10;
    }

    public void F(f fVar, int i10, int i11) {
        qe.k.f(fVar, "buffer");
        nf.b.f(this, fVar, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.A() == l().length && iVar.v(0, l(), 0, l().length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return mf.a.c(l(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(mf.i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            qe.k.f(r10, r0)
            int r0 = r9.A()
            int r1 = r10.A()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.k(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.k(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.i.compareTo(mf.i):int");
    }

    public int hashCode() {
        int m10 = m();
        if (m10 != 0) {
            return m10;
        }
        int hashCode = Arrays.hashCode(l());
        w(hashCode);
        return hashCode;
    }

    public i i(String str) {
        qe.k.f(str, "algorithm");
        return nf.b.d(this, str);
    }

    public final byte k(int i10) {
        return r(i10);
    }

    public final byte[] l() {
        return this.f34465c;
    }

    public final int m() {
        return this.f34463a;
    }

    public int n() {
        return l().length;
    }

    public final String o() {
        return this.f34464b;
    }

    public String p() {
        byte[] l10;
        char[] cArr = new char[l().length * 2];
        int i10 = 0;
        for (byte b10 : l()) {
            int i11 = i10 + 1;
            cArr[i10] = nf.b.h()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = nf.b.h()[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] q() {
        return l();
    }

    public byte r(int i10) {
        return l()[i10];
    }

    public final i s() {
        return i("MD5");
    }

    public String toString() {
        String u10;
        String u11;
        String u12;
        i iVar;
        byte[] g10;
        if (l().length == 0) {
            return "[size=0]";
        }
        int a10 = nf.b.a(l(), 64);
        if (a10 == -1) {
            if (l().length <= 64) {
                return "[hex=" + p() + ']';
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(l().length);
            sb2.append(" hex=");
            if (64 <= l().length) {
                if (64 == l().length) {
                    iVar = this;
                } else {
                    g10 = fe.k.g(l(), 0, 64);
                    iVar = new i(g10);
                }
                sb2.append(iVar.p());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + l().length + ')').toString());
        }
        String E = E();
        Objects.requireNonNull(E, "null cannot be cast to non-null type java.lang.String");
        String substring = E.substring(0, a10);
        qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        u10 = ve.p.u(substring, "\\", "\\\\", false, 4, null);
        u11 = ve.p.u(u10, "\n", "\\n", false, 4, null);
        u12 = ve.p.u(u11, "\r", "\\r", false, 4, null);
        if (a10 < E.length()) {
            return "[size=" + l().length + " text=" + u12 + "…]";
        }
        return "[text=" + u12 + ']';
    }

    public boolean u(int i10, i iVar, int i11, int i12) {
        qe.k.f(iVar, InneractiveMediationNameConsts.OTHER);
        return iVar.v(i11, l(), i10, i12);
    }

    public boolean v(int i10, byte[] bArr, int i11, int i12) {
        qe.k.f(bArr, InneractiveMediationNameConsts.OTHER);
        return i10 >= 0 && i10 <= l().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && c.a(l(), i10, bArr, i11, i12);
    }

    public final void w(int i10) {
        this.f34463a = i10;
    }

    public final void x(String str) {
        this.f34464b = str;
    }

    public final i y() {
        return i("SHA-1");
    }

    public final i z() {
        return i("SHA-256");
    }
}
