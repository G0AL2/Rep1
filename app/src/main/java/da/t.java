package da;

import android.content.Context;
import android.net.Uri;
import com.applovin.sdk.AppLovinEventTypes;
import da.l;
import da.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultDataSource.java */
/* loaded from: classes2.dex */
public final class t implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f29282a;

    /* renamed from: b  reason: collision with root package name */
    private final List<m0> f29283b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final l f29284c;

    /* renamed from: d  reason: collision with root package name */
    private l f29285d;

    /* renamed from: e  reason: collision with root package name */
    private l f29286e;

    /* renamed from: f  reason: collision with root package name */
    private l f29287f;

    /* renamed from: g  reason: collision with root package name */
    private l f29288g;

    /* renamed from: h  reason: collision with root package name */
    private l f29289h;

    /* renamed from: i  reason: collision with root package name */
    private l f29290i;

    /* renamed from: j  reason: collision with root package name */
    private l f29291j;

    /* renamed from: k  reason: collision with root package name */
    private l f29292k;

    /* compiled from: DefaultDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f29293a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f29294b;

        /* renamed from: c  reason: collision with root package name */
        private m0 f29295c;

        public a(Context context) {
            this(context, new v.b());
        }

        @Override // da.l.a
        /* renamed from: b */
        public t a() {
            t tVar = new t(this.f29293a, this.f29294b.a());
            m0 m0Var = this.f29295c;
            if (m0Var != null) {
                tVar.l(m0Var);
            }
            return tVar;
        }

        public a(Context context, l.a aVar) {
            this.f29293a = context.getApplicationContext();
            this.f29294b = aVar;
        }
    }

    public t(Context context, l lVar) {
        this.f29282a = context.getApplicationContext();
        this.f29284c = (l) ea.a.e(lVar);
    }

    private void q(l lVar) {
        for (int i10 = 0; i10 < this.f29283b.size(); i10++) {
            lVar.l(this.f29283b.get(i10));
        }
    }

    private l r() {
        if (this.f29286e == null) {
            c cVar = new c(this.f29282a);
            this.f29286e = cVar;
            q(cVar);
        }
        return this.f29286e;
    }

    private l s() {
        if (this.f29287f == null) {
            h hVar = new h(this.f29282a);
            this.f29287f = hVar;
            q(hVar);
        }
        return this.f29287f;
    }

    private l t() {
        if (this.f29290i == null) {
            j jVar = new j();
            this.f29290i = jVar;
            q(jVar);
        }
        return this.f29290i;
    }

    private l u() {
        if (this.f29285d == null) {
            z zVar = new z();
            this.f29285d = zVar;
            q(zVar);
        }
        return this.f29285d;
    }

    private l v() {
        if (this.f29291j == null) {
            h0 h0Var = new h0(this.f29282a);
            this.f29291j = h0Var;
            q(h0Var);
        }
        return this.f29291j;
    }

    private l w() {
        if (this.f29288g == null) {
            try {
                l lVar = (l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f29288g = lVar;
                q(lVar);
            } catch (ClassNotFoundException unused) {
                ea.r.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f29288g == null) {
                this.f29288g = this.f29284c;
            }
        }
        return this.f29288g;
    }

    private l x() {
        if (this.f29289h == null) {
            n0 n0Var = new n0();
            this.f29289h = n0Var;
            q(n0Var);
        }
        return this.f29289h;
    }

    private void y(l lVar, m0 m0Var) {
        if (lVar != null) {
            lVar.l(m0Var);
        }
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws IOException {
        return ((l) ea.a.e(this.f29292k)).c(bArr, i10, i11);
    }

    @Override // da.l
    public void close() throws IOException {
        l lVar = this.f29292k;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f29292k = null;
            }
        }
    }

    @Override // da.l
    public Map<String, List<String>> e() {
        l lVar = this.f29292k;
        return lVar == null ? Collections.emptyMap() : lVar.e();
    }

    @Override // da.l
    public long g(p pVar) throws IOException {
        ea.a.f(this.f29292k == null);
        String scheme = pVar.f29227a.getScheme();
        if (ea.n0.w0(pVar.f29227a)) {
            String path = pVar.f29227a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f29292k = r();
            } else {
                this.f29292k = u();
            }
        } else if ("asset".equals(scheme)) {
            this.f29292k = r();
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            this.f29292k = s();
        } else if ("rtmp".equals(scheme)) {
            this.f29292k = w();
        } else if ("udp".equals(scheme)) {
            this.f29292k = x();
        } else if ("data".equals(scheme)) {
            this.f29292k = t();
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.f29292k = this.f29284c;
        } else {
            this.f29292k = v();
        }
        return this.f29292k.g(pVar);
    }

    @Override // da.l
    public void l(m0 m0Var) {
        ea.a.e(m0Var);
        this.f29284c.l(m0Var);
        this.f29283b.add(m0Var);
        y(this.f29285d, m0Var);
        y(this.f29286e, m0Var);
        y(this.f29287f, m0Var);
        y(this.f29288g, m0Var);
        y(this.f29289h, m0Var);
        y(this.f29290i, m0Var);
        y(this.f29291j, m0Var);
    }

    @Override // da.l
    public Uri o() {
        l lVar = this.f29292k;
        if (lVar == null) {
            return null;
        }
        return lVar.o();
    }
}
