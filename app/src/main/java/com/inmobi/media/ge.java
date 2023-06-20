package com.inmobi.media;

import android.webkit.URLUtil;
import org.json.JSONObject;

/* compiled from: SignalsConfig.java */
@ik
/* loaded from: classes3.dex */
public class ge extends fr {
    public JSONObject ext;
    public b ice;
    public c unifiedIdServiceConfig;

    /* compiled from: SignalsConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class a {
        public boolean cce;
        public int cof;

        /* renamed from: oe  reason: collision with root package name */
        public boolean f25526oe;
        public boolean vce;

        private a() {
            this.cof = 0;
            this.f25526oe = false;
            this.vce = false;
            this.cce = false;
        }
    }

    /* compiled from: SignalsConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static class b {
        public int sampleInterval = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
        public int stopRequestTimeout = 3;
        public boolean locationEnabled = false;
        public boolean sessionEnabled = false;

        /* renamed from: w  reason: collision with root package name */
        public d f25528w = new d();

        /* renamed from: c  reason: collision with root package name */
        public a f25527c = new a();
    }

    /* compiled from: SignalsConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static class c {
        public boolean enabled = false;
        public String url = "https://unif-id.ssp.inmobi.com/fetch";
        public int maxRetries = 0;
        public int retryInterval = 0;
        public int timeout = 10;
    }

    /* compiled from: SignalsConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class d {
        public boolean cwe;
        public boolean vwe;
        public int wf;

        private d() {
            this.wf = 0;
            this.vwe = false;
            this.cwe = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ge(String str) {
        super(str);
        this.ice = new b();
        this.ext = null;
        this.unifiedIdServiceConfig = new c();
    }

    public static ij<ge> a() {
        return new ij<>();
    }

    @Override // com.inmobi.media.fr
    public String b() {
        return "signals";
    }

    @Override // com.inmobi.media.fr
    public JSONObject c() {
        return new ij().a((ij) this);
    }

    @Override // com.inmobi.media.fr
    public boolean d() {
        b bVar = this.ice;
        if (bVar.sampleInterval < 0 || bVar.stopRequestTimeout < 0 || bVar.f25528w.wf < 0 || bVar.f25527c.cof < 0 || !URLUtil.isValidUrl(this.unifiedIdServiceConfig.url)) {
            return false;
        }
        c cVar = this.unifiedIdServiceConfig;
        return cVar.maxRetries >= 0 && cVar.timeout >= 0 && cVar.retryInterval >= 0;
    }
}
