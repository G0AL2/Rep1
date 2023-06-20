package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q extends k {

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f17696a = new JSONObject();

        public b a(String str, Object obj) {
            try {
                this.f17696a.put(str, obj);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", str, obj);
            }
            return this;
        }
    }

    public q(String str, String str2, String str3, Long l10, String str4, String str5, String str6, String str7) {
        super(com.fyber.inneractive.sdk.config.a.b());
        a("osn", "Android");
        a("osv", Build.VERSION.RELEASE);
        a("model", com.fyber.inneractive.sdk.util.k.h());
        a("sdkv", str7 == null ? "8.1.5" : str7);
        a("pkgn", com.fyber.inneractive.sdk.util.k.k());
        a("pkgv", com.fyber.inneractive.sdk.util.k.l());
        a("appid", str);
        a("session", str2);
        a("adnt", str3);
        a("adnt_id", l10);
        a("creative_id", str4);
        a("adomain", str5);
        a("campaign_id", str6);
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: h  reason: collision with root package name */
        public static final SimpleDateFormat f17680h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

        /* renamed from: a  reason: collision with root package name */
        public InneractiveAdRequest f17681a;

        /* renamed from: b  reason: collision with root package name */
        public o f17682b;

        /* renamed from: c  reason: collision with root package name */
        public p f17683c;

        /* renamed from: d  reason: collision with root package name */
        public JSONArray f17684d;

        /* renamed from: e  reason: collision with root package name */
        public com.fyber.inneractive.sdk.response.e f17685e;

        /* renamed from: f  reason: collision with root package name */
        public JSONArray f17686f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f17687g;

        /* renamed from: com.fyber.inneractive.sdk.network.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0238a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ q f17688a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ String f17689b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ String f17690c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ String f17691d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ String f17692e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Object f17693f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ String f17694g;

            public RunnableC0238a(q qVar, String str, String str2, String str3, String str4, Object obj, String str5) {
                this.f17688a = qVar;
                this.f17689b = str;
                this.f17690c = str2;
                this.f17691d = str3;
                this.f17692e = str4;
                this.f17693f = obj;
                this.f17694g = str5;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                String valueOf;
                Map<String, Object> map;
                this.f17688a.a("contentid", this.f17689b);
                this.f17688a.a("fairbidv", this.f17690c);
                a aVar = a.this;
                o oVar = aVar.f17682b;
                if (oVar != null) {
                    this.f17688a.a("err", Integer.valueOf(oVar.f17650a));
                    a.this.f17682b.getClass();
                    IAlog.a("Event dispatcher - dispatching error: %s", a.this.f17682b);
                    int i10 = IAlog.f20222a;
                    IAlog.a(1, null, "%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(a.this.f17682b.f17650a));
                    str = "sdk_error_";
                } else {
                    p pVar = aVar.f17683c;
                    if (pVar != null) {
                        this.f17688a.a("event", Integer.valueOf(pVar.f17677a));
                        a.this.f17683c.getClass();
                        IAlog.a("Event dispatcher - dispatching event: %s", a.this.f17683c);
                        int i11 = IAlog.f20222a;
                        IAlog.a(1, null, "%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(a.this.f17683c.f17677a));
                        str = "sdk_event_";
                    } else {
                        str = null;
                    }
                }
                if (!TextUtils.isEmpty(this.f17691d)) {
                    this.f17688a.a("placement_type", this.f17691d);
                }
                if (!TextUtils.isEmpty(this.f17692e)) {
                    this.f17688a.a("spot_id", this.f17692e);
                }
                this.f17688a.a("ciso", com.fyber.inneractive.sdk.util.k.g());
                this.f17688a.a("ad_type", this.f17693f);
                if (a.this.f17687g && !TextUtils.isEmpty(this.f17694g)) {
                    this.f17688a.f17579c = this.f17694g;
                }
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                this.f17688a.a("n", com.fyber.inneractive.sdk.util.k0.f().f20300a);
                this.f17688a.a("date_created", Long.valueOf(calendar.getTimeInMillis()));
                try {
                    this.f17688a.a("day", a.f17680h.format(calendar.getTime()));
                } catch (Throwable unused) {
                }
                this.f17688a.a("hour", Integer.valueOf(calendar.get(11)));
                q qVar = this.f17688a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                a aVar2 = a.this;
                o oVar2 = aVar2.f17682b;
                if (oVar2 != null) {
                    valueOf = String.valueOf(oVar2.f17650a);
                } else {
                    valueOf = String.valueOf(aVar2.f17683c.f17677a);
                }
                sb2.append(valueOf);
                qVar.a("table", sb2.toString());
                JSONArray jSONArray = a.this.f17684d;
                if (jSONArray != null && jSONArray.length() > 0) {
                    this.f17688a.a("experiments", a.this.f17684d);
                }
                com.fyber.inneractive.sdk.response.e eVar = a.this.f17685e;
                if (eVar != null && eVar.A) {
                    this.f17688a.a("sdk_bidding", "1");
                }
                JSONArray jSONArray2 = a.this.f17686f;
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    this.f17688a.a("extra", a.this.f17686f);
                }
                q qVar2 = this.f17688a;
                qVar2.getClass();
                if ((TextUtils.isEmpty(qVar2.f17577a) || (map = qVar2.f17578b) == null || map.size() == 0) ? false : true) {
                    c cVar = IAConfigManager.J.G;
                    cVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    Map<String, Object> map2 = qVar2.f17578b;
                    for (String str2 : map2.keySet()) {
                        Object obj = map2.get(str2);
                        if (obj != null) {
                            try {
                                jSONObject.put(str2, obj);
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                    String str3 = qVar2.f17579c;
                    if (str3 != null) {
                        int length = str3.length();
                        if (length > 51200) {
                            int indexOf = str3.indexOf("iawrapper");
                            if (indexOf == -1) {
                                indexOf = 0;
                            }
                            str3 = str3.substring(indexOf, 51199);
                            IAlog.a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
                        }
                        try {
                            jSONObject.put("ad", str3);
                        } catch (JSONException e10) {
                            IAlog.a("Failed inserting ad body to json", e10, new Object[0]);
                        }
                    }
                    if (IAlog.f20222a == 1) {
                        try {
                            IAlog.a(1, null, "%s, Event: %s", "SDK_EVENT", jSONObject.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                    cVar.f17525a.offer(jSONObject);
                    if (cVar.f17525a.size() > 30) {
                        Handler handler = cVar.f17528d;
                        if (handler != null && handler.hasMessages(12312329)) {
                            cVar.f17528d.removeMessages(12312329);
                        }
                        cVar.a(12312329, 0L);
                    }
                }
            }
        }

        public a(o oVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f17682b = oVar;
            this.f17681a = inneractiveAdRequest;
            this.f17684d = null;
        }

        public a a(Object... objArr) {
            if (objArr.length > 0) {
                JSONObject jSONObject = new JSONObject();
                for (int i10 = 0; i10 < objArr.length - 1; i10 += 2) {
                    String obj = objArr[i10].toString();
                    Object obj2 = objArr[i10 + 1];
                    try {
                        jSONObject.put(obj, obj2);
                    } catch (Exception unused) {
                        IAlog.e("Got exception adding param to json object: %s, %s", obj, obj2);
                    }
                }
                this.f17686f.put(jSONObject);
            }
            return this;
        }

        public a(p pVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f17683c = pVar;
            this.f17681a = inneractiveAdRequest;
            this.f17684d = null;
        }

        public void a(String str) {
            String str2;
            String str3;
            Long l10;
            String str4;
            String str5;
            String str6;
            boolean isDeprecated;
            UnitDisplayType unitDisplayType;
            UnitDisplayType unitDisplayType2;
            com.fyber.inneractive.sdk.response.e eVar = this.f17685e;
            if (eVar != null) {
                ImpressionData impressionData = eVar.f20177r;
                String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
                ImpressionData impressionData2 = this.f17685e.f20177r;
                String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
                ImpressionData impressionData3 = this.f17685e.f20177r;
                Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
                ImpressionData impressionData4 = this.f17685e.f20177r;
                String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
                ImpressionData impressionData5 = this.f17685e.f20177r;
                String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
                ImpressionData impressionData6 = this.f17685e.f20177r;
                if (impressionData6 != null) {
                    str2 = impressionId;
                    str3 = demandSource;
                    l10 = demandId;
                    str4 = creativeId;
                    str5 = advertiserDomain;
                    str6 = impressionData6.getCampaignId();
                } else {
                    str2 = impressionId;
                    str6 = null;
                    str3 = demandSource;
                    l10 = demandId;
                    str4 = creativeId;
                    str5 = advertiserDomain;
                }
            } else {
                str2 = null;
                str3 = null;
                l10 = null;
                str4 = null;
                str5 = null;
                str6 = null;
            }
            IAConfigManager iAConfigManager = IAConfigManager.J;
            q qVar = new q(iAConfigManager.f16867c, str2, str3, l10, str4, str5, str6, str);
            InneractiveAdRequest inneractiveAdRequest = this.f17681a;
            com.fyber.inneractive.sdk.config.z selectedUnitConfig = inneractiveAdRequest == null ? null : inneractiveAdRequest.getSelectedUnitConfig();
            if (selectedUnitConfig != null) {
                com.fyber.inneractive.sdk.config.y yVar = (com.fyber.inneractive.sdk.config.y) selectedUnitConfig;
                com.fyber.inneractive.sdk.config.v vVar = yVar.f17075d;
                Track track = Track.ERRORS;
                Set<Track> set = vVar.f17068a;
                if (!(set == null ? false : set.contains(track))) {
                    return;
                }
                com.fyber.inneractive.sdk.config.r rVar = yVar.f17074c;
                if (rVar != null && (unitDisplayType2 = rVar.f17018b) != null) {
                    isDeprecated = unitDisplayType2.isDeprecated();
                } else {
                    com.fyber.inneractive.sdk.config.a0 a0Var = yVar.f17077f;
                    isDeprecated = (a0Var == null || (unitDisplayType = a0Var.f16908j) == null) ? false : unitDisplayType.isDeprecated();
                }
                if (isDeprecated) {
                    return;
                }
            }
            com.fyber.inneractive.sdk.response.e eVar2 = this.f17685e;
            String str7 = eVar2 == null ? null : eVar2.f20163d;
            String str8 = TextUtils.isEmpty(iAConfigManager.f16885u) ? null : iAConfigManager.f16885u;
            if (this.f17682b == null && this.f17683c == null) {
                IAlog.a("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
                return;
            }
            InneractiveAdRequest inneractiveAdRequest2 = this.f17681a;
            String spotId = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSpotId();
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(iAConfigManager.f16877m)) {
                sb2.append(iAConfigManager.f16877m);
                sb2.append("_");
            }
            com.fyber.inneractive.sdk.response.e eVar3 = this.f17685e;
            UnitDisplayType unitDisplayType3 = eVar3 == null ? null : eVar3.f20173n;
            sb2.append(unitDisplayType3 != null ? unitDisplayType3.toString() : DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
            String sb3 = sb2.toString();
            com.fyber.inneractive.sdk.response.e eVar4 = this.f17685e;
            Integer valueOf = eVar4 == null ? null : Integer.valueOf(eVar4.f20166g);
            com.fyber.inneractive.sdk.response.e eVar5 = this.f17685e;
            com.fyber.inneractive.sdk.util.n.a(new RunnableC0238a(qVar, str7, str8, sb3, spotId, valueOf, eVar5 == null ? "" : eVar5.f20167h));
        }

        public a(com.fyber.inneractive.sdk.response.e eVar) {
            this.f17687g = false;
            this.f17685e = eVar;
            this.f17686f = new JSONArray();
        }
    }
}
