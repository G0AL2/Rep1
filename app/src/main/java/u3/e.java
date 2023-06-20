package u3;

import d4.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import t3.a;
import t3.c;
import u3.d;
import y3.k;

/* compiled from: DiskStorageCache.java */
/* loaded from: classes.dex */
public class e implements i, v3.a {

    /* renamed from: q  reason: collision with root package name */
    private static final Class<?> f37392q = e.class;

    /* renamed from: r  reason: collision with root package name */
    private static final long f37393r = TimeUnit.HOURS.toMillis(2);

    /* renamed from: s  reason: collision with root package name */
    private static final long f37394s = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final long f37395a;

    /* renamed from: b  reason: collision with root package name */
    private final long f37396b;

    /* renamed from: c  reason: collision with root package name */
    private final CountDownLatch f37397c;

    /* renamed from: d  reason: collision with root package name */
    private long f37398d;

    /* renamed from: e  reason: collision with root package name */
    private final t3.c f37399e;

    /* renamed from: f  reason: collision with root package name */
    final Set<String> f37400f;

    /* renamed from: g  reason: collision with root package name */
    private long f37401g;

    /* renamed from: h  reason: collision with root package name */
    private final d4.a f37402h;

    /* renamed from: i  reason: collision with root package name */
    private final d f37403i;

    /* renamed from: j  reason: collision with root package name */
    private final h f37404j;

    /* renamed from: k  reason: collision with root package name */
    private final t3.a f37405k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f37406l;

    /* renamed from: m  reason: collision with root package name */
    private final b f37407m;

    /* renamed from: n  reason: collision with root package name */
    private final f4.a f37408n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f37409o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private boolean f37410p;

    /* compiled from: DiskStorageCache.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.f37409o) {
                e.this.o();
            }
            e.this.f37410p = true;
            e.this.f37397c.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskStorageCache.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f37412a = false;

        /* renamed from: b  reason: collision with root package name */
        private long f37413b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f37414c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f37414c;
        }

        public synchronized long b() {
            return this.f37413b;
        }

        public synchronized void c(long j10, long j11) {
            if (this.f37412a) {
                this.f37413b += j10;
                this.f37414c += j11;
            }
        }

        public synchronized boolean d() {
            return this.f37412a;
        }

        public synchronized void e() {
            this.f37412a = false;
            this.f37414c = -1L;
            this.f37413b = -1L;
        }

        public synchronized void f(long j10, long j11) {
            this.f37414c = j11;
            this.f37413b = j10;
            this.f37412a = true;
        }
    }

    /* compiled from: DiskStorageCache.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f37415a;

        /* renamed from: b  reason: collision with root package name */
        public final long f37416b;

        /* renamed from: c  reason: collision with root package name */
        public final long f37417c;

        public c(long j10, long j11, long j12) {
            this.f37415a = j10;
            this.f37416b = j11;
            this.f37417c = j12;
        }
    }

    public e(d dVar, h hVar, c cVar, t3.c cVar2, t3.a aVar, v3.b bVar, Executor executor, boolean z10) {
        this.f37395a = cVar.f37416b;
        long j10 = cVar.f37417c;
        this.f37396b = j10;
        this.f37398d = j10;
        this.f37402h = d4.a.d();
        this.f37403i = dVar;
        this.f37404j = hVar;
        this.f37401g = -1L;
        this.f37399e = cVar2;
        this.f37405k = aVar;
        this.f37407m = new b();
        this.f37408n = f4.c.a();
        this.f37406l = z10;
        this.f37400f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (z10) {
            this.f37397c = new CountDownLatch(1);
            executor.execute(new a());
            return;
        }
        this.f37397c = new CountDownLatch(0);
    }

    private com.facebook.binaryresource.a k(d.b bVar, t3.d dVar, String str) throws IOException {
        com.facebook.binaryresource.a a10;
        synchronized (this.f37409o) {
            a10 = bVar.a(dVar);
            this.f37400f.add(str);
            this.f37407m.c(a10.size(), 1L);
        }
        return a10;
    }

    private void l(long j10, c.a aVar) throws IOException {
        try {
            Collection<d.a> m10 = m(this.f37403i.g());
            long b10 = this.f37407m.b();
            long j11 = b10 - j10;
            int i10 = 0;
            long j12 = 0;
            for (d.a aVar2 : m10) {
                if (j12 > j11) {
                    break;
                }
                long h10 = this.f37403i.h(aVar2);
                this.f37400f.remove(aVar2.getId());
                if (h10 > 0) {
                    i10++;
                    j12 += h10;
                    j e10 = j.a().j(aVar2.getId()).g(aVar).i(h10).f(b10 - j12).e(j10);
                    this.f37399e.b(e10);
                    e10.b();
                }
            }
            this.f37407m.c(-j12, -i10);
            this.f37403i.a();
        } catch (IOException e11) {
            t3.a aVar3 = this.f37405k;
            a.EnumC0503a enumC0503a = a.EnumC0503a.EVICTION;
            Class<?> cls = f37392q;
            aVar3.a(enumC0503a, cls, "evictAboveSize: " + e11.getMessage(), e11);
            throw e11;
        }
    }

    private Collection<d.a> m(Collection<d.a> collection) {
        long now = this.f37408n.now() + f37393r;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (d.a aVar : collection) {
            if (aVar.a() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f37404j.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void n() throws IOException {
        synchronized (this.f37409o) {
            boolean o10 = o();
            r();
            long b10 = this.f37407m.b();
            if (b10 > this.f37398d && !o10) {
                this.f37407m.e();
                o();
            }
            long j10 = this.f37398d;
            if (b10 > j10) {
                l((j10 * 9) / 10, c.a.CACHE_FULL);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        long now = this.f37408n.now();
        if (this.f37407m.d()) {
            long j10 = this.f37401g;
            if (j10 != -1 && now - j10 <= f37394s) {
                return false;
            }
        }
        return p();
    }

    private boolean p() {
        Set<String> hashSet;
        long j10;
        long now = this.f37408n.now();
        long j11 = f37393r + now;
        if (this.f37406l && this.f37400f.isEmpty()) {
            hashSet = this.f37400f;
        } else {
            hashSet = this.f37406l ? new HashSet<>() : null;
        }
        try {
            long j12 = 0;
            long j13 = -1;
            int i10 = 0;
            boolean z10 = false;
            int i11 = 0;
            int i12 = 0;
            for (d.a aVar : this.f37403i.g()) {
                i11++;
                j12 += aVar.getSize();
                if (aVar.a() > j11) {
                    i12++;
                    i10 = (int) (i10 + aVar.getSize());
                    j10 = j11;
                    j13 = Math.max(aVar.a() - now, j13);
                    z10 = true;
                } else {
                    j10 = j11;
                    if (this.f37406l) {
                        k.g(hashSet);
                        hashSet.add(aVar.getId());
                    }
                }
                j11 = j10;
            }
            if (z10) {
                this.f37405k.a(a.EnumC0503a.READ_INVALID_ENTRY, f37392q, "Future timestamp found in " + i12 + " files , with a total size of " + i10 + " bytes, and a maximum time delta of " + j13 + "ms", null);
            }
            long j14 = i11;
            if (this.f37407m.a() != j14 || this.f37407m.b() != j12) {
                if (this.f37406l && this.f37400f != hashSet) {
                    k.g(hashSet);
                    this.f37400f.clear();
                    this.f37400f.addAll(hashSet);
                }
                this.f37407m.f(j12, j14);
            }
            this.f37401g = now;
            return true;
        } catch (IOException e10) {
            this.f37405k.a(a.EnumC0503a.GENERIC_IO, f37392q, "calcFileCacheSize: " + e10.getMessage(), e10);
            return false;
        }
    }

    private d.b q(String str, t3.d dVar) throws IOException {
        n();
        return this.f37403i.d(str, dVar);
    }

    private void r() {
        if (this.f37402h.f(this.f37403i.c() ? a.EnumC0366a.EXTERNAL : a.EnumC0366a.INTERNAL, this.f37396b - this.f37407m.b())) {
            this.f37398d = this.f37395a;
        } else {
            this.f37398d = this.f37396b;
        }
    }

    @Override // u3.i
    public com.facebook.binaryresource.a a(t3.d dVar, t3.j jVar) throws IOException {
        String a10;
        j d10 = j.a().d(dVar);
        this.f37399e.h(d10);
        synchronized (this.f37409o) {
            a10 = t3.e.a(dVar);
        }
        d10.j(a10);
        try {
            try {
                d.b q10 = q(a10, dVar);
                try {
                    q10.b(jVar, dVar);
                    com.facebook.binaryresource.a k10 = k(q10, dVar, a10);
                    d10.i(k10.size()).f(this.f37407m.b());
                    this.f37399e.g(d10);
                    return k10;
                } finally {
                    if (!q10.i()) {
                        z3.a.f(f37392q, "Failed to delete temp file");
                    }
                }
            } catch (IOException e10) {
                d10.h(e10);
                this.f37399e.a(d10);
                z3.a.g(f37392q, "Failed inserting a file into the cache", e10);
                throw e10;
            }
        } finally {
            d10.b();
        }
    }

    @Override // u3.i
    public boolean b(t3.d dVar) {
        synchronized (this.f37409o) {
            if (f(dVar)) {
                return true;
            }
            try {
                List<String> b10 = t3.e.b(dVar);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    String str = b10.get(i10);
                    if (this.f37403i.e(str, dVar)) {
                        this.f37400f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // u3.i
    public boolean c(t3.d dVar) {
        String str;
        IOException e10;
        String str2 = null;
        try {
            try {
                synchronized (this.f37409o) {
                    try {
                        List<String> b10 = t3.e.b(dVar);
                        int i10 = 0;
                        while (i10 < b10.size()) {
                            String str3 = b10.get(i10);
                            if (this.f37403i.b(str3, dVar)) {
                                this.f37400f.add(str3);
                                return true;
                            }
                            i10++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e11) {
                            e10 = e11;
                            j h10 = j.a().d(dVar).j(str).h(e10);
                            this.f37399e.d(h10);
                            h10.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            str = null;
            e10 = e12;
        }
    }

    @Override // u3.i
    public void clearAll() {
        synchronized (this.f37409o) {
            try {
                this.f37403i.clearAll();
                this.f37400f.clear();
                this.f37399e.e();
            } catch (IOException | NullPointerException e10) {
                t3.a aVar = this.f37405k;
                a.EnumC0503a enumC0503a = a.EnumC0503a.EVICTION;
                Class<?> cls = f37392q;
                aVar.a(enumC0503a, cls, "clearAll: " + e10.getMessage(), e10);
            }
            this.f37407m.e();
        }
    }

    @Override // u3.i
    public com.facebook.binaryresource.a d(t3.d dVar) {
        com.facebook.binaryresource.a aVar;
        j d10 = j.a().d(dVar);
        try {
            synchronized (this.f37409o) {
                List<String> b10 = t3.e.b(dVar);
                String str = null;
                aVar = null;
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    str = b10.get(i10);
                    d10.j(str);
                    aVar = this.f37403i.f(str, dVar);
                    if (aVar != null) {
                        break;
                    }
                }
                if (aVar == null) {
                    this.f37399e.c(d10);
                    this.f37400f.remove(str);
                } else {
                    k.g(str);
                    this.f37399e.f(d10);
                    this.f37400f.add(str);
                }
            }
            return aVar;
        } catch (IOException e10) {
            this.f37405k.a(a.EnumC0503a.GENERIC_IO, f37392q, "getResource", e10);
            d10.h(e10);
            this.f37399e.d(d10);
            return null;
        } finally {
            d10.b();
        }
    }

    @Override // u3.i
    public void e(t3.d dVar) {
        synchronized (this.f37409o) {
            try {
                List<String> b10 = t3.e.b(dVar);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    String str = b10.get(i10);
                    this.f37403i.remove(str);
                    this.f37400f.remove(str);
                }
            } catch (IOException e10) {
                t3.a aVar = this.f37405k;
                a.EnumC0503a enumC0503a = a.EnumC0503a.DELETE_FILE;
                Class<?> cls = f37392q;
                aVar.a(enumC0503a, cls, "delete: " + e10.getMessage(), e10);
            }
        }
    }

    @Override // u3.i
    public boolean f(t3.d dVar) {
        synchronized (this.f37409o) {
            List<String> b10 = t3.e.b(dVar);
            for (int i10 = 0; i10 < b10.size(); i10++) {
                if (this.f37400f.contains(b10.get(i10))) {
                    return true;
                }
            }
            return false;
        }
    }
}
