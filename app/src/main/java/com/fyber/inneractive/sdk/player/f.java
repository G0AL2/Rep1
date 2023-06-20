package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.player.a;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k;
import com.google.android.gms.common.internal.ImagesContract;
import com.iab.omid.library.fyber.adsession.media.Position;
import com.iab.omid.library.fyber.adsession.media.VastProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends c implements a.InterfaceC0239a {
    public static final HashMap<String, b> D = new a();
    public z A;
    public com.fyber.inneractive.sdk.flow.g B;
    public boolean C;

    /* renamed from: x  reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.b f19689x;

    /* renamed from: y  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.a f19690y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f19691z;

    /* loaded from: classes.dex */
    public class a extends HashMap<String, b> {

        /* renamed from: com.fyber.inneractive.sdk.player.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0262a implements b {
            public C0262a(a aVar) {
            }

            @Override // com.fyber.inneractive.sdk.player.f.b
            public String a(com.fyber.inneractive.sdk.player.controller.g gVar, VideoClickOrigin videoClickOrigin) {
                return videoClickOrigin.name().toLowerCase();
            }
        }

        /* loaded from: classes.dex */
        public class b implements b {
            public b(a aVar) {
            }

            @Override // com.fyber.inneractive.sdk.player.f.b
            public String a(com.fyber.inneractive.sdk.player.controller.g gVar, VideoClickOrigin videoClickOrigin) {
                int c10;
                if (gVar == null || (c10 = gVar.c()) <= 0) {
                    return "00:00:00.000";
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j10 = c10;
                long hours = timeUnit.toHours(j10);
                TimeUnit timeUnit2 = TimeUnit.HOURS;
                long minutes = timeUnit.toMinutes(j10 - timeUnit2.toMillis(hours));
                TimeUnit timeUnit3 = TimeUnit.MINUTES;
                long seconds = timeUnit.toSeconds((j10 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
                return String.format("%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(timeUnit.toMillis(((j10 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))));
            }
        }

        public a() {
            put("[CLICKAREA]", new C0262a(this));
            put("[ADPLAYHEAD]", new b(this));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        String a(com.fyber.inneractive.sdk.player.controller.g gVar, VideoClickOrigin videoClickOrigin);
    }

    public f(Context context, com.fyber.inneractive.sdk.response.g gVar, z zVar, InneractiveAdRequest inneractiveAdRequest, y yVar, com.fyber.inneractive.sdk.measurement.a aVar) {
        super(context, zVar == null ? null : ((com.fyber.inneractive.sdk.config.y) zVar).b().c(), yVar != null ? yVar.b() : null);
        this.f19690y = com.fyber.inneractive.sdk.player.enums.a.Uninitialized;
        this.C = false;
        if (gVar != null && gVar.f() != null) {
            this.f17730h = aVar;
            this.f17728f = yVar;
            this.f19689x = gVar.f();
            this.B = new com.fyber.inneractive.sdk.flow.g(context, gVar, inneractiveAdRequest, this.f17728f.b());
            this.f17729g = inneractiveAdRequest;
            if (IAlog.f20222a <= 3) {
                IAlog.d("IAVastMediaPlayerFlowManager:ctor - got media files: ", new Object[0]);
                for (int i10 = 0; i10 < this.f19689x.a(); i10++) {
                    m mVar = (m) ((ArrayList) this.f19689x.b()).get(i10);
                    if (mVar != null) {
                        IAlog.a("IAVastMediaPlayerFlowManager(%d): %s", Integer.valueOf(i10), mVar.a());
                    }
                }
            }
            if (zVar != null) {
                a(zVar);
                com.fyber.inneractive.sdk.config.y yVar2 = (com.fyber.inneractive.sdk.config.y) zVar;
                if (yVar2.a() != null) {
                    b(((a0) yVar2.a()).b().booleanValue());
                }
            }
            a(gVar.b(), inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.c(), gVar.a(), zVar);
            if (yVar.b() != null) {
                this.f17743u = ((j) yVar.b().a(j.class)).a(gVar.b());
                return;
            } else {
                this.f17743u = IAConfigManager.b().a().a(gVar.b() == UnitDisplayType.INTERSTITIAL ? "prebuffer_interstitial" : "prebuffer_rewarded", 10, 0);
                return;
            }
        }
        throw new IllegalArgumentException("IAVastMediaPlayerFlowManager ctor - vastData can't be null");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        boolean z10;
        String str;
        int i10;
        T t10;
        VastProperties createVastPropertiesForNonSkippableMedia;
        int i11 = 0;
        IAlog.a("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar);
        g gVar = this.f17732j;
        if (gVar != null && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            gVar.a(bVar);
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared && gVar != null) {
            gVar.f19695d = true;
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 2) {
            IAlog.a("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
            if (this.f17738p) {
                IAlog.a("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
            } else {
                if (this.f17724b.a() && this.f17724b.e() != null) {
                    a(this.f17724b.e());
                }
                this.f17737o = true;
                a();
                if (this.f17731i != null && this.f17728f != null) {
                    int intValue = ((com.fyber.inneractive.sdk.config.y) this.A).f17077f.f16906h.value().intValue();
                    boolean a10 = c.a(this.f17724b.d(), this.A, ((com.fyber.inneractive.sdk.response.g) this.f17728f.f17240b).f20182w);
                    boolean booleanValue = ((com.fyber.inneractive.sdk.config.y) this.A).f17077f.f16899a.booleanValue();
                    com.fyber.inneractive.sdk.measurement.g gVar2 = this.f17731i;
                    if (!a10) {
                        intValue = 0;
                    }
                    if (gVar2.f17340b != null) {
                        try {
                            if (a10) {
                                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(intValue, booleanValue, Position.STANDALONE);
                            } else {
                                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(booleanValue, Position.STANDALONE);
                            }
                            gVar2.f17340b.loaded(createVastPropertiesForNonSkippableMedia);
                        } catch (Throwable th) {
                            gVar2.a(th);
                        }
                    }
                }
                if (this.f17742t != null) {
                    y yVar = this.f17728f;
                    if (yVar == null || yVar.f17240b == 0 || this.f17729g == null) {
                        z10 = false;
                    } else {
                        z10 = c.a(this.f17724b.d(), this.A, ((com.fyber.inneractive.sdk.response.g) this.f17728f.f17240b).f20182w) && this.f17729g.getAllowFullscreen();
                        ((com.fyber.inneractive.sdk.response.g) this.f17728f.f17240b).f20177r.setVideo(new ImpressionData.Video(z10, (int) TimeUnit.MILLISECONDS.toSeconds(this.f17724b.d())));
                    }
                    try {
                        y yVar2 = this.f17728f;
                        com.fyber.inneractive.sdk.response.g gVar3 = yVar2 != null ? (com.fyber.inneractive.sdk.response.g) yVar2.f17240b : null;
                        p pVar = p.EVENT_READY_ON_CLIENT;
                        InneractiveAdRequest inneractiveAdRequest = this.f17729g;
                        y yVar3 = this.f17728f;
                        JSONArray c10 = yVar3 == null ? null : yVar3.f17241c.c();
                        q.a aVar = new q.a(gVar3);
                        aVar.f17683c = pVar;
                        aVar.f17681a = inneractiveAdRequest;
                        aVar.f17684d = c10;
                        if (this.f17744v != null && gVar3 != null) {
                            long currentTimeMillis = System.currentTimeMillis() - gVar3.B;
                            IAlog.a("Video content loader: Vast load took: " + currentTimeMillis + " msec", new Object[0]);
                            y yVar4 = this.f17728f;
                            if (yVar4 == null || (t10 = yVar4.f17240b) == 0 || ((com.fyber.inneractive.sdk.response.g) t10).C == null) {
                                str = "";
                                i10 = 0;
                            } else {
                                i11 = ((com.fyber.inneractive.sdk.response.g) t10).C.f17393h;
                                i10 = ((com.fyber.inneractive.sdk.response.g) t10).C.f17394i;
                                str = ((com.fyber.inneractive.sdk.response.g) t10).C.f17386a;
                            }
                            aVar.f17686f.put(new q.b().a("duration", Integer.valueOf(this.f17724b.d() / 1000)).a(ImagesContract.URL, this.f17744v.f17443g).a("bitrate", this.f17744v.f17441e).a("mime", TextUtils.isEmpty(this.f17744v.f17440d) ? "na" : this.f17744v.f17440d).a("delivery", this.f17744v.f17437a).a("load_time", Long.valueOf(System.currentTimeMillis() - gVar3.B)).a("media_file_index", Integer.valueOf(this.f17741s)).a("player", this.f17724b.f()).a("is_video_skippable", Boolean.valueOf(z10)).a("supported_media_files", Integer.valueOf(i11)).a("total_media_files", Integer.valueOf(i10)).a("vast_version", str).f17696a);
                        }
                        aVar.a((String) null);
                    } catch (Exception unused) {
                    }
                    i iVar = (i) this.f17742t;
                    if (!iVar.f19702g) {
                        iVar.f19702g = true;
                        i.b bVar2 = iVar.f19699d;
                        if (bVar2 != null) {
                            ((com.fyber.inneractive.sdk.flow.i) bVar2).d();
                        }
                    }
                }
            }
            a();
        } else if (ordinal != 3) {
            if (ordinal == 6) {
                this.f17724b.c();
                a();
            } else if (ordinal == 7) {
                a();
            } else if (ordinal == 8) {
                a();
            }
        } else if (this.f17727e == null) {
            k.m();
            a(IAConfigManager.J.f16873i.f17008a * 1000);
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 6) {
            if (ordinal2 != 8) {
                return;
            }
            a(com.fyber.inneractive.sdk.player.enums.a.Completed);
        } else if (this.f19690y.equals(com.fyber.inneractive.sdk.player.enums.a.Completed)) {
            a(com.fyber.inneractive.sdk.player.enums.a.Restarted);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c
    public View c() {
        com.fyber.inneractive.sdk.flow.g gVar = this.B;
        if (gVar == null || !gVar.f17218f) {
            return null;
        }
        return gVar.f17219g;
    }

    @Override // com.fyber.inneractive.sdk.player.c
    public com.fyber.inneractive.sdk.player.controller.c d() {
        com.fyber.inneractive.sdk.flow.g gVar = this.B;
        if (gVar != null) {
            return gVar.f17221i;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void e() {
    }

    @Override // com.fyber.inneractive.sdk.player.c
    public com.fyber.inneractive.sdk.model.vast.c f() {
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f19689x;
        if (bVar != null) {
            return bVar.f17392g;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.c
    public void a(boolean z10) {
        s sVar;
        if (z10) {
            if (this.C) {
                return;
            }
            p pVar = p.VAST_DEFAULT_COMPANION_DISPLAYED;
            InneractiveAdRequest inneractiveAdRequest = this.f17729g;
            y yVar = this.f17728f;
            com.fyber.inneractive.sdk.response.g gVar = yVar != null ? (com.fyber.inneractive.sdk.response.g) yVar.f17240b : null;
            JSONArray c10 = (yVar == null || (sVar = yVar.f17241c) == null) ? null : sVar.c();
            q.a aVar = new q.a(gVar);
            aVar.f17683c = pVar;
            aVar.f17681a = inneractiveAdRequest;
            aVar.f17684d = c10;
            aVar.a((String) null);
            this.C = true;
        } else if (c() == null || this.B.f17222j) {
        } else {
            a(this.f19689x.f17392g, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.q.EVENT_CREATIVE_VIEW);
            com.fyber.inneractive.sdk.flow.g gVar2 = this.B;
            if (!gVar2.f17222j) {
                p pVar2 = p.VAST_COMPANION_DISPLAYED;
                InneractiveAdRequest inneractiveAdRequest2 = gVar2.f17214b;
                com.fyber.inneractive.sdk.response.g gVar3 = gVar2.f17215c;
                s sVar2 = gVar2.f17216d;
                JSONArray c11 = sVar2 == null ? null : sVar2.c();
                q.a aVar2 = new q.a(gVar3);
                aVar2.f17683c = pVar2;
                aVar2.f17681a = inneractiveAdRequest2;
                aVar2.f17684d = c11;
                aVar2.a("companion_data", gVar2.f17217e.f17392g.a());
                aVar2.a((String) null);
            }
            gVar2.f17222j = true;
        }
    }

    public final void a(UnitDisplayType unitDisplayType, boolean z10, int i10, int i11, z zVar) {
        com.fyber.inneractive.sdk.flow.g gVar = this.B;
        gVar.f17224l = unitDisplayType;
        gVar.f17225m = z10;
        gVar.f17226n = i10;
        gVar.f17227o = i11;
        gVar.f17228p = zVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.e
    public void a(int i10) {
        int d10 = this.f17724b.d();
        int ordinal = this.f19690y.ordinal();
        if (ordinal == 0) {
            if (this.f17724b.f17891e != com.fyber.inneractive.sdk.player.enums.b.Buffering) {
                a(com.fyber.inneractive.sdk.player.enums.a.Started);
                com.fyber.inneractive.sdk.measurement.g gVar = this.f17731i;
                if (gVar != null) {
                    if (gVar.f17340b != null && !gVar.f17343e) {
                        IAlog.a("%s impression", "OMVideo");
                        gVar.f17343e = true;
                        try {
                            gVar.f17340b.impressionOccurred();
                        } catch (Throwable th) {
                            gVar.a(th);
                        }
                    }
                    com.fyber.inneractive.sdk.measurement.g gVar2 = this.f17731i;
                    long d11 = this.f17724b.d();
                    float f10 = this.f17724b.i() ? 0.0f : 1.0f;
                    if (gVar2.f17341c == null || gVar2.f17342d) {
                        return;
                    }
                    gVar2.f17342d = true;
                    IAlog.a("%s start", "OMVideo");
                    try {
                        gVar2.f17341c.start((float) d11, f10);
                    } catch (Throwable th2) {
                        gVar2.a(th2);
                    }
                }
            }
        } else if (ordinal == 1) {
            if (i10 > d10 / 4) {
                a(com.fyber.inneractive.sdk.player.enums.a.FirstQuarter);
                com.fyber.inneractive.sdk.measurement.g gVar3 = this.f17731i;
                if (gVar3 == null || gVar3.f17341c == null) {
                    return;
                }
                IAlog.a("%s firstQuartile", "OMVideo");
                try {
                    gVar3.f17341c.firstQuartile();
                } catch (Throwable th3) {
                    gVar3.a(th3);
                }
            }
        } else if (ordinal != 3) {
            if (ordinal == 4 && i10 > (d10 / 4) * 3) {
                a(com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter);
                com.fyber.inneractive.sdk.measurement.g gVar4 = this.f17731i;
                if (gVar4 == null || gVar4.f17341c == null) {
                    return;
                }
                IAlog.a("%s thirdQuartile", "OMVideo");
                try {
                    gVar4.f17341c.thirdQuartile();
                } catch (Throwable th4) {
                    gVar4.a(th4);
                }
            }
        } else if (i10 > d10 / 2) {
            a(com.fyber.inneractive.sdk.player.enums.a.MidPoint);
            com.fyber.inneractive.sdk.measurement.g gVar5 = this.f17731i;
            if (gVar5 == null || gVar5.f17341c == null) {
                return;
            }
            IAlog.a("%s midpoint", "OMVideo");
            try {
                gVar5.f17341c.midpoint();
            } catch (Throwable th5) {
                gVar5.a(th5);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c
    public void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        a(this.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.EVENT_ERROR);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (this.f17744v != null && inneractiveVideoError.getPlayerError() != InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES) {
                jSONObject.put(ImagesContract.URL, this.f17744v.f17443g);
                jSONObject.put("bitrate", this.f17744v.f17441e);
                jSONObject.put("mime", this.f17744v.f17440d);
                jSONObject.put("delivery", this.f17744v.f17437a);
            }
            com.fyber.inneractive.sdk.player.controller.g gVar = this.f17724b;
            jSONObject.put("player", gVar != null ? gVar.f() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put("message", inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.a("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
        IAlog.e("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        h hVar = this.f17742t;
        if (hVar != null) {
            try {
                ((i) hVar).a(inneractiveVideoError, null, jSONObject, this.f17740r);
            } catch (Exception e10) {
                if (IAlog.f20222a <= 3) {
                    e10.printStackTrace();
                }
            }
        }
        com.fyber.inneractive.sdk.util.q qVar = this.f17735m;
        if (qVar != null) {
            qVar.cancel(true);
            qVar.f20319b = null;
            this.f17736n = null;
        }
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.c
    public void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, com.fyber.inneractive.sdk.model.vast.q... qVarArr) {
        if (qVarArr.length == 0) {
            IAlog.e("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
        } else if (iVar == null) {
            IAlog.e("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            for (com.fyber.inneractive.sdk.model.vast.q qVar : qVarArr) {
                String str = qVar.f17476a;
                IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
                List<String> a10 = iVar.a(qVar);
                if (a10 != null && a10.size() != 0) {
                    arrayList.addAll(a10);
                    IAlog.a("found %d events for type: %s", Integer.valueOf(a10.size()), str);
                    a(a10, qVar);
                } else {
                    IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", str);
                }
                if (qVar == com.fyber.inneractive.sdk.model.vast.q.EVENT_CLICK) {
                    for (Map.Entry<String, b> entry : D.entrySet()) {
                        String key = entry.getKey();
                        String a11 = entry.getValue().a(this.f17724b, videoClickOrigin);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            String str2 = (String) arrayList.get(i10);
                            if (str2.contains(key)) {
                                arrayList.set(i10, str2.replace(key, a11));
                            }
                        }
                    }
                }
            }
            c.a(arrayList);
        }
    }

    public static void a(com.fyber.inneractive.sdk.response.i iVar, com.fyber.inneractive.sdk.model.vast.q... qVarArr) {
        ArrayList arrayList = new ArrayList();
        for (com.fyber.inneractive.sdk.model.vast.q qVar : qVarArr) {
            String str = qVar.f17476a;
            IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
            List<String> a10 = ((com.fyber.inneractive.sdk.measurement.h) iVar).a(qVar);
            if (a10 != null && a10.size() != 0) {
                arrayList.addAll(a10);
                IAlog.a("found %d events for type: %s", Integer.valueOf(a10.size()), str);
                a(a10, qVar);
            } else {
                IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", str);
            }
        }
        c.a(arrayList);
    }

    public static void a(List<String> list, com.fyber.inneractive.sdk.model.vast.q qVar) {
        for (String str : list) {
            IAlog.a("   event url: %s", str);
            if (!TextUtils.isEmpty(str)) {
                int i10 = IAlog.f20222a;
                IAlog.a(1, null, "%s %s %s", "VAST_EVENT", qVar.f17476a, str);
                IAlog.a(1, null, "Tracking URLs array: %s", "VPAID", str);
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.a aVar) {
        if (this.f19690y == aVar) {
            return;
        }
        if (aVar == com.fyber.inneractive.sdk.player.enums.a.Started) {
            this.f19691z = false;
            a(this.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.EVENT_IMPRESSION, com.fyber.inneractive.sdk.model.vast.q.EVENT_START);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.FirstQuarter) {
            a(this.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.EVENT_FIRSTQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.MidPoint) {
            a(this.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.EVENT_MID);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter) {
            a(this.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.EVENT_THIRDQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Completed && !this.f19691z) {
            this.f19691z = true;
            a(this.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.EVENT_COMPLETE);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Restarted) {
            a(this.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.EVENT_REWIND);
        }
        this.f19690y = aVar;
    }

    public void a(z zVar) {
        this.A = zVar;
    }
}
