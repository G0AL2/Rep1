package ze;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fe.h0;
import fe.l;
import fe.x;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import mf.g;
import mf.h;
import mf.i;
import mf.u;
import qe.k;
import qe.v;
import ve.d;
import ve.f;
import ve.p;
import ve.q;
import ye.c0;
import ye.d0;
import ye.e;
import ye.e0;
import ye.r;
import ye.t;
import ye.z;

/* compiled from: Util.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    public static final byte[] f40519a;

    /* renamed from: b */
    public static final t f40520b = t.f39752b.h(new String[0]);

    /* renamed from: c */
    public static final e0 f40521c;

    /* renamed from: d */
    private static final u f40522d;

    /* renamed from: e */
    public static final TimeZone f40523e;

    /* renamed from: f */
    private static final f f40524f;

    /* renamed from: g */
    public static final boolean f40525g;

    /* renamed from: h */
    public static final String f40526h;

    /* compiled from: Util.kt */
    /* loaded from: classes3.dex */
    public static final class a implements r.c {

        /* renamed from: a */
        final /* synthetic */ r f40527a;

        a(r rVar) {
            this.f40527a = rVar;
        }

        @Override // ye.r.c
        public final r a(e eVar) {
            k.f(eVar, "it");
            return this.f40527a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Util.kt */
    /* loaded from: classes3.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f40528a;

        /* renamed from: b */
        final /* synthetic */ boolean f40529b;

        b(String str, boolean z10) {
            this.f40528a = str;
            this.f40529b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f40528a);
            thread.setDaemon(this.f40529b);
            return thread;
        }
    }

    static {
        String c02;
        String d02;
        byte[] bArr = new byte[0];
        f40519a = bArr;
        f40521c = e0.a.d(e0.f39649a, bArr, null, 1, null);
        c0.a.k(c0.Companion, bArr, null, 0, 0, 7, null);
        u.a aVar = u.f34489d;
        i.a aVar2 = i.f34462e;
        f40522d = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        k.c(timeZone);
        f40523e = timeZone;
        f40524f = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f40525g = false;
        String name = z.class.getName();
        k.e(name, "OkHttpClient::class.java.name");
        c02 = q.c0(name, "okhttp3.");
        d02 = q.d0(c02, "Client");
        f40526h = d02;
    }

    public static final int A(String str, int i10) {
        k.f(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] B(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        k.f(strArr, "$this$intersect");
        k.f(strArr2, InneractiveMediationNameConsts.OTHER);
        k.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean C(hf.a aVar, File file) {
        k.f(aVar, "$this$isCivilized");
        k.f(file, "file");
        mf.c0 f10 = aVar.f(file);
        try {
            try {
                aVar.h(file);
                ne.a.a(f10, null);
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ne.a.a(f10, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            ee.u uVar = ee.u.f29813a;
            ne.a.a(f10, null);
            aVar.h(file);
            return false;
        }
    }

    public static final boolean D(Socket socket, h hVar) {
        k.f(socket, "$this$isHealthy");
        k.f(hVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !hVar.w0();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean E(String str) {
        boolean l10;
        boolean l11;
        boolean l12;
        boolean l13;
        k.f(str, "name");
        l10 = p.l(str, "Authorization", true);
        if (l10) {
            return true;
        }
        l11 = p.l(str, "Cookie", true);
        if (l11) {
            return true;
        }
        l12 = p.l(str, "Proxy-Authorization", true);
        if (l12) {
            return true;
        }
        l13 = p.l(str, "Set-Cookie", true);
        return l13;
    }

    public static final int F(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset G(h hVar, Charset charset) throws IOException {
        k.f(hVar, "$this$readBomAsCharset");
        k.f(charset, "default");
        int X = hVar.X(f40522d);
        if (X != -1) {
            if (X == 0) {
                Charset charset2 = StandardCharsets.UTF_8;
                k.e(charset2, "UTF_8");
                return charset2;
            } else if (X == 1) {
                Charset charset3 = StandardCharsets.UTF_16BE;
                k.e(charset3, "UTF_16BE");
                return charset3;
            } else if (X == 2) {
                Charset charset4 = StandardCharsets.UTF_16LE;
                k.e(charset4, "UTF_16LE");
                return charset4;
            } else if (X != 3) {
                if (X == 4) {
                    return d.f38079a.b();
                }
                throw new AssertionError();
            } else {
                return d.f38079a.a();
            }
        }
        return charset;
    }

    public static final int H(h hVar) throws IOException {
        k.f(hVar, "$this$readMedium");
        return b(hVar.readByte(), 255) | (b(hVar.readByte(), 255) << 16) | (b(hVar.readByte(), 255) << 8);
    }

    public static final int I(mf.f fVar, byte b10) {
        k.f(fVar, "$this$skipAll");
        int i10 = 0;
        while (!fVar.w0() && fVar.A(0L) == b10) {
            i10++;
            fVar.readByte();
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
        r11.k().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005b, code lost:
        r11.k().d(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
        if (r5 != Long.MAX_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0081, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean J(mf.e0 r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "$this$skipAll"
            qe.k.f(r11, r0)
            java.lang.String r0 = "timeUnit"
            qe.k.f(r13, r0)
            long r0 = java.lang.System.nanoTime()
            mf.f0 r2 = r11.k()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            mf.f0 r2 = r11.k()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            mf.f0 r2 = r11.k()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            mf.f r12 = new mf.f     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r12.<init>()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.e0(r12, r7)     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.b()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            goto L3e
        L4e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
        L53:
            mf.f0 r11 = r11.k()
            r11.a()
            goto L81
        L5b:
            mf.f0 r11 = r11.k()
            long r0 = r0 + r5
            r11.d(r0)
            goto L81
        L64:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L71
            mf.f0 r11 = r11.k()
            r11.a()
            goto L79
        L71:
            mf.f0 r11 = r11.k()
            long r0 = r0 + r5
            r11.d(r0)
        L79:
            throw r12
        L7a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
            goto L53
        L81:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.c.J(mf.e0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory K(String str, boolean z10) {
        k.f(str, "name");
        return new b(str, z10);
    }

    public static final List<gf.c> L(t tVar) {
        se.c i10;
        int p10;
        k.f(tVar, "$this$toHeaderList");
        i10 = se.f.i(0, tVar.size());
        p10 = fe.q.p(i10, 10);
        ArrayList arrayList = new ArrayList(p10);
        Iterator<Integer> it = i10.iterator();
        while (it.hasNext()) {
            int c10 = ((fe.c0) it).c();
            arrayList.add(new gf.c(tVar.c(c10), tVar.h(c10)));
        }
        return arrayList;
    }

    public static final t M(List<gf.c> list) {
        k.f(list, "$this$toHeaders");
        t.a aVar = new t.a();
        for (gf.c cVar : list) {
            aVar.c(cVar.a().E(), cVar.b().E());
        }
        return aVar.d();
    }

    public static final String N(int i10) {
        String hexString = Integer.toHexString(i10);
        k.e(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final String O(long j10) {
        String hexString = Long.toHexString(j10);
        k.e(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final String P(ye.u uVar, boolean z10) {
        boolean D;
        String h10;
        k.f(uVar, "$this$toHostHeader");
        D = q.D(uVar.h(), ":", false, 2, null);
        if (D) {
            h10 = '[' + uVar.h() + ']';
        } else {
            h10 = uVar.h();
        }
        if (z10 || uVar.m() != ye.u.f39756l.c(uVar.q())) {
            return h10 + ':' + uVar.m();
        }
        return h10;
    }

    public static /* synthetic */ String Q(ye.u uVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return P(uVar, z10);
    }

    public static final <T> List<T> R(List<? extends T> list) {
        List P;
        k.f(list, "$this$toImmutableList");
        P = x.P(list);
        List<T> unmodifiableList = Collections.unmodifiableList(P);
        k.e(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> S(Map<K, ? extends V> map) {
        Map<K, V> g10;
        k.f(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            g10 = h0.g();
            return g10;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        k.e(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long T(String str, long j10) {
        k.f(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int U(String str, int i10) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String V(String str, int i10, int i11) {
        k.f(str, "$this$trimSubstring");
        int w10 = w(str, i10, i11);
        String substring = str.substring(w10, y(str, w10, i11));
        k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String W(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return V(str, i10, i11);
    }

    public static final Throwable X(Exception exc, List<? extends Exception> list) {
        k.f(exc, "$this$withSuppressed");
        k.f(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            ee.b.a(exc, exc2);
        }
        return exc;
    }

    public static final void Y(g gVar, int i10) throws IOException {
        k.f(gVar, "$this$writeMedium");
        gVar.writeByte((i10 >>> 16) & 255);
        gVar.writeByte((i10 >>> 8) & 255);
        gVar.writeByte(i10 & 255);
    }

    public static final <E> void a(List<E> list, E e10) {
        k.f(list, "$this$addIfAbsent");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return i10 & j10;
    }

    public static final r.c e(r rVar) {
        k.f(rVar, "$this$asFactory");
        return new a(rVar);
    }

    public static final boolean f(String str) {
        k.f(str, "$this$canParseAsIpAddress");
        return f40524f.a(str);
    }

    public static final boolean g(ye.u uVar, ye.u uVar2) {
        k.f(uVar, "$this$canReuseConnectionFor");
        k.f(uVar2, InneractiveMediationNameConsts.OTHER);
        return k.a(uVar.h(), uVar2.h()) && uVar.m() == uVar2.m() && k.a(uVar.q(), uVar2.q());
    }

    public static final int h(String str, long j10, TimeUnit timeUnit) {
        k.f(str, "name");
        boolean z10 = true;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j10);
            if (!(millis <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            if (millis == 0 && i10 > 0) {
                z10 = false;
            }
            if (z10) {
                return (int) millis;
            }
            throw new IllegalArgumentException((str + " too small.").toString());
        }
        throw new IllegalStateException("unit == null".toString());
    }

    public static final void i(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(Closeable closeable) {
        k.f(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void k(Socket socket) {
        k.f(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!k.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] l(String[] strArr, String str) {
        int r10;
        k.f(strArr, "$this$concat");
        k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        k.e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        r10 = l.r(strArr2);
        strArr2[r10] = str;
        return strArr2;
    }

    public static final int m(String str, char c10, int i10, int i11) {
        k.f(str, "$this$delimiterOffset");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(String str, String str2, int i10, int i11) {
        boolean C;
        k.f(str, "$this$delimiterOffset");
        k.f(str2, "delimiters");
        while (i10 < i11) {
            C = q.C(str2, str.charAt(i10), false, 2, null);
            if (C) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int o(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m(str, c10, i10, i11);
    }

    public static final boolean p(mf.e0 e0Var, int i10, TimeUnit timeUnit) {
        k.f(e0Var, "$this$discard");
        k.f(timeUnit, "timeUnit");
        try {
            return J(e0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String q(String str, Object... objArr) {
        k.f(str, "format");
        k.f(objArr, "args");
        v vVar = v.f36113a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        k.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean r(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        k.f(strArr, "$this$hasIntersection");
        k.f(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long s(d0 d0Var) {
        k.f(d0Var, "$this$headersContentLength");
        String a10 = d0Var.A().a("Content-Length");
        if (a10 != null) {
            return T(a10, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> t(T... tArr) {
        List j10;
        k.f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        j10 = fe.p.j(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(j10);
        k.e(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int u(String[] strArr, String str, Comparator<String> comparator) {
        k.f(strArr, "$this$indexOf");
        k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        k.f(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int v(String str) {
        k.f(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (k.h(charAt, 31) <= 0 || k.h(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int w(String str, int i10, int i11) {
        k.f(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int x(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return w(str, i10, i11);
    }

    public static final int y(String str, int i10, int i11) {
        k.f(str, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int z(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return y(str, i10, i11);
    }
}
