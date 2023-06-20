package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.network.b0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.inmobi.media.jh;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e0<T> implements b0<T> {

    /* renamed from: b  reason: collision with root package name */
    public final u<T> f17550b;

    /* renamed from: c  reason: collision with root package name */
    public g f17551c;

    /* renamed from: d  reason: collision with root package name */
    public b0.a f17552d;

    /* renamed from: e  reason: collision with root package name */
    public j f17553e;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f17549a = false;

    /* renamed from: f  reason: collision with root package name */
    public volatile m0 f17554f = m0.INITIAL;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f17555a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Exception f17556b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f17557c;

        public a(Object obj, Exception exc, boolean z10) {
            this.f17555a = obj;
            this.f17556b = exc;
            this.f17557c = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            e0.this.f17550b.a(this.f17555a, this.f17556b, this.f17557c);
        }
    }

    public e0(u<T> uVar, g gVar) {
        this.f17550b = uVar;
        this.f17551c = gVar;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public void a(a0 a0Var, String str, String str2) {
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public void a(T t10, Exception exc, boolean z10) {
        com.fyber.inneractive.sdk.util.n.f20310b.post(new a(t10, exc, z10));
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public void b() {
        try {
            j jVar = this.f17553e;
            if (jVar != null) {
                jVar.a();
            }
            this.f17551c.b();
        } catch (Exception unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public String c() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public boolean e() {
        return this.f17549a;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public com.fyber.inneractive.sdk.network.a<T> g() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public com.fyber.inneractive.sdk.config.global.s h() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public o0 i() {
        IAConfigManager iAConfigManager = IAConfigManager.J;
        return new o0(iAConfigManager.f16886v.f16987b.a("connect_timeout", jh.DEFAULT_BITMAP_TIMEOUT, 1), iAConfigManager.f16886v.f16987b.a("read_timeout", jh.DEFAULT_BITMAP_TIMEOUT, 1));
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public byte[] k() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public m0 l() {
        return this.f17554f;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public String m() {
        return "application/json; charset=utf-8";
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public Map<String, String> q() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public j a(String str) throws Exception {
        try {
            b0.a aVar = this.f17552d;
            if (aVar != null) {
                aVar.a("sdkInitNetworkRequest");
            }
            this.f17553e = this.f17551c.a(this, com.fyber.inneractive.sdk.util.l.f(), str);
            b0.a aVar2 = this.f17552d;
            if (aVar2 != null) {
                aVar2.a("sdkGotServerResponse");
            }
            return this.f17553e;
        } catch (b e10) {
            IAlog.a("failed start network request", e10, new Object[0]);
            throw e10;
        } catch (q0 e11) {
            IAlog.a("failed read network response", e11, new Object[0]);
            throw e11;
        } catch (Exception e12) {
            IAlog.a("failed start network request", e12, new Object[0]);
            throw e12;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public void a(m0 m0Var) {
        this.f17554f = m0Var;
    }

    public com.fyber.inneractive.sdk.response.e a(int i10, m mVar, com.fyber.inneractive.sdk.response.j jVar, com.fyber.inneractive.sdk.dv.g gVar) throws Exception {
        try {
            com.fyber.inneractive.sdk.response.a a10 = com.fyber.inneractive.sdk.response.a.a(i10);
            if (a10 == null) {
                a10 = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.response.b a11 = b.a.f17184a.a(a10);
            if (a11 == null) {
                IAlog.e("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i10));
                if (b.a.f17184a.f17183a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new z("Could not find parser for ad type " + i10);
            }
            IAlog.a("Received ad type %s - Got parser! %s", Integer.valueOf(i10), a11);
            if (jVar != null) {
                a11.f20152c = jVar;
            }
            a11.f20150a = a11.a();
            if (mVar != null) {
                a11.f20152c = new com.fyber.inneractive.sdk.response.k(mVar);
            }
            com.fyber.inneractive.sdk.response.e a12 = a11.a((String) null);
            if (gVar != null) {
                a12.f20178s = gVar;
            }
            b0.a aVar = this.f17552d;
            if (aVar != null) {
                aVar.a("sdkParsedResponse");
            }
            return a12;
        } catch (Exception e10) {
            IAlog.a("failed parse ad network request", e10, new Object[0]);
            throw new z(e10);
        }
    }
}
