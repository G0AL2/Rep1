package ye;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpec.kt */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: e  reason: collision with root package name */
    private static final i[] f39698e;

    /* renamed from: f  reason: collision with root package name */
    private static final i[] f39699f;

    /* renamed from: g  reason: collision with root package name */
    public static final l f39700g;

    /* renamed from: h  reason: collision with root package name */
    public static final l f39701h;

    /* renamed from: i  reason: collision with root package name */
    public static final l f39702i;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39703a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39704b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f39705c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f39706d;

    /* compiled from: ConnectionSpec.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f39707a;

        /* renamed from: b  reason: collision with root package name */
        private String[] f39708b;

        /* renamed from: c  reason: collision with root package name */
        private String[] f39709c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f39710d;

        public a(boolean z10) {
            this.f39707a = z10;
        }

        public final l a() {
            return new l(this.f39707a, this.f39710d, this.f39708b, this.f39709c);
        }

        public final a b(String... strArr) {
            qe.k.f(strArr, "cipherSuites");
            if (this.f39707a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f39708b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(i... iVarArr) {
            qe.k.f(iVarArr, "cipherSuites");
            if (this.f39707a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (i iVar : iVarArr) {
                    arrayList.add(iVar.c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d(boolean z10) {
            if (this.f39707a) {
                this.f39710d = z10;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(String... strArr) {
            qe.k.f(strArr, "tlsVersions");
            if (this.f39707a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f39709c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(g0... g0VarArr) {
            qe.k.f(g0VarArr, "tlsVersions");
            if (this.f39707a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (g0 g0Var : g0VarArr) {
                    arrayList.add(g0Var.f());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return e((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(l lVar) {
            qe.k.f(lVar, "connectionSpec");
            this.f39707a = lVar.f();
            this.f39708b = lVar.f39705c;
            this.f39709c = lVar.f39706d;
            this.f39710d = lVar.h();
        }
    }

    /* compiled from: ConnectionSpec.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    static {
        new b(null);
        i iVar = i.f39692q;
        i iVar2 = i.f39693r;
        i iVar3 = i.f39694s;
        i iVar4 = i.f39686k;
        i iVar5 = i.f39688m;
        i iVar6 = i.f39687l;
        i iVar7 = i.f39689n;
        i iVar8 = i.f39691p;
        i iVar9 = i.f39690o;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f39698e = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.f39684i, i.f39685j, i.f39682g, i.f39683h, i.f39680e, i.f39681f, i.f39679d};
        f39699f = iVarArr2;
        a c10 = new a(true).c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        g0 g0Var = g0.TLS_1_3;
        g0 g0Var2 = g0.TLS_1_2;
        c10.f(g0Var, g0Var2).d(true).a();
        f39700g = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).f(g0Var, g0Var2).d(true).a();
        f39701h = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).f(g0Var, g0Var2, g0.TLS_1_1, g0.TLS_1_0).d(true).a();
        f39702i = new a(false).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f39703a = z10;
        this.f39704b = z11;
        this.f39705c = strArr;
        this.f39706d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        Comparator b10;
        if (this.f39705c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            qe.k.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = ze.c.B(enabledCipherSuites2, this.f39705c, i.f39695t.c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f39706d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            qe.k.e(enabledProtocols2, "sslSocket.enabledProtocols");
            String[] strArr = this.f39706d;
            b10 = he.b.b();
            enabledProtocols = ze.c.B(enabledProtocols2, strArr, b10);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        qe.k.e(supportedCipherSuites, "supportedCipherSuites");
        int u10 = ze.c.u(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f39695t.c());
        if (z10 && u10 != -1) {
            qe.k.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[u10];
            qe.k.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = ze.c.l(enabledCipherSuites, str);
        }
        a aVar = new a(this);
        qe.k.e(enabledCipherSuites, "cipherSuitesIntersection");
        a b11 = aVar.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        qe.k.e(enabledProtocols, "tlsVersionsIntersection");
        return b11.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final void c(SSLSocket sSLSocket, boolean z10) {
        qe.k.f(sSLSocket, "sslSocket");
        l g10 = g(sSLSocket, z10);
        if (g10.i() != null) {
            sSLSocket.setEnabledProtocols(g10.f39706d);
        }
        if (g10.d() != null) {
            sSLSocket.setEnabledCipherSuites(g10.f39705c);
        }
    }

    public final List<i> d() {
        List<i> N;
        String[] strArr = this.f39705c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(i.f39695t.b(str));
            }
            N = fe.x.N(arrayList);
            return N;
        }
        return null;
    }

    public final boolean e(SSLSocket sSLSocket) {
        Comparator b10;
        qe.k.f(sSLSocket, "socket");
        if (this.f39703a) {
            String[] strArr = this.f39706d;
            if (strArr != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                b10 = he.b.b();
                if (!ze.c.r(strArr, enabledProtocols, b10)) {
                    return false;
                }
            }
            String[] strArr2 = this.f39705c;
            return strArr2 == null || ze.c.r(strArr2, sSLSocket.getEnabledCipherSuites(), i.f39695t.c());
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (obj == this) {
                return true;
            }
            boolean z10 = this.f39703a;
            l lVar = (l) obj;
            if (z10 != lVar.f39703a) {
                return false;
            }
            return !z10 || (Arrays.equals(this.f39705c, lVar.f39705c) && Arrays.equals(this.f39706d, lVar.f39706d) && this.f39704b == lVar.f39704b);
        }
        return false;
    }

    public final boolean f() {
        return this.f39703a;
    }

    public final boolean h() {
        return this.f39704b;
    }

    public int hashCode() {
        if (this.f39703a) {
            String[] strArr = this.f39705c;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            String[] strArr2 = this.f39706d;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f39704b ? 1 : 0);
        }
        return 17;
    }

    public final List<g0> i() {
        List<g0> N;
        String[] strArr = this.f39706d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(g0.f39673h.a(str));
            }
            N = fe.x.N(arrayList);
            return N;
        }
        return null;
    }

    public String toString() {
        if (this.f39703a) {
            return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f39704b + ')';
        }
        return "ConnectionSpec()";
    }
}
