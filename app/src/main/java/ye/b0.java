package ye;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ye.t;
import ye.u;

/* compiled from: Request.kt */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private d f39549a;

    /* renamed from: b  reason: collision with root package name */
    private final u f39550b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39551c;

    /* renamed from: d  reason: collision with root package name */
    private final t f39552d;

    /* renamed from: e  reason: collision with root package name */
    private final c0 f39553e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, Object> f39554f;

    public b0(u uVar, String str, t tVar, c0 c0Var, Map<Class<?>, ? extends Object> map) {
        qe.k.f(uVar, ImagesContract.URL);
        qe.k.f(str, "method");
        qe.k.f(tVar, "headers");
        qe.k.f(map, "tags");
        this.f39550b = uVar;
        this.f39551c = str;
        this.f39552d = tVar;
        this.f39553e = c0Var;
        this.f39554f = map;
    }

    public final c0 a() {
        return this.f39553e;
    }

    public final d b() {
        d dVar = this.f39549a;
        if (dVar == null) {
            d b10 = d.f39600o.b(this.f39552d);
            this.f39549a = b10;
            return b10;
        }
        return dVar;
    }

    public final Map<Class<?>, Object> c() {
        return this.f39554f;
    }

    public final String d(String str) {
        qe.k.f(str, "name");
        return this.f39552d.a(str);
    }

    public final List<String> e(String str) {
        qe.k.f(str, "name");
        return this.f39552d.i(str);
    }

    public final t f() {
        return this.f39552d;
    }

    public final boolean g() {
        return this.f39550b.i();
    }

    public final String h() {
        return this.f39551c;
    }

    public final a i() {
        return new a(this);
    }

    public final Object j() {
        return k(Object.class);
    }

    public final <T> T k(Class<? extends T> cls) {
        qe.k.f(cls, "type");
        return cls.cast(this.f39554f.get(cls));
    }

    public final u l() {
        return this.f39550b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f39551c);
        sb2.append(", url=");
        sb2.append(this.f39550b);
        if (this.f39552d.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (ee.m<? extends String, ? extends String> mVar : this.f39552d) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    fe.n.o();
                }
                ee.m<? extends String, ? extends String> mVar2 = mVar;
                String a10 = mVar2.a();
                String b10 = mVar2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a10);
                sb2.append(':');
                sb2.append(b10);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.f39554f.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f39554f);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        qe.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* compiled from: Request.kt */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private u f39555a;

        /* renamed from: b  reason: collision with root package name */
        private String f39556b;

        /* renamed from: c  reason: collision with root package name */
        private t.a f39557c;

        /* renamed from: d  reason: collision with root package name */
        private c0 f39558d;

        /* renamed from: e  reason: collision with root package name */
        private Map<Class<?>, Object> f39559e;

        public a() {
            this.f39559e = new LinkedHashMap();
            this.f39556b = "GET";
            this.f39557c = new t.a();
        }

        public a a(String str, String str2) {
            qe.k.f(str, "name");
            qe.k.f(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f39557c.a(str, str2);
            return this;
        }

        public b0 b() {
            u uVar = this.f39555a;
            if (uVar != null) {
                return new b0(uVar, this.f39556b, this.f39557c.d(), this.f39558d, ze.c.S(this.f39559e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a c(d dVar) {
            qe.k.f(dVar, "cacheControl");
            String dVar2 = dVar.toString();
            return dVar2.length() == 0 ? i("Cache-Control") : e("Cache-Control", dVar2);
        }

        public a d() {
            return g("GET", null);
        }

        public a e(String str, String str2) {
            qe.k.f(str, "name");
            qe.k.f(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f39557c.h(str, str2);
            return this;
        }

        public a f(t tVar) {
            qe.k.f(tVar, "headers");
            this.f39557c = tVar.e();
            return this;
        }

        public a g(String str, c0 c0Var) {
            qe.k.f(str, "method");
            if (str.length() > 0) {
                if (c0Var == null) {
                    if (!(true ^ ef.f.e(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!ef.f.b(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f39556b = str;
                this.f39558d = c0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public a h(c0 c0Var) {
            qe.k.f(c0Var, "body");
            return g("POST", c0Var);
        }

        public a i(String str) {
            qe.k.f(str, "name");
            this.f39557c.g(str);
            return this;
        }

        public <T> a j(Class<? super T> cls, T t10) {
            qe.k.f(cls, "type");
            if (t10 == null) {
                this.f39559e.remove(cls);
            } else {
                if (this.f39559e.isEmpty()) {
                    this.f39559e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f39559e;
                T cast = cls.cast(t10);
                qe.k.c(cast);
                map.put(cls, cast);
            }
            return this;
        }

        public a k(Object obj) {
            return j(Object.class, obj);
        }

        public a l(String str) {
            qe.k.f(str, ImagesContract.URL);
            if (ve.g.w(str, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String substring = str.substring(3);
                qe.k.e(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                str = sb2.toString();
            } else if (ve.g.w(str, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String substring2 = str.substring(4);
                qe.k.e(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                str = sb3.toString();
            }
            return n(u.f39756l.d(str));
        }

        public a m(URL url) {
            qe.k.f(url, ImagesContract.URL);
            u.b bVar = u.f39756l;
            String url2 = url.toString();
            qe.k.e(url2, "url.toString()");
            return n(bVar.d(url2));
        }

        public a n(u uVar) {
            qe.k.f(uVar, ImagesContract.URL);
            this.f39555a = uVar;
            return this;
        }

        public a(b0 b0Var) {
            Map<Class<?>, Object> r10;
            qe.k.f(b0Var, "request");
            this.f39559e = new LinkedHashMap();
            this.f39555a = b0Var.l();
            this.f39556b = b0Var.h();
            this.f39558d = b0Var.a();
            if (b0Var.c().isEmpty()) {
                r10 = new LinkedHashMap<>();
            } else {
                r10 = fe.e0.r(b0Var.c());
            }
            this.f39559e = r10;
            this.f39557c = b0Var.f().e();
        }
    }
}
