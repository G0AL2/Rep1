package com.apm.insight.b;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.l.l;
import com.apm.insight.l.o;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.r;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f6128a = true;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f6129f;

    /* renamed from: c  reason: collision with root package name */
    private c f6131c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f6132d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f6133e;

    /* renamed from: j  reason: collision with root package name */
    private JSONObject f6137j;

    /* renamed from: k  reason: collision with root package name */
    private JSONObject f6138k;

    /* renamed from: p  reason: collision with root package name */
    private JSONArray f6143p;

    /* renamed from: q  reason: collision with root package name */
    private JSONObject f6144q;

    /* renamed from: t  reason: collision with root package name */
    private JSONArray f6147t;

    /* renamed from: u  reason: collision with root package name */
    private JSONArray f6148u;

    /* renamed from: v  reason: collision with root package name */
    private JSONObject f6149v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6150w;

    /* renamed from: y  reason: collision with root package name */
    private volatile boolean f6152y;

    /* renamed from: g  reason: collision with root package name */
    private long f6134g = -1;

    /* renamed from: h  reason: collision with root package name */
    private File f6135h = null;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6136i = true;

    /* renamed from: l  reason: collision with root package name */
    private String f6139l = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;

    /* renamed from: m  reason: collision with root package name */
    private String f6140m = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;

    /* renamed from: n  reason: collision with root package name */
    private String f6141n = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;

    /* renamed from: o  reason: collision with root package name */
    private String f6142o = "npth_inner_default";

    /* renamed from: r  reason: collision with root package name */
    private int f6145r = 0;

    /* renamed from: s  reason: collision with root package name */
    private long f6146s = -1;

    /* renamed from: x  reason: collision with root package name */
    private final Object f6151x = new Object();

    /* renamed from: z  reason: collision with root package name */
    private long f6153z = -1;
    private long A = 0;
    private final Runnable B = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.a(200, 25);
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
    };
    private int C = 0;
    private List<Pattern> D = null;

    /* renamed from: b  reason: collision with root package name */
    Pattern f6130b = null;
    private File E = null;

    public b(Context context) {
        this.f6132d = context;
    }

    private static String a(float f10) {
        return f10 <= 0.0f ? "0%" : f10 <= 0.1f ? "0% - 10%" : f10 <= 0.3f ? "10% - 30%" : f10 <= 0.6f ? "30% - 60%" : f10 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String a(float f10, float f11) {
        return f11 > 0.0f ? a(f10 / f11) : f10 > 0.0f ? "100%" : "0%";
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a10 = l.a(256, 128, jSONArray);
        if (a10.length() != jSONArray.length()) {
            this.f6145r++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", a10);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0225, code lost:
        if (r3 != 5) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e9 A[LOOP:2: B:100:0x020b->B:154:0x02e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x040e A[EDGE_INSN: B:226:0x040e->B:202:0x040e ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b5 A[EDGE_INSN: B:230:0x03b5->B:190:0x03b5 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r30, org.json.JSONObject r31) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    private static void a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) {
        String str2;
        String a10;
        String str3 = "npth_anr_" + str;
        if (hashMap.isEmpty()) {
            str2 = str3 + "_total";
            a10 = "not found";
        } else {
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                if (key.endsWith("user")) {
                    f10 += entry.getValue().floatValue();
                } else if (key.endsWith("kernel")) {
                    f11 += entry.getValue().floatValue();
                } else if (key.endsWith("iowait")) {
                    f12 += entry.getValue().floatValue();
                } else if (key.endsWith("irq")) {
                    f13 += entry.getValue().floatValue();
                } else if (key.endsWith("softirq")) {
                    f14 += entry.getValue().floatValue();
                }
            }
            float f15 = f10 + f11 + f12 + f13 + f14;
            jSONObject.put(str3 + "_total", b(f15));
            jSONObject.put(str3 + "_kernel_user_ratio", a(f11, f15));
            str2 = str3 + "_iowait_user_ratio";
            a10 = a(f12, f15);
        }
        jSONObject.put(str2, a10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0194, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.json.JSONArray r17) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(org.json.JSONArray):void");
    }

    private boolean a(long j10) {
        if (this.f6152y) {
            this.f6152y = false;
            b(j10);
        }
        return false;
    }

    private boolean a(String str) {
        if (this.D == null) {
            JSONArray c10 = com.apm.insight.runtime.a.c();
            if (c10 != null) {
                this.D = new LinkedList();
                this.f6142o = c10.optString(0);
                for (int i10 = 1; i10 < c10.length(); i10++) {
                    try {
                        this.D.add(Pattern.compile(c10.optString(i10)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.D == null) {
                LinkedList linkedList = new LinkedList();
                this.D = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.D.add(Pattern.compile("^default_npth_thread$"));
                this.D.add(Pattern.compile("^RenderThread$"));
                this.D.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        for (Pattern pattern : this.D) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private static String b(float f10) {
        return a(f10 / 100.0f);
    }

    private void b(long j10) {
        if (this.A != this.f6153z) {
            try {
                this.f6146s = System.currentTimeMillis();
                this.f6148u = g.b().c();
                this.f6147t = k.a(100, j10);
                this.f6138k = g.b().a(j10).a();
                JSONObject jSONObject = new JSONObject();
                this.f6149v = jSONObject;
                com.apm.insight.l.a.a(this.f6132d, jSONObject);
                this.f6150w = g();
                this.f6136i = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f6134g = this.f6146s;
                    String b10 = o.b();
                    File file = new File(o.f(this.f6132d), b10);
                    File file2 = new File(file, "trace_" + com.apm.insight.l.a.c(this.f6132d).replace(':', '_') + Constants.DEFAULT_DL_TEXT_EXTENSION);
                    file2.getParentFile().mkdirs();
                    com.apm.insight.l.i.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                    r.a("anr_trace", b10);
                    NativeImpl.i(file2.getAbsolutePath());
                    try {
                        JSONArray b11 = com.apm.insight.l.i.b(file2.getAbsolutePath());
                        this.f6143p = b11;
                        a(b11);
                    } catch (IOException unused2) {
                    } catch (Throwable th) {
                        com.apm.insight.b.a().a("NPTH_CATCH", th);
                    }
                }
                if (this.f6137j == null) {
                    this.f6137j = d.a(true);
                }
            } catch (Throwable th2) {
                com.apm.insight.b.a().a("NPTH_CATCH", th2);
            }
            com.apm.insight.l.f.a();
        } else {
            try {
                this.f6134g = this.f6146s;
                if (Build.VERSION.SDK_INT >= 21) {
                    String b12 = o.b();
                    File file3 = new File(o.f(this.f6132d), b12);
                    File file4 = new File(file3, "trace" + com.apm.insight.l.a.c(this.f6132d).replace(':', '_') + Constants.DEFAULT_DL_TEXT_EXTENSION);
                    file4.getParentFile().mkdirs();
                    com.apm.insight.l.i.a(file4, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                    r.a("anr_trace", b12);
                    NativeImpl.i(file4.getAbsolutePath());
                    try {
                        JSONArray b13 = com.apm.insight.l.i.b(file4.getAbsolutePath());
                        this.f6143p = b13;
                        a(b13);
                    } catch (IOException unused3) {
                    } catch (Throwable th3) {
                        com.apm.insight.b.a().a("NPTH_CATCH", th3);
                    }
                }
                if (this.f6137j == null) {
                    this.f6137j = d.a(true);
                }
            } catch (Throwable th4) {
                com.apm.insight.b.a().a("NPTH_CATCH", th4);
            }
        }
        long j11 = this.f6153z;
        this.A = j11;
        this.f6153z = -1L;
        if (j11 == -1) {
            this.A = (-1) - 1;
        }
    }

    private static void b(String str) {
        for (ICrashCallback iCrashCallback : com.apm.insight.runtime.o.a().e()) {
            try {
                iCrashCallback.onCrash(CrashType.ANR, str, null);
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
    }

    private int[] b(JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String optString = jSONArray.optString(i10);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                if (this.f6130b == null) {
                    this.f6130b = Pattern.compile("[^0-9]+");
                }
                String[] split = this.f6130b.split(optString.substring(indexOf));
                if (split == null || split.length < 2) {
                    return null;
                }
                int intValue = Integer.decode(split[1]).intValue();
                int intValue2 = Integer.decode(split[2]).intValue();
                return new int[]{intValue, intValue2, intValue + intValue2};
            }
        }
        return null;
    }

    private String c(long j10) {
        long j11 = j10 - com.apm.insight.h.j();
        return j11 < 30000 ? "0 - 30s" : j11 < 60000 ? "30s - 1min" : j11 < 120000 ? "1min - 2min" : j11 < 300000 ? "2min - 5min" : j11 < TTAdConstant.AD_MAX_EVENT_TIME ? "5min - 10min" : j11 < 1800000 ? "10min - 30min" : j11 < 3600000 ? "30min - 1h" : "1h - ";
    }

    private JSONObject c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a10 = l.a(256, 128, jSONArray);
        if (a10.length() != jSONArray.length()) {
            this.f6145r++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < a10.length(); i10++) {
                sb2.append(a10.getString(i10));
                sb2.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb2.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean g() {
        boolean z10 = !com.apm.insight.l.a.a(this.f6132d);
        if (!z10 || com.apm.insight.runtime.a.b.d().e() > Constants.MIN_PROGRESS_TIME) {
            return z10;
        }
        return false;
    }

    private File h() {
        if (this.E == null) {
            File filesDir = this.f6132d.getFilesDir();
            this.E = new File(filesDir, "has_anr_signal_" + com.apm.insight.l.a.c(this.f6132d).replaceAll(":", "_"));
        }
        return this.E;
    }

    private boolean i() {
        return com.apm.insight.runtime.a.i();
    }

    public void a() {
        if (this.f6133e) {
            return;
        }
        this.f6131c = new c(this);
        this.f6134g = com.apm.insight.h.j();
        this.f6133e = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x03e7 A[Catch: all -> 0x048b, TRY_ENTER, TryCatch #4 {all -> 0x048b, blocks: (B:77:0x017e, B:81:0x01fb, B:83:0x0200, B:86:0x0209, B:88:0x020d, B:90:0x0213, B:92:0x021b, B:132:0x03e7, B:133:0x0410, B:135:0x0414, B:136:0x041a, B:143:0x046f, B:91:0x0219), top: B:161:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0410 A[Catch: all -> 0x048b, TryCatch #4 {all -> 0x048b, blocks: (B:77:0x017e, B:81:0x01fb, B:83:0x0200, B:86:0x0209, B:88:0x020d, B:90:0x0213, B:92:0x021b, B:132:0x03e7, B:133:0x0410, B:135:0x0414, B:136:0x041a, B:143:0x046f, B:91:0x0219), top: B:161:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean a(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(int, int):boolean");
    }

    public void b() {
        if (this.f6133e) {
            this.f6133e = false;
            c cVar = this.f6131c;
            if (cVar != null) {
                cVar.b();
            }
            this.f6131c = null;
        }
    }

    public void c() {
        c cVar = this.f6131c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void d() {
        if (f6129f) {
            return;
        }
        synchronized (this.f6151x) {
            if (f6129f) {
                return;
            }
            this.B.run();
        }
    }

    public void e() {
        if (NativeImpl.g()) {
            try {
                com.apm.insight.l.i.a(h(), String.valueOf(this.C + 1), false);
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
        this.f6153z = SystemClock.uptimeMillis();
        this.f6152y = true;
    }

    public void f() {
        File h10 = h();
        try {
            int intValue = Integer.decode(com.apm.insight.l.i.c(h10.getAbsolutePath())).intValue();
            this.C = intValue;
            if (intValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.i.a(h10);
        }
    }
}
