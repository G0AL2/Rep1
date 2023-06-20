package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.e.a.a;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: c  reason: collision with root package name */
    private static final String f27858c = "q";

    /* renamed from: a  reason: collision with root package name */
    private final Context f27859a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ironsource.sdk.e.a.a f27860b = new com.ironsource.sdk.e.a.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f27861a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f27862b;

        /* renamed from: c  reason: collision with root package name */
        String f27863c;

        /* renamed from: d  reason: collision with root package name */
        String f27864d;

        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    public q(Context context) {
        this.f27859a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, x.d.a aVar) {
        com.ironsource.sdk.e.a.a aVar2;
        JSONObject jSONObject = new JSONObject(str);
        a aVar3 = new a((byte) 0);
        aVar3.f27861a = jSONObject.optString("omidFunction");
        aVar3.f27862b = jSONObject.optJSONObject("omidParams");
        aVar3.f27863c = jSONObject.optString("success");
        aVar3.f27864d = jSONObject.optString("fail");
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f();
        JSONObject jSONObject2 = aVar3.f27862b;
        if (jSONObject2 != null) {
            String optString = jSONObject2.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                fVar.a("adViewId", optString);
            }
        }
        try {
            String str2 = aVar3.f27861a;
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals("activate")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -984459207:
                    if (str2.equals("getOmidData")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 70701699:
                    if (str2.equals("finishSession")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1208109646:
                    if (str2.equals("impressionOccurred")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1850541012:
                    if (str2.equals("startSession")) {
                        c10 = 1;
                        break;
                    }
                    break;
            }
            if (c10 != 0) {
                if (c10 == 1) {
                    com.ironsource.sdk.e.a.a aVar4 = this.f27860b;
                    a.C0351a a10 = a.C0351a.a(aVar3.f27862b);
                    if (!aVar4.f28098d) {
                        throw new IllegalStateException("OMID has not been activated");
                    }
                    if (TextUtils.isEmpty(a10.f28105g)) {
                        throw new IllegalStateException("Missing adview id in OMID params");
                    }
                    String str3 = a10.f28105g;
                    if (aVar4.f28097c.containsKey(str3)) {
                        throw new IllegalStateException("OMID Session has already started");
                    }
                    com.ironsource.sdk.c.e a11 = com.ironsource.sdk.c.d.a().a(str3);
                    if (a11 == null) {
                        throw new IllegalStateException("No adview found with the provided adViewId");
                    }
                    AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a10.f28104f, a10.f28103e, a10.f28100b, a10.f28101c, a10.f28099a), AdSessionContext.createHtmlAdSessionContext(aVar4.f28096b, a11.b(), null, a10.f28102d));
                    createAdSession.registerAdView(a11.b());
                    createAdSession.start();
                    aVar4.f28097c.put(str3, createAdSession);
                } else if (c10 == 2) {
                    com.ironsource.sdk.e.a.a aVar5 = this.f27860b;
                    JSONObject jSONObject3 = aVar3.f27862b;
                    aVar5.a(jSONObject3);
                    String optString2 = jSONObject3.optString("adViewId");
                    AdSession adSession = aVar5.f28097c.get(optString2);
                    if (adSession == null) {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                    adSession.finish();
                    aVar5.f28097c.remove(optString2);
                } else if (c10 == 3) {
                    com.ironsource.sdk.e.a.a aVar6 = this.f27860b;
                    JSONObject jSONObject4 = aVar3.f27862b;
                    aVar6.a(jSONObject4);
                    AdSession adSession2 = aVar6.f28097c.get(jSONObject4.optString("adViewId"));
                    if (adSession2 == null) {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                    AdEvents createAdEvents = AdEvents.createAdEvents(adSession2);
                    if (jSONObject4.optBoolean("signalLoaded")) {
                        createAdEvents.loaded();
                    }
                    createAdEvents.impressionOccurred();
                } else if (c10 != 4) {
                    throw new IllegalArgumentException(String.format("%s | unsupported OMID API", aVar3.f27861a));
                } else {
                    aVar2 = this.f27860b;
                }
                aVar.a(true, aVar3.f27863c, fVar);
            }
            com.ironsource.sdk.e.a.a aVar7 = this.f27860b;
            Context context = this.f27859a;
            if (!aVar7.f28098d) {
                Omid.activate(context);
                aVar7.f28098d = true;
            }
            aVar2 = this.f27860b;
            fVar = aVar2.a();
            aVar.a(true, aVar3.f27863c, fVar);
        } catch (Exception e10) {
            fVar.a("errMsg", e10.getMessage());
            String str4 = f27858c;
            Logger.i(str4, "OMIDJSAdapter " + aVar3.f27861a + " Exception: " + e10.getMessage());
            aVar.a(false, aVar3.f27864d, fVar);
        }
    }
}
