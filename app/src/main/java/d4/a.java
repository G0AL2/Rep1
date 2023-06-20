package d4;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import y3.p;

/* compiled from: StatFsHelper.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static a f29056h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f29057i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b  reason: collision with root package name */
    private volatile File f29059b;

    /* renamed from: d  reason: collision with root package name */
    private volatile File f29061d;

    /* renamed from: e  reason: collision with root package name */
    private long f29062e;

    /* renamed from: a  reason: collision with root package name */
    private volatile StatFs f29058a = null;

    /* renamed from: c  reason: collision with root package name */
    private volatile StatFs f29060c = null;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f29064g = false;

    /* renamed from: f  reason: collision with root package name */
    private final Lock f29063f = new ReentrantLock();

    /* compiled from: StatFsHelper.java */
    /* renamed from: d4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0366a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f29064g) {
            return;
        }
        this.f29063f.lock();
        try {
            if (!this.f29064g) {
                this.f29059b = Environment.getDataDirectory();
                this.f29061d = Environment.getExternalStorageDirectory();
                g();
                this.f29064g = true;
            }
        } finally {
            this.f29063f.unlock();
        }
    }

    public static synchronized a d() {
        a aVar;
        synchronized (a.class) {
            if (f29056h == null) {
                f29056h = new a();
            }
            aVar = f29056h;
        }
        return aVar;
    }

    private void e() {
        if (this.f29063f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f29062e > f29057i) {
                    g();
                }
            } finally {
                this.f29063f.unlock();
            }
        }
    }

    private void g() {
        this.f29058a = h(this.f29058a, this.f29059b);
        this.f29060c = h(this.f29060c, this.f29061d);
        this.f29062e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th) {
            throw p.a(th);
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    public long c(EnumC0366a enumC0366a) {
        long blockSize;
        long availableBlocks;
        b();
        e();
        StatFs statFs = enumC0366a == EnumC0366a.INTERNAL ? this.f29058a : this.f29060c;
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                blockSize = statFs.getBlockSize();
                availableBlocks = statFs.getAvailableBlocks();
            }
            return blockSize * availableBlocks;
        }
        return 0L;
    }

    public boolean f(EnumC0366a enumC0366a, long j10) {
        b();
        long c10 = c(enumC0366a);
        return c10 <= 0 || c10 < j10;
    }
}
