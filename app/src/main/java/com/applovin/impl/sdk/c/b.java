package com.applovin.impl.sdk.c;

import android.net.Uri;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.applovin.impl.a.m;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b<T> implements Comparable {
    public static final b<Boolean> W;
    public static final b<String> X;
    public static final b<Boolean> Y;
    public static final b<String> Z;
    public static final b<Long> aA;
    public static final b<Long> aB;
    public static final b<Long> aC;
    public static final b<Long> aD;
    public static final b<Long> aE;
    public static final b<Long> aF;
    public static final b<String> aG;
    public static final b<String> aH;
    public static final b<String> aI;
    public static final b<String> aJ;
    public static final b<Long> aK;
    public static final b<Integer> aL;
    public static final b<Integer> aM;
    public static final b<Integer> aN;
    public static final b<String> aO;
    public static final b<String> aP;
    public static final b<String> aQ;
    public static final b<String> aR;
    public static final b<String> aS;
    public static final b<String> aT;
    public static final b<String> aU;
    public static final b<String> aV;
    public static final b<String> aW;
    public static final b<String> aX;
    public static final b<String> aY;
    public static final b<String> aZ;

    /* renamed from: aa  reason: collision with root package name */
    public static final b<Long> f8192aa;

    /* renamed from: ab  reason: collision with root package name */
    public static final b<Boolean> f8193ab;

    /* renamed from: ac  reason: collision with root package name */
    public static final b<String> f8194ac;

    /* renamed from: ad  reason: collision with root package name */
    public static final b<String> f8195ad;

    /* renamed from: ae  reason: collision with root package name */
    public static final b<String> f8196ae;

    /* renamed from: af  reason: collision with root package name */
    public static final b<String> f8197af;
    public static final b<Boolean> ag;
    public static final b<Boolean> ah;
    public static final b<Boolean> ai;
    public static final b<Boolean> aj;
    public static final b<Long> ak;
    public static final b<Integer> al;
    public static final b<Integer> am;
    public static final b<Boolean> an;
    public static final b<Boolean> ao;
    public static final b<Integer> ap;
    public static final b<Boolean> aq;
    public static final b<String> ar;
    public static final b<Boolean> as;
    public static final b<String> at;
    public static final b<Boolean> au;
    public static final b<Long> av;
    public static final b<Boolean> aw;
    public static final b<Boolean> ax;
    public static final b<Boolean> ay;
    public static final b<Boolean> az;
    public static final b<String> bA;
    public static final b<String> bB;
    public static final b<String> bC;
    public static final b<String> bD;
    public static final b<Boolean> bE;
    public static final b<Integer> bF;
    public static final b<Integer> bG;
    public static final b<Boolean> bH;
    public static final b<Long> bI;
    public static final b<Integer> bJ;
    public static final b<Integer> bK;
    public static final b<Integer> bL;
    public static final b<Integer> bM;
    public static final b<Integer> bN;
    public static final b<Integer> bO;
    public static final b<Integer> bP;
    public static final b<Integer> bQ;
    public static final b<Float> bR;
    public static final b<Long> bS;
    public static final b<Long> bT;
    public static final b<Integer> bU;
    public static final b<Integer> bV;
    public static final b<Integer> bW;
    public static final b<Boolean> bX;
    public static final b<Integer> bY;
    public static final b<Boolean> bZ;

    /* renamed from: ba  reason: collision with root package name */
    public static final b<String> f8199ba;

    /* renamed from: bb  reason: collision with root package name */
    public static final b<String> f8200bb;

    /* renamed from: bc  reason: collision with root package name */
    public static final b<String> f8201bc;

    /* renamed from: bd  reason: collision with root package name */
    public static final b<String> f8202bd;

    /* renamed from: be  reason: collision with root package name */
    public static final b<Boolean> f8203be;

    /* renamed from: bf  reason: collision with root package name */
    public static final b<Integer> f8204bf;
    public static final b<Integer> bg;
    public static final b<Long> bh;
    public static final b<Boolean> bi;
    public static final b<Boolean> bj;
    public static final b<Long> bk;
    public static final b<Integer> bl;
    public static final b<String> bm;
    public static final b<Boolean> bn;
    public static final b<Boolean> bo;
    public static final b<String> bp;
    public static final b<String> bq;
    public static final b<Boolean> br;
    public static final b<Integer> bs;
    public static final b<Integer> bt;
    public static final b<Boolean> bu;
    public static final b<String> bv;
    public static final b<String> bw;
    public static final b<String> bx;
    public static final b<String> by;
    public static final b<Boolean> bz;
    public static final b<Integer> cA;
    public static final b<Integer> cB;
    public static final b<Long> cC;
    public static final b<Integer> cD;
    public static final b<Integer> cE;
    public static final b<Boolean> cF;
    public static final b<Boolean> cG;
    public static final b<Integer> cH;
    public static final b<Integer> cI;
    public static final b<Integer> cJ;
    public static final b<Boolean> cK;
    public static final b<Integer> cL;
    public static final b<Boolean> cM;
    public static final b<Integer> cN;
    public static final b<Integer> cO;
    public static final b<Integer> cP;
    public static final b<Boolean> cQ;
    public static final b<Integer> cR;
    public static final b<Integer> cS;
    public static final b<Boolean> cT;
    public static final b<Boolean> cU;
    public static final b<Integer> cV;
    public static final b<Integer> cW;
    public static final b<Integer> cX;
    public static final b<Integer> cY;
    public static final b<Boolean> cZ;

    /* renamed from: ca  reason: collision with root package name */
    public static final b<String> f8205ca;

    /* renamed from: cb  reason: collision with root package name */
    public static final b<String> f8206cb;

    /* renamed from: cc  reason: collision with root package name */
    public static final b<String> f8207cc;

    /* renamed from: cd  reason: collision with root package name */
    public static final b<Integer> f8208cd;

    /* renamed from: ce  reason: collision with root package name */
    public static final b<Integer> f8209ce;

    /* renamed from: cf  reason: collision with root package name */
    public static final b<Long> f8210cf;
    public static final b<Long> cg;
    public static final b<Boolean> ch;
    public static final b<Integer> ci;
    public static final b<Integer> cj;
    public static final b<Integer> ck;

    /* renamed from: cl  reason: collision with root package name */
    public static final b<Long> f8211cl;
    public static final b<Long> cm;
    public static final b<Boolean> cn;
    public static final b<Boolean> co;
    public static final b<Boolean> cp;
    public static final b<Boolean> cq;
    public static final b<Boolean> cr;
    public static final b<Boolean> cs;
    public static final b<Boolean> ct;
    public static final b<Boolean> cu;
    public static final b<Integer> cv;
    public static final b<Integer> cw;
    public static final b<Integer> cx;
    public static final b<Long> cy;
    public static final b<Integer> cz;
    public static final b<Boolean> dA;
    public static final b<Boolean> dB;
    public static final b<Boolean> dC;
    public static final b<Boolean> dD;
    public static final b<Boolean> dE;
    public static final b<Boolean> dF;
    public static final b<Boolean> dG;
    public static final b<Boolean> dH;
    public static final b<Boolean> dI;
    public static final b<Boolean> dJ;
    public static final b<Boolean> dK;
    public static final b<Float> dL;
    public static final b<Boolean> dM;
    public static final b<Boolean> dN;
    public static final b<Boolean> dO;
    public static final b<Boolean> dP;
    public static final b<Float> dQ;
    public static final b<Integer> dR;
    public static final b<Boolean> dS;
    public static final b<Boolean> dT;
    public static final b<Long> dU;
    public static final b<Integer> dV;
    public static final b<Boolean> dW;
    public static final b<Long> dX;
    public static final b<Integer> dY;
    public static final b<Boolean> dZ;

    /* renamed from: da  reason: collision with root package name */
    public static final b<Boolean> f8212da;

    /* renamed from: db  reason: collision with root package name */
    public static final b<Integer> f8213db;

    /* renamed from: dc  reason: collision with root package name */
    public static final b<Integer> f8214dc;

    /* renamed from: dd  reason: collision with root package name */
    public static final b<Boolean> f8215dd;

    /* renamed from: de  reason: collision with root package name */
    public static final b<Boolean> f8216de;

    /* renamed from: df  reason: collision with root package name */
    public static final b<Boolean> f8217df;
    public static final b<Boolean> dg;
    public static final b<Long> dh;
    public static final b<Integer> di;
    public static final b<Long> dj;
    public static final b<Integer> dk;
    public static final b<Boolean> dl;
    public static final b<Long> dm;
    public static final b<Long> dn;

    /* renamed from: do  reason: not valid java name */
    public static final b<Boolean> f0do;
    public static final b<Boolean> dp;
    public static final b<Boolean> dq;
    public static final b<Boolean> dr;
    public static final b<Boolean> ds;
    public static final b<Boolean> dt;
    public static final b<Boolean> du;
    public static final b<Boolean> dv;
    public static final b<Boolean> dw;
    public static final b<Boolean> dx;
    public static final b<Boolean> dy;
    public static final b<String> dz;
    public static final b<Boolean> eA;
    public static final b<Boolean> eB;
    public static final b<Boolean> eC;
    public static final b<Boolean> eD;
    public static final b<Boolean> eE;
    public static final b<Boolean> eF;
    public static final b<Boolean> eG;
    public static final b<Boolean> eH;
    public static final b<Boolean> eI;
    public static final b<Boolean> eJ;
    public static final b<Boolean> eK;
    public static final b<Boolean> eL;
    public static final b<Boolean> eM;
    public static final b<Boolean> eN;
    public static final b<Boolean> eO;
    public static final b<Boolean> eP;
    public static final b<Long> eQ;
    public static final b<Long> eR;
    public static final b<Long> eS;
    public static final b<Boolean> eT;
    public static final b<String> eU;
    public static final b<String> eV;
    public static final b<String> eW;
    public static final b<Boolean> eX;

    /* renamed from: ea  reason: collision with root package name */
    public static final b<Boolean> f8218ea;

    /* renamed from: eb  reason: collision with root package name */
    public static final b<Integer> f8219eb;

    /* renamed from: ec  reason: collision with root package name */
    public static final b<Integer> f8220ec;

    /* renamed from: ed  reason: collision with root package name */
    public static final b<Integer> f8221ed;

    /* renamed from: ee  reason: collision with root package name */
    public static final b<Boolean> f8222ee;

    /* renamed from: ef  reason: collision with root package name */
    public static final b<String> f8223ef;
    public static final b<String> eg;
    public static final b<Integer> eh;
    public static final b<Integer> ei;
    public static final b<String> ej;
    public static final b<String> ek;
    public static final b<Boolean> el;
    public static final b<Integer> em;
    public static final b<Integer> en;
    public static final b<Integer> eo;
    public static final b<Boolean> ep;
    public static final b<Boolean> eq;
    public static final b<Long> er;
    public static final b<Long> es;
    public static final b<Integer> et;
    public static final b<Boolean> eu;
    public static final b<Boolean> ev;
    public static final b<Boolean> ew;
    public static final b<Boolean> ex;
    public static final b<Boolean> ey;
    public static final b<Boolean> ez;

    /* renamed from: c  reason: collision with root package name */
    private final String f8224c;

    /* renamed from: d  reason: collision with root package name */
    private final T f8225d;

    /* renamed from: a  reason: collision with root package name */
    private static final List<?> f8191a = Arrays.asList(Boolean.class, Float.class, Integer.class, Long.class, String.class);

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, b<?>> f8198b = new HashMap((int) AdRequest.MAX_CONTENT_URL_LENGTH);

    static {
        Boolean bool = Boolean.FALSE;
        W = a("is_disabled", bool);
        X = a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        Y = a("rss", bool2);
        Z = a("device_token", "");
        f8192aa = a("publisher_id", 0L);
        f8193ab = a("is_verbose_logging", bool);
        f8194ac = a("sc", "");
        f8195ad = a("sc2", "");
        f8196ae = a("sc3", "");
        f8197af = a("server_installed_at", "");
        ag = a("track_network_response_codes", bool);
        ah = a("submit_network_response_codes", bool);
        ai = a("clear_network_response_codes_on_request", bool2);
        aj = a("clear_completion_callback_on_failure", bool);
        ak = a("sicd_ms", 0L);
        al = a("logcat_max_line_size", 1000);
        am = a("stps", 16);
        an = a("ustp", bool);
        ao = a("exception_handler_enabled", bool2);
        ap = a("network_thread_count", 4);
        aq = a("init_omsdk", bool2);
        ar = a("omsdk_partner_name", "applovin");
        as = a("publisher_can_show_consent_dialog", bool2);
        at = a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");
        au = a("consent_dialog_immersive_mode_on", bool);
        av = a("consent_dialog_show_from_alert_delay_ms", 450L);
        aw = a("alert_consent_for_dialog_rejected", bool);
        ax = a("alert_consent_for_dialog_closed", bool);
        ay = a("alert_consent_for_dialog_closed_with_back_button", bool);
        az = a("alert_consent_after_init", bool);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        aA = a("alert_consent_after_init_interval_ms", Long.valueOf(timeUnit.toMillis(5L)));
        aB = a("alert_consent_after_dialog_rejection_interval_ms", Long.valueOf(timeUnit.toMillis(30L)));
        aC = a("alert_consent_after_dialog_close_interval_ms", Long.valueOf(timeUnit.toMillis(5L)));
        aD = a("alert_consent_after_dialog_close_with_back_button_interval_ms", Long.valueOf(timeUnit.toMillis(5L)));
        aE = a("alert_consent_after_cancel_interval_ms", Long.valueOf(timeUnit.toMillis(10L)));
        aF = a("alert_consent_reschedule_interval_ms", Long.valueOf(timeUnit.toMillis(5L)));
        aG = a("text_alert_consent_title", "Make this App Better and Stay Free!");
        aH = a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");
        aI = a("text_alert_consent_yes_option", "I Agree");
        aJ = a("text_alert_consent_no_option", "Cancel");
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        aK = a("ttc_max_click_duration_ms", Long.valueOf(timeUnit2.toMillis(1L)));
        aL = a("ttc_max_click_distance_dp", 10);
        aM = a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));
        aN = a("ttc_edge_buffer_dp", 0);
        aO = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        aP = a("fetch_settings_endpoint", "https://ms.applovin.com/");
        aQ = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        aR = a("adserver_endpoint", "https://a.applovin.com/");
        aS = a("adserver_backup_endpoint", "https://a.applvn.com/");
        aT = a("api_endpoint", "https://d.applovin.com/");
        aU = a("api_backup_endpoint", "https://d.applvn.com/");
        aV = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        aW = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        aX = a("fetch_variables_endpoint", "https://ms.applovin.com/");
        aY = a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");
        aZ = a("anr_postback_endpoint", "https://ms.applovin.com/1.0/sdk/error");
        f8199ba = a("token_type_prefixes_r", "4!");
        f8200bb = a("token_type_prefixes_arj", "json_v3!");
        f8201bc = a("top_level_events", "landing,paused,resumed,ref,rdf,checkout,iap");
        f8202bd = a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());
        f8203be = a("persist_super_properties", bool2);
        Integer valueOf = Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        f8204bf = a("super_property_string_max_length", valueOf);
        bg = a("super_property_url_max_length", valueOf);
        bh = a("cached_advertising_info_ttl_ms", Long.valueOf(timeUnit.toMillis(10L)));
        bi = a("use_per_format_cache_queues", bool2);
        bj = a("cache_cleanup_enabled", bool);
        bk = a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1L)));
        bl = a("cache_max_size_mb", -1);
        bm = a("precache_delimiters", ")]',");
        bn = a("ad_resource_caching_enabled", bool2);
        bo = a("fail_ad_load_on_failed_video_cache", bool2);
        bp = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        bq = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        br = a("use_old_file_manager", bool);
        bs = a("vr_retry_count_v1", 1);
        bt = a("cr_retry_count_v1", 1);
        bu = a("incent_warning_enabled", bool);
        bv = a("text_incent_warning_title", "Attention!");
        bw = a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");
        bx = a("text_incent_warning_close_option", "Close");
        by = a("text_incent_warning_continue_option", "Keep Watching");
        bz = a("incent_nonvideo_warning_enabled", bool);
        bA = a("text_incent_nonvideo_warning_title", "Attention!");
        bB = a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");
        bC = a("text_incent_nonvideo_warning_close_option", "Close");
        bD = a("text_incent_nonvideo_warning_continue_option", "Keep Playing");
        bE = a("check_webview_has_gesture", bool);
        bF = a("close_button_touch_area", 0);
        bG = a("close_button_outside_touch_area", 0);
        bH = a("creative_debugger_enabled", bool);
        bI = a("viewability_adview_imp_delay_ms", Long.valueOf(timeUnit2.toMillis(1L)));
        bJ = a("viewability_adview_banner_min_width", 320);
        bK = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        bL = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        bM = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        bN = a("viewability_adview_leader_min_width", 728);
        bO = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        bP = a("viewability_adview_native_min_width", 0);
        bQ = a("viewability_adview_native_min_height", 0);
        bR = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        bS = a("viewability_timer_min_visible_ms", Long.valueOf(timeUnit2.toMillis(1L)));
        bT = a("viewability_timer_interval_ms", 100L);
        bU = a("expandable_close_button_size", 27);
        bV = a("expandable_h_close_button_margin", 10);
        bW = a("expandable_t_close_button_margin", 10);
        bX = a("expandable_lhs_close_button", bool);
        bY = a("expandable_close_button_touch_area", 0);
        bZ = a("iaad", bool);
        f8205ca = a("js_tag_schemes", "applovin,mopub");
        f8206cb = a("js_tag_load_success_hosts", "load,load_succeeded");
        f8207cc = a("js_tag_load_failure_hosts", "failLoad,load_failed");
        f8208cd = a("auxiliary_operations_threads", 3);
        f8209ce = a("caching_operations_threads", 8);
        f8210cf = a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(timeUnit2.toMillis(10L)));
        cg = a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(timeUnit.toMillis(2L)));
        ch = a("lhs_close_button_video", bool);
        ci = a("close_button_right_margin_video", 4);
        cj = a("close_button_size_video", 30);
        ck = a("close_button_top_margin_video", 8);
        f8211cl = a("inter_display_delay", 200L);
        cm = a("maximum_close_button_delay_seconds", 999L);
        cn = a("respect_close_button", bool2);
        co = a("lhs_skip_button", bool2);
        cp = a("track_app_killed", bool);
        cq = a("mute_controls_enabled", bool);
        cr = a("allow_user_muting", bool2);
        cs = a("mute_videos", bool);
        ct = a("show_mute_by_default", bool);
        cu = a("mute_with_user_settings", bool2);
        cv = a("mute_button_size", 32);
        cw = a("mute_button_margin", 10);
        cx = a("mute_button_gravity", 85);
        cy = a("progress_bar_step", 25L);
        cz = a("progress_bar_scale", 10000);
        cA = a("progress_bar_vertical_padding", -8);
        cB = a("vs_buffer_indicator_size", 50);
        cC = a("set_poststitial_muted_initial_delay_ms", 500L);
        cD = a("minepsv", -1);
        cE = a("maxepsv", -1);
        cF = a("fasuic", bool2);
        cG = a("ssfwif", bool);
        cH = a("submit_postback_timeout", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        cI = a("submit_postback_retries", 4);
        cJ = a("max_postback_attempts", 3);
        cK = a("fppopq", bool);
        cL = a("max_persisted_postbacks", 100);
        cM = a("retry_on_all_errors", bool);
        cN = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        cO = a("http_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        cP = a("http_socket_timeout", Integer.valueOf((int) timeUnit2.toMillis(20L)));
        cQ = a("force_ssl", bool);
        cR = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        cS = a("fetch_ad_retry_count_v1", 1);
        cT = a("faer", bool);
        cU = a("faroae", bool);
        cV = a("submit_data_retry_count_v1", 1);
        cW = a("response_buffer_size", 16000);
        cX = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        cY = a("fetch_basic_settings_retry_count", 3);
        cZ = a("fetch_basic_settings_on_reconnect", bool);
        f8212da = a("skip_fetch_basic_settings_if_not_connected", bool);
        f8213db = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit2.toMillis(2L)));
        f8214dc = a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(5L)));
        f8215dd = a("idflrwbe", bool);
        f8216de = a("falawpr", bool);
        f8217df = a("sort_query_parameters", bool);
        dg = a("encode_amp_query_value", bool);
        dh = a("communicator_request_timeout_ms", Long.valueOf(timeUnit2.toMillis(10L)));
        di = a("communicator_request_retry_count", 3);
        dj = a("communicator_request_retry_delay_ms", Long.valueOf(timeUnit2.toMillis(2L)));
        dk = a("ad_session_minutes", 60);
        dl = a("session_tracking_cooldown_on_event_fire", bool2);
        dm = a("session_tracking_resumed_cooldown_minutes", 90L);
        dn = a("session_tracking_paused_cooldown_minutes", 90L);
        f0do = a("qq", bool);
        dp = a("qq1", bool2);
        dq = a("qq2", bool2);
        dr = a("qq3", bool2);
        ds = a("qq4", bool2);
        dt = a("qq5", bool2);
        du = a("qq6", bool2);
        dv = a("qq7", bool2);
        dw = a("qq8", bool2);
        dx = a("qq9", bool);
        dy = a("pui", bool2);
        dz = a("plugin_version", "");
        dA = a("hgn", bool);
        dB = a("cso", bool);
        dC = a("cfs", bool);
        dD = a("cmi", bool);
        dE = a("crat", bool);
        dF = a("cvs", bool);
        dG = a("caf", bool);
        dH = a("cf", bool);
        dI = a("cmtl", bool2);
        dJ = a("cnr", bool);
        dK = a("adr", bool);
        dL = a("volume_normalization_factor", Float.valueOf(6.6666665f));
        dM = a("system_user_agent_collection_enabled", bool);
        dN = a("user_agent_collection_enabled", bool);
        dO = a("collect_device_angle", bool);
        dP = a("collect_device_movement", bool);
        dQ = a("movement_degradation", Float.valueOf(0.75f));
        dR = a("device_sensor_period_ms", Integer.valueOf((int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));
        dS = a("dte", bool2);
        dT = a("idcw", bool);
        dU = a("anr_debug_thread_refresh_time_ms", -1L);
        dV = a("fetch_basic_settings_delay_ms", 1500);
        dW = a("cclia", bool2);
        dX = a("lccdm", 10L);
        dY = a("lmfd", 3);
        dZ = a("is_track_ad_info", bool2);
        f8218ea = a("submit_ad_stats_enabled", bool);
        f8219eb = a("submit_ad_stats_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        f8220ec = a("submit_ad_stats_retry_count", 1);
        f8221ed = a("submit_ad_stats_max_count", 500);
        f8222ee = a("asdm", bool);
        f8223ef = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        eg = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        eh = a("vast_max_response_length", 640000);
        ei = a("vast_max_wrapper_depth", 5);
        ej = a("vast_unsupported_video_extensions", "ogv,flv");
        ek = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        el = a("vast_validate_with_extension_if_no_video_type", bool2);
        em = a("vast_video_selection_policy", Integer.valueOf(m.a.MEDIUM.ordinal()));
        en = a("vast_wrapper_resolution_retry_count_v1", 1);
        eo = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        ep = a("ree", bool2);
        eq = a("btee", bool2);
        er = a("server_timestamp_ms", 0L);
        es = a("device_timestamp_ms", 0L);
        et = a("gzip_min_length", 0);
        eu = a("gzip_encoding_default", bool);
        ev = a("fetch_settings_gzip", bool);
        ew = a("device_init_gzip", bool);
        ex = a("fetch_ad_gzip", bool);
        ey = a("event_tracking_gzip", bool);
        ez = a("submit_ad_stats_gzip", bool);
        eA = a("reward_postback_gzip", bool);
        eB = a("force_rerender", bool);
        eC = a("daostr", bool);
        eD = a("tctlaa", bool);
        eE = a("rwvdv", bool);
        eF = a("handle_render_process_gone", bool2);
        eG = a("comcr", bool2);
        eH = a("teorpc", bool);
        eI = a("rmpibt", bool);
        eJ = a("spbcioa", bool);
        eK = a("set_webview_render_process_client", bool);
        eL = a("disable_webview_hardware_acceleration", bool);
        eM = a("dsaovcf", bool);
        eN = a("daoar", bool);
        eO = a("use_uri_encode", bool);
        eP = a("anr_detection_enabled", bool);
        eQ = a("anr_trigger_millis", 4000L);
        eR = a("anr_touch_millis", 3000L);
        eS = a("anr_check_millis", 3000L);
        eT = a("frpcfn", bool);
        eU = a("config_consent_dialog_state", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
        eV = a("country_code", "");
        eW = a("c_sticky_topics", "user_engagement_sdk_init,adjust_init,safedk_init,discovery_init,max_ad_events,send_http_request,adapter_initialization_status,privacy_setting_updated,network_sdk_version_updated");
        eX = a("communicator_enabled", bool2);
    }

    public b(String str, T t10) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (t10 == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f8224c = str;
        this.f8225d = t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> b<T> a(String str, T t10) {
        if (t10 != null) {
            if (!f8191a.contains(t10.getClass())) {
                throw new IllegalArgumentException("Unsupported value type: " + t10.getClass());
            }
            b<T> bVar = new b<>(str, t10);
            Map<String, b<?>> map = f8198b;
            if (!map.containsKey(str)) {
                map.put(str, bVar);
                return bVar;
            }
            throw new IllegalArgumentException("Setting has already been used: " + str);
        }
        throw new IllegalArgumentException("No default value specified");
    }

    public static Collection<b<?>> c() {
        return Collections.synchronizedCollection(f8198b.values());
    }

    public T a(Object obj) {
        return (T) this.f8225d.getClass().cast(obj);
    }

    public String a() {
        return this.f8224c;
    }

    public T b() {
        return this.f8225d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof b) {
            return this.f8224c.compareTo(((b) obj).a());
        }
        return 0;
    }
}
