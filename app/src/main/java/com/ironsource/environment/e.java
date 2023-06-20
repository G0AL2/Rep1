package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static String f26143c = "";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f26144a;

    /* renamed from: b  reason: collision with root package name */
    private String f26145b;

    /* renamed from: d  reason: collision with root package name */
    private String f26146d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26147e;

    /* renamed from: f  reason: collision with root package name */
    Context f26148f;

    /* renamed from: g  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f26149g;

    /* renamed from: h  reason: collision with root package name */
    private String f26150h;

    /* renamed from: i  reason: collision with root package name */
    String f26151i;

    /* loaded from: classes3.dex */
    final class a implements com.ironsource.environment.b {
        a(e eVar) {
        }

        @Override // com.ironsource.environment.b
        public final void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb2 = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb2.append("*** Thread Name ");
                    sb2.append(thread.getName());
                    sb2.append(" Thread ID ");
                    sb2.append(thread.getId());
                    sb2.append(" (");
                    sb2.append(thread.getState().toString());
                    sb2.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append(" ");
                        sb2.append(thread.getState().toString());
                        sb2.append("\n");
                    }
                }
            }
            e.f26143c = sb2.toString();
        }

        @Override // com.ironsource.environment.b
        public final void b() {
        }
    }

    /* loaded from: classes3.dex */
    final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Context f26157a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f26158b;

        b(Context context, String str) {
            this.f26157a = context;
            this.f26158b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String[] C = h.C(this.f26157a);
                if (C == null || C.length != 2) {
                    return;
                }
                if (!TextUtils.isEmpty(C[0])) {
                    e.this.f26145b = C[0];
                }
                e.this.f26147e = Boolean.parseBoolean(C[1]);
                SharedPreferences.Editor edit = this.f26157a.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", e.this.f26145b);
                edit.putString("sId", this.f26158b);
                edit.apply();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(e.a().f26150h).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                Log.i("JSON", e.this.f26144a.toString());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(e.this.f26144a.toString());
                dataOutputStream.flush();
                dataOutputStream.close();
                Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                Log.i("MSG", httpURLConnection.getResponseMessage());
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        static volatile e f26164a = new e((byte) 0);
    }

    private e() {
        this.f26147e = false;
        this.f26144a = new JSONObject();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f26149g = defaultUncaughtExceptionHandler;
        this.f26151i = " ";
        this.f26150h = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new com.ironsource.environment.d(defaultUncaughtExceptionHandler));
    }

    /* synthetic */ e(byte b10) {
        this();
    }

    public static e a() {
        return d.f26164a;
    }

    private static String b(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return "wifi";
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "none";
        }
    }

    public final void a(Context context, HashSet<String> hashSet, String str, String str2, boolean z10, String str3, int i10, boolean z11) {
        if (context != null) {
            Log.d("automation_log", "init ISCrashReporter");
            this.f26148f = context;
            if (!TextUtils.isEmpty(str2)) {
                this.f26151i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f26150h = str;
            }
            this.f26146d = str3;
            if (z10) {
                com.ironsource.environment.a aVar = new com.ironsource.environment.a(i10);
                aVar.f26118e = z11;
                aVar.f26114a = new a(this);
                aVar.start();
            }
            String b10 = b(this.f26148f);
            if (!b10.equals("none")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
                String string = sharedPreferences.getString("String1", this.f26145b);
                String string2 = sharedPreferences.getString("sId", this.f26146d);
                for (com.ironsource.environment.c cVar : f.a()) {
                    String b11 = cVar.b();
                    String a10 = cVar.a();
                    String c10 = cVar.c();
                    String packageName = context.getPackageName();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crashDate", b11);
                        jSONObject.put("stacktraceCrash", a10);
                        jSONObject.put("crashType", c10);
                        jSONObject.put("CrashReporterVersion", "1.0.5");
                        jSONObject.put("SDKVersion", VersionInfo.VERSION);
                        jSONObject.put("deviceLanguage", h.a(context));
                        jSONObject.put("appVersion", com.ironsource.environment.c.c(context, packageName));
                        jSONObject.put("deviceOSVersion", h.e());
                        jSONObject.put("network", b10);
                        jSONObject.put("deviceApiLevel", h.f());
                        jSONObject.put("deviceModel", h.g());
                        jSONObject.put("deviceOS", h.i());
                        jSONObject.put("advertisingId", string);
                        jSONObject.put("isLimitAdTrackingEnabled", this.f26147e);
                        jSONObject.put("deviceOEM", h.h());
                        jSONObject.put("systemProperties", System.getProperties());
                        jSONObject.put("bundleId", packageName);
                        jSONObject.put("sId", string2);
                        JSONObject jSONObject2 = new JSONObject();
                        if (hashSet != null && !hashSet.isEmpty()) {
                            Iterator<String> it = hashSet.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                try {
                                    if (jSONObject.has(next)) {
                                        jSONObject2.put(next, jSONObject.opt(next));
                                    }
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                            jSONObject = jSONObject2;
                        }
                        this.f26144a = jSONObject;
                    } catch (Exception unused) {
                    }
                    if (this.f26144a.length() == 0) {
                        Log.d("ISCrashReport", " Is Empty");
                    } else {
                        new Thread(new c()).start();
                        f.c();
                    }
                }
            }
            new Thread(new b(context, str3)).start();
        }
    }
}
