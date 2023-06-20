package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.Header;
import com.apm.insight.h;
import com.apm.insight.l.i;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import com.apm.insight.l.s;
import com.apm.insight.l.w;
import com.apm.insight.runtime.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f6515d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6516a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f6517b = null;

    /* renamed from: c  reason: collision with root package name */
    private C0105b f6518c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static String b(File file) {
            BufferedReader bufferedReader;
            String readLine;
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (Throwable th) {
                th = th;
            }
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                try {
                    com.apm.insight.b.a().a("NPTH_CATCH", th);
                    return "";
                } finally {
                    k.a(bufferedReader2);
                }
            }
            if (readLine == null) {
                k.a(bufferedReader);
                return "";
            } else if (!readLine.startsWith("[FATAL:jni_android.cc") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                k.a(bufferedReader);
                return "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                int indexOf = readLine.indexOf(" ttwebview:");
                sb2.append("Caused by: ");
                sb2.append("Please include Java exception stack in crash report");
                sb2.append("\n");
                sb2.append(readLine.substring(indexOf + 11));
                while (true) {
                    sb2.append("\n");
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 == null) {
                        String sb3 = sb2.toString();
                        k.a(bufferedReader);
                        return sb3;
                    }
                    sb2.append(readLine2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.apm.insight.nativecrash.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0105b {

        /* renamed from: b  reason: collision with root package name */
        private final com.apm.insight.nativecrash.d f6520b;

        /* renamed from: c  reason: collision with root package name */
        private final com.apm.insight.nativecrash.a f6521c;

        /* renamed from: d  reason: collision with root package name */
        private final File f6522d;

        /* renamed from: e  reason: collision with root package name */
        private final File f6523e;

        public C0105b(File file) {
            this.f6522d = file;
            this.f6523e = o.a(h.g(), file.getName());
            com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(file);
            this.f6521c = aVar;
            com.apm.insight.nativecrash.d dVar = new com.apm.insight.nativecrash.d(file);
            this.f6520b = dVar;
            if (aVar.a() && dVar.a() == null) {
                dVar.a(file);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:4:0x0008, B:6:0x000e, B:11:0x001c), top: B:16:0x0008 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long a() {
            /*
                r3 = this;
                com.apm.insight.nativecrash.a r0 = r3.f6521c
                java.util.Map r0 = r0.c()
                if (r0 == 0) goto L19
                boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto L19
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L17
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L17
                goto L1a
            L17:
                r0 = move-exception
                goto L21
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L2a
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L17
                return r0
            L21:
                com.apm.insight.c r1 = com.apm.insight.b.a()
                java.lang.String r2 = "NPTH_CATCH"
                r1.a(r2, r0)
            L2a:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.b.C0105b.a():long");
        }

        public File b() {
            return this.f6522d;
        }

        public boolean c() {
            return this.f6521c.a();
        }
    }

    /* loaded from: classes.dex */
    public class c extends e {
        c() {
            super();
            this.f6527c = "Total FD Count:";
            this.f6526b = o.i(b.this.f6518c.b());
            this.f6528d = ":";
            this.f6529e = -2;
        }
    }

    /* loaded from: classes.dex */
    public class d extends e {
        d() {
            super();
            this.f6527c = "VmSize:";
            this.f6526b = o.k(b.this.f6518c.b());
            this.f6528d = "\\s+";
            this.f6529e = -1;
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: b  reason: collision with root package name */
        protected File f6526b;

        /* renamed from: c  reason: collision with root package name */
        protected String f6527c;

        /* renamed from: d  reason: collision with root package name */
        protected String f6528d;

        /* renamed from: e  reason: collision with root package name */
        protected int f6529e;

        public e() {
        }

        public int a() {
            Throwable th;
            int i10;
            if (!this.f6526b.exists() || !this.f6526b.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f6526b));
                int i11 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i11 = a(readLine);
                    } catch (Throwable th2) {
                        th = th2;
                        i10 = i11;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.b.a().a("NPTH_CATCH", th);
                            return i10;
                        } finally {
                            if (bufferedReader != null) {
                                k.a(bufferedReader);
                            }
                        }
                    }
                } while (i11 == -1);
                k.a(bufferedReader2);
                return i11;
            } catch (Throwable th3) {
                th = th3;
                i10 = -1;
            }
        }

        public int a(String str) {
            int i10 = this.f6529e;
            if (str.startsWith(this.f6527c)) {
                try {
                    i10 = Integer.parseInt(str.split(this.f6528d)[1].trim());
                } catch (NumberFormatException e10) {
                    com.apm.insight.b.a().a("NPTH_CATCH", e10);
                }
                if (i10 < 0) {
                    return -2;
                }
                return i10;
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public class f extends e {
        f() {
            super();
            this.f6527c = "Total Threads Count:";
            this.f6526b = o.j(b.this.f6518c.b());
            this.f6528d = ":";
            this.f6529e = -2;
        }
    }

    public b(Context context) {
        this.f6516a = context;
    }

    private String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb2.append(str);
            } else {
                sb2.append(str.charAt(6));
                sb2.append(str.charAt(7));
                sb2.append(str.charAt(4));
                sb2.append(str.charAt(5));
                sb2.append(str.charAt(2));
                sb2.append(str.charAt(3));
                sb2.append(str.charAt(0));
                sb2.append(str.charAt(1));
                sb2.append(str.charAt(10));
                sb2.append(str.charAt(11));
                sb2.append(str.charAt(8));
                sb2.append(str.charAt(9));
                sb2.append(str.charAt(14));
                sb2.append(str.charAt(15));
                sb2.append(str.charAt(12));
                sb2.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb2.append((CharSequence) str, 16, 32);
                    sb2.append('0');
                }
            }
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
        }
        return sb2.toString().toUpperCase();
    }

    private void a(com.apm.insight.entity.a aVar) {
        aVar.a(n());
        aVar.a("is_native_crash", (Object) 1);
        aVar.a("repack_time", Long.valueOf(System.currentTimeMillis()));
        aVar.a("crash_uuid", (Object) this.f6518c.b().getName());
        aVar.a("jiffy", Long.valueOf(q.a.a()));
    }

    private void a(Map<String, String> map) {
        boolean exists = o.i(this.f6518c.b()).exists();
        String str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
        map.put("has_fds_file", exists ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false");
        File h10 = o.h(this.f6518c.b());
        map.put("has_logcat_file", (!h10.exists() || h10.length() <= 128) ? "false" : InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        map.put("has_maps_file", o.d(this.f6518c.b()).exists() ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false");
        map.put("has_tombstone_file", o.b(this.f6518c.b()).exists() ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false");
        map.put("has_meminfo_file", o.k(this.f6518c.b()).exists() ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false");
        if (!o.j(this.f6518c.b()).exists()) {
            str = "false";
        }
        map.put("has_threads_file", str);
    }

    private void b(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.d.b(aVar.h());
        HashMap hashMap = new HashMap();
        if (m()) {
            hashMap.put("is_root", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            aVar.a("is_root", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        } else {
            hashMap.put("is_root", "false");
            aVar.a("is_root", "false");
        }
        a(hashMap);
        int o10 = o();
        if (o10 > 0) {
            if (o10 > 960) {
                hashMap.put("fd_leak", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            } else {
                hashMap.put("fd_leak", "false");
            }
            aVar.a("fd_count", Integer.valueOf(o10));
        }
        int p10 = p();
        if (p10 > 0) {
            if (p10 > 350) {
                hashMap.put("threads_leak", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            } else {
                hashMap.put("threads_leak", "false");
            }
            aVar.a("threads_count", Integer.valueOf(p10));
        }
        int q10 = q();
        if (q10 > 0) {
            if (q10 > i()) {
                hashMap.put("memory_leak", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            } else {
                hashMap.put("memory_leak", "false");
            }
            aVar.a("memory_size", Integer.valueOf(q10));
        }
        hashMap.put("sdk_version", "1.3.8.nourl-alpha.0");
        hashMap.put("has_java_stack", String.valueOf(aVar.h().opt("java_data") != null));
        JSONArray a10 = com.apm.insight.nativecrash.c.a(o.l(this.f6518c.f6522d), o.m(this.f6518c.f6522d));
        hashMap.put("leak_threads_count", String.valueOf(a10.length()));
        if (a10.length() > 0) {
            try {
                i.a(o.n(this.f6518c.f6522d), a10, false);
            } catch (Throwable unused) {
            }
        }
        aVar.b();
        aVar.c();
        aVar.c(hashMap);
    }

    private void c(com.apm.insight.entity.a aVar) {
        Map<String, String> b10 = this.f6518c.f6520b.b();
        if (b10.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : b10.keySet()) {
            String a10 = a(b10.get(str));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str);
                jSONObject.put("lib_uuid", a10);
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                com.apm.insight.b.a().a("NPTH_CATCH", e10);
            }
        }
        aVar.a("crash_lib_uuid", (Object) jSONArray);
    }

    private void d(com.apm.insight.entity.a aVar) {
        File e10 = o.e(this.f6518c.b());
        if (!e10.exists() && this.f6517b == null) {
            aVar.b(w.a(h.g()));
            aVar.a("has_callback", "false");
            return;
        }
        try {
            JSONObject jSONObject = this.f6517b;
            if (jSONObject == null) {
                jSONObject = new JSONObject(i.c(e10.getAbsolutePath()));
            }
            aVar.c(jSONObject);
            aVar.a("has_callback", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            if (aVar.h().opt("storage") == null) {
                aVar.b(w.a(h.g()));
            }
            s.a(aVar, aVar.i(), CrashType.NATIVE);
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
        }
        long j10 = -1;
        long optLong = aVar.h().optLong("crash_time", -1L);
        long optLong2 = aVar.h().optLong("java_end", -1L);
        if (optLong2 != -1 && optLong != -1) {
            j10 = optLong2 - optLong;
        }
        try {
            aVar.b("total_cost", String.valueOf(j10));
            aVar.a("total_cost", String.valueOf(j10 / 1000));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:15:0x0055, B:17:0x005b), top: B:22:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(com.apm.insight.entity.a r5) {
        /*
            r4 = this;
            com.apm.insight.nativecrash.b$b r0 = r4.f6518c
            java.io.File r0 = r0.b()
            java.io.File r0 = com.apm.insight.l.o.g(r0)
            boolean r1 = r0.exists()
            java.lang.String r2 = "NPTH_CATCH"
            if (r1 == 0) goto L23
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = com.apm.insight.l.v.a(r0)     // Catch: java.lang.Throwable -> L1b
            goto L25
        L1b:
            r0 = move-exception
            com.apm.insight.c r1 = com.apm.insight.b.a()
            r1.a(r2, r0)
        L23:
            java.lang.String r0 = ""
        L25:
            com.apm.insight.nativecrash.b$b r1 = r4.f6518c
            java.io.File r1 = r1.b()
            java.io.File r1 = com.apm.insight.l.o.o(r1)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L55
            java.lang.String r1 = com.apm.insight.nativecrash.b.a.a(r1)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "\n"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            goto L55
        L54:
            r0 = r1
        L55:
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r1 != 0) goto L69
            java.lang.String r1 = "java_data"
            r5.a(r1, r0)     // Catch: java.lang.Throwable -> L61
            goto L69
        L61:
            r5 = move-exception
            com.apm.insight.c r0 = com.apm.insight.b.a()
            r0.a(r2, r5)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.b.e(com.apm.insight.entity.a):void");
    }

    private void f(com.apm.insight.entity.a aVar) {
        File a10 = o.a(this.f6518c.b());
        if (a10.exists()) {
            try {
                aVar.a("native_log", (Object) i.b(i.a(a10.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
    }

    private void g(com.apm.insight.entity.a aVar) {
        BufferedReader bufferedReader;
        File h10 = o.h(this.f6518c.b());
        if (!h10.exists()) {
            NativeImpl.a(h10.getAbsolutePath(), String.valueOf(h.i().getLogcatDumpCount()), String.valueOf(h.i().getLogcatLevel()));
        }
        BufferedReader bufferedReader2 = null;
        JSONArray jSONArray = new JSONArray();
        String str = " " + this.f6518c.f6521c.c().get("pid") + " ";
        try {
            bufferedReader = new BufferedReader(new FileReader(h10));
        } catch (Throwable unused) {
        }
        try {
            if (h10.length() > 512000) {
                bufferedReader.skip(h10.length() - 512000);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if ((readLine.length() > 32 ? readLine.substring(0, 31) : readLine).contains(str)) {
                    jSONArray.put(readLine);
                }
            }
            k.a(bufferedReader);
        } catch (Throwable unused2) {
            bufferedReader2 = bufferedReader;
            k.a(bufferedReader2);
            aVar.a("logcat", (Object) jSONArray);
        }
        aVar.a("logcat", (Object) jSONArray);
    }

    private void h(com.apm.insight.entity.a aVar) {
        Map<String, String> a10 = a();
        if (a10 == null || aVar == null) {
            return;
        }
        String str = a10.get("process_name");
        if (str != null) {
            aVar.a("process_name", (Object) str);
        }
        String str2 = a10.get("start_time");
        if (str2 != null) {
            try {
                aVar.a(Long.decode(str2).longValue());
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
        String str3 = a10.get("pid");
        if (str3 != null) {
            try {
                aVar.a("pid", Long.decode(str3));
            } catch (Throwable th2) {
                com.apm.insight.b.a().a("NPTH_CATCH", th2);
            }
        }
        String str4 = a10.get("crash_thread_name");
        if (str4 != null) {
            aVar.a("crash_thread_name", (Object) str4);
        }
        String str5 = a10.get("crash_time");
        if (str5 != null) {
            try {
                aVar.a("crash_time", Long.decode(str5));
            } catch (Throwable th3) {
                com.apm.insight.b.a().a("NPTH_CATCH", th3);
            }
        }
        aVar.a("data", (Object) b());
    }

    public static long i() {
        if (NativeImpl.e()) {
            return Long.MAX_VALUE;
        }
        return Header.a() ? 3891200L : 2867200L;
    }

    public static boolean m() {
        Boolean bool = f6515d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 11; i10++) {
            try {
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
            if (new File(strArr[i10]).exists()) {
                f6515d = Boolean.TRUE;
                return true;
            }
            continue;
        }
        f6515d = Boolean.FALSE;
        return false;
    }

    private Header n() {
        Header header = new Header(this.f6516a);
        JSONObject a10 = com.apm.insight.runtime.s.a().a(this.f6518c.a());
        if (a10 != null) {
            header.a(a10);
            header.d();
            header.e();
        }
        Header.b(header);
        return header;
    }

    private int o() {
        return new c().a();
    }

    private int p() {
        return new f().a();
    }

    private int q() {
        return new d().a();
    }

    public Map<String, String> a() {
        C0105b c0105b = this.f6518c;
        if (c0105b != null) {
            return c0105b.f6521c.c();
        }
        return null;
    }

    public void a(File file) {
        this.f6518c = new C0105b(file);
    }

    public String b() {
        C0105b c0105b = this.f6518c;
        if (c0105b != null) {
            String c10 = c0105b.f6520b.c();
            return (c10 == null || c10.isEmpty()) ? this.f6518c.f6521c.b() : c10;
        }
        return null;
    }

    public boolean c() {
        C0105b c0105b = this.f6518c;
        if (c0105b != null) {
            return c0105b.c();
        }
        return false;
    }

    public JSONObject d() {
        File f10 = o.f(this.f6518c.b());
        if (f10.exists()) {
            try {
                String c10 = i.c(f10.getAbsolutePath());
                if (c10 != null && !c10.isEmpty()) {
                    return new JSONObject(c10);
                }
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
            return null;
        }
        return null;
    }

    public void e() {
        try {
            File e10 = o.e(this.f6518c.b());
            File file = new File(e10.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i10 = 0;
            if (e10.exists()) {
                while (i10 < NativeCrashCollector.a()) {
                    File file2 = new File(e10.getAbsolutePath() + '.' + i10);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i10++;
                }
                return;
            }
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            for (int i11 = 0; i11 < NativeCrashCollector.a(); i11++) {
                File file3 = new File(e10.getAbsolutePath() + '.' + i11);
                if (file3.exists()) {
                    try {
                        JSONObject jSONObject = new JSONObject(i.c(file3.getAbsolutePath()));
                        if (jSONObject.length() > 0) {
                            aVar.c(jSONObject);
                        }
                    } catch (JSONException e11) {
                        com.apm.insight.b.a().a("NPTH_CATCH", e11);
                    }
                }
            }
            JSONObject h10 = aVar.h();
            try {
                if (h10.length() != 0 && h10.opt("storage") == null) {
                    com.apm.insight.entity.a.a(h10, w.a(h.g()));
                }
            } catch (Throwable unused) {
            }
            if (h10.length() != 0) {
                this.f6517b = h10;
                i.b(file, h10, false);
                if (file.renameTo(e10)) {
                    while (i10 < NativeCrashCollector.a()) {
                        File file4 = new File(e10.getAbsolutePath() + '.' + i10);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i10++;
                    }
                }
            }
        } catch (IOException e12) {
            com.apm.insight.b.a().a("NPTH_CATCH", e12);
        }
    }

    public boolean f() {
        ICrashFilter b10 = h.b().b();
        if (b10 != null) {
            try {
                return b10.onNativeCrashFilter(b(), "");
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
                return true;
            }
        }
        return true;
    }

    public boolean g() {
        return com.apm.insight.e.a.a().a(o.f(this.f6518c.b()).getAbsolutePath());
    }

    public void h() {
        com.apm.insight.e.a.a().a(com.apm.insight.e.a.a.a(o.f(this.f6518c.b()).getAbsolutePath()));
    }

    public JSONObject j() {
        try {
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            a(aVar);
            h(aVar);
            c(aVar);
            d(aVar);
            e(aVar);
            g(aVar);
            f(aVar);
            b(aVar);
            File f10 = o.f(this.f6518c.b());
            JSONObject h10 = aVar.h();
            i.a(f10, h10, false);
            return h10;
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
            return null;
        }
    }

    public boolean k() {
        return i.a(this.f6518c.b());
    }

    public void l() {
        try {
            String absolutePath = this.f6518c.b().getAbsolutePath();
            i.c(absolutePath, Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + h.g().getPackageName() + "/" + this.f6518c.b().getName() + ".zip");
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
        }
    }
}
