package com.applovin.impl.mediation.debugger.b.b;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber, Comparable<b> {
    private final Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> A;

    /* renamed from: a  reason: collision with root package name */
    private final m f7497a;

    /* renamed from: b  reason: collision with root package name */
    private final a f7498b;

    /* renamed from: c  reason: collision with root package name */
    private int f7499c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7500d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7501e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7502f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f7503g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f7504h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f7505i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f7506j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7507k;

    /* renamed from: l  reason: collision with root package name */
    private final String f7508l;

    /* renamed from: m  reason: collision with root package name */
    private final String f7509m;

    /* renamed from: n  reason: collision with root package name */
    private final String f7510n;

    /* renamed from: o  reason: collision with root package name */
    private String f7511o;

    /* renamed from: p  reason: collision with root package name */
    private final String f7512p;

    /* renamed from: q  reason: collision with root package name */
    private final String f7513q;

    /* renamed from: r  reason: collision with root package name */
    private final String f7514r;

    /* renamed from: s  reason: collision with root package name */
    private final int f7515s;

    /* renamed from: t  reason: collision with root package name */
    private final List<MaxAdFormat> f7516t;

    /* renamed from: u  reason: collision with root package name */
    private final List<d> f7517u;

    /* renamed from: v  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.b.b.a> f7518v;

    /* renamed from: w  reason: collision with root package name */
    private final List<String> f7519w;

    /* renamed from: x  reason: collision with root package name */
    private final c f7520x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f7521y;

    /* renamed from: z  reason: collision with root package name */
    private final String f7522z;

    /* loaded from: classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: e  reason: collision with root package name */
        private final String f7528e;

        a(String str) {
            this.f7528e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f7528e;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.b.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0119b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        

        /* renamed from: f  reason: collision with root package name */
        private final String f7535f;

        /* renamed from: g  reason: collision with root package name */
        private final int f7536g;

        /* renamed from: h  reason: collision with root package name */
        private final String f7537h;

        EnumC0119b(String str, int i10, String str2) {
            this.f7535f = str;
            this.f7536g = i10;
            this.f7537h = str2;
        }

        public String a() {
            return this.f7535f;
        }

        public int b() {
            return this.f7536g;
        }

        public String c() {
            return this.f7537h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(org.json.JSONObject r19, com.applovin.impl.sdk.m r20) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.b.b.b.<init>(org.json.JSONObject, com.applovin.impl.sdk.m):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r3.f7501e != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
        r0 = com.applovin.impl.mediation.debugger.b.b.b.a.f7524b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
        r0 = com.applovin.impl.mediation.debugger.b.b.b.a.f7523a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r3.f7503g != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.applovin.impl.mediation.debugger.b.b.b.a A() {
        /*
            r3 = this;
            boolean r0 = r3.f7500d
            if (r0 == 0) goto L10
            boolean r0 = r3.f7501e
            if (r0 == 0) goto Lb
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.b.b.b.a.COMPLETE
            goto L19
        Lb:
            boolean r0 = r3.f7503g
            if (r0 == 0) goto L14
            goto L17
        L10:
            boolean r0 = r3.f7501e
            if (r0 == 0) goto L17
        L14:
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.b.b.b.a.INCOMPLETE_INTEGRATION
            goto L19
        L17:
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.b.b.b.a.MISSING
        L19:
            com.applovin.impl.mediation.debugger.b.b.b$a r1 = com.applovin.impl.mediation.debugger.b.b.b.a.MISSING
            if (r0 != r1) goto L1e
            return r0
        L1e:
            java.util.List<com.applovin.impl.mediation.debugger.b.b.d> r1 = r3.f7517u
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.b.d r2 = (com.applovin.impl.mediation.debugger.b.b.d) r2
            boolean r2 = r2.c()
            if (r2 != 0) goto L24
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.b.b.b.a.INVALID_INTEGRATION
            return r0
        L39:
            java.util.List<com.applovin.impl.mediation.debugger.b.b.a> r1 = r3.f7518v
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.b.a r2 = (com.applovin.impl.mediation.debugger.b.b.a) r2
            boolean r2 = r2.c()
            if (r2 != 0) goto L3f
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.b.b.b.a.INVALID_INTEGRATION
            return r0
        L54:
            com.applovin.impl.mediation.debugger.b.b.c r1 = r3.f7520x
            boolean r1 = r1.a()
            if (r1 == 0) goto L66
            com.applovin.impl.mediation.debugger.b.b.c r1 = r3.f7520x
            boolean r1 = r1.b()
            if (r1 != 0) goto L66
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.b.b.b.a.INVALID_INTEGRATION
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.b.b.b.A():com.applovin.impl.mediation.debugger.b.b.b$a");
    }

    private List<MaxAdFormat> a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List<String> a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List<d> a(JSONObject jSONObject, m mVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f7510n.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            d dVar = new d("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", mVar.L());
            if (dVar.c()) {
                arrayList.add(dVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new d(next, jSONObject2.getString(next), mVar.L()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.b.a> a(JSONObject jSONObject, String str, m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.b.a(jSONObject2, mVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && com.applovin.impl.mediation.debugger.b.b.a.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.b.a(jSONObject3, mVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(b bVar) {
        return this.f7509m.compareToIgnoreCase(bVar.f7509m);
    }

    public a a() {
        return this.f7498b;
    }

    public int b() {
        return this.f7499c;
    }

    public EnumC0119b c() {
        return !this.f7504h ? EnumC0119b.NOT_SUPPORTED : this.f7498b == a.INVALID_INTEGRATION ? EnumC0119b.INVALID_INTEGRATION : !this.f7497a.J().a() ? EnumC0119b.DISABLED : (this.f7505i && (this.f7499c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f7499c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? EnumC0119b.NOT_INITIALIZED : EnumC0119b.READY;
    }

    public boolean d() {
        return this.f7500d;
    }

    public boolean e() {
        return this.f7501e;
    }

    public boolean f() {
        return this.f7502f;
    }

    public boolean g() {
        return this.f7498b == a.MISSING && this.f7506j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public String h() {
        return this.f7508l;
    }

    public String i() {
        return this.f7509m;
    }

    public String j() {
        return this.f7511o;
    }

    public String k() {
        return this.f7512p;
    }

    public String l() {
        return this.f7513q;
    }

    public String m() {
        return this.f7510n;
    }

    public List<String> n() {
        return this.f7519w;
    }

    public int o() {
        return this.f7515s;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f7510n.equals(string)) {
            this.f7499c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter b10 = com.applovin.impl.mediation.d.c.b(string, this.f7497a);
            if (b10 == null || this.f7511o.equals(b10.getSdkVersion())) {
                return;
            }
            this.f7511o = b10.getSdkVersion();
            this.f7497a.ag().a(this.f7511o, string);
        }
    }

    public List<MaxAdFormat> p() {
        return this.f7516t;
    }

    public boolean q() {
        return this.f7507k;
    }

    public List<d> r() {
        return this.f7517u;
    }

    public List<com.applovin.impl.mediation.debugger.b.b.a> s() {
        return this.f7518v;
    }

    public final c t() {
        return this.f7520x;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f7508l + ", displayName=" + this.f7509m + ", sdkAvailable=" + this.f7500d + ", sdkVersion=" + this.f7511o + ", adapterAvailable=" + this.f7501e + ", adapterVersion=" + this.f7512p + "}";
    }

    public String u() {
        return this.f7514r;
    }

    public final m v() {
        return this.f7497a;
    }

    public final String w() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n---------- ");
        sb2.append(this.f7508l);
        sb2.append(" ----------");
        sb2.append("\nStatus  - ");
        sb2.append(this.f7498b.a());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f7500d || TextUtils.isEmpty(this.f7511o)) ? "UNAVAILABLE" : this.f7511o);
        sb2.append("\nAdapter - ");
        if (this.f7501e && !TextUtils.isEmpty(this.f7512p)) {
            str = this.f7512p;
        }
        sb2.append(str);
        if (this.f7520x.a() && !this.f7520x.b()) {
            sb2.append("\n* ");
            sb2.append(this.f7520x.c());
        }
        for (d dVar : r()) {
            if (!dVar.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(dVar.a());
                sb2.append(": ");
                sb2.append(dVar.b());
            }
        }
        for (com.applovin.impl.mediation.debugger.b.b.a aVar : s()) {
            if (!aVar.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(aVar.a());
                sb2.append(": ");
                sb2.append(aVar.b());
            }
        }
        return sb2.toString();
    }

    public boolean x() {
        return this.f7521y;
    }

    public String y() {
        return this.f7522z;
    }

    public Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> z() {
        return this.A;
    }
}
