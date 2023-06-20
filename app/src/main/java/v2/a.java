package v2;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import l3.c;
import w2.b;

/* compiled from: SdkMediaDataSource.java */
/* loaded from: classes.dex */
public class a extends MediaDataSource {

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f37766e = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private b f37767a = null;

    /* renamed from: b  reason: collision with root package name */
    private long f37768b = -2147483648L;

    /* renamed from: c  reason: collision with root package name */
    private Context f37769c;

    /* renamed from: d  reason: collision with root package name */
    private final c f37770d;

    public a(Context context, c cVar) {
        this.f37769c = context;
        this.f37770d = cVar;
    }

    public static a b(Context context, c cVar) {
        a aVar = new a(context, cVar);
        f37766e.put(cVar.A(), aVar);
        return aVar;
    }

    private void d() {
        if (this.f37767a == null) {
            this.f37767a = new w2.c(this.f37769c, this.f37770d);
        }
    }

    public c a() {
        return this.f37770d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        o3.c.j("SdkMediaDataSource", "close: ", this.f37770d.z());
        b bVar = this.f37767a;
        if (bVar != null) {
            bVar.a();
        }
        f37766e.remove(this.f37770d.A());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        d();
        if (this.f37768b == -2147483648L) {
            if (this.f37769c == null || TextUtils.isEmpty(this.f37770d.z())) {
                return -1L;
            }
            this.f37768b = this.f37767a.b();
            o3.c.h("SdkMediaDataSource", "getSize: " + this.f37768b);
        }
        return this.f37768b;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
        d();
        int a10 = this.f37767a.a(j10, bArr, i10, i11);
        o3.c.h("SdkMediaDataSource", "readAt: position = " + j10 + "  buffer.length =" + bArr.length + "  offset = " + i10 + " size =" + a10 + "  current = " + Thread.currentThread());
        return a10;
    }
}
