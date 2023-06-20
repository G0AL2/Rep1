package com.bytedance.sdk.openadsdk.core.i;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.d.d.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.n;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* compiled from: SdkSettingsHelper.java */
/* loaded from: classes.dex */
public class d implements Runnable {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f12340e;

    /* renamed from: a  reason: collision with root package name */
    private final b f12343a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12344b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f12345c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLong f12339d = new AtomicLong(0);

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f12341f = false;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f12342g = true;

    /* compiled from: SdkSettingsHelper.java */
    /* loaded from: classes.dex */
    private class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(com.bytedance.sdk.component.e.d.c.c1657027613239dc("b^opcZoc"), -1);
            if (intExtra == 1) {
                long longExtra = intent.getLongExtra(com.bytedance.sdk.component.e.d.c.c1657027613239dc("b^opcZrnel"), -1L);
                if (longExtra > 0) {
                    d.d().set(longExtra);
                }
            } else if (intExtra == 2) {
                try {
                    if (d.this.f12343a != null) {
                        d.this.f12343a.a();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private d(b bVar) {
        this.f12343a = bVar == null ? m.h() : bVar;
        Context a10 = m.a();
        this.f12344b = a10;
        this.f12345c = Executors.newSingleThreadExecutor();
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            try {
                a10.registerReceiver(new a(), new IntentFilter(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("cno-f|rblhdhi#a\u007fu\u007fswgq}9k|nousyMEBGJR@T")));
            } catch (Throwable unused) {
            }
        }
    }

    public static int a(Context context) {
        if (context == null || !c(context)) {
            return -2;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("I@@WGCY`lyxJ|}bfub"), -1);
    }

    public static d a(b bVar) {
        if (f12340e == null) {
            synchronized (d.class) {
                try {
                    if (f12340e == null) {
                        f12340e = new d(bVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12340e;
    }

    private JSONObject a(JSONObject jSONObject) {
        return f12342g ? com.bytedance.sdk.component.utils.a.a(jSONObject) : jSONObject;
    }

    public static void a() {
        try {
            Context a10 = m.a();
            int i10 = Build.VERSION.SDK_INT;
            File file = new File(i10 >= 24 ? new File(a10.getDataDir(), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("sicqaaYwzllx")) : new File(a10.getDatabasePath(g.g1657027613257dc("1")).getParentFile().getParentFile(), g.g1657027613257dc("sicqaaYwzllx")), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("tu]p`nYtm}~bbj}!h|~"));
            if (file.exists() && file.isFile()) {
                String replace = file.getName().replace(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(".yoo"), "");
                if (i10 >= 24) {
                    a10.deleteSharedPreferences(replace);
                    return;
                }
                a10.getSharedPreferences(replace, 0).edit().clear().apply();
                com.bytedance.sdk.component.utils.f.c(file);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(long j10) {
        if (j10 > 0 && m.a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(com.bytedance.sdk.component.b.a.e.e1657027613270dc("cno-f|rblhdhi#a\u007fu\u007fswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(com.bytedance.sdk.component.b.a.e.e1657027613270dc("b^opcZoc"), 1);
                intent.putExtra(com.bytedance.sdk.component.b.a.e.e1657027613270dc("b^opcZrnel"), j10);
                m.a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Map<String, String> map) {
        int i10 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                int intValue = Integer.valueOf(map.get(com.bytedance.sdk.component.e.d.c.c1657027613239dc("abvjr`+dgg~yca"))).intValue();
                long longValue = Long.valueOf(map.get(com.bytedance.sdk.component.e.d.c.c1657027613239dc("tr"))).longValue();
                String str2 = map.get(com.bytedance.sdk.component.e.d.c.c1657027613239dc("prv"));
                String a10 = o3.b.a(str + intValue + longValue);
                if (a10 != null) {
                    if (a10.equalsIgnoreCase(str2)) {
                        i10 = intValue;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        e.a(i10);
    }

    public static String b(Context context) {
        return context != null ? PreferenceManager.getDefaultSharedPreferences(context).getString(f.f12350b, "") : "";
    }

    public static void b() {
        if (m.a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(com.bytedance.sdk.component.b.a.e.e1657027613270dc("cno-f|rblhdhi#a\u007fu\u007fswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(com.bytedance.sdk.component.b.a.e.e1657027613270dc("b^opcZoc"), 2);
                m.a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    static /* synthetic */ boolean b(boolean z10) {
        while (true) {
            char c10 = '^';
            char c11 = 'K';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                            case 21:
                                f12341f = z10;
                                c10 = ']';
                                c11 = ']';
                        }
                        break;
                    case ']':
                        break;
                    case '^':
                        if (c11 <= 4) {
                            c10 = ']';
                            c11 = ']';
                        }
                        f12341f = z10;
                        c10 = ']';
                        c11 = ']';
                    default:
                        c10 = ']';
                        c11 = ']';
                }
                while (true) {
                    switch (c11) {
                        case '[':
                            break;
                        case '\\':
                            break;
                        case ']':
                            break;
                        default:
                            c11 = '[';
                    }
                }
                f12341f = z10;
                c10 = ']';
                c11 = ']';
            }
        }
        return z10;
    }

    private static boolean c(Context context) {
        if (context != null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            return (defaultSharedPreferences.getInt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("I@@WGCYDeyYogDJ"), RecyclerView.UNDEFINED_DURATION) == Integer.MIN_VALUE && defaultSharedPreferences.getInt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("I@@WGCYDeyYog[k}cx}}"), RecyclerView.UNDEFINED_DURATION) == Integer.MIN_VALUE) ? false : true;
        }
        return true;
    }

    static /* synthetic */ AtomicLong d() {
        while (true) {
            char c10 = ']';
            char c11 = ']';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                        }
                        c10 = '^';
                        c11 = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c11) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c11 = '[';
                            }
                        }
                        c10 = '^';
                        c11 = 'K';
                        break;
                    case '^':
                        if (c11 > 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return f12339d;
    }

    private boolean f() {
        return TextUtils.isEmpty(h.d().f());
    }

    private JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        int i10 = 1;
        u.a(jSONObject, true);
        try {
            int j10 = h.d().j();
            String d1657027613261dc = com.bytedance.sdk.component.d.d.d.d1657027613261dc("sdvwmka");
            l.b(d1657027613261dc, com.bytedance.sdk.component.d.d.d.d1657027613261dc("Sdvwmkat  $b\u007fJj\u007fbDavf5+") + m.h().x());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("mnffh"), Build.MODEL);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("ddtjg`Yda}s"), u.n());
            f h10 = m.h();
            if (h10.p(com.bytedance.sdk.component.d.d.d.d1657027613261dc("g`kg"))) {
                jSONObject.put(g.g1657027613257dc("g`kg"), s3.a.a().c());
            }
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("gerq"), j10);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("cnrse"), h.d().i());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("cbrb"), h.d().v());
            String d1657027613261dc2 = com.bytedance.sdk.component.d.d.d.d1657027613261dc("SeiPaqrnfnyCia~jb");
            l.c(d1657027613261dc2, com.bytedance.sdk.component.d.d.d.d1657027613261dc("cnrse%;") + h.d().i());
            if (h10.p(com.bytedance.sdk.component.d.d.d.d1657027613261dc("mba"))) {
                jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("mba"), n.b());
            }
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("cnlm[q\u007fwm"), u.p(this.f12344b));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("or"), 1);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("owgqw`gX~lxxeb`Pdhbv"), 1);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("or]uawungg"), String.valueOf(Build.VERSION.RELEASE));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("sei\\r`ttafd"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("4/7-4+0"));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("l`ldqdab"), j.a());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("thof[\u007fiim"), u.q());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("p`ahebcXfhgn"), u.d());
            boolean c10 = u.c(this.f12344b, u.d());
            String d1657027613261dc3 = com.bytedance.sdk.component.d.d.d.d1657027613261dc("irCstiodi}cdbKa}uv`|a{r");
            l.c(d1657027613261dc3, com.bytedance.sdk.component.d.d.d.d1657027613261dc("irCstiodi}cdbKa}uv`|a{r-") + c10);
            String d1657027613261dc4 = com.bytedance.sdk.component.d.d.d.d1657027613261dc("pnqjplii");
            if (!c10) {
                i10 = 2;
            }
            jSONObject.put(d1657027613261dc4, i10);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("aqr\\r`ttafd"), u.f());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("utkg"), j.c(this.f12344b));
            if (h.d() != null && h.d().f() != null) {
                jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("aqr\\ma"), h.d().f());
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("tr"), currentTimeMillis);
            String str = "";
            if (h.d() != null && h.d().f() != null) {
                str = h.d().f().concat(String.valueOf(currentTimeMillis)).concat(com.bytedance.sdk.component.d.d.d.d1657027613261dc("4/7-4+0"));
            }
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("rds\\wlai"), com.bytedance.sdk.component.utils.e.a(str));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("tbqwvlh`"), b(this.f12344b));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("tbd\\cavu"), a(this.f12344b));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("llv"), com.bytedance.sdk.openadsdk.utils.e.b());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("lnabh`Ykigm~mjk"), com.bytedance.sdk.openadsdk.utils.e.c());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("cicmj`j"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("m`km"));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void a(boolean z10) {
        try {
            if (f()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (z10 || currentTimeMillis - f12339d.get() >= TTAdConstant.AD_MAX_EVENT_TIME) {
                f12339d.set(currentTimeMillis);
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    a(currentTimeMillis);
                }
                this.f12345c.execute(this);
            }
        } catch (Throwable th) {
            l.a(com.bytedance.sdk.component.b.a.e.e1657027613270dc("SeiPaqrnfnyCia~jb"), com.bytedance.sdk.component.b.a.e.e1657027613270dc("lncg$vbl(zo\u007fxd`hc1wafzd-8"), th);
        }
    }

    public void c() {
        com.bytedance.sdk.openadsdk.utils.e.g();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!o.a(this.f12344b)) {
            try {
                this.f12343a.a();
            } catch (Throwable unused) {
            }
        } else if (f()) {
            return;
        } else {
            l.c(com.bytedance.sdk.component.e.d.c.c1657027613239dc("SeiPaqrnfnyCia~jb"), com.bytedance.sdk.component.e.d.c.c1657027613239dc("Fdv`l%ub|}cek-|jadw``5ecykn"));
            JSONObject g10 = g();
            com.bytedance.sdk.component.e.b.d b10 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
            try {
                b10.a(com.bytedance.sdk.openadsdk.c.d.a(b10, u.g(com.bytedance.sdk.component.e.d.c.c1657027613239dc("/`rj+db(}gcdb\"}k{>av`a\u007fy\u007fj5"))));
                b10.b(com.bytedance.sdk.component.e.d.c.c1657027613239dc("Urgq)Dabf}"), u.b());
            } catch (Exception unused2) {
            }
            b10.c(a(g10).toString());
            b10.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.core.i.d.1
                /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[PHI: r0 
                  PHI: (r0v2 char) = (r0v1 char), (r0v8 char) binds: [B:28:0x0087, B:25:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0087 -> B:41:0x00a0). Please submit an issue!!! */
                @Override // com.bytedance.sdk.component.e.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void a(com.bytedance.sdk.component.e.b.c r6, com.bytedance.sdk.component.e.b r7) {
                    /*
                        r5 = this;
                        r6 = 5
                        if (r7 == 0) goto L7b
                        boolean r0 = r7.f()
                        if (r0 == 0) goto L7b
                        java.lang.String r0 = r7.d()
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L7b
                        r0 = 0
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1e
                        java.lang.String r2 = r7.d()     // Catch: org.json.JSONException -> L1e
                        r1.<init>(r2)     // Catch: org.json.JSONException -> L1e
                        goto L23
                    L1e:
                        r1 = move-exception
                        r1.printStackTrace()
                        r1 = r0
                    L23:
                        if (r1 == 0) goto L7b
                        java.lang.String r2 = "cxrkaw"
                        java.lang.String r2 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r2)
                        r3 = -1
                        int r2 = r1.optInt(r2, r3)
                        r3 = 3
                        if (r2 != r3) goto L5e
                        java.lang.String r0 = "mdqpebc"
                        java.lang.String r0 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r0)
                        java.lang.String r0 = r1.optString(r0)
                        java.lang.String r0 = com.bytedance.sdk.component.utils.a.b(r0)
                        boolean r2 = android.text.TextUtils.isEmpty(r0)
                        if (r2 != 0) goto L5e
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4e
                        r2.<init>(r0)     // Catch: java.lang.Throwable -> L4e
                        r1 = r2
                        goto L5e
                    L4e:
                        r2 = move-exception
                        java.lang.String r3 = "SeiPaqrnfnyCia~jb"
                        java.lang.String r3 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r3)
                        java.lang.String r4 = "sdvwmka'lh~j,h|}\u007fc )4"
                        java.lang.String r4 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r4)
                        com.bytedance.sdk.component.utils.l.a(r3, r4, r2)
                    L5e:
                        java.util.Map r7 = r7.c()     // Catch: java.lang.Throwable -> L67
                        com.bytedance.sdk.openadsdk.core.i.d r2 = com.bytedance.sdk.openadsdk.core.i.d.this     // Catch: java.lang.Throwable -> L67
                        com.bytedance.sdk.openadsdk.core.i.d.a(r2, r0, r7)     // Catch: java.lang.Throwable -> L67
                    L67:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.i.d.this     // Catch: java.lang.Throwable -> L95
                        com.bytedance.sdk.openadsdk.core.i.b r7 = com.bytedance.sdk.openadsdk.core.i.d.a(r7)     // Catch: java.lang.Throwable -> L95
                        r7.a(r1)     // Catch: java.lang.Throwable -> L95
                        boolean r7 = com.bytedance.sdk.openadsdk.core.i.d.e()     // Catch: java.lang.Throwable -> L95
                        if (r7 != 0) goto L96
                        r7 = 11
                        r0 = 11
                        goto La0
                    L7b:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.i.d.this     // Catch: java.lang.Throwable -> La3
                        com.bytedance.sdk.openadsdk.core.i.b r7 = com.bytedance.sdk.openadsdk.core.i.d.a(r7)     // Catch: java.lang.Throwable -> La3
                        r7.a()     // Catch: java.lang.Throwable -> La3
                        r7 = 64
                        r0 = 5
                    L87:
                        switch(r7) {
                            case 63: goto L90;
                            case 64: goto L8b;
                            case 65: goto L90;
                            default: goto L8a;
                        }
                    L8a:
                        goto La0
                    L8b:
                        r7 = 4
                        if (r0 == r7) goto L90
                        if (r0 == r6) goto La3
                    L90:
                        r6 = 1
                        com.bytedance.sdk.openadsdk.core.i.d.b(r6)     // Catch: java.lang.Throwable -> L95
                        goto L96
                    L95:
                    L96:
                        boolean r6 = com.bytedance.sdk.openadsdk.multipro.b.c()
                        if (r6 == 0) goto L9f
                        com.bytedance.sdk.openadsdk.core.i.d.b()
                    L9f:
                        return
                    La0:
                        r7 = 63
                        goto L87
                    La3:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.i.d.AnonymousClass1.a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                }

                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    try {
                        d.this.f12343a.a();
                    } catch (Throwable unused3) {
                    }
                }
            });
        }
        c();
    }
}
