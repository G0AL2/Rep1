package com.bytedance.sdk.component.e.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TNCManager.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private a f10366c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10367d;

    /* renamed from: e  reason: collision with root package name */
    private b f10368e;

    /* renamed from: g  reason: collision with root package name */
    private Context f10370g;

    /* renamed from: h  reason: collision with root package name */
    private d f10371h;

    /* renamed from: s  reason: collision with root package name */
    private int f10382s;

    /* renamed from: b  reason: collision with root package name */
    private long f10365b = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10369f = false;

    /* renamed from: i  reason: collision with root package name */
    private int f10372i = 0;

    /* renamed from: j  reason: collision with root package name */
    private long f10373j = 19700101000L;

    /* renamed from: k  reason: collision with root package name */
    private int f10374k = 0;

    /* renamed from: l  reason: collision with root package name */
    private HashMap<String, Integer> f10375l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private HashMap<String, Integer> f10376m = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private int f10377n = 0;

    /* renamed from: o  reason: collision with root package name */
    private HashMap<String, Integer> f10378o = new HashMap<>();

    /* renamed from: p  reason: collision with root package name */
    private HashMap<String, Integer> f10379p = new HashMap<>();

    /* renamed from: q  reason: collision with root package name */
    private boolean f10380q = true;

    /* renamed from: r  reason: collision with root package name */
    private Map<String, Integer> f10381r = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    Handler f10364a = new Handler(Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.e.c.e.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10000) {
                return;
            }
            e.this.b(message.arg1 != 0);
        }
    };

    private e() {
    }

    public e(int i10) {
        this.f10382s = i10;
    }

    private String a(k kVar) {
        if (kVar == null || kVar.b() == null) {
            return "";
        }
        if (kVar.b().a() != null) {
            try {
            } catch (Exception unused) {
                return "";
            }
        }
        return InetAddress.getByName(kVar.b().a().getHost()).getHostAddress();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.bytedance.sdk.component.b.a.m r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.c.e.a(com.bytedance.sdk.component.b.a.m, java.lang.String):void");
    }

    private void a(boolean z10, long j10) {
        if (this.f10364a.hasMessages(10000)) {
            return;
        }
        Message obtainMessage = this.f10364a.obtainMessage();
        obtainMessage.what = 10000;
        obtainMessage.arg1 = z10 ? 1 : 0;
        if (j10 > 0) {
            this.f10364a.sendMessageDelayed(obtainMessage, j10);
        } else {
            this.f10364a.sendMessage(obtainMessage);
        }
    }

    private boolean a(int i10) {
        return i10 >= 200 && i10 < 400;
    }

    private void b(String str) {
        Map<String, String> g10;
        if (TextUtils.isEmpty(str) || (g10 = g()) == null || !g10.containsValue(str)) {
            return;
        }
        if (this.f10381r.get(str) == null) {
            this.f10381r.put(str, 1);
        } else {
            this.f10381r.put(str, Integer.valueOf(this.f10381r.get(str).intValue() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        c f10 = f();
        if (f10 == null) {
            return;
        }
        com.bytedance.sdk.component.e.d.b.b("TNCManager", "doUpdateRemote, " + z10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z10 && this.f10365b + (f10.f10354k * 1000) > elapsedRealtime) {
            com.bytedance.sdk.component.e.d.b.b("TNCManager", "doUpdateRemote, time limit");
            return;
        }
        this.f10365b = elapsedRealtime;
        g.a().a(this.f10382s, this.f10370g).c();
    }

    private boolean b(int i10) {
        if (i10 < 100 || i10 >= 1000) {
            return true;
        }
        c f10 = f();
        if (f10 == null || TextUtils.isEmpty(f10.f10356m)) {
            return false;
        }
        String str = f10.f10356m;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(i10);
        return str.contains(sb2.toString());
    }

    private void c(String str) {
        if (!TextUtils.isEmpty(str) && this.f10381r.containsKey(str)) {
            this.f10381r.put(str, 0);
        }
    }

    private boolean d(String str) {
        Map<String, String> g10 = g();
        if (g10 == null) {
            return false;
        }
        String str2 = g10.get(str);
        if (TextUtils.isEmpty(str2) || this.f10381r.get(str2) == null || this.f10381r.get(str2).intValue() < 3) {
            return false;
        }
        com.bytedance.sdk.component.e.d.b.b("TNCManager", "handleHostMapping, TNC host faild num over limit: " + str);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0000, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e1657027613237dc(java.lang.String r2) {
        /*
        L0:
            r0 = 73
            r1 = 96
        L4:
            switch(r0) {
                case 72: goto L26;
                case 73: goto L8;
                case 74: goto Lb;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            switch(r1) {
                case 94: goto L0;
                case 95: goto L26;
                case 96: goto L26;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 55: goto Lf;
                case 56: goto L26;
                case 57: goto L26;
                default: goto Le;
            }
        Le:
            goto L0
        Lf:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L14:
            int r1 = r2.length
            if (r0 >= r1) goto L20
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L14
        L20:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L26:
            r0 = 74
            r1 = 55
            goto L4
        L2b:
            r0 = 72
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.c.e.e1657027613237dc(java.lang.String):java.lang.String");
    }

    private void i() {
        SharedPreferences sharedPreferences = this.f10370g.getSharedPreferences(a(), 0);
        this.f10372i = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.f10373j = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    private void j() {
        com.bytedance.sdk.component.e.d.b.b("TNCManager", "resetTNCControlState");
        this.f10374k = 0;
        this.f10375l.clear();
        this.f10376m.clear();
        this.f10377n = 0;
        this.f10378o.clear();
        this.f10379p.clear();
    }

    public String a() {
        return "ttnet_tnc_config" + this.f10382s;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto Lea
            java.lang.String r0 = "/network/get_network"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto Lea
            java.lang.String r0 = "/get_domains/v4"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto Lea
            java.lang.String r0 = "/ies/speed"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L20
            goto Lea
        L20:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L31
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r1.getProtocol()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r1.getHost()     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r1 = move-exception
            goto L33
        L31:
            r1 = move-exception
            r2 = r0
        L33:
            r1.printStackTrace()
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto Lea
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4c
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lea
        L4c:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L54
            goto Lea
        L54:
            boolean r1 = r6.d(r0)
            java.lang.String r3 = "TNCManager"
            if (r1 == 0) goto L71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleHostMapping, TNC host faild num over limit: "
        L63:
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L6d:
            com.bytedance.sdk.component.e.d.b.b(r3, r0)
            return r7
        L71:
            java.util.Map r1 = r6.g()
            if (r1 == 0) goto Le1
            boolean r4 = r1.containsKey(r0)
            if (r4 != 0) goto L7e
            goto Le1
        L7e:
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L8b
            return r7
        L8b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleHostMapping, match, origin: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.bytedance.sdk.component.e.d.b.b(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = "://"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            boolean r2 = r7.startsWith(r0)
            if (r2 == 0) goto Lcf
            java.lang.String r7 = r7.replaceFirst(r0, r1)
        Lcf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleHostMapping, target: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto L6d
        Le1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleHostMapping, nomatch: "
            goto L63
        Lea:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.c.e.a(java.lang.String):java.lang.String");
    }

    public synchronized void a(Context context, boolean z10) {
        if (!this.f10369f) {
            this.f10370g = context;
            this.f10380q = z10;
            this.f10371h = new d(context, z10, this.f10382s);
            if (z10) {
                i();
            }
            com.bytedance.sdk.component.e.d.b.b("TNCManager", "initTnc, isMainProc: " + z10 + " probeCmd: " + this.f10372i + " probeVersion: " + this.f10373j);
            this.f10366c = g.a().a(this.f10382s, this.f10370g);
            this.f10369f = true;
        }
    }

    public synchronized void a(k kVar, m mVar) {
        if (kVar == null || mVar == null) {
            return;
        }
        if (this.f10380q) {
            if (com.bytedance.sdk.component.e.d.e.a(this.f10370g)) {
                URL url = null;
                try {
                    url = kVar.b().a();
                } catch (Exception unused) {
                }
                if (url == null) {
                    return;
                }
                String protocol = url.getProtocol();
                String host = url.getHost();
                String path = url.getPath();
                String a10 = a(kVar);
                int c10 = mVar.c();
                if ("http".equals(protocol) || "https".equals(protocol)) {
                    if (TextUtils.isEmpty(a10)) {
                        return;
                    }
                    com.bytedance.sdk.component.e.d.b.b("TNCManager", "onResponse, url: " + protocol + "://" + host + "#" + a10 + "#" + c10);
                    c f10 = f();
                    if (f10 != null && f10.f10345b) {
                        a(mVar, host);
                    }
                    if (f10 == null) {
                        return;
                    }
                    com.bytedance.sdk.component.e.d.b.b("TNCManager", "onResponse, url matched: " + protocol + "://" + host + "#" + a10 + "#" + c10 + " " + this.f10374k + "#" + this.f10375l.size() + "#" + this.f10376m.size() + " " + this.f10377n + "#" + this.f10378o.size() + "#" + this.f10379p.size());
                    if (c10 > 0) {
                        if (a(c10)) {
                            if (this.f10374k > 0 || this.f10377n > 0) {
                                j();
                            }
                            c(host);
                        } else if (!b(c10)) {
                            this.f10377n++;
                            this.f10378o.put(path, 0);
                            this.f10379p.put(a10, 0);
                            if (this.f10377n >= f10.f10351h && this.f10378o.size() >= f10.f10352i && this.f10379p.size() >= f10.f10353j) {
                                com.bytedance.sdk.component.e.d.b.b("TNCManager", "onResponse, url doUpdate: " + protocol + "://" + host + "#" + a10 + "#" + c10);
                                a(false, 0L);
                                j();
                            }
                            b(host);
                        }
                    }
                }
            }
        }
    }

    public synchronized void a(k kVar, Exception exc) {
        if (kVar != null) {
            if (kVar.b() != null && exc != null) {
                if (this.f10380q) {
                    if (com.bytedance.sdk.component.e.d.e.a(this.f10370g)) {
                        URL url = null;
                        try {
                            url = kVar.b().a();
                        } catch (Exception unused) {
                        }
                        if (url == null) {
                            return;
                        }
                        String protocol = url.getProtocol();
                        String host = url.getHost();
                        String path = url.getPath();
                        String a10 = a(kVar);
                        if ("http".equals(protocol) || "https".equals(protocol)) {
                            c f10 = f();
                            if (f10 == null) {
                                return;
                            }
                            com.bytedance.sdk.component.e.d.b.b("TNCManager", "onError, url matched: " + protocol + "://" + host + "#" + a10 + "# " + this.f10374k + "#" + this.f10375l.size() + "#" + this.f10376m.size() + " " + this.f10377n + "#" + this.f10378o.size() + "#" + this.f10379p.size());
                            this.f10374k = this.f10374k + 1;
                            this.f10375l.put(path, 0);
                            this.f10376m.put(a10, 0);
                            if (this.f10374k >= f10.f10348e && this.f10375l.size() >= f10.f10349f && this.f10376m.size() >= f10.f10350g) {
                                com.bytedance.sdk.component.e.d.b.b("TNCManager", "onError, url doUpate: " + protocol + "://" + host + "#" + a10);
                                a(false, 0L);
                                j();
                            }
                            b(host);
                        }
                    }
                }
            }
        }
    }

    public void a(b bVar) {
        this.f10368e = bVar;
    }

    public void a(boolean z10) {
        this.f10367d = z10;
    }

    public a b() {
        return this.f10366c;
    }

    public boolean c() {
        return this.f10367d;
    }

    public b d() {
        return this.f10368e;
    }

    public void e() {
        this.f10381r.clear();
    }

    public c f() {
        d dVar = this.f10371h;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public Map<String, String> g() {
        c f10 = f();
        if (f10 != null) {
            return f10.f10347d;
        }
        return null;
    }

    public d h() {
        return this.f10371h;
    }
}
