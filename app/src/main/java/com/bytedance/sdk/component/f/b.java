package com.bytedance.sdk.component.f;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.l;

/* compiled from: DelegateRunnable.java */
/* loaded from: classes.dex */
class b implements Comparable, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private g f10416a;

    /* renamed from: b  reason: collision with root package name */
    private a f10417b;

    /* renamed from: c  reason: collision with root package name */
    private long f10418c;

    /* renamed from: d  reason: collision with root package name */
    private Thread f10419d = null;

    public b(g gVar, a aVar) {
        this.f10416a = null;
        this.f10417b = null;
        this.f10418c = 0L;
        this.f10416a = gVar;
        this.f10417b = aVar;
        this.f10418c = SystemClock.uptimeMillis();
    }

    public g a() {
        return this.f10416a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof b) {
            return this.f10416a.compareTo(((b) obj).a());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        g gVar;
        return (obj instanceof b) && (gVar = this.f10416a) != null && gVar.equals(((b) obj).a());
    }

    public int hashCode() {
        return this.f10416a.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = uptimeMillis - this.f10418c;
        this.f10419d = Thread.currentThread();
        g gVar = this.f10416a;
        if (gVar != null) {
            gVar.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.f10417b != null) {
            d.a();
        }
        if (l.a()) {
            Object[] objArr = new Object[8];
            objArr[0] = "run: pool  = ";
            a aVar = this.f10417b;
            objArr[1] = aVar != null ? aVar.a() : "null";
            objArr[2] = " waitTime =";
            objArr[3] = Long.valueOf(j10);
            objArr[4] = " taskCost = ";
            objArr[5] = Long.valueOf(uptimeMillis2);
            objArr[6] = " name=";
            g gVar2 = this.f10416a;
            objArr[7] = gVar2 != null ? gVar2.b() : "null";
            l.a("DelegateRunnable", objArr);
        }
    }
}
