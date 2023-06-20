package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.network.h0;
import com.fyber.inneractive.sdk.network.m0;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.q;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c implements g.f, g.e {

    /* renamed from: a  reason: collision with root package name */
    public Context f17723a;

    /* renamed from: b  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.g f17724b;

    /* renamed from: c  reason: collision with root package name */
    public String f17725c;

    /* renamed from: d  reason: collision with root package name */
    public final s f17726d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f17727e;

    /* renamed from: f  reason: collision with root package name */
    public y f17728f;

    /* renamed from: g  reason: collision with root package name */
    public InneractiveAdRequest f17729g;

    /* renamed from: h  reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.a f17730h;

    /* renamed from: i  reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.g f17731i;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f17734l;

    /* renamed from: m  reason: collision with root package name */
    public q f17735m;

    /* renamed from: n  reason: collision with root package name */
    public q.a f17736n;

    /* renamed from: t  reason: collision with root package name */
    public h f17742t;

    /* renamed from: u  reason: collision with root package name */
    public int f17743u;

    /* renamed from: v  reason: collision with root package name */
    public m f17744v;

    /* renamed from: j  reason: collision with root package name */
    public g f17732j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17733k = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f17737o = false;

    /* renamed from: p  reason: collision with root package name */
    public volatile boolean f17738p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f17739q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f17740r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f17741s = 0;

    /* renamed from: w  reason: collision with root package name */
    public g.d f17745w = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            IAlog.a("IAMediaPlayerFlowManager: onBufferTimeout reached: mBufferTimeoutRunnable = %s isDestroyed = %s", cVar.f17727e, Boolean.valueOf(cVar.f17738p));
            if (cVar.f17727e == null || cVar.f17738p) {
                return;
            }
            cVar.f17740r = true;
            int c10 = cVar.f17724b.c();
            int d10 = cVar.f17724b.d();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", d10);
                jSONObject.put("position", c10);
            } catch (JSONException unused) {
            }
            cVar.f17727e = null;
            if (!cVar.f17737o) {
                com.fyber.inneractive.sdk.player.controller.g gVar = cVar.f17724b;
                if (gVar != null) {
                    gVar.b();
                    cVar.f17724b = null;
                    cVar.b();
                }
                cVar.a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT), null);
                return;
            }
            cVar.a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT), jSONObject);
        }
    }

    /* loaded from: classes.dex */
    public class b implements g.d {
        public b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0240c {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public class d extends Exception {
    }

    public c(Context context, Set<Vendor> set, s sVar) {
        this.f17723a = context;
        this.f17726d = sVar;
        b();
    }

    public void a(Bitmap bitmap) {
        IAlog.a("IAMediaPlayerFlowManager: saving snapshot %s", bitmap);
        this.f17734l = null;
        this.f17734l = bitmap;
    }

    public abstract void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    public abstract void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, com.fyber.inneractive.sdk.model.vast.q... qVarArr);

    public abstract void a(boolean z10);

    public final void b() {
        boolean a10;
        com.fyber.inneractive.sdk.player.controller.g gVar;
        Context context = this.f17723a;
        s sVar = this.f17726d;
        if (sVar != null) {
            try {
                a10 = ((j) sVar.a(j.class)).a("use_fmp_cache_mechanism", false);
            } catch (Throwable th) {
                if (IAlog.f20222a <= 3) {
                    IAlog.a("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
                gVar = null;
            }
        } else {
            a10 = false;
        }
        gVar = new com.fyber.inneractive.sdk.player.controller.d(context, a10, sVar);
        if (gVar == null) {
            gVar = new com.fyber.inneractive.sdk.player.controller.a(context);
        }
        this.f17724b = gVar;
        List<g.f> list = gVar.f17888b;
        if (list != null && !list.contains(this)) {
            gVar.f17888b.add(this);
        }
        com.fyber.inneractive.sdk.player.controller.g gVar2 = this.f17724b;
        List<g.e> list2 = gVar2.f17889c;
        if (list2 != null && !list2.contains(this)) {
            gVar2.f17889c.add(this);
        }
        this.f17724b.f17892f = this.f17745w;
    }

    public abstract View c();

    public abstract com.fyber.inneractive.sdk.player.controller.c d();

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void e(boolean z10) {
        try {
            y yVar = this.f17728f;
            com.fyber.inneractive.sdk.response.g gVar = yVar != null ? (com.fyber.inneractive.sdk.response.g) yVar.f17240b : null;
            p pVar = p.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f17729g;
            y yVar2 = this.f17728f;
            JSONArray c10 = yVar2 == null ? null : yVar2.f17241c.c();
            q.a aVar = new q.a(gVar);
            aVar.f17683c = pVar;
            aVar.f17681a = inneractiveAdRequest;
            aVar.f17684d = c10;
            if (this.f17744v != null && gVar != null) {
                aVar.f17686f.put(new q.b().a("waudio", String.valueOf(z10)).a(ImagesContract.URL, this.f17744v.f17443g).a("bitrate", this.f17744v.f17441e).a("mime", TextUtils.isEmpty(this.f17744v.f17440d) ? "na" : this.f17744v.f17440d).a("delivery", this.f17744v.f17437a).a("media_file_index", Integer.valueOf(this.f17741s)).a("player", this.f17724b.f()).f17696a);
            }
            aVar.a((String) null);
        } catch (Exception unused) {
        }
    }

    public abstract com.fyber.inneractive.sdk.model.vast.c f();

    public void g() {
        com.fyber.inneractive.sdk.player.controller.g gVar = this.f17724b;
        if (gVar != null) {
            com.fyber.inneractive.sdk.player.enums.b bVar = gVar.f17891e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                gVar.l();
            } else {
                gVar.a(1, true);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(Exception exc) {
        Object[] objArr = new Object[1];
        objArr[0] = exc != null ? exc.getMessage() : "no exception";
        IAlog.a("IMediaPlayerFlowManager: onPlayerError called with: %s", objArr);
        InneractiveVideoError inneractiveVideoError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, exc);
        if (exc instanceof d) {
            ((d) exc).getClass();
        }
        a(inneractiveVideoError, null);
        if (this.f17737o) {
            IAlog.a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, exc), null);
        }
    }

    public static void a(List<String> list) {
        for (String str : list) {
            h0 h0Var = new h0(new com.fyber.inneractive.sdk.player.b(str, System.currentTimeMillis()), str);
            IAConfigManager.J.f16884t.f17705a.offer(h0Var);
            h0Var.f17554f = m0.QUEUED;
        }
    }

    public void b(boolean z10) {
        this.f17733k = z10;
    }

    public void a() {
        Runnable runnable = this.f17727e;
        if (runnable != null) {
            n.f20310b.removeCallbacks(runnable);
            this.f17727e = null;
            IAlog.a("IMediaPlayerFlowManager:: cancelBufferTimeout - running timeout runnable cancelled", new Object[0]);
        }
    }

    public void a(long j10) {
        a();
        a aVar = new a();
        this.f17727e = aVar;
        n.f20310b.postDelayed(aVar, j10);
        IAlog.a("IMediaPlayerFlowManager:: startBufferTimeout called with %d m/sec", Long.valueOf(j10));
    }

    public static int a(c cVar) {
        T t10;
        y yVar = cVar.f17728f;
        if (yVar == null || (t10 = yVar.f17240b) == 0) {
            return -1;
        }
        return ((com.fyber.inneractive.sdk.response.g) t10).f20182w;
    }

    public static boolean a(int i10, z zVar, int i11) {
        a0 a0Var;
        if (i11 == 1) {
            return true;
        }
        return (i10 <= 15999 || (a0Var = ((com.fyber.inneractive.sdk.config.y) zVar).f17077f) == null || a0Var.f16906h == Skip.DEFAULT || a0Var.f16908j == UnitDisplayType.REWARDED) ? false : true;
    }
}
