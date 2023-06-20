package da;

import android.net.Uri;
import com.facebook.ads.AdError;
import da.a0;
import da.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import jb.q0;

/* compiled from: DefaultHttpDataSource.java */
/* loaded from: classes2.dex */
public class v extends g implements a0 {

    /* renamed from: e */
    private final boolean f29299e;

    /* renamed from: f */
    private final int f29300f;

    /* renamed from: g */
    private final int f29301g;

    /* renamed from: h */
    private final String f29302h;

    /* renamed from: i */
    private final a0.f f29303i;

    /* renamed from: j */
    private final a0.f f29304j;

    /* renamed from: k */
    private final boolean f29305k;

    /* renamed from: l */
    private ib.m<String> f29306l;

    /* renamed from: m */
    private p f29307m;

    /* renamed from: n */
    private HttpURLConnection f29308n;

    /* renamed from: o */
    private InputStream f29309o;

    /* renamed from: p */
    private boolean f29310p;

    /* renamed from: q */
    private int f29311q;

    /* renamed from: r */
    private long f29312r;

    /* renamed from: s */
    private long f29313s;

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: classes2.dex */
    public static final class b implements a0.b {

        /* renamed from: b */
        private m0 f29315b;

        /* renamed from: c */
        private ib.m<String> f29316c;

        /* renamed from: d */
        private String f29317d;

        /* renamed from: g */
        private boolean f29320g;

        /* renamed from: h */
        private boolean f29321h;

        /* renamed from: a */
        private final a0.f f29314a = new a0.f();

        /* renamed from: e */
        private int f29318e = 8000;

        /* renamed from: f */
        private int f29319f = 8000;

        @Override // da.l.a
        /* renamed from: b */
        public v a() {
            v vVar = new v(this.f29317d, this.f29318e, this.f29319f, this.f29320g, this.f29314a, this.f29316c, this.f29321h);
            m0 m0Var = this.f29315b;
            if (m0Var != null) {
                vVar.l(m0Var);
            }
            return vVar;
        }

        public b c(String str) {
            this.f29317d = str;
            return this;
        }
    }

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: classes2.dex */
    private static class c extends jb.n<String, List<String>> {

        /* renamed from: a */
        private final Map<String, List<String>> f29322a;

        public c(Map<String, List<String>> map) {
            this.f29322a = map;
        }

        public static /* synthetic */ boolean g(Map.Entry entry) {
            return j(entry);
        }

        public static /* synthetic */ boolean h(String str) {
            return k(str);
        }

        public static /* synthetic */ boolean j(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean k(String str) {
            return str != null;
        }

        @Override // jb.o
        /* renamed from: c */
        public Map<String, List<String>> a() {
            return this.f29322a;
        }

        @Override // jb.n, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.d(obj);
        }

        @Override // jb.n, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return q0.b(super.entrySet(), new ib.m() { // from class: da.x
                @Override // ib.m
                public final boolean apply(Object obj) {
                    return v.c.g((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.e(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.f();
        }

        @Override // jb.n, java.util.Map
        /* renamed from: i */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // jb.n, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // jb.n, java.util.Map
        public Set<String> keySet() {
            return q0.b(super.keySet(), new ib.m() { // from class: da.w
                @Override // ib.m
                public final boolean apply(Object obj) {
                    return v.c.h((String) obj);
                }
            });
        }

        @Override // jb.n, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private int B(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f29312r;
        if (j10 != -1) {
            long j11 = j10 - this.f29313s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) ea.n0.j(this.f29309o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f29313s += read;
        q(read);
        return read;
    }

    private void C(long j10, p pVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int read = ((InputStream) ea.n0.j(this.f29309o)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new a0.c(new InterruptedIOException(), pVar, 2000, 1);
            }
            if (read != -1) {
                j10 -= read;
                q(read);
            } else {
                throw new a0.c(pVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
        }
    }

    private void u() {
        HttpURLConnection httpURLConnection = this.f29308n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                ea.r.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f29308n = null;
        }
    }

    private URL v(URL url, String str, p pVar) throws a0.c {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new a0.c(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), pVar, 2001, 1);
                } else if (this.f29299e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
                    sb2.append("Disallowed cross-protocol redirect (");
                    sb2.append(protocol2);
                    sb2.append(" to ");
                    sb2.append(protocol);
                    sb2.append(")");
                    throw new a0.c(sb2.toString(), pVar, 2001, 1);
                }
            } catch (MalformedURLException e10) {
                throw new a0.c(e10, pVar, 2001, 1);
            }
        }
        throw new a0.c("Null location redirect", pVar, 2001, 1);
    }

    private static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ad, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection x(da.p r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.v.x(da.p):java.net.HttpURLConnection");
    }

    private HttpURLConnection y(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection A = A(url);
        A.setConnectTimeout(this.f29300f);
        A.setReadTimeout(this.f29301g);
        HashMap hashMap = new HashMap();
        a0.f fVar = this.f29303i;
        if (fVar != null) {
            hashMap.putAll(fVar.b());
        }
        hashMap.putAll(this.f29304j.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = b0.a(j10, j11);
        if (a10 != null) {
            A.setRequestProperty("Range", a10);
        }
        String str = this.f29302h;
        if (str != null) {
            A.setRequestProperty("User-Agent", str);
        }
        A.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        A.setInstanceFollowRedirects(z11);
        A.setDoOutput(bArr != null);
        A.setRequestMethod(p.c(i10));
        if (bArr != null) {
            A.setFixedLengthStreamingMode(bArr.length);
            A.connect();
            OutputStream outputStream = A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A.connect();
        }
        return A;
    }

    private static void z(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = ea.n0.f29709a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) ea.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    HttpURLConnection A(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws a0.c {
        try {
            return B(bArr, i10, i11);
        } catch (IOException e10) {
            throw a0.c.c(e10, (p) ea.n0.j(this.f29307m), 2);
        }
    }

    @Override // da.l
    public void close() throws a0.c {
        try {
            InputStream inputStream = this.f29309o;
            if (inputStream != null) {
                long j10 = this.f29312r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f29313s;
                }
                z(this.f29308n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new a0.c(e10, (p) ea.n0.j(this.f29307m), 2000, 3);
                }
            }
        } finally {
            this.f29309o = null;
            u();
            if (this.f29310p) {
                this.f29310p = false;
                r();
            }
        }
    }

    @Override // da.g, da.l
    public Map<String, List<String>> e() {
        HttpURLConnection httpURLConnection = this.f29308n;
        if (httpURLConnection == null) {
            return jb.t.k();
        }
        return new c(httpURLConnection.getHeaderFields());
    }

    @Override // da.l
    public long g(p pVar) throws a0.c {
        byte[] bArr;
        this.f29307m = pVar;
        long j10 = 0;
        this.f29313s = 0L;
        this.f29312r = 0L;
        s(pVar);
        try {
            HttpURLConnection x10 = x(pVar);
            this.f29308n = x10;
            this.f29311q = x10.getResponseCode();
            String responseMessage = x10.getResponseMessage();
            int i10 = this.f29311q;
            if (i10 >= 200 && i10 <= 299) {
                String contentType = x10.getContentType();
                ib.m<String> mVar = this.f29306l;
                if (mVar != null && !mVar.apply(contentType)) {
                    u();
                    throw new a0.d(contentType, pVar);
                }
                if (this.f29311q == 200) {
                    long j11 = pVar.f29232f;
                    if (j11 != 0) {
                        j10 = j11;
                    }
                }
                boolean w10 = w(x10);
                if (!w10) {
                    long j12 = pVar.f29233g;
                    if (j12 != -1) {
                        this.f29312r = j12;
                    } else {
                        long b10 = b0.b(x10.getHeaderField("Content-Length"), x10.getHeaderField("Content-Range"));
                        this.f29312r = b10 != -1 ? b10 - j10 : -1L;
                    }
                } else {
                    this.f29312r = pVar.f29233g;
                }
                try {
                    this.f29309o = x10.getInputStream();
                    if (w10) {
                        this.f29309o = new GZIPInputStream(this.f29309o);
                    }
                    this.f29310p = true;
                    t(pVar);
                    try {
                        C(j10, pVar);
                        return this.f29312r;
                    } catch (IOException e10) {
                        u();
                        if (e10 instanceof a0.c) {
                            throw ((a0.c) e10);
                        }
                        throw new a0.c(e10, pVar, 2000, 1);
                    }
                } catch (IOException e11) {
                    u();
                    throw new a0.c(e11, pVar, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = x10.getHeaderFields();
            if (this.f29311q == 416) {
                if (pVar.f29232f == b0.c(x10.getHeaderField("Content-Range"))) {
                    this.f29310p = true;
                    t(pVar);
                    long j13 = pVar.f29233g;
                    if (j13 != -1) {
                        return j13;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = x10.getErrorStream();
            try {
                bArr = errorStream != null ? ea.n0.V0(errorStream) : ea.n0.f29714f;
            } catch (IOException unused) {
                bArr = ea.n0.f29714f;
            }
            byte[] bArr2 = bArr;
            u();
            throw new a0.e(this.f29311q, responseMessage, this.f29311q == 416 ? new m(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, pVar, bArr2);
        } catch (IOException e12) {
            u();
            throw a0.c.c(e12, pVar, 1);
        }
    }

    @Override // da.l
    public Uri o() {
        HttpURLConnection httpURLConnection = this.f29308n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    private v(String str, int i10, int i11, boolean z10, a0.f fVar, ib.m<String> mVar, boolean z11) {
        super(true);
        this.f29302h = str;
        this.f29300f = i10;
        this.f29301g = i11;
        this.f29299e = z10;
        this.f29303i = fVar;
        this.f29306l = mVar;
        this.f29304j = new a0.f();
        this.f29305k = z11;
    }
}
