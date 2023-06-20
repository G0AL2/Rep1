package z2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public class c extends z2.a {

    /* renamed from: a  reason: collision with root package name */
    public final File f39956a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, File> f39957b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantReadWriteLock f39958c;

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantReadWriteLock.ReadLock f39959d;

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantReadWriteLock.WriteLock f39960e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<f> f39961f;

    /* renamed from: g  reason: collision with root package name */
    private volatile long f39962g;

    /* renamed from: h  reason: collision with root package name */
    private volatile float f39963h;

    /* renamed from: i  reason: collision with root package name */
    private final g f39964i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f39965j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f39966k;

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* compiled from: DiskLruCache.java */
        /* renamed from: z2.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0562a extends com.bytedance.sdk.component.f.g {
            C0562a(String str, int i10) {
                super(str, i10);
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.l(cVar.f39962g);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.f.e.a(new C0562a("cleanupCmd", 1));
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    class b extends com.bytedance.sdk.component.f.g {
        b(String str, int i10) {
            super(str, i10);
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: z2.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0563c implements Comparator<File> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f39970a;

        C0563c(c cVar, HashMap hashMap) {
            this.f39970a = hashMap;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            int i10 = ((((Long) this.f39970a.get(file)).longValue() - ((Long) this.f39970a.get(file2)).longValue()) > 0L ? 1 : ((((Long) this.f39970a.get(file)).longValue() - ((Long) this.f39970a.get(file2)).longValue()) == 0L ? 0 : -1));
            if (i10 < 0) {
                return -1;
            }
            return i10 > 0 ? 1 : 0;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    class d extends com.bytedance.sdk.component.f.g {
        d(String str, int i10) {
            super(str, i10);
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.l(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public class e extends com.bytedance.sdk.component.f.g {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HashSet f39972d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c cVar, String str, int i10, HashSet hashSet) {
            super(str, i10);
            this.f39972d = hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f39972d.iterator();
            while (it.hasNext()) {
                try {
                    ((File) it.next()).delete();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public interface f {
        void a(String str);

        void a(Set<String> set);
    }

    public c(File file) throws IOException {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f39958c = reentrantReadWriteLock;
        this.f39959d = reentrantReadWriteLock.readLock();
        this.f39960e = reentrantReadWriteLock.writeLock();
        this.f39961f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f39962g = 104857600L;
        this.f39963h = 0.5f;
        this.f39964i = new g(null);
        this.f39965j = new a();
        this.f39966k = new Handler(Looper.getMainLooper());
        if (file != null && file.exists() && file.isDirectory() && file.canRead() && file.canWrite()) {
            this.f39956a = file;
            com.bytedance.sdk.component.f.e.a(new b("DiskLruCache", 5));
            return;
        }
        if (file == null) {
            str = " dir null";
        } else {
            str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
        }
        throw new IOException("dir error!  " + str);
    }

    private String f(File file) {
        return file.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f39960e.lock();
        try {
            File[] listFiles = this.f39956a.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                HashMap hashMap = new HashMap(listFiles.length);
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        hashMap.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new C0563c(this, hashMap));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.f39957b.put(f(file2), file2);
                }
            }
            this.f39960e.unlock();
            n();
        } catch (Throwable th) {
            this.f39960e.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[LOOP:3: B:41:0x00de->B:43:0x00e4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(long r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.l(long):void");
    }

    private void n() {
        this.f39966k.removeCallbacks(this.f39965j);
        this.f39966k.postDelayed(this.f39965j, 10000L);
    }

    @Override // z2.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f39964i.a(str);
    }

    @Override // z2.a
    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f39964i.b(str);
    }

    @Override // z2.a
    public File c(String str) {
        this.f39959d.lock();
        File file = this.f39957b.get(str);
        this.f39959d.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f39956a, str);
        this.f39960e.lock();
        this.f39957b.put(str, file2);
        this.f39960e.unlock();
        for (f fVar : this.f39961f) {
            fVar.a(str);
        }
        n();
        return file2;
    }

    @Override // z2.a
    public File d(String str) {
        if (this.f39959d.tryLock()) {
            File file = this.f39957b.get(str);
            this.f39959d.unlock();
            return file;
        }
        return null;
    }

    public void g() {
        y2.d.o().p();
        Context a10 = y2.e.a();
        if (a10 != null) {
            a3.c.b(a10).e(0);
        }
        this.f39966k.removeCallbacks(this.f39965j);
        com.bytedance.sdk.component.f.e.a(new d("clear", 1));
    }

    public void h(long j10) {
        this.f39962g = j10;
        n();
    }

    public void i(f fVar) {
        if (fVar != null) {
            this.f39961f.add(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Integer> f39973a;

        private g() {
            this.f39973a = new HashMap();
        }

        synchronized void a(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.f39973a.get(str);
                if (num == null) {
                    this.f39973a.put(str, 1);
                } else {
                    this.f39973a.put(str, Integer.valueOf(num.intValue() + 1));
                }
            }
        }

        synchronized void b(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.f39973a.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.f39973a.remove(str);
                } else {
                    this.f39973a.put(str, Integer.valueOf(num.intValue() - 1));
                }
            }
        }

        synchronized boolean c(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f39973a.containsKey(str);
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }
}
