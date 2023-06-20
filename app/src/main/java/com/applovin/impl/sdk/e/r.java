package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class r extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinAdLoadListener f8441a;

    /* renamed from: c  reason: collision with root package name */
    private final a f8442c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends com.applovin.impl.a.e {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.m mVar) {
            super(jSONObject, jSONObject2, bVar, mVar);
        }

        void a(com.applovin.impl.sdk.utils.r rVar) {
            if (rVar == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f6751a.add(rVar);
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends r {

        /* renamed from: a  reason: collision with root package name */
        private final String f8443a;

        b(String str, com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            this.f8443a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a(e(this.f8443a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends r {

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f8444a;

        c(com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            this.f8444a = eVar.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.a.f fVar;
            if (com.applovin.impl.sdk.v.a()) {
                a("Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f8444a, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.v.a()) {
                    d("No VAST response received.");
                }
                fVar = com.applovin.impl.a.f.NO_WRAPPER_RESPONSE;
            } else if (string.length() < ((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.eh)).intValue()) {
                a(e(string));
                return;
            } else {
                if (com.applovin.impl.sdk.v.a()) {
                    d("VAST response is over max length");
                }
                fVar = com.applovin.impl.a.f.XML_PARSING;
            }
            a(fVar);
        }
    }

    /* loaded from: classes.dex */
    private static final class d extends r {

        /* renamed from: a  reason: collision with root package name */
        private final com.applovin.impl.sdk.utils.r f8445a;

        d(com.applovin.impl.sdk.utils.r rVar, com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            if (rVar == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (eVar == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f8445a = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.v.a()) {
                a("Processing VAST Wrapper response...");
            }
            a(this.f8445a);
        }
    }

    r(com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskProcessVastResponse", mVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f8441a = appLovinAdLoadListener;
        this.f8442c = (a) eVar;
    }

    public static r a(com.applovin.impl.sdk.utils.r rVar, com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        return new d(rVar, eVar, appLovinAdLoadListener, mVar);
    }

    public static r a(String str, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        return new b(str, new a(jSONObject, jSONObject2, bVar, mVar), appLovinAdLoadListener, mVar);
    }

    public static r a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        return new c(new a(jSONObject, jSONObject2, bVar, mVar), appLovinAdLoadListener, mVar);
    }

    void a(com.applovin.impl.a.f fVar) {
        if (com.applovin.impl.sdk.v.a()) {
            d("Failed to process VAST response due to VAST error code " + fVar);
        }
        com.applovin.impl.a.l.a(this.f8442c, this.f8441a, fVar, -6, this.f8349b);
    }

    void a(com.applovin.impl.sdk.utils.r rVar) {
        com.applovin.impl.a.f fVar;
        com.applovin.impl.sdk.e.a tVar;
        int a10 = this.f8442c.a();
        if (com.applovin.impl.sdk.v.a()) {
            a("Finished parsing XML at depth " + a10);
        }
        this.f8442c.a(rVar);
        if (!com.applovin.impl.a.l.a(rVar)) {
            if (com.applovin.impl.a.l.b(rVar)) {
                if (com.applovin.impl.sdk.v.a()) {
                    a("VAST response is inline. Rendering ad...");
                }
                tVar = new t(this.f8442c, this.f8441a, this.f8349b);
                this.f8349b.S().a(tVar);
                return;
            }
            if (com.applovin.impl.sdk.v.a()) {
                d("VAST response is an error");
            }
            fVar = com.applovin.impl.a.f.NO_WRAPPER_RESPONSE;
            a(fVar);
        }
        int intValue = ((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.ei)).intValue();
        if (a10 < intValue) {
            if (com.applovin.impl.sdk.v.a()) {
                a("VAST response is wrapper. Resolving...");
            }
            tVar = new x(this.f8442c, this.f8441a, this.f8349b);
            this.f8349b.S().a(tVar);
            return;
        }
        if (com.applovin.impl.sdk.v.a()) {
            d("Reached beyond max wrapper depth of " + intValue);
        }
        fVar = com.applovin.impl.a.f.WRAPPER_LIMIT_REACHED;
        a(fVar);
    }

    protected com.applovin.impl.sdk.utils.r e(String str) {
        try {
            return com.applovin.impl.sdk.utils.s.a(str, this.f8349b);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Failed to process VAST response", th);
            }
            a(com.applovin.impl.a.f.XML_PARSING);
            return null;
        }
    }
}
