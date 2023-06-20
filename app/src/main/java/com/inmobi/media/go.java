package com.inmobi.media;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: EventSubmitter.java */
/* loaded from: classes3.dex */
public class go {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25575a = "go";

    /* renamed from: b  reason: collision with root package name */
    private static ScheduledExecutorService f25576b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventSubmitter.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final go f25587a = new go((byte) 0);
    }

    /* synthetic */ go(byte b10) {
        this();
    }

    private go() {
        f25576b = Executors.newSingleThreadScheduledExecutor();
    }

    public static go a() {
        return a.f25587a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final gm gmVar, final String str, final int i10, final int i11, final long j10, final ir irVar, final gp gpVar, final boolean z10) {
        if (hv.a() && ho.j()) {
            final gx gxVar = new gx("POST", str, irVar);
            HashMap hashMap = new HashMap();
            hashMap.put("payload", gmVar.f25561b);
            gxVar.c(hashMap);
            int i12 = i10 - i11;
            if (i12 > 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("X-im-retry-count", String.valueOf(i12));
                gxVar.a(hashMap2);
            }
            gxVar.f25625t = false;
            gxVar.f25620o = false;
            long j11 = 0;
            if (z10) {
                if (i11 != i10) {
                    j11 = ((long) Math.pow(2.0d, i12)) * j10;
                }
            } else if (i11 != i10) {
                j11 = j10;
            }
            f25576b.schedule(new Runnable() { // from class: com.inmobi.media.go.1
                @Override // java.lang.Runnable
                public final void run() {
                    gy a10 = new ha(gxVar).a();
                    if (a10.a()) {
                        if (i11 > 1) {
                            String unused = go.f25575a;
                            a10.b();
                            go.this.a(gmVar, str, i10, i11 - 1, j10, irVar, gpVar, z10);
                            return;
                        }
                        gpVar.a(gmVar, true);
                        return;
                    }
                    gpVar.a(gmVar);
                }
            }, j11, TimeUnit.SECONDS);
            return;
        }
        gpVar.a(gmVar, false);
    }
}
