package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InneractiveError f17187a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f17188b;

    public a(b bVar, InneractiveError inneractiveError) {
        this.f17188b = bVar;
        this.f17187a = inneractiveError;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2;
        T t10 = this.f17188b.f17193b;
        if (t10 == 0 || (str = t10.f20167h) == null) {
            return;
        }
        Map<String, String> map = t10.f20175p;
        if (map == null && t10.f20176q == null) {
            return;
        }
        IAConfigManager iAConfigManager = IAConfigManager.J;
        com.fyber.inneractive.sdk.config.h hVar = iAConfigManager.f16886v.f16987b;
        String str3 = b.f17191e;
        if (hVar.f16984a.containsKey("max_failed_creatives_interval_hours")) {
            str3 = hVar.f16984a.get("max_failed_creatives_interval_hours");
        }
        com.fyber.inneractive.sdk.config.h hVar2 = iAConfigManager.f16886v.f16987b;
        String str4 = b.f17192f;
        if (hVar2.f16984a.containsKey("max_failed_creatives_per_interval")) {
            str4 = hVar2.f16984a.get("max_failed_creatives_per_interval");
        }
        int a10 = com.fyber.inneractive.sdk.util.s.a(str3, 24);
        int a11 = com.fyber.inneractive.sdk.util.s.a(str4, 1);
        Application application = com.fyber.inneractive.sdk.util.l.f20301a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString("lt", "[]"));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            b bVar = this.f17188b;
            bVar.getClass();
            if (IAConfigManager.J.f16886v.f16987b.a(bVar.f17358a, false) && !com.fyber.inneractive.sdk.metrics.a.a(a10, a11, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                if (map != null) {
                    try {
                        str2 = new JSONObject(map).toString();
                    } catch (Throwable unused2) {
                        str2 = "";
                    }
                } else {
                    str2 = this.f17188b.f17193b.f20176q;
                }
                b bVar2 = this.f17188b;
                InneractiveAdRequest inneractiveAdRequest = bVar2.f17194c;
                T t11 = bVar2.f17193b;
                InneractiveError inneractiveError = this.f17187a;
                JSONArray jSONArray2 = bVar2.f17195d;
                com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.IA_AD_FAILURE_DATA;
                q.a aVar = new q.a(t11);
                aVar.f17683c = pVar;
                aVar.f17681a = inneractiveAdRequest;
                aVar.f17684d = jSONArray2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw_response", str);
                } catch (Exception unused3) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "raw_response", str);
                }
                try {
                    jSONObject.put("headers", str2);
                } catch (Exception unused4) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "headers", str2);
                }
                String description = inneractiveError.description();
                try {
                    jSONObject.put("error_code", description);
                } catch (Exception unused5) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "error_code", description);
                }
                aVar.f17686f.put(jSONObject);
                aVar.a((String) null);
            }
            sharedPreferences.edit().putString("lt", new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
