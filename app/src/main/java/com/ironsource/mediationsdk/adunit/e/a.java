package com.ironsource.mediationsdk.adunit.e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class a<Smash extends c<?>> {

    /* renamed from: e  reason: collision with root package name */
    private c<?> f26950e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f26951f;

    /* renamed from: g  reason: collision with root package name */
    private final int f26952g;

    /* renamed from: i  reason: collision with root package name */
    private b f26954i;

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f26946a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public String f26947b = "";

    /* renamed from: d  reason: collision with root package name */
    private String f26949d = "";

    /* renamed from: h  reason: collision with root package name */
    private final Timer f26953h = new Timer();

    /* renamed from: j  reason: collision with root package name */
    private final int f26955j = 5;

    /* renamed from: c  reason: collision with root package name */
    ConcurrentHashMap<String, AdInfo> f26948c = new ConcurrentHashMap<>();

    public a(List<String> list, int i10, b bVar) {
        this.f26951f = list;
        this.f26952g = i10;
        this.f26954i = bVar;
    }

    private synchronized void b() {
        c<?> cVar = this.f26950e;
        if (cVar != null) {
            cVar.c();
        }
    }

    private synchronized boolean c() {
        boolean z10;
        c<?> cVar = this.f26950e;
        if (cVar != null && cVar.p()) {
            z10 = this.f26950e.o().equals(this.f26949d);
        }
        return z10;
    }

    private void d() {
        Iterator<Smash> it = a().iterator();
        while (it.hasNext()) {
            Smash next = it.next();
            if (!next.equals(this.f26950e)) {
                next.c();
            }
        }
    }

    public final AdInfo a(String str) {
        if (this.f26948c.containsKey(str)) {
            return this.f26948c.get(str);
        }
        return null;
    }

    public final CopyOnWriteArrayList<Smash> a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f26946a.get(this.f26947b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final void a(a.EnumC0342a enumC0342a, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        d();
        if (enumC0342a == a.EnumC0342a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f26946a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f26949d)) {
                if (c()) {
                    ironLog.verbose("ad from previous waterfall " + this.f26949d + " is still showing - the current waterfall " + this.f26947b + " will be deleted instead");
                    String str2 = this.f26947b;
                    this.f26947b = this.f26949d;
                    this.f26949d = str2;
                }
                final String str3 = this.f26949d;
                this.f26953h.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.adunit.e.a.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        try {
                            IronLog ironLog2 = IronLog.INTERNAL;
                            ironLog2.verbose("removing waterfall with id " + str3 + " from memory");
                            a.this.f26946a.remove(str3);
                            ironLog2.verbose("waterfall size is currently " + a.this.f26946a.size());
                            ironLog2.verbose("removing adInfo with id " + str3 + " from memory");
                            a.this.f26948c.remove(str3);
                            ironLog2.verbose("adInfo size is currently " + a.this.f26948c.size());
                        } finally {
                            cancel();
                        }
                    }
                }, this.f26952g);
            }
        } else {
            this.f26946a.clear();
            this.f26946a.put(str, copyOnWriteArrayList);
        }
        this.f26949d = this.f26947b;
        this.f26947b = str;
        if (this.f26946a.size() > 5) {
            this.f26954i.a(this.f26946a.size());
        }
    }

    public final synchronized void a(c<?> cVar) {
        IronLog.INTERNAL.verbose("");
        c<?> cVar2 = this.f26950e;
        if (cVar2 != null && !cVar2.equals(cVar)) {
            b();
        }
        this.f26950e = cVar;
    }

    public final void a(String str, ImpressionData impressionData) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.f26948c.put(str, new AdInfo(impressionData));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r3.f26951f.contains(r6) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r3.f26950e.n().equals(r6) == false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:23:0x003f, B:6:0x0009, B:8:0x000d, B:11:0x0014, B:13:0x0018, B:16:0x0025, B:18:0x0029, B:20:0x0031), top: B:29:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(com.ironsource.mediationsdk.adunit.c.b.a.EnumC0342a r4, java.lang.String r5, java.lang.String r6, com.ironsource.mediationsdk.LoadWhileShowSupportState r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.c.b.a.EnumC0342a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch: java.lang.Throwable -> L57
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L9
        L7:
            r1 = 1
            goto L3d
        L9:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f26950e     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L7
            boolean r4 = r4.p()     // Catch: java.lang.Throwable -> L57
            if (r4 != 0) goto L14
            goto L7
        L14:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L57
            if (r7 != r4) goto L25
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f26950e     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r4.k()     // Catch: java.lang.Throwable -> L57
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L25
            goto L3d
        L25:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L57
            if (r7 == r4) goto L31
            java.util.List<java.lang.String> r4 = r3.f26951f     // Catch: java.lang.Throwable -> L57
            boolean r4 = r4.contains(r6)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L7
        L31:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f26950e     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r4.n()     // Catch: java.lang.Throwable -> L57
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L7
        L3d:
            if (r1 != 0) goto L55
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r6.<init>()     // Catch: java.lang.Throwable -> L57
            r6.append(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = " does not support load while show and will not be added to the auction request"
            r6.append(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L57
            r4.verbose(r5)     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r3)
            return r1
        L57:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.e.a.a(com.ironsource.mediationsdk.adunit.c.b.a$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState):boolean");
    }
}
