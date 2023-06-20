package com.fyber.inneractive.sdk.dv.handler;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.dv.g;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.n;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends com.fyber.inneractive.sdk.dv.handler.a<QueryInfo> {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<AdFormat, QueryInfo> f17099a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f17100b = false;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17101c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f17102d = 0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17103a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            f17103a = iArr;
            try {
                iArr[UnitDisplayType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17103a[UnitDisplayType.MRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17103a[UnitDisplayType.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.handler.a
    public void a() {
        AdFormat[] values;
        for (AdFormat adFormat : AdFormat.values()) {
            if (adFormat != AdFormat.NATIVE) {
                n.a(new b(this, adFormat));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.handler.a
    public g a(UnitDisplayType unitDisplayType) {
        AdFormat adFormat;
        g gVar;
        int i10 = a.f17103a[unitDisplayType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            adFormat = AdFormat.BANNER;
        } else if (i10 != 3) {
            adFormat = AdFormat.INTERSTITIAL;
        } else {
            adFormat = AdFormat.REWARDED;
        }
        QueryInfo queryInfo = this.f17099a.get(adFormat);
        if (queryInfo != null) {
            synchronized (this.f17101c) {
                this.f17099a.remove(adFormat);
            }
            gVar = new g(queryInfo);
        } else {
            gVar = null;
        }
        IAlog.a("DVHanlder - get query: %s", gVar);
        n.a(new b(this, adFormat));
        return gVar;
    }

    public static void a(String str, com.fyber.inneractive.sdk.dv.enums.a aVar, InneractiveAdRequest inneractiveAdRequest, e eVar, String str2) {
        String str3;
        IAlog.a(String.format("Firing Event 1001 -Phase - %s  Fetch error DV - msg  %s", aVar.name(), str2), new Object[0]);
        o oVar = o.DV_ERROR_PHASE;
        q.a aVar2 = new q.a(eVar);
        aVar2.f17682b = oVar;
        aVar2.f17681a = inneractiveAdRequest;
        aVar2.f17684d = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("spot_id", str);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "spot_id", str);
        }
        String lowerCase = aVar.name().toLowerCase();
        try {
            jSONObject.put("phase", lowerCase);
        } catch (Exception unused2) {
            IAlog.e("Got exception adding param to json object: %s, %s", "phase", lowerCase);
        }
        try {
            str3 = MobileAds.getVersionString();
        } catch (Exception unused3) {
            str3 = "na";
        }
        try {
            jSONObject.put(MediationMetaData.KEY_VERSION, str3);
        } catch (Exception unused4) {
            IAlog.e("Got exception adding param to json object: %s, %s", MediationMetaData.KEY_VERSION, str3);
        }
        try {
            jSONObject.put("message", str2);
        } catch (Exception unused5) {
            IAlog.e("Got exception adding param to json object: %s, %s", "message", str2);
        }
        aVar2.f17686f.put(jSONObject);
        aVar2.a((String) null);
    }
}
