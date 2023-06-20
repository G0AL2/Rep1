package n1;

import android.content.Context;

/* compiled from: Trackers.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final h<Boolean> f34620a;

    /* renamed from: b  reason: collision with root package name */
    private final c f34621b;

    /* renamed from: c  reason: collision with root package name */
    private final h<l1.b> f34622c;

    /* renamed from: d  reason: collision with root package name */
    private final h<Boolean> f34623d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(Context context, q1.c cVar) {
        this(context, cVar, null, null, null, null, 60, null);
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
    }

    public o(Context context, q1.c cVar, h<Boolean> hVar, c cVar2, h<l1.b> hVar2, h<Boolean> hVar3) {
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
        qe.k.f(hVar, "batteryChargingTracker");
        qe.k.f(cVar2, "batteryNotLowTracker");
        qe.k.f(hVar2, "networkStateTracker");
        qe.k.f(hVar3, "storageNotLowTracker");
        this.f34620a = hVar;
        this.f34621b = cVar2;
        this.f34622c = hVar2;
        this.f34623d = hVar3;
    }

    public final h<Boolean> a() {
        return this.f34620a;
    }

    public final c b() {
        return this.f34621b;
    }

    public final h<l1.b> c() {
        return this.f34622c;
    }

    public final h<Boolean> d() {
        return this.f34623d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ o(android.content.Context r8, q1.c r9, n1.h r10, n1.c r11, n1.h r12, n1.h r13, int r14, qe.g r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L14
            n1.a r0 = new n1.a
            android.content.Context r3 = r8.getApplicationContext()
            qe.k.e(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            n1.c r0 = new n1.c
            android.content.Context r4 = r8.getApplicationContext()
            qe.k.e(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            qe.k.e(r0, r1)
            n1.h r0 = n1.k.a(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4c
            n1.m r0 = new n1.m
            android.content.Context r6 = r8.getApplicationContext()
            qe.k.e(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            goto L4d
        L4c:
            r6 = r13
        L4d:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.o.<init>(android.content.Context, q1.c, n1.h, n1.c, n1.h, n1.h, int, qe.g):void");
    }
}
