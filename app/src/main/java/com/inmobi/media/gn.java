package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: EventProcessor.java */
/* loaded from: classes3.dex */
public class gn implements gp {

    /* renamed from: f  reason: collision with root package name */
    private static final String f25563f = "gn";

    /* renamed from: e  reason: collision with root package name */
    public ScheduledExecutorService f25568e;

    /* renamed from: g  reason: collision with root package name */
    private gl f25569g;

    /* renamed from: h  reason: collision with root package name */
    private gq f25570h;

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f25564a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f25565b = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public List<String> f25567d = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, gk> f25566c = new HashMap<>(1);

    public gn(gl glVar, gq gqVar, gk gkVar) {
        this.f25569g = glVar;
        this.f25570h = gqVar;
        a(gkVar);
    }

    private gk b(String str) {
        return this.f25566c.get(str);
    }

    public final void a(String str, boolean z10) {
        if (this.f25565b.get()) {
            return;
        }
        a(str, b(str).f25553f, z10);
    }

    private void a(final String str, long j10, final boolean z10) {
        if (this.f25567d.contains(str)) {
            return;
        }
        this.f25567d.add(str);
        if (this.f25568e == null) {
            this.f25568e = Executors.newSingleThreadScheduledExecutor(new ht(f25563f));
        }
        this.f25568e.scheduleAtFixedRate(new Runnable() { // from class: com.inmobi.media.gn.1

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ir f25572b = null;

            @Override // java.lang.Runnable
            public final void run() {
                gn.a(gn.this, str, this.f25572b, z10);
            }
        }, a(str), j10, TimeUnit.SECONDS);
    }

    private long a(String str) {
        gk b10 = b(str);
        long c10 = this.f25569g.c();
        if (c10 == -1) {
            this.f25569g.c(System.currentTimeMillis());
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(c10) + b10.f25553f;
        if (seconds - timeUnit.toSeconds(System.currentTimeMillis()) > 0) {
            return seconds - timeUnit.toSeconds(System.currentTimeMillis());
        }
        return 0L;
    }

    public final void a(gk gkVar) {
        String str = gkVar.f25549b;
        if (str == null) {
            str = "default";
        }
        this.f25566c.put(str, gkVar);
    }

    @Override // com.inmobi.media.gp
    public final void a(gm gmVar) {
        gmVar.f25560a.get(0).intValue();
        this.f25569g.a(gmVar.f25560a);
        this.f25569g.c(System.currentTimeMillis());
        this.f25564a.set(false);
    }

    @Override // com.inmobi.media.gp
    public final void a(gm gmVar, boolean z10) {
        gmVar.f25560a.get(0).intValue();
        if (gmVar.f25562c && z10) {
            this.f25569g.a(gmVar.f25560a);
        }
        this.f25569g.c(System.currentTimeMillis());
        this.f25564a.set(false);
    }

    static /* synthetic */ void a(gn gnVar, String str, ir irVar, boolean z10) {
        int i10;
        long j10;
        gm c10;
        if (gnVar.f25565b.get() || gnVar.f25564a.get()) {
            return;
        }
        gnVar.f25569g.b(gnVar.b(str).f25548a);
        int a10 = gnVar.f25569g.a();
        int a11 = ib.a();
        if (a11 != 1) {
            i10 = gnVar.b(str).f25556i;
        } else {
            i10 = gnVar.b(str).f25554g;
        }
        if (a11 != 1) {
            j10 = gnVar.b(str).f25557j;
        } else {
            j10 = gnVar.b(str).f25555h;
        }
        long j11 = j10;
        if ((i10 <= a10 || gnVar.f25569g.a(gnVar.b(str).f25550c) || gnVar.f25569g.a(gnVar.b(str).f25553f, gnVar.b(str).f25550c)) && (c10 = gnVar.f25570h.c()) != null) {
            gnVar.f25564a.set(true);
            gk b10 = gnVar.b(str);
            go a12 = go.a();
            String str2 = b10.f25552e;
            int i11 = b10.f25551d + 1;
            a12.a(c10, str2, i11, i11, j11, irVar, gnVar, z10);
        }
    }
}
