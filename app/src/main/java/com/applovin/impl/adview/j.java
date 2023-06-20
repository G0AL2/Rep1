package com.applovin.impl.adview;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f7057a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f7058b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<b> f7059c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f7060d = new AtomicInteger();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f7064a;

        /* renamed from: b  reason: collision with root package name */
        private final a f7065b;

        /* renamed from: c  reason: collision with root package name */
        private final long f7066c;

        private b(String str, long j10, a aVar) {
            this.f7064a = str;
            this.f7066c = j10;
            this.f7065b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f7064a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f7066c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a c() {
            return this.f7065b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                String str = this.f7064a;
                String str2 = ((b) obj).f7064a;
                return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f7064a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f7064a + "', countdownStepMillis=" + this.f7066c + '}';
        }
    }

    public j(Handler handler, com.applovin.impl.sdk.m mVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f7058b = handler;
        this.f7057a = mVar.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final b bVar, final int i10) {
        this.f7058b.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.j.1
            @Override // java.lang.Runnable
            public void run() {
                a c10 = bVar.c();
                if (!c10.b()) {
                    if (com.applovin.impl.sdk.v.a()) {
                        com.applovin.impl.sdk.v vVar = j.this.f7057a;
                        vVar.b("CountdownManager", "Ending countdown for " + bVar.a());
                    }
                } else if (j.this.f7060d.get() != i10) {
                    if (com.applovin.impl.sdk.v.a()) {
                        com.applovin.impl.sdk.v vVar2 = j.this.f7057a;
                        vVar2.d("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.a());
                    }
                } else {
                    try {
                        c10.a();
                        j.this.a(bVar, i10);
                    } catch (Throwable th) {
                        if (com.applovin.impl.sdk.v.a()) {
                            com.applovin.impl.sdk.v vVar3 = j.this.f7057a;
                            vVar3.b("CountdownManager", "Encountered error on countdown step for: " + bVar.a(), th);
                        }
                        j.this.b();
                    }
                }
            }
        }, bVar.b());
    }

    public void a() {
        HashSet<b> hashSet = new HashSet(this.f7059c);
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7057a;
            vVar.b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f7060d.incrementAndGet();
        for (b bVar : hashSet) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v vVar2 = this.f7057a;
                vVar2.b("CountdownManager", "Starting countdown: " + bVar.a() + " for generation " + incrementAndGet + "...");
            }
            a(bVar, incrementAndGet);
        }
    }

    public void a(String str, long j10, a aVar) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        }
        if (this.f7058b == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7057a;
            vVar.b("CountdownManager", "Adding countdown: " + str);
        }
        this.f7059c.add(new b(str, j10, aVar));
    }

    public void b() {
        if (com.applovin.impl.sdk.v.a()) {
            this.f7057a.b("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f7059c.clear();
    }

    public void c() {
        if (com.applovin.impl.sdk.v.a()) {
            this.f7057a.b("CountdownManager", "Stopping countdowns...");
        }
        this.f7060d.incrementAndGet();
        this.f7058b.removeCallbacksAndMessages(null);
    }
}
