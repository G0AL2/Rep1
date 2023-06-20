package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.o;
import com.apm.insight.l.p;
import com.apm.insight.l.w;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import com.apm.insight.runtime.s;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f6385d;

    /* renamed from: c  reason: collision with root package name */
    private Context f6388c;

    /* renamed from: f  reason: collision with root package name */
    private C0104b f6390f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<String, C0104b> f6391g;

    /* renamed from: a  reason: collision with root package name */
    List<File> f6386a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    List<File> f6387b = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f6389e = -1;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f6392h = false;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f6393i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public void run() {
            b.this.g();
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private Runnable f6394j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public void run() {
            b.this.e();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        File f6404a;

        /* renamed from: b  reason: collision with root package name */
        long f6405b;

        /* renamed from: c  reason: collision with root package name */
        long f6406c;

        /* renamed from: d  reason: collision with root package name */
        CrashType f6407d;

        /* renamed from: e  reason: collision with root package name */
        String f6408e;

        a(File file, long j10, CrashType crashType) {
            this.f6405b = -1L;
            this.f6406c = -1L;
            this.f6404a = file;
            this.f6405b = j10;
            this.f6407d = crashType;
            this.f6408e = file.getName();
        }

        a(File file, CrashType crashType) {
            this.f6405b = -1L;
            this.f6406c = -1L;
            this.f6404a = file;
            this.f6407d = crashType;
            this.f6408e = file.getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apm.insight.k.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0104b {

        /* renamed from: a  reason: collision with root package name */
        String f6409a;

        /* renamed from: d  reason: collision with root package name */
        a f6412d;

        /* renamed from: e  reason: collision with root package name */
        a f6413e;

        /* renamed from: b  reason: collision with root package name */
        List<a> f6410b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        List<a> f6411c = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        boolean f6414f = false;

        /* renamed from: g  reason: collision with root package name */
        int f6415g = 0;

        C0104b(String str) {
            this.f6409a = str;
        }
    }

    private b(Context context) {
        this.f6388c = context;
    }

    private com.apm.insight.entity.e a(File file, CrashType crashType, String str, long j10, long j11) {
        com.apm.insight.entity.e eVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.i.a(file);
                    return null;
                }
                boolean z10 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.i.d(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        eVar = null;
                        com.apm.insight.l.i.a(file);
                        com.apm.insight.b.a().a("NPTH_CATCH", th);
                        return eVar;
                    }
                }
                com.apm.insight.entity.e a10 = com.apm.insight.l.i.a(file, crashType);
                try {
                    JSONObject b10 = a10.b();
                    if (a10.b() == null) {
                        com.apm.insight.l.i.a(file);
                    } else if (crashType == CrashType.ANR) {
                        return a10;
                    } else {
                        b10.put("crash_time", j10);
                        b10.put("app_start_time", j11);
                        JSONObject optJSONObject = b10.optJSONObject("header");
                        if (optJSONObject == null) {
                            optJSONObject = Header.a(this.f6388c, j10).f();
                        } else if (z10) {
                            b10.remove("header");
                        }
                        String optString = optJSONObject.optString("sdk_version_name", null);
                        if (optString == null) {
                            optString = "1.3.8.nourl-alpha.0";
                        }
                        com.apm.insight.entity.a.a(b10, "filters", "sdk_version", optString);
                        if (com.apm.insight.l.i.a(b10.optJSONArray("logcat"))) {
                            b10.put("logcat", com.apm.insight.runtime.k.b(str));
                        }
                        com.apm.insight.entity.a.a(b10, "filters", "has_dump", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                        com.apm.insight.entity.a.a(b10, "filters", "has_logcat", String.valueOf(!com.apm.insight.l.l.a(b10, "logcat")));
                        com.apm.insight.entity.a.a(b10, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                        com.apm.insight.entity.a.a(b10, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                        com.apm.insight.entity.a.a(b10, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.d(str)));
                        com.apm.insight.entity.a.a(b10, "filters", "is_64_devices", String.valueOf(Header.a()));
                        com.apm.insight.entity.a.a(b10, "filters", "is_64_runtime", String.valueOf(NativeImpl.e()));
                        com.apm.insight.entity.a.a(b10, "filters", "is_x86_devices", String.valueOf(Header.b()));
                        com.apm.insight.entity.a.a(b10, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.entity.a.a(str)));
                        com.apm.insight.entity.a.a(b10, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.b.m()));
                        b10.put("launch_did", com.apm.insight.i.a.a(this.f6388c));
                        b10.put("crash_uuid", file.getName());
                        b10.put("jiffy", q.a.a());
                        long parseLong = Long.parseLong(com.apm.insight.runtime.b.a(j10, str));
                        com.apm.insight.entity.a.a(b10, "filters", "lastAliveTime", Math.abs(parseLong - j10) < 60000 ? "< 60s" : "> 60s");
                        b10.put("lastAliveTime", String.valueOf(parseLong));
                        b10.put("has_dump", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                        if (b10.opt("storage") == null) {
                            com.apm.insight.entity.a.a(b10, w.a(com.apm.insight.h.g()));
                        }
                        if (Header.b(optJSONObject)) {
                            com.apm.insight.entity.a.a(b10, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        com.apm.insight.entity.d.b(b10);
                        a10.b().put("upload_scene", "launch_scan");
                        if (z10) {
                            JSONObject jSONObject = new JSONObject();
                            b10.put("event_type", "start_crash");
                            b10.put("stack", b10.remove("data"));
                            jSONObject.put("data", new JSONArray().put(b10));
                            jSONObject.put("header", optJSONObject);
                            a10.a(jSONObject);
                        } else {
                            b10.put("isJava", 1);
                        }
                    }
                    return a10;
                } catch (Throwable th2) {
                    th = th2;
                    eVar = a10;
                    com.apm.insight.l.i.a(file);
                    com.apm.insight.b.a().a("NPTH_CATCH", th);
                    return eVar;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            eVar = null;
        }
    }

    public static b a() {
        if (f6385d == null) {
            synchronized (b.class) {
                if (f6385d == null) {
                    f6385d = new b(com.apm.insight.h.g());
                }
            }
        }
        return f6385d;
    }

    private JSONObject a(com.apm.insight.nativecrash.b bVar) {
        JSONObject d10 = bVar.d();
        if (d10 == null || d10.length() == 0) {
            if (com.apm.insight.h.d()) {
                bVar.l();
            }
            if (!bVar.c()) {
                bVar.k();
                return null;
            } else if (!bVar.f()) {
                bVar.k();
                return null;
            } else if (bVar.g()) {
                bVar.k();
                return null;
            } else {
                bVar.e();
                return bVar.j();
            }
        }
        return d10;
    }

    private void a(C0104b c0104b) {
        com.apm.insight.l.i.a(o.a(this.f6388c, c0104b.f6409a));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:36|37|38|(1:40)(1:76)|41|(2:70|(3:74|75|20))(5:45|46|47|48|49)|50|51|52|53|(1:55)|56|57|20) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148 A[Catch: all -> 0x015d, TryCatch #4 {all -> 0x015d, blocks: (B:63:0x013c, B:65:0x0148, B:66:0x0157), top: B:88:0x013c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.apm.insight.k.b.C0104b r21, boolean r22, com.apm.insight.runtime.h r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.h):void");
    }

    private void a(File file, C0104b c0104b) {
    }

    private void a(HashMap<String, C0104b> hashMap) {
        File[] listFiles = o.f(this.f6388c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < listFiles.length && i10 < 5; i10++) {
            File file = listFiles[i10];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0104b c0104b = hashMap.get(name);
                    if (c0104b == null) {
                        c0104b = new C0104b(name);
                        hashMap.put(name, c0104b);
                    }
                    JSONArray a10 = com.apm.insight.nativecrash.c.a(o.l(file), o.m(file));
                    int length = a10.length();
                    c0104b.f6415g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.i.a(o.n(file), a10, false);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.i.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
                com.apm.insight.l.i.a(file);
            }
        }
    }

    private void a(HashMap<String, C0104b> hashMap, C0104b c0104b) {
        File[] listFiles = o.d(this.f6388c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < listFiles.length && i10 < 5; i10++) {
            File file = listFiles[i10];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0104b c0104b2 = hashMap.get(name);
                    if (c0104b2 == null) {
                        c0104b2 = new C0104b(name);
                        hashMap.put(name, c0104b2);
                    }
                    c0104b2.f6411c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.i.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
                com.apm.insight.l.i.a(file);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r0.equals("launch") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0104b> r12, com.apm.insight.k.b.C0104b r13, java.io.File r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "G"
            boolean r0 = r15.endsWith(r0)
            if (r0 == 0) goto Lcd
            java.lang.String r0 = "_"
            java.lang.String[] r0 = r15.split(r0)
            int r1 = r0.length
            r2 = 5
            r3 = 0
            if (r1 >= r2) goto L1e
            java.util.List<com.apm.insight.k.b$a> r12 = r13.f6410b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r3)
            r12.add(r13)
            return
        L1e:
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> La3
            long r4 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> La3
            r2 = 4
            r2 = r0[r2]     // Catch: java.lang.Throwable -> La3
            long r6 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> La3
            r13 = 2
            r2 = r0[r13]
            r8 = 1
            r0 = r0[r8]
            r0.hashCode()
            r9 = -1
            int r10 = r0.hashCode()
            switch(r10) {
                case -1109843021: goto L55;
                case 96741: goto L4a;
                case 3254818: goto L3f;
                default: goto L3d;
            }
        L3d:
            r1 = -1
            goto L5e
        L3f:
            java.lang.String r1 = "java"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L3d
        L48:
            r1 = 2
            goto L5e
        L4a:
            java.lang.String r13 = "anr"
            boolean r13 = r0.equals(r13)
            if (r13 != 0) goto L53
            goto L3d
        L53:
            r1 = 1
            goto L5e
        L55:
            java.lang.String r13 = "launch"
            boolean r13 = r0.equals(r13)
            if (r13 != 0) goto L5e
            goto L3d
        L5e:
            switch(r1) {
                case 0: goto L68;
                case 1: goto L65;
                case 2: goto L62;
                default: goto L61;
            }
        L61:
            goto L6a
        L62:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.JAVA
            goto L6a
        L65:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.ANR
            goto L6a
        L68:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.LAUNCH
        L6a:
            java.lang.Object r13 = r12.get(r2)
            com.apm.insight.k.b$b r13 = (com.apm.insight.k.b.C0104b) r13
            if (r13 != 0) goto L7a
            com.apm.insight.k.b$b r13 = new com.apm.insight.k.b$b
            r13.<init>(r2)
            r12.put(r2, r13)
        L7a:
            com.apm.insight.k.b$a r12 = new com.apm.insight.k.b$a
            r12.<init>(r14, r4, r3)
            r12.f6406c = r6
            com.apm.insight.k.b$a r14 = r13.f6412d
            if (r14 == 0) goto L8d
            long r0 = r14.f6405b
            long r4 = r12.f6405b
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 <= 0) goto L9d
        L8d:
            if (r3 == 0) goto L9d
            com.apm.insight.CrashType r14 = com.apm.insight.CrashType.ANR
            if (r3 == r14) goto L9d
            java.lang.String r14 = "ignore"
            boolean r14 = r15.contains(r14)
            if (r14 != 0) goto L9d
            r13.f6412d = r12
        L9d:
            java.util.List<com.apm.insight.k.b$a> r13 = r13.f6410b
            r13.add(r12)
            goto Ld0
        La3:
            java.util.List<com.apm.insight.k.b$a> r12 = r13.f6410b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r3)
            r12.add(r13)
            com.apm.insight.c r12 = com.apm.insight.b.a()
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "err format crashTime:"
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            java.lang.String r14 = "NPTH_CATCH"
            r12.a(r14, r13)
            return
        Lcd:
            com.apm.insight.l.i.a(r14)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.util.HashMap, com.apm.insight.k.b$b, java.io.File, java.lang.String):void");
    }

    private boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    private void b(final C0104b c0104b, boolean z10, com.apm.insight.runtime.h hVar) {
        Iterator<a> it;
        boolean z11;
        JSONObject a10;
        a aVar;
        if (c0104b.f6411c.size() <= 1 && c0104b.f6411c.isEmpty()) {
            c0104b.f6413e = c0104b.f6412d;
            return;
        }
        boolean b10 = p.b(this.f6388c);
        c0104b.f6413e = c0104b.f6412d;
        com.apm.insight.nativecrash.b bVar = new com.apm.insight.nativecrash.b(this.f6388c);
        Iterator<a> it2 = c0104b.f6411c.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            final File file = next.f6404a;
            try {
                bVar.a(file);
                a10 = a(bVar);
            } catch (Throwable th) {
                th = th;
                it = it2;
            }
            if (a10 != null && a10.length() != 0) {
                if (a10.length() != 0) {
                    if (z10) {
                        it = it2;
                        z11 = b10;
                        if (hVar != null && !hVar.a("default")) {
                            bVar.k();
                        }
                    } else {
                        long optLong = a10.optLong("crash_time");
                        try {
                            aVar = c0104b.f6413e;
                        } catch (Throwable th2) {
                            th = th2;
                            it = it2;
                            z11 = b10;
                            com.apm.insight.b.a().a("NPTH_CATCH", th);
                            com.apm.insight.l.i.a(file);
                            b10 = z11;
                            it2 = it;
                        }
                        if (aVar == null) {
                            c0104b.f6413e = next;
                            c0104b.f6414f = true;
                            if (hVar == null || hVar.a("default")) {
                                it = it2;
                                z11 = b10;
                            } else {
                                bVar.k();
                            }
                        } else {
                            it = it2;
                            try {
                            } catch (Throwable th3) {
                                th = th3;
                                z11 = b10;
                            }
                            if (c0104b.f6414f) {
                                z11 = b10;
                            } else {
                                z11 = b10;
                                try {
                                } catch (Throwable th4) {
                                    th = th4;
                                    com.apm.insight.b.a().a("NPTH_CATCH", th);
                                    com.apm.insight.l.i.a(file);
                                    b10 = z11;
                                    it2 = it;
                                }
                                if (optLong < aVar.f6405b) {
                                    c0104b.f6413e = next;
                                    if (hVar == null || hVar.a("default")) {
                                        if (!a(file)) {
                                            a(file, c0104b);
                                        }
                                        c0104b.f6414f = true;
                                    } else {
                                        bVar.k();
                                        b10 = z11;
                                        it2 = it;
                                    }
                                }
                            }
                            com.apm.insight.entity.a.a(a10, "filters", "aid", String.valueOf(a10.optJSONObject("header").opt("aid")));
                            a10.optJSONObject("header").put("aid", 2010);
                        }
                    }
                    com.apm.insight.entity.a.a(a10, "filters", "start_uuid", c0104b.f6409a);
                    com.apm.insight.entity.a.a(a10, "filters", "crash_thread_name", a10.optString("crash_thread_name", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN));
                    if (z11) {
                        try {
                            c.a aVar2 = new c.a(a10, CrashType.NATIVE);
                            com.apm.insight.entity.b.a(a10, com.apm.insight.entity.b.a(aVar2.c(), aVar2.a(), s.a().b(aVar2.b() == -1 ? System.currentTimeMillis() : aVar2.b())), new b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public void a(JSONObject jSONObject) {
                                    d.a().a(jSONObject, file, o.a(b.this.f6388c, c0104b.f6409a));
                                }
                            });
                            if (!bVar.k()) {
                                bVar.h();
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            com.apm.insight.b.a().a("NPTH_CATCH", th);
                            com.apm.insight.l.i.a(file);
                            b10 = z11;
                            it2 = it;
                        }
                    }
                    c.a(CrashType.NATIVE, a10);
                } else {
                    it = it2;
                    z11 = b10;
                }
                b10 = z11;
                it2 = it;
            }
            it = it2;
            z11 = b10;
            bVar.k();
            b10 = z11;
            it2 = it;
        }
    }

    private void b(HashMap<String, C0104b> hashMap, C0104b c0104b) {
        File[] listFiles = o.a(this.f6388c).listFiles();
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, Collections.reverseOrder());
        for (File file : listFiles) {
            try {
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
            if (!com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                if (!com.apm.insight.l.i.g(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (!file.isFile()) {
                        a(hashMap, c0104b, file, file.getName());
                    }
                }
            }
            com.apm.insight.l.i.a(file);
        }
    }

    private void c(HashMap<String, C0104b> hashMap, C0104b c0104b) {
        com.apm.insight.l.i.a(o.b(this.f6388c));
    }

    private void d() {
        if (this.f6390f != null) {
            return;
        }
        this.f6390f = new C0104b("old_uuid");
        HashMap<String, C0104b> hashMap = new HashMap<>();
        this.f6391g = hashMap;
        a(hashMap);
        b(this.f6391g, this.f6390f);
        c(this.f6391g, this.f6390f);
        a(this.f6391g, this.f6390f);
        b(this.f6390f, true, null);
        a(this.f6390f, true, null);
        this.f6390f = null;
        if (this.f6391g.isEmpty()) {
            f();
        } else {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f6392h || this.f6391g == null) {
            return;
        }
        if (!p.b(this.f6388c)) {
            f();
        }
        boolean h10 = h();
        com.apm.insight.runtime.h hVar = new com.apm.insight.runtime.h(this.f6388c);
        for (C0104b c0104b : this.f6391g.values()) {
            b(c0104b, h10, hVar);
        }
        for (C0104b c0104b2 : this.f6391g.values()) {
            a(c0104b2, h10, hVar);
        }
        for (C0104b c0104b3 : this.f6391g.values()) {
            a(c0104b3);
        }
        hVar.a();
        com.apm.insight.runtime.b.a();
        f();
    }

    private void f() {
        this.f6392h = true;
        this.f6391g = null;
        NativeImpl.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f6392h) {
            return;
        }
        if (!p.b(this.f6388c) || (System.currentTimeMillis() - com.apm.insight.h.j() <= 5000 && com.apm.insight.h.i().isApmExists() && !Npth.hasCrash())) {
            com.apm.insight.runtime.p.b().a(this.f6393i, 5000L);
        } else {
            e();
        }
    }

    private boolean h() {
        if (this.f6389e == -1) {
            if (com.apm.insight.runtime.a.b() && com.apm.insight.runtime.a.g()) {
                this.f6389e = 1;
            } else {
                this.f6389e = 0;
            }
        }
        return this.f6389e == 1;
    }

    private void i() {
        File[] listFiles = o.i(this.f6388c).listFiles();
        if (listFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < listFiles.length && i10 < 5; i10++) {
            File file = listFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a().a(file.getAbsolutePath());
            } else {
                try {
                    com.apm.insight.entity.e e10 = com.apm.insight.l.i.e(file.getAbsolutePath());
                    if (e10 != null) {
                        if (e10.b() != null) {
                            e10.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), e10.e(), e10.d(), e10.f(), e10.g())) {
                            com.apm.insight.l.i.a(file);
                            com.apm.insight.l.i.a(e10.c());
                        }
                    } else {
                        com.apm.insight.l.i.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.b.a().a("NPTH_CATCH", th);
                }
            }
        }
    }

    public void a(boolean z10) {
        if (!Npth.isStopUpload() && z10) {
            d();
            i();
            com.apm.insight.c.a.a();
        }
    }

    public void b() {
        try {
            if (!this.f6392h && com.apm.insight.l.a.b(com.apm.insight.h.g())) {
                com.apm.insight.runtime.p.b().a(this.f6394j);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean c() {
        return this.f6392h;
    }
}
