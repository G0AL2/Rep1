package q2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import q2.b;
import q2.p;
import q2.v;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public abstract class n<T> implements Comparable<n<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f35813a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35814b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35815c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35816d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f35817e;

    /* renamed from: f  reason: collision with root package name */
    private p.a f35818f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f35819g;

    /* renamed from: h  reason: collision with root package name */
    private o f35820h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f35821i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f35822j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f35823k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f35824l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f35825m;

    /* renamed from: n  reason: collision with root package name */
    private r f35826n;

    /* renamed from: o  reason: collision with root package name */
    private b.a f35827o;

    /* renamed from: p  reason: collision with root package name */
    private b f35828p;

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f35829a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f35830b;

        a(String str, long j10) {
            this.f35829a = str;
            this.f35830b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f35813a.a(this.f35829a, this.f35830b);
            n.this.f35813a.b(n.this.toString());
        }
    }

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    interface b {
        void a(n<?> nVar, p<?> pVar);

        void b(n<?> nVar);
    }

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public enum c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public n(int i10, String str, p.a aVar) {
        this.f35813a = v.a.f35855c ? new v.a() : null;
        this.f35817e = new Object();
        this.f35821i = true;
        this.f35822j = false;
        this.f35823k = false;
        this.f35824l = false;
        this.f35825m = false;
        this.f35827o = null;
        this.f35814b = i10;
        this.f35815c = str;
        this.f35818f = aVar;
        K(new e());
        this.f35816d = g(str);
    }

    private byte[] f(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append('=');
                    sb2.append(URLEncoder.encode(entry.getValue(), str));
                    sb2.append('&');
                } else {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    private static int g(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public boolean A() {
        boolean z10;
        synchronized (this.f35817e) {
            z10 = this.f35822j;
        }
        return z10;
    }

    public void B() {
        synchronized (this.f35817e) {
            this.f35823k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        b bVar;
        synchronized (this.f35817e) {
            bVar = this.f35828p;
        }
        if (bVar != null) {
            bVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(p<?> pVar) {
        b bVar;
        synchronized (this.f35817e) {
            bVar = this.f35828p;
        }
        if (bVar != null) {
            bVar.a(this, pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public u E(u uVar) {
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract p<T> F(k kVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(int i10) {
        o oVar = this.f35820h;
        if (oVar != null) {
            oVar.e(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> H(b.a aVar) {
        this.f35827o = aVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(b bVar) {
        synchronized (this.f35817e) {
            this.f35828p = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> J(o oVar) {
        this.f35820h = oVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> K(r rVar) {
        this.f35826n = rVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<?> L(int i10) {
        this.f35819g = Integer.valueOf(i10);
        return this;
    }

    public final boolean M() {
        return this.f35821i;
    }

    public final boolean N() {
        return this.f35825m;
    }

    public final boolean O() {
        return this.f35824l;
    }

    public void b(String str) {
        if (v.a.f35855c) {
            this.f35813a.a(str, Thread.currentThread().getId());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(n<T> nVar) {
        c u10 = u();
        c u11 = nVar.u();
        return u10 == u11 ? this.f35819g.intValue() - nVar.f35819g.intValue() : u11.ordinal() - u10.ordinal();
    }

    public void d(u uVar) {
        p.a aVar;
        synchronized (this.f35817e) {
            aVar = this.f35818f;
        }
        if (aVar != null) {
            aVar.a(uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(String str) {
        o oVar = this.f35820h;
        if (oVar != null) {
            oVar.c(this);
        }
        if (v.a.f35855c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
                return;
            }
            this.f35813a.a(str, id2);
            this.f35813a.b(toString());
        }
    }

    public byte[] i() throws q2.a {
        Map<String, String> o10 = o();
        if (o10 == null || o10.size() <= 0) {
            return null;
        }
        return f(o10, p());
    }

    public String j() {
        return "application/x-www-form-urlencoded; charset=" + p();
    }

    public b.a k() {
        return this.f35827o;
    }

    public String l() {
        String y10 = y();
        int n10 = n();
        if (n10 == 0 || n10 == -1) {
            return y10;
        }
        return Integer.toString(n10) + '-' + y10;
    }

    public Map<String, String> m() throws q2.a {
        return Collections.emptyMap();
    }

    public int n() {
        return this.f35814b;
    }

    protected Map<String, String> o() throws q2.a {
        return null;
    }

    protected String p() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] q() throws q2.a {
        Map<String, String> s10 = s();
        if (s10 == null || s10.size() <= 0) {
            return null;
        }
        return f(s10, t());
    }

    @Deprecated
    public String r() {
        return j();
    }

    @Deprecated
    protected Map<String, String> s() throws q2.a {
        return o();
    }

    @Deprecated
    protected String t() {
        return p();
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(x());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A() ? "[X] " : "[ ] ");
        sb2.append(y());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(u());
        sb2.append(" ");
        sb2.append(this.f35819g);
        return sb2.toString();
    }

    public c u() {
        return c.NORMAL;
    }

    public r v() {
        return this.f35826n;
    }

    public final int w() {
        return v().b();
    }

    public int x() {
        return this.f35816d;
    }

    public String y() {
        return this.f35815c;
    }

    public boolean z() {
        boolean z10;
        synchronized (this.f35817e) {
            z10 = this.f35823k;
        }
        return z10;
    }
}
