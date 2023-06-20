package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.r;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ob.e;

/* compiled from: RemoteConfigComponent.java */
@KeepForSdk
/* loaded from: classes3.dex */
public class d {

    /* renamed from: j */
    private static final Clock f23612j = DefaultClock.getInstance();

    /* renamed from: k */
    private static final Random f23613k = new Random();

    /* renamed from: a */
    private final Map<String, a> f23614a;

    /* renamed from: b */
    private final Context f23615b;

    /* renamed from: c */
    private final ExecutorService f23616c;

    /* renamed from: d */
    private final e f23617d;

    /* renamed from: e */
    private final tc.d f23618e;

    /* renamed from: f */
    private final pb.c f23619f;

    /* renamed from: g */
    private final sc.b<rb.a> f23620g;

    /* renamed from: h */
    private final String f23621h;

    /* renamed from: i */
    private Map<String, String> f23622i;

    public d(Context context, e eVar, tc.d dVar, pb.c cVar, sc.b<rb.a> bVar) {
        this(context, Executors.newCachedThreadPool(), eVar, dVar, cVar, bVar, true);
    }

    public static /* synthetic */ rb.a a() {
        return m();
    }

    private com.google.firebase.remoteconfig.internal.d d(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.d.h(Executors.newCachedThreadPool(), n.c(this.f23615b, String.format("%s_%s_%s_%s.json", "frc", this.f23621h, str, str2)));
    }

    private l h(com.google.firebase.remoteconfig.internal.d dVar, com.google.firebase.remoteconfig.internal.d dVar2) {
        return new l(this.f23616c, dVar, dVar2);
    }

    static m i(Context context, String str, String str2) {
        return new m(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static r j(e eVar, String str, sc.b<rb.a> bVar) {
        if (l(eVar) && str.equals("firebase")) {
            return new r(bVar);
        }
        return null;
    }

    private static boolean k(e eVar, String str) {
        return str.equals("firebase") && l(eVar);
    }

    private static boolean l(e eVar) {
        return eVar.p().equals("[DEFAULT]");
    }

    public static /* synthetic */ rb.a m() {
        return null;
    }

    @KeepForSdk
    public synchronized a b(String str) {
        com.google.firebase.remoteconfig.internal.d d10;
        com.google.firebase.remoteconfig.internal.d d11;
        com.google.firebase.remoteconfig.internal.d d12;
        m i10;
        l h10;
        d10 = d(str, "fetch");
        d11 = d(str, "activate");
        d12 = d(str, "defaults");
        i10 = i(this.f23615b, this.f23621h, str);
        h10 = h(d11, d12);
        final r j10 = j(this.f23617d, str, this.f23620g);
        if (j10 != null) {
            h10.b(new BiConsumer() { // from class: dd.q
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    com.google.firebase.remoteconfig.internal.r.this.a((String) obj, (com.google.firebase.remoteconfig.internal.e) obj2);
                }
            });
        }
        return c(this.f23617d, str, this.f23618e, this.f23619f, this.f23616c, d10, d11, d12, f(str, d10, i10), h10, i10);
    }

    synchronized a c(e eVar, String str, tc.d dVar, pb.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.d dVar2, com.google.firebase.remoteconfig.internal.d dVar3, com.google.firebase.remoteconfig.internal.d dVar4, j jVar, l lVar, m mVar) {
        if (!this.f23614a.containsKey(str)) {
            a aVar = new a(this.f23615b, eVar, dVar, k(eVar, str) ? cVar : null, executor, dVar2, dVar3, dVar4, jVar, lVar, mVar);
            aVar.I();
            this.f23614a.put(str, aVar);
        }
        return this.f23614a.get(str);
    }

    public a e() {
        return b("firebase");
    }

    synchronized j f(String str, com.google.firebase.remoteconfig.internal.d dVar, m mVar) {
        return new j(this.f23618e, l(this.f23617d) ? this.f23620g : new sc.b() { // from class: dd.r
            @Override // sc.b
            public final Object get() {
                return com.google.firebase.remoteconfig.d.a();
            }
        }, this.f23616c, f23612j, f23613k, dVar, g(this.f23617d.q().b(), str, mVar), mVar, this.f23622i);
    }

    ConfigFetchHttpClient g(String str, String str2, m mVar) {
        return new ConfigFetchHttpClient(this.f23615b, this.f23617d.q().c(), str, str2, mVar.c(), mVar.c());
    }

    protected d(Context context, ExecutorService executorService, e eVar, tc.d dVar, pb.c cVar, sc.b<rb.a> bVar, boolean z10) {
        this.f23614a = new HashMap();
        this.f23622i = new HashMap();
        this.f23615b = context;
        this.f23616c = executorService;
        this.f23617d = eVar;
        this.f23618e = dVar;
        this.f23619f = cVar;
        this.f23620g = bVar;
        this.f23621h = eVar.q().c();
        if (z10) {
            Tasks.call(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return d.this.e();
                }
            });
        }
    }
}
