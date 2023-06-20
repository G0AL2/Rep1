package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class j1 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14086a;

    /* renamed from: b  reason: collision with root package name */
    private final com.chartboost.sdk.Networking.b f14087b;

    /* renamed from: c  reason: collision with root package name */
    private final r0 f14088c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<com.chartboost.sdk.Model.e> f14089d;

    /* renamed from: e  reason: collision with root package name */
    private final u2 f14090e;

    /* renamed from: f  reason: collision with root package name */
    private final p1 f14091f;

    /* renamed from: g  reason: collision with root package name */
    int f14092g = 1;

    /* renamed from: h  reason: collision with root package name */
    private r f14093h = null;

    /* renamed from: i  reason: collision with root package name */
    private final PriorityQueue<q> f14094i = new PriorityQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<File> {
        a(j1 j1Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
        }
    }

    public j1(Executor executor, p1 p1Var, com.chartboost.sdk.Networking.b bVar, r0 r0Var, AtomicReference<com.chartboost.sdk.Model.e> atomicReference, u2 u2Var) {
        this.f14086a = executor;
        this.f14091f = p1Var;
        this.f14087b = bVar;
        this.f14088c = r0Var;
        this.f14089d = atomicReference;
        this.f14090e = u2Var;
    }

    private void d() {
        q poll;
        q peek;
        if (this.f14093h != null && (peek = this.f14094i.peek()) != null) {
            r rVar = this.f14093h;
            if (rVar.f14280l.f14258b > peek.f14258b && rVar.b()) {
                this.f14094i.add(this.f14093h.f14280l);
                this.f14093h = null;
            }
        }
        while (this.f14093h == null && (poll = this.f14094i.poll()) != null) {
            if (poll.f14263g.get() > 0) {
                File file = new File(this.f14091f.a().f14269a, poll.f14261e);
                if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
                    CBLogging.b("Downloader", "Unable to create directory " + file.getPath());
                    poll.a(this.f14086a, false);
                } else {
                    File file2 = new File(file, poll.f14259c);
                    if (file2.exists()) {
                        this.f14091f.d(file2);
                        poll.a(this.f14086a, true);
                    } else {
                        r rVar2 = new r(this, this.f14088c, poll, file2);
                        this.f14093h = rVar2;
                        this.f14087b.a(rVar2);
                    }
                }
            }
        }
        if (this.f14093h != null) {
            if (this.f14092g != 2) {
                CBLogging.a("Downloader", "Change state to DOWNLOADING");
                this.f14092g = 2;
            }
        } else if (this.f14092g != 1) {
            CBLogging.a("Downloader", "Change state to IDLE");
            this.f14092g = 1;
        }
    }

    public synchronized void a(int i10, Map<String, com.chartboost.sdk.Model.b> map, AtomicInteger atomicInteger, o oVar, String str) {
        long b10 = this.f14090e.b();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        AtomicReference atomicReference = new AtomicReference(oVar);
        for (com.chartboost.sdk.Model.b bVar : map.values()) {
            this.f14094i.add(new q(this.f14090e, i10, bVar.f13682b, bVar.f13683c, bVar.f13681a, atomicInteger, atomicReference, b10, atomicInteger2, str));
            atomicReference = atomicReference;
            b10 = b10;
        }
        int i11 = this.f14092g;
        if (i11 == 1 || i11 == 2) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void b() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.j1.b():void");
    }

    public synchronized void c() {
        int i10 = this.f14092g;
        if (i10 == 3) {
            CBLogging.a("Downloader", "Change state to DOWNLOADING");
            this.f14092g = 2;
        } else if (i10 == 4) {
            CBLogging.a("Downloader", "Change state to IDLE");
            this.f14092g = 1;
            d();
        }
    }

    public synchronized void a(AtomicInteger atomicInteger) {
        atomicInteger.set(-10000);
        if (this.f14092g == 2) {
            r rVar = this.f14093h;
            if ((rVar.f14280l.f14263g == atomicInteger) && rVar.b()) {
                this.f14093h = null;
                d();
            }
        }
    }

    public synchronized void a() {
        int i10 = this.f14092g;
        if (i10 == 1) {
            CBLogging.a("Downloader", "Change state to PAUSED");
            this.f14092g = 4;
        } else if (i10 == 2) {
            if (this.f14093h.b()) {
                this.f14094i.add(this.f14093h.f14280l);
                this.f14093h = null;
                CBLogging.a("Downloader", "Change state to PAUSED");
                this.f14092g = 4;
            } else {
                CBLogging.a("Downloader", "Change state to PAUSING");
                this.f14092g = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(r rVar, CBError cBError, q0 q0Var) {
        String str;
        String str2;
        int i10 = this.f14092g;
        if (i10 == 2 || i10 == 3) {
            if (rVar != this.f14093h) {
                return;
            }
            q qVar = rVar.f14280l;
            this.f14093h = null;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            qVar.f14266j.addAndGet((int) timeUnit.toMillis(rVar.f14234f));
            qVar.a(this.f14086a, cBError == null);
            timeUnit.toMillis(rVar.f14235g);
            timeUnit.toMillis(rVar.f14236h);
            if (cBError == null) {
                CBLogging.a("Downloader", "Downloaded " + qVar.f14260d);
            } else {
                q qVar2 = rVar.f14280l;
                String str3 = qVar2 != null ? qVar2.f14262f : "";
                String errorDesc = cBError.getErrorDesc();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to download ");
                sb2.append(qVar.f14260d);
                if (q0Var != null) {
                    str = " Status code=" + q0Var.f14267a;
                } else {
                    str = "";
                }
                sb2.append(str);
                if (errorDesc != null) {
                    str2 = " Error message=" + errorDesc;
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                CBLogging.a("Downloader", sb2.toString());
                m1.d(new com.chartboost.sdk.Tracking.b("cache_asset_download_error", "Name: " + qVar.f14259c + " Url: " + qVar.f14260d + " Error: " + errorDesc, str3, ""));
            }
            if (this.f14092g == 3) {
                CBLogging.a("Downloader", "Change state to PAUSED");
                this.f14092g = 4;
            } else {
                d();
            }
        }
    }
}
