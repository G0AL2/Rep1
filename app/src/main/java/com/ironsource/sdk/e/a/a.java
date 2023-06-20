package com.ironsource.sdk.e.a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.g.f;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28095a = Omid.getVersion();

    /* renamed from: b  reason: collision with root package name */
    public final Partner f28096b = Partner.createPartner("Ironsrc", "7");

    /* renamed from: d  reason: collision with root package name */
    public boolean f28098d = false;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, AdSession> f28097c = new HashMap<>();

    /* renamed from: com.ironsource.sdk.e.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0351a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f28099a;

        /* renamed from: b  reason: collision with root package name */
        public Owner f28100b;

        /* renamed from: c  reason: collision with root package name */
        public Owner f28101c;

        /* renamed from: d  reason: collision with root package name */
        public String f28102d;

        /* renamed from: e  reason: collision with root package name */
        public ImpressionType f28103e;

        /* renamed from: f  reason: collision with root package name */
        public CreativeType f28104f;

        /* renamed from: g  reason: collision with root package name */
        public String f28105g;

        public static C0351a a(JSONObject jSONObject) {
            C0351a c0351a = new C0351a();
            c0351a.f28099a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException("Missing OMID impressionOwner");
            }
            try {
                c0351a.f28100b = Owner.valueOf(optString.toUpperCase());
                String optString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(optString)) {
                    throw new IllegalArgumentException("Missing OMID videoEventsOwner");
                }
                try {
                    c0351a.f28101c = Owner.valueOf(optString2.toUpperCase());
                    c0351a.f28102d = jSONObject.optString("customReferenceData", "");
                    c0351a.f28104f = c(jSONObject);
                    c0351a.f28103e = b(jSONObject);
                    String optString3 = jSONObject.optString("adViewId", "");
                    if (TextUtils.isEmpty(optString3)) {
                        throw new IllegalArgumentException("Missing adview id in OMID params" + optString3);
                    }
                    c0351a.f28105g = optString3;
                    d(jSONObject);
                    return c0351a;
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                }
            } catch (IllegalArgumentException unused2) {
                throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
            }
        }

        private static ImpressionType b(JSONObject jSONObject) {
            ImpressionType[] values;
            String optString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (optString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        private static CreativeType c(JSONObject jSONObject) {
            CreativeType[] values;
            String optString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (optString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        private static Owner d(JSONObject jSONObject) {
            String optString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(optString.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return owner;
            }
        }
    }

    public final f a() {
        f fVar = new f();
        fVar.a("omidVersion", SDKUtils.encodeString(f28095a));
        fVar.a("omidPartnerName", SDKUtils.encodeString("Ironsrc"));
        fVar.a("omidPartnerVersion", SDKUtils.encodeString("7"));
        fVar.a("omidActiveAdSessions", SDKUtils.encodeString(Arrays.toString(this.f28097c.keySet().toArray())));
        return fVar;
    }

    public void a(JSONObject jSONObject) {
        if (!this.f28098d) {
            throw new IllegalStateException("OMID has not been activated");
        }
        if (jSONObject == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
