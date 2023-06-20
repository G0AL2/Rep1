package com.bytedance.sdk.openadsdk.b.b.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.b.b.b.d;
import com.bytedance.sdk.openadsdk.b.b.b.e;
import com.bytedance.sdk.openadsdk.b.b.b.f;
import com.bytedance.sdk.openadsdk.b.b.b.g;
import com.bytedance.sdk.openadsdk.b.b.b.h;
import com.bytedance.sdk.openadsdk.b.b.b.i;
import com.bytedance.sdk.openadsdk.b.b.b.j;
import com.bytedance.sdk.openadsdk.b.b.b.k;
import com.bytedance.sdk.openadsdk.b.b.b.m;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.u;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import l3.b;
import l3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoEventManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<k3.a, o> f11007a = Collections.synchronizedMap(new WeakHashMap());

    public static void c(com.bytedance.sdk.openadsdk.b.b.b.a<j> aVar) {
        a(aVar, "load_video_error");
    }

    public static void d(com.bytedance.sdk.openadsdk.b.b.b.a<i> aVar) {
        a(aVar, "load_video_cancel");
    }

    public static void e(k3.a aVar, o.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return;
        }
        if (aVar2.k() <= 0) {
            l.c("VideoEventManager", "Cancel log report when buffer count is 0");
            return;
        }
        o oVar = f11007a.get(aVar);
        if (oVar == null) {
            return;
        }
        c d10 = oVar.d();
        n e10 = oVar.e();
        if (d10 == null || e10 == null) {
            return;
        }
        long c10 = aVar2.c();
        if (c10 <= 0) {
            return;
        }
        m mVar = new m();
        mVar.a(aVar2.b());
        mVar.b(c10);
        mVar.a(aVar2.k());
        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e10, u.a(e10), a(e10, oVar.b(), oVar.c(), d10.B()), mVar);
        aVar3.a(aVar2.l());
        a(aVar3, "play_buffer");
    }

    public static JSONObject a(n nVar, String str, int i10, int i11) {
        b J;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i10 > 0) {
                jSONObject.put("play_type", String.valueOf(i10));
            }
            if (nVar != null && (J = nVar.J()) != null) {
                jSONObject.put("video_resolution", J.u());
                jSONObject.put("video_size", Long.valueOf(J.o()));
                jSONObject.put(InneractiveRichMediaVideoPlayerActivityCore.VIDEO_URL, J.y());
                jSONObject.put("player_type", i11);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void b(com.bytedance.sdk.openadsdk.b.b.b.a<com.bytedance.sdk.openadsdk.b.b.b.l> aVar) {
        a(aVar, "load_video_success");
    }

    public static void c(k3.a aVar, o.a aVar2) {
        o oVar;
        if (aVar == null || aVar2 == null || (oVar = f11007a.get(aVar)) == null) {
            return;
        }
        c d10 = oVar.d();
        n e10 = oVar.e();
        if (d10 == null || e10 == null) {
            return;
        }
        long a10 = aVar2.a();
        long c10 = aVar2.c();
        com.bytedance.sdk.openadsdk.b.b.b.n nVar = new com.bytedance.sdk.openadsdk.b.b.b.n();
        nVar.a(aVar2.b());
        nVar.b(c10);
        nVar.a(aVar2.d());
        nVar.b(aVar2.e());
        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e10, u.a(e10), a(e10, oVar.b(), oVar.c(), d10.B()), nVar);
        aVar3.a(aVar2.l());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", a10);
            jSONObject.put("percent", aVar2.h());
            a(aVar3, "play_error", jSONObject);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public static void d(k3.a aVar, o.a aVar2) {
        o oVar;
        if (aVar == null || aVar2 == null || (oVar = f11007a.get(aVar)) == null) {
            return;
        }
        c d10 = oVar.d();
        n e10 = oVar.e();
        if (d10 == null || e10 == null) {
            return;
        }
        long a10 = aVar2.a();
        long c10 = aVar2.c();
        com.bytedance.sdk.openadsdk.b.b.b.b bVar = new com.bytedance.sdk.openadsdk.b.b.b.b();
        bVar.a(aVar2.b());
        bVar.b(c10);
        bVar.a(aVar2.f());
        bVar.b(aVar2.g());
        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e10, u.a(e10), a(e10, oVar.b(), oVar.c(), d10.B()), bVar);
        aVar3.a(aVar2.l());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", a10);
            jSONObject.put("percent", aVar2.h());
            a(aVar3, "endcard_skip", jSONObject);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        f11007a.remove(aVar);
    }

    public static void b(k3.a aVar, o.a aVar2) {
        o oVar;
        if (aVar == null || aVar2 == null || (oVar = f11007a.get(aVar)) == null) {
            return;
        }
        c d10 = oVar.d();
        n e10 = oVar.e();
        if (d10 == null || e10 == null) {
            return;
        }
        long a10 = aVar2.a();
        long c10 = aVar2.c();
        if (c10 <= 0 || a10 <= 0) {
            return;
        }
        e eVar = new e();
        eVar.a(aVar2.b());
        eVar.b(c10);
        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e10, u.a(e10), a(e10, oVar.b(), oVar.c(), d10.B()), eVar);
        aVar3.a(aVar2.l());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", a10);
            jSONObject.put("percent", aVar2.h());
            a(aVar3, "feed_continue", jSONObject);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public static void a(com.bytedance.sdk.openadsdk.b.b.b.a<k> aVar) {
        a(aVar, "load_video_start");
    }

    public static void a(n nVar, k3.a aVar, c cVar) {
        if (nVar == null || aVar == null || cVar == null) {
            return;
        }
        String a10 = com.bytedance.sdk.openadsdk.utils.l.a();
        int i10 = CacheDirFactory.getICacheDir(nVar.aD()).a(cVar) ? 1 : 2;
        f11007a.put(aVar, new o(SystemClock.elapsedRealtime(), a10, i10, cVar, nVar));
        com.bytedance.sdk.openadsdk.b.b.b.a aVar2 = new com.bytedance.sdk.openadsdk.b.b.b.a(nVar, u.a(nVar), a(nVar, a10, i10, cVar.B()), null);
        aVar2.a(cVar.B() == -1);
        a(aVar2, "play_start");
    }

    public static void a(Context context, k3.a aVar, o.a aVar2, com.bytedance.sdk.openadsdk.b.j jVar) {
        o oVar;
        if (context == null || aVar == null || aVar2 == null || (oVar = f11007a.get(aVar)) == null) {
            return;
        }
        c d10 = oVar.d();
        n e10 = oVar.e();
        if (d10 == null || e10 == null) {
            return;
        }
        if (!aVar2.l()) {
            a(e10, d10, aVar2);
        }
        h hVar = new h();
        hVar.a(aVar2.m() ? 1 : 0);
        hVar.b(CacheDirFactory.getICacheDir(e10.aD()).b(d10));
        hVar.a(SystemClock.elapsedRealtime() - oVar.a());
        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e10, u.a(e10), a(e10, oVar.b(), oVar.c(), d10.B()), hVar);
        aVar3.a(aVar2.l());
        a(aVar3, "feed_play", jVar);
    }

    public static void b(k3.a aVar, o.a aVar2, com.bytedance.sdk.openadsdk.b.j jVar) {
        if (aVar == null || aVar2 == null) {
            return;
        }
        e(aVar, aVar2);
        o oVar = f11007a.get(aVar);
        if (oVar == null) {
            return;
        }
        c d10 = oVar.d();
        n e10 = oVar.e();
        if (d10 == null || e10 == null) {
            return;
        }
        long a10 = aVar2.a();
        long c10 = aVar2.c();
        if (c10 <= 0) {
            return;
        }
        f fVar = new f();
        fVar.b(aVar2.b());
        fVar.a(c10);
        fVar.a(aVar2.j());
        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e10, u.a(e10), a(e10, oVar.b(), oVar.c(), d10.B()), fVar);
        aVar3.a(aVar2.l());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", a10);
            jSONObject.put("percent", aVar2.h());
            a(aVar3, "feed_over", jSONObject, jVar);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        f11007a.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long c(c cVar) {
        if (cVar == null) {
            return 0L;
        }
        b H = cVar.y() ? cVar.H() : cVar.G();
        if (H != null) {
            return Double.valueOf(H.r() * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(c cVar) {
        return new File(cVar.a(), cVar.A()).getAbsolutePath();
    }

    public static void a(k3.a aVar, o.a aVar2) {
        o oVar;
        if (aVar == null || aVar2 == null || (oVar = f11007a.get(aVar)) == null) {
            return;
        }
        c d10 = oVar.d();
        n e10 = oVar.e();
        if (d10 == null || e10 == null) {
            return;
        }
        long a10 = aVar2.a();
        long c10 = aVar2.c();
        if (c10 <= 0 || a10 <= 0) {
            return;
        }
        g gVar = new g();
        gVar.a(aVar2.b());
        gVar.b(c10);
        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e10, u.a(e10), a(e10, oVar.b(), oVar.c(), d10.B()), gVar);
        aVar3.a(aVar2.l());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", a10);
            jSONObject.put("percent", aVar2.h());
            a(aVar3, "feed_pause", jSONObject);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public static void a(k3.a aVar, o.a aVar2, com.bytedance.sdk.openadsdk.b.j jVar) {
        o oVar;
        if (aVar == null || aVar2 == null || (oVar = f11007a.get(aVar)) == null) {
            return;
        }
        c d10 = oVar.d();
        n e10 = oVar.e();
        if (d10 == null || e10 == null) {
            return;
        }
        long a10 = aVar2.a();
        long c10 = aVar2.c();
        d dVar = new d();
        dVar.b(aVar2.b());
        dVar.a(c10);
        dVar.a(aVar2.i());
        dVar.b(aVar2.j());
        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e10, u.a(e10), a(e10, oVar.b(), oVar.c(), d10.B()), dVar);
        aVar3.a(aVar2.l());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", a10);
            jSONObject.put("percent", aVar2.h());
            a(aVar3, "feed_break", jSONObject, jVar);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        f11007a.remove(aVar);
    }

    private static void a(com.bytedance.sdk.openadsdk.b.b.b.a aVar, String str) {
        a(aVar, str, (JSONObject) null, (com.bytedance.sdk.openadsdk.b.j) null);
    }

    private static void a(com.bytedance.sdk.openadsdk.b.b.b.a aVar, String str, JSONObject jSONObject) {
        a(aVar, str, jSONObject, (com.bytedance.sdk.openadsdk.b.j) null);
    }

    private static void a(com.bytedance.sdk.openadsdk.b.b.b.a aVar, String str, com.bytedance.sdk.openadsdk.b.j jVar) {
        a(aVar, str, (JSONObject) null, jVar);
    }

    private static void a(final com.bytedance.sdk.openadsdk.b.b.b.a aVar, String str, JSONObject jSONObject, final com.bytedance.sdk.openadsdk.b.j jVar) {
        if (aVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject;
        if (aVar.e() && !TextUtils.isEmpty(aVar.b())) {
            String b10 = aVar.b();
            b10.hashCode();
            char c10 = 65535;
            switch (b10.hashCode()) {
                case -891990144:
                    if (b10.equals("stream")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -712491894:
                    if (b10.equals("embeded_ad")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1912999166:
                    if (b10.equals("draw_ad")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                    str = "customer_" + str;
                    break;
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.b.e.a(aVar.a(), aVar.b(), str2, jSONObject2, jVar, new com.bytedance.sdk.openadsdk.b.a.a() { // from class: com.bytedance.sdk.openadsdk.b.b.a.a.1
            @Override // com.bytedance.sdk.openadsdk.b.a.a
            public void a(JSONObject jSONObject3) throws JSONException {
                com.bytedance.sdk.openadsdk.b.j jVar2;
                JSONObject c11 = com.bytedance.sdk.openadsdk.b.b.b.a.this.c();
                if (com.bytedance.sdk.openadsdk.b.b.b.a.this.d() != null) {
                    com.bytedance.sdk.openadsdk.b.b.b.a.this.d().a(c11);
                }
                if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (jVar2 = jVar) != null) {
                    jVar2.a(c11);
                }
                jSONObject3.put("ad_extra_data", c11.toString());
            }
        });
    }

    private static void a(final n nVar, final c cVar, final o.a aVar) {
        com.bytedance.sdk.openadsdk.h.b.a().a(new com.bytedance.sdk.openadsdk.h.a() { // from class: com.bytedance.sdk.openadsdk.b.b.a.a.2
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", a.c(c.this));
                jSONObject.put("player_duration", aVar.c());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put(ImagesContract.URL, c.this.z());
                jSONObject.put("path", a.d(c.this));
                jSONObject.put("player_type", c.this.B());
                return com.bytedance.sdk.openadsdk.h.a.b.b().a("pangle_video_play_state").a(u.e(nVar)).b(jSONObject.toString());
            }
        });
    }
}
