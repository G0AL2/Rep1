package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.bc;
import com.inmobi.media.er;
import com.inmobi.media.fs;
import com.inmobi.media.n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import fm.castbox.mediation.widget.AdView;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdUnit.java */
/* loaded from: classes3.dex */
public abstract class ad extends s implements ai, bc.a, bo, dj, dr, fs.c, k {
    private static HashSet<Byte> G = new HashSet<>(Arrays.asList((byte) 5, (byte) 53, (byte) 16, (byte) 39, (byte) 21));

    /* renamed from: a  reason: collision with root package name */
    static final String f24451a = "ad";
    private WeakReference<a> A;
    private HashMap<Integer, Set<du>> C;
    private boolean D;
    private q E;
    private dk F;

    /* renamed from: b  reason: collision with root package name */
    byte f24452b;

    /* renamed from: e  reason: collision with root package name */
    long f24455e;

    /* renamed from: g  reason: collision with root package name */
    public n f24457g;

    /* renamed from: h  reason: collision with root package name */
    byte f24458h;

    /* renamed from: i  reason: collision with root package name */
    public Handler f24459i;

    /* renamed from: j  reason: collision with root package name */
    boolean f24460j;

    /* renamed from: k  reason: collision with root package name */
    boolean f24461k;

    /* renamed from: m  reason: collision with root package name */
    boolean f24463m;

    /* renamed from: n  reason: collision with root package name */
    cj f24464n;

    /* renamed from: o  reason: collision with root package name */
    ba f24465o;

    /* renamed from: p  reason: collision with root package name */
    bb f24466p;

    /* renamed from: x  reason: collision with root package name */
    private WeakReference<Context> f24474x;

    /* renamed from: y  reason: collision with root package name */
    private jh f24475y;

    /* renamed from: z  reason: collision with root package name */
    private bc f24476z;

    /* renamed from: d  reason: collision with root package name */
    protected ArrayList<q> f24454d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    long f24456f = 0;
    private long B = 0;

    /* renamed from: l  reason: collision with root package name */
    boolean f24462l = false;

    /* renamed from: q  reason: collision with root package name */
    boolean f24467q = false;

    /* renamed from: r  reason: collision with root package name */
    int f24468r = 0;

    /* renamed from: s  reason: collision with root package name */
    int f24469s = 0;

    /* renamed from: t  reason: collision with root package name */
    long f24470t = -1;

    /* renamed from: u  reason: collision with root package name */
    TreeSet<Integer> f24471u = new TreeSet<>();

    /* renamed from: v  reason: collision with root package name */
    boolean f24472v = false;
    private String H = null;

    /* renamed from: w  reason: collision with root package name */
    final hq f24473w = hq.a();
    private s I = new s() { // from class: com.inmobi.media.ad.3
        @Override // com.inmobi.media.s
        public final void c(q qVar) {
            if (2 == ad.this.j()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ad.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ad.this.f((byte) 2);
                        ad.f(ad.this);
                        ad.this.O();
                    }
                });
            }
        }

        @Override // com.inmobi.media.s
        public final jh c_() {
            return ad.this.f24475y;
        }

        @Override // com.inmobi.media.s
        public final void d(q qVar) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ad.3.2
                @Override // java.lang.Runnable
                public final void run() {
                    ad.this.f((byte) 2);
                    ad.this.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
                }
            });
        }

        @Override // com.inmobi.media.s
        public final void e(q qVar) {
            if (2 == ad.this.j()) {
                ad.this.Q();
            }
        }

        @Override // com.inmobi.media.s
        public final void g(q qVar) {
            if (2 == ad.this.j()) {
                ad.this.f((byte) 2);
                ad.this.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    fq f24453c = (fq) fs.a("ads", ho.f(), this);

    /* compiled from: AdUnit.java */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public void a() {
        }

        public void a(int i10, int i11, q qVar) {
        }

        public void a(AdMetaInfo adMetaInfo) {
        }

        public void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        public void a(ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        public void a(ad adVar, boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        public void a(ba baVar, bb bbVar) {
        }

        public void a(Map<Object, Object> map) {
        }

        public void a(boolean z10) {
        }

        public void a(byte[] bArr) {
        }

        public void b() {
        }

        public void b(AdMetaInfo adMetaInfo) {
        }

        public void b(InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        public void b(ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        public void b(Map<Object, Object> map) {
        }

        public void c() {
        }

        public void c(AdMetaInfo adMetaInfo) {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        public boolean g() {
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j() {
        }

        public void k() {
        }
    }

    /* compiled from: AdUnit.java */
    /* loaded from: classes3.dex */
    public static class b {
        static Map<String, Object> a(String str, String str2, boolean z10, JSONObject jSONObject, byte b10) {
            HashMap hashMap = new HashMap();
            str.hashCode();
            String str3 = DownloadResource.TYPE_VIDEO;
            if (!str.equals(DownloadResource.TYPE_VIDEO)) {
                str3 = !str.equals("nonvideo") ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : "nonvideo";
            }
            hashMap.put("creativeType", str3);
            hashMap.put("customReferenceData", str2);
            hashMap.put("impressionType", Byte.valueOf(b10));
            HashMap hashMap2 = new HashMap();
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject.optString(next));
                }
            }
            hashMap.put("macros", hashMap2);
            hashMap.put("isolateVerificationScripts", Boolean.valueOf(z10));
            return hashMap;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x006c, code lost:
        if (r1 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ad(android.content.Context r4, com.inmobi.media.ba r5, com.inmobi.media.ad.a r6) {
        /*
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f24454d = r0
            r0 = 0
            r3.f24456f = r0
            r3.B = r0
            r0 = 0
            r3.f24462l = r0
            r3.f24467q = r0
            r3.f24468r = r0
            r3.f24469s = r0
            r1 = -1
            r3.f24470t = r1
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            r3.f24471u = r1
            r3.f24472v = r0
            r1 = 0
            r3.H = r1
            com.inmobi.media.hq r2 = com.inmobi.media.hq.a()
            r3.f24473w = r2
            com.inmobi.media.ad$3 r2 = new com.inmobi.media.ad$3
            r2.<init>()
            r3.I = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            r3.f24474x = r2
            r3.f24465o = r5
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r6)
            r3.A = r4
            java.lang.String r4 = com.inmobi.media.ho.f()
            java.lang.String r5 = "ads"
            com.inmobi.media.fr r4 = com.inmobi.media.fs.a(r5, r4, r3)
            com.inmobi.media.fq r4 = (com.inmobi.media.fq) r4
            r3.f24453c = r4
            com.inmobi.media.ba r4 = r3.f24465o
            java.lang.String r4 = r4.a()
            java.lang.String r5 = "AerServ"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L6f
            com.inmobi.media.jd r4 = com.inmobi.media.jf.c()
            if (r4 == 0) goto L6c
            com.inmobi.media.jh r1 = r4.f()
        L6c:
            if (r1 == 0) goto L6f
            goto L73
        L6f:
            com.inmobi.media.fq r4 = r3.f24453c
            com.inmobi.media.jh r1 = r4.timeouts
        L73:
            r3.f24475y = r1
            r3.f24452b = r0
            com.inmobi.media.bc r4 = new com.inmobi.media.bc
            com.inmobi.media.ba r5 = r3.f24465o
            r4.<init>(r3, r3, r5)
            r3.f24476z = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.C = r4
            r4 = -1
            r3.f24458h = r4
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            r3.f24459i = r4
            r3.f24460j = r0
            com.inmobi.media.dk r4 = new com.inmobi.media.dk
            r4.<init>(r3)
            r3.F = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.ad.<init>(android.content.Context, com.inmobi.media.ba, com.inmobi.media.ad$a):void");
    }

    private AdMetaInfo Y() {
        au u10 = u();
        if (u10 == null) {
            return null;
        }
        return u10.g();
    }

    private int Z() {
        try {
            this.f24452b = (byte) 1;
            iq.a().c();
            if (e((byte) 0)) {
                this.f24473w.a(hashCode(), new ac(this));
                return 0;
            }
            return -2;
        } catch (Exception e10) {
            hu.a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an unexpected error");
            gg.a().a(new hg(e10));
            return -2;
        }
    }

    private au aa() {
        au u10 = u();
        if (u10 == null || q()) {
            return null;
        }
        return u10;
    }

    static /* synthetic */ boolean f(ad adVar) {
        adVar.D = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"SwitchIntDef"})
    public final boolean A() {
        if (!hv.a()) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, (byte) 5);
            return true;
        } else if (!ie.h()) {
            D();
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), false, (byte) 21);
            return true;
        } else if (x()) {
            k();
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (byte) 39);
            return true;
        } else {
            byte b10 = this.f24452b;
            if (b10 == 1) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (byte) 53);
                return true;
            } else if (b10 != 7) {
                return false;
            } else {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (byte) 15);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        j s10 = s();
        if (s10 == null) {
            return;
        }
        s10.a((byte) 2, null);
    }

    public cm C() {
        fq fqVar = this.f24453c;
        String str = fqVar.url;
        ir irVar = new ir(fqVar.f());
        be.a();
        cm cmVar = new cm(str, irVar, be.e(), this.f24465o);
        cmVar.f24939c = this.f24465o.d();
        cmVar.f24938b = k();
        cmVar.f24937a = "unifiedSdkJson";
        cmVar.f24940d = m();
        fq fqVar2 = this.f24453c;
        int i10 = fqVar2.fetchTimeout;
        cmVar.f25617l = i10 * 1000;
        cmVar.f25618m = i10 * 1000;
        cmVar.a(fqVar2.rendering.enablePubMuteControl && ho.e());
        cmVar.f24941e = this.f24465o.g();
        return cmVar;
    }

    public void D() {
        if (this.f24462l) {
            return;
        }
        this.f24462l = true;
        E();
        this.C.clear();
        F();
        this.f24452b = (byte) 0;
        this.f24473w.a(hashCode());
        this.D = false;
        this.E = null;
        this.f24460j = false;
        this.f24461k = false;
        this.f24463m = false;
        this.f24466p = null;
        this.f24472v = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E() {
        if (this.f24472v) {
            X();
            this.f24454d.clear();
            this.f24468r = 0;
            this.f24469s = 0;
            this.f24471u.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        n nVar = this.f24457g;
        if (nVar != null) {
            nVar.destroy();
            this.f24457g = null;
        }
        if (this.f24469s >= 0) {
            int size = this.f24454d.size();
            int i10 = this.f24469s;
            if (size <= i10 || this.f24454d.get(i10) == null) {
                return;
            }
            d(this.f24469s);
        }
    }

    protected void G() {
        if (2 == j()) {
            f((byte) 2);
            this.f24452b = (byte) 3;
            a((byte) 42);
            if (p() != null) {
                p().a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    protected boolean H() {
        return j() == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f24456f));
        hashMap.put("markupType", n());
        c(hashMap);
        c("AdLoadSuccessful", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J() {
        HashMap hashMap = new HashMap();
        c(hashMap);
        c("AdLoadCalled", hashMap);
    }

    public void K() {
        this.B = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("markupType", n());
        c(hashMap);
        c("AdShowCalled", hashMap);
    }

    public void L() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.B));
        hashMap.put("markupType", n());
        c(hashMap);
        c("AdShowSuccessful", hashMap);
    }

    public q M() {
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N() {
        this.f24473w.a(hashCode(), new af<ad>(this) { // from class: com.inmobi.media.ad.2
            @Override // com.inmobi.media.af
            public final void a() {
                ad adVar = (ad) this.f24512f.get();
                if (adVar != null) {
                    try {
                        byte l10 = adVar.l();
                        JSONObject jSONObject = new JSONObject(adVar.a(0));
                        fq o10 = adVar.o();
                        bb bbVar = adVar.f24466p;
                        final bx bxVar = new bx(l10, jSONObject, o10, bbVar == null ? null : hv.a(bbVar.m()), (ds) null);
                        ad.this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ad.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    ch chVar = bxVar.f24859k;
                                    au u10 = ad.this.u();
                                    if (chVar == null || ad.this.h() == null || u10 == null) {
                                        return;
                                    }
                                    ad adVar2 = ad.this;
                                    Context h10 = ad.this.h();
                                    byte l11 = ad.this.l();
                                    Set f10 = ad.this.f(0);
                                    bb bbVar2 = ad.this.f24466p;
                                    adVar2.E = new q(h10, l11, f10, bbVar2 == null ? null : bbVar2.e(), Boolean.FALSE, "DEFAULT");
                                    ad.this.E.a(ad.this.I, ad.this.o(), ad.this.U(), false);
                                    ad.this.E.f25959i = true;
                                    ad.this.E.setBlobProvider(ad.this);
                                    ad.this.E.setIsPreload(true);
                                    ad.this.E.setPlacementId(ad.this.f24465o.e());
                                    ad.this.E.setCreativeId(u10.t());
                                    ad.this.E.setAllowAutoRedirection(ad.this.g(0));
                                    ad.this.E.setShouldFireRenderBeacon(false);
                                    ad adVar3 = ad.this;
                                    if (adVar3.f24458h == 0) {
                                        adVar3.l(adVar3.E);
                                    }
                                    if (ad.this.e((byte) 2)) {
                                        if ("URL".equals(chVar.f24926z)) {
                                            ad.this.E.b((String) chVar.f24813e);
                                        } else {
                                            ad.this.E.a((String) chVar.f24813e);
                                        }
                                    }
                                } catch (Exception e10) {
                                    String str = ad.f24451a;
                                    ad adVar4 = ad.this;
                                    adVar4.f24452b = (byte) 3;
                                    adVar4.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 76);
                                    gg.a().a(new hg(e10));
                                }
                            }
                        });
                    } catch (Exception e10) {
                        String str = ad.f24451a;
                        adVar.f24452b = (byte) 3;
                        adVar.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 76);
                        gg.a().a(new hg(e10));
                    }
                }
            }

            @Override // com.inmobi.media.af
            public final void b() {
                super.b();
                ad adVar = (ad) this.f24512f.get();
                if (adVar != null) {
                    adVar.f24452b = (byte) 3;
                    adVar.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), false, (byte) 40);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O() {
        if (this.f24460j && this.f24461k && this.D) {
            P();
        }
    }

    void P() {
    }

    void Q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean R() {
        au u10 = u();
        if (u10 != null && 4 == j() && !q()) {
            a p10 = p();
            if (p10 != null) {
                c(p10);
            }
            return true;
        } else if (u10 == null || 2 != j() || q()) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (byte) 49);
            return true;
        } else {
            return false;
        }
    }

    public abstract void S();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T() throws IllegalStateException {
        au aa2 = aa();
        if (aa2 != null) {
            String i10 = aa2.i();
            char c10 = 65535;
            switch (i10.hashCode()) {
                case -1470802432:
                    if (i10.equals("mediationJson")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1084172778:
                    if (i10.equals("inmobiJson")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3213227:
                    if (i10.equals("html")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1236050372:
                    if (i10.equals("htmlUrl")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            if (c10 != 2 && c10 != 3) {
                if (c10 == 4) {
                    aa2.f();
                    bb bbVar = this.f24466p;
                    if (bbVar != null) {
                        bbVar.a(this.f24453c, this);
                    }
                } else {
                    aa2.i();
                    throw new IllegalStateException("Can not handle fallback for markup type: " + aa2.i());
                }
            }
            List<String> c11 = aa2.c(au.WIN_BEACON);
            if (this.f24472v) {
                for (int i11 = 1; i11 < this.f24466p.b().size(); i11++) {
                    List<String> c12 = this.f24466p.b().get(i11).c(au.WIN_BEACON);
                    if (c12 != null) {
                        c11.addAll(c12);
                    }
                }
            }
            if (c11 == null) {
                return;
            }
            for (String str : c11) {
                bk.a().a(str, true);
            }
            return;
        }
        throw new IllegalStateException("Unable to get topAd");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean U() {
        au u10 = u();
        return u10 != null && u10.r();
    }

    public boolean V() {
        return this.f24467q;
    }

    public void W() {
        this.f24467q = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X() {
        for (int i10 = 0; i10 < this.f24454d.size(); i10++) {
            d(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ba baVar, boolean z10) {
    }

    @Override // com.inmobi.media.k
    public void a(q qVar, Context context) {
    }

    @Override // com.inmobi.media.s, com.inmobi.media.t
    public void a_() {
        if (this.f24462l || h() == null || p() == null) {
            return;
        }
        p().d();
    }

    @Override // com.inmobi.media.k
    public boolean b(q qVar) {
        return false;
    }

    @Override // com.inmobi.media.k
    public long b_() {
        if (this.f24472v) {
            return System.currentTimeMillis() - this.f24470t;
        }
        return -1L;
    }

    @Override // com.inmobi.media.s
    public jh c_() {
        return this.f24475y;
    }

    void f(a aVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(a aVar) {
    }

    public final Context h() {
        WeakReference<Context> weakReference = this.f24474x;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final ba i() {
        return this.f24465o;
    }

    public final byte j() {
        return this.f24452b;
    }

    public abstract String k();

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(q qVar) {
        this.f24454d.indexOf(qVar);
        if (qVar != null && qVar.getMarkupType().equals("htmlUrl")) {
            m(qVar);
        }
        a((byte) 22);
    }

    protected abstract byte l();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(q qVar) {
        if (o().viewability.omidConfig.omidEnabled && er.a.f25286a.a()) {
            for (du duVar : f(this.f24454d.indexOf(qVar))) {
                if (3 == duVar.f25178a) {
                    try {
                        ek a10 = eo.a((String) duVar.a("creativeType", String.class), qVar, ((Boolean) duVar.a("isolateVerificationScripts", Boolean.class)).booleanValue(), this.f24465o.h(), ((Byte) duVar.a("impressionType", Byte.class)).byteValue(), (String) duVar.a("customReferenceData", String.class));
                        if (a10 != null) {
                            duVar.f25179b.put("omidAdSession", a10);
                            duVar.f25179b.put("deferred", Boolean.TRUE);
                        }
                    } catch (Exception e10) {
                        gg.a().a(new hg(e10));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, String> m() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String n() {
        au u10 = u();
        return u10 == null ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : u10.i();
    }

    public final fq o() {
        return this.f24453c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a p() {
        a aVar = this.A.get();
        if (aVar == null) {
            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return aVar;
    }

    public final boolean q() {
        au u10 = u();
        return u10 != null && u10.a(this.f24453c.a(k()).timeToLive);
    }

    public final bc r() {
        if (this.f24476z == null) {
            this.f24476z = new bc(this, this, i());
        }
        return this.f24476z;
    }

    public j s() {
        byte j10 = j();
        String n10 = n();
        n10.hashCode();
        char c10 = 65535;
        switch (n10.hashCode()) {
            case -1084172778:
                if (n10.equals("inmobiJson")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3213227:
                if (n10.equals("html")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1236050372:
                if (n10.equals("htmlUrl")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (j10 == 0 || 1 == j10 || 3 == j10 || 2 == j10) {
                    return null;
                }
                return this.f24457g;
            case 1:
            case 2:
                if (j10 == 0 || 1 == j10 || 3 == j10) {
                    return null;
                }
                return t();
            default:
                return null;
        }
    }

    public q t() {
        return this.f24454d.get(this.f24469s);
    }

    public au u() {
        return b(0);
    }

    public Map<String, String> v() {
        return this.f24465o.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer w() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return false;
    }

    public void y() {
        this.f24456f = SystemClock.elapsedRealtime();
        if (!hv.a()) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, (byte) 5);
        } else {
            Z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z() {
        /*
            r6 = this;
            com.inmobi.media.ad$a r0 = r6.p()
            long r1 = java.lang.System.currentTimeMillis()
            boolean r3 = r6.f24463m
            r4 = 1
            if (r3 == 0) goto L17
            r0 = 2
            java.lang.String r3 = "InMobi"
            java.lang.String r5 = "getSignals() call is already in progress. Please wait for its execution to get complete"
            com.inmobi.media.hu.a(r0, r3, r5)
        L15:
            r0 = 1
            goto L30
        L17:
            boolean r3 = r6.x()
            if (r3 == 0) goto L2f
            if (r0 == 0) goto L29
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r5 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES
            r3.<init>(r5)
            r0.b(r3)
        L29:
            r0 = 39
            r6.a(r0, r1)
            goto L15
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L33
            return
        L33:
            r6.f24463m = r4
            com.inmobi.media.cj r0 = r6.f24464n
            if (r0 != 0) goto L40
            com.inmobi.media.cj r0 = new com.inmobi.media.cj
            r0.<init>(r6)
            r6.f24464n = r0
        L40:
            com.inmobi.media.hq r0 = r6.f24473w
            int r3 = r6.hashCode()
            com.inmobi.media.aj r4 = new com.inmobi.media.aj
            r4.<init>(r6, r1)
            r0.a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.ad.z():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<du> f(int i10) {
        return this.C.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(int i10) {
        au b10 = b(i10);
        return b10 != null && b10.e();
    }

    private void m(q qVar) {
        List<String> c10;
        au b10 = b(this.f24454d.indexOf(qVar));
        if (b10 == null || (c10 = b10.c(au.LOAD_AD_TOKEN_URL_FAILURE)) == null) {
            return;
        }
        for (String str : c10) {
            bk.a().a(str, true);
        }
    }

    public au b(int i10) {
        if (i10 > 0) {
            bb bbVar = this.f24466p;
            if (bbVar == null) {
                return null;
            }
            return bbVar.b().get(i10);
        }
        bb bbVar2 = this.f24466p;
        if (bbVar2 == null) {
            return null;
        }
        return bbVar2.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(a aVar) {
        AdMetaInfo Y = Y();
        if (Y == null) {
            aVar.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            aVar.b(Y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(a aVar) {
        AdMetaInfo Y = Y();
        if (Y == null) {
            a(aVar, (byte) 85);
        } else {
            aVar.c(Y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte e(a aVar) {
        ds dsVar;
        final WeakReference weakReference = new WeakReference(aVar);
        try {
            byte l10 = l();
            JSONObject jSONObject = new JSONObject(a(0));
            fq o10 = o();
            bb bbVar = this.f24466p;
            HashMap<String, String> a10 = bbVar == null ? null : hv.a(bbVar.m());
            au u10 = u();
            if (u10 != null) {
                if (u10 instanceof bl) {
                    bl blVar = (bl) u10;
                    be.a();
                    av b10 = be.b(blVar.f24791a);
                    if (b10 != null && b10.a()) {
                        dsVar = new ds(b10.f24631e, blVar.f24792b, blVar.f24793c, blVar.f24794d, blVar.f24795e, o().vastVideo);
                    } else {
                        throw new IllegalStateException("Asset not available in cache");
                    }
                } else {
                    dsVar = null;
                }
                bx bxVar = new bx(l10, jSONObject, o10, a10, dsVar);
                au u11 = u();
                if (!bxVar.d() || h() == null || u11 == null) {
                    return (byte) 20;
                }
                n a11 = n.b.a(h(), l(), bxVar, u11.f(), f(0), o(), this.f24465o.e(), g(0), u11.t());
                a11.a(new n.c() { // from class: com.inmobi.media.ad.6
                    @Override // com.inmobi.media.n.c
                    public final void a() {
                        if (ad.this.f24462l) {
                            return;
                        }
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            ad.this.a(aVar2, (byte) 91);
                        } else {
                            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        }
                    }

                    @Override // com.inmobi.media.n.c
                    public final void b() {
                        ad.this.f((byte) 4);
                        ad adVar = ad.this;
                        if (adVar.f24462l) {
                            return;
                        }
                        adVar.f24459i.post(new Runnable() { // from class: com.inmobi.media.ad.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                ad.this.f((a) weakReference.get());
                            }
                        });
                    }

                    @Override // com.inmobi.media.n.c
                    public final void c() {
                        if (ad.this.f24462l) {
                            return;
                        }
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.b();
                        } else {
                            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        }
                    }

                    @Override // com.inmobi.media.n.c
                    public final void d() {
                        hu.a((byte) 2, "InMobi", "Successfully impressed ad for placement id: " + ad.this.f24465o.toString());
                        if (ad.this.f24462l) {
                            return;
                        }
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.e();
                        } else {
                            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        }
                    }

                    @Override // com.inmobi.media.n.c
                    public final void e() {
                        hu.a((byte) 2, "InMobi", "Ad interaction for placement id: " + ad.this.f24465o.toString());
                        if (ad.this.f24462l) {
                            return;
                        }
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.a(new HashMap());
                        } else {
                            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        }
                    }

                    @Override // com.inmobi.media.n.c
                    public final void f() {
                        if (ad.this.f24462l) {
                            return;
                        }
                        hu.a((byte) 2, "InMobi", "Ad dismissed for placement id: " + ad.this.f24465o.toString());
                        ad.this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ad.6.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                ad.this.g((a) weakReference.get());
                            }
                        });
                    }

                    @Override // com.inmobi.media.n.c
                    public final void g() {
                        if (ad.this.f24462l) {
                            return;
                        }
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.d();
                        } else {
                            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        }
                    }

                    @Override // com.inmobi.media.n.c
                    public final void h() {
                        if (ad.this.f24462l) {
                            return;
                        }
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.f();
                        } else {
                            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        }
                    }

                    @Override // com.inmobi.media.n.c
                    public final void i() {
                        if (ad.this.f24462l) {
                            return;
                        }
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.h();
                        } else {
                            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        }
                    }

                    @Override // com.inmobi.media.n.c
                    public final void a(Map<String, String> map) {
                        if (ad.this.f24462l) {
                            return;
                        }
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.b(new HashMap(map));
                        } else {
                            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        }
                    }

                    @Override // com.inmobi.media.n.c
                    public final void a(boolean z10) {
                        if (ad.this.f24462l) {
                            return;
                        }
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.a(z10);
                        } else {
                            hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        }
                    }
                });
                this.f24457g = a11;
                return (byte) 0;
            }
            throw new IllegalStateException("No ad");
        } catch (IllegalStateException unused) {
            return (byte) 83;
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return (byte) 13;
        } catch (Exception e11) {
            gg.a().a(new hg(e11));
            return (byte) 88;
        }
    }

    @Override // com.inmobi.media.s
    public void h(q qVar) {
        List<String> c10;
        super.h(qVar);
        au b10 = b(this.f24454d.indexOf(qVar));
        if ((b10 != null && b10.v() != null && b10.v().equals(DownloadResource.TYPE_VIDEO)) || b10 == null || (c10 = b10.c(au.CLICK_BEACON)) == null) {
            return;
        }
        for (String str : c10) {
            bk.a().a(str, true);
        }
    }

    @Override // com.inmobi.media.s
    public void i(q qVar) {
        List<String> c10;
        super.i(qVar);
        au b10 = b(this.f24454d.indexOf(qVar));
        if ((b10 != null && b10.v() != null && b10.v().equals(DownloadResource.TYPE_VIDEO)) || b10 == null || (c10 = b10.c("impression")) == null) {
            return;
        }
        for (String str : c10) {
            bk.a().a(str, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(q qVar) {
        this.f24454d.indexOf(qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context, ba baVar, a aVar) {
        a(context);
        a(aVar);
        this.f24465o = baVar;
    }

    @Override // com.inmobi.media.s
    public void f(q qVar) {
        this.f24454d.indexOf(qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(a aVar) {
        AdMetaInfo Y = Y();
        if (Y == null) {
            a((byte) 3);
            aVar.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        aVar.a(Y);
    }

    @Override // com.inmobi.media.s
    public void f() {
        f((byte) 4);
        a p10 = p();
        if (p10 != null) {
            p10.k();
            p10.e();
        }
    }

    @Override // com.inmobi.media.s
    public void g() {
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ad.4
            @Override // java.lang.Runnable
            public final void run() {
                a p10;
                if ((ad.this.j() == 6 || ad.this.j() == 7) && (p10 = ad.this.p()) != null) {
                    p10.j();
                }
            }
        });
    }

    private static int c(String str) {
        if (str.startsWith("track_")) {
            str = str.substring(6);
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private void d(Map<String, Object> map) {
        au u10 = u();
        if (u10 != null) {
            map.put("creativeId", "\"" + u10.t() + "\"");
            map.put("impressionId", "\"" + u10.f() + "\"");
        }
    }

    @Override // com.inmobi.media.s
    public void g(final q qVar) {
        if (this.f24462l || h() == null) {
            return;
        }
        try {
            this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ad.10
                @Override // java.lang.Runnable
                public final void run() {
                    ad.this.G();
                }
            });
        } catch (Exception unused) {
            hu.a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
        }
    }

    @Override // com.inmobi.media.fs.c
    public void a(fr frVar) {
        if (frVar instanceof fq) {
            this.f24453c = (fq) frVar;
        }
    }

    private static String d(String str, Map map) {
        if (map != null && str != null) {
            for (Object obj : map.keySet()) {
                str = str.replace(obj.toString(), map.get(obj).toString());
            }
        }
        return str;
    }

    public void a(Context context) {
        this.f24474x = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(bb bbVar) {
        if (j() == 1) {
            this.f24466p = bbVar;
            this.f24472v = bbVar.d();
            this.f24454d = new ArrayList<>(this.f24466p.b().size());
            for (int i10 = 0; i10 < this.f24466p.b().size(); i10++) {
                this.f24454d.add(null);
            }
            au l10 = bbVar.l();
            if (l10 == null) {
                a(false, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else {
                this.f24473w.a(hashCode(), new ar(this, l10, bbVar, false, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(bb bbVar) {
        a(bbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(byte b10) {
        dk dkVar = this.F;
        if (dkVar != null) {
            dkVar.a(b10);
        }
    }

    private void c(Map<String, Object> map) {
        map.put("adType", k());
        map.put("networkType", ib.b());
        map.put("plId", Long.valueOf(this.f24465o.e()));
        map.put("plType", this.f24465o.p());
    }

    public final void a(a aVar) {
        this.A = new WeakReference<>(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(a aVar, byte b10) {
        c((int) b10);
        aVar.a();
    }

    @Override // com.inmobi.media.dj
    public void d(byte b10) {
        a p10;
        if (b10 == 0) {
            a(this.f24465o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (byte) 56);
        } else if (b10 != 1) {
            if (b10 == 2) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
            } else if (b10 == 4 && (p10 = p()) != null) {
                p10.i();
            }
        } else if (2 == j()) {
            this.f24452b = (byte) 3;
            a p11 = p();
            if (p11 != null) {
                p11.b(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
            }
            a((byte) 40);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(au auVar, int i10) {
        boolean z10;
        final Context c10;
        Map<String, Object> a10;
        String str = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        try {
            JSONObject b10 = auVar.b();
            String i11 = auVar.i();
            if (DtbDeviceDataRetriever.ORIENTATION_UNKNOWN.equals(i11)) {
                return false;
            }
            String j10 = auVar.j();
            if (j10.length() != 0) {
                auVar.b(j10.replace("@__imm_aft@", String.valueOf(System.currentTimeMillis() - this.f24455e)));
                z10 = true;
            } else {
                z10 = false;
            }
            if ("mediationJson".equals(i11) || (c10 = ho.c()) == null) {
                return z10;
            }
            if (this.C.get(Integer.valueOf(i10)) == null) {
                this.C.put(Integer.valueOf(i10), new HashSet());
            }
            Set<du> set = this.C.get(Integer.valueOf(i10));
            if (set != null && set.isEmpty()) {
                if (this.f24453c.viewability.omidConfig.omidEnabled && b10.has("metaInfo")) {
                    JSONObject jSONObject = b10.getJSONObject("metaInfo");
                    if (jSONObject.has("omsdkInfo")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("omsdkInfo");
                        if (jSONObject2.has("omidEnabled") && jSONObject2.getBoolean("omidEnabled")) {
                            if (jSONObject.has("creativeType")) {
                                str = jSONObject.getString("creativeType");
                            }
                            this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ad.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    er.a.f25286a.a(c10.getApplicationContext(), ad.this.f24453c);
                                }
                            });
                            du duVar = new du((byte) 3);
                            duVar.f25179b = b.a(str, jSONObject2.optString("customReferenceData"), jSONObject2.optBoolean("isolateVerificationScripts"), jSONObject2.optJSONObject("macros"), (byte) jSONObject2.optInt("impressionType"));
                            set.add(duVar);
                        }
                    }
                }
                if (b10.has("viewability") && (a10 = a(b10.getJSONArray("viewability"))) != null && !a10.isEmpty()) {
                    du duVar2 = new du((byte) 2);
                    duVar2.f25179b = a10;
                    Set<du> set2 = this.C.get(Integer.valueOf(i10));
                    if (set2 != null) {
                        set2.add(duVar2);
                    }
                }
                if (b10.has("tracking")) {
                    if ("web".equals(b10.getString("tracking"))) {
                        try {
                            this.f24458h = (byte) 0;
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            HashMap hashMap = new HashMap();
                            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 1);
                            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage());
                            b((Map<String, Object>) hashMap);
                            gg.a().a(new hg(e));
                            return false;
                        } catch (JSONException e11) {
                            e = e11;
                            gg.a().a(new hg(e));
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 1);
                            hashMap2.put(IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage());
                            b((Map<String, Object>) hashMap2);
                            return false;
                        }
                    }
                }
            }
            return z10;
        } catch (IllegalArgumentException e12) {
            e = e12;
        } catch (JSONException e13) {
            e = e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.B));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("markupType", n());
        c(hashMap);
        d(hashMap);
        c("AdShowFailed", hashMap);
    }

    public void b(String str) {
        this.f24465o.b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(byte b10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(b10));
        c(hashMap);
        c("AdLoadDroppedAtSDK", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i10) {
        if (this.f24454d.size() <= i10 || this.f24454d.get(i10) == null) {
            return;
        }
        this.f24454d.get(i10).stopLoading();
        this.f24454d.get(i10).destroy();
        this.f24454d.set(i10, null);
    }

    public void c(String str, Map<String, Object> map) {
        hh.a().a(str, map);
    }

    @Override // com.inmobi.media.k
    public JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it = this.f24471u.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().intValue());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Map<String, Object> map) {
        if (this.f24476z == null) {
            return;
        }
        if (map.get(IronSourceConstants.EVENTS_ERROR_REASON) == null) {
            map.put(IronSourceConstants.EVENTS_ERROR_REASON, "");
        }
        d(map);
        this.f24476z.a(map);
    }

    @Override // com.inmobi.media.s
    public final void d(final q qVar) {
        if (this.f24462l || h() == null) {
            return;
        }
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ad.8
            @Override // java.lang.Runnable
            public final void run() {
                ad.this.k(qVar);
            }
        });
    }

    @Override // com.inmobi.media.dj
    public void c(byte b10) {
        a p10;
        if (b10 == 0) {
            a(this.f24465o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (byte) 7);
        } else if (b10 == 1) {
            if (2 == j()) {
                this.f24452b = (byte) 3;
                a p11 = p();
                if (p11 != null) {
                    p11.b(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
                a((byte) 47);
            }
        } else if (b10 != 2) {
            if (b10 == 4 && (p10 = p()) != null) {
                p10.i();
            }
        } else {
            int size = this.f24454d.size();
            int i10 = this.f24469s;
            if (size > i10 && this.f24454d.get(i10) != null && this.f24454d.get(this.f24469s).getMarkupType().equals("htmlUrl")) {
                m(this.f24454d.get(this.f24469s));
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.media.k
    public long d() {
        if (this.f24472v) {
            return this.f24470t;
        }
        return -1L;
    }

    @Override // com.inmobi.media.bo
    public final void b(String str, Map<String, Object> map) {
        c(str, map);
    }

    public void b(InMobiAdRequestStatus inMobiAdRequestStatus) {
        bb bbVar = this.f24466p;
        au k10 = bbVar == null ? null : bbVar.k();
        if (k10 == null) {
            a p10 = p();
            if (p10 != null) {
                p10.a(this, false, inMobiAdRequestStatus);
                return;
            }
            return;
        }
        this.f24473w.a(hashCode(), new ar(this, k10, this.f24466p, true, inMobiAdRequestStatus));
    }

    @Override // com.inmobi.media.s
    public void b(HashMap<Object, Object> hashMap) {
        if (this.f24462l || h() == null || p() == null) {
            return;
        }
        p().b(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z10) {
            this.f24452b = (byte) 2;
        }
        a p10 = p();
        if (p10 != null) {
            p10.a(this, z10, inMobiAdRequestStatus);
        }
    }

    @Override // com.inmobi.media.s
    public final void c(final q qVar) {
        if (this.f24462l || h() == null) {
            return;
        }
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ad.7
            @Override // java.lang.Runnable
            public final void run() {
                ad.this.j(qVar);
            }
        });
    }

    @Override // com.inmobi.media.s
    public void e(q qVar) {
        this.f24454d.indexOf(qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SwitchIntDef"})
    public final boolean e(byte b10) {
        int c10;
        if (b10 == 0) {
            c10 = this.f24475y.c();
        } else if (b10 == 1) {
            c10 = this.f24475y.f();
        } else if (b10 == 2) {
            c10 = this.f24475y.i();
        } else if (b10 != 4) {
            return false;
        } else {
            c10 = this.f24475y.g();
        }
        long j10 = c10;
        dk dkVar = this.F;
        return dkVar != null && dkVar.a(b10, j10);
    }

    public void e(int i10) {
        this.f24469s = i10;
    }

    @Override // com.inmobi.media.k
    public String e() {
        if (this.f24472v) {
            return this.H;
        }
        return null;
    }

    private static Map<String, Object> a(JSONArray jSONArray) {
        JSONObject jSONObject;
        try {
            int length = jSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    jSONObject = null;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2.has("inmobi")) {
                    jSONObject = jSONObject2.getJSONObject("inmobi");
                    break;
                }
                i10++;
            }
            if (jSONObject != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("frame", jSONObject.optJSONArray("frame"));
                int c10 = c(jSONObject.optString("time"));
                if (c10 != -1) {
                    hashMap.put("time", Integer.valueOf(c10));
                }
                int c11 = c(jSONObject.optString("view"));
                if (c11 != -1) {
                    hashMap.put("view", Integer.valueOf(c11));
                }
                int c12 = c(jSONObject.optString("pixel"));
                if (c12 != -1) {
                    hashMap.put("pixel", Integer.valueOf(c12));
                }
                int optInt = jSONObject.optInt("type");
                if (optInt != -1) {
                    hashMap.put("type", Integer.valueOf(optInt));
                }
                return hashMap;
            }
            return null;
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return null;
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z10, byte b10) {
        if (j() == 1 && z10) {
            this.f24452b = (byte) 3;
        }
        a p10 = p();
        if (p10 != null) {
            p10.a(this, inMobiAdRequestStatus);
        }
        if (G.contains(Byte.valueOf(b10))) {
            b(b10);
        } else if (b10 != 0) {
            a(b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z10) {
        au b10;
        List<String> c10;
        try {
            int i10 = this.f24468r;
            Context h10 = h();
            if (h10 != null) {
                try {
                    if (this.f24454d.get(i10) == null || this.f24454d.get(i10).f25967q.get()) {
                        au b11 = b(i10);
                        q qVar = new q(h10, l(), this.C.get(Integer.valueOf(i10)), b11 == null ? null : b11.f(), Boolean.FALSE, b11.u() != null ? b11.u() : "DEFAULT");
                        qVar.f25974x = b11.v();
                        qVar.setMarkupType(b11.i());
                        this.f24454d.set(i10, qVar);
                        if (this.f24465o.l().equals(AdView.AdType.BANNER)) {
                            qVar.setAdSize(this.f24465o.m());
                        }
                        qVar.a(this, o(), U(), true);
                        qVar.setAdPodHandler(this);
                        qVar.setPlacementId(this.f24465o.e());
                        qVar.setAllowAutoRedirection(g(i10));
                        qVar.setContentUrl(this.f24465o.h());
                        AdMetaInfo Y = Y();
                        if (Y != null) {
                            qVar.setCreativeId(Y.getCreativeID());
                        }
                        if (this.f24465o.f()) {
                            qVar.a();
                        }
                    }
                } catch (Exception e10) {
                    a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
                    gg.a().a(new hg(e10));
                }
            }
            if (!z10 || e((byte) 2)) {
                this.f24466p.b().get(this.f24468r).f();
                q qVar2 = this.f24454d.get(this.f24468r);
                if (qVar2 != null) {
                    if (qVar2.getMarkupType().equals("html")) {
                        qVar2.a(a(this.f24468r));
                    } else if (qVar2.getMarkupType().equals("htmlUrl")) {
                        qVar2.b(a(this.f24468r));
                    }
                }
                l(qVar2);
                if (qVar2 == null || !qVar2.getMarkupType().equals("htmlUrl") || (b10 = b(this.f24454d.indexOf(qVar2))) == null || (c10 = b10.c(au.LOAD_AD_TOKEN_URL)) == null) {
                    return;
                }
                for (String str : c10) {
                    bk.a().a(str, true);
                }
            }
        } catch (Exception e11) {
            f((byte) 2);
            hu.a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
            gg.a().a(new hg(e11));
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
        }
    }

    public void a(Map<String, String> map) {
        this.f24465o.b(map);
    }

    public void a(final JSONObject jSONObject) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ad.5
            @Override // java.lang.Runnable
            public final void run() {
                ad adVar = ad.this;
                adVar.f24473w.a(adVar.hashCode(), new ae(ad.this, jSONObject));
            }
        });
    }

    public void a(byte[] bArr) {
        if (A()) {
            return;
        }
        if (bArr != null && bArr.length != 0) {
            if (this.f24464n == null) {
                this.f24464n = new cj(this);
            }
            this.f24452b = (byte) 1;
            this.f24473w.a(hashCode(), new an(this, this.f24464n, bArr, i().e()));
            return;
        }
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (byte) 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        q M;
        if (H()) {
            try {
                M = M();
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
            if (M != null) {
                M.stopLoading();
                return;
            }
            j s10 = s();
            if (s10 instanceof q) {
                ((q) s10).stopLoading();
            }
            this.f24452b = (byte) 3;
            a((byte) 41);
            if (p() != null) {
                p().a(this, inMobiAdRequestStatus);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(byte b10) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f24456f));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(b10));
        hashMap.put("markupType", n());
        c(hashMap);
        d(hashMap);
        c("AdLoadFailed", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i10, long j10) {
        this.f24463m = false;
        HashMap hashMap = new HashMap();
        hashMap.put("adType", k());
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j10));
        hashMap.put("networkType", ib.b());
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        c("AdGetSignalsFailed", hashMap);
    }

    @Override // com.inmobi.media.s
    public void a(String str, Map<String, Object> map) {
        c(str, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(au auVar) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        Context h10 = h();
        if (o().viewability.omidConfig.omidEnabled && er.a.f25286a.a()) {
            boolean z10 = auVar instanceof bl;
            for (du duVar : f(0)) {
                if (3 == duVar.f25178a) {
                    if (DownloadResource.TYPE_VIDEO == duVar.f25179b.get("creativeType") && z10) {
                        bl blVar = (bl) auVar;
                        try {
                            ds dsVar = new ds(blVar.f24791a, blVar.f24792b, blVar.f24793c, blVar.f24794d, blVar.f24795e, o().vastVideo);
                            byte l10 = l();
                            JSONObject jSONObject = new JSONObject(a(0));
                            fq o10 = o();
                            bb bbVar = this.f24466p;
                            bx bxVar = new bx(l10, jSONObject, o10, bbVar == null ? null : hv.a(bbVar.m()), dsVar);
                            cg cgVar = (cg) bxVar.c("VIDEO").get(0);
                            if (h10 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (cf cfVar : cgVar.f24829u) {
                                    if ("OMID_VIEWABILITY".equals(cfVar.f24922d) && (cfVar instanceof em)) {
                                        em emVar = (em) cfVar;
                                        Map map = (Map) duVar.a("macros", Map.class);
                                        String d10 = d(emVar.f25267g, map);
                                        String str = emVar.f25268h;
                                        String d11 = d(emVar.f24920b, map);
                                        if (!TextUtils.isEmpty(d10) && !TextUtils.isEmpty(str)) {
                                            createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(str, new URL(d11), d10);
                                        } else {
                                            createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(d11));
                                        }
                                        arrayList.add(createVerificationScriptResourceWithoutParameters);
                                    }
                                }
                                if (arrayList.size() != 0) {
                                    bt a10 = a(bxVar);
                                    if (a10 != null) {
                                        duVar.f25179b.put("videoSkippable", Boolean.TRUE);
                                        duVar.f25179b.put("videoSkipOffset", Integer.valueOf(a10.f24823o));
                                    } else {
                                        duVar.f25179b.put("videoSkippable", Boolean.FALSE);
                                        duVar.f25179b.put("videoSkipOffset", 0);
                                    }
                                    duVar.f25179b.put("videoAutoPlay", cgVar.f24830v.get("shouldAutoPlay"));
                                    Map<String, Object> map2 = duVar.f25179b;
                                    map2.put("omidAdSession", eq.a(arrayList, (String) map2.get("creativeType"), this.f24465o.h()));
                                    duVar.f25179b.put("deferred", Boolean.TRUE);
                                }
                            }
                        } catch (Exception e10) {
                            gg.a().a(new hg(e10));
                        }
                    } else {
                        a(h10, duVar);
                    }
                }
            }
        }
    }

    private void a(Context context, du duVar) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        try {
            byte l10 = l();
            JSONObject jSONObject = new JSONObject(a(0));
            fq o10 = o();
            bb bbVar = this.f24466p;
            bt btVar = new bx(l10, jSONObject, o10, bbVar == null ? null : hv.a(bbVar.m()), (ds) null).c("CONTAINER").get(0);
            if (context != null) {
                ArrayList arrayList = new ArrayList();
                for (cf cfVar : btVar.f24829u) {
                    if ("OMID_VIEWABILITY".equals(cfVar.f24922d) && (cfVar instanceof em)) {
                        em emVar = (em) cfVar;
                        Map map = (Map) duVar.a("macros", Map.class);
                        String d10 = d(emVar.f25267g, map);
                        String str = emVar.f25268h;
                        String d11 = d(emVar.f24920b, map);
                        if (!TextUtils.isEmpty(d10) && !TextUtils.isEmpty(str)) {
                            createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(str, new URL(d11), d10);
                        } else {
                            createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(d11));
                        }
                        arrayList.add(createVerificationScriptResourceWithoutParameters);
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
                duVar.f25179b.put("omidAdSession", ep.a(arrayList, this.f24465o.h(), (String) duVar.f25179b.get("creativeType")));
                duVar.f25179b.put("deferred", Boolean.TRUE);
            }
        } catch (Exception e10) {
            gg.a().a(new hg(e10));
        }
    }

    private static bt a(bx bxVar) {
        for (String str : bxVar.e()) {
            bt btVar = bxVar.c(str).get(0);
            if (2 == btVar.f24820l) {
                return btVar;
            }
        }
        return null;
    }

    @Override // com.inmobi.media.ai
    public void a(final String str, final String str2) {
        this.f24473w.a(hashCode(), new af<ad>(this) { // from class: com.inmobi.media.ad.11
            @Override // com.inmobi.media.af
            public final void a() {
                ad adVar = (ad) this.f24512f.get();
                if (adVar != null) {
                    au u10 = adVar.u();
                    if (u10 != null && str != null && u10.f().equals(str2)) {
                        ad.a(adVar, u10, str);
                        String str3 = ad.f24451a;
                        return;
                    }
                    String str4 = ad.f24451a;
                }
            }
        });
    }

    @Override // com.inmobi.media.ai
    public void a(final String str, final String str2, final l lVar, final String str3) {
        this.f24473w.a(hashCode(), new af<ad>(this) { // from class: com.inmobi.media.ad.12
            @Override // com.inmobi.media.af
            public final void a() {
                ad adVar = (ad) this.f24512f.get();
                if (adVar != null) {
                    try {
                        au u10 = adVar.u();
                        if (u10 != null && u10.f().equals(str3)) {
                            lVar.a(str, str2, u10.c());
                            String str4 = ad.f24451a;
                            return;
                        }
                        String str5 = ad.f24451a;
                        lVar.a(str, str2, "");
                    } catch (Exception e10) {
                        String str6 = ad.f24451a;
                        gg.a().a(new hg(e10));
                    }
                }
            }
        });
    }

    @Override // com.inmobi.media.dr
    public void a(au auVar, boolean z10, byte b10) {
        bb bbVar;
        au aa2 = aa();
        if (aa2 == null) {
            return;
        }
        aa2.f();
        String i10 = aa2.i();
        char c10 = 65535;
        switch (i10.hashCode()) {
            case -1470802432:
                if (i10.equals("mediationJson")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1084172778:
                if (i10.equals("inmobiJson")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3213227:
                if (i10.equals("html")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1236050372:
                if (i10.equals("htmlUrl")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        if (c10 == 2 || c10 == 3) {
            return;
        }
        if (c10 == 4) {
            if (j() != 2 || (bbVar = this.f24466p) == null) {
                return;
            }
            bbVar.a(auVar);
            bc r10 = r();
            String h10 = this.f24466p.h();
            if (auVar != null) {
                Set<bn> h11 = auVar.h();
                if (h11.size() == 0) {
                    r10.f24691a.a(r10.f24692b, true, (byte) 0);
                    return;
                }
                final aw awVar = new aw(UUID.randomUUID().toString(), h10, h11, r10.f24694d);
                final bg a10 = bg.a();
                final String a11 = auVar.a();
                a10.f24707a.execute(new Runnable() { // from class: com.inmobi.media.bg.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        bg.this.a(awVar);
                        String unused = bg.f24705b;
                        awVar.f24648b.size();
                        ArrayList arrayList = new ArrayList();
                        ArrayList<String> arrayList2 = new ArrayList();
                        for (bn bnVar : awVar.f24648b) {
                            if (bnVar.f24803b.trim().length() > 0 && bnVar.f24802a == 2) {
                                arrayList.add(bnVar.f24803b);
                            } else {
                                arrayList2.add(bnVar.f24803b);
                            }
                        }
                        bg.a(bg.this, arrayList, a11);
                        bg.this.f();
                        bg.this.a((byte) 26);
                        for (String str : arrayList2) {
                            bg.b(bg.this, str);
                        }
                    }
                });
                return;
            }
            return;
        }
        aa2.i();
        throw new IllegalStateException("Can not handle fallback for markup type: " + aa2.i());
    }

    @Override // com.inmobi.media.k
    public void a(int i10, q qVar, Context context) {
        this.f24454d.indexOf(qVar);
        if (i10 >= 0) {
            this.f24469s = i10;
        } else {
            this.f24469s++;
        }
    }

    public void a(int i10, boolean z10) {
        q qVar;
        if (i10 < 0 || i10 >= this.f24454d.size() || (qVar = this.f24454d.get(i10)) == null) {
            return;
        }
        qVar.d(z10);
    }

    final String a(int i10) {
        if (i10 <= 0 || this.f24472v) {
            if (b(i10) == null) {
                return null;
            }
            return b(i10).j();
        }
        return "";
    }

    @Override // com.inmobi.media.bc.a
    public void a(ba baVar, boolean z10, byte b10) {
        if (this.f24462l || h() == null) {
            return;
        }
        if (b10 != 0) {
            a(b10);
        }
        a(baVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bb bbVar) {
        if (this.f24462l || h() == null) {
            return;
        }
        b(bbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z10) {
            this.f24452b = (byte) 2;
        } else {
            a(inMobiAdRequestStatus, true, (byte) 0);
        }
    }

    public void a(ba baVar, InMobiAdRequestStatus inMobiAdRequestStatus, byte b10) {
        if (this.f24462l || h() == null) {
            return;
        }
        try {
            if (this.f24465o.equals(baVar) && j() == 1) {
                hu.a((byte) 2, "InMobi", "Failed to fetch ad for placement id: " + this.f24465o.toString() + ", reason phrase available in onAdLoadFailed callback.");
                inMobiAdRequestStatus.getMessage();
                this.f24452b = (byte) 3;
                if (b10 != 0) {
                    b(b10);
                }
                a p10 = p();
                if (p10 != null) {
                    p10.a(inMobiAdRequestStatus);
                }
            }
        } catch (Exception e10) {
            hu.a((byte) 1, "InMobi", "Unable to load Ad; SDK encountered an unexpected error");
            gg.a().a(new hg(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(WeakReference<a> weakReference, byte b10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f24452b = (byte) 3;
        if (this.f24462l) {
            return;
        }
        a aVar = weakReference.get();
        if (aVar != null) {
            if ("int".equals(k())) {
                a(aVar, b10);
                return;
            }
            a(b10);
            aVar.a(this, inMobiAdRequestStatus);
            return;
        }
        hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
    }

    @Override // com.inmobi.media.k
    public void a(String str) {
        if (this.f24472v) {
            this.H = str;
        }
    }

    @Override // com.inmobi.media.s
    public void a() {
        if (this.f24462l || h() == null) {
            return;
        }
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ad.9
            @Override // java.lang.Runnable
            public final void run() {
                if (6 == ad.this.j()) {
                    ad adVar = ad.this;
                    adVar.f24452b = (byte) 3;
                    if (adVar.p() != null) {
                        ad adVar2 = ad.this;
                        adVar2.a(adVar2.p(), (byte) 92);
                    }
                }
            }
        });
    }

    @Override // com.inmobi.media.s
    public void a(HashMap<Object, Object> hashMap) {
        if (this.f24462l || h() == null || p() == null) {
            return;
        }
        p().a(hashMap);
    }

    @Override // com.inmobi.media.k
    public int a(q qVar) {
        if (this.f24472v) {
            return this.f24454d.indexOf(qVar);
        }
        return -1;
    }

    static /* synthetic */ void a(ad adVar, au auVar, String str) {
        auVar.a(str);
        bb bbVar = adVar.f24466p;
        if (bbVar != null) {
            bbVar.a(auVar);
        }
    }
}
