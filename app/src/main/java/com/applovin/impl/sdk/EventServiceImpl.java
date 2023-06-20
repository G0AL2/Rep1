package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {

    /* renamed from: a  reason: collision with root package name */
    private final m f7968a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f7969b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f7970c = new AtomicBoolean();

    public EventServiceImpl(m mVar) {
        this.f7968a = mVar;
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.f8203be)).booleanValue()) {
            this.f7969b = JsonUtils.toStringObjectMap((String) mVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f8250t, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON), new HashMap());
            return;
        }
        this.f7969b = new HashMap();
        mVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f8250t, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        return ((String) this.f7968a.a(com.applovin.impl.sdk.c.b.aV)) + "4.0/pix";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(p pVar, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        boolean contains = this.f7968a.b(com.applovin.impl.sdk.c.b.f8201bc).contains(pVar.a());
        hashMap.put("AppLovin-Event", contains ? pVar.a() : "postinstall");
        if (!contains) {
            hashMap.put("AppLovin-Sub-Event", pVar.a());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(p pVar, boolean z10) {
        boolean contains = this.f7968a.b(com.applovin.impl.sdk.c.b.f8201bc).contains(pVar.a());
        Map<String, Object> a10 = this.f7968a.V().a(null, z10, false);
        a10.put("event", contains ? pVar.a() : "postinstall");
        a10.put("event_id", pVar.d());
        a10.put("ts", Long.toString(pVar.c()));
        if (!contains) {
            a10.put("sub_event", pVar.a());
        }
        return Utils.stringifyObjectMap(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return ((String) this.f7968a.a(com.applovin.impl.sdk.c.b.aW)) + "4.0/pix";
    }

    private void c() {
        if (((Boolean) this.f7968a.a(com.applovin.impl.sdk.c.b.f8203be)).booleanValue()) {
            this.f7968a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f8250t, (com.applovin.impl.sdk.c.d<String>) CollectionUtils.toJsonString(this.f7969b, JsonUtils.EMPTY_JSON));
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return new HashMap(this.f7969b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f7970c.compareAndSet(false, true)) {
            this.f7968a.w().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            if (v.a()) {
                v.i("AppLovinEventService", "Super property key cannot be null or empty");
                return;
            }
            return;
        }
        if (obj == null) {
            this.f7969b.remove(str);
        } else {
            List<String> b10 = this.f7968a.b(com.applovin.impl.sdk.c.b.f8202bd);
            if (!Utils.objectIsOfType(obj, b10, this.f7968a)) {
                if (v.a()) {
                    v.i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + b10);
                    return;
                }
                return;
            }
            this.f7969b.put(str, Utils.sanitizeSuperProperty(obj, this.f7968a));
        }
        c();
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap(1);
        hashMap.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, hashMap);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        if (v.a()) {
            v A = this.f7968a.A();
            A.b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final p pVar = new p(str, map, this.f7969b);
        try {
            this.f7968a.S().a(new com.applovin.impl.sdk.e.z(this.f7968a, new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    EventServiceImpl.this.f7968a.U().a(com.applovin.impl.sdk.network.h.o().c(EventServiceImpl.this.a()).d(EventServiceImpl.this.b()).a(EventServiceImpl.this.a(pVar, false)).b(EventServiceImpl.this.a(pVar, map2)).c(pVar.b()).b(((Boolean) EventServiceImpl.this.f7968a.a(com.applovin.impl.sdk.c.b.ey)).booleanValue()).a(((Boolean) EventServiceImpl.this.f7968a.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()).a());
                }
            }), o.a.BACKGROUND);
        } catch (Throwable th) {
            if (v.a()) {
                v A2 = this.f7968a.A();
                A2.b("AppLovinEventService", "Unable to track event: " + pVar, th);
            }
        }
    }

    public void trackEventSynchronously(String str) {
        if (v.a()) {
            v A = this.f7968a.A();
            A.b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        p pVar = new p(str, new HashMap(), this.f7969b);
        this.f7968a.U().a(com.applovin.impl.sdk.network.h.o().c(a()).d(b()).a(a(pVar, true)).b(a(pVar, (Map<String, String>) null)).c(pVar.b()).b(((Boolean) this.f7968a.a(com.applovin.impl.sdk.c.b.ey)).booleanValue()).a(((Boolean) this.f7968a.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        try {
            hashMap.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            hashMap.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            if (v.a()) {
                v.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            }
        }
        trackEvent("iap", hashMap);
    }
}
