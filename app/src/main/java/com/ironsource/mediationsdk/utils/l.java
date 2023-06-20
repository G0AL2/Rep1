package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.inmobi.media.jh;
import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import fm.castbox.mediation.widget.AdView;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l {
    private final String A;
    private final String B;
    private final String C;
    private final String D;
    private final String E;
    private final String F;
    private final String G;
    private final String H;
    private final String I;
    private final String J;
    private final String K;
    private final String L;
    private final String M;
    private final String N;
    private final String O;
    private final String P;
    private final String Q;
    private final String R;
    private final String S;
    private final String T;
    private final String U;
    private final String V;
    private final String W;
    private final String X;
    private final String Y;
    private final String Z;

    /* renamed from: a  reason: collision with root package name */
    public com.ironsource.mediationsdk.model.m f27480a;
    private final String aA;
    private final String aB;
    private final String aC;
    private final String aD;
    private final String aE;
    private final String aF;
    private final String aG;
    private final String aH;
    private final String aI;
    private final String aJ;
    private final String aK;
    private final String aL;
    private final String aM;
    private final String aN;
    private final String aO;
    private final String aP;
    private final String aQ;
    private final String aR;
    private final String aS;
    private final String aT;
    private final String aU;
    private final String aV;
    private final String aW;
    private final String aX;
    private final String aY;
    private final String aZ;

    /* renamed from: aa  reason: collision with root package name */
    private final String f27481aa;

    /* renamed from: ab  reason: collision with root package name */
    private final String f27482ab;

    /* renamed from: ac  reason: collision with root package name */
    private final String f27483ac;

    /* renamed from: ad  reason: collision with root package name */
    private final String f27484ad;

    /* renamed from: ae  reason: collision with root package name */
    private final String f27485ae;

    /* renamed from: af  reason: collision with root package name */
    private final String f27486af;
    private final String ag;
    private final String ah;
    private final String ai;
    private final String aj;
    private final String ak;
    private final String al;
    private final String am;
    private final String an;
    private final String ao;
    private final String ap;
    private final String aq;
    private final String ar;
    private final String as;
    private final String at;
    private final String au;
    private final String av;
    private final String aw;
    private final String ax;
    private final String ay;
    private final String az;

    /* renamed from: b  reason: collision with root package name */
    public com.ironsource.mediationsdk.model.n f27487b;

    /* renamed from: ba  reason: collision with root package name */
    private final String f27488ba;

    /* renamed from: bb  reason: collision with root package name */
    private final String f27489bb;

    /* renamed from: bc  reason: collision with root package name */
    private final String f27490bc;

    /* renamed from: bd  reason: collision with root package name */
    private final String f27491bd;

    /* renamed from: be  reason: collision with root package name */
    private final String f27492be;

    /* renamed from: bf  reason: collision with root package name */
    private final String f27493bf;
    private final String bg;
    private final String bh;
    private final String bi;
    private final String bj;
    private final String bk;
    private final String bl;
    private final String bm;
    private final String bn;
    private final String bo;
    private final String bp;
    private final String bq;
    private final String br;
    private final String bs;
    private final String bt;
    private String bu;
    private String bv;
    private Context bw;

    /* renamed from: c  reason: collision with root package name */
    public com.ironsource.mediationsdk.model.g f27494c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f27495d;

    /* renamed from: e  reason: collision with root package name */
    public int f27496e;

    /* renamed from: f  reason: collision with root package name */
    private final String f27497f;

    /* renamed from: g  reason: collision with root package name */
    private final int f27498g;

    /* renamed from: h  reason: collision with root package name */
    private final int f27499h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27500i;

    /* renamed from: j  reason: collision with root package name */
    private final int f27501j;

    /* renamed from: k  reason: collision with root package name */
    private final int f27502k;

    /* renamed from: l  reason: collision with root package name */
    private final int f27503l;

    /* renamed from: m  reason: collision with root package name */
    private final int f27504m;

    /* renamed from: n  reason: collision with root package name */
    private final int f27505n;

    /* renamed from: o  reason: collision with root package name */
    private final int f27506o;

    /* renamed from: p  reason: collision with root package name */
    private final int f27507p;

    /* renamed from: q  reason: collision with root package name */
    private final int f27508q;

    /* renamed from: r  reason: collision with root package name */
    private final long f27509r;

    /* renamed from: s  reason: collision with root package name */
    private final int f27510s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f27511t;

    /* renamed from: u  reason: collision with root package name */
    private final int f27512u;

    /* renamed from: v  reason: collision with root package name */
    private final int f27513v;

    /* renamed from: w  reason: collision with root package name */
    private final int f27514w;

    /* renamed from: x  reason: collision with root package name */
    private final int f27515x;

    /* renamed from: y  reason: collision with root package name */
    private final String f27516y;

    /* renamed from: z  reason: collision with root package name */
    private final String f27517z;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f27518a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f27519b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f27520c = 3;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ int[] f27521d = {1, 2, 3};
    }

    public l(Context context, String str, String str2, String str3) {
        this.f27497f = "error";
        this.f27498g = 3;
        this.f27499h = 2;
        this.f27500i = 60;
        this.f27501j = 10000;
        this.f27502k = jh.DEFAULT_BITMAP_TIMEOUT;
        this.f27503l = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
        this.f27504m = 3;
        this.f27505n = 3;
        this.f27506o = 3;
        this.f27507p = 2;
        this.f27508q = 15;
        this.f27509r = 10000L;
        this.f27510s = 0;
        this.f27511t = false;
        this.f27512u = 30000;
        this.f27513v = -1;
        this.f27514w = jh.DEFAULT_BITMAP_TIMEOUT;
        this.f27515x = 1;
        this.f27516y = "providerOrder";
        this.f27517z = "providerSettings";
        this.A = "configurations";
        this.B = IronSourceConstants.EVENTS_GENERIC_PARAMS;
        this.C = "adUnits";
        this.D = "providerLoadName";
        this.E = "application";
        this.F = "rewardedVideo";
        this.G = "interstitial";
        this.H = "offerwall";
        this.I = AdView.AdType.BANNER;
        this.J = "integration";
        this.K = "loggers";
        this.L = "segment";
        this.M = "events";
        this.N = "crashReporter";
        this.O = IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY;
        this.P = "external";
        this.Q = "mediationTypes";
        this.R = "providerDefaultInstance";
        this.S = "settings";
        this.T = "maxNumOfAdaptersToLoadOnStart";
        this.U = "advancedLoading";
        this.V = "adapterTimeOutInSeconds";
        this.W = "atim";
        this.X = "bannerInterval";
        this.Y = "loadRVInterval";
        this.Z = "expiredDurationInMinutes";
        this.f27481aa = Analytics.Param.SERVER;
        this.f27482ab = "publisher";
        this.f27483ac = "console";
        this.f27484ad = "sendUltraEvents";
        this.f27485ae = "sendEventsToggle";
        this.f27486af = "eventsCompression";
        this.ag = "serverEventsURL";
        this.ah = "serverEventsType";
        this.ai = "backupThreshold";
        this.aj = "maxNumberOfEvents";
        this.ak = "maxEventsPerBatch";
        this.al = "optOut";
        this.am = "optIn";
        this.an = "triggerEvents";
        this.ao = "nonConnectivityEvents";
        this.ap = "pixel";
        this.aq = "pixelEventsUrl";
        this.ar = "pixelEventsEnabled";
        this.as = "placements";
        this.at = "placementId";
        this.au = "placementName";
        this.av = "delivery";
        this.aw = "isDefault";
        this.ax = "capping";
        this.ay = "pacing";
        this.az = "enabled";
        this.aA = "maxImpressions";
        this.aB = "numOfSeconds";
        this.aC = "unit";
        this.aD = "virtualItemName";
        this.aE = "virtualItemCount";
        this.aF = "backFill";
        this.aG = "premium";
        this.aH = "uuidEnabled";
        this.aI = "abt";
        this.aJ = "delayLoadFailure";
        this.aK = "keysToInclude";
        this.aL = "reporterURL";
        this.aM = "reporterKeyword";
        this.aN = "includeANR";
        this.aO = "timeout";
        this.aP = "setIgnoreDebugger";
        this.aQ = "adSourceName";
        this.aR = IronSourceConstants.EVENTS_SUB_PROVIDER_ID;
        this.aS = "mpis";
        this.aT = "auction";
        this.aU = "auctionData";
        this.aV = "auctioneerURL";
        this.aW = IronSourceConstants.EVENTS_PROGRAMMATIC;
        this.aX = "objectPerWaterfall";
        this.aY = "minTimeBeforeFirstAuction";
        this.aZ = "timeToWaitBeforeAuction";
        this.f27488ba = "timeToWaitBeforeLoad";
        this.f27489bb = "auctionRetryInterval";
        this.f27490bc = "isAuctionOnShowStart";
        this.f27491bd = "isLoadWhileShow";
        this.f27492be = IronSourceConstants.AUCTION_TRIALS;
        this.f27493bf = "auctionTimeout";
        this.bg = "auctionSavedHistory";
        this.bh = "disableLoadWhileShowSupportFor";
        this.bi = "timeToDeleteOldWaterfallAfterAuction";
        this.bj = "compressAuctionRequest";
        this.bk = "compressAuctionResponse";
        this.bl = "encryptionVersion";
        this.bm = "shouldSendBannerBURLFromImpression";
        this.bn = "optInKeys";
        this.bo = "tokenGenericParams";
        this.bp = "oneToken";
        this.bq = "compressToken";
        this.br = "isExternalArmEventsEnabled";
        this.bs = "externalArmEventsUrl";
        this.bt = "compressExternalToken";
        this.f27496e = a.f27518a;
        this.bw = context;
        try {
            this.f27495d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            h();
            i();
            g();
            this.bu = TextUtils.isEmpty(str) ? "" : str;
            this.bv = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e10) {
            e10.printStackTrace();
            e();
        }
    }

    public l(l lVar) {
        this.f27497f = "error";
        this.f27498g = 3;
        this.f27499h = 2;
        this.f27500i = 60;
        this.f27501j = 10000;
        this.f27502k = jh.DEFAULT_BITMAP_TIMEOUT;
        this.f27503l = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
        this.f27504m = 3;
        this.f27505n = 3;
        this.f27506o = 3;
        this.f27507p = 2;
        this.f27508q = 15;
        this.f27509r = 10000L;
        this.f27510s = 0;
        this.f27511t = false;
        this.f27512u = 30000;
        this.f27513v = -1;
        this.f27514w = jh.DEFAULT_BITMAP_TIMEOUT;
        this.f27515x = 1;
        this.f27516y = "providerOrder";
        this.f27517z = "providerSettings";
        this.A = "configurations";
        this.B = IronSourceConstants.EVENTS_GENERIC_PARAMS;
        this.C = "adUnits";
        this.D = "providerLoadName";
        this.E = "application";
        this.F = "rewardedVideo";
        this.G = "interstitial";
        this.H = "offerwall";
        this.I = AdView.AdType.BANNER;
        this.J = "integration";
        this.K = "loggers";
        this.L = "segment";
        this.M = "events";
        this.N = "crashReporter";
        this.O = IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY;
        this.P = "external";
        this.Q = "mediationTypes";
        this.R = "providerDefaultInstance";
        this.S = "settings";
        this.T = "maxNumOfAdaptersToLoadOnStart";
        this.U = "advancedLoading";
        this.V = "adapterTimeOutInSeconds";
        this.W = "atim";
        this.X = "bannerInterval";
        this.Y = "loadRVInterval";
        this.Z = "expiredDurationInMinutes";
        this.f27481aa = Analytics.Param.SERVER;
        this.f27482ab = "publisher";
        this.f27483ac = "console";
        this.f27484ad = "sendUltraEvents";
        this.f27485ae = "sendEventsToggle";
        this.f27486af = "eventsCompression";
        this.ag = "serverEventsURL";
        this.ah = "serverEventsType";
        this.ai = "backupThreshold";
        this.aj = "maxNumberOfEvents";
        this.ak = "maxEventsPerBatch";
        this.al = "optOut";
        this.am = "optIn";
        this.an = "triggerEvents";
        this.ao = "nonConnectivityEvents";
        this.ap = "pixel";
        this.aq = "pixelEventsUrl";
        this.ar = "pixelEventsEnabled";
        this.as = "placements";
        this.at = "placementId";
        this.au = "placementName";
        this.av = "delivery";
        this.aw = "isDefault";
        this.ax = "capping";
        this.ay = "pacing";
        this.az = "enabled";
        this.aA = "maxImpressions";
        this.aB = "numOfSeconds";
        this.aC = "unit";
        this.aD = "virtualItemName";
        this.aE = "virtualItemCount";
        this.aF = "backFill";
        this.aG = "premium";
        this.aH = "uuidEnabled";
        this.aI = "abt";
        this.aJ = "delayLoadFailure";
        this.aK = "keysToInclude";
        this.aL = "reporterURL";
        this.aM = "reporterKeyword";
        this.aN = "includeANR";
        this.aO = "timeout";
        this.aP = "setIgnoreDebugger";
        this.aQ = "adSourceName";
        this.aR = IronSourceConstants.EVENTS_SUB_PROVIDER_ID;
        this.aS = "mpis";
        this.aT = "auction";
        this.aU = "auctionData";
        this.aV = "auctioneerURL";
        this.aW = IronSourceConstants.EVENTS_PROGRAMMATIC;
        this.aX = "objectPerWaterfall";
        this.aY = "minTimeBeforeFirstAuction";
        this.aZ = "timeToWaitBeforeAuction";
        this.f27488ba = "timeToWaitBeforeLoad";
        this.f27489bb = "auctionRetryInterval";
        this.f27490bc = "isAuctionOnShowStart";
        this.f27491bd = "isLoadWhileShow";
        this.f27492be = IronSourceConstants.AUCTION_TRIALS;
        this.f27493bf = "auctionTimeout";
        this.bg = "auctionSavedHistory";
        this.bh = "disableLoadWhileShowSupportFor";
        this.bi = "timeToDeleteOldWaterfallAfterAuction";
        this.bj = "compressAuctionRequest";
        this.bk = "compressAuctionResponse";
        this.bl = "encryptionVersion";
        this.bm = "shouldSendBannerBURLFromImpression";
        this.bn = "optInKeys";
        this.bo = "tokenGenericParams";
        this.bp = "oneToken";
        this.bq = "compressToken";
        this.br = "isExternalArmEventsEnabled";
        this.bs = "externalArmEventsUrl";
        this.bt = "compressExternalToken";
        this.f27496e = a.f27518a;
        try {
            this.bw = lVar.bw;
            this.f27495d = new JSONObject(lVar.f27495d.toString());
            this.bu = lVar.bu;
            this.bv = lVar.bv;
            this.f27480a = lVar.f27480a;
            this.f27487b = lVar.f27487b;
            this.f27494c = lVar.f27494c;
            this.f27496e = lVar.f27496e;
        } catch (Exception unused) {
            e();
        }
    }

    private static int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i10) {
        int i11 = 0;
        if (jSONObject.has(str)) {
            i11 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i11 = jSONObject2.optInt(str, 0);
        }
        return i11 == 0 ? i10 : i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r7.toString().equals(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.ironsource.mediationsdk.model.k a(org.json.JSONObject r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            com.ironsource.mediationsdk.model.k$a r1 = new com.ironsource.mediationsdk.model.k$a
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r9.optBoolean(r2, r3)
            r1.f27261a = r2
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r9.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L58
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L44
            com.ironsource.mediationsdk.model.l r7 = com.ironsource.mediationsdk.model.l.PER_DAY
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L37
        L35:
            r0 = r7
            goto L44
        L37:
            com.ironsource.mediationsdk.model.l r7 = com.ironsource.mediationsdk.model.l.PER_HOUR
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L44
            goto L35
        L44:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L54
            if (r6 <= 0) goto L54
            r2 = 1
            goto L55
        L54:
            r2 = 0
        L55:
            r1.a(r2, r0, r6)
        L58:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r9 = r9.optJSONObject(r0)
            if (r9 == 0) goto L73
            java.lang.String r0 = "numOfSeconds"
            int r0 = r9.optInt(r0, r5)
            boolean r9 = r9.optBoolean(r4, r5)
            if (r9 == 0) goto L6f
            if (r0 <= 0) goto L6f
            goto L70
        L6f:
            r3 = 0
        L70:
            r1.a(r3, r0)
        L73:
            com.ironsource.mediationsdk.model.k r9 = r1.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.l.a(org.json.JSONObject):com.ironsource.mediationsdk.model.k");
    }

    private static int[] a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int[] iArr = new int[optJSONArray.length()];
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                iArr[i10] = optJSONArray.optInt(i10);
            }
            return iArr;
        }
        return null;
    }

    private static JSONObject b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private void e() {
        this.f27495d = new JSONObject();
        this.bu = "";
        this.bv = "";
        this.f27480a = new com.ironsource.mediationsdk.model.m();
        this.f27487b = com.ironsource.mediationsdk.model.n.a();
        this.f27494c = new com.ironsource.mediationsdk.model.g();
    }

    private boolean f() {
        JSONArray names = b(this.f27495d, "providerOrder").names();
        if (names == null) {
            return true;
        }
        JSONObject b10 = b(b(this.f27495d, "configurations"), "adUnits");
        for (int i10 = 0; i10 < names.length(); i10++) {
            JSONArray optJSONArray = b(b10, names.optString(i10)).optJSONArray("placements");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return false;
            }
        }
        return true;
    }

    private void g() {
        com.ironsource.mediationsdk.model.g gVar;
        com.ironsource.mediationsdk.model.h hVar;
        com.ironsource.mediationsdk.model.g gVar2;
        com.ironsource.mediationsdk.model.o oVar;
        try {
            JSONObject b10 = b(this.f27495d, "providerOrder");
            JSONArray optJSONArray = b10.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = b10.optJSONArray("interstitial");
            JSONArray optJSONArray3 = b10.optJSONArray(AdView.AdType.BANNER);
            this.f27480a = new com.ironsource.mediationsdk.model.m();
            if (optJSONArray != null && (gVar2 = this.f27494c) != null && (oVar = gVar2.f27233a) != null) {
                String str = oVar.f27285f;
                String str2 = oVar.f27286g;
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    String optString = optJSONArray.optString(i10);
                    if (optString.equals(str)) {
                        this.f27480a.f27272b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.f27480a.f27273c = str2;
                        }
                        com.ironsource.mediationsdk.model.m mVar = this.f27480a;
                        if (!TextUtils.isEmpty(optString)) {
                            mVar.f27271a.add(optString);
                        }
                        NetworkSettings a10 = com.ironsource.mediationsdk.model.n.a().a(optString);
                        if (a10 != null) {
                            a10.setRewardedVideoPriority(i10);
                        }
                    }
                }
            }
            if (optJSONArray2 != null && (gVar = this.f27494c) != null && (hVar = gVar.f27234b) != null) {
                String str3 = hVar.f27244g;
                String str4 = hVar.f27245h;
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    String optString2 = optJSONArray2.optString(i11);
                    if (optString2.equals(str3)) {
                        this.f27480a.f27276f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.f27480a.f27277g = str4;
                        }
                        com.ironsource.mediationsdk.model.m mVar2 = this.f27480a;
                        if (!TextUtils.isEmpty(optString2)) {
                            mVar2.f27274d.add(optString2);
                        }
                        NetworkSettings a11 = com.ironsource.mediationsdk.model.n.a().a(optString2);
                        if (a11 != null) {
                            a11.setInterstitialPriority(i11);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                    String optString3 = optJSONArray3.optString(i12);
                    com.ironsource.mediationsdk.model.m mVar3 = this.f27480a;
                    if (!TextUtils.isEmpty(optString3)) {
                        mVar3.f27275e.add(optString3);
                    }
                    NetworkSettings a12 = com.ironsource.mediationsdk.model.n.a().a(optString3);
                    if (a12 != null) {
                        a12.setBannerPriority(i12);
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void h() {
        String str;
        JSONObject jSONObject;
        NetworkSettings networkSettings;
        com.ironsource.mediationsdk.model.n nVar;
        String str2 = "Mediation";
        try {
            this.f27487b = com.ironsource.mediationsdk.model.n.a();
            JSONObject b10 = b(this.f27495d, "providerSettings");
            Iterator<String> keys = b10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = b10.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, "0");
                    String optString2 = optJSONObject.optString("adSourceName", null);
                    String optString3 = optJSONObject.optString("providerLoadName", next);
                    String optString4 = optJSONObject.optString("providerDefaultInstance", optString3);
                    JSONObject b11 = b(optJSONObject, "adUnits");
                    JSONObject b12 = b(optJSONObject, "application");
                    JSONObject b13 = b(b11, "rewardedVideo");
                    JSONObject b14 = b(b11, "interstitial");
                    JSONObject b15 = b(b11, AdView.AdType.BANNER);
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(b13, b12);
                    JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(b14, b12);
                    JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(b15, b12);
                    if (this.f27487b.b(next)) {
                        NetworkSettings a10 = this.f27487b.a(next);
                        JSONObject rewardedVideoSettings = a10.getRewardedVideoSettings();
                        JSONObject interstitialSettings = a10.getInterstitialSettings();
                        JSONObject bannerSettings = a10.getBannerSettings();
                        a10.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, mergeJsons));
                        a10.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, mergeJsons2));
                        a10.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, mergeJsons3));
                        a10.setIsMultipleInstances(optBoolean);
                        a10.setSubProviderId(optString);
                        a10.setAdSourceNameForEvents(optString2);
                    } else {
                        Locale locale = Locale.ENGLISH;
                        String lowerCase = optString3.toLowerCase(locale);
                        jSONObject = b10;
                        if (this.f27487b.b(str2) && (IronSourceConstants.SUPERSONIC_CONFIG_NAME.toLowerCase(locale).equals(lowerCase) || IronSourceConstants.IRONSOURCE_CONFIG_NAME.toLowerCase(locale).equals(lowerCase))) {
                            NetworkSettings a11 = this.f27487b.a(str2);
                            str = str2;
                            networkSettings = new NetworkSettings(next, optString3, optString4, b12, IronSourceUtils.mergeJsons(new JSONObject(a11.getRewardedVideoSettings().toString()), mergeJsons), IronSourceUtils.mergeJsons(new JSONObject(a11.getInterstitialSettings().toString()), mergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(a11.getBannerSettings().toString()), mergeJsons3));
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            nVar = this.f27487b;
                        } else {
                            str = str2;
                            networkSettings = new NetworkSettings(next, optString3, optString4, b12, mergeJsons, mergeJsons2, mergeJsons3);
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            nVar = this.f27487b;
                        }
                        nVar.a(networkSettings);
                    }
                } else {
                    str = str2;
                    jSONObject = b10;
                }
                str2 = str;
                b10 = jSONObject;
            }
            this.f27487b.b();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0547 A[Catch: Exception -> 0x0586, TryCatch #1 {Exception -> 0x0586, blocks: (B:79:0x0308, B:83:0x0317, B:85:0x0320, B:86:0x0323, B:89:0x032a, B:90:0x032f, B:92:0x033d, B:93:0x033f, B:95:0x034b, B:101:0x036a, B:105:0x0391, B:107:0x03da, B:108:0x03e7, B:110:0x03ed, B:113:0x0401, B:115:0x0409, B:116:0x0412, B:118:0x0418, B:121:0x0428, B:123:0x0430, B:124:0x0439, B:126:0x043f, B:129:0x044f, B:131:0x0457, B:132:0x045e, B:134:0x0464, B:137:0x0472, B:139:0x047d, B:141:0x04f4, B:144:0x04fe, B:146:0x0504, B:148:0x050a, B:150:0x052a, B:152:0x0530, B:154:0x0537, B:158:0x0547, B:160:0x0550, B:161:0x0553, B:164:0x055a, B:165:0x0563, B:167:0x0573, B:168:0x0575, B:170:0x0581, B:176:0x0597, B:178:0x05b2, B:187:0x05cc, B:189:0x0617, B:190:0x0624, B:192:0x062a, B:195:0x063e, B:197:0x0646, B:198:0x064f, B:200:0x0655, B:203:0x0665, B:205:0x066d, B:206:0x0676, B:208:0x067c, B:211:0x068c, B:213:0x0694, B:214:0x069b, B:216:0x06a1, B:219:0x06af, B:221:0x06ba, B:223:0x06c4, B:226:0x0736, B:229:0x0742, B:231:0x0748, B:233:0x074e, B:235:0x076e, B:237:0x0774, B:239:0x077b, B:243:0x078b, B:245:0x0794, B:246:0x0797, B:249:0x079e, B:253:0x07be, B:255:0x07f6, B:256:0x07fd, B:258:0x0803, B:261:0x0811, B:263:0x0819, B:264:0x0820, B:266:0x0826, B:269:0x0834, B:271:0x083c, B:272:0x0843, B:274:0x0849, B:277:0x0857, B:279:0x085f, B:280:0x0866, B:282:0x086c, B:285:0x087a, B:288:0x0893, B:290:0x0899, B:292:0x089f, B:294:0x08b5, B:296:0x08bb, B:299:0x08c5, B:301:0x08ce, B:302:0x08d1, B:305:0x08d6, B:308:0x08e2, B:310:0x08e9, B:313:0x08f4, B:315:0x08fa, B:317:0x0904, B:318:0x0909, B:319:0x090c, B:321:0x0914, B:322:0x0916, B:323:0x0928, B:325:0x092f, B:327:0x0949, B:329:0x094d, B:330:0x0960, B:332:0x0981, B:335:0x09c7, B:337:0x09cd, B:339:0x09d9, B:341:0x09f9, B:343:0x0a00, B:345:0x0a29, B:347:0x0a30, B:349:0x0a3f, B:350:0x0a43, B:351:0x0a4e, B:353:0x0a57, B:355:0x0a69, B:357:0x0a94, B:359:0x0a9a, B:361:0x0ab1, B:224:0x0729, B:225:0x072f, B:179:0x05b7, B:181:0x05bd, B:140:0x04eb), top: B:369:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x078b A[Catch: Exception -> 0x0586, TryCatch #1 {Exception -> 0x0586, blocks: (B:79:0x0308, B:83:0x0317, B:85:0x0320, B:86:0x0323, B:89:0x032a, B:90:0x032f, B:92:0x033d, B:93:0x033f, B:95:0x034b, B:101:0x036a, B:105:0x0391, B:107:0x03da, B:108:0x03e7, B:110:0x03ed, B:113:0x0401, B:115:0x0409, B:116:0x0412, B:118:0x0418, B:121:0x0428, B:123:0x0430, B:124:0x0439, B:126:0x043f, B:129:0x044f, B:131:0x0457, B:132:0x045e, B:134:0x0464, B:137:0x0472, B:139:0x047d, B:141:0x04f4, B:144:0x04fe, B:146:0x0504, B:148:0x050a, B:150:0x052a, B:152:0x0530, B:154:0x0537, B:158:0x0547, B:160:0x0550, B:161:0x0553, B:164:0x055a, B:165:0x0563, B:167:0x0573, B:168:0x0575, B:170:0x0581, B:176:0x0597, B:178:0x05b2, B:187:0x05cc, B:189:0x0617, B:190:0x0624, B:192:0x062a, B:195:0x063e, B:197:0x0646, B:198:0x064f, B:200:0x0655, B:203:0x0665, B:205:0x066d, B:206:0x0676, B:208:0x067c, B:211:0x068c, B:213:0x0694, B:214:0x069b, B:216:0x06a1, B:219:0x06af, B:221:0x06ba, B:223:0x06c4, B:226:0x0736, B:229:0x0742, B:231:0x0748, B:233:0x074e, B:235:0x076e, B:237:0x0774, B:239:0x077b, B:243:0x078b, B:245:0x0794, B:246:0x0797, B:249:0x079e, B:253:0x07be, B:255:0x07f6, B:256:0x07fd, B:258:0x0803, B:261:0x0811, B:263:0x0819, B:264:0x0820, B:266:0x0826, B:269:0x0834, B:271:0x083c, B:272:0x0843, B:274:0x0849, B:277:0x0857, B:279:0x085f, B:280:0x0866, B:282:0x086c, B:285:0x087a, B:288:0x0893, B:290:0x0899, B:292:0x089f, B:294:0x08b5, B:296:0x08bb, B:299:0x08c5, B:301:0x08ce, B:302:0x08d1, B:305:0x08d6, B:308:0x08e2, B:310:0x08e9, B:313:0x08f4, B:315:0x08fa, B:317:0x0904, B:318:0x0909, B:319:0x090c, B:321:0x0914, B:322:0x0916, B:323:0x0928, B:325:0x092f, B:327:0x0949, B:329:0x094d, B:330:0x0960, B:332:0x0981, B:335:0x09c7, B:337:0x09cd, B:339:0x09d9, B:341:0x09f9, B:343:0x0a00, B:345:0x0a29, B:347:0x0a30, B:349:0x0a3f, B:350:0x0a43, B:351:0x0a4e, B:353:0x0a57, B:355:0x0a69, B:357:0x0a94, B:359:0x0a9a, B:361:0x0ab1, B:224:0x0729, B:225:0x072f, B:179:0x05b7, B:181:0x05bd, B:140:0x04eb), top: B:369:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08c5 A[Catch: Exception -> 0x0586, TryCatch #1 {Exception -> 0x0586, blocks: (B:79:0x0308, B:83:0x0317, B:85:0x0320, B:86:0x0323, B:89:0x032a, B:90:0x032f, B:92:0x033d, B:93:0x033f, B:95:0x034b, B:101:0x036a, B:105:0x0391, B:107:0x03da, B:108:0x03e7, B:110:0x03ed, B:113:0x0401, B:115:0x0409, B:116:0x0412, B:118:0x0418, B:121:0x0428, B:123:0x0430, B:124:0x0439, B:126:0x043f, B:129:0x044f, B:131:0x0457, B:132:0x045e, B:134:0x0464, B:137:0x0472, B:139:0x047d, B:141:0x04f4, B:144:0x04fe, B:146:0x0504, B:148:0x050a, B:150:0x052a, B:152:0x0530, B:154:0x0537, B:158:0x0547, B:160:0x0550, B:161:0x0553, B:164:0x055a, B:165:0x0563, B:167:0x0573, B:168:0x0575, B:170:0x0581, B:176:0x0597, B:178:0x05b2, B:187:0x05cc, B:189:0x0617, B:190:0x0624, B:192:0x062a, B:195:0x063e, B:197:0x0646, B:198:0x064f, B:200:0x0655, B:203:0x0665, B:205:0x066d, B:206:0x0676, B:208:0x067c, B:211:0x068c, B:213:0x0694, B:214:0x069b, B:216:0x06a1, B:219:0x06af, B:221:0x06ba, B:223:0x06c4, B:226:0x0736, B:229:0x0742, B:231:0x0748, B:233:0x074e, B:235:0x076e, B:237:0x0774, B:239:0x077b, B:243:0x078b, B:245:0x0794, B:246:0x0797, B:249:0x079e, B:253:0x07be, B:255:0x07f6, B:256:0x07fd, B:258:0x0803, B:261:0x0811, B:263:0x0819, B:264:0x0820, B:266:0x0826, B:269:0x0834, B:271:0x083c, B:272:0x0843, B:274:0x0849, B:277:0x0857, B:279:0x085f, B:280:0x0866, B:282:0x086c, B:285:0x087a, B:288:0x0893, B:290:0x0899, B:292:0x089f, B:294:0x08b5, B:296:0x08bb, B:299:0x08c5, B:301:0x08ce, B:302:0x08d1, B:305:0x08d6, B:308:0x08e2, B:310:0x08e9, B:313:0x08f4, B:315:0x08fa, B:317:0x0904, B:318:0x0909, B:319:0x090c, B:321:0x0914, B:322:0x0916, B:323:0x0928, B:325:0x092f, B:327:0x0949, B:329:0x094d, B:330:0x0960, B:332:0x0981, B:335:0x09c7, B:337:0x09cd, B:339:0x09d9, B:341:0x09f9, B:343:0x0a00, B:345:0x0a29, B:347:0x0a30, B:349:0x0a3f, B:350:0x0a43, B:351:0x0a4e, B:353:0x0a57, B:355:0x0a69, B:357:0x0a94, B:359:0x0a9a, B:361:0x0ab1, B:224:0x0729, B:225:0x072f, B:179:0x05b7, B:181:0x05bd, B:140:0x04eb), top: B:369:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x055a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x079e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x032a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0317 A[Catch: Exception -> 0x0586, TryCatch #1 {Exception -> 0x0586, blocks: (B:79:0x0308, B:83:0x0317, B:85:0x0320, B:86:0x0323, B:89:0x032a, B:90:0x032f, B:92:0x033d, B:93:0x033f, B:95:0x034b, B:101:0x036a, B:105:0x0391, B:107:0x03da, B:108:0x03e7, B:110:0x03ed, B:113:0x0401, B:115:0x0409, B:116:0x0412, B:118:0x0418, B:121:0x0428, B:123:0x0430, B:124:0x0439, B:126:0x043f, B:129:0x044f, B:131:0x0457, B:132:0x045e, B:134:0x0464, B:137:0x0472, B:139:0x047d, B:141:0x04f4, B:144:0x04fe, B:146:0x0504, B:148:0x050a, B:150:0x052a, B:152:0x0530, B:154:0x0537, B:158:0x0547, B:160:0x0550, B:161:0x0553, B:164:0x055a, B:165:0x0563, B:167:0x0573, B:168:0x0575, B:170:0x0581, B:176:0x0597, B:178:0x05b2, B:187:0x05cc, B:189:0x0617, B:190:0x0624, B:192:0x062a, B:195:0x063e, B:197:0x0646, B:198:0x064f, B:200:0x0655, B:203:0x0665, B:205:0x066d, B:206:0x0676, B:208:0x067c, B:211:0x068c, B:213:0x0694, B:214:0x069b, B:216:0x06a1, B:219:0x06af, B:221:0x06ba, B:223:0x06c4, B:226:0x0736, B:229:0x0742, B:231:0x0748, B:233:0x074e, B:235:0x076e, B:237:0x0774, B:239:0x077b, B:243:0x078b, B:245:0x0794, B:246:0x0797, B:249:0x079e, B:253:0x07be, B:255:0x07f6, B:256:0x07fd, B:258:0x0803, B:261:0x0811, B:263:0x0819, B:264:0x0820, B:266:0x0826, B:269:0x0834, B:271:0x083c, B:272:0x0843, B:274:0x0849, B:277:0x0857, B:279:0x085f, B:280:0x0866, B:282:0x086c, B:285:0x087a, B:288:0x0893, B:290:0x0899, B:292:0x089f, B:294:0x08b5, B:296:0x08bb, B:299:0x08c5, B:301:0x08ce, B:302:0x08d1, B:305:0x08d6, B:308:0x08e2, B:310:0x08e9, B:313:0x08f4, B:315:0x08fa, B:317:0x0904, B:318:0x0909, B:319:0x090c, B:321:0x0914, B:322:0x0916, B:323:0x0928, B:325:0x092f, B:327:0x0949, B:329:0x094d, B:330:0x0960, B:332:0x0981, B:335:0x09c7, B:337:0x09cd, B:339:0x09d9, B:341:0x09f9, B:343:0x0a00, B:345:0x0a29, B:347:0x0a30, B:349:0x0a3f, B:350:0x0a43, B:351:0x0a4e, B:353:0x0a57, B:355:0x0a69, B:357:0x0a94, B:359:0x0a9a, B:361:0x0ab1, B:224:0x0729, B:225:0x072f, B:179:0x05b7, B:181:0x05bd, B:140:0x04eb), top: B:369:0x0308 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 2763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.l.i():void");
    }

    public final E a() {
        return new E(this.bu, this.bv);
    }

    public final void a(int i10) {
        this.f27496e = i10;
    }

    public final boolean b() {
        JSONObject jSONObject = this.f27495d;
        return (((((jSONObject != null) && !jSONObject.has("error")) && this.f27480a != null) && this.f27487b != null) && this.f27494c != null) && f();
    }

    public final String c() {
        try {
            return this.f27480a.f27272b;
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e10);
            return null;
        }
    }

    public final String d() {
        try {
            return this.f27480a.f27273c;
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e10);
            return null;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.bu);
            jSONObject.put(DataKeys.USER_ID, this.bv);
            jSONObject.put("response", this.f27495d);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }
}
