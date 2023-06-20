package w2;

import android.content.Context;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoCacheImpl.java */
/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: c  reason: collision with root package name */
    private File f38170c;

    /* renamed from: d  reason: collision with root package name */
    private File f38171d;

    /* renamed from: e  reason: collision with root package name */
    private long f38172e;

    /* renamed from: i  reason: collision with root package name */
    private RandomAccessFile f38176i;

    /* renamed from: j  reason: collision with root package name */
    private final l3.c f38177j;

    /* renamed from: a  reason: collision with root package name */
    private volatile long f38168a = -2147483648L;

    /* renamed from: b  reason: collision with root package name */
    private final Object f38169b = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile long f38173f = -1;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f38174g = false;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f38175h = false;

    public c(Context context, l3.c cVar) {
        this.f38172e = 0L;
        this.f38176i = null;
        this.f38177j = cVar;
        try {
            this.f38170c = h3.c.c(cVar.a(), cVar.A());
            this.f38171d = h3.c.d(cVar.a(), cVar.A());
            if (i()) {
                this.f38176i = new RandomAccessFile(this.f38171d, "r");
            } else {
                this.f38176i = new RandomAccessFile(this.f38170c, "rw");
            }
            if (i()) {
                return;
            }
            this.f38172e = this.f38170c.length();
            g();
        } catch (Throwable unused) {
            o3.c.j("VideoCacheImpl", "Error using file ", cVar.z(), " as disc cache");
        }
    }

    private boolean i() {
        return this.f38171d.exists();
    }

    private long j() {
        if (i()) {
            return this.f38171d.length();
        }
        return this.f38170c.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws IOException {
        synchronized (this.f38169b) {
            if (i()) {
                o3.c.j("VideoCacheImpl", "complete: isCompleted ", this.f38177j.z(), this.f38177j.A());
            } else if (this.f38170c.renameTo(this.f38171d)) {
                RandomAccessFile randomAccessFile = this.f38176i;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f38176i = new RandomAccessFile(this.f38171d, "rw");
                o3.c.j("VideoCacheImpl", "complete: rename ", this.f38177j.A(), this.f38177j.z());
            } else {
                throw new IOException("Error renaming file " + this.f38170c + " to " + this.f38171d + " for completion!");
            }
        }
    }

    @Override // w2.b
    public int a(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (j10 == this.f38168a) {
                return -1;
            }
            int i12 = 0;
            int i13 = 0;
            while (!this.f38174g) {
                synchronized (this.f38169b) {
                    long j11 = j();
                    if (j10 < j11) {
                        o3.c.h("VideoCacheImpl", "read:  read " + j10 + " success");
                        this.f38176i.seek(j10);
                        i13 = this.f38176i.read(bArr, i10, i11);
                    } else {
                        o3.c.j("VideoCacheImpl", "read: wait at ", Long.valueOf(j10), "  file size = ", Long.valueOf(j11));
                        i12 += 33;
                        this.f38169b.wait(33L);
                    }
                }
                if (i13 > 0) {
                    return i13;
                }
                if (i12 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    public void g() {
        i.a aVar;
        if (i3.b.h() != null) {
            aVar = i3.b.h().b();
        } else {
            aVar = new i.a();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.a(this.f38177j.C(), timeUnit).b(this.f38177j.D(), timeUnit).c(this.f38177j.E(), timeUnit);
        i a10 = aVar.a();
        o3.c.j("VideoCacheImpl", "RANGE, bytes=", Long.valueOf(this.f38172e), " file hash=", this.f38177j.A());
        k.a aVar2 = new k.a();
        a10.a(aVar2.a("RANGE", "bytes=" + this.f38172e + Constants.FILENAME_SEQUENCE_SEPARATOR).a(this.f38177j.z()).a().b()).a(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCacheImpl.java */
    /* loaded from: classes.dex */
    public class a implements com.bytedance.sdk.component.b.a.c {
        a() {
        }

        @Override // com.bytedance.sdk.component.b.a.c
        public void a(com.bytedance.sdk.component.b.a.b bVar, IOException iOException) {
            c.this.f38175h = false;
            c.this.f38168a = -1L;
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x0155 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x012b A[Catch: all -> 0x01bb, TryCatch #4 {all -> 0x01bb, blocks: (B:8:0x001b, B:11:0x0025, B:28:0x0073, B:29:0x007f, B:31:0x009a, B:33:0x00a5, B:38:0x00ba, B:40:0x012b, B:41:0x0131, B:49:0x0159, B:53:0x019f, B:42:0x0132, B:43:0x014d, B:44:0x014e), top: B:108:0x001b }] */
        @Override // com.bytedance.sdk.component.b.a.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.bytedance.sdk.component.b.a.b r25, com.bytedance.sdk.component.b.a.m r26) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 652
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w2.c.a.a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
        }
    }

    @Override // w2.b
    public long b() throws IOException {
        if (i()) {
            this.f38168a = this.f38171d.length();
        } else {
            synchronized (this.f38169b) {
                int i10 = 0;
                do {
                    if (this.f38168a == -2147483648L) {
                        try {
                            o3.c.h("VideoCacheImpl", "totalLength: wait");
                            i10 += 15;
                            this.f38169b.wait(5L);
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                            throw new IOException("total length InterruptException");
                        }
                    }
                } while (i10 <= 20000);
                return -1L;
            }
        }
        o3.c.j("VideoCacheImpl", "totalLength= ", Long.valueOf(this.f38168a));
        return this.f38168a;
    }

    @Override // w2.b
    public void a() {
        try {
            if (!this.f38174g) {
                this.f38176i.close();
            }
        } finally {
            this.f38174g = true;
        }
        this.f38174g = true;
    }
}
