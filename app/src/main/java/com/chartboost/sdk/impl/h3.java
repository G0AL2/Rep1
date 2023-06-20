package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.i3;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h3 implements i3.a {

    /* renamed from: a */
    private final com.chartboost.sdk.Networking.b f14040a;

    /* renamed from: b */
    private final d3 f14041b;

    /* renamed from: c */
    private final r0 f14042c;

    /* renamed from: d */
    private final p1 f14043d;

    /* renamed from: e */
    private final s2 f14044e;

    /* renamed from: f */
    private final ScheduledExecutorService f14045f;

    /* renamed from: g */
    private final Queue<b3> f14046g;

    /* renamed from: h */
    private final ConcurrentLinkedQueue<String> f14047h;

    /* renamed from: i */
    private final ConcurrentHashMap<String, a> f14048i;

    /* renamed from: j */
    private final ConcurrentHashMap<String, b3> f14049j;

    /* renamed from: k */
    private AtomicInteger f14050k;

    /* renamed from: l */
    private final Runnable f14051l;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = he.b.a(Long.valueOf(((b3) t10).a()), Long.valueOf(((b3) t11).a()));
            return a10;
        }
    }

    public h3(com.chartboost.sdk.Networking.b bVar, d3 d3Var, r0 r0Var, p1 p1Var, s2 s2Var, ScheduledExecutorService scheduledExecutorService) {
        qe.k.f(d3Var, "policy");
        qe.k.f(s2Var, "tempHelper");
        qe.k.f(scheduledExecutorService, "backgroundExecutor");
        this.f14040a = bVar;
        this.f14041b = d3Var;
        this.f14042c = r0Var;
        this.f14043d = p1Var;
        this.f14044e = s2Var;
        this.f14045f = scheduledExecutorService;
        this.f14046g = new ConcurrentLinkedQueue();
        this.f14047h = new ConcurrentLinkedQueue<>();
        this.f14048i = new ConcurrentHashMap<>();
        this.f14049j = new ConcurrentHashMap<>();
        this.f14050k = new AtomicInteger(1);
        e();
        this.f14051l = new Runnable() { // from class: com.chartboost.sdk.impl.s3
            @Override // java.lang.Runnable
            public final void run() {
                h3.b(h3.this);
            }
        };
    }

    public static /* synthetic */ void b(h3 h3Var) {
        a(h3Var);
    }

    private final b3 d(String str) {
        b3 b3Var;
        if (str == null) {
            b3Var = this.f14046g.poll();
        } else {
            b3 b3Var2 = null;
            for (b3 b3Var3 : this.f14046g) {
                if (qe.k.a(b3Var3.d(), str)) {
                    b3Var2 = b3Var3;
                }
            }
            b3Var = b3Var2;
        }
        b3 b3Var4 = b3Var;
        if (b3Var4 != null) {
            b(b3Var4);
        }
        return b3Var4;
    }

    private final void h(b3 b3Var) {
        if (!f(b3Var.d())) {
            m2.a(qe.k.l("Start downloading ", b3Var.g()));
            if (this.f14041b.c() == 0) {
                this.f14041b.b(System.currentTimeMillis());
            }
            this.f14041b.a();
            this.f14047h.add(b3Var.g());
            i3 i3Var = new i3(this.f14042c, b3Var.e(), b3Var.g(), this, 0, 16, null);
            com.chartboost.sdk.Networking.b bVar = this.f14040a;
            if (bVar == null) {
                return;
            }
            bVar.a(i3Var);
            return;
        }
        m2.a(qe.k.l("File already downloaded or downloading: ", b3Var.d()));
        String g10 = b3Var.g();
        a remove = this.f14048i.remove(g10);
        if (remove == null) {
            return;
        }
        remove.a(g10);
    }

    public synchronized void a(String str, String str2, boolean z10, a aVar) {
        qe.k.f(str, ImagesContract.URL);
        qe.k.f(str2, "filename");
        p1 p1Var = this.f14043d;
        File c10 = p1Var == null ? null : p1Var.c();
        p1 p1Var2 = this.f14043d;
        File a10 = p1Var2 == null ? null : p1Var2.a(c10, str2);
        boolean f10 = f(str2);
        if (z10 && this.f14048i.containsKey(str) && !f10 && aVar != null) {
            this.f14048i.put(str, aVar);
        } else if (z10 && f10 && this.f14048i.containsKey(str)) {
            m2.a(qe.k.l("Already downloading for show operation: ", str2));
            a(str, str2, a10 == null ? 0L : a10.length(), aVar);
        } else if (!z10 && (b(str, str2) || f10)) {
            m2.a(qe.k.l("Already queued or downloading for cache operation: ", str2));
        } else {
            if (z10 && aVar != null) {
                m2.a(qe.k.l("Register callback for show operation: ", str2));
                this.f14048i.put(str, aVar);
            }
            a(str, str2, new File(c10, str2), c10);
            if (z10) {
                a(str2, this.f14050k.get(), z10);
            } else {
                a((String) null, this.f14050k.get(), z10);
            }
        }
    }

    public final p1 b() {
        return this.f14043d;
    }

    public final com.chartboost.sdk.Networking.b c() {
        return this.f14040a;
    }

    public final void e() {
        File[] d10;
        boolean D;
        p1 p1Var = this.f14043d;
        if (p1Var == null || (d10 = p1Var.d()) == null) {
            return;
        }
        int length = d10.length;
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            File file = d10[i10];
            if (file.exists()) {
                String name = file.getName();
                qe.k.e(name, "file.name");
                D = ve.q.D(name, ".tmp", z10, 2, null);
                if (D) {
                    p1Var.a(file);
                    return;
                }
            }
            d3 d3Var = this.f14041b;
            qe.k.e(file, "file");
            if (d3Var.a(file)) {
                p1Var.a(file);
            } else {
                String name2 = file.getName();
                qe.k.e(name2, "file.name");
                b3 b3Var = new b3("", name2, file, p1Var.c(), file.lastModified(), null, file.length(), 32, null);
                ConcurrentHashMap<String, b3> concurrentHashMap = this.f14049j;
                String name3 = file.getName();
                qe.k.e(name3, "file.name");
                concurrentHashMap.put(name3, b3Var);
            }
            i10++;
            z10 = false;
        }
    }

    public boolean f(String str) {
        qe.k.f(str, "videoFilename");
        b3 c10 = c(str);
        return (c10 != null && f(c10)) || (c10 != null && e(c10));
    }

    public boolean g(b3 b3Var) {
        if (b3Var != null && e(b3Var)) {
            File e10 = b3Var.e();
            String d10 = b3Var.d();
            p1 b10 = b();
            if (b10 != null && b10.a(e10)) {
                this.f14049j.remove(d10);
                return true;
            }
            return false;
        }
        return false;
    }

    private final void b(b3 b3Var) {
        if (m2.f14204a) {
            File file = new File(b3Var.f());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public b3 c(String str) {
        qe.k.f(str, "filename");
        return this.f14049j.get(str);
    }

    private final File c(b3 b3Var) {
        return this.f14044e.a(b3Var.b(), b3Var.d());
    }

    private final boolean f(b3 b3Var) {
        return this.f14044e.b(b3Var.b(), b3Var.d());
    }

    private final List<b3> f() {
        List<b3> J;
        Collection<b3> values = this.f14049j.values();
        qe.k.e(values, "videoMap.values");
        J = fe.x.J(values, new b());
        return J;
    }

    public int d(b3 b3Var) {
        if (b3Var == null) {
            return 0;
        }
        if (e(b3Var)) {
            return 5;
        }
        File c10 = c(b3Var);
        long length = c10 == null ? 0L : c10.length();
        if (b3Var.c() == 0) {
            return 0;
        }
        float c11 = ((float) length) / ((float) b3Var.c());
        if (c11 == 0.0f) {
            return 0;
        }
        double d10 = c11;
        if (d10 < 0.25d) {
            return 1;
        }
        if (d10 < 0.5d) {
            return 2;
        }
        if (d10 < 0.75d) {
            return 3;
        }
        return c11 < 1.0f ? 4 : 5;
    }

    private final boolean b(String str, String str2) {
        if (this.f14046g.size() > 0) {
            for (b3 b3Var : this.f14046g) {
                if (qe.k.a(b3Var.g(), str) && qe.k.a(b3Var.d(), str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private final boolean d() {
        p1 p1Var = this.f14043d;
        if (p1Var == null) {
            return false;
        }
        return this.f14041b.a(p1Var.b(p1Var.c()));
    }

    private final void b(String str) {
        for (b3 b3Var : new LinkedList(this.f14046g)) {
            if (b3Var != null && qe.k.a(b3Var.g(), str)) {
                this.f14046g.remove(b3Var);
            }
        }
    }

    private final boolean e(b3 b3Var) {
        p1 p1Var;
        if (b3Var == null || b3Var.e() == null || (p1Var = this.f14043d) == null) {
            return false;
        }
        return p1Var.c(b3Var.e());
    }

    public void a(String str, int i10, boolean z10) {
        if (this.f14046g.size() > 0) {
            boolean z11 = this.f14047h.size() > 0;
            r0 r0Var = this.f14042c;
            boolean e10 = r0Var != null ? r0Var.e() : false;
            if (!z10 && (!e10 || !this.f14041b.b() || z11)) {
                m2.a("Can't cache next video at the moment");
                this.f14045f.schedule(this.f14051l, i10 * 5000, TimeUnit.MILLISECONDS);
                return;
            }
            b3 d10 = d(str);
            if (d10 == null) {
                return;
            }
            h(d10);
        }
    }

    private final File e(String str) {
        p1 p1Var = this.f14043d;
        if (p1Var == null) {
            return null;
        }
        File c10 = p1Var.c();
        File a10 = p1Var.a(c10, str);
        return (a10 == null || !a10.exists()) ? this.f14044e.a(c10, str) : a10;
    }

    public RandomAccessFile a(String str) {
        if (str == null) {
            return null;
        }
        try {
            File e10 = e(str);
            if (e10 == null || !e10.exists()) {
                return null;
            }
            return this.f14044e.a(e10);
        } catch (Exception e11) {
            CBLogging.b("VideoRepository", e11.toString());
            return null;
        }
    }

    private final void a() {
        if (d()) {
            for (b3 b3Var : f()) {
                g(b3Var);
                if (!d()) {
                    return;
                }
            }
        }
    }

    private final void a(String str, String str2, File file, File file2) {
        File e10;
        StringBuilder sb2 = new StringBuilder();
        p1 p1Var = this.f14043d;
        sb2.append((Object) ((p1Var == null || (e10 = p1Var.e()) == null) ? null : e10.getAbsolutePath()));
        sb2.append((Object) File.separator);
        sb2.append(str2);
        b3 b3Var = new b3(str, str2, file, file2, 0L, sb2.toString(), 0L, 80, null);
        if (file != null) {
            file.setLastModified(b3Var.a());
        }
        a(b3Var);
        this.f14049j.put(str2, b3Var);
        this.f14046g.offer(b3Var);
    }

    private final void a(b3 b3Var) {
        if (m2.f14204a) {
            File file = new File(b3Var.f());
            try {
                file.createNewFile();
                file.setLastModified(System.currentTimeMillis());
            } catch (IOException e10) {
                CBLogging.e("VideoRepository", qe.k.l("Error while creating queue empty file: ", e10));
            }
        }
    }

    @Override // com.chartboost.sdk.impl.i3.a
    public void a(String str, String str2, long j10, a aVar) {
        qe.k.f(str, ImagesContract.URL);
        qe.k.f(str2, "videoFileName");
        b3 c10 = c(str2);
        if (c10 != null) {
            c10.a(j10);
        }
        if (aVar == null) {
            aVar = this.f14048i.get(str);
        }
        if (aVar == null) {
            CBLogging.b("VideoRepository", "Missing callback on tempFileIsReady");
        } else {
            aVar.a(str);
        }
    }

    @Override // com.chartboost.sdk.impl.i3.a
    public void a(String str, String str2) {
        qe.k.f(str, "uri");
        qe.k.f(str2, "videoFileName");
        m2.a(qe.k.l("Video downloaded success ", str));
        a();
        this.f14047h.remove(str);
        this.f14048i.remove(str);
        this.f14050k = new AtomicInteger(1);
        b(str);
        a((String) null, this.f14050k.get(), false);
    }

    @Override // com.chartboost.sdk.impl.i3.a
    public void a(String str, String str2, CBError cBError) {
        File e10;
        qe.k.f(str, "uri");
        qe.k.f(str2, "videoFileName");
        String str3 = (cBError == null || (str3 = cBError.getErrorDesc()) == null) ? "Unknown error" : "Unknown error";
        b3 c10 = c(str2);
        if (c10 != null && (e10 = c10.e()) != null) {
            e10.delete();
        }
        if (cBError == null || !(cBError.getError() == CBError.b.INTERNET_UNAVAILABLE || cBError.getError() == CBError.b.NETWORK_FAILURE)) {
            b(str);
        } else if (c10 != null) {
            this.f14046g.add(c10);
            a(c10);
        }
        this.f14048i.remove(str);
        this.f14049j.remove(str2);
        a((String) null, this.f14050k.get(), false);
        CBLogging.c("VideoRepository", "Video download failed: " + str + " with error " + str3);
        this.f14047h.remove(str);
    }

    public static final void a(h3 h3Var) {
        qe.k.f(h3Var, "this$0");
        h3Var.a((String) null, h3Var.f14050k.incrementAndGet(), false);
    }
}
