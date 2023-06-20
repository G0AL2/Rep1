package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Keep;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.n;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NetApiImpl.java */
/* loaded from: classes.dex */
public class o implements n<com.bytedance.sdk.openadsdk.b.a> {

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f12683g = false;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f12684i = true;

    /* renamed from: a  reason: collision with root package name */
    private final Context f12685a;

    /* renamed from: e  reason: collision with root package name */
    private long f12689e;

    /* renamed from: f  reason: collision with root package name */
    private int f12690f;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f12687c = Executors.newFixedThreadPool(1);

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.sdk.component.d.n f12691h = new com.bytedance.sdk.component.d.n() { // from class: com.bytedance.sdk.openadsdk.core.o.4
        @Override // com.bytedance.sdk.component.d.n
        public void a(int i10, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.d.n
        public void a(com.bytedance.sdk.component.d.j jVar) {
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12686b = d();

    /* renamed from: d  reason: collision with root package name */
    private final String f12688d = g();

    /* compiled from: NetApiImpl.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final int f12717a;

        /* renamed from: b  reason: collision with root package name */
        final long f12718b;

        /* renamed from: c  reason: collision with root package name */
        final long f12719c;

        /* renamed from: d  reason: collision with root package name */
        final int f12720d;

        /* renamed from: e  reason: collision with root package name */
        final String f12721e;

        /* renamed from: f  reason: collision with root package name */
        final int f12722f;

        /* renamed from: g  reason: collision with root package name */
        final String f12723g;

        /* renamed from: h  reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.core.e.a f12724h;

        /* renamed from: i  reason: collision with root package name */
        final String f12725i;

        /* renamed from: j  reason: collision with root package name */
        final ArrayList<Integer> f12726j;

        private a(String str, int i10, int i11, String str2, int i12, String str3, com.bytedance.sdk.openadsdk.core.e.a aVar, long j10, long j11, ArrayList<Integer> arrayList) {
            this.f12717a = i10;
            this.f12720d = i11;
            this.f12721e = str2;
            this.f12723g = str3;
            this.f12724h = aVar;
            this.f12725i = str;
            this.f12722f = i12;
            this.f12718b = j10;
            this.f12719c = j11;
            this.f12726j = arrayList;
        }

        public static a a(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.e.o oVar) {
            Object obj;
            String optString = jSONObject.optString(com.bytedance.sdk.component.d.d.d.d1657027613261dc("dhf"));
            int optInt = jSONObject.optInt(com.bytedance.sdk.component.d.d.d.d1657027613261dc("psm`avunfnU\u007fe`kP}b"));
            long optLong = jSONObject.optLong(com.bytedance.sdk.component.d.d.d.d1657027613261dc("s^pfg`oqmV~x"));
            long optLong2 = jSONObject.optLong(com.bytedance.sdk.component.d.d.d.d1657027613261dc("s^qfjaYs{"));
            int optInt2 = jSONObject.optInt(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("sucwqvYdgmo"));
            String optString2 = jSONObject.optString(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("ddq`"));
            String optString3 = jSONObject.optString(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("rdsvavrXam"));
            int optInt3 = jSONObject.optInt(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("rdcpkk"));
            Pair<com.bytedance.sdk.openadsdk.core.e.a, ArrayList<Integer>> a10 = com.bytedance.sdk.openadsdk.core.b.a(jSONObject, adSlot, oVar);
            if (a10 != null && (obj = a10.first) != null) {
                ((com.bytedance.sdk.openadsdk.core.e.a) obj).a(jSONObject.optLong(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("rdsvavrXio~n~")));
            }
            return a10 == null ? new a(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null) : new a(optString, optInt, optInt2, optString2, optInt3, optString3, (com.bytedance.sdk.openadsdk.core.e.a) a10.first, optLong, optLong2, (ArrayList) a10.second);
        }
    }

    /* compiled from: NetApiImpl.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12727a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12728b;

        /* renamed from: c  reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.core.e.s f12729c;

        private b(int i10, boolean z10, com.bytedance.sdk.openadsdk.core.e.s sVar) {
            this.f12727a = i10;
            this.f12728b = z10;
            this.f12729c = sVar;
        }

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("cnff"));
            boolean optBoolean = jSONObject.optBoolean(com.bytedance.sdk.component.b.a.e.e1657027613270dc("vdpjb|"));
            JSONObject optJSONObject = jSONObject.optJSONObject(com.bytedance.sdk.component.b.a.e.e1657027613270dc("d`vb"));
            com.bytedance.sdk.openadsdk.core.e.s sVar = new com.bytedance.sdk.openadsdk.core.e.s();
            if (optJSONObject != null) {
                try {
                    sVar.a(optJSONObject.optInt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("rdcpkk")));
                    sVar.b(optJSONObject.optInt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("cnps[q\u007fwm")));
                    sVar.c(optJSONObject.optInt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("rdubvaYfef\u007fex")));
                    sVar.a(optJSONObject.optString(com.bytedance.sdk.component.b.a.e.e1657027613270dc("rdubvaYiido")));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return new b(optInt, optBoolean, sVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Context context) {
        this.f12685a = context;
    }

    private static String a(int i10) {
        String str;
        if (i10 != 120) {
            if (i10 != 160) {
                if (i10 == 240) {
                    str = "herj";
                } else if (i10 == 320) {
                    str = "xifsm";
                } else if (i10 == 480) {
                    str = "xyjgtl";
                } else if (i10 == 640) {
                    str = "xyzk`uo";
                }
            }
            return com.bytedance.sdk.component.e.d.c.c1657027613239dc("merj");
        }
        str = "lerj";
        return com.bytedance.sdk.component.e.d.c.c1657027613239dc(str);
    }

    private static String a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(com.bytedance.sdk.component.d.d.g.g1657027613257dc("pimma"));
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static JSONObject a(AdSlot adSlot) {
        p pVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("pdppkkgkasooSlj"), m.h().A());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("llv"), com.bytedance.sdk.openadsdk.utils.e.b());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("cnrse"), h.d().k());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("gerq"), h.d().j());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ir]d`utX}zoy"), m.h().x());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("cbrb"), h.d().v());
            if (adSlot != null && p.f12730a.containsKey(Integer.valueOf(adSlot.getCodeId())) && (pVar = p.f12730a.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("l`qweaiji`d"), pVar.b());
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("l`qwfphcdl"), pVar.c());
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("l`qwgiodc"), pVar.d());
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("l`qwwnow"), pVar.e());
            }
            a(jSONObject, com.bytedance.sdk.component.e.c.d.d1657027613220dc("kd{tkwbt"), h.d().m());
            a(jSONObject, com.bytedance.sdk.component.e.c.d.d1657027613220dc("d`vb"), b(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c A[Catch: Exception -> 0x0171, TRY_LEAVE, TryCatch #0 {Exception -> 0x0171, blocks: (B:3:0x0005, B:5:0x0025, B:7:0x002f, B:21:0x008f, B:23:0x009c, B:24:0x00a4, B:29:0x00cf, B:36:0x0114, B:48:0x0129, B:50:0x012d, B:51:0x0131, B:53:0x013c, B:35:0x010b, B:27:0x00af, B:28:0x00bf, B:9:0x0039, B:11:0x0048, B:12:0x0055, B:14:0x005f, B:15:0x006c, B:17:0x0072, B:18:0x007f), top: B:56:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject a(com.bytedance.sdk.openadsdk.AdSlot r6, int r7, com.bytedance.sdk.openadsdk.core.e.o r8) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(com.bytedance.sdk.openadsdk.AdSlot, int, com.bytedance.sdk.openadsdk.core.e.o):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121 A[ADDED_TO_REGION] */
    @androidx.annotation.Keep
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject a(com.bytedance.sdk.openadsdk.AdSlot r11, com.bytedance.sdk.openadsdk.core.e.o r12, int r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.e.o, int):org.json.JSONObject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10, String str, int i10, a aVar, int i11, String str2) {
    }

    private void a(com.bytedance.sdk.openadsdk.b.a aVar) {
        if (aVar == null) {
            return;
        }
        String optString = aVar.b().optString(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("lne\\a}rui"), "");
        long c10 = com.bytedance.sdk.openadsdk.utils.u.c(optString);
        int d10 = com.bytedance.sdk.openadsdk.utils.u.d(optString);
        if (c10 == 0) {
            c10 = this.f12689e;
        }
        this.f12689e = c10;
        if (d10 == 0) {
            d10 = this.f12690f;
        }
        this.f12690f = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.bytedance.sdk.openadsdk.core.e.a aVar) {
        List<com.bytedance.sdk.openadsdk.core.e.n> b10 = aVar.b();
        if (b10 == null || b10.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < b10.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.e.n nVar = b10.get(i10);
            if (nVar != null && nVar.b() == null) {
                a("", nVar.M());
                a("", nVar.N());
                List<com.bytedance.sdk.openadsdk.core.e.k> P = nVar.P();
                if (P != null && P.size() > 0) {
                    for (int i11 = 0; i11 < P.size(); i11++) {
                        a(nVar, P.get(i11));
                    }
                }
                if (nVar.J() != null) {
                    a(nVar.J().w(), (com.bytedance.sdk.openadsdk.core.e.k) null);
                }
            }
        }
    }

    private void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, com.bytedance.sdk.openadsdk.core.e.k kVar) {
        com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ile@efnb"), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("lncgMhaFfmXn|b|{*1"));
        if (kVar == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.d.a.a(kVar).a(new com.bytedance.sdk.component.d.n() { // from class: com.bytedance.sdk.openadsdk.core.o.5
            @Override // com.bytedance.sdk.component.d.n
            public void a(int i10, String str, Throwable th) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("esplvZehll"), i10);
                    jSONObject.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("esplvZkb{zkli"), str);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.e.d.c.c1657027613239dc("ile@efnb"), com.bytedance.sdk.component.e.d.c.c1657027613239dc("lncgMhaFfmXn|b|{*1夣贶"));
                Context context = o.this.f12685a;
                com.bytedance.sdk.openadsdk.core.e.n nVar2 = nVar;
                com.bytedance.sdk.openadsdk.b.e.b(context, nVar2, com.bytedance.sdk.openadsdk.utils.u.a(nVar2), com.bytedance.sdk.component.e.d.c.c1657027613239dc("lncg[lkfolUn~\u007fa}"), currentTimeMillis2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.d.n
            public void a(com.bytedance.sdk.component.d.j jVar) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("psgokdbX{`pn"), jVar.f() / IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
                    jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("lnabhZefkao"), jVar.d() ? 1 : 0);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ile@efnb"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("lncgMhaFfmXn|b|{*1戂劌"));
                Context context = o.this.f12685a;
                com.bytedance.sdk.openadsdk.core.e.n nVar2 = nVar;
                com.bytedance.sdk.openadsdk.b.e.b(context, nVar2, com.bytedance.sdk.openadsdk.utils.u.a(nVar2), com.bytedance.sdk.component.e.c.g.g1657027613239dc("lncg[lkfolUxynmjcb"), currentTimeMillis2, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.bytedance.sdk.openadsdk.core.e.o oVar, long j10, long j11, int i10, long j12, com.bytedance.sdk.openadsdk.core.e.n nVar, String str) {
        if (!m.h().F()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        long j13 = 0;
        if (oVar != null) {
            try {
                if (oVar.f12205g > 0) {
                    jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("cmkfjqYt|hx\u007fSygbu"), j10 - oVar.f12205g);
                    j13 = j12 - oVar.f12205g;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ndvtkwmX|`gn"), j11 - j10);
        jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("sdtfvZrnel"), i10);
        jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("cmkfjqYbfmU\u007fe`k"), j12 - j11);
        try {
            com.bytedance.sdk.openadsdk.b.e.a(this.f12685a, nVar, str, com.bytedance.sdk.component.e.c.d.d1657027613220dc("lncg[dbX|`gn"), j13, jSONObject);
            while (true) {
                char c10 = 19;
                while (true) {
                    switch (c10) {
                        case 18:
                            return;
                        case 19:
                        default:
                            c10 = 18;
                        case 20:
                            break;
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
        aVar.a(-1, g.a(-1));
        bVar.a(-1);
        com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n.b bVar) {
        bVar.a(-1, g.a(-1));
    }

    private void a(String str, com.bytedance.sdk.openadsdk.core.e.k kVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.d.a.a(str).a(this.f12691h);
        } else if (kVar == null) {
        } else {
            com.bytedance.sdk.openadsdk.d.a.a(kVar).a(this.f12691h);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0012, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.json.JSONObject r2, com.bytedance.sdk.openadsdk.core.e.o r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L29
            org.json.JSONArray r0 = r3.f12203e
            if (r0 != 0) goto L7
            goto L29
        L7:
            java.lang.String r0 = "snwqg`YsmdkbS}|`tdqgK|rd"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r0)     // Catch: java.lang.Exception -> L29
            org.json.JSONArray r3 = r3.f12203e     // Catch: java.lang.Exception -> L29
            r2.put(r0, r3)     // Catch: java.lang.Exception -> L29
        L12:
            r2 = 73
            r3 = 96
        L16:
            switch(r2) {
                case 72: goto L21;
                case 73: goto L1a;
                case 74: goto L1d;
                default: goto L19;
            }
        L19:
            goto L26
        L1a:
            switch(r3) {
                case 94: goto L12;
                case 95: goto L21;
                case 96: goto L21;
                default: goto L1d;
            }
        L1d:
            switch(r3) {
                case 55: goto L29;
                case 56: goto L29;
                case 57: goto L21;
                default: goto L20;
            }
        L20:
            goto L12
        L21:
            r2 = 74
            r3 = 55
            goto L16
        L26:
            r2 = 72
            goto L16
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.e.o):void");
    }

    private void a(JSONObject jSONObject, String str, float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("whfwl"), (int) f10);
            jSONObject2.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("hdkdlq"), (int) f11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private void a(org.json.JSONObject r4, java.lang.String r5, int r6, int r7) {
        /*
            r3 = this;
            if (r6 <= 0) goto L43
            if (r7 <= 0) goto L43
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = "whfwl"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)     // Catch: java.lang.Exception -> L43
            r0.put(r2, r6)     // Catch: java.lang.Exception -> L43
            java.lang.String r6 = "hdkdlq"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r6)     // Catch: java.lang.Exception -> L43
            r0.put(r6, r7)     // Catch: java.lang.Exception -> L43
            r1.put(r0)     // Catch: java.lang.Exception -> L43
            r4.put(r5, r1)     // Catch: java.lang.Exception -> L43
            r4 = 55
            r5 = 0
        L29:
            r6 = 72
        L2b:
            switch(r6) {
                case 72: goto L3e;
                case 73: goto L39;
                case 74: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L29
        L2f:
            switch(r5) {
                case 52: goto L29;
                case 53: goto L33;
                case 54: goto L3e;
                default: goto L32;
            }
        L32:
            goto L3e
        L33:
            switch(r4) {
                case 29: goto L29;
                case 30: goto L29;
                case 31: goto L2f;
                default: goto L36;
            }
        L36:
            r4 = 30
            goto L33
        L39:
            r6 = 57
            if (r5 > r6) goto L3e
            goto L43
        L3e:
            r6 = 73
            r5 = 16
            goto L2b
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(org.json.JSONObject, java.lang.String, int, int):void");
    }

    private static void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private static String b(AdSlot adSlot) {
        if (adSlot == null) {
            return "";
        }
        String n10 = h.d().n();
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(n10)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return n10;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString(com.bytedance.sdk.component.e.c.a.a1657027613243dc("n`of"), null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(n10);
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString(com.bytedance.sdk.component.e.c.a.a1657027613243dc("n`of"), null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return n10;
        }
    }

    private JSONArray b(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (FilterWord filterWord : list) {
            jSONArray.put(filterWord.getId());
        }
        return jSONArray;
    }

    @Keep
    @JProtect
    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqrj`"), h.d().f());
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("n`of"), h.d().g());
            g(jSONObject);
            Context a10 = m.a();
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("p`ahebcXagy\u007fmabP`pf{"), a10 != null ? a10.getPackageResourcePath() : "");
            com.bytedance.sdk.openadsdk.utils.u.a(jSONObject, false);
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ir]selbXiyz"), h.d().l());
            if (s.a() != null) {
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqi\\wlai"), s.a());
            }
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqr\\vphiagmTxdcj"), (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("flumehc"), com.bytedance.sdk.openadsdk.utils.e.i(this.f12685a));
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ir]jjlr"), TTAdSdk.isInitSuccess() ? 1 : 0);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Keep
    @JProtect
    private JSONObject b(com.bytedance.sdk.openadsdk.core.e.n nVar, List<FilterWord> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("abvjkk"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("dhqomnc"));
            jSONObject2.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("thofwqgjx"), System.currentTimeMillis());
            jSONObject2.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("ae]p`nYqm{ybcc"), com.bytedance.sdk.component.e.d.c.c1657027613239dc("4/7-4+0"));
            jSONObject2.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("eyvqe"), nVar.ac());
            jSONObject2.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("fhnwawYpg{nx"), b(list));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("abvjkku"), jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    @JProtect
    public void b(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.e.o oVar, final int i10, final n.a aVar) {
        final com.bytedance.sdk.openadsdk.core.e.b bVar = new com.bytedance.sdk.openadsdk.core.e.b();
        bVar.a(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.i.e.a()) {
            if (aVar != null) {
                aVar.a(1000, com.bytedance.sdk.component.e.c.e.e1657027613237dc("Ae\"qatsb{}*b\u007f-zj}a}aug\u007f{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"));
                bVar.a(1000);
                com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
            }
        } else if (!m.h().z()) {
            if (aVar != null) {
                aVar.a(-16, g.a(-16));
                bVar.a(1001);
                com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.i.d.a((com.bytedance.sdk.openadsdk.core.i.b) null).a(false);
            if (aVar == null) {
                return;
            }
            if (b(adSlot.getCodeId())) {
                aVar.a(-8, g.a(-8));
                bVar.a(-8);
                com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
            } else if (TextUtils.isEmpty(adSlot.getBidAdm())) {
                JSONObject a10 = a(adSlot, oVar, i10);
                if (a10 == null) {
                    aVar.a(-9, g.a(-9));
                    bVar.a(-9);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                    return;
                }
                if (m.h().D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                    com.bytedance.sdk.openadsdk.utils.u.a(com.bytedance.sdk.component.e.c.e.e1657027613237dc("P`ldh`YCmk\u007flS@aku"), a10.toString(), this.f12685a);
                }
                String a11 = com.bytedance.sdk.openadsdk.utils.u.a(com.bytedance.sdk.component.e.c.e.e1657027613237dc("/`rj+db(}gcdb\"}k{>uv`Jwsk6"), true);
                com.bytedance.sdk.component.e.b.d b10 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
                try {
                    b10.a(com.bytedance.sdk.openadsdk.c.d.a(b10, a11));
                } catch (Exception unused) {
                }
                b10.a(a10);
                HashMap hashMap = new HashMap();
                hashMap.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("eyvqeZrnelUxxl|{"), Long.valueOf(System.currentTimeMillis()));
                b10.e(hashMap);
                Map<String, String> a12 = s.a(a11, a10.toString());
                if (a12 != null && a12.size() > 0) {
                    com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.e.c.e.e1657027613237dc("mrqgo%kt{maCiljjbb("), a12.toString());
                    for (String str : a12.keySet()) {
                        try {
                            b10.b(str, a12.get(str));
                        } catch (Exception unused2) {
                        }
                    }
                }
                try {
                    b10.b(com.bytedance.sdk.component.e.c.e.e1657027613237dc("Urgq)Dabf}"), com.bytedance.sdk.openadsdk.utils.u.b());
                } catch (Exception unused3) {
                }
                final long currentTimeMillis = System.currentTimeMillis();
                final AtomicLong atomicLong = new AtomicLong(currentTimeMillis);
                final AtomicLong atomicLong2 = new AtomicLong(currentTimeMillis);
                b10.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.core.o.3
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0298  */
                    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0298 -> B:47:0x029a). Please submit an issue!!! */
                    @Override // com.bytedance.sdk.component.e.a.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void a(com.bytedance.sdk.component.e.b.c r23, com.bytedance.sdk.component.e.b r24) {
                        /*
                            Method dump skipped, instructions count: 780
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.AnonymousClass3.a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                    }

                    @Override // com.bytedance.sdk.component.e.a.a
                    public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                        if (m.h().D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                            com.bytedance.sdk.openadsdk.utils.u.a(com.bytedance.sdk.component.b.a.e.e1657027613270dc("P`ldh`YCmk\u007flS@aku"), iOException != null ? iOException.getMessage() : null, o.this.f12685a);
                        }
                        long longValue = ((Long) cVar.c().get(com.bytedance.sdk.component.b.a.e.e1657027613270dc("eyvqeZrnelUxxl|{"))).longValue();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        String message = iOException != null ? iOException.getMessage() : "";
                        if (iOException != null && SocketTimeoutException.class.equals(iOException.getCause())) {
                            aVar.a(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, message);
                        }
                        aVar.a(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, message);
                        com.bytedance.sdk.component.utils.l.a(com.bytedance.sdk.component.b.a.e.e1657027613270dc("NdvBtlOjxe"), com.bytedance.sdk.component.b.a.e.e1657027613270dc("ooDbmisum3*"), Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION));
                        bVar.a(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION);
                        com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                        o.this.a(currentTimeMillis2 - longValue, adSlot.getCodeId(), i10, null, IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, message);
                    }
                });
                d.a().b();
            } else {
                com.bytedance.sdk.openadsdk.h.b.a().c();
                bVar.b(2);
                bVar.a(adSlot.getBidAdm());
                String e1657027613237dc = com.bytedance.sdk.component.e.c.e.e1657027613237dc("bhfgmka");
                com.bytedance.sdk.component.utils.l.b(e1657027613237dc, com.bytedance.sdk.component.e.c.e.e1657027613237dc("gdvB`%dnlHnf,d}/fp~zp９\u007fc8nswp=zvRDAWH\\\u0006WI[YN\fYFJ\u0010CWGAGXR\\\u0019[_JXLK)2'.!+2}h\u000b#/\r)#bn\u001c\u0016fyk") + o3.b.a(adSlot.getBidAdm()));
                if (m.h().D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                    com.bytedance.sdk.openadsdk.utils.u.a(com.bytedance.sdk.component.e.c.e.e1657027613237dc("P`ldh`YCmk\u007flS@aku"), adSlot.getBidAdm(), this.f12685a);
                }
                try {
                    JSONObject a13 = a(new JSONObject(adSlot.getBidAdm()));
                    if (a13 == null) {
                        a(aVar, bVar);
                        return;
                    }
                    a a14 = a.a(a13, adSlot, oVar);
                    bVar.a(a14.f12726j);
                    j.a(this.f12685a, a14.f12725i);
                    int i11 = a14.f12720d;
                    if (i11 != 20000) {
                        aVar.a(i11, a14.f12721e);
                        bVar.a(a14.f12720d);
                        com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.e.a aVar2 = a14.f12724h;
                    if (aVar2 == null) {
                        a(aVar, bVar);
                        return;
                    }
                    if (aVar2.b() != null && a14.f12724h.b().size() > 0) {
                        com.bytedance.sdk.openadsdk.b.e.a(a14.f12724h.b().get(0), com.bytedance.sdk.openadsdk.utils.u.b(i10));
                    }
                    a14.f12724h.c(a13.toString());
                    aVar.a(a14.f12724h, bVar);
                    a(a14.f12724h);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.e.c.e.e1657027613237dc("NdvBtlOjxe"), com.bytedance.sdk.component.e.c.e.e1657027613237dc("gdv#ea&bz{ey6-"), th);
                    a(aVar, bVar);
                }
            }
        }
    }

    private void b(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.e.b.d b10 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
        b10.a(str);
        b10.a(jSONObject);
        b10.a();
    }

    private boolean b(String str) {
        if (com.bytedance.sdk.openadsdk.core.d.b.a()) {
            return true;
        }
        if (com.bytedance.sdk.openadsdk.core.d.b.a(str)) {
            String b10 = com.bytedance.sdk.openadsdk.core.d.b.b();
            if (!TextUtils.isEmpty(b10)) {
                com.bytedance.sdk.openadsdk.b.e.a(this.f12685a, b10, System.currentTimeMillis());
            }
            return true;
        }
        return false;
    }

    @Keep
    @SuppressLint({"HardwareIds"})
    @JProtect
    private JSONObject c() {
        char c10 = ' ';
        while (true) {
            switch (c10) {
                case 31:
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("u`"), com.bytedance.sdk.openadsdk.utils.u.b());
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("ae]p`nYqm{ybcc"), com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("4/7-4+0"));
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("sho\\ku"), a(this.f12685a));
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("rnmw"), this.f12686b ? 1 : 0);
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("thof~jhb"), f());
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("abafwv"), com.bytedance.sdk.component.utils.o.g(this.f12685a));
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("or"), com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("Aofqklb"));
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("or]uawungg"), Build.VERSION.RELEASE);
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("or]btl"), Build.VERSION.SDK_INT);
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("ddtjg`Ysqyo"), this.f12688d);
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("ddtjg`Yjgmog"), Build.MODEL);
                        jSONObject.put(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("ddtjg`Yezhdo"), Build.BRAND);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ddtjg`Yjig\u007fmmnzzbt`"), Build.MANUFACTURER);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("l`ldqdab"), Locale.getDefault().getLanguage());
                        String a1657027613243dc = com.bytedance.sdk.component.e.c.a.a1657027613243dc("rdqlhprngg");
                        jSONObject.put(a1657027613243dc, com.bytedance.sdk.openadsdk.utils.v.d(this.f12685a) + com.bytedance.sdk.component.e.c.a.a1657027613243dc("x") + com.bytedance.sdk.openadsdk.utils.v.c(this.f12685a));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("dhqshd\u007fXlldxeyw"), a(com.bytedance.sdk.openadsdk.utils.v.g(this.f12685a)));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ddlpmq\u007fXlyc"), com.bytedance.sdk.openadsdk.utils.v.g(this.f12685a));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ddtjg`Ynl"), j.a(this.f12685a));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ahf"), com.bytedance.sdk.component.e.c.a.a1657027613243dc("1252"));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("rno"), e());
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("cqw\\ego"), Build.CPU_ABI);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("uu"), this.f12690f);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("uhf"), this.f12689e);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("gnmdh`Yfam"), s3.a.a().c());
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("lnabh`Ykigm~mjk"), com.bytedance.sdk.openadsdk.utils.e.c());
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("sbpfakYez`mcx"), Math.ceil(com.bytedance.sdk.openadsdk.utils.e.d() * 10.0f) / 10.0d);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ir]pgwcbfVemj"), com.bytedance.sdk.openadsdk.utils.e.a() ? 0 : 1);
                        com.bytedance.sdk.openadsdk.core.i.f h10 = m.h();
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("fnp`aZjffn\u007fjkh"), com.bytedance.sdk.component.utils.t.a(this.f12685a, com.bytedance.sdk.component.e.c.a.a1657027613243dc("tu]`ljitmVfjbj{nwt")));
                        if (h10.p(com.bytedance.sdk.component.e.c.a.a1657027613243dc("moa"))) {
                            jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("moa"), com.bytedance.sdk.openadsdk.utils.n.c());
                        }
                        if (h10.p(com.bytedance.sdk.component.e.c.a.a1657027613243dc("mba"))) {
                            jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("mba"), com.bytedance.sdk.openadsdk.utils.n.b());
                        }
                    } catch (Exception unused) {
                    }
                    return jSONObject;
                case ' ':
                case '!':
                    c10 = 31;
                default:
                    if (c10 > 'N') {
                        while (true) {
                        }
                    } else {
                        c10 = 31;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        com.bytedance.sdk.component.e.b.b c10 = com.bytedance.sdk.openadsdk.i.d.a().b().c();
        c10.a(str);
        c10.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.core.o.2
            @Override // com.bytedance.sdk.component.e.a.a
            public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                com.bytedance.sdk.component.utils.l.b(com.bytedance.sdk.component.e.c.e.e1657027613237dc("cmkfjq&eamnbbj.|erqvgf"), bVar.d());
            }

            @Override // com.bytedance.sdk.component.e.a.a
            public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                com.bytedance.sdk.component.utils.l.b(com.bytedance.sdk.component.e.c.e.e1657027613237dc("cmkfjq&eamnbbj.iqx~"), iOException.toString());
            }
        });
    }

    private boolean c(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @Keep
    @JProtect
    private void d(JSONObject jSONObject) {
        if (h.d().s()) {
            try {
                jSONObject.getJSONObject(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("hdcgaw")).put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ahf"), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("4441"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            JSONObject a10 = com.bytedance.sdk.component.utils.a.a(jSONObject);
            if (c(a10)) {
                jSONObject = a10;
            }
            Map<String, String> e11 = e(jSONObject);
            com.bytedance.sdk.component.e.b.d b10 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
            b10.a(com.bytedance.sdk.openadsdk.utils.u.l());
            if (e11 != null) {
                for (Map.Entry<String, String> entry : e11.entrySet()) {
                    try {
                        b10.b(entry.getKey(), entry.getValue());
                    } catch (Exception unused) {
                    }
                }
            }
            b10.c(jSONObject.toString());
            try {
                b10.b(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("Urgq)Dabf}"), com.bytedance.sdk.openadsdk.utils.u.b());
            } catch (Exception unused2) {
            }
            b10.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.core.o.6
                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                    if (bVar == null || !bVar.f()) {
                        com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.e.c.g.g1657027613239dc("NdvBtlOjxe"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("ooPfwuii{l0+Bhz]ubb|zfs7qj:uiqr"));
                    } else {
                        com.bytedance.sdk.component.utils.l.a(com.bytedance.sdk.component.e.c.g.g1657027613239dc("NdvBtlOjxe"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("ooPfwuii{l0+"), bVar.d());
                    }
                }

                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    com.bytedance.sdk.component.utils.l.a(com.bytedance.sdk.component.e.c.a.a1657027613243dc("NdvBtlOjxe"), com.bytedance.sdk.component.e.c.a.a1657027613243dc("ooDbmisum3*"), iOException.getMessage());
                }
            });
        }
    }

    private static boolean d() {
        try {
            if (!new File(com.bytedance.sdk.component.d.d.g.g1657027613257dc("/r{pp`k(j`d$\u007fx")).exists()) {
                if (!new File(com.bytedance.sdk.component.d.d.g.g1657027613257dc("/r{pp`k(pkce#~{")).exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Keep
    @JProtect
    private static String e() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (com.bytedance.sdk.openadsdk.utils.m.e()) {
            str = "MHWJ)";
        } else if (!com.bytedance.sdk.openadsdk.utils.m.b()) {
            String n10 = com.bytedance.sdk.openadsdk.utils.m.n();
            if (com.bytedance.sdk.openadsdk.utils.m.a(n10)) {
                sb2.append(com.bytedance.sdk.component.e.d.c.c1657027613239dc("ELWJ)"));
            }
            if (!TextUtils.isEmpty(n10)) {
                sb2.append(n10);
                str = Constants.FILENAME_SEQUENCE_SEPARATOR;
            }
            sb2.append(Build.VERSION.INCREMENTAL);
            return sb2.toString();
        } else {
            str = "FM[NA(";
        }
        sb2.append(com.bytedance.sdk.component.e.d.c.c1657027613239dc(str));
        sb2.append(Build.VERSION.INCREMENTAL);
        return sb2.toString();
    }

    private Map<String, String> e(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("Cnlwakr*\\pzn"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqromfgsafd$f~aa+1q{ugerl$ooz0&"));
        if (c(jSONObject)) {
            hashMap.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("Cnlwakr*Mgidhd`h"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("uokljZuccVoeobjj"));
        }
        return hashMap;
    }

    private static int f() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0016, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean f(org.json.JSONObject r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L30
            java.lang.String r0 = "mdqpebc"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.optString(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "sta`avu"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r0)     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L30
        L16:
            r0 = 95
            r1 = 95
        L1a:
            switch(r0) {
                case 94: goto L25;
                case 95: goto L1e;
                case 96: goto L21;
                default: goto L1d;
            }
        L1d:
            goto L2b
        L1e:
            switch(r1) {
                case 94: goto L16;
                case 95: goto L2b;
                case 96: goto L16;
                default: goto L21;
            }
        L21:
            switch(r1) {
                case 55: goto L2a;
                case 56: goto L2b;
                case 57: goto L2a;
                default: goto L24;
            }
        L24:
            goto L2a
        L25:
            r0 = 39
            if (r1 != r0) goto L2a
            goto L16
        L2a:
            return r3
        L2b:
            r0 = 94
            r1 = 125(0x7d, float:1.75E-43)
            goto L1a
        L30:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.f(org.json.JSONObject):boolean");
    }

    private String g() {
        String str;
        if (com.bytedance.sdk.openadsdk.utils.e.c(this.f12685a)) {
            str = "tw";
        } else if (com.bytedance.sdk.openadsdk.utils.e.b(this.f12685a)) {
            return com.bytedance.sdk.component.e.c.e.e1657027613237dc("aofqklbXxhn");
        } else {
            str = "aofqklb";
        }
        return com.bytedance.sdk.component.e.c.e.e1657027613237dc(str);
    }

    @Keep
    @JProtect
    private void g(JSONObject jSONObject) {
        try {
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("p`ahebcXfhgn"), com.bytedance.sdk.openadsdk.utils.u.d());
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("vdppmjhXkfnn"), com.bytedance.sdk.openadsdk.utils.u.e());
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("vdppmjh"), com.bytedance.sdk.openadsdk.utils.u.f());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.n
    public com.bytedance.sdk.component.adexpress.a.c.a a() {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            com.bytedance.sdk.component.e.b.b c10 = com.bytedance.sdk.openadsdk.i.d.a().b().c();
            try {
                c10.a(com.bytedance.sdk.openadsdk.c.d.a(c10, m.h().v()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            com.bytedance.sdk.component.e.b a10 = c10.a();
            if (a10 != null) {
                try {
                    if (a10.f()) {
                        return com.bytedance.sdk.component.adexpress.a.c.a.e(a10.d());
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.n
    @Keep
    @JProtect
    public com.bytedance.sdk.openadsdk.b.i a(List<com.bytedance.sdk.openadsdk.b.a> list) {
        boolean z10;
        try {
            if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
                String str = "";
                if (list.size() > 0 && list.get(0) != null && list.get(0).b() != null) {
                    str = list.get(0).b().optString(com.bytedance.sdk.component.d.d.g.g1657027613257dc("aqr\\hjaX}{f"));
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    a(list.get(0));
                    jSONObject.put(com.bytedance.sdk.component.d.d.g.g1657027613257dc("hdcgaw"), c());
                    JSONArray jSONArray = new JSONArray();
                    for (com.bytedance.sdk.openadsdk.b.a aVar : list) {
                        jSONArray.put(aVar.c());
                    }
                    jSONObject.put(com.bytedance.sdk.component.d.d.g.g1657027613257dc("ewgmp"), jSONArray);
                    long currentTimeMillis = System.currentTimeMillis();
                    jSONObject.put(com.bytedance.sdk.component.d.d.g.g1657027613257dc("_fgm[qojm"), currentTimeMillis);
                    jSONObject.put(com.bytedance.sdk.component.d.d.g.g1657027613257dc("lnabhZrnel"), currentTimeMillis / 1000);
                } catch (JSONException unused) {
                }
                JSONObject a10 = com.bytedance.sdk.component.utils.a.a(jSONObject);
                if (!c(a10)) {
                    a10 = jSONObject;
                }
                Map<String, String> e10 = e(a10);
                com.bytedance.sdk.component.e.b.d b10 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
                b10.a(com.bytedance.sdk.openadsdk.utils.u.h(str));
                if (e10 != null) {
                    for (Map.Entry<String, String> entry : e10.entrySet()) {
                        try {
                            b10.b(entry.getKey(), entry.getValue());
                        } catch (Exception unused2) {
                        }
                    }
                }
                b10.c(a10.toString());
                try {
                    b10.b(com.bytedance.sdk.component.d.d.g.g1657027613257dc("Urgq)Dabf}"), com.bytedance.sdk.openadsdk.utils.u.b());
                } catch (Exception unused3) {
                }
                com.bytedance.sdk.component.e.b a11 = b10.a();
                boolean f10 = (a11 == null || !a11.f() || TextUtils.isEmpty(a11.d())) ? false : f(new JSONObject(a11.d()));
                String g1657027613257dc = com.bytedance.sdk.component.d.d.g.g1657027613257dc("esplv%sicge|b");
                int a12 = a11 != null ? a11.a() : 0;
                if (f10 || a12 != 200) {
                    if (a11 != null && a11.b() != null) {
                        g1657027613257dc = a11.b();
                    }
                    z10 = false;
                } else {
                    g1657027613257dc = com.bytedance.sdk.component.d.d.g.g1657027613257dc("sdpuaw&tip*ecy.|erqvgf");
                    z10 = true;
                }
                d(jSONObject);
                return new com.bytedance.sdk.openadsdk.b.i(f10, a12, g1657027613257dc, z10);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.d.d.g.g1657027613257dc("NdvBtlOjxe"), com.bytedance.sdk.component.d.d.g.g1657027613257dc("uqnleaCqmg~+i\u007f|`b"), th);
            return new com.bytedance.sdk.openadsdk.b.i(false, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, com.bytedance.sdk.component.d.d.g.g1657027613257dc("sdpumfcXj|yr"), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject a(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "atawmjhXx{chi"
            if (r6 != 0) goto L5
            return r6
        L5:
            boolean r1 = com.bytedance.sdk.openadsdk.core.o.f12684i     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L44
            java.lang.String r1 = "cxrkaw"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r1)     // Catch: java.lang.Throwable -> L44
            r2 = -1
            int r1 = r6.optInt(r1, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "mdqpebc"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r6.optString(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = ""
            java.lang.String r3 = r6.optString(r3, r4)     // Catch: java.lang.Throwable -> L44
            r4 = 3
            if (r1 != r4) goto L2f
            java.lang.String r2 = com.bytedance.sdk.component.utils.a.b(r2)     // Catch: java.lang.Throwable -> L44
        L2f:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L44
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r2)
            java.lang.String r0 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r0)     // Catch: java.lang.Throwable -> L42
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            goto L45
        L44:
            r1 = r6
        L45:
            boolean r0 = com.bytedance.sdk.openadsdk.core.o.f12684i
            if (r0 == 0) goto L4a
            r6 = r1
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(org.json.JSONObject):org.json.JSONObject");
    }

    @Override // com.bytedance.sdk.openadsdk.core.n
    public void a(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.e.o oVar, final int i10, n.a aVar) {
        final com.bytedance.sdk.openadsdk.core.a.a aVar2 = new com.bytedance.sdk.openadsdk.core.a.a(aVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            k.c().post(new com.bytedance.sdk.component.f.g(com.bytedance.sdk.component.e.d.c.c1657027613239dc("gdvB`")) { // from class: com.bytedance.sdk.openadsdk.core.o.1
                @Override // java.lang.Runnable
                public void run() {
                    o.this.b(adSlot, oVar, i10, aVar2);
                }
            });
        } else {
            b(adSlot, oVar, i10, aVar2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.n
    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, List<FilterWord> list) {
        JSONObject b10;
        if (com.bytedance.sdk.openadsdk.core.i.e.a() && (b10 = b(nVar, list)) != null) {
            com.bytedance.sdk.component.e.b.d b11 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
            b11.a(com.bytedance.sdk.openadsdk.utils.u.g(com.bytedance.sdk.component.d.d.d.d1657027613261dc("/`rj+db(}gcdb\"jfc}{xqJsa}wn4")));
            b11.c(com.bytedance.sdk.component.utils.a.a(b10).toString());
            b11.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.core.o.7
                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                }

                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                }
            });
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[LOOP:0: B:7:0x0020->B:14:0x0031, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x001c -> B:7:0x0020). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0020 -> B:13:0x002c). Please submit an issue!!! */
    @Override // com.bytedance.sdk.openadsdk.core.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(final java.lang.String r3) {
        /*
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L19
            com.bytedance.sdk.openadsdk.core.o$9 r0 = new com.bytedance.sdk.openadsdk.core.o$9
            java.lang.String r1 = "uqnleaEkald\u007fNdjky\u007fu"
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)
            r0.<init>(r1)
            com.bytedance.sdk.component.f.e.a(r0)
            goto L2c
        L19:
            r2.c(r3)
        L1c:
            r3 = 73
            r0 = 96
        L20:
            switch(r3) {
                case 72: goto L2c;
                case 73: goto L24;
                case 74: goto L27;
                default: goto L23;
            }
        L23:
            goto L31
        L24:
            switch(r0) {
                case 94: goto L1c;
                case 95: goto L2b;
                case 96: goto L2b;
                default: goto L27;
            }
        L27:
            switch(r0) {
                case 55: goto L2b;
                case 56: goto L2b;
                case 57: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L1c
        L2b:
            return
        L2c:
            r3 = 74
            r0 = 55
            goto L20
        L31:
            r3 = 72
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0000, code lost:
        continue;
     */
    @Override // com.bytedance.sdk.openadsdk.core.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(org.json.JSONObject r3, final com.bytedance.sdk.openadsdk.core.n.b r4) {
        /*
            r2 = this;
        L0:
            r0 = 95
            r1 = 95
        L4:
            switch(r0) {
                case 94: goto Lf;
                case 95: goto L8;
                case 96: goto Lb;
                default: goto L7;
            }
        L7:
            goto L63
        L8:
            switch(r1) {
                case 94: goto L0;
                case 95: goto L63;
                case 96: goto L0;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 55: goto L0;
                case 56: goto L63;
                case 57: goto L0;
                default: goto Le;
            }
        Le:
            goto L14
        Lf:
            r0 = 39
            if (r1 != r0) goto L14
            goto L0
        L14:
            boolean r0 = com.bytedance.sdk.openadsdk.core.i.e.a()
            if (r0 != 0) goto L28
            if (r4 == 0) goto L27
            r3 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = "Ae\"qatsb{}*b\u007f-zj}a}aug\u007f{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r0)
            r4.a(r3, r0)
        L27:
            return
        L28:
            if (r3 == 0) goto L62
            if (r4 != 0) goto L2d
            goto L62
        L2d:
            org.json.JSONObject r3 = com.bytedance.sdk.component.utils.a.a(r3)
            com.bytedance.sdk.openadsdk.i.d r0 = com.bytedance.sdk.openadsdk.i.d.a()
            com.bytedance.sdk.component.e.a r0 = r0.b()
            com.bytedance.sdk.component.e.b.d r0 = r0.b()
            java.lang.String r1 = "/`rj+db(}gcdb\"}k{>`vctdsGos\u007fyr1mEVCQ@\n"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.u.g(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = com.bytedance.sdk.openadsdk.c.d.a(r0, r1)     // Catch: java.lang.Exception -> L4f
            r0.a(r1)     // Catch: java.lang.Exception -> L4f
            goto L53
        L4f:
            r1 = move-exception
            r1.printStackTrace()
        L53:
            java.lang.String r3 = r3.toString()
            r0.c(r3)
            com.bytedance.sdk.openadsdk.core.o$8 r3 = new com.bytedance.sdk.openadsdk.core.o$8
            r3.<init>()
            r0.a(r3)
        L62:
            return
        L63:
            r0 = 94
            r1 = 125(0x7d, float:1.75E-43)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.n$b):void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.n
    public void a(JSONObject jSONObject, String str) {
        b(jSONObject, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
        if (r4 == 60005) goto L27;
     */
    @Override // com.bytedance.sdk.openadsdk.core.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.b.i b(org.json.JSONObject r8) {
        /*
            r7 = this;
            boolean r0 = com.bytedance.sdk.openadsdk.core.i.e.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r8 == 0) goto Lb5
            int r0 = r8.length()
            if (r0 > 0) goto L12
            goto Lb5
        L12:
            org.json.JSONObject r8 = com.bytedance.sdk.component.utils.a.a(r8)
            com.bytedance.sdk.openadsdk.i.d r0 = com.bytedance.sdk.openadsdk.i.d.a()
            com.bytedance.sdk.component.e.a r0 = r0.b()
            com.bytedance.sdk.component.e.b.d r0 = r0.b()
            java.lang.String r1 = "/`rj+db(}gcdb\"}k{>aguae8zxnxt2"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.u.g(r1)     // Catch: java.lang.Exception -> L43
            r0.a(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L43
            r0.c(r8)     // Catch: java.lang.Exception -> L43
            java.lang.String r8 = "Urgq)Dabf}"
            java.lang.String r8 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r8)     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.u.b()     // Catch: java.lang.Exception -> L43
            r0.b(r8, r1)     // Catch: java.lang.Exception -> L43
        L43:
            com.bytedance.sdk.component.e.b r8 = r0.a()
            java.lang.String r0 = "esplv%sicge|b"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r0)
            r1 = 0
            if (r8 != 0) goto L56
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i     // Catch: java.lang.Throwable -> Lab
            r8.<init>(r1, r1, r0, r1)     // Catch: java.lang.Throwable -> Lab
            return r8
        L56:
            boolean r2 = r8.f()     // Catch: java.lang.Throwable -> Lab
            r3 = 1
            if (r2 == 0) goto L94
            java.lang.String r2 = r8.d()     // Catch: java.lang.Throwable -> Lab
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lab
            if (r2 != 0) goto L94
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = r8.d()     // Catch: java.lang.Throwable -> Lab
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "cnff"
            java.lang.String r4 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r4)     // Catch: java.lang.Throwable -> Lab
            r5 = -1
            int r4 = r2.optInt(r4, r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r5 = "d`vb"
            java.lang.String r5 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = ""
            java.lang.String r0 = r2.optString(r5, r6)     // Catch: java.lang.Throwable -> Lab
            r2 = 20000(0x4e20, float:2.8026E-41)
            if (r4 != r2) goto L8d
            r2 = 1
            goto L8e
        L8d:
            r2 = 0
        L8e:
            r5 = 60005(0xea65, float:8.4085E-41)
            if (r4 != r5) goto L95
            goto L96
        L94:
            r2 = 0
        L95:
            r3 = 0
        L96:
            int r1 = r8.a()     // Catch: java.lang.Throwable -> La8
            boolean r4 = r8.f()     // Catch: java.lang.Throwable -> La5
            if (r4 != 0) goto Laf
            java.lang.String r0 = r8.b()     // Catch: java.lang.Throwable -> La5
            goto Laf
        La5:
            r8 = r1
            r1 = r3
            goto Lad
        La8:
            r1 = r3
            r8 = 0
            goto Lad
        Lab:
            r8 = 0
            r2 = 0
        Lad:
            r3 = r1
            r1 = r8
        Laf:
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i
            r8.<init>(r2, r1, r0, r3)
            return r8
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.b(org.json.JSONObject):com.bytedance.sdk.openadsdk.b.i");
    }
}
