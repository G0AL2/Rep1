package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.b.a;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdEventManager.java */
/* loaded from: classes.dex */
public class e {
    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar) {
        a(context, nVar, com.bytedance.sdk.component.d.d.g.g1657027613257dc("l`lgmkawino"));
        while (true) {
            char c10 = '^';
            char c11 = 'K';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                            case 21:
                            case 22:
                            case 23:
                                continue;
                                c10 = ']';
                                c11 = ']';
                        }
                        break;
                    case ']':
                        break;
                    case '^':
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
                            return;
                        default:
                            c11 = '[';
                    }
                }
                c10 = ']';
                c11 = ']';
            }
        }
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(com.bytedance.sdk.component.d.d.g.g1657027613257dc("rdlgawYsqyo"), com.bytedance.sdk.component.d.d.g.g1657027613257dc("h4"));
            jSONObject2.putOpt(com.bytedance.sdk.component.d.d.g.g1657027613257dc("rdlgawYsqyoT>"), 0);
            jSONObject.putOpt(com.bytedance.sdk.component.d.d.g.g1657027613257dc("ae]f|qtfWmk\u007fm"), jSONObject2);
        } catch (Exception unused) {
        }
        c(context, nVar, str, com.bytedance.sdk.component.d.d.g.g1657027613257dc("oqgm[ptkWa?"), jSONObject);
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, long j10) {
        while (true) {
            char c10 = 'I';
            while (true) {
                switch (c10) {
                    case 'H':
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.putOpt(com.bytedance.sdk.component.d.d.g.g1657027613257dc("rdlgawYsqyo"), com.bytedance.sdk.component.d.d.g.g1657027613257dc("h4"));
                            jSONObject2.putOpt(com.bytedance.sdk.component.d.d.g.g1657027613257dc("rdlgawYsqyoT>"), 0);
                            jSONObject2.putOpt(com.bytedance.sdk.component.d.d.g.g1657027613257dc("iovfvdesafdTahzg\u007fu"), Integer.valueOf(nVar.g()));
                            jSONObject.putOpt(com.bytedance.sdk.component.d.d.g.g1657027613257dc("ae]f|qtfWmk\u007fm"), jSONObject2);
                            jSONObject.put(com.bytedance.sdk.component.d.d.g.g1657027613257dc("dtpbplii"), Math.min(j10, (long) TTAdConstant.AD_MAX_EVENT_TIME));
                        } catch (Exception unused) {
                        }
                        c(context, nVar, str, com.bytedance.sdk.component.d.d.g.g1657027613257dc("lncg"), jSONObject);
                        return;
                    case 'I':
                    default:
                        c10 = 'H';
                    case 'J':
                        break;
                }
            }
        }
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ig]otZjhimcekR}zsrw`g"), z10 ? 1 : 2);
            jSONObject2.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmk\u007fm"), jSONObject.toString());
            jSONObject2.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("dtpbplii"), j10);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.b(th.toString());
        }
        e(context, nVar, str, com.bytedance.sdk.component.e.c.g.g1657027613239dc("lq]okdbnfn"), jSONObject2);
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2) {
        c(context, nVar, str, str2);
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, long j10, int i10, Map<String, Object> map, j jVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("dtpbplii"), j10);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("pdp`akr"), i10);
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            if ((com.bytedance.sdk.component.d.d.d.d1657027613261dc("fdgg[gtbib").equals(str2) || com.bytedance.sdk.component.d.d.d.d1657027613261dc("fdgg[jpbz").equals(str2)) && jVar != null) {
                jVar.a(jSONObject2);
            }
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        e(context, nVar, str, str2, jSONObject);
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, long j10, JSONObject jSONObject) {
        while (true) {
            char c10 = 15;
            while (true) {
                switch (c10) {
                    case '\r':
                        break;
                    case 14:
                        if (context == null || nVar == null || jSONObject == null) {
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("dtpbplii"), j10);
                            jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmk\u007fm"), jSONObject.toString());
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        e(context, nVar, str, str2, jSONObject2);
                        return;
                    case 15:
                    default:
                        c10 = 14;
                }
            }
        }
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, Map<String, Object> map) {
        char c10 = '8';
        char c11 = '<';
        while (true) {
            char c12 = ')';
            while (true) {
                switch (c12) {
                    case '(':
                        switch (c11) {
                            case 'Q':
                                switch (c10) {
                                    case 31:
                                        c12 = '(';
                                        c11 = 'S';
                                }
                                break;
                            case 'R':
                                break;
                            case 'S':
                                break;
                            default:
                                c12 = '(';
                                c11 = 'S';
                        }
                        while (true) {
                            switch (c10) {
                                case '\'':
                                    break;
                                case '(':
                                case ')':
                                    break;
                                default:
                                    c10 = '\'';
                            }
                        }
                        c12 = '(';
                        c11 = 'S';
                        break;
                    case ')':
                        c12 = '(';
                        c11 = 'S';
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.l.b(th.toString());
            }
        }
        jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ae]f|qtfWmk\u007fm"), jSONObject.toString());
        e(context, nVar, str, str2, jSONObject2);
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, JSONObject jSONObject) {
        while (true) {
            char c10 = '^';
            char c11 = '}';
            while (true) {
                switch (c10) {
                    case '^':
                        c10 = '_';
                        c11 = '_';
                    case '_':
                        switch (c11) {
                            case '^':
                            case '`':
                                c10 = '_';
                                c11 = '_';
                        }
                        break;
                }
                switch (c11) {
                    case '7':
                    case '9':
                        break;
                    case '8':
                        break;
                    default:
                        c10 = '_';
                        c11 = '_';
                }
            }
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ae]f|qtfWmk\u007fm"), jSONObject.toString());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            e(context, nVar, str, str2, jSONObject2);
        } else {
            c(context, nVar, str, str2);
        }
        if (com.bytedance.sdk.component.b.a.e.e1657027613270dc("cmk`o").equals(str2)) {
            com.bytedance.sdk.openadsdk.core.p.c(nVar);
        }
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, JSONObject jSONObject, long j10) {
        if (context == null || nVar == null || jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmk\u007fm"), jSONObject.toString());
            jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("dtpbplii"), j10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        e(context, nVar, str, str2, jSONObject2);
    }

    @Keep
    @JProtect
    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, Map<String, Object> map, Double d10) {
        JSONObject jSONObject;
        try {
            com.bytedance.sdk.openadsdk.core.p.b(nVar);
            jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (map != null) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("iovfvdesafdTahzg\u007fu"), nVar.g());
                jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("rdco[lhsm{khxdaaO|wg|zr"), nVar.f());
                jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
                jSONObject.putOpt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("lne\\a}rui"), nVar.ac());
                float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.utils.u.g(nVar)).floatValue();
                String e1657027613270dc = com.bytedance.sdk.component.b.a.e.e1657027613270dc("simt[qojm");
                if (floatValue <= 0.0f) {
                    floatValue = 0.0f;
                }
                jSONObject.putOpt(e1657027613270dc, Float.valueOf(floatValue));
                jSONObject.putOpt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("u`]skiodq"), Integer.valueOf(nVar.F()));
                String s10 = nVar.s();
                if (!TextUtils.isEmpty(s10) && !TextUtils.isEmpty(s10)) {
                    jSONObject.put(i.i1657027613257dc("tufptZvuajo"), Math.round(Float.parseFloat(s10) * 100000.0f));
                }
                if (nVar.aj() != null) {
                    try {
                        Object obj = nVar.aj().get(i.i1657027613257dc("sei\\flbcagmTxt~j"));
                        if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                            if (d10 != null) {
                                jSONObject.put(i.i1657027613257dc("tufptZvuajo"), Math.round(d10.doubleValue() * 100000.0d));
                            } else {
                                Object obj2 = nVar.aj().get(i.i1657027613257dc("psk`a"));
                                if (obj2 != null) {
                                    jSONObject.put(i.i1657027613257dc("tufptZvuajo"), Math.round(Double.parseDouble(obj2.toString()) * 100000.0d));
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                o.a(nVar, str);
            } catch (JSONException unused2) {
            }
        } catch (JSONException unused3) {
            jSONObject = null;
        }
        new a.C0162a().b(str).c(com.bytedance.sdk.component.b.a.e.e1657027613270dc("simt")).f(nVar.Y()).a(nVar.Z()).a(jSONObject).a((com.bytedance.sdk.openadsdk.b.a.a) null);
        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.j.a(com.bytedance.sdk.openadsdk.core.m.a()))) {
            com.bytedance.sdk.openadsdk.core.m.g().a(com.bytedance.sdk.openadsdk.k.e.a(nVar.R(), true));
        }
        if (com.bytedance.sdk.component.utils.l.c()) {
            com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.b.a.e.e1657027613270dc("AeGuakr"), com.bytedance.sdk.component.b.a.e.e1657027613270dc("simt$") + nVar.Y());
        }
        com.bytedance.sdk.openadsdk.core.s.b();
    }

    public static void a(Context context, String str, long j10) {
        com.bytedance.sdk.openadsdk.core.d.c.a(context, str, j10);
    }

    @Keep
    @JProtect
    public static void a(Context context, String str, com.bytedance.sdk.openadsdk.core.e.n nVar, com.bytedance.sdk.openadsdk.core.e.g gVar, String str2, boolean z10, Map<String, Object> map, int i10) {
        char c10 = 18;
        while (true) {
            char c11 = '.';
            while (true) {
                switch (c11) {
                    case '-':
                        if (c10 > '?') {
                            break;
                        } else {
                            break;
                        }
                    case '.':
                        c11 = '-';
                        c10 = 6;
                    case '/':
                        if (c10 != 4) {
                            if (c10 != 5) {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            c11 = '-';
                            c10 = 6;
                        }
                }
            }
        }
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.m.a();
        }
        JSONObject jSONObject = new JSONObject();
        if (gVar != null) {
            try {
                JSONObject a10 = gVar.a();
                a10.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("ir]ueioc"), z10);
                if (i10 >= 1 && i10 <= 2) {
                    a10.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("urgq[gcoi\u007fcd~Rzv`t"), i10);
                }
                if (map != null) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        a10.put(entry.getKey(), entry.getValue());
                    }
                }
                a10.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("iovfvdesafdTahzg\u007fu"), nVar.g());
                jSONObject.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("ae]f|qtfWmk\u007fm"), a10.toString());
            } catch (JSONException unused) {
            }
        }
        jSONObject.putOpt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\a}rui"), nVar.ac());
        float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.utils.u.g(nVar)).floatValue();
        String c1657027613239dc = com.bytedance.sdk.component.e.d.c.c1657027613239dc("simt[qojm");
        if (floatValue <= 0.0f) {
            floatValue = 0.0f;
        }
        jSONObject.putOpt(c1657027613239dc, Float.valueOf(floatValue));
        jSONObject.putOpt(com.bytedance.sdk.component.e.d.c.c1657027613239dc("u`]skiodq"), Integer.valueOf(nVar.F()));
        new a.C0162a().b(str2).c(str).f(nVar.Y()).a(nVar.Z()).a(jSONObject).a((com.bytedance.sdk.openadsdk.b.a.a) null);
        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.j.a(com.bytedance.sdk.openadsdk.core.m.a())) && com.bytedance.sdk.component.e.d.c.c1657027613239dc("cmk`o").equals(str)) {
            com.bytedance.sdk.openadsdk.core.m.g().a(com.bytedance.sdk.openadsdk.k.e.a(nVar.S(), true));
        }
        if (com.bytedance.sdk.component.utils.l.c()) {
            String c1657027613239dc2 = com.bytedance.sdk.component.e.d.c.c1657027613239dc("AeGuakr");
            com.bytedance.sdk.component.utils.l.c(c1657027613239dc2, str + com.bytedance.sdk.component.e.d.c.c1657027613239dc(" ") + nVar.Y());
        }
        if (com.bytedance.sdk.component.e.d.c.c1657027613239dc("cmk`o").equals(str)) {
            com.bytedance.sdk.openadsdk.core.p.c(nVar);
        }
    }

    public static void a(AdSlot adSlot) {
        String codeId;
        if (adSlot == null) {
            codeId = "";
        } else if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        } else {
            codeId = adSlot.getCodeId();
        }
        a(codeId);
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.bytedance.sdk.openadsdk.core.e.n r5, java.lang.String r6) {
        /*
        L0:
            r0 = 74
            r1 = 55
        L4:
            switch(r0) {
                case 72: goto L0;
                case 73: goto L8;
                case 74: goto Lb;
                default: goto L7;
            }
        L7:
            goto L46
        L8:
            switch(r1) {
                case 94: goto L41;
                case 95: goto Lf;
                case 96: goto Lf;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 55: goto L41;
                case 56: goto Lf;
                case 57: goto Lf;
                default: goto Le;
            }
        Le:
            goto L41
        Lf:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "rdtfmfcX|z"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.a.a1657027613243dc(r2)     // Catch: java.lang.Exception -> L33
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L33
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "ae]f|qtfWmk\u007fm"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.a.a1657027613243dc(r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L33
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L33
        L33:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.m.a()
            java.lang.String r2 = "bhfgmkaXzline{k"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.a.a1657027613243dc(r2)
            e(r1, r5, r6, r2, r0)
            return
        L41:
            r0 = 73
            r1 = 96
            goto L4
        L46:
            r0 = 72
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.e.a(com.bytedance.sdk.openadsdk.core.e.n, java.lang.String):void");
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("dtpbplii"), j10);
        } catch (Exception unused) {
        }
        e(com.bytedance.sdk.openadsdk.core.m.a(), nVar, str, com.bytedance.sdk.component.e.c.a.a1657027613243dc("bhfgmkaXdfko"), jSONObject);
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, long j10, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (j10 != -1) {
            try {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("dtpbplii"), j10);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
        a(nVar, com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("oqgm[db"), str, jSONObject, (j) null, (com.bytedance.sdk.openadsdk.b.a.a) null);
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2) {
        while (true) {
            char c10 = 15;
            while (true) {
                switch (c10) {
                    case '\r':
                        break;
                    case 14:
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.putOpt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("esplvZkto"), str2);
                            jSONObject.putOpt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ae]f|qtfWmk\u007fm"), jSONObject2);
                        } catch (JSONException unused) {
                        }
                        e(com.bytedance.sdk.openadsdk.core.m.a(), nVar, str, com.bytedance.sdk.component.e.c.a.a1657027613243dc("simt[`tug{"), jSONObject);
                        return;
                    case 15:
                    default:
                        c10 = 14;
                }
            }
        }
    }

    @Keep
    @JProtect
    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, String str3, long j10, long j11, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                String optString = jSONObject.optString(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmk\u007fm"), null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("cmk`o").equals(str3)) {
                    jSONObject2.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ddtjg`"), com.bytedance.sdk.openadsdk.utils.e.e(com.bytedance.sdk.openadsdk.core.m.a()).toString());
                }
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("t`e"), str2);
                if (com.bytedance.sdk.component.e.c.g.g1657027613239dc("cmk`o").equals(str3)) {
                    com.bytedance.sdk.openadsdk.core.p.c(nVar);
                    float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.utils.u.e(jSONObject.optString(com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\a}rui")))).floatValue();
                    String a1657027613243dc = com.bytedance.sdk.component.e.c.a.a1657027613243dc("simt[qojm");
                    if (floatValue <= 0.0f) {
                        floatValue = 0.0f;
                    }
                    jSONObject.putOpt(a1657027613243dc, Float.valueOf(floatValue));
                    if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.j.a(com.bytedance.sdk.openadsdk.core.m.a())) && nVar != null) {
                        com.bytedance.sdk.openadsdk.core.m.g().a(com.bytedance.sdk.openadsdk.k.e.a(nVar.S(), true));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        new a.C0162a().d(str).b(str2).c(str3).f(String.valueOf(j10)).g(String.valueOf(j11)).a(nVar.Z()).a(jSONObject).a((com.bytedance.sdk.openadsdk.b.a.a) null);
        if (com.bytedance.sdk.component.utils.l.c()) {
            com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.e.c.g.g1657027613239dc("AeGuakr"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("sdlgNvGcM\u007foex"));
        }
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, JSONObject jSONObject, j jVar, com.bytedance.sdk.openadsdk.b.a.a aVar) {
        if (nVar == null) {
            return;
        }
        new a.C0162a().f(nVar.Y()).e(nVar.ac()).a(nVar.Z()).b(str).c(str2).a(jSONObject).a(aVar);
    }

    @Keep
    @JProtect
    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, Map<String, Object> map) {
        char c10 = 'R';
        while (true) {
            switch (c10) {
                case 'P':
                case 'Q':
                    Context a10 = com.bytedance.sdk.openadsdk.core.m.a();
                    JSONObject jSONObject = new JSONObject();
                    if (map == null || map.size() <= 0) {
                        c(a10, nVar, str, com.bytedance.sdk.component.e.c.e.e1657027613237dc("lncg[dbXl|xjxdaa"));
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("ddtjg`"), com.bytedance.sdk.openadsdk.utils.e.e(a10).toString());
                        Object remove = map.remove(com.bytedance.sdk.component.e.c.e.e1657027613237dc("tnvbhZrnel"));
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                        if (remove instanceof Long) {
                            jSONObject.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("dtpbplii"), remove);
                        } else {
                            jSONObject.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("dtpbplii"), 0);
                        }
                        jSONObject.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
                    } catch (Exception unused) {
                    }
                    e(a10, nVar, str, com.bytedance.sdk.component.e.c.e.e1657027613237dc("lncg[dbXl|xjxdaa"), jSONObject);
                    return;
                case 'R':
                default:
                    c10 = 'P';
            }
        }
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, List<FilterWord> list) {
        com.bytedance.sdk.openadsdk.dislike.a.a().a(nVar, list);
        if (com.bytedance.sdk.component.utils.l.c()) {
            String e1657027613270dc = com.bytedance.sdk.component.b.a.e.e1657027613270dc("AeGuakr");
            com.bytedance.sdk.component.utils.l.c(e1657027613270dc, com.bytedance.sdk.component.b.a.e.e1657027613270dc("tu]gmvjnclUbob`/") + nVar.Y());
        }
    }

    public static void a(final String str) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.e.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("smmw"), str);
                    jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
                    long currentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.utils.p.c();
                    if (currentTimeMillis > TTAdConstant.AD_MAX_EVENT_TIME || currentTimeMillis < 0) {
                        com.bytedance.sdk.openadsdk.utils.p.d();
                    } else {
                        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("dtpbplii"), currentTimeMillis);
                        e.a(com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(com.bytedance.sdk.openadsdk.utils.p.a())), com.bytedance.sdk.openadsdk.utils.p.b(), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ndzw[iiflVy\u007fmy}"), jSONObject, (j) null, (com.bytedance.sdk.openadsdk.b.a.a) null);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Keep
    @JProtect
    public static void a(final String str, final com.bytedance.sdk.openadsdk.core.e.n nVar, final String str2, final j jVar) {
        if (nVar == null || jVar == null || !jVar.a()) {
            return;
        }
        com.bytedance.sdk.component.f.e.b().execute(new com.bytedance.sdk.component.f.g(com.bytedance.sdk.component.b.a.e.e1657027613270dc("aeQkkrRnelXn|b|{")) { // from class: com.bytedance.sdk.openadsdk.b.e.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("dtpbplii"), str);
                    j jVar2 = jVar;
                    if (jVar2 != null && jVar2.b() != null) {
                        jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmk\u007fm"), jVar.b().toString());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                e.e(com.bytedance.sdk.openadsdk.core.m.a(), nVar, str2, com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]pljqX|`gn"), jSONObject);
            }
        });
    }

    public static void b(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]phjrX|pzn"), nVar.x().getNativeAdType());
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("iovfvdesafdTahzg\u007fu"), nVar.g());
            jSONObject2.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmk\u007fm"), jSONObject.toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.b(th.toString());
        }
        e(context, nVar, str, com.bytedance.sdk.component.e.c.g.g1657027613239dc("phawqwcXkechg"), jSONObject2);
    }

    @Keep
    @JProtect
    public static void b(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, long j10) {
        String str2;
        String g1657027613257dc;
        if (context != null && com.bytedance.sdk.openadsdk.core.m.h().F()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("dtpbplii"), System.currentTimeMillis() - j10);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1695837674:
                    if (str.equals(com.bytedance.sdk.component.d.d.g.g1657027613257dc("b`lmawYfl"))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1364000502:
                    if (str.equals(com.bytedance.sdk.component.d.d.g.g1657027613257dc("rdubvaccW\u007fcoib"))) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -764631662:
                    if (str.equals(com.bytedance.sdk.component.d.d.g.g1657027613257dc("ftnowftbmgUbbyk}ce{g}tzHy}"))) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -712491894:
                    if (str.equals(com.bytedance.sdk.component.d.d.g.g1657027613257dc("el`f``bXim"))) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1844104722:
                    if (str.equals(com.bytedance.sdk.component.d.d.g.g1657027613257dc("iovfvdesafd"))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1912999166:
                    if (str.equals(com.bytedance.sdk.component.d.d.g.g1657027613257dc("dsct[db"))) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            if (c10 == 0) {
                str2 = "b`lmawYflVfdmizf}t";
            } else if (c10 == 1) {
                str2 = "iovfvdesafdT`bokdx\u007fv";
            } else if (c10 == 2) {
                str2 = "el`f``bXimUgclj{y|w";
            } else if (c10 == 3) {
                str2 = "rdubvaccW\u007fcoibQc\u007fpvg}xs";
            } else if (c10 == 4) {
                str2 = "ftnowftbmgUbbyk}ce{g}tzHy}Ews|zkILG";
            } else if (c10 != 5) {
                g1657027613257dc = "";
                e(context, nVar, str, g1657027613257dc, jSONObject);
            } else {
                str2 = "dsct[dbXdfkoxdcj";
            }
            g1657027613257dc = com.bytedance.sdk.component.d.d.g.g1657027613257dc(str2);
            e(context, nVar, str, g1657027613257dc, jSONObject);
        }
    }

    public static void b(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2) {
        c(context, nVar, str, str2);
    }

    public static void b(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, long j10, JSONObject jSONObject) {
        while (true) {
            char c10 = 15;
            while (true) {
                switch (c10) {
                    case '\r':
                        break;
                    case 14:
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(i.i1657027613257dc("dtpbplii"), j10);
                            if (jSONObject != null) {
                                jSONObject2.putOpt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ae]f|qtfWmk\u007fm"), jSONObject);
                            }
                        } catch (Exception unused) {
                        }
                        String i1657027613257dc = i.i1657027613257dc("ile@efnb");
                        com.bytedance.sdk.component.utils.l.c(i1657027613257dc, i.i1657027613257dc("Rdrlvq&ci}k1,") + jSONObject2.toString());
                        e(context, nVar, str, str2, jSONObject2);
                        return;
                    case 15:
                    default:
                        c10 = 14;
                }
            }
        }
    }

    public static void b(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
        e(context, nVar, str, str2, jSONObject);
    }

    public static void b(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmk\u007fm"), jSONObject.toString());
            } catch (Exception unused) {
            }
        }
        e(context, nVar, str, str2, jSONObject2);
    }

    public static void b(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, Map<String, Object> map) {
        a(nVar, str, -1L, map);
    }

    @Keep
    @JProtect
    private static void c(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\a}rui"), nVar.ac());
            jSONObject.putOpt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("u`]skiodq"), Integer.valueOf(nVar.F()));
        } catch (JSONException unused) {
        }
        new a.C0162a().b(str).c(str2).f(nVar.Y()).a(nVar.Z()).a(jSONObject).a((com.bytedance.sdk.openadsdk.b.a.a) null);
        if (com.bytedance.sdk.component.utils.l.c()) {
            String g1657027613239dc = com.bytedance.sdk.component.e.c.g.g1657027613239dc("AeGuakr");
            com.bytedance.sdk.component.utils.l.c(g1657027613239dc, com.bytedance.sdk.component.e.c.g.g1657027613239dc("t`e9$") + str + com.bytedance.sdk.component.e.c.g.g1657027613239dc("l``fh?&") + str2 + com.bytedance.sdk.component.e.c.g.g1657027613239dc(" ") + nVar.Y());
        }
    }

    public static void c(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
        e(context, nVar, str, str2, jSONObject);
    }

    @Keep
    @JProtect
    public static void c(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        e(context, nVar, str, str2, jSONObject);
    }

    public static void d(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
        } catch (Exception unused) {
        }
        e(context, nVar, str, str2, jSONObject);
    }

    public static void e(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        e(context, nVar, str, str2, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    @JProtect
    public static void e(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, JSONObject jSONObject) {
        if (nVar == null) {
            return;
        }
        try {
            if (jSONObject != null) {
                jSONObject.putOpt(com.bytedance.sdk.component.e.c.d.d1657027613220dc("lne\\a}rui"), nVar.ac());
                jSONObject.putOpt(com.bytedance.sdk.component.e.c.d.d1657027613220dc("u`]skiodq"), Integer.valueOf(nVar.F()));
            } else {
                com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.e.c.d.d1657027613220dc("AeGuakr"), com.bytedance.sdk.component.e.c.d.d1657027613220dc("cbp#hja+(eelShv{bp2zg5szhmc"));
            }
        } catch (JSONException unused) {
        }
        new a.C0162a().b(str).c(str2).f(nVar.Y()).a(nVar.Z()).a(jSONObject).a((com.bytedance.sdk.openadsdk.b.a.a) null);
        if (com.bytedance.sdk.component.utils.l.c()) {
            String d1657027613220dc = com.bytedance.sdk.component.e.c.d.d1657027613220dc("AeGuakr");
            com.bytedance.sdk.component.utils.l.c(d1657027613220dc, com.bytedance.sdk.component.e.c.d.d1657027613220dc("t`e9$") + str + com.bytedance.sdk.component.e.c.d.d1657027613220dc("l``fh?&") + str2 + com.bytedance.sdk.component.e.c.d.d1657027613220dc(" ") + nVar.Y());
        }
    }
}
