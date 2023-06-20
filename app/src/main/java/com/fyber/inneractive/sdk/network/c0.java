package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.inmobi.media.jh;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c0 extends e0<com.fyber.inneractive.sdk.response.e> implements m {

    /* renamed from: g  reason: collision with root package name */
    public final InneractiveAdRequest f17535g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, String> f17536h;

    /* renamed from: i  reason: collision with root package name */
    public StringBuffer f17537i;

    /* renamed from: j  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f17538j;

    /* renamed from: k  reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.g f17539k;

    /* renamed from: l  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.s f17540l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f17541m;

    public c0(u<com.fyber.inneractive.sdk.response.e> uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.s sVar) {
        this(uVar, inneractiveAdRequest, new com.fyber.inneractive.sdk.serverapi.b(sVar), v.b().a(), sVar);
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public String a() {
        int i10 = com.fyber.inneractive.sdk.config.e.f16935a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String a10 = TextUtils.isEmpty(property) ? "https://" + IAConfigManager.J.f16873i.f17013f : com.fyber.inneractive.sdk.config.a.a(property, "clientRequestEnhancedXmlAd");
        InneractiveAdRequest inneractiveAdRequest = this.f17535g;
        com.fyber.inneractive.sdk.serverapi.c cVar = this.f17538j;
        d0 d0Var = new d0(inneractiveAdRequest, cVar);
        d0Var.f17545c = new HashMap();
        d0Var.a("fromSDK", Boolean.toString(true));
        d0Var.a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        d0Var.a("secure", (com.fyber.inneractive.sdk.util.r.a() ^ true) || IAConfigManager.J.f16882r ? "1" : "0");
        d0Var.a("spotid", inneractiveAdRequest.getSpotId());
        String property2 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property2 == null) {
            property2 = inneractiveAdRequest.getSelectedUnitConfig() == null ? null : ((com.fyber.inneractive.sdk.config.y) inneractiveAdRequest.getSelectedUnitConfig()).f17072a;
        }
        d0Var.a("uid", property2);
        IAConfigManager iAConfigManager = IAConfigManager.J;
        if (!TextUtils.isEmpty(iAConfigManager.f16879o)) {
            d0Var.a("med", String.format("%s_%s", iAConfigManager.f16877m, iAConfigManager.f16879o));
        } else {
            d0Var.a("med", iAConfigManager.f16877m);
        }
        cVar.getClass();
        d0Var.a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        com.fyber.inneractive.sdk.serverapi.b bVar = (com.fyber.inneractive.sdk.serverapi.b) cVar;
        List<Integer> list = com.fyber.inneractive.sdk.serverapi.b.f20192e;
        if (!list.isEmpty()) {
            d0Var.a("protocols", com.fyber.inneractive.sdk.util.l.a(",", list));
        }
        List<String> list2 = com.fyber.inneractive.sdk.serverapi.b.f20193f;
        if (!list2.isEmpty()) {
            d0Var.a("mimes", com.fyber.inneractive.sdk.util.l.b(",", list2));
        }
        List<Integer> list3 = com.fyber.inneractive.sdk.serverapi.b.f20191d;
        if (!list3.isEmpty()) {
            d0Var.a("api", com.fyber.inneractive.sdk.util.l.a(",", list3));
        }
        d0Var.a("a", Integer.toString(iAConfigManager.f16874j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.f16874j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            d0Var.a("g", InneractiveMediationDefs.GENDER_MALE);
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            d0Var.a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        d0Var.a("zip", iAConfigManager.f16874j.getZipCode());
        d0Var.a("k", iAConfigManager.f16875k);
        d0Var.a("t", Long.toString(System.currentTimeMillis()));
        d0Var.a("v", bVar.a("2.2.0"));
        Boolean a11 = iAConfigManager.D.a();
        if (a11 != null) {
            d0Var.a("gdpr_privacy_consent", a11.booleanValue() ? "1" : "0");
        }
        com.fyber.inneractive.sdk.config.d dVar = iAConfigManager.D;
        dVar.getClass();
        Boolean bool = com.fyber.inneractive.sdk.util.l.f20301a == null ? null : dVar.f16928f;
        if (bool != null) {
            d0Var.a("lgpd_consent", bool.booleanValue() ? "1" : "0");
        }
        String property3 = System.getProperty("ia.testEnvironmentConfiguration.device");
        String str = com.fyber.inneractive.sdk.config.k.b() ? "amazonId" : "aaid";
        if (TextUtils.isEmpty(property3)) {
            property3 = com.fyber.inneractive.sdk.config.k.a();
        }
        d0Var.a(str, property3);
        d0Var.a("dnt", Boolean.toString(com.fyber.inneractive.sdk.config.k.c()));
        d0Var.a("dml", bVar.b());
        int c10 = com.fyber.inneractive.sdk.util.l.c(com.fyber.inneractive.sdk.util.l.e());
        int c11 = com.fyber.inneractive.sdk.util.l.c(com.fyber.inneractive.sdk.util.l.d());
        if (c10 > 0 && c11 > 0) {
            d0Var.a("w", Integer.toString(c10));
            d0Var.a("h", Integer.toString(c11));
        }
        int c12 = com.fyber.inneractive.sdk.util.l.c();
        d0Var.a("o", c12 == 1 ? "p" : c12 == 2 ? "l" : "u");
        if (bVar.n() && iAConfigManager.f16883s) {
            d0Var.a("lg", bVar.d() + "," + bVar.e());
            d0Var.a("hacc", bVar.c());
            d0Var.a("vacc", bVar.g());
            d0Var.a("tacc", bVar.f());
        }
        d0Var.a("ciso", com.fyber.inneractive.sdk.util.k.g());
        d0Var.a("os", "Android");
        d0Var.a("mcc", bVar.h());
        d0Var.a("mnc", bVar.i());
        d0Var.a("nt", com.fyber.inneractive.sdk.util.k0.f().f20300a);
        d0Var.a("crn", bVar.a());
        d0Var.a("lng", iAConfigManager.f16880p);
        List<String> list4 = iAConfigManager.f16881q;
        if (list4 != null && !list4.isEmpty()) {
            d0Var.a("in_lng", com.fyber.inneractive.sdk.util.l.b(",", list4));
        }
        d0Var.a("bid", com.fyber.inneractive.sdk.util.l.f20301a.getPackageName());
        d0Var.a("appv", bVar.k());
        com.fyber.inneractive.sdk.config.d dVar2 = iAConfigManager.D;
        dVar2.getClass();
        d0Var.a("gdpr_consent_data", com.fyber.inneractive.sdk.util.l.f20301a == null ? null : dVar2.f16924b);
        com.fyber.inneractive.sdk.config.d dVar3 = iAConfigManager.D;
        dVar3.getClass();
        d0Var.a(CCPA.CCPA_STANDARD, com.fyber.inneractive.sdk.util.l.f20301a == null ? null : dVar3.f16927e);
        d0Var.a("mute_video", Boolean.toString(iAConfigManager.f16876l));
        d0Var.a("osv", Build.VERSION.RELEASE);
        HashMap hashMap = new HashMap();
        bVar.a(hashMap, inneractiveAdRequest.getSpotId());
        for (Map.Entry entry : hashMap.entrySet()) {
            d0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        Map<String, String> map = d0Var.f17545c;
        StringBuilder sb2 = new StringBuilder(a10);
        boolean z10 = true;
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            sb2.append(z10 ? "?" : "&");
            sb2.append(entry2.getKey());
            sb2.append("=");
            sb2.append(Uri.encode(entry2.getValue()));
            z10 = false;
        }
        String sb3 = sb2.toString();
        if (!this.f17541m) {
            int i11 = IAlog.f20222a;
            IAlog.a(1, null, "%s %s", "AD_REQUEST", sb3);
            this.f17541m = true;
        }
        return sb3;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public StringBuffer d() {
        return this.f17537i;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public l0 f() {
        return l0.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.e0, com.fyber.inneractive.sdk.network.b0
    public com.fyber.inneractive.sdk.config.global.s h() {
        return this.f17540l;
    }

    @Override // com.fyber.inneractive.sdk.network.e0, com.fyber.inneractive.sdk.network.b0
    public o0 i() {
        com.fyber.inneractive.sdk.config.global.features.a aVar;
        com.fyber.inneractive.sdk.config.global.s sVar = this.f17540l;
        if (sVar != null && (aVar = (com.fyber.inneractive.sdk.config.global.features.a) sVar.a(com.fyber.inneractive.sdk.config.global.features.a.class)) != null) {
            Integer b10 = aVar.b("connect_timeout");
            int i10 = jh.DEFAULT_BITMAP_TIMEOUT;
            int max = Math.max(b10 != null ? b10.intValue() : jh.DEFAULT_BITMAP_TIMEOUT, 1);
            Integer b11 = aVar.b("read_timeout");
            if (b11 != null) {
                i10 = b11.intValue();
            }
            return new o0(max, Math.max(i10, 1));
        }
        return super.i();
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public boolean j() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.e0, com.fyber.inneractive.sdk.network.b0
    public byte[] k() {
        byte[] bArr = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            com.fyber.inneractive.sdk.config.global.s sVar = ((com.fyber.inneractive.sdk.serverapi.b) this.f17538j).f20194a;
            JSONArray d10 = sVar != null ? sVar.d() : null;
            if (d10 != null && d10.length() > 0) {
                jSONObject2.put("experiments", d10);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType a10 = com.fyber.inneractive.sdk.serverapi.a.a(this.f17535g.getSpotId());
            IAConfigManager iAConfigManager = IAConfigManager.J;
            JSONArray a11 = iAConfigManager.f16888x.a(a10);
            if (a11 != null && a11.length() > 0) {
                jSONObject.put("user_sessions", a11);
            }
            int a12 = iAConfigManager.f16886v.f16987b.a("dv_enabled", 0, 0);
            if (a10 != null && a12 == 1) {
                com.fyber.inneractive.sdk.dv.g a13 = iAConfigManager.E.a(a10);
                this.f17539k = a13;
                if (a13 != null) {
                    jSONObject.put("gdem_signal", a13.f17095a.getQuery());
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            } else {
                bArr = jSONObject.toString().getBytes("UTF-8");
            }
            IAlog.a("request json body - %s", jSONObject.toString());
        } catch (Exception unused) {
            IAlog.a("Failed building body for ad request!", new Object[0]);
        }
        return bArr;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public y n() {
        return y.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public Map<String, String> o() {
        return this.f17536h;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public int p() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.e0, com.fyber.inneractive.sdk.network.b0
    public Map<String, String> q() {
        int i10 = com.fyber.inneractive.sdk.config.e.f16935a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mockadnetworkresponseid", property);
        IAlog.a("NetworkRequestAd: Adding mock response header - %s", property);
        return hashMap;
    }

    public c0(u<com.fyber.inneractive.sdk.response.e> uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.serverapi.c cVar, g gVar, com.fyber.inneractive.sdk.config.global.s sVar) {
        super(uVar, gVar);
        this.f17539k = null;
        this.f17541m = false;
        this.f17540l = sVar;
        this.f17535g = inneractiveAdRequest;
        this.f17538j = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[Catch: Exception -> 0x0081, TryCatch #1 {Exception -> 0x0081, blocks: (B:23:0x0052, B:25:0x0056, B:27:0x0068, B:32:0x0072, B:34:0x0078), top: B:41:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, com.fyber.inneractive.sdk.response.e] */
    @Override // com.fyber.inneractive.sdk.network.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.network.a0 a(java.io.InputStream r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, int r8) throws java.lang.Exception {
        /*
            r5 = this;
            r8 = 0
            if (r7 == 0) goto L3a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L10
            java.lang.Object r3 = r7.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L10
            int r4 = r3.size()
            if (r4 <= 0) goto L10
            java.lang.String r2 = r2.toLowerCase()
            java.lang.Object r3 = r3.get(r8)
            r0.put(r2, r3)
            goto L10
        L38:
            r5.f17536h = r0
        L3a:
            r7 = 0
            if (r6 == 0) goto L4d
            java.lang.StringBuffer r6 = com.fyber.inneractive.sdk.util.s.a(r6, r8)     // Catch: java.lang.Exception -> L42
            goto L4b
        L42:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "failed create response builder in network request ad"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r6, r0)
            r6 = r7
        L4b:
            r5.f17537i = r6
        L4d:
            com.fyber.inneractive.sdk.network.a0 r6 = new com.fyber.inneractive.sdk.network.a0
            r6.<init>()
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f17536h     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L6f
            java.lang.String r1 = "X-IA-Ad-Type"
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Exception -> L81
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L81
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L81
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L81
            if (r1 != 0) goto L6f
            boolean r1 = android.text.TextUtils.isDigitsOnly(r0)     // Catch: java.lang.Exception -> L81
            if (r1 == 0) goto L6f
            goto L70
        L6f:
            r0 = r7
        L70:
            if (r0 == 0) goto L77
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L81
            goto L78
        L77:
            r0 = 6
        L78:
            com.fyber.inneractive.sdk.dv.g r1 = r5.f17539k     // Catch: java.lang.Exception -> L81
            com.fyber.inneractive.sdk.response.e r7 = r5.a(r0, r5, r7, r1)     // Catch: java.lang.Exception -> L81
            r6.f17523a = r7     // Catch: java.lang.Exception -> L81
            return r6
        L81:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r8 = "failed parse ad network request"
            com.fyber.inneractive.sdk.util.IAlog.a(r8, r6, r7)
            com.fyber.inneractive.sdk.network.z r7 = new com.fyber.inneractive.sdk.network.z
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.c0.a(java.io.InputStream, java.util.Map, int):com.fyber.inneractive.sdk.network.a0");
    }
}
