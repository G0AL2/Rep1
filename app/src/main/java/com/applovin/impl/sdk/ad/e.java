package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import com.applovin.impl.adview.i;
import com.applovin.impl.adview.s;
import com.applovin.impl.adview.v;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e extends AppLovinAdImpl {

    /* renamed from: a  reason: collision with root package name */
    private final List<Uri> f8089a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f8090b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f8091c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<com.applovin.impl.sdk.b.c> f8092d;

    /* renamed from: e  reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f8093e;

    /* renamed from: f  reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f8094f;

    /* renamed from: g  reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f8095g;

    /* renamed from: h  reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f8096h;

    /* renamed from: i  reason: collision with root package name */
    private c f8097i;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* loaded from: classes.dex */
    public enum b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f8106a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8107b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8108c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8109d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8110e;

        private c() {
            this.f8106a = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) e.this).sdk.L(), e.this.Y());
            this.f8107b = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) e.this).sdk.L(), e.this.Z());
            this.f8108c = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) e.this).sdk.L(), e.this.aa());
            this.f8109d = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) e.this).sdk.L(), ((Integer) ((AppLovinAdBase) e.this).sdk.a(com.applovin.impl.sdk.c.b.bG)).intValue());
            this.f8110e = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) e.this).sdk.L(), ((Integer) ((AppLovinAdBase) e.this).sdk.a(com.applovin.impl.sdk.c.b.bF)).intValue());
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, m mVar) {
        super(jSONObject, jSONObject2, bVar, mVar);
        this.f8089a = CollectionUtils.synchronizedList();
        this.f8090b = new AtomicBoolean();
        this.f8091c = new AtomicBoolean();
        this.f8092d = new AtomicReference<>();
    }

    private i.a b(boolean z10) {
        return z10 ? i.a.WHITE_ON_TRANSPARENT : i.a.WHITE_ON_BLACK;
    }

    private String b(PointF pointF, boolean z10) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map<String, String> c10 = c(pointF, z10);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, c10);
        }
        return null;
    }

    private List<Integer> b() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    private String c() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    private Map<String, String> c(PointF pointF, boolean z10) {
        Point a10 = com.applovin.impl.sdk.utils.g.a(this.sdk.L());
        HashMap hashMap = new HashMap(5);
        hashMap.put(Utils.MACRO_CLCODE, getClCode());
        hashMap.put(Utils.MACRO_CLICK_X, String.valueOf(pointF.x));
        hashMap.put(Utils.MACRO_CLICK_Y, String.valueOf(pointF.y));
        hashMap.put(Utils.MACRO_SCREEN_WIDTH, String.valueOf(a10.x));
        hashMap.put(Utils.MACRO_SCREEN_HEIGHT, String.valueOf(a10.y));
        hashMap.put(Utils.MACRO_IS_VIDEO_CLICK, String.valueOf(z10));
        return hashMap;
    }

    public List<Uri> A() {
        return this.f8089a;
    }

    public String B() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", null);
        return jsonObjectFromAdObject != null ? JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "") : "";
    }

    public s C() {
        return new s(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean D() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public boolean E() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public a F() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DO_NOT_DISMISS;
            }
        }
        return a.UNSPECIFIED;
    }

    public List<String> G() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public List<String> H() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : this.sdk.b(com.applovin.impl.sdk.c.b.bp);
    }

    public boolean I() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public boolean J() {
        return getBooleanFromAdObject("recognize_interaction_as_click", Boolean.FALSE);
    }

    public boolean K() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public String L() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public boolean M() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public String N() {
        return getStringFromFullResponse("event_id", null);
    }

    public boolean O() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public int P() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public int Q() {
        int videoCompletionPercent;
        synchronized (this.adObjectLock) {
            videoCompletionPercent = Utils.getVideoCompletionPercent(this.adObject);
        }
        return videoCompletionPercent;
    }

    public int R() {
        synchronized (this.adObjectLock) {
            int i10 = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i10 < 0 || i10 > 100) {
                return 90;
            }
            return i10;
        }
    }

    public int S() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int T() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean U() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public boolean V() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public boolean W() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public c X() {
        if (this.f8097i == null) {
            this.f8097i = new c();
        }
        return this.f8097i;
    }

    public int Y() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cj)).intValue());
    }

    public int Z() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.ck)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i.a a(int i10) {
        return i10 == 1 ? i.a.WHITE_ON_TRANSPARENT : i10 == 2 ? i.a.INVISIBLE : i10 == 3 ? i.a.TRANSPARENT_SKIP : i.a.WHITE_ON_BLACK;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_click_tracking_urls", this.adObject, c(pointF, true), null, au(), y(), this.sdk);
        }
        return postbacks.isEmpty() ? a(pointF, true) : postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF, boolean z10) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, c(pointF, z10), b(pointF, z10), au(), y(), this.sdk);
        }
        return postbacks;
    }

    public abstract void a();

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f8092d.set(cVar);
    }

    public void a(boolean z10) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z10);
            }
        } catch (Throwable unused) {
        }
    }

    public List<String> aA() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public List<String> aB() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public Uri aC() {
        String stringFromAdObject = getStringFromAdObject("mute_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public Uri aD() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean aE() {
        return this.f8091c.get();
    }

    public void aF() {
        this.f8091c.set(true);
    }

    public com.applovin.impl.sdk.b.c aG() {
        return this.f8092d.getAndSet(null);
    }

    public boolean aH() {
        String str = this.sdk.p().getExtraParameters().get("should_use_exoplayer_if_available");
        return StringUtils.isValidString(str) ? Boolean.parseBoolean(str) : getBooleanFromAdObject("suep", Boolean.FALSE);
    }

    public boolean aI() {
        return getBooleanFromAdObject("rwvbv", Boolean.FALSE);
    }

    public boolean aJ() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public boolean aK() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    public d aL() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return "top".equals(stringFromAdObject) ? d.TOP : "bottom".equals(stringFromAdObject) ? d.BOTTOM : "left".equals(stringFromAdObject) ? d.LEFT : "right".equals(stringFromAdObject) ? d.RIGHT : d.RESIZE_ASPECT;
    }

    public int aa() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.ci)).intValue());
    }

    public boolean ab() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.ch));
    }

    public boolean ac() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.co));
    }

    public long ad() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public int ae() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean af() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public AtomicBoolean ag() {
        return this.f8090b;
    }

    public boolean ah() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public String ai() {
        return getStringFromAdObject("nia_title", "");
    }

    public String aj() {
        return getStringFromAdObject("nia_message", "");
    }

    public String ak() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public boolean al() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public boolean am() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    public String an() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public String ao() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public String ap() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public List<com.applovin.impl.sdk.d.a> aq() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f8093e;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_end_urls", this.adObject, getClCode(), c(), this.sdk);
            this.f8093e = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> ar() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f8094f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f8094f = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> as() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f8095g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f8095g = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> at() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f8096h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("imp_urls", this.adObject, getClCode(), null, null, au(), y(), this.sdk);
            this.f8096h = postbacks;
        }
        return postbacks;
    }

    public Map<String, String> au() {
        HashMap hashMap = new HashMap();
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            hashMap.put("User-Agent", ab.a());
        }
        return hashMap;
    }

    public boolean av() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public String aw() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public boolean ax() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.FALSE);
    }

    public v ay() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new v(jsonObjectFromAdObject);
        }
        return null;
    }

    public int az() {
        return getIntFromAdObject("whalt", Utils.isBML(getSize()) ? 1 : ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eL)).booleanValue() ? 0 : -1);
    }

    public void b(Uri uri) {
        this.f8089a.add(uri);
    }

    public void c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "mute_image", uri);
        }
    }

    public abstract String d();

    public void d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    public boolean f() {
        if (com.applovin.impl.sdk.v.a()) {
            this.sdk.A().e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
            return false;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return Collections.emptyList();
    }

    public Uri h() {
        if (com.applovin.impl.sdk.v.a()) {
            this.sdk.A().e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
            return null;
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public abstract boolean isOpenMeasurementEnabled();

    public Uri j() {
        if (com.applovin.impl.sdk.v.a()) {
            this.sdk.A().e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
            return null;
        }
        return null;
    }

    public Uri k() {
        if (com.applovin.impl.sdk.v.a()) {
            this.sdk.A().e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
            return null;
        }
        return null;
    }

    public abstract com.applovin.impl.sdk.a.b o();

    public b p() {
        b bVar = b.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", bVar.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? b.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? b.ACTIVITY_LANDSCAPE : bVar;
    }

    public long q() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long r() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public long s() {
        List<Integer> t10 = t();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (t10 == null || t10.size() <= 0) ? 0L : t10.get(0).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public List<Integer> t() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public i.a u() {
        List<Integer> b10 = b();
        int intFromAdObject = getIntFromAdObject("close_style", (b10 == null || b10.size() <= 0) ? -1 : b10.get(0).intValue());
        return intFromAdObject == -1 ? b(hasVideoUrl()) : a(intFromAdObject);
    }

    public List<i.a> v() {
        List<Integer> b10 = b();
        if (b10 != null) {
            ArrayList arrayList = new ArrayList(b10.size());
            for (Integer num : b10) {
                arrayList.add(a(num.intValue()));
            }
            return arrayList;
        }
        return null;
    }

    public i.a w() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? u() : a(intFromAdObject);
    }

    public boolean x() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public boolean y() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public boolean z() {
        return getBooleanFromAdObject("html_resources_cached", Boolean.FALSE);
    }
}
