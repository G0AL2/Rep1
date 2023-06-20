package com.fyber.inneractive.sdk.bidder;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.cache.session.g;
import com.fyber.inneractive.sdk.cache.session.h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.n;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class a implements d, d0.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f16741h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final TokenParametersOuterClass$TokenParameters.b f16742a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.b f16743b;

    /* renamed from: c  reason: collision with root package name */
    public final c f16744c;

    /* renamed from: d  reason: collision with root package name */
    public e f16745d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f16746e = new C0225a(this);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<String> f16747f = new AtomicReference<>(null);

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f16748g = new AtomicBoolean(false);

    /* renamed from: com.fyber.inneractive.sdk.bidder.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0225a extends HashMap<String, String> {
        public C0225a(a aVar) {
            put("max", "token_size_limit_max");
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a();
        }
    }

    public a() {
        com.fyber.inneractive.sdk.serverapi.b bVar = new com.fyber.inneractive.sdk.serverapi.b(s.b());
        this.f16743b = bVar;
        c cVar = new c(bVar);
        this.f16744c = cVar;
        this.f16742a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager.c().a(this);
        c();
        if (IAConfigManager.b().a().a("bidding_token_wait_for_ua", true)) {
            IAConfigManager.d().d();
            cVar.a(IAConfigManager.d().a());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0547, code lost:
        if (r8.equals("3") == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.a.a():void");
    }

    public void b() {
        n.a(new b());
    }

    public final void c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) l.f20301a.getSystemService("connectivity");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            connectivityManager.registerDefaultNetworkCallback(new com.fyber.inneractive.sdk.bidder.b(this));
        }
        e eVar = new e(this);
        this.f16745d = eVar;
        l.f20301a.registerReceiver(eVar, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        l.f20301a.registerReceiver(eVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (i10 >= 23) {
            l.f20301a.registerReceiver(eVar, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        }
        if (i10 >= 21) {
            l.f20301a.registerReceiver(eVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        }
        if (i10 >= 17) {
            l.f20301a.registerReceiver(eVar, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        }
        if (l.b("android.permission.BLUETOOTH")) {
            l.f20301a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            l.f20301a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    public final void a(String str, UnitDisplayType unitDisplayType, TokenParametersOuterClass$TokenParameters.k kVar) {
        ArrayList arrayList;
        TokenParametersOuterClass$TokenParameters.j jVar;
        com.fyber.inneractive.sdk.cache.session.d dVar = IAConfigManager.J.f16888x.f16930a;
        if (dVar != null) {
            h hVar = dVar.f16839b.get(com.fyber.inneractive.sdk.cache.session.enums.b.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (hVar != null) {
                ArrayList arrayList2 = new ArrayList(hVar);
                Collections.sort(arrayList2, new g(hVar));
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            int a10 = dVar.a();
            if (a10 > 0 && arrayList != null && arrayList.size() >= a10) {
                if (str.equals(DownloadResource.TYPE_VIDEO)) {
                    jVar = TokenParametersOuterClass$TokenParameters.j.VIDEO;
                } else if (!str.equals("display")) {
                    jVar = TokenParametersOuterClass$TokenParameters.j.UNITCONTENTTYPEUNKNOWN;
                } else {
                    jVar = TokenParametersOuterClass$TokenParameters.j.DISPLAY;
                }
                TokenParametersOuterClass$TokenParameters.UserSession.a newBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                newBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.f19803b).setSubType(jVar);
                int i10 = 0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.cache.session.e eVar = (com.fyber.inneractive.sdk.cache.session.e) it.next();
                    TokenParametersOuterClass$TokenParameters.SessionData.a newBuilder2 = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i11 = eVar.f16844b;
                    newBuilder2.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.f19803b).setClicks(i11);
                    int i12 = eVar.f16843a;
                    newBuilder2.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.f19803b).setImpressions(i12);
                    if (str.equals(DownloadResource.TYPE_VIDEO) || kVar.equals(TokenParametersOuterClass$TokenParameters.k.REWARDED)) {
                        int i13 = eVar.f16845c;
                        newBuilder2.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.f19803b).setCompletions(i13);
                    }
                    newBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.f19803b).addSessionDataItems(newBuilder2.a());
                    i10++;
                    if (i10 >= a10) {
                        break;
                    }
                }
                newBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.f19803b).setType(kVar);
                userSession = newBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            TokenParametersOuterClass$TokenParameters.b bVar = this.f16742a;
            bVar.c();
            ((TokenParametersOuterClass$TokenParameters) bVar.f19803b).addUserSessions(userSession);
        }
    }
}
