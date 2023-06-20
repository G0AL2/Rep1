package com.apm.insight.nativecrash;

import android.os.SystemClock;
import androidx.annotation.Keep;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.b.g;
import com.apm.insight.b.k;
import com.apm.insight.h;
import com.apm.insight.l.i;
import com.apm.insight.l.q;
import com.apm.insight.l.v;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.o;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeCrashCollector {
    public static int a() {
        return 6;
    }

    private static void a(String str, Thread thread) {
        for (ICrashCallback iCrashCallback : o.a().d()) {
            try {
                iCrashCallback.onCrash(CrashType.NATIVE, "", thread);
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x00a9, TryCatch #0 {all -> 0x00a9, blocks: (B:22:0x006a, B:23:0x0076, B:25:0x007c, B:27:0x0092, B:29:0x0098, B:31:0x009e), top: B:36:0x006a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "main"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L22
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            java.lang.Thread r6 = r6.getThread()
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()
            java.lang.String r6 = com.apm.insight.l.v.a(r6)
            return r6
        L22:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.ThreadGroup r0 = r0.getThreadGroup()
            int r2 = r0.activeCount()
            int r3 = r2 / 2
            int r2 = r2 + r3
            java.lang.Thread[] r2 = new java.lang.Thread[r2]
            int r0 = r0.enumerate(r2)
            r3 = 0
        L3c:
            if (r3 >= r0) goto L6a
            r4 = r2[r3]
            java.lang.String r4 = r4.getName()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L67
            boolean r5 = r4.equals(r6)
            if (r5 != 0) goto L5c
            boolean r5 = r4.startsWith(r6)
            if (r5 != 0) goto L5c
            boolean r4 = r4.endsWith(r6)
            if (r4 == 0) goto L67
        L5c:
            r6 = r2[r3]
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()
            java.lang.String r6 = com.apm.insight.l.v.a(r6)
            return r6
        L67:
            int r3 = r3 + 1
            goto L3c
        L6a:
            java.util.Map r0 = java.lang.Thread.getAllStackTraces()     // Catch: java.lang.Throwable -> La9
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La9
        L76:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> La9
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> La9
            java.lang.Thread r3 = (java.lang.Thread) r3     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> La9
            boolean r4 = r3.equals(r6)     // Catch: java.lang.Throwable -> La9
            if (r4 != 0) goto L9e
            boolean r4 = r3.startsWith(r6)     // Catch: java.lang.Throwable -> La9
            if (r4 != 0) goto L9e
            boolean r3 = r3.endsWith(r6)     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L76
        L9e:
            java.lang.Object r6 = r2.getValue()     // Catch: java.lang.Throwable -> La9
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = com.apm.insight.l.v.a(r6)     // Catch: java.lang.Throwable -> La9
            return r6
        La9:
            r6 = move-exception
            com.apm.insight.c r0 = com.apm.insight.b.a()
            java.lang.String r2 = "NPTH_CATCH"
            r0.a(r2, r6)
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.NativeCrashCollector.b(java.lang.String):java.lang.String");
    }

    @Keep
    public static void onNativeCrash(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        q.a((Object) "[onNativeCrash] enter");
        try {
            com.apm.insight.k.b.a().b();
            final File e10 = com.apm.insight.l.o.e(new File(com.apm.insight.l.o.a(), h.f()));
            com.apm.insight.entity.a a10 = f.a().a(CrashType.NATIVE, null, new c.a() { // from class: com.apm.insight.nativecrash.NativeCrashCollector.1
                @Override // com.apm.insight.runtime.a.c.a
                public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
                    String str2;
                    String str3 = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            JSONArray c10 = g.b().c();
                            long uptimeMillis = SystemClock.uptimeMillis();
                            JSONObject a11 = g.b().a(uptimeMillis).a();
                            JSONArray a12 = k.a(100, uptimeMillis);
                            aVar.a("history_message", (Object) c10);
                            aVar.a("current_message", a11);
                            aVar.a("pending_messages", (Object) a12);
                            aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                            aVar.a("npth_force_apm_crash", String.valueOf(com.apm.insight.c.b.a()));
                        } else if (i10 != 3) {
                            if (i10 == 4) {
                                com.apm.insight.l.a.a(h.g(), aVar.h());
                            }
                        } else if (com.apm.insight.runtime.a.e()) {
                            aVar.a("all_thread_stacks", v.b(str));
                            str2 = "has_all_thread_stack";
                        }
                        return aVar;
                    }
                    String str4 = str;
                    if (str4 != null && str4.length() != 0) {
                        aVar.a("java_data", (Object) NativeCrashCollector.b(str));
                    }
                    if (!Npth.hasCrashWhenNativeCrash()) {
                        str3 = "false";
                    }
                    str2 = "crash_after_crash";
                    aVar.a(str2, str3);
                    return aVar;
                }

                @Override // com.apm.insight.runtime.a.c.a
                public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar, boolean z10) {
                    try {
                        JSONObject h10 = aVar.h();
                        if (h10.length() > 0) {
                            i.a(new File(e10.getAbsolutePath() + '.' + i10), h10, false);
                        }
                    } catch (IOException e11) {
                        com.apm.insight.b.a().a("NPTH_CATCH", e11);
                    }
                    if (i10 == 0) {
                        com.apm.insight.a.a.a().b();
                        com.apm.insight.a.a.a().a(CrashType.NATIVE, currentTimeMillis, h.f());
                    }
                    return aVar;
                }

                @Override // com.apm.insight.runtime.a.c.a
                public void a(Throwable th) {
                }
            }, true);
            JSONObject h10 = a10.h();
            if (h10 != null && h10.length() != 0) {
                long currentTimeMillis2 = System.currentTimeMillis();
                long j10 = currentTimeMillis2 - currentTimeMillis;
                try {
                    h10.put("java_end", currentTimeMillis2);
                    a10.b("crash_cost", String.valueOf(j10));
                    a10.a("crash_cost", String.valueOf(j10 / 1000));
                } catch (Throwable unused) {
                }
                File file = new File(e10.getAbsolutePath() + ".tmp");
                i.a(file, h10, false);
                file.renameTo(e10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
