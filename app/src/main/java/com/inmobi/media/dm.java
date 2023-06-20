package com.inmobi.media;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastCompanionAd.java */
/* loaded from: classes3.dex */
public class dm {

    /* renamed from: f  reason: collision with root package name */
    static final ArrayList<String> f25120f = new ArrayList<>(Arrays.asList("image/jpeg", "image/png"));

    /* renamed from: h  reason: collision with root package name */
    private static final String f25121h = "dm";

    /* renamed from: a  reason: collision with root package name */
    int f25122a;

    /* renamed from: b  reason: collision with root package name */
    int f25123b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25127g;

    /* renamed from: i  reason: collision with root package name */
    private String f25128i;

    /* renamed from: e  reason: collision with root package name */
    public String f25126e = null;

    /* renamed from: c  reason: collision with root package name */
    List<a> f25124c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<cf> f25125d = new ArrayList();

    /* compiled from: VastCompanionAd.java */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public byte f25129a;

        /* renamed from: b  reason: collision with root package name */
        public String f25130b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(byte b10, String str) {
            this.f25129a = b10;
            this.f25130b = str;
        }

        public final String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                byte b10 = this.f25129a;
                jSONObject.put("type", b10 != 1 ? b10 != 2 ? b10 != 3 ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : "iframe" : "html" : "static");
                jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, this.f25130b);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String unused = dm.f25121h;
                gg.a().a(new hg(e10));
                return "";
            }
        }
    }

    public dm(int i10, int i11, String str) {
        this.f25128i = str;
        this.f25122a = i10;
        this.f25123b = i11;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f25128i;
            if (str != null) {
                jSONObject.put("id", str);
            }
            jSONObject.put("width", this.f25122a);
            jSONObject.put("height", this.f25123b);
            jSONObject.put("clickThroughUrl", this.f25126e);
            JSONArray jSONArray = new JSONArray();
            for (a aVar : this.f25124c) {
                jSONArray.put(aVar.toString());
            }
            jSONObject.put("resources", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (cf cfVar : this.f25125d) {
                jSONArray2.put(cfVar.toString());
            }
            jSONObject.put("trackers", jSONArray2);
            return jSONObject.toString();
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }

    public final List<a> a(int i10) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f25124c) {
            if (aVar.f25129a == i10) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final void a(a aVar) {
        this.f25124c.add(aVar);
    }

    public final List<cf> a(String str) {
        ArrayList arrayList = new ArrayList();
        for (cf cfVar : this.f25125d) {
            if (cfVar.f24922d.equals(str)) {
                arrayList.add(cfVar);
            }
        }
        return arrayList;
    }

    public final void a(cf cfVar) {
        this.f25125d.add(cfVar);
    }
}
