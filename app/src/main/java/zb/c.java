package zb;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;

/* compiled from: LogFileManager.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final b f40488c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final dc.f f40489a;

    /* renamed from: b  reason: collision with root package name */
    private zb.a f40490b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LogFileManager.java */
    /* loaded from: classes3.dex */
    public static final class b implements zb.a {
        private b() {
        }

        @Override // zb.a
        public void a() {
        }

        @Override // zb.a
        public String b() {
            return null;
        }

        @Override // zb.a
        public byte[] c() {
            return null;
        }

        @Override // zb.a
        public void d() {
        }

        @Override // zb.a
        public void e(long j10, String str) {
        }
    }

    public c(dc.f fVar) {
        this.f40489a = fVar;
        this.f40490b = f40488c;
    }

    private File d(String str) {
        return this.f40489a.n(str, "userlog");
    }

    public void a() {
        this.f40490b.d();
    }

    public byte[] b() {
        return this.f40490b.c();
    }

    public String c() {
        return this.f40490b.b();
    }

    public final void e(String str) {
        this.f40490b.a();
        this.f40490b = f40488c;
        if (str == null) {
            return;
        }
        f(d(str), Constants.MIN_PROGRESS_STEP);
    }

    void f(File file, int i10) {
        this.f40490b = new f(file, i10);
    }

    public void g(long j10, String str) {
        this.f40490b.e(j10, str);
    }

    public c(dc.f fVar, String str) {
        this(fVar);
        e(str);
    }
}
