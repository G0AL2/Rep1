package com.applovin.impl.mediation.c;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.h;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7389a;

    /* renamed from: c  reason: collision with root package name */
    private final String f7390c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.mediation.a.f f7391d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f7392e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f7393f;

    /* renamed from: g  reason: collision with root package name */
    private final MaxError f7394g;

    public d(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar, m mVar) {
        super("TaskFireMediationPostbacks", mVar);
        this.f7389a = str;
        this.f7390c = str + "_urls";
        this.f7392e = Utils.toUrlSafeMap(map, mVar);
        this.f7394g = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f7391d = fVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        hashMap.put("AppLovin-Ad-Network-Name", fVar.L());
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) fVar;
            hashMap.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            hashMap.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.l());
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f7393f = hashMap;
    }

    private String a(String str, MaxError maxError) {
        int i10;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i10 = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i10 = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage(), d())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i10)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2, d()));
    }

    private List<String> a(List<String> list, Map<String, String> map, Map<String, String> map2, MaxError maxError) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (String str : map.keySet()) {
                next = next.replace(str, this.f7391d.g(map.get(str)));
            }
            arrayList.add(a(b(next, map2), maxError));
        }
        return arrayList;
    }

    private Map<String, String> a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f8349b.a(com.applovin.impl.sdk.c.a.f8173i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private void a(String str, Map<String, Object> map) {
        d().U().a(h.o().c(str).b("POST").b(this.f7393f).a(false).c(map).b(((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.a.V)).booleanValue()).a());
    }

    private void a(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            d().U().a(h.o().c(str).a(false).b(this.f7393f).a());
        }
    }

    private String b(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull(map.get(str2)));
        }
        return str;
    }

    private void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            d().X().dispatchPostbackRequest(i.b(d()).a(str).c(false).b(this.f7393f).a(), o.a.MEDIATION_POSTBACKS, new AppLovinPostbackListener() { // from class: com.applovin.impl.mediation.c.d.1
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str2, int i10) {
                    if (v.a()) {
                        d dVar = d.this;
                        dVar.d("Failed to fire postback with code: " + i10 + " and url: " + str2);
                    }
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str2) {
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> f10 = this.f7391d.f(this.f7390c);
        Map<String, String> a10 = a();
        if (!((Boolean) d().a(com.applovin.impl.sdk.c.a.P)).booleanValue()) {
            List<String> a11 = a(f10, a10, this.f7392e, this.f7394g);
            if (((Boolean) d().a(com.applovin.impl.sdk.c.a.f8174j)).booleanValue()) {
                a(a11);
                return;
            } else {
                b(a11);
                return;
            }
        }
        for (String str : f10) {
            Uri parse = Uri.parse(a(b(str, this.f7392e), this.f7394g));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(a10.size());
            for (String str2 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str2);
                if (a10.containsKey(queryParameter)) {
                    hashMap.put(str2, this.f7391d.g(a10.get(queryParameter)));
                } else {
                    clearQuery.appendQueryParameter(str2, queryParameter);
                }
            }
            a(clearQuery.build().toString(), hashMap);
        }
    }
}
