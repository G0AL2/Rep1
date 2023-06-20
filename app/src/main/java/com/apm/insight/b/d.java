package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f6162a = null;

    /* renamed from: b  reason: collision with root package name */
    private static long f6163b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6164c = false;

    /* renamed from: d  reason: collision with root package name */
    private static FileObserver f6165d;

    /* renamed from: e  reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f6166e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context, int i10) {
        if (r.a(256)) {
            f6164c = false;
            return "TEST_ANR_INFO";
        } else if (SystemClock.uptimeMillis() - f6163b < 5000) {
            return null;
        } else {
            try {
                ActivityManager.ProcessErrorStateInfo a10 = com.apm.insight.l.a.a(context, i10);
                if (a10 != null && Process.myPid() == a10.pid) {
                    ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f6166e;
                    if (processErrorStateInfo == null || !a.a(processErrorStateInfo, a10)) {
                        f6166e = a10;
                        f6162a = null;
                        f6163b = SystemClock.uptimeMillis();
                        f6164c = false;
                        return a.a(a10);
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            String str = f6162a;
            if (str != null) {
                f6164c = true;
                f6162a = null;
                f6163b = SystemClock.uptimeMillis();
                return str;
            }
            return null;
        }
    }

    public static JSONObject a(boolean z10) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", v.a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
            return null;
        }
    }

    public static void a(final String str, final com.apm.insight.e eVar) {
        FileObserver fileObserver = f6165d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str, 136) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public void onEvent(int i10, String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.f6162a = eVar.a(str, str2);
                } catch (Throwable th) {
                    com.apm.insight.b.a().a("NPTH_CATCH", th);
                }
            }
        };
        f6165d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static boolean a() {
        return f6164c;
    }

    public static void b() {
        f6166e = null;
    }
}
