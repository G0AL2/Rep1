package com.fyber.inneractive.sdk.dv.handler;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdFormat f17096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f17097b;

    /* loaded from: classes.dex */
    public class a extends QueryInfoGenerationCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
        public void onFailure(String str) {
            String str2;
            b bVar = b.this;
            c cVar = bVar.f17097b;
            if (cVar.f17100b) {
                return;
            }
            AdFormat adFormat = bVar.f17096a;
            IAlog.a(String.format("Firing Event 1000 - Fetch error DV - msg  %s", str), new Object[0]);
            q.a aVar = new q.a(o.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (e) null, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message", str);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "message", str);
            }
            try {
                str2 = MobileAds.getVersionString();
            } catch (Exception unused2) {
                str2 = "na";
            }
            try {
                jSONObject.put(MediationMetaData.KEY_VERSION, str2);
            } catch (Exception unused3) {
                IAlog.e("Got exception adding param to json object: %s, %s", MediationMetaData.KEY_VERSION, str2);
            }
            String name = adFormat.name();
            try {
                jSONObject.put("adFormat", name);
            } catch (Exception unused4) {
                IAlog.e("Got exception adding param to json object: %s, %s", "adFormat", name);
            }
            Integer valueOf = Integer.valueOf(cVar.f17102d);
            try {
                jSONObject.put("success_count", valueOf);
            } catch (Exception unused5) {
                IAlog.e("Got exception adding param to json object: %s, %s", "success_count", valueOf);
            }
            aVar.f17686f.put(jSONObject);
            aVar.a((String) null);
            b.this.f17097b.f17100b = true;
        }

        @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
        public void onSuccess(QueryInfo queryInfo) {
            IAlog.a("DVHanlder - %s - put query: %s", b.this.f17096a.toString(), queryInfo.getQuery());
            synchronized (b.this.f17097b.f17101c) {
                b bVar = b.this;
                c cVar = bVar.f17097b;
                cVar.f17102d++;
                cVar.f17099a.put(bVar.f17096a, queryInfo);
            }
        }
    }

    public b(c cVar, AdFormat adFormat) {
        this.f17097b = cVar;
        this.f17096a = adFormat;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_3");
            QueryInfo.generate(l.f20301a, this.f17096a, new AdRequest.Builder().setRequestAgent(String.format("FyberMarketplace-v%s", "8.1.5")).addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), new a());
        } catch (Throwable unused) {
        }
    }
}
