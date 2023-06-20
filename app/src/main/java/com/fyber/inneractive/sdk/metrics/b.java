package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.h;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.s;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b<T extends com.fyber.inneractive.sdk.response.e> extends com.fyber.inneractive.sdk.metrics.a {

    /* renamed from: g  reason: collision with root package name */
    public static final String f17359g = String.valueOf(24);

    /* renamed from: h  reason: collision with root package name */
    public static final String f17360h = String.valueOf(3);

    /* renamed from: i  reason: collision with root package name */
    public static final String f17361i = String.valueOf(24);

    /* renamed from: j  reason: collision with root package name */
    public static final String f17362j = String.valueOf(3);

    /* renamed from: b  reason: collision with root package name */
    public final String f17363b;

    /* renamed from: c  reason: collision with root package name */
    public final UnitDisplayType f17364c;

    /* renamed from: d  reason: collision with root package name */
    public final T f17365d;

    /* renamed from: e  reason: collision with root package name */
    public final InneractiveAdRequest f17366e;

    /* renamed from: f  reason: collision with root package name */
    public final JSONArray f17367f;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f17368a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Map f17369b;

        public a(f fVar, Map map) {
            this.f17368a = fVar;
            this.f17369b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnitDisplayType unitDisplayType;
            int a10;
            int a11;
            String str;
            IAlog.a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
            b bVar = b.this;
            if (bVar.f17363b == null || (unitDisplayType = bVar.f17364c) == null) {
                return;
            }
            UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
            if (unitDisplayType != unitDisplayType2 && unitDisplayType != UnitDisplayType.MRECT && !unitDisplayType.isFullscreenUnit()) {
                IAlog.a("Unit display type %s is not supported for metric event", b.this.f17364c.value());
                return;
            }
            IAlog.a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f17368a.toString());
            UnitDisplayType unitDisplayType3 = b.this.f17364c;
            if (unitDisplayType3 != unitDisplayType2 && unitDisplayType3 != UnitDisplayType.MRECT) {
                IAConfigManager iAConfigManager = IAConfigManager.J;
                h hVar = iAConfigManager.f16886v.f16987b;
                String str2 = b.f17361i;
                if (hVar.f16984a.containsKey("ad_metrics_interval_interstitial")) {
                    str2 = hVar.f16984a.get("ad_metrics_interval_interstitial");
                }
                h hVar2 = iAConfigManager.f16886v.f16987b;
                String str3 = b.f17362j;
                if (hVar2.f16984a.containsKey("ad_metrics_limit_interstitial")) {
                    str3 = hVar2.f16984a.get("ad_metrics_limit_interstitial");
                }
                a10 = s.a(str2, 24);
                a11 = s.a(str3, 3);
                str = "LastSentMetricsInterstitial";
            } else {
                IAConfigManager iAConfigManager2 = IAConfigManager.J;
                h hVar3 = iAConfigManager2.f16886v.f16987b;
                String str4 = b.f17359g;
                if (hVar3.f16984a.containsKey("ad_metrics_interval_banner")) {
                    str4 = hVar3.f16984a.get("ad_metrics_interval_banner");
                }
                h hVar4 = iAConfigManager2.f16886v.f16987b;
                String str5 = b.f17360h;
                if (hVar4.f16984a.containsKey("ad_metrics_limit_banner")) {
                    str5 = hVar4.f16984a.get("ad_metrics_limit_banner");
                }
                a10 = s.a(str4, 24);
                a11 = s.a(str5, 3);
                str = "LastSentMetricsBanner";
            }
            Application application = l.f20301a;
            if (application != null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
                JSONArray jSONArray = new JSONArray();
                try {
                    jSONArray = new JSONArray(sharedPreferences.getString(str, "[]"));
                } catch (JSONException unused) {
                }
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                b bVar2 = b.this;
                bVar2.getClass();
                if (IAConfigManager.J.f16886v.f16987b.a(bVar2.f17358a, false) && !com.fyber.inneractive.sdk.metrics.a.a(a10, a11, jSONArray, copyOnWriteArrayList)) {
                    copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                    b bVar3 = b.this;
                    InneractiveAdRequest inneractiveAdRequest = bVar3.f17366e;
                    T t10 = bVar3.f17365d;
                    Map map = this.f17369b;
                    try {
                        p pVar = p.METRIC_MEASUREMENTS_EVENT;
                        JSONArray jSONArray2 = bVar3.f17367f;
                        q.a aVar = new q.a(t10);
                        aVar.f17683c = pVar;
                        aVar.f17681a = inneractiveAdRequest;
                        aVar.f17684d = jSONArray2;
                        JSONObject jSONObject = new JSONObject();
                        for (String str6 : map.keySet()) {
                            Object obj = map.get(str6);
                            try {
                                jSONObject.put(str6, obj);
                            } catch (Exception unused2) {
                                IAlog.e("Got exception adding param to json object: %s, %s", str6, obj);
                            }
                        }
                        aVar.f17686f.put(jSONObject);
                        aVar.a((String) null);
                    } catch (Exception unused3) {
                    }
                }
                sharedPreferences.edit().putString(str, new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
            }
        }
    }

    public b(T t10, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f17365d = t10;
        this.f17366e = inneractiveAdRequest;
        this.f17363b = str;
        this.f17364c = unitDisplayType;
        this.f17367f = jSONArray;
    }

    public void a() {
        c cVar = c.f17371c;
        f a10 = cVar.a(this.f17363b);
        Map<String, Long> j10 = a10.j();
        if (!a10.a()) {
            IAlog.a("MetricCreativeReporter: Metric data not valid, data: %s", cVar.a(this.f17363b).toString());
            return;
        }
        cVar.f17372a.remove(this.f17363b);
        n.a(new a(a10, j10));
    }
}
