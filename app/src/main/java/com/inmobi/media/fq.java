package com.inmobi.media;

import android.graphics.Color;
import android.text.TextUtils;
import com.inmobi.commons.utils.json.Constructor;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.service.download.ParallelDownload;
import fm.castbox.mediation.widget.AdView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: AdConfig.java */
@ik
/* loaded from: classes3.dex */
public final class fq extends fr {
    private static final String ALLOWED_CONTENT_TYPE = "allowedContentType";
    private static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    private static final boolean DEFAULT_CCT_ENABLED = true;
    private static final int DEFAULT_FETCH_TIMEOUT = 60;
    private static final int DEFAULT_MAX_POOL_SIZE = 10;
    private static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    private static final int DEFAULT_REFRESH_INTERVAL = 60;
    private static final String GESTURE_LIST = "gestures";
    private static final String TAG = "fq";
    public a assetCache;
    private Map<String, d> cache;
    public boolean cctEnabled;
    public int defaultRefreshInterval;
    public int fetchTimeout;
    public e imai;
    public int maxPoolSize;
    public int minimumRefreshInterval;
    public g mraid;
    public i rendering;
    public jh timeouts;
    public String url;
    public k vastVideo;
    public m viewability;

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class a {
        public int maxRetries = 3;
        public int retryInterval = 1;
        int maxCachedAssets = 10;
        public long maxCacheSize = 104857600;
        public long timeToLive = 259200;
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class b {
        public byte impressionType = 0;
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class c {
        public boolean bitrate_mandatory = false;
        public int headerTimeout = 2000;
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class d {
        public long timeToLive = 3300;

        d() {
        }
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class e {
        public int maxRetries = 3;
        public int pingInterval = 60;
        public int pingTimeout = 120;
        public int maxDbEvents = 500;
        public int maxEventBatch = 10;
        public long pingCacheExpiry = 10800;
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class f {
        public byte impressionType = 1;
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class g {
        public long expiry = 432000;
        public int maxRetries = 3;
        public int retryInterval = 60;
        public String url = "https://i.l.inmobicdn.net/sdk/sdk/500/android/mraid.js";
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class h {
        public long expiry = 432000;
        public int maxRetries = 3;
        public int retryInterval = 60;
        public String partnerKey = "Inmobi";
        public String url = "https://i.l.inmobicdn.net/sdk/sdk/OMID/omsdk-v1.3.17.js";
        public boolean omidEnabled = true;
        public long webViewRetainTime = 1000;
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class i {
        static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
        public static final int DEFAULT_TOUCH_RESET_TIME = 4;
        public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
        int picWidth = 320;
        int picHeight = 480;
        int picQuality = 100;
        String webviewBackground = "#00000000";
        public boolean autoRedirectionEnforcement = true;
        public long userTouchResetTime = 4;
        int maxVibrationDuration = 5;
        int maxVibrationPatternLength = 20;
        private long delayedRedirection = 5;
        j savecontent = new j();
        public boolean shouldRenderPopup = false;
        public boolean enablePubMuteControl = false;
        public int bannerNetworkLoadsLimit = 50;
        public int otherNetworkLoadsLimit = -1;
        public List<Integer> gestures = new ArrayList(Arrays.asList(0, 1, 2, 3, 4, 5));

        public final int a() {
            try {
                return Color.parseColor(this.webviewBackground);
            } catch (IllegalArgumentException unused) {
                String unused2 = fq.TAG;
                return Color.parseColor("#00000000");
            }
        }
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class j {
        long maxSaveSize = ParallelDownload.ONE_CONNECTION_UPPER_LIMIT;
        List<String> allowedContentType = new ArrayList(Collections.singletonList("video/mp4"));
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class k {
        public int maxWrapperLimit = 3;
        public long optimalVastVideoSize = 3145728;
        public long vastMaxAssetSize = 31457280;
        public c bitRate = new c();
        public List<String> allowedContentType = new ArrayList(Arrays.asList("video/mp4", "image/jpeg", "image/jpg", "image/gif", "image/png"));
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class l {
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 2000;
        public int videoMinPercentagePlay = 50;
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class m {
        static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
        static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 1000;
        public int visibilityThrottleMillis = 100;
        public int impressionPollIntervalMillis = IronSourceConstants.INTERSTITIAL_DAILY_CAPPED;
        public int displayMinPercentageAnimate = 67;
        public l video = new l();
        public n web = new n();
        public h omidConfig = new h();
        public b banner = new b();
        public f interstitial = new f();
        private boolean moatEnabled = true;
    }

    /* compiled from: AdConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class n {
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 1000;
        public int impressionPollIntervalMillis = 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fq(String str) {
        super(str);
        this.maxPoolSize = 10;
        this.url = DEFAULT_AD_SERVER_URL;
        this.minimumRefreshInterval = 20;
        this.defaultRefreshInterval = 60;
        this.fetchTimeout = 60;
        this.cctEnabled = true;
        this.timeouts = jh.a();
        this.imai = new e();
        this.rendering = new i();
        this.mraid = new g();
        this.viewability = new m();
        this.vastVideo = new k();
        this.assetCache = new a();
        HashMap hashMap = new HashMap();
        this.cache = hashMap;
        hashMap.put("base", new d());
        this.cache.put(AdView.AdType.BANNER, new d());
        this.cache.put("int", new d());
        this.cache.put("native", new d());
    }

    public static ij<fq> a() {
        return new ij().a(new io("cache", fq.class), (in) new im(new Constructor<Map<String, d>>() { // from class: com.inmobi.media.fq.1
            @Override // com.inmobi.commons.utils.json.Constructor
            public final /* synthetic */ Map<String, d> construct() {
                return new HashMap();
            }
        }, d.class)).a(new io(ALLOWED_CONTENT_TYPE, j.class), (in) new il(new Constructor<List<String>>() { // from class: com.inmobi.media.fq.2
            @Override // com.inmobi.commons.utils.json.Constructor
            public final /* synthetic */ List<String> construct() {
                return new ArrayList();
            }
        }, String.class)).a(new io(ALLOWED_CONTENT_TYPE, k.class), (in) new il(new Constructor<List<String>>() { // from class: com.inmobi.media.fq.3
            @Override // com.inmobi.commons.utils.json.Constructor
            public final /* synthetic */ List<String> construct() {
                return new ArrayList();
            }
        }, String.class)).a(new io(GESTURE_LIST, i.class), (in) new il(new Constructor<List<Integer>>() { // from class: com.inmobi.media.fq.4
            @Override // com.inmobi.commons.utils.json.Constructor
            public final /* synthetic */ List<Integer> construct() {
                return new ArrayList();
            }
        }, Integer.class));
    }

    @Override // com.inmobi.media.fr
    public final String b() {
        return "ads";
    }

    @Override // com.inmobi.media.fr
    public final JSONObject c() {
        return a().a((ij<fq>) this);
    }

    @Override // com.inmobi.media.fr
    public final boolean d() {
        int i10;
        int i11;
        boolean z10;
        String str;
        boolean z11;
        a aVar;
        int i12;
        int i13;
        int i14;
        l lVar;
        int i15;
        n nVar;
        int i16;
        int i17;
        int i18;
        int i19;
        String str2;
        if (this.maxPoolSize <= 0) {
            return false;
        }
        this.timeouts.j();
        if ((this.url.startsWith("http://") || this.url.startsWith("https://")) && (i10 = this.minimumRefreshInterval) >= 0 && (i11 = this.defaultRefreshInterval) >= 0 && i10 <= i11 && this.fetchTimeout > 0) {
            Iterator<Map.Entry<String, d>> it = this.cache.entrySet().iterator();
            do {
                z10 = true;
                if (it.hasNext()) {
                    if (it.next().getValue().timeToLive < 0) {
                        z10 = false;
                        continue;
                    }
                } else {
                    e eVar = this.imai;
                    if (eVar.maxDbEvents >= 0 && eVar.maxEventBatch >= 0 && eVar.maxRetries >= 0 && eVar.pingInterval >= 0 && eVar.pingTimeout > 0 && eVar.pingCacheExpiry > 0) {
                        g gVar = this.mraid;
                        if (gVar.expiry >= 0 && gVar.retryInterval >= 0 && gVar.maxRetries >= 0 && ((gVar.url.startsWith("http://") || this.mraid.url.startsWith("https://")) && this.timeouts.h() >= 0 && this.timeouts.b() >= 0 && this.timeouts.c() >= 0 && this.timeouts.d() >= 0 && this.timeouts.e() >= 0 && this.timeouts.f() >= 0 && this.timeouts.g() >= 0 && this.timeouts.i() >= 0)) {
                            i iVar = this.rendering;
                            if (iVar.picHeight >= 0 && iVar.picWidth >= 0 && iVar.picQuality >= 0 && iVar.maxVibrationDuration >= 0 && iVar.maxVibrationPatternLength >= 0 && iVar.savecontent.maxSaveSize >= 0 && iVar.webviewBackground != null && this.rendering.webviewBackground.trim().length() != 0 && this.rendering.delayedRedirection > 0 && this.rendering.userTouchResetTime >= 0 && !this.rendering.gestures.isEmpty()) {
                                try {
                                    Color.parseColor(this.rendering.webviewBackground);
                                    g gVar2 = this.mraid;
                                    if (gVar2.maxRetries >= 0 && gVar2.retryInterval >= 0 && (str = gVar2.url) != null && str.trim().length() != 0) {
                                        m mVar = this.viewability;
                                        int i20 = mVar.impressionMinPercentageViewed;
                                        if (i20 > 0 && i20 <= 100 && (i13 = mVar.impressionMinTimeViewed) >= 0 && (i14 = mVar.displayMinPercentageAnimate) > 0 && i14 <= 100 && (i15 = (lVar = mVar.video).impressionMinPercentageViewed) > 0 && i15 <= 100 && (i16 = (nVar = mVar.web).impressionMinPercentageViewed) > 0 && i16 <= 100 && nVar.impressionPollIntervalMillis > 0 && nVar.impressionMinTimeViewed >= 0 && lVar.impressionMinTimeViewed >= 0 && (i17 = lVar.videoMinPercentagePlay) > 0 && i17 <= 100 && (i18 = mVar.visibilityThrottleMillis) >= 50 && i18 * 5 <= i13 && (i19 = mVar.impressionPollIntervalMillis) >= 50 && i19 * 4 <= i13) {
                                            h hVar = mVar.omidConfig;
                                            if (!(hVar == null || hVar.maxRetries < 0 || hVar.retryInterval < 0 || (str2 = hVar.url) == null || str2.trim().length() == 0 || TextUtils.isEmpty(hVar.partnerKey))) {
                                                z11 = false;
                                                if (z11 && this.vastVideo.optimalVastVideoSize <= 31457280 && this.vastVideo.optimalVastVideoSize > 0 && this.vastVideo.maxWrapperLimit >= 0 && this.vastVideo.vastMaxAssetSize > 0 && this.vastVideo.vastMaxAssetSize <= 31457280) {
                                                    aVar = this.assetCache;
                                                    if (aVar.retryInterval < 0 && (i12 = aVar.maxCachedAssets) <= 20 && i12 >= 0 && aVar.timeToLive >= 0 && aVar.maxCacheSize >= 0 && aVar.maxRetries >= 0) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                        z11 = true;
                                        if (z11) {
                                            return false;
                                        }
                                        aVar = this.assetCache;
                                        if (aVar.retryInterval < 0) {
                                        }
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        }
                    }
                }
            } while (z10);
            return false;
        }
        return false;
    }

    public final d a(String str) {
        d dVar = this.cache.get(str);
        if (dVar == null) {
            d dVar2 = this.cache.get("base");
            return dVar2 == null ? new d() : dVar2;
        }
        return dVar;
    }
}
