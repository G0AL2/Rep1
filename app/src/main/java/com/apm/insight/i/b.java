package com.apm.insight.i;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.b.g;
import com.apm.insight.g.c;
import com.apm.insight.h;
import com.apm.insight.l.i;
import com.apm.insight.l.o;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.k;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private Context f6366a;

    public b(Context context) {
        this.f6366a = context;
    }

    private synchronized void b(final long j10, final Thread thread, final Throwable th, final String str, File file, final String str2, final boolean z10) {
        final File file2 = new File(o.a(this.f6366a), str);
        com.apm.insight.g.a.a().a(file2.getName());
        file2.mkdirs();
        i.f(file2);
        final boolean c10 = v.c(th);
        com.apm.insight.entity.a a10 = f.a().a(CrashType.LAUNCH, null, new c.a() { // from class: com.apm.insight.i.b.1

            /* renamed from: a  reason: collision with root package name */
            long f6367a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
                String valueOf;
                String str3;
                Object b10;
                String str4;
                this.f6367a = SystemClock.uptimeMillis();
                if (i10 == 0) {
                    aVar.a("stack", (Object) v.a(th));
                    aVar.a("event_type", "start_crash");
                    aVar.a("isOOM", Boolean.valueOf(c10));
                    aVar.a("crash_time", Long.valueOf(j10));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str5 = str2;
                    if (str5 != null) {
                        aVar.a("crash_md5", (Object) str5);
                        aVar.a("crash_md5", str2);
                        boolean z11 = z10;
                        if (z11) {
                            valueOf = String.valueOf(z11);
                            str3 = "has_ignore";
                            aVar.a(str3, valueOf);
                        }
                    }
                } else if (i10 == 1) {
                    aVar.a("timestamp", Long.valueOf(j10));
                    aVar.a("main_process", Boolean.valueOf(com.apm.insight.l.a.b(b.this.f6366a)));
                    aVar.a("crash_type", CrashType.JAVA);
                    Thread thread2 = thread;
                    aVar.a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                    aVar.a("tid", Integer.valueOf(Process.myTid()));
                    boolean hasCrashWhenJavaCrash = Npth.hasCrashWhenJavaCrash();
                    String str6 = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
                    aVar.a("crash_after_crash", hasCrashWhenJavaCrash ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false");
                    if (!NativeImpl.d()) {
                        str6 = "false";
                    }
                    aVar.a("crash_after_native", str6);
                    com.apm.insight.g.a.a().a(thread, th, true, aVar);
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        JSONObject b11 = v.b(Thread.currentThread().getName());
                        if (b11 != null) {
                            aVar.a("all_thread_stacks", b11);
                        }
                        b10 = k.b(h.f());
                        str4 = "logcat";
                    } else if (i10 != 4) {
                        if (i10 == 5) {
                            b10 = str;
                            str4 = "crash_uuid";
                        }
                    } else if (!c10) {
                        com.apm.insight.l.a.a(b.this.f6366a, aVar.h());
                    }
                    aVar.a(str4, b10);
                } else {
                    if (c10) {
                        com.apm.insight.l.a.a(b.this.f6366a, aVar.h());
                    }
                    aVar.a("launch_did", (Object) a.a(b.this.f6366a));
                    JSONArray c11 = g.b().c();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    JSONObject a11 = g.b().a(uptimeMillis).a();
                    JSONArray a12 = com.apm.insight.b.k.a(100, uptimeMillis);
                    aVar.a("history_message", (Object) c11);
                    aVar.a("current_message", a11);
                    aVar.a("pending_messages", (Object) a12);
                    aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                    valueOf = String.valueOf(com.apm.insight.c.b.a());
                    str3 = "npth_force_apm_crash";
                    aVar.a(str3, valueOf);
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar, boolean z11) {
                if (r.a(r.b(i10))) {
                    return aVar;
                }
                try {
                    File file3 = file2;
                    i.a(new File(file3, file2.getName() + "." + i10), aVar.h(), false);
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public void a(Throwable th2) {
            }
        }, true);
        long currentTimeMillis = System.currentTimeMillis() - j10;
        a10.a("crash_type", "normal");
        a10.b("crash_cost", String.valueOf(currentTimeMillis));
        a10.a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        if (r.a(4)) {
            return;
        }
        if (!Npth.isStopUpload()) {
            if (!r.a(2048)) {
            }
        }
    }

    @Override // com.apm.insight.g.c
    public void a(long j10, Thread thread, Throwable th, String str, File file, String str2, boolean z10) {
        b(j10, thread, th, str, file, str2, z10);
    }

    @Override // com.apm.insight.g.c
    public boolean a(Throwable th) {
        return true;
    }
}
