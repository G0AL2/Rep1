package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.h;
import com.apm.insight.l.e;
import com.apm.insight.l.i;
import com.apm.insight.l.k;
import com.apm.insight.l.q;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.p;
import com.google.android.gms.ads.AdRequest;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static a f6316a = null;

    /* renamed from: i  reason: collision with root package name */
    private static volatile boolean f6317i = false;

    /* renamed from: j  reason: collision with root package name */
    private static volatile ThreadLocal<Boolean> f6318j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    private static ArrayList<b> f6319k = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f6320b;

    /* renamed from: c  reason: collision with root package name */
    private c f6321c;

    /* renamed from: d  reason: collision with root package name */
    private c f6322d;

    /* renamed from: e  reason: collision with root package name */
    private volatile int f6323e = 0;

    /* renamed from: f  reason: collision with root package name */
    private volatile int f6324f = 0;

    /* renamed from: g  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f6325g = new ConcurrentHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f6326h = new ConcurrentHashMap<>();

    private a() {
        d();
    }

    private static int a(Throwable th, Thread thread) {
        int i10 = 0;
        for (int i11 = 0; i11 < f6319k.size(); i11++) {
            try {
                try {
                    i10 |= f6319k.get(i11).a(th, thread);
                } catch (Throwable th2) {
                    com.apm.insight.b.a().a("NPTH_CATCH", th2);
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static a a() {
        if (f6316a == null) {
            f6316a = new a();
        }
        return f6316a;
    }

    private String a(File file, boolean z10, Throwable th, String str, Thread thread, boolean z11) {
        String absolutePath = file.getAbsolutePath();
        this.f6326h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String str2 = null;
        if (z11) {
            int h10 = NativeImpl.h(absolutePath);
            if (h10 > 0) {
                try {
                    NativeImpl.a(h10, com.apm.insight.l.a.c(h.g()));
                    NativeImpl.a(h10, "\n");
                    NativeImpl.a(h10, th.getMessage());
                    NativeImpl.a(h10, "\n");
                    NativeImpl.a(h10, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.a(h10, ": ");
                        NativeImpl.a(h10, th.getMessage());
                    }
                    NativeImpl.a(h10, "\n");
                    NativeImpl.a(h10, thread.getName());
                    NativeImpl.a(h10, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(h10, "stack:");
                    NativeImpl.a(h10, "\n");
                } catch (Throwable unused3) {
                }
                v.a(th, h10);
                NativeImpl.b(h10);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                if (r.a(32768)) {
                    throw new RuntimeException("test exception before write stack");
                }
                fileOutputStream.write((com.apm.insight.l.a.c(h.g()) + "\n").getBytes());
                fileOutputStream.write((th.getMessage() + "\n").getBytes());
                fileOutputStream.write((th + "\n").getBytes());
                fileOutputStream.write((thread.getName() + "\n").getBytes());
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused4) {
                }
                try {
                } catch (Throwable th2) {
                    try {
                        if (r.a(16384)) {
                            throw new RuntimeException("test exception system write stack");
                        }
                        th.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th2 + "\n").getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                        } catch (Throwable unused5) {
                        }
                    }
                }
                if (r.a((int) Constants.BUFFER_SIZE)) {
                    throw new RuntimeException("test exception npth write stack");
                }
                str2 = v.a(th, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new e.a() { // from class: com.apm.insight.g.a.1

                    /* renamed from: a  reason: collision with root package name */
                    boolean f6327a = false;

                    @Override // com.apm.insight.l.e.a
                    public boolean a(String str3) {
                        if (!this.f6327a && str3.contains("android.os.Looper.loop")) {
                            this.f6327a = true;
                        }
                        return !this.f6327a;
                    }
                } : new e.a());
                k.a(fileOutputStream);
                k.a(fileOutputStream);
            } catch (Throwable unused6) {
            }
        }
        return str2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:7|(1:9)|10|(2:11|12)|(3:159|160|(25:162|15|16|(1:18)(1:155)|19|(20:(1:22)|25|26|27|(1:29)(1:151)|(13:33|34|(3:37|38|39)|87|(1:89)|(1:91)(1:145)|92|94|(3:131|132|(5:137|138|139|125|(4:(1:105)(2:102|103)|104|53|54)(4:106|1c0|111|112)))|96|(3:117|118|(5:122|123|124|125|(0)(0)))|98|(0)(0))|150|149|34|(3:37|38|39)|87|(0)|(0)(0)|92|94|(0)|96|(0)|98|(0)(0))|154|26|27|(0)(0)|(13:33|34|(0)|87|(0)|(0)(0)|92|94|(0)|96|(0)|98|(0)(0))|150|149|34|(0)|87|(0)|(0)(0)|92|94|(0)|96|(0)|98|(0)(0)))|14|15|16|(0)(0)|19|(0)|154|26|27|(0)(0)|(0)|150|149|34|(0)|87|(0)|(0)(0)|92|94|(0)|96|(0)|98|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:7|(1:9)|10|11|12|(3:159|160|(25:162|15|16|(1:18)(1:155)|19|(20:(1:22)|25|26|27|(1:29)(1:151)|(13:33|34|(3:37|38|39)|87|(1:89)|(1:91)(1:145)|92|94|(3:131|132|(5:137|138|139|125|(4:(1:105)(2:102|103)|104|53|54)(4:106|1c0|111|112)))|96|(3:117|118|(5:122|123|124|125|(0)(0)))|98|(0)(0))|150|149|34|(3:37|38|39)|87|(0)|(0)(0)|92|94|(0)|96|(0)|98|(0)(0))|154|26|27|(0)(0)|(13:33|34|(0)|87|(0)|(0)(0)|92|94|(0)|96|(0)|98|(0)(0))|150|149|34|(0)|87|(0)|(0)(0)|92|94|(0)|96|(0)|98|(0)(0)))|14|15|16|(0)(0)|19|(0)|154|26|27|(0)(0)|(0)|150|149|34|(0)|87|(0)|(0)(0)|92|94|(0)|96|(0)|98|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01db, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dc, code lost:
        r5 = r10;
        r4 = r12;
        r9 = r24;
        r7 = r23;
        r2 = 1;
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e4, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e5, code lost:
        r5 = r10;
        r4 = r12;
        r9 = r24;
        r7 = r23;
        r2 = 1;
        r20 = false;
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (com.apm.insight.h.i().isCrashIgnored(r7) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        r1 = com.apm.insight.CrashType.LAUNCH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0198, code lost:
        r7 = r1;
        r9 = r3;
        r2 = r2;
        r4 = r4;
        r5 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f4 A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #13 {all -> 0x021f, blocks: (B:108:0x01ee, B:110:0x01f4), top: B:171:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x01e4, TRY_ENTER, TryCatch #0 {all -> 0x01e4, blocks: (B:21:0x004e, B:23:0x0053, B:26:0x0088, B:22:0x0051), top: B:146:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[Catch: all -> 0x01e4, TryCatch #0 {all -> 0x01e4, blocks: (B:21:0x004e, B:23:0x0053, B:26:0x0088, B:22:0x0051), top: B:146:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0 A[Catch: all -> 0x01d4, TryCatch #6 {all -> 0x01d4, blocks: (B:47:0x00e7, B:48:0x00ea, B:50:0x00f0, B:52:0x00f7, B:54:0x00fc, B:53:0x00fa), top: B:157:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7 A[Catch: all -> 0x01d4, TryCatch #6 {all -> 0x01d4, blocks: (B:47:0x00e7, B:48:0x00ea, B:50:0x00f0, B:52:0x00f7, B:54:0x00fc, B:53:0x00fa), top: B:157:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa A[Catch: all -> 0x01d4, TryCatch #6 {all -> 0x01d4, blocks: (B:47:0x00e7, B:48:0x00ea, B:50:0x00f0, B:52:0x00f7, B:54:0x00fc, B:53:0x00fa), top: B:157:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.apm.insight.a.a] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Throwable a(java.lang.Thread r23, java.lang.Throwable r24) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.g.a.a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    private void a(Thread thread, Throwable th, boolean z10, long j10) {
        List<IOOMCallback> a10 = o.a().a();
        CrashType crashType = z10 ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : a10) {
            try {
                iOOMCallback.onCrash(crashType, th, thread, j10);
            } catch (Throwable th2) {
                q.b(th2);
            }
        }
    }

    public static void a(final Throwable th) {
        if (th == null) {
            return;
        }
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.apm.insight.entity.a a10 = com.apm.insight.entity.a.a(System.currentTimeMillis(), h.g(), (Thread) null, th);
                        a10.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a11 = f.a().a(CrashType.CUSTOM_JAVA, a10);
                        if (a11 != null) {
                            com.apm.insight.k.d.a().b(a11.h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j10) {
        return e.a(j10);
    }

    private static Throwable b(Throwable th, Thread thread) {
        for (int i10 = 0; i10 < f6319k.size(); i10++) {
            try {
                try {
                    f6319k.get(i10).b(th, thread);
                } catch (Throwable th2) {
                    return th2;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            try {
                Looper.loop();
                return null;
            } catch (Throwable th3) {
                return th3;
            }
        }
        return null;
    }

    public static boolean b() {
        return f6317i;
    }

    private boolean b(Thread thread, Throwable th) {
        ICrashFilter b10 = h.b().b();
        if (b10 != null) {
            try {
                return b10.onJavaCrashFilter(th, thread);
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    public static void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a("data", (Object) str);
                        aVar.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a10 = f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (a10 != null) {
                            com.apm.insight.k.d.a().b(a10.h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6320b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || r.a((int) AdRequest.MAX_CONTENT_URL_LENGTH)) {
            return;
        }
        this.f6320b.uncaughtException(thread, th);
    }

    public static boolean c() {
        Boolean bool = f6318j.get();
        return bool != null && bool.booleanValue();
    }

    private void d() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f6320b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private void e() {
        synchronized (this) {
            this.f6324f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f6324f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50L);
        }
    }

    private void f() {
        File a10 = com.apm.insight.l.o.a(h.g());
        File a11 = com.apm.insight.l.o.a();
        if (i.b(a10) && i.b(a11)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!com.apm.insight.k.i.a() && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    private boolean g() {
        return com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1;
    }

    public void a(c cVar) {
        this.f6321c = cVar;
    }

    public void a(String str) {
        this.f6325g.put(str, new Object());
    }

    public void a(Thread thread, Throwable th, boolean z10, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> c10;
        CrashType crashType;
        if (z10) {
            c10 = o.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            c10 = o.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : c10) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                iCrashCallback.onCrash(crashType, v.a(th), thread);
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th2) {
                q.b(th2);
                aVar.b("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    public void b(c cVar) {
        this.f6322d = cVar;
    }

    public boolean b(String str) {
        return this.f6325g.containsKey(str);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = a(thread, th);
        } while (th != null);
    }
}
