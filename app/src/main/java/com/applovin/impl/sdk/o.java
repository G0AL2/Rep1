package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicReference<a> f8751h = new AtomicReference<>();

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicReference<b> f8752j = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private final m f8753a;

    /* renamed from: b  reason: collision with root package name */
    private final v f8754b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8755c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f8756d;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Object> f8758f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8759g;

    /* renamed from: e  reason: collision with root package name */
    private final Object f8757e = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference<Integer> f8760i = new AtomicReference<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8766a;

        /* renamed from: b  reason: collision with root package name */
        public String f8767b = "";
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f8768a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8769b;

        public b(String str, int i10) {
            this.f8768a = str;
            this.f8769b = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f8770a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f8771b = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8753a = mVar;
        this.f8754b = mVar.A();
        this.f8755c = mVar.L();
        this.f8756d = q();
        this.f8758f = s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer A() {
        AudioManager audioManager = (AudioManager) this.f8755c.getSystemService("audio");
        if (audioManager != null) {
            return Integer.valueOf((int) (audioManager.getStreamVolume(3) * ((Float) this.f8753a.a(com.applovin.impl.sdk.c.b.dL)).floatValue()));
        }
        return null;
    }

    private double B() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    private boolean C() {
        SensorManager sensorManager = (SensorManager) this.f8755c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private String D() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8755c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String E() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8755c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(0, Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (v.a()) {
                    this.f8754b.b("DataCollector", "Unable to collect mobile country code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String F() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8755c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (v.a()) {
                    this.f8754b.b("DataCollector", "Unable to collect mobile network code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String G() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8755c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                if (v.a()) {
                    this.f8754b.b("DataCollector", "Unable to collect carrier", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private boolean H() {
        try {
            if (!I()) {
                if (!J()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean I() {
        String str = Build.TAGS;
        return str != null && str.contains(b("lz}$blpz"));
    }

    private boolean J() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(b(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    private String a(int i10) {
        if (i10 == 1) {
            return "receiver";
        }
        if (i10 == 2) {
            return "speaker";
        }
        if (i10 == 4 || i10 == 3) {
            return "headphones";
        }
        if (i10 == 8) {
            return "bluetootha2dpoutput";
        }
        if (i10 == 13 || i10 == 19 || i10 == 5 || i10 == 6 || i10 == 12 || i10 == 11) {
            return "lineout";
        }
        if (i10 == 9 || i10 == 10) {
            return "hdmioutput";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:1|(43:3|(1:5)(2:105|(1:107))|6|(1:8)|9|(1:12)|13|(1:15)|16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)|(1:32)(1:104)|(1:34)|35|36|37|(2:41|(1:43))|44|(2:92|93)|46|(2:48|(2:50|51))|57|(1:63)|64|(2:66|(1:68))|69|(1:71)|72|(1:76)|77|(1:81)|82|(1:86)|87|(1:89)|90)|108|6|(0)|9|(1:12)|13|(0)|16|(0)|19|(0)|22|(0)|25|(0)|28|(0)|(0)(0)|(0)|35|36|37|(3:39|41|(0))|44|(0)|46|(0)|57|(3:59|61|63)|64|(0)|69|(0)|72|(2:74|76)|77|(2:79|81)|82|(2:84|86)|87|(0)|90) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0170, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0175, code lost:
        if (com.applovin.impl.sdk.v.a() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0177, code lost:
        r9.f8754b.b("DataCollector", "Unable to collect screen brightness", r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.o.a(java.util.Map, boolean):java.util.Map");
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.sdk.o.1
            @Override // java.lang.Runnable
            public void run() {
                o.f8751h.set(com.applovin.impl.sdk.utils.c.a(context));
            }
        }).start();
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dG)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(w()));
        }
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dH)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(x()));
        }
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dN)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f8753a)) {
            ab.b(this.f8753a);
        }
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dM)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (!((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dJ)).booleanValue() || map.containsKey("network_restricted")) {
            return;
        }
        map.put("network_restricted", Boolean.valueOf(u()));
    }

    private boolean a(String str) {
        try {
            return Settings.Secure.getInt(this.f8755c.getContentResolver(), str) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    private String b(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }

    public static void b(final Context context) {
        if (Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
            new Thread(new Runnable() { // from class: com.applovin.impl.sdk.o.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.applovin.impl.sdk.o.2.1
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            /* renamed from: a */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                o.f8752j.set(new b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                        if (v.a()) {
                            v.f("DataCollector", "Could not collect AppSet ID.");
                        }
                    }
                }
            }).start();
        } else if (v.a()) {
            v.f("DataCollector", "Could not collect AppSet ID.");
        }
    }

    private Map<String, String> p() {
        return Utils.stringifyObjectMap(a(null, true, false));
    }

    private Map<String, Object> q() {
        HashMap hashMap = new HashMap(32);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        hashMap.put("aida", Boolean.valueOf(com.applovin.impl.sdk.utils.c.a()));
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put("model", Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("platform", f());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(B()));
        hashMap.put("gy", Boolean.valueOf(C()));
        hashMap.put("country_code", D());
        hashMap.put("mcc", E());
        hashMap.put("mnc", F());
        hashMap.put("carrier", G());
        hashMap.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f8755c)));
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f8755c)));
        DisplayMetrics displayMetrics = this.f8755c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point a10 = com.applovin.impl.sdk.utils.g.a(this.f8755c);
            hashMap.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(a10.x, 2.0d) + Math.pow(a10.y, 2.0d)) / displayMetrics.xdpi));
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        a(hashMap);
        return hashMap;
    }

    private String r() {
        int orientation = Utils.getOrientation(this.f8755c);
        return orientation == 1 ? DtbDeviceDataRetriever.ORIENTATION_PORTRAIT : orientation == 2 ? DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE : "none";
    }

    private Map<String, Object> s() {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap(20);
        PackageManager packageManager = this.f8755c.getPackageManager();
        ApplicationInfo applicationInfo = this.f8755c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f8755c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        hashMap.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        hashMap.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        hashMap.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        hashMap.put("package_name", applicationInfo.packageName);
        hashMap.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str == null) {
            str = "";
        }
        hashMap.put("installer_name", str);
        hashMap.put("tg", com.applovin.impl.sdk.utils.p.a(this.f8753a));
        hashMap.put("debug", Boolean.valueOf(Utils.isPubInDebugMode(this.f8753a.L(), this.f8753a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        m mVar = this.f8753a;
        com.applovin.impl.sdk.c.d<Long> dVar = com.applovin.impl.sdk.c.d.f8234d;
        Long l10 = (Long) mVar.a(dVar);
        if (l10 != null) {
            hashMap.put("ia_v2", l10);
        } else {
            this.f8753a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Long>>) dVar, (com.applovin.impl.sdk.c.d<Long>) Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.f8753a.al().c());
        String userEngagementSdkVersion = Utils.getUserEngagementSdkVersion();
        if (StringUtils.isValidString(userEngagementSdkVersion)) {
            hashMap.put("ue_sdk_version", userEngagementSdkVersion);
        }
        hashMap.put("api_did", this.f8753a.a(com.applovin.impl.sdk.c.b.X));
        hashMap.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        hashMap.put("epv", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
        return hashMap;
    }

    private Map<String, Object> t() {
        HashMap hashMap = new HashMap(2);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f8755c);
        String str = (String) this.f8753a.b(com.applovin.impl.sdk.c.d.f8244n, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            hashMap.put("IABTCF_TCString", str);
        }
        Object obj = defaultSharedPreferences.getAll().get(com.applovin.impl.sdk.c.d.f8245o.a());
        if ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) {
            hashMap.put("IABTCF_gdprApplies", obj);
        }
        return hashMap;
    }

    private boolean u() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.sdk.utils.g.f() && (connectivityManager = (ConnectivityManager) this.f8755c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                if (v.a()) {
                    this.f8753a.A().b("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private c v() {
        c cVar = new c();
        Intent registerReceiver = this.f8755c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f8771b = -1;
        } else {
            cVar.f8771b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f8770a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return cVar;
    }

    private long w() {
        List asList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.f8755c.getContentResolver(), "enabled_accessibility_services")).split(":"));
        long j10 = asList.contains("AccessibilityMenuService") ? 256L : 0L;
        if (asList.contains("SelectToSpeakService")) {
            j10 |= 512;
        }
        if (asList.contains("SoundAmplifierService")) {
            j10 |= 2;
        }
        if (asList.contains("SpeechToTextAccessibilityService")) {
            j10 |= 128;
        }
        if (asList.contains("SwitchAccessService")) {
            j10 |= 4;
        }
        if ((this.f8755c.getResources().getConfiguration().uiMode & 48) == 32) {
            j10 |= 1024;
        }
        if (a("accessibility_enabled")) {
            j10 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j10 |= 16;
        }
        if (com.applovin.impl.sdk.utils.g.d()) {
            if (a("accessibility_display_inversion_enabled")) {
                j10 |= 32;
            }
            return a("skip_first_use_hints") ? j10 | 64 : j10;
        }
        return j10;
    }

    private float x() {
        try {
            return Settings.System.getFloat(this.f8755c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            if (v.a()) {
                this.f8754b.b("DataCollector", "Error collecting font scale", e10);
                return -1.0f;
            }
            return -1.0f;
        }
    }

    private String y() {
        AudioManager audioManager = (AudioManager) this.f8755c.getSystemService("audio");
        if (audioManager != null) {
            StringBuilder sb2 = new StringBuilder();
            if (com.applovin.impl.sdk.utils.g.e()) {
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    String a10 = a(audioDeviceInfo.getType());
                    if (!TextUtils.isEmpty(a10)) {
                        sb2.append(a10);
                        sb2.append(",");
                    }
                }
            } else {
                if (audioManager.isWiredHeadsetOn()) {
                    sb2.append("headphones");
                    sb2.append(",");
                }
                if (audioManager.isBluetoothA2dpOn()) {
                    sb2.append("bluetootha2dpoutput");
                }
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            if (v.a() && TextUtils.isEmpty(sb3)) {
                this.f8754b.b("DataCollector", "No sound outputs detected");
            }
            return sb3;
        }
        return null;
    }

    private String z() {
        if (com.applovin.impl.sdk.utils.g.f()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                LocaleList locales = this.f8755c.getResources().getConfiguration().getLocales();
                for (int i10 = 0; i10 < locales.size(); i10++) {
                    sb2.append(locales.get(i10));
                    sb2.append(",");
                }
                if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
                return sb2.toString();
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        String encodeToString = Base64.encodeToString(new JSONObject(p()).toString().getBytes(Charset.defaultCharset()), 2);
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.eq)).booleanValue()) {
            return com.applovin.impl.sdk.utils.m.a(encodeToString, this.f8753a.z(), Utils.getServerAdjustedUnixTimestampMillis(this.f8753a));
        }
        return encodeToString;
    }

    public Map<String, Object> a(Map<String, String> map, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap(64);
        Map<String, Object> a10 = a(z10);
        Map<String, Object> h10 = h();
        Map<String, Object> j10 = j();
        Map<String, String> allData = this.f8753a.r().getAllData();
        if (z11) {
            hashMap.put("device_info", a10);
            hashMap.put("app_info", h10);
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (j10 != null) {
                hashMap.put("location_info", j10);
            }
            if (!allData.isEmpty()) {
                hashMap.put("targeting_data", allData);
            }
        } else {
            hashMap.putAll(a10);
            hashMap.putAll(h10);
            if (map != null) {
                hashMap.putAll(map);
            }
            if (j10 != null) {
                hashMap.putAll(j10);
            }
            if (!allData.isEmpty()) {
                hashMap.putAll(allData);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        Utils.putObjectForStringIfValid("mediation_provider", this.f8753a.t(), hashMap);
        Utils.putObjectForStringIfValid("plugin_version", (String) this.f8753a.a(com.applovin.impl.sdk.c.b.dz), hashMap);
        if (!((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8753a.z());
        }
        hashMap.putAll(i());
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dZ)).booleanValue()) {
            com.applovin.impl.sdk.d.g T = this.f8753a.T();
            hashMap.put("li", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f8319b)));
            hashMap.put("si", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f8321d)));
            hashMap.put("pf", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f8325h)));
            hashMap.put("mpf", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f8332o)));
            hashMap.put("gpf", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f8326i)));
            hashMap.put("asoac", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f8330m)));
        }
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    public Map<String, Object> a(boolean z10) {
        HashMap hashMap;
        synchronized (this.f8757e) {
            hashMap = new HashMap(this.f8756d);
        }
        return a(hashMap, z10);
    }

    public Map<String, Object> b() {
        return new HashMap(this.f8756d);
    }

    public Map<String, Object> c() {
        return new HashMap(this.f8758f);
    }

    public Map<String, Object> d() {
        return a(false);
    }

    public void e() {
        synchronized (this.f8757e) {
            a(this.f8756d);
        }
    }

    public String f() {
        return AppLovinSdkUtils.isFireOS(this.f8755c) ? "fireos" : MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    public boolean g() {
        return this.f8759g;
    }

    public Map<String, Object> h() {
        HashMap hashMap = new HashMap(this.f8758f);
        hashMap.put("first_install", Boolean.valueOf(this.f8753a.P()));
        hashMap.put("first_install_v2", Boolean.valueOf(!this.f8753a.Q()));
        hashMap.put("test_ads", Boolean.valueOf(this.f8759g));
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dr)).booleanValue()) {
            Utils.putObjectForStringIfValid("cuid", this.f8753a.m(), hashMap);
        }
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.du)).booleanValue()) {
            hashMap.put("compass_random_token", this.f8753a.n());
        }
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dw)).booleanValue()) {
            hashMap.put("applovin_random_token", this.f8753a.o());
        }
        String name = this.f8753a.q().getName();
        if (StringUtils.isValidString(name)) {
            hashMap.put("user_segment_name", name);
        }
        hashMap.putAll(t());
        return hashMap;
    }

    public Map<String, Object> i() {
        HashMap hashMap = new HashMap(5);
        hashMap.put("sc", this.f8753a.a(com.applovin.impl.sdk.c.b.f8194ac));
        hashMap.put("sc2", this.f8753a.a(com.applovin.impl.sdk.c.b.f8195ad));
        hashMap.put("sc3", this.f8753a.a(com.applovin.impl.sdk.c.b.f8196ae));
        hashMap.put("server_installed_at", this.f8753a.a(com.applovin.impl.sdk.c.b.f8197af));
        Utils.putObjectForStringIfValid("persisted_data", (String) this.f8753a.a(com.applovin.impl.sdk.c.d.f8256z), hashMap);
        return hashMap;
    }

    public Map<String, Object> j() {
        if (this.f8753a.p().isLocationCollectionEnabled() && ((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dW)).booleanValue()) {
            HashMap hashMap = new HashMap(4);
            u am = this.f8753a.am();
            boolean b10 = am.b();
            hashMap.put("loc_services_enabled", Boolean.valueOf(b10));
            if (b10) {
                hashMap.put("loc_auth", Boolean.valueOf(am.a()));
                t c10 = am.c();
                if (c10 != null) {
                    double a10 = c10.a();
                    m mVar = this.f8753a;
                    com.applovin.impl.sdk.c.b<Integer> bVar = com.applovin.impl.sdk.c.b.dY;
                    hashMap.put("loc_lat", Utils.formatDoubleValue(a10, ((Integer) mVar.a(bVar)).intValue()));
                    hashMap.put("loc_long", Utils.formatDoubleValue(c10.b(), ((Integer) this.f8753a.a(bVar)).intValue()));
                }
                return hashMap;
            }
            return hashMap;
        }
        return null;
    }

    public a k() {
        List<String> testDeviceAdvertisingIds;
        a a10 = com.applovin.impl.sdk.utils.c.a(this.f8755c);
        if (a10 == null) {
            return new a();
        }
        if (((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.dp)).booleanValue()) {
            if (a10.f8766a && !((Boolean) this.f8753a.a(com.applovin.impl.sdk.c.b.f0do)).booleanValue()) {
                a10.f8767b = "";
            }
            f8751h.set(a10);
        } else {
            a10 = new a();
        }
        boolean z10 = false;
        if (StringUtils.isValidString(a10.f8767b) && (testDeviceAdvertisingIds = this.f8753a.p().getTestDeviceAdvertisingIds()) != null && testDeviceAdvertisingIds.contains(a10.f8767b)) {
            z10 = true;
        }
        this.f8759g = z10;
        return a10;
    }

    public b l() {
        return f8752j.get();
    }

    public void m() {
        this.f8753a.S().a(new com.applovin.impl.sdk.e.f(this.f8753a, new f.a() { // from class: com.applovin.impl.sdk.o.3
            @Override // com.applovin.impl.sdk.e.f.a
            public void a(a aVar) {
                o.f8751h.set(aVar);
            }
        }), o.a.ADVERTISING_INFO_COLLECTION);
        this.f8753a.S().a(new com.applovin.impl.sdk.e.z(this.f8753a, true, new Runnable() { // from class: com.applovin.impl.sdk.o.4
            @Override // java.lang.Runnable
            public void run() {
                o.this.f8760i.set(o.this.A());
            }
        }), o.a.CACHING_OTHER);
    }
}
