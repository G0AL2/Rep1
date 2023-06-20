package b1;

import android.annotation.SuppressLint;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import qe.g;
import qe.k;

/* compiled from: ProcessLock.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0090a f4765e = new C0090a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Lock> f4766f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4767a;

    /* renamed from: b  reason: collision with root package name */
    private final File f4768b;
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: c  reason: collision with root package name */
    private final Lock f4769c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f4770d;

    /* compiled from: ProcessLock.kt */
    /* renamed from: b1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0090a {
        private C0090a() {
        }

        public /* synthetic */ C0090a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f4766f) {
                Map map = a.f4766f;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    map.put(str, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }
    }

    public a(String str, File file, boolean z10) {
        k.f(str, "name");
        k.f(file, "lockDir");
        this.f4767a = z10;
        File file2 = new File(file, str + ".lck");
        this.f4768b = file2;
        C0090a c0090a = f4765e;
        String absolutePath = file2.getAbsolutePath();
        k.e(absolutePath, "lockFile.absolutePath");
        this.f4769c = c0090a.b(absolutePath);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f4767a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f4769c.lock();
        if (z10) {
            try {
                File parentFile = this.f4768b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f4768b).getChannel();
                channel.lock();
                this.f4770d = channel;
            } catch (IOException e10) {
                this.f4770d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f4770d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f4769c.unlock();
    }
}
