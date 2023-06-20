package com.chartboost.sdk.Model;

import android.net.Uri;
import com.chartboost.sdk.impl.b2;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f13660a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f13661b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13662c;

    /* renamed from: d  reason: collision with root package name */
    public String f13663d;

    /* renamed from: e  reason: collision with root package name */
    public String f13664e;

    /* renamed from: f  reason: collision with root package name */
    public String f13665f;

    /* renamed from: g  reason: collision with root package name */
    public String f13666g;

    /* renamed from: h  reason: collision with root package name */
    public String f13667h;

    /* renamed from: i  reason: collision with root package name */
    public String f13668i;

    /* renamed from: j  reason: collision with root package name */
    public String f13669j;

    /* renamed from: k  reason: collision with root package name */
    public int f13670k;

    /* renamed from: l  reason: collision with root package name */
    public final String f13671l;

    /* renamed from: m  reason: collision with root package name */
    public final String f13672m;

    /* renamed from: n  reason: collision with root package name */
    public final String f13673n;

    /* renamed from: o  reason: collision with root package name */
    public final Map<String, List<String>> f13674o;

    /* renamed from: p  reason: collision with root package name */
    public final int f13675p;

    /* renamed from: q  reason: collision with root package name */
    public String f13676q;

    /* renamed from: r  reason: collision with root package name */
    public final String f13677r;

    /* renamed from: s  reason: collision with root package name */
    public final HashSet<String> f13678s;

    /* renamed from: t  reason: collision with root package name */
    public b f13679t;

    /* renamed from: u  reason: collision with root package name */
    protected b2 f13680u;

    public a() {
        this.f13680u = null;
        this.f13660a = new HashMap();
        this.f13661b = new HashMap();
        this.f13662c = "dummy_template";
        this.f13663d = "";
        this.f13664e = "";
        this.f13665f = "";
        this.f13666g = "";
        this.f13671l = "";
        this.f13672m = "";
        this.f13670k = 0;
        this.f13669j = "";
        this.f13673n = "";
        this.f13674o = new HashMap();
        this.f13675p = 0;
        this.f13676q = "";
        this.f13677r = "";
        this.f13667h = "";
        this.f13668i = "";
        this.f13679t = new b("", "", "");
        this.f13678s = new HashSet<>();
    }

    private void a() {
        b bVar = this.f13660a.get("body");
        this.f13679t = bVar;
        if (bVar == null) {
            throw new RuntimeException("WebView AdUnit does not have a template html body asset");
        }
    }

    private void b(JSONArray jSONArray) throws JSONException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String optString = jSONObject.optString("param");
            if ("preCachedVideo".equals(string2)) {
                this.f13667h = string3;
            } else {
                if ("impression_id".equals(string)) {
                    this.f13666g = string3;
                }
                if (string2.equals("param")) {
                    this.f13661b.put(optString, string3);
                    if (string.equals("reward_amount")) {
                        try {
                            this.f13670k = Integer.parseInt(string3);
                        } catch (NumberFormatException unused) {
                            this.f13670k = 0;
                        }
                    } else if (string.equals("reward_currency")) {
                        this.f13669j = string3;
                    }
                } else {
                    if (string2.equals("html") && optString.isEmpty()) {
                        optString = "body";
                    } else if (optString.isEmpty()) {
                        optString = string;
                    }
                    this.f13660a.put(optString, new b(string2, string, string3));
                }
            }
        }
    }

    private void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.getString(i10));
                }
                this.f13674o.put(next, arrayList);
            }
        }
    }

    private void a(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f13678s.add(jSONArray.getString(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b() {
        String str = this.f13667h;
        if (str == null || str.length() <= 0) {
            return "";
        }
        if (!this.f13667h.startsWith("https://") && !this.f13667h.startsWith("http://")) {
            this.f13667h = "http://" + this.f13667h;
        }
        List<String> pathSegments = Uri.parse(this.f13667h).getPathSegments();
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : pathSegments) {
            sb2.append(str2);
            sb2.append("_");
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public a(JSONObject jSONObject) throws JSONException {
        this.f13680u = null;
        this.f13663d = jSONObject.getString("ad_id");
        this.f13664e = jSONObject.getString("cgn");
        this.f13665f = jSONObject.getString("creative");
        this.f13671l = jSONObject.optString("deep-link");
        this.f13672m = jSONObject.getString("link");
        this.f13673n = jSONObject.getString("to");
        this.f13675p = jSONObject.optInt("animation");
        this.f13676q = jSONObject.optString("media-type");
        this.f13677r = jSONObject.optString("name");
        this.f13660a = new HashMap();
        this.f13661b = new HashMap();
        this.f13674o = new HashMap();
        this.f13678s = new HashSet<>();
        this.f13670k = 0;
        this.f13669j = "";
        JSONObject jSONObject2 = jSONObject.getJSONObject("webview");
        b(jSONObject2.getJSONArray("elements"));
        this.f13668i = b();
        a();
        this.f13662c = jSONObject2.getString("template");
        a(jSONObject.optJSONObject("events"));
        a(jSONObject.optJSONArray("certification_providers"));
    }
}
