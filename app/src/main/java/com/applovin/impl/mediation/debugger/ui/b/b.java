package com.applovin.impl.mediation.debugger.ui.b;

import android.app.Activity;
import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.b.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b extends d implements AppLovinCommunicatorSubscriber {

    /* renamed from: a  reason: collision with root package name */
    private m f7625a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f7626b;

    /* renamed from: d  reason: collision with root package name */
    private String f7627d;

    /* renamed from: e  reason: collision with root package name */
    private String f7628e;

    /* renamed from: f  reason: collision with root package name */
    private String f7629f;

    /* renamed from: g  reason: collision with root package name */
    private final StringBuilder f7630g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f7631h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7632i;

    /* renamed from: j  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.b.b> f7633j;

    /* renamed from: k  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.b.b> f7634k;

    /* renamed from: l  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.b.b> f7635l;

    /* renamed from: m  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.d> f7636m;

    /* renamed from: n  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.d> f7637n;

    /* renamed from: o  reason: collision with root package name */
    private List<c> f7638o;

    /* renamed from: p  reason: collision with root package name */
    private List<c> f7639p;

    /* renamed from: q  reason: collision with root package name */
    private List<c> f7640q;

    /* renamed from: r  reason: collision with root package name */
    private List<c> f7641r;

    /* renamed from: s  reason: collision with root package name */
    private List<c> f7642s;

    /* renamed from: t  reason: collision with root package name */
    private List<c> f7643t;

    /* renamed from: u  reason: collision with root package name */
    private List<c> f7644u;

    /* loaded from: classes.dex */
    public enum a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        COUNT
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0124b {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public b(Context context) {
        super(context);
        this.f7630g = new StringBuilder("");
        this.f7631h = new AtomicBoolean();
        this.f7632i = false;
        this.f7633j = new ArrayList();
        this.f7634k = new ArrayList();
        this.f7635l = new ArrayList();
        this.f7636m = new ArrayList();
        this.f7637n = new ArrayList();
        this.f7638o = new ArrayList();
        this.f7639p = new ArrayList();
        this.f7640q = new ArrayList();
        this.f7641r = new ArrayList();
        this.f7642s = new ArrayList();
        this.f7643t = new ArrayList();
        this.f7644u = new ArrayList();
    }

    private c a(String str, String str2) {
        c.a a10 = c.p().a(str);
        if (StringUtils.isValidString(str2)) {
            a10.b(str2);
        } else {
            a10.a(R.drawable.applovin_ic_x_mark);
            a10.c(f.a(R.color.applovin_sdk_xmarkColor, this.f7722c));
        }
        return a10.a();
    }

    private void a(c.a aVar, String str) {
        aVar.c("MAX Ad Review").d(str).a(R.drawable.applovin_ic_x_mark).c(f.a(R.color.applovin_sdk_xmarkColor, this.f7722c)).a(true);
    }

    private void a(StringBuilder sb2, String str) {
        String sb3 = sb2.toString();
        if (sb3.length() + str.length() >= ((Integer) this.f7625a.a(com.applovin.impl.sdk.c.b.al)).intValue()) {
            v.f("MediationDebuggerListAdapter", sb3);
            this.f7630g.append(sb3);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.b.b> list) {
        List<com.applovin.impl.mediation.debugger.b.b.b> list2;
        for (com.applovin.impl.mediation.debugger.b.b.b bVar : list) {
            if (!bVar.g()) {
                if (bVar.a() == b.a.INCOMPLETE_INTEGRATION || bVar.a() == b.a.INVALID_INTEGRATION) {
                    list2 = this.f7633j;
                } else if (bVar.a() == b.a.COMPLETE) {
                    list2 = this.f7634k;
                } else if (bVar.a() == b.a.MISSING) {
                    list2 = this.f7635l;
                }
                list2.add(bVar);
            }
        }
    }

    private void b(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (com.applovin.impl.mediation.debugger.b.a.a aVar : list) {
            com.applovin.impl.mediation.debugger.b.a.c e10 = aVar.e();
            for (com.applovin.impl.mediation.debugger.b.a.b bVar : e10.a()) {
                hashSet.add(bVar.a());
            }
            for (com.applovin.impl.mediation.debugger.b.a.b bVar2 : e10.b()) {
                hashSet2.add(bVar2.a());
            }
        }
        this.f7636m = new ArrayList(hashSet);
        this.f7637n = new ArrayList(hashSet2);
        Collections.sort(this.f7636m);
        Collections.sort(this.f7637n);
    }

    private List<c> c(List<com.applovin.impl.mediation.debugger.b.b.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.b.b.b bVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(bVar, this.f7722c));
        }
        return arrayList;
    }

    private void l() {
        Map<String, String> metaData;
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + Utils.isPubInDebugMode(this.f7722c, this.f7625a));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nTest Mode - ");
        sb3.append(this.f7625a.J().a() ? "enabled" : "disabled");
        sb2.append(sb3.toString());
        sb2.append("\nTarget SDK - " + this.f7625a.V().h().get("target_sdk"));
        sb2.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f7625a.a(com.applovin.impl.sdk.c.b.dz);
        String a10 = e.a();
        sb2.append("\nSDK Version - " + str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb4.append(str2);
        sb2.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(a10)) {
            a10 = "Disabled";
        }
        sb5.append(a10);
        sb2.append(sb5.toString());
        if (this.f7625a.g() && (metaData = Utils.getMetaData(this.f7625a.p())) != null) {
            String str3 = metaData.get("UnityVersion");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("\nUnity Version - ");
            sb6.append(StringUtils.isValidString(str3) ? str3 : "None");
            sb2.append(sb6.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(j.a(this.f7722c));
        sb2.append("\n========== NETWORKS ==========");
        for (com.applovin.impl.mediation.debugger.b.b.b bVar : this.f7634k) {
            a(sb2, bVar.w());
        }
        for (com.applovin.impl.mediation.debugger.b.b.b bVar2 : this.f7633j) {
            a(sb2, bVar2.w());
        }
        sb2.append("\n========== AD UNITS ==========");
        for (com.applovin.impl.mediation.debugger.b.a.a aVar : this.f7626b) {
            a(sb2, aVar.f());
        }
        sb2.append("\n========== END ==========");
        v.f("MediationDebuggerListAdapter", sb2.toString());
        this.f7630g.append(sb2.toString());
    }

    private List<c> m() {
        String str;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.f7722c.getPackageManager().getPackageInfo(this.f7722c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(c.p().a("Package Name").b(this.f7722c.getPackageName()).a());
        c.a a10 = c.p().a("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(a10.b(str).a());
        arrayList.add(c.p().a("OS").b(Utils.getAndroidOSInfo()).a());
        arrayList.add(c.p().a("Account").b(StringUtils.isValidString(this.f7629f) ? this.f7629f : "None").a());
        arrayList.add(c.p().a("Mediation Provider").b(StringUtils.isValidString(this.f7625a.t()) ? this.f7625a.t() : "None").a());
        arrayList.add(c.p().a("OM SDK Version").b(this.f7625a.al().c()).a());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.applovin.impl.mediation.debugger.ui.d.c> n() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.ui.d.c.p()
            java.lang.String r2 = "SDK Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.a(r2)
            java.lang.String r2 = com.applovin.sdk.AppLovinSdk.VERSION
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.b(r2)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.f7625a
            com.applovin.impl.sdk.c.b<java.lang.String> r2 = com.applovin.impl.sdk.c.b.dz
            java.lang.Object r1 = r1.a(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = com.applovin.impl.mediation.debugger.ui.d.c.p()
            java.lang.String r3 = "Plugin Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = r2.a(r3)
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            java.lang.String r4 = "None"
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r4
        L3b:
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r2.b(r1)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.ui.d.c.p()
            java.lang.String r2 = "Ad Review Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.a(r2)
            java.lang.String r2 = com.applovin.impl.sdk.e.a()
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r2)
            if (r3 == 0) goto L96
            java.lang.String r3 = com.applovin.impl.sdk.e.b()
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)
            if (r5 == 0) goto L92
            com.applovin.impl.sdk.m r5 = r6.f7625a
            java.lang.String r5 = r5.z()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L71
            goto L92
        L71:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MAX Ad Review integrated with wrong SDK key. Please check that your "
            r2.<init>(r3)
            com.applovin.impl.sdk.m r3 = r6.f7625a
            boolean r3 = r3.g()
            if (r3 == 0) goto L83
            java.lang.String r3 = "SDK key is downloaded"
            goto L85
        L83:
            java.lang.String r3 = "Gradle plugin snippet is integrated"
        L85:
            r2.append(r3)
            java.lang.String r3 = " from the correct account."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L98
        L92:
            r1.b(r2)
            goto L9b
        L96:
            java.lang.String r2 = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps."
        L98:
            r6.a(r1, r2)
        L9b:
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.f7625a
            boolean r1 = r1.g()
            if (r1 == 0) goto Lce
            com.applovin.impl.sdk.m r1 = r6.f7625a
            com.applovin.sdk.AppLovinSdkSettings r1 = r1.p()
            java.util.Map r1 = com.applovin.impl.sdk.utils.Utils.getMetaData(r1)
            if (r1 == 0) goto Lce
            java.lang.String r2 = "UnityVersion"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r2 == 0) goto Lc5
            r4 = r1
        Lc5:
            java.lang.String r1 = "Unity Version"
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r6.a(r1, r4)
            r0.add(r1)
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.ui.b.b.n():java.util.List");
    }

    private List<c> o() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(j.a(), true, this.f7722c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(j.b(), false, this.f7722c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(j.c(), true, this.f7722c));
        return arrayList;
    }

    private List<c> p() {
        ArrayList arrayList = new ArrayList(2);
        c.a p10 = c.p();
        arrayList.add(p10.a("View Ad Units (" + this.f7626b.size() + ")").a(this.f7722c).a(true).a());
        arrayList.add(q());
        return arrayList;
    }

    private c q() {
        c.a p10 = c.p();
        if (!this.f7625a.J().a()) {
            p10.a(this.f7722c);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7625a.J().c() != null ? "" : "Select ");
        sb2.append("Live Network");
        return p10.a(sb2.toString()).b(this.f7625a.J().a() ? "Enable" : null).b(-16776961).d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i10) {
        return (i10 == EnumC0124b.APP_INFO.ordinal() ? this.f7638o : i10 == EnumC0124b.MAX.ordinal() ? this.f7639p : i10 == EnumC0124b.PRIVACY.ordinal() ? this.f7640q : i10 == EnumC0124b.ADS.ordinal() ? this.f7641r : i10 == EnumC0124b.INCOMPLETE_NETWORKS.ordinal() ? this.f7642s : i10 == EnumC0124b.COMPLETED_NETWORKS.ordinal() ? this.f7643t : this.f7644u).size();
    }

    public void a(List<com.applovin.impl.mediation.debugger.b.b.b> list, List<com.applovin.impl.mediation.debugger.b.a.a> list2, String str, String str2, String str3, m mVar) {
        Activity an;
        this.f7625a = mVar;
        this.f7626b = list2;
        this.f7627d = str;
        this.f7628e = str2;
        this.f7629f = str3;
        if (!(this.f7722c instanceof Activity) && (an = mVar.an()) != null) {
            this.f7722c = an;
        }
        if (list != null && this.f7631h.compareAndSet(false, true)) {
            mVar.A().b("MediationDebuggerListAdapter", "Populating networks...");
            a(list);
            b(list2);
            this.f7638o.addAll(m());
            this.f7639p.addAll(n());
            this.f7640q.addAll(o());
            this.f7641r.addAll(p());
            this.f7642s = c(this.f7633j);
            this.f7643t = c(this.f7634k);
            this.f7644u = c(this.f7635l);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            AppLovinCommunicator.getInstance(this.f7722c).subscribe(this, arrayList);
            l();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    public void a(boolean z10) {
        this.f7632i = z10;
    }

    public boolean a() {
        return this.f7631h.get();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int b() {
        return EnumC0124b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected c b(int i10) {
        return i10 == EnumC0124b.APP_INFO.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("APP INFO") : i10 == EnumC0124b.MAX.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("MAX") : i10 == EnumC0124b.PRIVACY.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("PRIVACY") : i10 == EnumC0124b.ADS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("ADS") : i10 == EnumC0124b.INCOMPLETE_NETWORKS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("INCOMPLETE INTEGRATIONS") : i10 == EnumC0124b.COMPLETED_NETWORKS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("COMPLETED INTEGRATIONS") : new com.applovin.impl.mediation.debugger.ui.d.e("MISSING INTEGRATIONS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<c> c(int i10) {
        return i10 == EnumC0124b.APP_INFO.ordinal() ? this.f7638o : i10 == EnumC0124b.MAX.ordinal() ? this.f7639p : i10 == EnumC0124b.PRIVACY.ordinal() ? this.f7640q : i10 == EnumC0124b.ADS.ordinal() ? this.f7641r : i10 == EnumC0124b.INCOMPLETE_NETWORKS.ordinal() ? this.f7642s : i10 == EnumC0124b.COMPLETED_NETWORKS.ordinal() ? this.f7643t : this.f7644u;
    }

    public boolean c() {
        return this.f7632i;
    }

    public m d() {
        return this.f7625a;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.a> e() {
        return this.f7626b;
    }

    public String f() {
        return this.f7627d;
    }

    public String g() {
        return this.f7628e;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public List<com.applovin.impl.mediation.debugger.b.a.d> h() {
        return this.f7636m;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.d> i() {
        return this.f7637n;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f7640q = o();
        } else if (!"network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            return;
        } else {
            this.f7642s = c(this.f7633j);
            this.f7643t = c(this.f7634k);
        }
        j();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f7631h.get() + "}";
    }
}
