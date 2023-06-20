package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.O;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class J implements com.ironsource.mediationsdk.utils.i {
    private static boolean ap = false;
    U A;
    R B;
    com.ironsource.mediationsdk.adunit.c.g C;
    com.ironsource.mediationsdk.adunit.c.h D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    int L;
    C1747u M;
    C1745s N;
    com.ironsource.mediationsdk.impressionData.a O;
    private final String P;
    private final String Q;
    private AbstractAdapter R;
    private AtomicBoolean S;
    private final Object T;
    private AtomicBoolean U;
    private boolean V;
    private List<IronSource.AD_UNIT> W;
    private Set<IronSource.AD_UNIT> X;
    private Set<IronSource.AD_UNIT> Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    final String f26323a;

    /* renamed from: aa  reason: collision with root package name */
    private final String f26324aa;

    /* renamed from: ab  reason: collision with root package name */
    private boolean f26325ab;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f26326ac;

    /* renamed from: ad  reason: collision with root package name */
    private Boolean f26327ad;

    /* renamed from: ae  reason: collision with root package name */
    private IronSourceBannerLayout f26328ae;

    /* renamed from: af  reason: collision with root package name */
    private String f26329af;
    private InitializationListener ag;
    private AtomicBoolean ah;
    private boolean ai;
    private CopyOnWriteArraySet<String> aj;
    private CopyOnWriteArraySet<String> ak;
    private CopyOnWriteArraySet<String> al;
    private C1749w am;
    private com.ironsource.d.b an;
    private ak ao;

    /* renamed from: b  reason: collision with root package name */
    ad f26330b;

    /* renamed from: c  reason: collision with root package name */
    G f26331c;

    /* renamed from: d  reason: collision with root package name */
    Q f26332d;

    /* renamed from: e  reason: collision with root package name */
    C1739m f26333e;

    /* renamed from: f  reason: collision with root package name */
    IronSourceLoggerManager f26334f;

    /* renamed from: g  reason: collision with root package name */
    com.ironsource.mediationsdk.sdk.j f26335g;

    /* renamed from: h  reason: collision with root package name */
    com.ironsource.mediationsdk.logger.b f26336h;

    /* renamed from: i  reason: collision with root package name */
    com.ironsource.mediationsdk.utils.l f26337i;

    /* renamed from: j  reason: collision with root package name */
    public String f26338j;

    /* renamed from: k  reason: collision with root package name */
    public String f26339k;

    /* renamed from: l  reason: collision with root package name */
    String f26340l;

    /* renamed from: m  reason: collision with root package name */
    public String f26341m;

    /* renamed from: n  reason: collision with root package name */
    public Map<String, String> f26342n;

    /* renamed from: o  reason: collision with root package name */
    public String f26343o;

    /* renamed from: p  reason: collision with root package name */
    public String f26344p;

    /* renamed from: q  reason: collision with root package name */
    Context f26345q;

    /* renamed from: r  reason: collision with root package name */
    Boolean f26346r;

    /* renamed from: s  reason: collision with root package name */
    IronSourceSegment f26347s;

    /* renamed from: t  reason: collision with root package name */
    int f26348t;

    /* renamed from: u  reason: collision with root package name */
    boolean f26349u;

    /* renamed from: v  reason: collision with root package name */
    boolean f26350v;

    /* renamed from: w  reason: collision with root package name */
    boolean f26351w;

    /* renamed from: x  reason: collision with root package name */
    boolean f26352x;

    /* renamed from: y  reason: collision with root package name */
    Boolean f26353y;

    /* renamed from: z  reason: collision with root package name */
    B f26354z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.J$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26355a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f26356b;

        static {
            int[] iArr = new int[k.a.a().length];
            f26356b = iArr;
            try {
                int i10 = k.a.f27475a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f26356b;
                int i11 = k.a.f27476b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f26356b;
                int i12 = k.a.f27477c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f26356b;
                int i13 = k.a.f27478d;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr5 = new int[IronSource.AD_UNIT.values().length];
            f26355a = iArr5;
            try {
                iArr5[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26355a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26355a[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26355a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        static volatile J f26357a = new J((byte) 0);
    }

    private J() {
        this.f26323a = J.class.getName();
        this.P = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b7.2.3.1";
        this.Q = "Activity=";
        this.T = new Object();
        this.f26337i = null;
        this.f26338j = null;
        this.f26339k = null;
        this.f26340l = null;
        this.f26341m = null;
        this.f26342n = null;
        this.f26343o = null;
        this.V = false;
        this.f26344p = null;
        this.f26346r = null;
        this.Z = true;
        this.f26324aa = IronSourceConstants.KEY_SESSION_DEPTH;
        this.f26353y = null;
        this.f26334f = IronSourceLoggerManager.getLogger(0);
        com.ironsource.mediationsdk.logger.b bVar = new com.ironsource.mediationsdk.logger.b(null, 1);
        this.f26336h = bVar;
        this.f26334f.addLogger(bVar);
        this.f26335g = new com.ironsource.mediationsdk.sdk.j();
        ad adVar = new ad();
        this.f26330b = adVar;
        adVar.f26797m = this.f26335g;
        G g10 = new G();
        this.f26331c = g10;
        g10.f26261m = this.f26335g;
        Q q10 = new Q();
        this.f26332d = q10;
        q10.f26475b = this.f26335g;
        this.S = new AtomicBoolean();
        this.X = new HashSet();
        this.Y = new HashSet();
        this.f26350v = false;
        this.f26349u = false;
        this.f26325ab = false;
        this.U = new AtomicBoolean(true);
        this.ah = new AtomicBoolean(false);
        this.f26348t = 0;
        this.f26351w = false;
        this.f26352x = false;
        this.f26326ac = false;
        this.f26344p = UUID.randomUUID().toString();
        this.f26327ad = Boolean.FALSE;
        this.J = false;
        this.f26329af = null;
        this.f26354z = null;
        this.A = null;
        this.ag = null;
        this.B = null;
        this.E = false;
        this.F = false;
        this.H = false;
        this.K = false;
        this.aj = new CopyOnWriteArraySet<>();
        this.ak = new CopyOnWriteArraySet<>();
        this.al = new CopyOnWriteArraySet<>();
        this.M = null;
        this.am = null;
        this.N = null;
        this.f26333e = null;
        this.L = 1;
        this.O = new com.ironsource.mediationsdk.impressionData.a();
        this.an = new com.ironsource.d.b();
        this.ao = new ak();
    }

    /* synthetic */ J(byte b10) {
        this();
    }

    private void A() {
        if (this.f26350v) {
            z();
            return;
        }
        com.ironsource.mediationsdk.utils.c cVar = this.f26337i.f27494c.f27234b.f27246i;
        boolean z10 = cVar.f27408a;
        this.H = z10;
        this.I = cVar.f27409b;
        b(IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, z10, 1));
        if (!this.H) {
            y();
        } else if (this.I) {
            w();
        } else {
            x();
        }
    }

    private void B() {
        NetworkSettings a10;
        if (this.f26325ab) {
            C();
            return;
        }
        synchronized (this.f26327ad) {
            this.K = this.f26337i.f27494c.f27236d.f27231g.f27408a;
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("mIsBnProgrammatic = " + this.K);
            ironLog.verbose("mIsBnLoadBeforeInitCompleted = " + this.f26327ad);
            b(IronSourceConstants.TROUBLESHOOTING_BN_FORK, IronSourceUtils.getMediationAdditionalData(false, this.K, 1));
            ArrayList<NetworkSettings> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f26337i.f27480a.f27275e.size(); i10++) {
                String str = this.f26337i.f27480a.f27275e.get(i10);
                if (!TextUtils.isEmpty(str) && (a10 = this.f26337i.f27487b.a(str)) != null) {
                    arrayList.add(a10);
                }
            }
            if (arrayList.size() <= 0) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, this.K, 1);
                a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                b(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
                a(IronSource.AD_UNIT.BANNER, false);
            } else if (this.K) {
                a(arrayList);
            } else {
                com.ironsource.mediationsdk.model.e eVar = this.f26337i.f27494c.f27236d;
                this.f26333e = new C1739m(arrayList, this.f26338j, IronSourceUtils.getUserIdForNetworks(), eVar.f27226b, eVar.f27229e, eVar.f27230f);
                D();
            }
        }
    }

    private void C() {
        this.f26334f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f26337i.f27480a.f27275e.size(); i10++) {
            String str = this.f26337i.f27480a.f27275e.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f26337i.f27487b.a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.al) {
                this.N = new C1745s(arrayList, this.f26337i.f27494c.f27236d, this.f26338j, this.f26339k);
            }
            this.al.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        b(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.BANNER, false);
    }

    private void D() {
        if (this.f26327ad.booleanValue()) {
            this.f26327ad = Boolean.FALSE;
            a(this.f26328ae, this.f26329af);
            this.f26328ae = null;
            this.f26329af = null;
        }
    }

    private boolean E() {
        com.ironsource.mediationsdk.model.m mVar;
        ArrayList<String> arrayList;
        com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
        return (lVar == null || (mVar = lVar.f27480a) == null || (arrayList = mVar.f27271a) == null || arrayList.size() <= 0) ? false : true;
    }

    private boolean F() {
        com.ironsource.mediationsdk.model.m mVar;
        ArrayList<String> arrayList;
        com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
        return (lVar == null || (mVar = lVar.f27480a) == null || (arrayList = mVar.f27274d) == null || arrayList.size() <= 0) ? false : true;
    }

    private boolean G() {
        com.ironsource.mediationsdk.model.g gVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
        return (lVar == null || (gVar = lVar.f27494c) == null || gVar.f27236d == null) ? false : true;
    }

    private boolean H() {
        com.ironsource.mediationsdk.model.m mVar;
        ArrayList<String> arrayList;
        if (G()) {
            com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
            if ((lVar == null || (mVar = lVar.f27480a) == null || (arrayList = mVar.f27275e) == null || arrayList.size() <= 0) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private static boolean I() {
        return ContextProvider.getInstance().getCurrentActiveActivity() != null;
    }

    private void J() {
        if (this.ag == null || !this.ah.compareAndSet(false, true)) {
            return;
        }
        IronLog.CALLBACK.verbose("onInitializationCompleted()");
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
        this.ag.onInitializationComplete();
    }

    private int a(com.ironsource.mediationsdk.model.o oVar) {
        return !this.ai && !this.F && oVar.f27291l.f27421n ? 2 : 1;
    }

    public static J a() {
        return b.f26357a;
    }

    private com.ironsource.mediationsdk.utils.l a(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID);
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            String str2 = this.f26338j;
            if (str2 != null && cachedValueByKeyOfCachedInitResponse.equals(str2) && cachedValueByKeyOfCachedInitResponse2.equals(str)) {
                com.ironsource.mediationsdk.utils.l lVar = new com.ironsource.mediationsdk.utils.l(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
                lVar.f27496e = l.a.f27519b;
                return lVar;
            }
        }
        return null;
    }

    public static String a(Context context) {
        String[] C = com.ironsource.environment.h.C(context);
        return (C == null || C.length != 2) ? "" : C[0];
    }

    private static String a(String str, int i10) {
        if (i10 == 0) {
            return null;
        }
        int i11 = AnonymousClass1.f26356b[i10 - 1];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return "placement " + str + " is capped";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10, JSONObject jSONObject) {
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, jSONObject));
    }

    private void a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f26334f.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    private void a(IronSource.AD_UNIT ad_unit, boolean z10) {
        int i10 = AnonymousClass1.f26355a[ad_unit.ordinal()];
        if (i10 == 1) {
            if (this.f26349u) {
                Iterator<String> it = this.ak.iterator();
                while (it.hasNext()) {
                    ab.a().a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.ak.clear();
            } else if (this.F) {
                if (this.G) {
                    this.G = false;
                    C1744r.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
            } else if (z10 || d() || this.Y.contains(ad_unit)) {
                ac.a().a(false, (AdInfo) null);
            }
        } else if (i10 == 2) {
            if (!this.f26350v) {
                if (this.J) {
                    this.J = false;
                    C1744r.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                return;
            }
            Iterator<String> it2 = this.aj.iterator();
            while (it2.hasNext()) {
                C.a().a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.aj.clear();
        } else if (i10 == 3) {
            if (z10 || k() || this.Y.contains(ad_unit)) {
                this.f26335g.onOfferwallAvailable(false);
            }
        } else if (i10 != 4) {
        } else {
            synchronized (this.f26327ad) {
                if (this.f26327ad.booleanValue()) {
                    this.f26327ad = Boolean.FALSE;
                    C1738l.a().a(this.f26328ae, new IronSourceError(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, "Init had failed"), false);
                    this.f26328ae = null;
                    this.f26329af = null;
                }
            }
        }
    }

    public static void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C.a().f26216a = iSDemandOnlyInterstitialListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        ab.a().f26742a = iSDemandOnlyRewardedVideoListener;
    }

    public static void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayInterstitialListener == null) {
            ironLog.info("ISListener is null");
        } else {
            ironLog.info();
        }
        D.a().a(levelPlayInterstitialListener);
    }

    public static void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayRewardedVideoListener == null) {
            ironLog.info("RVListener is null");
        } else {
            ironLog.info();
        }
        ac.a().f26761b = levelPlayRewardedVideoListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, com.ironsource.d.a aVar) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    aVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                aVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        String str2 = "networkKey = " + str;
        if (jSONObject != null) {
            str2 = str2 + " networkData = " + jSONObject;
        }
        IronLog.API.verbose(str2);
        C1730d.a().a(str, jSONObject);
    }

    private void a(ArrayList<NetworkSettings> arrayList) {
        this.f26334f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.B = new R(arrayList, new com.ironsource.mediationsdk.c.b(this.f26338j, IronSourceUtils.getUserIdForNetworks(), this.f26337i.f27494c.f27236d), com.ironsource.mediationsdk.utils.k.a().b(), this.f26347s);
        D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(JSONObject jSONObject, Object[][] objArr) {
        for (int i10 = 0; i10 <= 0; i10++) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e10), 3);
                return;
            }
        }
    }

    public static void a(boolean z10) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z10, 1);
        C1730d.a().b(z10);
    }

    private synchronized void a(boolean z10, IronSource.AD_UNIT... ad_unitArr) {
        String str;
        String str2;
        int i10 = 0;
        for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
            if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                this.f26352x = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                this.f26326ac = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                this.f26351w = true;
            }
        }
        if (O.a().b() == O.a.INIT_FAILED) {
            try {
                if (this.f26335g != null) {
                    int length = ad_unitArr.length;
                    while (i10 < length) {
                        IronSource.AD_UNIT ad_unit2 = ad_unitArr[i10];
                        if (!this.X.contains(ad_unit2)) {
                            a(ad_unit2, true);
                        }
                        i10++;
                    }
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        } else if (!this.V) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z10);
            int length2 = ad_unitArr.length;
            boolean z11 = false;
            while (i10 < length2) {
                IronSource.AD_UNIT ad_unit3 = ad_unitArr[i10];
                if (this.X.contains(ad_unit3)) {
                    this.f26334f.log(IronSourceLogger.IronSourceTag.API, ad_unit3 + " ad unit has started initializing.", 3);
                } else {
                    this.X.add(ad_unit3);
                    this.Y.add(ad_unit3);
                    try {
                        mediationAdditionalData.put(ad_unit3.toString(), true);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    z11 = true;
                }
                i10++;
            }
            if (z11) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    String str3 = ",androidx=" + IronSourceUtils.isAndroidXAvailable();
                    String str4 = ",Activity=" + I();
                    if (a.AnonymousClass1.d()) {
                        sb2.append(IronSourceConstants.IS_APP_LANGUAGE_KOTLIN);
                        str2 = a.AnonymousClass1.c();
                    } else {
                        str2 = IronSourceConstants.IS_APP_LANGUAGE_JAVA;
                    }
                    sb2.append(str2);
                    sb2.append(str3);
                    if (o()) {
                        sb2.append(str4);
                    }
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
                    int i11 = this.f26348t + 1;
                    this.f26348t = i11;
                    mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i11);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(14, mediationAdditionalData));
            }
            return;
        } else {
            O.a().b(z10);
            if (this.W == null) {
                return;
            }
            JSONObject mediationAdditionalData2 = IronSourceUtils.getMediationAdditionalData(z10);
            boolean z12 = false;
            for (IronSource.AD_UNIT ad_unit4 : ad_unitArr) {
                if (this.X.contains(ad_unit4)) {
                    a(ad_unit4);
                } else {
                    this.X.add(ad_unit4);
                    this.Y.add(ad_unit4);
                    try {
                        mediationAdditionalData2.put(ad_unit4.toString(), true);
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                    List<IronSource.AD_UNIT> list = this.W;
                    if (list == null || !list.contains(ad_unit4)) {
                        a(ad_unit4, false);
                    } else {
                        b(ad_unit4);
                    }
                    z12 = true;
                }
            }
            if (z12) {
                try {
                    StringBuilder sb3 = new StringBuilder();
                    String str5 = ",androidx=" + IronSourceUtils.isAndroidXAvailable();
                    String str6 = ",Activity=" + I();
                    if (a.AnonymousClass1.d()) {
                        sb3.append(IronSourceConstants.IS_APP_LANGUAGE_KOTLIN);
                        str = a.AnonymousClass1.c();
                    } else {
                        str = IronSourceConstants.IS_APP_LANGUAGE_JAVA;
                    }
                    sb3.append(str);
                    sb3.append(str5);
                    if (o()) {
                        sb3.append(str6);
                    }
                    mediationAdditionalData2.put(IronSourceConstants.EVENTS_EXT1, sb3.toString());
                    int i12 = this.f26348t + 1;
                    this.f26348t = i12;
                    mediationAdditionalData2.put(IronSourceConstants.KEY_SESSION_DEPTH, i12);
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(14, mediationAdditionalData2));
            }
            return;
        }
    }

    private static boolean a(AbstractC1728b abstractC1728b) {
        return abstractC1728b.f26988k > 0 && abstractC1728b.f26989l > 0;
    }

    private static boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    private com.ironsource.mediationsdk.utils.l b(Context context, String str, a aVar) {
        com.ironsource.mediationsdk.utils.l lVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a10 = a(context);
            if (TextUtils.isEmpty(a10)) {
                a10 = com.ironsource.environment.h.x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = a10;
            IronSourceSegment ironSourceSegment = this.f26347s;
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.f26338j, str, str2, this.f26343o, this.F, ironSourceSegment != null ? ironSourceSegment.a() : null), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.getSerr() == 1) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString("response", null);
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(com.ironsource.mediationsdk.utils.g.a().b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    ironLog.warning("encoded response invalid - return null");
                    if (!ap) {
                        ap = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put("status", "false");
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            com.ironsource.mediationsdk.utils.l lVar2 = new com.ironsource.mediationsdk.utils.l(context, this.f26338j, str, stringFromURL);
            try {
                lVar2.f27496e = l.a.f27520c;
                if (lVar2.b()) {
                    return lVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e11) {
                e = e11;
                lVar = lVar2;
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.warning("exception = " + e);
                e.printStackTrace();
                return lVar;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private static void b(int i10, JSONObject jSONObject) {
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, jSONObject));
    }

    private void b(IronSource.AD_UNIT ad_unit) {
        int i10 = AnonymousClass1.f26355a[ad_unit.ordinal()];
        if (i10 == 1) {
            s();
        } else if (i10 == 2) {
            A();
        } else if (i10 == 3) {
            this.f26332d.a(this.f26338j, this.f26339k);
        } else if (i10 != 4) {
        } else {
            B();
        }
    }

    private Placement p(String str) {
        com.ironsource.mediationsdk.model.o oVar = this.f26337i.f27494c.f27233a;
        if (oVar != null) {
            Iterator<Placement> it = oVar.f27280a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    private void p() {
        this.f26334f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> u10 = u();
        if (u10.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.L);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        com.ironsource.mediationsdk.model.o oVar = this.f26337i.f27494c.f27233a;
        this.f26354z = oVar.f27291l.f27421n ? new K(u10, oVar, this.f26338j, IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.utils.k.a().b(), this.f26347s) : new X(u10, oVar, this.f26338j, IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.utils.k.a().b(), this.f26347s);
        Boolean bool = this.f26346r;
        if (bool != null) {
            this.f26354z.a(this.f26345q, bool.booleanValue());
            if (this.f26346r.booleanValue()) {
                this.f26330b.a(this.f26345q, false);
            }
        }
    }

    private void q() {
        this.f26334f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f26337i.f27480a.f27271a.size(); i10++) {
            String str = this.f26337i.f27480a.f27271a.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f26337i.f27487b.a(str));
            }
        }
        if (arrayList.size() <= 0) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.ak) {
            this.am = new C1749w(arrayList, this.f26337i.f27494c.f27233a, this.f26338j, this.f26339k);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        Iterator<String> it = this.ak.iterator();
        while (it.hasNext()) {
            this.am.a(it.next(), (String) null, false);
        }
        this.ak.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            com.ironsource.mediationsdk.model.Placement r7 = r6.p(r7)     // Catch: java.lang.Exception -> L29
            if (r7 != 0) goto Lf
            com.ironsource.mediationsdk.model.Placement r7 = r6.b()     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L2b
        Lf:
            if (r7 != 0) goto L34
            java.lang.String r2 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f26334f     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Ld
            r3.log(r4, r2, r0)     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Ld
            r4 = 1021(0x3fd, float:1.431E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.ac r2 = com.ironsource.mediationsdk.ac.a()     // Catch: java.lang.Exception -> Ld
            r2.a(r3, r1)     // Catch: java.lang.Exception -> Ld
            return
        L29:
            r2 = move-exception
            r7 = r1
        L2b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f26334f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r3.logException(r4, r5, r2)
        L34:
            com.ironsource.mediationsdk.adunit.c.h r2 = r6.D
            if (r2 == 0) goto L44
            boolean r3 = r6.F
            if (r3 != 0) goto L40
            boolean r3 = r6.ai
            if (r3 == 0) goto L44
        L40:
            r2.a(r7)
            return
        L44:
            com.ironsource.mediationsdk.B r2 = r6.f26354z
            if (r2 == 0) goto L4c
            r2.a(r7)
            return
        L4c:
            java.lang.String r7 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f26334f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.log(r3, r7, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 1023(0x3ff, float:1.434E-42)
            r0.<init>(r2, r7)
            com.ironsource.mediationsdk.ac r7 = com.ironsource.mediationsdk.ac.a()
            r7.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.q(java.lang.String):void");
    }

    private Placement r(String str) {
        Placement p10 = p(str);
        if (p10 == null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            p10 = b();
            if (p10 == null) {
                this.f26334f.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a10 = a(p10.getPlacementName(), com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), p10));
        if (TextUtils.isEmpty(a10)) {
            return p10;
        }
        this.f26334f.log(IronSourceLogger.IronSourceTag.API, a10, 1);
        ac.a().a(ErrorBuilder.buildCappedPerPlacementError(a10), (AdInfo) null);
        return null;
    }

    private void r() {
        NetworkSettings a10;
        NetworkSettings a11;
        NetworkSettings a12;
        com.ironsource.mediationsdk.model.o oVar = this.f26337i.f27494c.f27233a;
        int i10 = oVar.f27284e;
        for (int i11 = 0; i11 < this.f26337i.f27480a.f27271a.size(); i11++) {
            String str = this.f26337i.f27480a.f27271a.get(i11);
            if (!TextUtils.isEmpty(str) && (a12 = this.f26337i.f27487b.a(str)) != null) {
                ae aeVar = new ae(a12, i10);
                if (a(aeVar)) {
                    ad adVar = this.f26330b;
                    aeVar.f26959s = adVar;
                    aeVar.f26991n = i11 + 1;
                    adVar.a((AbstractC1728b) aeVar);
                }
            }
        }
        if (this.f26330b.f26650c.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, this.L);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        boolean a13 = oVar.f27281b.a();
        ad adVar2 = this.f26330b;
        adVar2.f26798n = a13;
        adVar2.f26649b = oVar.f27282c;
        adVar2.f26799o = oVar.f27287h;
        String c10 = this.f26337i.c();
        if (!TextUtils.isEmpty(c10) && (a11 = this.f26337i.f27487b.a(c10)) != null) {
            ae aeVar2 = new ae(a11, i10);
            if (a(aeVar2)) {
                ad adVar3 = this.f26330b;
                aeVar2.f26959s = adVar3;
                IronSourceLoggerManager ironSourceLoggerManager = adVar3.f26655h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager.log(ironSourceTag, aeVar2.f26981d + " is set as backfill", 0);
                adVar3.f26651d = aeVar2;
            }
        }
        String d10 = this.f26337i.d();
        if (!TextUtils.isEmpty(d10) && (a10 = this.f26337i.f27487b.a(d10)) != null) {
            ae aeVar3 = new ae(a10, i10);
            if (a(aeVar3)) {
                ad adVar4 = this.f26330b;
                aeVar3.f26959s = adVar4;
                IronSourceLoggerManager ironSourceLoggerManager2 = adVar4.f26655h;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager2.log(ironSourceTag2, aeVar3.f26981d + " is set as premium", 0);
                adVar4.f26652e = aeVar3;
            }
        }
        ad adVar5 = this.f26330b;
        adVar5.f26800p = new C1752z(oVar.f27288i, adVar5);
        this.f26330b.a(this.f26338j, IronSourceUtils.getUserIdForNetworks());
    }

    private InterstitialPlacement s(String str) {
        com.ironsource.mediationsdk.model.h hVar = this.f26337i.f27494c.f27234b;
        if (hVar != null) {
            Iterator<InterstitialPlacement> it = hVar.f27238a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    private void s() {
        if (this.f26349u) {
            q();
            return;
        }
        com.ironsource.mediationsdk.model.o oVar = this.f26337i.f27494c.f27233a;
        com.ironsource.mediationsdk.utils.c cVar = oVar.f27291l;
        this.E = cVar.f27408a || this.F;
        this.ai = cVar.f27409b;
        int a10 = a(oVar);
        this.L = a10;
        a((int) IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, this.E, a10));
        if (this.F || this.ai) {
            t();
        } else if (this.E) {
            p();
        } else {
            r();
        }
    }

    private void t() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> u10 = u();
        if (u10.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.L);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        com.ironsource.mediationsdk.adunit.c.h hVar = new com.ironsource.mediationsdk.adunit.c.h(u10, this.f26337i.f27494c.f27233a, IronSourceUtils.getUserIdForNetworks(), this.F, com.ironsource.mediationsdk.utils.k.a().b(), this.f26347s);
        this.D = hVar;
        Boolean bool = this.f26346r;
        if (bool != null) {
            hVar.b(bool.booleanValue());
        }
        if (this.G && this.F) {
            this.G = false;
            this.D.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void t(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.s(r7)     // Catch: java.lang.Exception -> L29
            if (r7 != 0) goto Le
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.g()     // Catch: java.lang.Exception -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L2d
        Le:
            if (r7 != 0) goto L36
            java.lang.String r1 = "showProgrammaticInterstitial error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f26334f     // Catch: java.lang.Exception -> Lc
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Lc
            r4 = 3
            r2.log(r3, r1, r4)     // Catch: java.lang.Exception -> Lc
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Lc
            r3 = 1020(0x3fc, float:1.43E-42)
            r2.<init>(r3, r1)     // Catch: java.lang.Exception -> Lc
            com.ironsource.mediationsdk.D r1 = com.ironsource.mediationsdk.D.a()     // Catch: java.lang.Exception -> Lc
            r1.a(r2, r0)     // Catch: java.lang.Exception -> Lc
            return
        L29:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L2d:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r6.f26334f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticInterstitial()"
            r1.logException(r2, r3, r0)
        L36:
            boolean r0 = r6.I
            if (r0 == 0) goto L45
            com.ironsource.mediationsdk.adunit.c.g r0 = r6.C
            com.ironsource.mediationsdk.model.Placement r1 = new com.ironsource.mediationsdk.model.Placement
            r1.<init>(r7)
            r0.a(r1)
            return
        L45:
            com.ironsource.mediationsdk.U r0 = r6.A
            java.lang.String r7 = r7.getPlacementName()
            r0.a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.t(java.lang.String):void");
    }

    private InterstitialPlacement u(String str) {
        InterstitialPlacement s10 = s(str);
        if (s10 == null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            s10 = g();
            if (s10 == null) {
                this.f26334f.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a10 = a(s10.getPlacementName(), w(s10.getPlacementName()));
        if (TextUtils.isEmpty(a10)) {
            return s10;
        }
        this.f26334f.log(IronSourceLogger.IronSourceTag.API, a10, 1);
        this.f26335g.f27339e = s10;
        D.a().a(ErrorBuilder.buildCappedPerPlacementError(a10), (AdInfo) null);
        return null;
    }

    private List<NetworkSettings> u() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f26337i.f27480a.f27271a.size(); i10++) {
            String str = this.f26337i.f27480a.f27271a.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f26337i.f27487b.a(str));
            }
        }
        return arrayList;
    }

    private List<NetworkSettings> v() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f26337i.f27480a.f27274d.size(); i10++) {
            String str = this.f26337i.f27480a.f27274d.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f26337i.f27487b.a(str));
            }
        }
        return arrayList;
    }

    private static boolean v(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private int w(String str) {
        com.ironsource.mediationsdk.model.g gVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
        if (lVar == null || (gVar = lVar.f27494c) == null || gVar.f27234b == null) {
            return k.a.f27478d;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = s(str);
            if (interstitialPlacement == null && (interstitialPlacement = g()) == null) {
                this.f26334f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return interstitialPlacement == null ? k.a.f27478d : com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement);
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> v10 = v();
        if (v10.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        com.ironsource.mediationsdk.adunit.c.g gVar = new com.ironsource.mediationsdk.adunit.c.g(v10, this.f26337i.f27494c.f27234b, IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.utils.k.a().b(), this.f26347s);
        this.C = gVar;
        Boolean bool = this.f26346r;
        if (bool != null) {
            gVar.b(bool.booleanValue());
        }
        if (this.J) {
            this.J = false;
            this.C.d();
        }
    }

    private com.ironsource.mediationsdk.model.f x(String str) {
        com.ironsource.mediationsdk.model.f a10;
        com.ironsource.mediationsdk.model.e eVar = this.f26337i.f27494c.f27236d;
        if (eVar == null) {
            return null;
        }
        return (TextUtils.isEmpty(str) || (a10 = eVar.a(str)) == null) ? eVar.a() : a10;
    }

    private void x() {
        this.f26334f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> v10 = v();
        if (v10.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        U u10 = new U(v10, this.f26337i.f27494c.f27234b, this.f26338j, IronSourceUtils.getUserIdForNetworks(), this.f26337i.f27494c.f27234b.f27243f, com.ironsource.mediationsdk.utils.k.a().b(), this.f26347s);
        this.A = u10;
        Boolean bool = this.f26346r;
        if (bool != null) {
            u10.a(bool.booleanValue());
            if (this.f26346r.booleanValue()) {
                this.f26331c.a(this.f26345q, false);
            }
        }
        if (this.J) {
            this.J = false;
            this.A.e();
        }
    }

    private void y() {
        NetworkSettings a10;
        com.ironsource.mediationsdk.model.h hVar = this.f26337i.f27494c.f27234b;
        int i10 = hVar.f27242e;
        this.f26331c.f26262n.a(IronSource.AD_UNIT.INTERSTITIAL, hVar.f27243f);
        for (int i11 = 0; i11 < this.f26337i.f27480a.f27274d.size(); i11++) {
            String str = this.f26337i.f27480a.f27274d.get(i11);
            if (!TextUtils.isEmpty(str) && (a10 = this.f26337i.f27487b.a(str)) != null) {
                H h10 = new H(a10, i10);
                if (a(h10)) {
                    G g10 = this.f26331c;
                    h10.f26274s = g10;
                    h10.f26991n = i11 + 1;
                    g10.a((AbstractC1728b) h10);
                }
            }
        }
        if (this.f26331c.f26650c.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        int i12 = hVar.f27240c;
        G g11 = this.f26331c;
        g11.f26649b = i12;
        g11.a(this.f26338j, IronSourceUtils.getUserIdForNetworks());
        if (this.J) {
            this.J = false;
            this.f26331c.c();
        }
    }

    private void z() {
        this.f26334f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f26337i.f27480a.f27274d.size(); i10++) {
            String str = this.f26337i.f27480a.f27274d.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f26337i.f27487b.a(str));
            }
        }
        if (arrayList.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.aj) {
            this.M = new C1747u(arrayList, this.f26337i.f27494c.f27234b, this.f26338j, this.f26339k);
        }
        Iterator<String> it = this.aj.iterator();
        while (it.hasNext()) {
            this.M.a(it.next(), (String) null, false);
        }
        this.aj.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f7 A[Catch: all -> 0x032e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x000e, B:11:0x0016, B:17:0x0068, B:19:0x0099, B:21:0x00a5, B:23:0x00ab, B:25:0x00b7, B:27:0x00bd, B:29:0x00c9, B:31:0x00cf, B:33:0x00db, B:35:0x00e7, B:36:0x0167, B:41:0x01f7, B:42:0x0277, B:46:0x0305, B:48:0x030b, B:49:0x031e, B:44:0x027d, B:45:0x02ff, B:38:0x016d, B:39:0x01ef, B:50:0x032c, B:13:0x001c, B:15:0x002d), top: B:55:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x030b A[Catch: all -> 0x032e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x000e, B:11:0x0016, B:17:0x0068, B:19:0x0099, B:21:0x00a5, B:23:0x00ab, B:25:0x00b7, B:27:0x00bd, B:29:0x00c9, B:31:0x00cf, B:33:0x00db, B:35:0x00e7, B:36:0x0167, B:41:0x01f7, B:42:0x0277, B:46:0x0305, B:48:0x030b, B:49:0x031e, B:44:0x027d, B:45:0x02ff, B:38:0x016d, B:39:0x01ef, B:50:0x032c, B:13:0x001c, B:15:0x002d), top: B:55:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.mediationsdk.utils.l a(android.content.Context r11, java.lang.String r12, com.ironsource.mediationsdk.J.a r13) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.J$a):com.ironsource.mediationsdk.utils.l");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0120, code lost:
        if (r9 != null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a A[Catch: all -> 0x0215, TryCatch #4 {, blocks: (B:5:0x0004, B:11:0x0014, B:13:0x0018, B:16:0x002b, B:18:0x002f, B:23:0x0045, B:29:0x0076, B:31:0x0082, B:34:0x0098, B:36:0x009f, B:38:0x00a9, B:41:0x00bf, B:42:0x00c1, B:45:0x00c8, B:51:0x00d4, B:52:0x00d6, B:60:0x00eb, B:62:0x00f1, B:65:0x0107, B:67:0x0113, B:69:0x0122, B:72:0x012c, B:77:0x013a, B:80:0x0145, B:82:0x0152, B:85:0x0166, B:87:0x016e, B:90:0x0186, B:91:0x0192, B:97:0x01c1, B:99:0x01d0, B:102:0x01f8, B:104:0x020e, B:94:0x019b, B:96:0x01be, B:73:0x0131, B:24:0x004d, B:26:0x0057, B:43:0x00c2, B:44:0x00c7, B:53:0x00d7, B:55:0x00db, B:56:0x00e7, B:59:0x00ea), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145 A[Catch: all -> 0x0215, TryCatch #4 {, blocks: (B:5:0x0004, B:11:0x0014, B:13:0x0018, B:16:0x002b, B:18:0x002f, B:23:0x0045, B:29:0x0076, B:31:0x0082, B:34:0x0098, B:36:0x009f, B:38:0x00a9, B:41:0x00bf, B:42:0x00c1, B:45:0x00c8, B:51:0x00d4, B:52:0x00d6, B:60:0x00eb, B:62:0x00f1, B:65:0x0107, B:67:0x0113, B:69:0x0122, B:72:0x012c, B:77:0x013a, B:80:0x0145, B:82:0x0152, B:85:0x0166, B:87:0x016e, B:90:0x0186, B:91:0x0192, B:97:0x01c1, B:99:0x01d0, B:102:0x01f8, B:104:0x020e, B:94:0x019b, B:96:0x01be, B:73:0x0131, B:24:0x004d, B:26:0x0057, B:43:0x00c2, B:44:0x00c7, B:53:0x00d7, B:55:0x00db, B:56:0x00e7, B:59:0x00ea), top: B:117:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(android.app.Activity r9, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.a(android.app.Activity, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout, java.lang.String, java.lang.String):void");
    }

    public final synchronized void a(Activity activity, String str, String str2) {
        if (str2 != null) {
            b(activity, str, str2);
            return;
        }
        this.f26334f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
        ab.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000e, B:10:0x0012, B:12:0x001c, B:37:0x0087, B:13:0x0036, B:15:0x003e, B:17:0x0042, B:18:0x0046, B:20:0x004e, B:21:0x0051, B:23:0x0059, B:25:0x005d, B:26:0x0061, B:28:0x0069, B:29:0x006c, B:31:0x0074, B:33:0x0078, B:34:0x007c, B:36:0x0084, B:51:0x00bf, B:53:0x00c3, B:54:0x00cd, B:55:0x00d8, B:57:0x00de, B:38:0x008a, B:40:0x008e, B:42:0x009b, B:44:0x009f, B:46:0x00ac, B:48:0x00b0, B:49:0x00b6, B:45:0x00a5, B:41:0x0094), top: B:63:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000e, B:10:0x0012, B:12:0x001c, B:37:0x0087, B:13:0x0036, B:15:0x003e, B:17:0x0042, B:18:0x0046, B:20:0x004e, B:21:0x0051, B:23:0x0059, B:25:0x005d, B:26:0x0061, B:28:0x0069, B:29:0x006c, B:31:0x0074, B:33:0x0078, B:34:0x007c, B:36:0x0084, B:51:0x00bf, B:53:0x00c3, B:54:0x00cd, B:55:0x00d8, B:57:0x00de, B:38:0x008a, B:40:0x008e, B:42:0x009b, B:44:0x009f, B:46:0x00ac, B:48:0x00b0, B:49:0x00b6, B:45:0x00a5, B:41:0x0094), top: B:63:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(android.content.Context r8, java.lang.String r9, com.ironsource.mediationsdk.sdk.InitializationListener r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: all -> 0x02f4, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x014f, B:56:0x015f, B:58:0x0173, B:62:0x017c, B:63:0x0181, B:65:0x0185, B:67:0x018b, B:68:0x01b0, B:70:0x01b4, B:72:0x01c7, B:73:0x01cf, B:75:0x01d9, B:76:0x01e2, B:79:0x01f5, B:81:0x0219, B:82:0x0222, B:84:0x024c, B:85:0x0255, B:87:0x025c, B:89:0x0265, B:90:0x0268, B:92:0x0273, B:94:0x0277, B:95:0x0283, B:99:0x0292, B:98:0x028f, B:100:0x02a2, B:102:0x02ac, B:103:0x02b5, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d2, B:110:0x02e3, B:113:0x02e8), top: B:121:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x02f4, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x014f, B:56:0x015f, B:58:0x0173, B:62:0x017c, B:63:0x0181, B:65:0x0185, B:67:0x018b, B:68:0x01b0, B:70:0x01b4, B:72:0x01c7, B:73:0x01cf, B:75:0x01d9, B:76:0x01e2, B:79:0x01f5, B:81:0x0219, B:82:0x0222, B:84:0x024c, B:85:0x0255, B:87:0x025c, B:89:0x0265, B:90:0x0268, B:92:0x0273, B:94:0x0277, B:95:0x0283, B:99:0x0292, B:98:0x028f, B:100:0x02a2, B:102:0x02ac, B:103:0x02b5, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d2, B:110:0x02e3, B:113:0x02e8), top: B:121:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df A[Catch: all -> 0x02f4, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x014f, B:56:0x015f, B:58:0x0173, B:62:0x017c, B:63:0x0181, B:65:0x0185, B:67:0x018b, B:68:0x01b0, B:70:0x01b4, B:72:0x01c7, B:73:0x01cf, B:75:0x01d9, B:76:0x01e2, B:79:0x01f5, B:81:0x0219, B:82:0x0222, B:84:0x024c, B:85:0x0255, B:87:0x025c, B:89:0x0265, B:90:0x0268, B:92:0x0273, B:94:0x0277, B:95:0x0283, B:99:0x0292, B:98:0x028f, B:100:0x02a2, B:102:0x02ac, B:103:0x02b5, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d2, B:110:0x02e3, B:113:0x02e8), top: B:121:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef A[Catch: all -> 0x02f4, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x014f, B:56:0x015f, B:58:0x0173, B:62:0x017c, B:63:0x0181, B:65:0x0185, B:67:0x018b, B:68:0x01b0, B:70:0x01b4, B:72:0x01c7, B:73:0x01cf, B:75:0x01d9, B:76:0x01e2, B:79:0x01f5, B:81:0x0219, B:82:0x0222, B:84:0x024c, B:85:0x0255, B:87:0x025c, B:89:0x0265, B:90:0x0268, B:92:0x0273, B:94:0x0277, B:95:0x0283, B:99:0x0292, B:98:0x028f, B:100:0x02a2, B:102:0x02ac, B:103:0x02b5, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d2, B:110:0x02e3, B:113:0x02e8), top: B:121:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133 A[Catch: all -> 0x02f4, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x014f, B:56:0x015f, B:58:0x0173, B:62:0x017c, B:63:0x0181, B:65:0x0185, B:67:0x018b, B:68:0x01b0, B:70:0x01b4, B:72:0x01c7, B:73:0x01cf, B:75:0x01d9, B:76:0x01e2, B:79:0x01f5, B:81:0x0219, B:82:0x0222, B:84:0x024c, B:85:0x0255, B:87:0x025c, B:89:0x0265, B:90:0x0268, B:92:0x0273, B:94:0x0277, B:95:0x0283, B:99:0x0292, B:98:0x028f, B:100:0x02a2, B:102:0x02ac, B:103:0x02b5, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d2, B:110:0x02e3, B:113:0x02e8), top: B:121:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f A[Catch: all -> 0x02f4, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x014f, B:56:0x015f, B:58:0x0173, B:62:0x017c, B:63:0x0181, B:65:0x0185, B:67:0x018b, B:68:0x01b0, B:70:0x01b4, B:72:0x01c7, B:73:0x01cf, B:75:0x01d9, B:76:0x01e2, B:79:0x01f5, B:81:0x0219, B:82:0x0222, B:84:0x024c, B:85:0x0255, B:87:0x025c, B:89:0x0265, B:90:0x0268, B:92:0x0273, B:94:0x0277, B:95:0x0283, B:99:0x0292, B:98:0x028f, B:100:0x02a2, B:102:0x02ac, B:103:0x02b5, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d2, B:110:0x02e3, B:113:0x02e8), top: B:121:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185 A[Catch: all -> 0x02f4, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x014f, B:56:0x015f, B:58:0x0173, B:62:0x017c, B:63:0x0181, B:65:0x0185, B:67:0x018b, B:68:0x01b0, B:70:0x01b4, B:72:0x01c7, B:73:0x01cf, B:75:0x01d9, B:76:0x01e2, B:79:0x01f5, B:81:0x0219, B:82:0x0222, B:84:0x024c, B:85:0x0255, B:87:0x025c, B:89:0x0265, B:90:0x0268, B:92:0x0273, B:94:0x0277, B:95:0x0283, B:99:0x0292, B:98:0x028f, B:100:0x02a2, B:102:0x02ac, B:103:0x02b5, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d2, B:110:0x02e3, B:113:0x02e8), top: B:121:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4 A[Catch: all -> 0x02f4, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x014f, B:56:0x015f, B:58:0x0173, B:62:0x017c, B:63:0x0181, B:65:0x0185, B:67:0x018b, B:68:0x01b0, B:70:0x01b4, B:72:0x01c7, B:73:0x01cf, B:75:0x01d9, B:76:0x01e2, B:79:0x01f5, B:81:0x0219, B:82:0x0222, B:84:0x024c, B:85:0x0255, B:87:0x025c, B:89:0x0265, B:90:0x0268, B:92:0x0273, B:94:0x0277, B:95:0x0283, B:99:0x0292, B:98:0x028f, B:100:0x02a2, B:102:0x02ac, B:103:0x02b5, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d2, B:110:0x02e3, B:113:0x02e8), top: B:121:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f5 A[Catch: all -> 0x02f4, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0018, B:14:0x001c, B:16:0x0020, B:18:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0040, B:24:0x0048, B:25:0x004a, B:30:0x0065, B:32:0x0081, B:33:0x008b, B:35:0x00bb, B:37:0x00c4, B:39:0x00ca, B:40:0x00d2, B:43:0x00e9, B:45:0x00ef, B:46:0x00f1, B:50:0x0109, B:51:0x0123, B:53:0x0133, B:54:0x014f, B:56:0x015f, B:58:0x0173, B:62:0x017c, B:63:0x0181, B:65:0x0185, B:67:0x018b, B:68:0x01b0, B:70:0x01b4, B:72:0x01c7, B:73:0x01cf, B:75:0x01d9, B:76:0x01e2, B:79:0x01f5, B:81:0x0219, B:82:0x0222, B:84:0x024c, B:85:0x0255, B:87:0x025c, B:89:0x0265, B:90:0x0268, B:92:0x0273, B:94:0x0277, B:95:0x0283, B:99:0x0292, B:98:0x028f, B:100:0x02a2, B:102:0x02ac, B:103:0x02b5, B:41:0x00d6, B:42:0x00df, B:26:0x004d, B:28:0x0055, B:29:0x005f, B:107:0x02d2, B:110:0x02e3, B:113:0x02e8), top: B:121:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(android.content.Context r9, java.lang.String r10, boolean r11, com.ironsource.mediationsdk.sdk.InitializationListener r12, com.ironsource.mediationsdk.IronSource.AD_UNIT... r13) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(AbstractAdapter abstractAdapter) {
        this.R = abstractAdapter;
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementName = " + str);
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            StringBuilder sb2 = new StringBuilder("loadBanner can't be called - ");
            sb2.append(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            String sb3 = sb2.toString();
            this.f26334f.log(IronSourceLogger.IronSourceTag.API, sb3, 3);
            C1738l.a().a(ironSourceBannerLayout, ErrorBuilder.buildLoadFailedError(sb3), false);
        } else if (!this.f26326ac) {
            this.f26334f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            C1738l.a().a(ironSourceBannerLayout, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"), false);
        } else if (ironSourceBannerLayout.getSize().getDescription().equals("CUSTOM") && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.f26334f.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            C1738l.a().a(ironSourceBannerLayout, ErrorBuilder.unsupportedBannerSize(""), false);
        } else {
            O.a b10 = O.a().b();
            if (b10 == O.a.INIT_FAILED) {
                this.f26334f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                C1738l.a().a(ironSourceBannerLayout, new IronSourceError(600, "Init() had failed"), false);
            } else if (b10 == O.a.INIT_IN_PROGRESS) {
                if (O.a().c()) {
                    this.f26334f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C1738l.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "Init had failed"), false);
                    return;
                }
                this.f26328ae = ironSourceBannerLayout;
                this.f26327ad = Boolean.TRUE;
                this.f26329af = str;
            } else if (!H()) {
                this.f26334f.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
                C1738l.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"), false);
            } else {
                synchronized (this.f26327ad) {
                    C1739m c1739m = this.f26333e;
                    if (c1739m == null && this.B == null) {
                        this.f26328ae = ironSourceBannerLayout;
                        this.f26327ad = Boolean.TRUE;
                        this.f26329af = str;
                    } else if (this.K) {
                        this.B.a(ironSourceBannerLayout, x(str));
                    } else {
                        c1739m.a(ironSourceBannerLayout, x(str));
                    }
                }
            }
        }
    }

    public final synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (levelPlayRewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.f26351w) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.F = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.F = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        ac.a().f26761b = levelPlayRewardedVideoManualListener;
    }

    public final synchronized void a(RewardedVideoManualListener rewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (rewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.f26351w) {
            if (rewardedVideoManualListener == null) {
                this.F = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.F = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        this.f26335g.f27335a = rewardedVideoManualListener;
        ac.a().f26760a = rewardedVideoManualListener;
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f26335g != null) {
                for (IronSource.AD_UNIT ad_unit : this.X) {
                    a(ad_unit, true);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            ironLog.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            ironLog.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                C1730d.a().a(metaDataKey, metaDataValue);
            } else if (O.a().b() == O.a.INITIATED && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                ironLog.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                com.ironsource.mediationsdk.utils.k.a().a(metaDataKey, metaDataValue);
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C1730d.a().f27024c;
                concurrentHashMap.putAll(com.ironsource.mediationsdk.utils.k.a().d());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                this.an.a(jSONObject);
            } catch (JSONException e10) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("got the following error " + e10.getMessage());
                e10.printStackTrace();
            }
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(O.a().b() == O.a.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, boolean z10) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str + ", isFromPublisher = " + z10);
        this.f26339k = str;
        if (z10) {
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(List<IronSource.AD_UNIT> list, boolean z10, com.ironsource.mediationsdk.model.g gVar) {
        IronSource.AD_UNIT[] values;
        IronLog.INTERNAL.verbose();
        try {
            this.W = list;
            this.V = true;
            this.f26334f.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z10) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(114, mediationAdditionalData));
            }
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            if (currentActiveActivity != null) {
                String screenSizeParams = AdapterUtils.getScreenSizeParams(currentActiveActivity);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, screenSizeParams);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_SCREEN_SIZE, jSONObject));
            }
            com.ironsource.mediationsdk.a.d.d().c();
            com.ironsource.mediationsdk.a.h.d().c();
            C1730d a10 = C1730d.a();
            String str = this.f26338j;
            String str2 = this.f26339k;
            a10.f27022a = str;
            a10.f27023b = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.X.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        b(ad_unit);
                    } else {
                        a(ad_unit, false);
                    }
                }
            }
            J();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized AbstractAdapter b(String str) {
        try {
            AbstractAdapter abstractAdapter = this.R;
            if (abstractAdapter != null && abstractAdapter.getProviderName().equals(str)) {
                return this.R;
            }
        } catch (Exception e10) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e10, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Placement b() {
        com.ironsource.mediationsdk.model.o oVar = this.f26337i.f27494c.f27233a;
        if (oVar != null) {
            return oVar.a();
        }
        return null;
    }

    public final String b(Context context) {
        String str;
        com.ironsource.mediationsdk.utils.p pVar;
        JSONObject jSONObject;
        a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, (JSONObject) null);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            return null;
        }
        O.a b10 = O.a().b();
        O.a aVar = O.a.NOT_INIT;
        if (b10 == aVar) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else if (b10 == O.a.INIT_FAILED) {
            IronLog.API.error("bidding data cannot be retrieved, SDK failed to initialize");
            a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else {
            try {
                com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
                if (lVar == null) {
                    lVar = F.a(context);
                }
                if (b10 == aVar) {
                    this.an.a(context);
                    this.an.b(IronSourceUtils.getSDKVersion());
                    this.an.c(this.f26344p);
                    this.an.d(ConfigFile.getConfigFile().getPluginType());
                    this.an.a(com.ironsource.c.a.a());
                    this.an.b(IronSourceUtils.isGooglePlayInstalled(context));
                }
                if (b10 != O.a.INITIATED) {
                    O.a().a(lVar);
                    if (lVar != null) {
                        O.a().a(context, lVar);
                    }
                }
                if (lVar == null || !lVar.b()) {
                    pVar = new com.ironsource.mediationsdk.utils.p();
                } else {
                    pVar = lVar.f27494c.f27237e.c();
                    if (!pVar.f27536d) {
                        pVar.f27534b = lVar.f27487b.a(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
                    }
                }
                qe.k.f(context, "context");
                qe.k.f(pVar, "tokenSettings");
                if (pVar.f27536d) {
                    com.ironsource.environment.f.b bVar = new com.ironsource.environment.f.b();
                    qe.k.f(context, "context");
                    JSONObject a10 = C1741o.a(context, bVar.f26167a);
                    qe.k.e(a10, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
                    jSONObject = com.ironsource.environment.f.b.a(a10);
                } else {
                    NetworkSettings networkSettings = pVar.f27534b;
                    if (networkSettings != null) {
                        C1730d a11 = C1730d.a();
                        qe.k.e(networkSettings, "it");
                        AbstractAdapter a12 = a11.a(networkSettings, networkSettings.getApplicationSettings(), true, false);
                        if (a12 != null) {
                            jSONObject = C1732f.a().a(a12.getPlayerBiddingData(), pVar.f27535c, pVar.f27533a);
                        }
                    }
                    jSONObject = null;
                }
                C1732f.a().a(jSONObject, true);
                str = pVar.f27537e ? IronSourceAES.compressAndEncrypt(jSONObject.toString()) : IronSourceAES.encrypt(jSONObject.toString());
            } catch (Throwable th) {
                a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, (JSONObject) null);
                IronLog.API.error("got error during token creation: " + th.getMessage());
                str = null;
            }
            if (str == null) {
                a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            }
            return str;
        }
    }

    public final synchronized void b(Activity activity, String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        if (!this.f26351w) {
            this.f26334f.log(ironSourceTag, "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()", 3);
            ab.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"));
        } else if (!this.f26349u) {
            this.f26334f.log(ironSourceTag, "Rewarded video was initialized in mediation mode", 3);
            ab.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode"));
        } else {
            boolean z10 = false;
            if (activity != null) {
                ContextProvider.getInstance().updateActivity(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                if (str2 != null) {
                    z10 = true;
                }
                a((int) IronSourceConstants.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, z10, 1));
                this.f26334f.log(ironSourceTag, "Rewarded video was initialized and loaded without Activity", 3);
                ab.a().a(str, new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, "Rewarded video was initialized and loaded without Activity"));
                return;
            }
            O.a b10 = O.a().b();
            if (b10 == O.a.INIT_FAILED) {
                this.f26334f.log(ironSourceTag, "init() had failed", 3);
                ab.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (b10 == O.a.INIT_IN_PROGRESS) {
                if (O.a().c()) {
                    this.f26334f.log(ironSourceTag, "init() had failed", 3);
                    ab.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                synchronized (this.ak) {
                    this.ak.add(str);
                }
                if (str2 != null) {
                    a((int) IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, this.L));
                }
            } else if (!e()) {
                this.f26334f.log(ironSourceTag, "No rewarded video configurations found", 3);
                ab.a().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                synchronized (this.ak) {
                    C1749w c1749w = this.am;
                    if (c1749w == null) {
                        this.ak.add(str);
                        if (str2 != null) {
                            a((int) IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, this.L));
                        }
                    } else if (str2 == null) {
                        c1749w.a(str, (String) null, false);
                    } else {
                        c1749w.a(str, str2, true);
                    }
                }
            }
        }
    }

    public final void b(boolean z10) {
        this.f26353y = Boolean.valueOf(z10);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z10, 1);
        C1730d.a().a(z10);
        if (this.R != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z10 + ")", 1);
            this.R.setConsent(z10);
        }
        int i10 = z10 ? 40 : 41;
        this.an.a(z10);
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public final synchronized void c(Activity activity, String str, String str2) {
        if (str2 != null) {
            d(activity, str, str2);
            return;
        }
        this.f26334f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
        C.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r3.c() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        if (r3.b() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:26:0x0040, B:28:0x0048, B:29:0x005e, B:33:0x0067), top: B:41:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r9 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f26349u     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L13
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f26334f     // Catch: java.lang.Throwable -> L8b
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L8b
            return r2
        L13:
            boolean r3 = r9.F     // Catch: java.lang.Throwable -> L8b
            if (r3 != 0) goto L35
            boolean r3 = r9.ai     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L1c
            goto L35
        L1c:
            boolean r3 = r9.E     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L2e
            com.ironsource.mediationsdk.B r3 = r9.f26354z     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L2c
            boolean r3 = r3.c()     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L2c
        L2a:
            r3 = 1
            goto L40
        L2c:
            r3 = 0
            goto L40
        L2e:
            com.ironsource.mediationsdk.ad r3 = r9.f26330b     // Catch: java.lang.Throwable -> L8b
            boolean r3 = r3.c()     // Catch: java.lang.Throwable -> L8b
            goto L40
        L35:
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.D     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L2c
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L2c
            goto L2a
        L40:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch: java.lang.Throwable -> L86
            boolean r5 = r9.E     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L5e
            java.lang.Object[][] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L86
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = "programmatic"
            r6[r2] = r7     // Catch: java.lang.Throwable -> L86
            int r7 = r9.L     // Catch: java.lang.Throwable -> L86
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L86
            r6[r1] = r7     // Catch: java.lang.Throwable -> L86
            r5[r2] = r6     // Catch: java.lang.Throwable -> L86
            a(r4, r5)     // Catch: java.lang.Throwable -> L86
        L5e:
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L65
            r6 = 1101(0x44d, float:1.543E-42)
            goto L67
        L65:
            r6 = 1102(0x44e, float:1.544E-42)
        L67:
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L86
            com.ironsource.mediationsdk.a.h r4 = com.ironsource.mediationsdk.a.h.d()     // Catch: java.lang.Throwable -> L86
            r4.b(r5)     // Catch: java.lang.Throwable -> L86
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f26334f     // Catch: java.lang.Throwable -> L86
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L86
            r6.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L86
            r4.log(r5, r6, r1)     // Catch: java.lang.Throwable -> L86
            r2 = r3
            goto La7
        L86:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L8d
        L8b:
            r3 = move-exception
            r4 = 0
        L8d:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f26334f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f26334f
            java.lang.String r1 = "isRewardedVideoAvailable()"
            r0.logException(r6, r1, r3)
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.c():boolean");
    }

    public final boolean c(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, this.f26323a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            com.ironsource.d.a aVar = new com.ironsource.d.a();
            if (!a(str, 1, 128)) {
                aVar.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (!aVar.a()) {
                IronSourceLoggerManager.getLogger().log(ironSourceTag, aVar.b().toString(), 2);
                return false;
            }
            this.f26341m = str;
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(52, IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (Exception e10) {
            this.f26334f.logException(IronSourceLogger.IronSourceTag.API, this.f26323a + ":setDynamicUserId(dynamicUserId:" + str + ")", e10);
            return false;
        }
    }

    public final synchronized void d(Activity activity, String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadISDemandOnlyInterstitial() instanceId=" + str, 1);
        if (!this.f26352x) {
            this.f26334f.log(ironSourceTag, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()", 3);
            C.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
        } else if (!this.f26350v) {
            this.f26334f.log(ironSourceTag, "Interstitial was initialized in mediation mode. Use loadInterstitial instead", 3);
            C.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
        } else {
            boolean z10 = false;
            if (activity != null) {
                ContextProvider.getInstance().updateActivity(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                if (str2 != null) {
                    z10 = true;
                }
                b(IronSourceConstants.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, z10, 1));
                this.f26334f.log(ironSourceTag, "Interstitial was initialized and loaded without Activity", 3);
                C.a().a(str, new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY, "Interstitial was initialized and loaded without Activity"));
                return;
            }
            O.a b10 = O.a().b();
            if (b10 == O.a.INIT_FAILED) {
                this.f26334f.log(ironSourceTag, "init() had failed", 3);
                C.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (b10 == O.a.INIT_IN_PROGRESS) {
                if (O.a().c()) {
                    this.f26334f.log(ironSourceTag, "init() had failed", 3);
                    C.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                synchronized (this.aj) {
                    this.aj.add(str);
                }
                if (str2 != null) {
                    b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, 1));
                }
            } else if (!j()) {
                this.f26334f.log(ironSourceTag, "No interstitial configurations found", 3);
                C.a().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                synchronized (this.aj) {
                    C1747u c1747u = this.M;
                    if (c1747u == null) {
                        this.aj.add(str);
                        if (str2 != null) {
                            b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, 1));
                        }
                    } else if (str2 == null) {
                        c1747u.a(str, (String) null, false);
                    } else {
                        c1747u.a(str, str2, true);
                    }
                }
            }
        }
    }

    public final void d(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f26323a + ":setMediationType(mediationType:" + str + ")", 1);
            if (a(str, 1, 64) && v(str)) {
                this.f26343o = str;
            } else {
                this.f26334f.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (Exception e10) {
            this.f26334f.logException(IronSourceLogger.IronSourceTag.API, this.f26323a + ":setMediationType(mediationType:" + str + ")", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        com.ironsource.mediationsdk.model.g gVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
        return (lVar == null || (gVar = lVar.f27494c) == null || gVar.f27233a == null) ? false : true;
    }

    public final void e(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.f26349u) {
                this.f26334f.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                ac.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (!d()) {
                ac.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (this.E) {
                q(str);
            } else {
                Placement r10 = r(str);
                if (r10 != null) {
                    this.f26330b.a(r10);
                    this.f26330b.a(r10.getPlacementName());
                }
            }
        } catch (Exception e10) {
            this.f26334f.logException(IronSourceLogger.IronSourceTag.API, str2, e10);
            ac.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e10.getMessage()), (AdInfo) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return d() && E();
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void f() {
        synchronized (this.f26327ad) {
            if (this.f26327ad.booleanValue()) {
                this.f26327ad = Boolean.FALSE;
                C1738l.a().a(this.f26328ae, new IronSourceError(603, "init had failed"), false);
                this.f26328ae = null;
                this.f26329af = null;
            }
        }
        if (this.J) {
            this.J = false;
            C1744r.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        if (this.G) {
            this.G = false;
            C1744r.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.aj) {
            Iterator<String> it = this.aj.iterator();
            while (it.hasNext()) {
                C.a().a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.aj.clear();
        }
        synchronized (this.ak) {
            Iterator<String> it2 = this.ak.iterator();
            while (it2.hasNext()) {
                ab.a().a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.ak.clear();
        }
    }

    public final synchronized void f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
        } catch (Exception e10) {
            this.f26334f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e10);
            ab.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e10.getMessage()));
        }
        if (!this.f26349u) {
            this.f26334f.log(ironSourceTag, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
            ab.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        C1749w c1749w = this.am;
        if (c1749w == null) {
            this.f26334f.log(ironSourceTag, "Rewarded video was not initiated", 3);
            ab.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
        } else if (c1749w.f27541a.containsKey(str)) {
            C1750x c1750x = c1749w.f27541a.get(str);
            c1749w.a(IronSourceConstants.RV_INSTANCE_SHOW, c1750x);
            c1750x.a();
        } else {
            C1749w.a(1500, str);
            ab.a().b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterstitialPlacement g() {
        com.ironsource.mediationsdk.model.h hVar = this.f26337i.f27494c.f27234b;
        if (hVar != null) {
            return hVar.a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean g(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.w r0 = r4.am     // Catch: java.lang.Throwable -> L38
            r1 = 0
            if (r0 == 0) goto L36
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r2 = r0.f27541a     // Catch: java.lang.Throwable -> L38
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L38
            r3 = 1
            if (r2 != 0) goto L16
            r0 = 1500(0x5dc, float:2.102E-42)
            com.ironsource.mediationsdk.C1749w.a(r0, r5)     // Catch: java.lang.Throwable -> L38
        L14:
            r5 = 0
            goto L32
        L16:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r0 = r0.f27541a     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L38
            com.ironsource.mediationsdk.x r5 = (com.ironsource.mediationsdk.C1750x) r5     // Catch: java.lang.Throwable -> L38
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> L38
            r2 = 0
            if (r0 == 0) goto L2c
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.C1749w.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L38
            r5 = 1
            goto L32
        L2c:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.C1749w.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L38
            goto L14
        L32:
            if (r5 == 0) goto L36
            monitor-exit(r4)
            return r3
        L36:
            monitor-exit(r4)
            return r1
        L38:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.g(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showInterstitial("
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r7.f26334f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3 = 1
            r1.log(r2, r0, r3)
            r1 = 510(0x1fe, float:7.15E-43)
            r3 = 0
            boolean r4 = r7.f26350v     // Catch: java.lang.Exception -> L93
            if (r4 == 0) goto L37
            java.lang.String r8 = "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r7.f26334f     // Catch: java.lang.Exception -> L93
            r5 = 3
            r4.log(r2, r8, r5)     // Catch: java.lang.Exception -> L93
            com.ironsource.mediationsdk.D r2 = com.ironsource.mediationsdk.D.a()     // Catch: java.lang.Exception -> L93
            com.ironsource.mediationsdk.logger.IronSourceError r4 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> L93
            r4.<init>(r1, r8)     // Catch: java.lang.Exception -> L93
            r2.a(r4, r3)     // Catch: java.lang.Exception -> L93
            return
        L37:
            boolean r2 = r7.i()     // Catch: java.lang.Exception -> L93
            if (r2 != 0) goto L4d
            com.ironsource.mediationsdk.D r8 = com.ironsource.mediationsdk.D.a()     // Catch: java.lang.Exception -> L93
            java.lang.String r2 = "showInterstitial can't be called before the Interstitial ad unit initialization completed successfully"
            java.lang.String r4 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r2, r4)     // Catch: java.lang.Exception -> L93
            r8.a(r2, r3)     // Catch: java.lang.Exception -> L93
            return
        L4d:
            boolean r2 = r7.H     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L55
            r7.t(r8)     // Catch: java.lang.Exception -> L93
            return
        L55:
            com.ironsource.mediationsdk.model.InterstitialPlacement r2 = r7.u(r8)     // Catch: java.lang.Exception -> L93
            r4 = 0
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch: java.lang.Exception -> L93
            java.lang.String r5 = "placement"
            if (r2 == 0) goto L6a
            java.lang.String r8 = r2.getPlacementName()     // Catch: org.json.JSONException -> L71 java.lang.Exception -> L93
        L66:
            r4.put(r5, r8)     // Catch: org.json.JSONException -> L71 java.lang.Exception -> L93
            goto L75
        L6a:
            boolean r6 = android.text.TextUtils.isEmpty(r8)     // Catch: org.json.JSONException -> L71 java.lang.Exception -> L93
            if (r6 != 0) goto L75
            goto L66
        L71:
            r8 = move-exception
            r8.printStackTrace()     // Catch: java.lang.Exception -> L93
        L75:
            com.ironsource.mediationsdk.a.c r8 = new com.ironsource.mediationsdk.a.c     // Catch: java.lang.Exception -> L93
            r5 = 2100(0x834, float:2.943E-42)
            r8.<init>(r5, r4)     // Catch: java.lang.Exception -> L93
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.a.d.d()     // Catch: java.lang.Exception -> L93
            r4.b(r8)     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L92
            com.ironsource.mediationsdk.G r8 = r7.f26331c     // Catch: java.lang.Exception -> L93
            r8.a(r2)     // Catch: java.lang.Exception -> L93
            com.ironsource.mediationsdk.G r8 = r7.f26331c     // Catch: java.lang.Exception -> L93
            r2.getPlacementName()     // Catch: java.lang.Exception -> L93
            r8.d()     // Catch: java.lang.Exception -> L93
        L92:
            return
        L93:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f26334f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.logException(r4, r0, r8)
            com.ironsource.mediationsdk.D r0 = com.ironsource.mediationsdk.D.a()
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError
            java.lang.String r8 = r8.getMessage()
            r2.<init>(r1, r8)
            r0.a(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.h(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r3.b() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r3.e() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f26350v     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L13
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f26334f     // Catch: java.lang.Throwable -> L72
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L72
            return r2
        L13:
            boolean r3 = r9.H     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L34
            boolean r3 = r9.I     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L29
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.C     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L27
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L27
        L25:
            r3 = 1
            goto L3f
        L27:
            r3 = 0
            goto L3f
        L29:
            com.ironsource.mediationsdk.U r3 = r9.A     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L27
            boolean r3 = r3.f()     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L27
            goto L25
        L34:
            com.ironsource.mediationsdk.G r3 = r9.f26331c     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L27
            boolean r3 = r3.e()     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L27
            goto L25
        L3f:
            boolean r4 = r9.H     // Catch: java.lang.Throwable -> L6d
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r4, r1)     // Catch: java.lang.Throwable -> L6d
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L4c
            r6 = 2101(0x835, float:2.944E-42)
            goto L4e
        L4c:
            r6 = 2102(0x836, float:2.946E-42)
        L4e:
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L6d
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.a.d.d()     // Catch: java.lang.Throwable -> L6d
            r4.b(r5)     // Catch: java.lang.Throwable -> L6d
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f26334f     // Catch: java.lang.Throwable -> L6d
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            r6.append(r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6d
            r4.log(r5, r6, r1)     // Catch: java.lang.Throwable -> L6d
            r2 = r3
            goto L8e
        L6d:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L74
        L72:
            r3 = move-exception
            r4 = 0
        L74:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f26334f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f26334f
            java.lang.String r1 = "isInterstitialReady()"
            r0.logException(r6, r1, r3)
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.h():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        com.ironsource.mediationsdk.model.g gVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
        return (lVar == null || (gVar = lVar.f27494c) == null || gVar.f27234b == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean i(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.u r0 = r4.M     // Catch: java.lang.Throwable -> L38
            r1 = 0
            if (r0 == 0) goto L36
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.v> r2 = r0.f27399a     // Catch: java.lang.Throwable -> L38
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L38
            r3 = 1
            if (r2 != 0) goto L16
            r0 = 2500(0x9c4, float:3.503E-42)
            com.ironsource.mediationsdk.C1747u.a(r0, r5)     // Catch: java.lang.Throwable -> L38
        L14:
            r5 = 0
            goto L32
        L16:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.v> r0 = r0.f27399a     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L38
            com.ironsource.mediationsdk.v r5 = (com.ironsource.mediationsdk.C1748v) r5     // Catch: java.lang.Throwable -> L38
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> L38
            r2 = 0
            if (r0 == 0) goto L2c
            r0 = 2211(0x8a3, float:3.098E-42)
            com.ironsource.mediationsdk.C1747u.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L38
            r5 = 1
            goto L32
        L2c:
            r0 = 2212(0x8a4, float:3.1E-42)
            com.ironsource.mediationsdk.C1747u.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L38
            goto L14
        L32:
            if (r5 == 0) goto L36
            monitor-exit(r4)
            return r3
        L36:
            monitor-exit(r4)
            return r1
        L38:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.i(java.lang.String):boolean");
    }

    public final void j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (!k()) {
                this.f26335g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.model.j a10 = this.f26337i.f27494c.f27235c.a(str);
            if (a10 == null) {
                this.f26334f.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a10 = this.f26337i.f27494c.f27235c.a();
                if (a10 == null) {
                    this.f26334f.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f26332d.a(a10.f27253b);
        } catch (Exception e10) {
            this.f26334f.logException(IronSourceLogger.IronSourceTag.API, str2, e10);
            this.f26335g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return i() && F();
    }

    public final InterstitialPlacement k(String str) {
        try {
            InterstitialPlacement s10 = s(str);
            if (s10 == null) {
                try {
                    this.f26334f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    s10 = g();
                } catch (Exception unused) {
                    return s10;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + s10, 1);
            return s10;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        com.ironsource.mediationsdk.model.g gVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
        return (lVar == null || (gVar = lVar.f27494c) == null || gVar.f27235c == null) ? false : true;
    }

    public final Placement l(String str) {
        try {
            Placement p10 = p(str);
            if (p10 == null) {
                try {
                    this.f26334f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    p10 = b();
                } catch (Exception unused) {
                    return p10;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + p10, 1);
            return p10;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final boolean l() {
        try {
            Q q10 = this.f26332d;
            if (q10 != null) {
                return q10.a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final String m() {
        return this.f26338j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(String str) {
        if (this.f26350v) {
            return false;
        }
        boolean z10 = w(str) != k.a.f27478d;
        if (z10) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f26350v, this.H, 1);
            try {
                mediationAdditionalData.put("placement", str);
                if (this.H) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                }
            } catch (Exception unused) {
            }
            com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String n() {
        /*
            r8 = this;
            r0 = 83005(0x1443d, float:1.16315E-40)
            r1 = 0
            a(r0, r1)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            r0.info()
            com.ironsource.mediationsdk.utils.l r2 = r8.f26337i
            if (r2 != 0) goto L17
            java.lang.String r2 = "bidding data cannot be retrieved, SDK not initialized"
            r0.error(r2)
            goto Le6
        L17:
            com.ironsource.mediationsdk.model.n r0 = r2.f27487b
            java.lang.String r2 = "IronSource"
            com.ironsource.mediationsdk.model.NetworkSettings r0 = r0.a(r2)
            if (r0 == 0) goto Le6
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ironsource.mediationsdk.d r3 = com.ironsource.mediationsdk.C1730d.a()
            org.json.JSONObject r4 = r0.getApplicationSettings()
            r5 = 0
            r6 = 1
            com.ironsource.mediationsdk.AbstractAdapter r0 = r3.a(r0, r4, r6, r5)
            if (r0 == 0) goto L3a
            org.json.JSONObject r2 = r0.getPlayerBiddingData()     // Catch: java.lang.Exception -> Lc5
        L3a:
            com.ironsource.mediationsdk.utils.l r0 = r8.f26337i     // Catch: java.lang.Exception -> Lc5
            com.ironsource.mediationsdk.model.g r0 = r0.f27494c     // Catch: java.lang.Exception -> Lc5
            com.ironsource.sdk.f.a r0 = r0.f27237e     // Catch: java.lang.Exception -> Lc5
            com.ironsource.mediationsdk.utils.p r0 = r0.c()     // Catch: java.lang.Exception -> Lc5
            boolean r3 = r0.f27536d     // Catch: java.lang.Exception -> Lc5
            if (r3 == 0) goto L59
            com.ironsource.environment.f.b r2 = new com.ironsource.environment.f.b     // Catch: java.lang.Exception -> Lc5
            r2.<init>()     // Catch: java.lang.Exception -> Lc5
            org.json.JSONObject r2 = r2.a()     // Catch: java.lang.Exception -> Lc5
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C1732f.a()     // Catch: java.lang.Exception -> Lc5
            r3.a(r2, r6)     // Catch: java.lang.Exception -> Lc5
            goto L65
        L59:
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C1732f.a()     // Catch: java.lang.Exception -> Lc5
            org.json.JSONObject r4 = r0.f27535c     // Catch: java.lang.Exception -> Lc5
            java.util.ArrayList<java.lang.String> r5 = r0.f27533a     // Catch: java.lang.Exception -> Lc5
            org.json.JSONObject r2 = r3.a(r2, r4, r5)     // Catch: java.lang.Exception -> Lc5
        L65:
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Exception -> Lc5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc5
            java.lang.String r5 = "bidding data: "
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lc5
            r4.append(r2)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc5
            r3.verbose(r4)     // Catch: java.lang.Exception -> Lc5
            if (r2 == 0) goto Le6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc5
            java.lang.String r5 = "raw biddingData length: "
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> Lc5
            int r5 = r5.length()     // Catch: java.lang.Exception -> Lc5
            r4.append(r5)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc5
            r3.verbose(r4)     // Catch: java.lang.Exception -> Lc5
            boolean r0 = r0.f27537e     // Catch: java.lang.Exception -> Lc5
            if (r0 == 0) goto La0
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r0)     // Catch: java.lang.Exception -> Lc5
            goto La8
        La0:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encrypt(r0)     // Catch: java.lang.Exception -> Lc5
        La8:
            if (r0 == 0) goto Le7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            java.lang.String r4 = "biddingData length: "
            r2.<init>(r4)     // Catch: java.lang.Exception -> Lc0
            int r4 = r0.length()     // Catch: java.lang.Exception -> Lc0
            r2.append(r4)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc0
            r3.verbose(r2)     // Catch: java.lang.Exception -> Lc0
            goto Le7
        Lc0:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto Lc7
        Lc5:
            r0 = move-exception
            r2 = r1
        Lc7:
            r3 = 83007(0x1443f, float:1.16318E-40)
            a(r3, r1)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "got error during creating the token: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.error(r0)
            r0 = r2
            goto Le7
        Le6:
            r0 = r1
        Le7:
            if (r0 != 0) goto Lef
            r2 = 83006(0x1443e, float:1.16316E-40)
            a(r2, r1)
        Lef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.n():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(String str) {
        if (G()) {
            com.ironsource.mediationsdk.model.f fVar = null;
            try {
                fVar = this.f26337i.f27494c.f27236d.a(str);
                if (fVar == null && (fVar = this.f26337i.f27494c.f27236d.a()) == null) {
                    this.f26334f.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                    return false;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (fVar == null) {
                return false;
            }
            return com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), fVar.getPlacementName());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o(String str) {
        com.ironsource.mediationsdk.model.g gVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f26337i;
        if (lVar == null || (gVar = lVar.f27494c) == null || gVar.f27233a == null) {
            return k.a.f27478d;
        }
        Placement placement = null;
        try {
            placement = p(str);
            if (placement == null && (placement = b()) == null) {
                this.f26334f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return placement == null ? k.a.f27478d : com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), placement);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        return this.f26349u || this.f26350v;
    }
}
