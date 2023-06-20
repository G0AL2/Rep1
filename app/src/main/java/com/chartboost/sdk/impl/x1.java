package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.impl.l2;
import com.chartboost.sdk.impl.m0;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import fm.castbox.mediation.widget.AdView;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x1 {

    /* renamed from: j  reason: collision with root package name */
    private static final String f14403j = "x1";

    /* renamed from: k  reason: collision with root package name */
    private static Integer f14404k;

    /* renamed from: l  reason: collision with root package name */
    private static final String f14405l = Build.VERSION.RELEASE;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f14406a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f14407b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONArray f14408c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f14409d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f14410e;

    /* renamed from: f  reason: collision with root package name */
    private final JSONObject f14411f;

    /* renamed from: g  reason: collision with root package name */
    private final l2 f14412g;

    /* renamed from: h  reason: collision with root package name */
    private final b f14413h;

    /* renamed from: i  reason: collision with root package name */
    private final Context f14414i;

    public x1(Context context, l2 l2Var, b bVar) {
        this.f14414i = context;
        f14404k = i1.b(context);
        this.f14412g = l2Var;
        this.f14413h = bVar;
        this.f14407b = new JSONObject();
        this.f14408c = new JSONArray();
        this.f14409d = new JSONObject();
        this.f14410e = new JSONObject();
        this.f14411f = new JSONObject();
        this.f14406a = new JSONObject();
        m();
        j();
        k();
        i();
        l();
        n();
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        n0.a(jSONObject, "lat", JSONObject.NULL);
        n0.a(jSONObject, "lon", JSONObject.NULL);
        n0.a(jSONObject, ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.f14412g.f14154g);
        n0.a(jSONObject, "type", 2);
        return jSONObject;
    }

    private Integer b() {
        l2 l2Var = this.f14412g;
        if (l2Var != null) {
            return l2Var.g();
        }
        return null;
    }

    private int c() {
        l2 l2Var = this.f14412g;
        if (l2Var != null) {
            return l2Var.f();
        }
        return 0;
    }

    private Collection<DataUseConsent> d() {
        l2 l2Var = this.f14412g;
        if (l2Var != null) {
            return l2Var.l();
        }
        return new ArrayList();
    }

    private int e() {
        l2 l2Var = this.f14412g;
        if (l2Var != null) {
            return l2Var.h();
        }
        return 0;
    }

    private String g() {
        int i10 = this.f14413h.f13910a;
        if (i10 == 0) {
            CBLogging.b(f14403j, "INTERSTITIAL NOT COMPATIBLE WITH OPENRTB");
            return "interstitial";
        } else if (i10 != 1) {
            return i10 != 2 ? "" : AdView.AdType.BANNER;
        } else {
            CBLogging.b(f14403j, "REWARDED_VIDEO NOT COMPATIBLE WITH OPENRTB");
            return RNAdsEvents.EVENT_REWARDED;
        }
    }

    private Integer h() {
        int i10 = this.f14413h.f13910a;
        if (i10 != 0 && i10 != 1) {
            return 0;
        }
        return 1;
    }

    private void i() {
        n0.a(this.f14409d, "id", this.f14412g.f14159l);
        n0.a(this.f14409d, "name", JSONObject.NULL);
        n0.a(this.f14409d, "bundle", this.f14412g.f14157j);
        n0.a(this.f14409d, "storeurl", JSONObject.NULL);
        JSONObject jSONObject = new JSONObject();
        n0.a(jSONObject, "id", JSONObject.NULL);
        n0.a(jSONObject, "name", JSONObject.NULL);
        n0.a(this.f14409d, "publisher", jSONObject);
        n0.a(this.f14409d, "cat", JSONObject.NULL);
        n0.a(this.f14406a, "app", this.f14409d);
    }

    private void j() {
        m0.a c10 = this.f14412g.f14148a.c(this.f14414i);
        l2.a d10 = this.f14412g.d();
        n0.a(this.f14407b, "devicetype", f14404k);
        n0.a(this.f14407b, "w", Integer.valueOf(d10.f14168a));
        n0.a(this.f14407b, "h", Integer.valueOf(d10.f14169b));
        n0.a(this.f14407b, "ifa", c10.f14190d);
        n0.a(this.f14407b, "osv", f14405l);
        n0.a(this.f14407b, "lmt", Integer.valueOf(c10.a().booleanValue() ? 1 : 0));
        n0.a(this.f14407b, "connectiontype", Integer.valueOf(this.f14412g.f14149b.c()));
        n0.a(this.f14407b, "os", "Android");
        n0.a(this.f14407b, "geo", a());
        n0.a(this.f14407b, "ip", JSONObject.NULL);
        n0.a(this.f14407b, "language", this.f14412g.f14155h);
        n0.a(this.f14407b, "ua", com.chartboost.sdk.g.f13892q);
        n0.a(this.f14407b, "model", this.f14412g.f14152e);
        n0.a(this.f14407b, "carrier", this.f14412g.f14163p);
        n0.a(this.f14407b, "ext", a(c10));
        n0.a(this.f14406a, "device", this.f14407b);
    }

    private void k() {
        JSONObject jSONObject = new JSONObject();
        n0.a(jSONObject, "id", JSONObject.NULL);
        JSONObject jSONObject2 = new JSONObject();
        n0.a(jSONObject2, "w", this.f14413h.f13912c);
        n0.a(jSONObject2, "h", this.f14413h.f13911b);
        n0.a(jSONObject2, "btype", JSONObject.NULL);
        n0.a(jSONObject2, "battr", JSONObject.NULL);
        n0.a(jSONObject2, "pos", JSONObject.NULL);
        n0.a(jSONObject2, "topframe", JSONObject.NULL);
        n0.a(jSONObject2, "api", JSONObject.NULL);
        JSONObject jSONObject3 = new JSONObject();
        n0.a(jSONObject3, "placementtype", g());
        n0.a(jSONObject3, "playableonly", JSONObject.NULL);
        n0.a(jSONObject3, "allowscustomclosebutton", JSONObject.NULL);
        n0.a(jSONObject2, "ext", jSONObject3);
        n0.a(jSONObject, AdView.AdType.BANNER, jSONObject2);
        n0.a(jSONObject, "instl", h());
        n0.a(jSONObject, "tagid", this.f14413h.f13913d);
        n0.a(jSONObject, "displaymanager", "Chartboost-Android-SDK");
        n0.a(jSONObject, "displaymanagerver", this.f14412g.f14158k);
        n0.a(jSONObject, "bidfloor", JSONObject.NULL);
        n0.a(jSONObject, "bidfloorcur", "USD");
        n0.a(jSONObject, "secure", 1);
        this.f14408c.put(jSONObject);
        n0.a(this.f14406a, "imp", this.f14408c);
    }

    private void l() {
        Integer b10 = b();
        if (b10 != null) {
            n0.a(this.f14410e, COPPA.COPPA_STANDARD, b10);
        }
        JSONObject jSONObject = new JSONObject();
        n0.a(jSONObject, "gdpr", Integer.valueOf(e()));
        for (DataUseConsent dataUseConsent : d()) {
            if (!dataUseConsent.getPrivacyStandard().equals(COPPA.COPPA_STANDARD)) {
                n0.a(jSONObject, dataUseConsent.getPrivacyStandard(), dataUseConsent.getConsent());
            }
        }
        n0.a(this.f14410e, "ext", jSONObject);
        n0.a(this.f14406a, "regs", this.f14410e);
    }

    private void m() {
        n0.a(this.f14406a, "id", JSONObject.NULL);
        n0.a(this.f14406a, "test", JSONObject.NULL);
        n0.a(this.f14406a, "cur", new JSONArray().put("USD"));
        n0.a(this.f14406a, "at", 2);
    }

    private void n() {
        n0.a(this.f14411f, "id", JSONObject.NULL);
        n0.a(this.f14411f, "geo", a());
        JSONObject jSONObject = new JSONObject();
        n0.a(jSONObject, "consent", Integer.valueOf(c()));
        n0.a(jSONObject, "impdepth", Integer.valueOf(this.f14413h.f13914e));
        n0.a(this.f14411f, "ext", jSONObject);
        n0.a(this.f14406a, "user", this.f14411f);
    }

    public JSONObject f() {
        return this.f14406a;
    }

    private JSONObject a(m0.a aVar) {
        JSONObject jSONObject = new JSONObject();
        String str = aVar.f14191e;
        if (str != null) {
            n0.a(jSONObject, "appsetid", str);
        }
        Integer num = aVar.f14192f;
        if (num != null) {
            n0.a(jSONObject, "appsetidscope", num);
        }
        return jSONObject;
    }
}
