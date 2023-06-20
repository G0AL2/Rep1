package x2;

import android.content.Context;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n3.a;

/* compiled from: ReallyVideoPreload.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f38677a;

    /* renamed from: b  reason: collision with root package name */
    private l3.c f38678b;

    /* renamed from: d  reason: collision with root package name */
    private File f38680d;

    /* renamed from: e  reason: collision with root package name */
    private File f38681e;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f38679c = false;

    /* renamed from: f  reason: collision with root package name */
    private final List<a.InterfaceC0454a> f38682f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f38683g = false;

    public b(Context context, l3.c cVar) {
        this.f38680d = null;
        this.f38681e = null;
        this.f38677a = context;
        this.f38678b = cVar;
        this.f38680d = h3.c.c(cVar.a(), cVar.A());
        this.f38681e = h3.c.d(cVar.a(), cVar.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(l3.c cVar, int i10) {
        synchronized (a.InterfaceC0454a.class) {
            for (a.InterfaceC0454a interfaceC0454a : this.f38682f) {
                if (interfaceC0454a != null) {
                    interfaceC0454a.a(cVar, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(l3.c cVar, int i10, String str) {
        synchronized (a.InterfaceC0454a.class) {
            for (a.InterfaceC0454a interfaceC0454a : this.f38682f) {
                if (interfaceC0454a != null) {
                    interfaceC0454a.a(cVar, i10, str);
                }
            }
        }
    }

    private void l() {
        i.a aVar;
        if (i3.b.h() != null) {
            aVar = i3.b.h().b();
        } else {
            aVar = new i.a();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.a(this.f38678b.C(), timeUnit).b(this.f38678b.D(), timeUnit).c(this.f38678b.E(), timeUnit);
        i a10 = aVar.a();
        k.a aVar2 = new k.a();
        long length = this.f38680d.length();
        if (this.f38678b.x()) {
            aVar2.a("RANGE", "bytes=" + length + Constants.FILENAME_SEQUENCE_SEPARATOR).a(this.f38678b.z()).a().b();
        } else {
            aVar2.a("RANGE", "bytes=" + length + Constants.FILENAME_SEQUENCE_SEPARATOR + this.f38678b.h()).a(this.f38678b.z()).a().b();
        }
        a10.a(aVar2.b()).a(new a(length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(l3.c cVar, int i10) {
        synchronized (a.InterfaceC0454a.class) {
            for (a.InterfaceC0454a interfaceC0454a : this.f38682f) {
                if (interfaceC0454a != null) {
                    interfaceC0454a.b(cVar, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            this.f38681e.delete();
            this.f38680d.delete();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        try {
            if (this.f38680d.renameTo(this.f38681e)) {
                return;
            }
            throw new IOException("Error renaming file " + this.f38680d + " to " + this.f38681e + " for completion!");
        } finally {
        }
    }

    public l3.c a() {
        return this.f38678b;
    }

    public void f(a.InterfaceC0454a interfaceC0454a) {
        if (this.f38683g) {
            synchronized (a.InterfaceC0454a.class) {
                this.f38682f.add(interfaceC0454a);
            }
            return;
        }
        this.f38682f.add(interfaceC0454a);
        if (!this.f38681e.exists() && (this.f38678b.x() || this.f38680d.length() < this.f38678b.h())) {
            this.f38683g = true;
            this.f38678b.w(0);
            l();
            return;
        }
        o3.c.h("VideoPreload", "Cache file is exist");
        this.f38678b.w(1);
        d(this.f38678b, 200);
        c.b(this.f38678b);
    }

    public void j(boolean z10) {
        this.f38679c = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReallyVideoPreload.java */
    /* loaded from: classes.dex */
    public class a implements com.bytedance.sdk.component.b.a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f38684a;

        a(long j10) {
            this.f38684a = j10;
        }

        @Override // com.bytedance.sdk.component.b.a.c
        public void a(com.bytedance.sdk.component.b.a.b bVar, IOException iOException) {
            b bVar2 = b.this;
            bVar2.e(bVar2.f38678b, IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, iOException.getMessage());
            c.b(b.this.f38678b);
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x0197 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x017f A[Catch: all -> 0x01ca, TryCatch #6 {all -> 0x01ca, blocks: (B:31:0x0105, B:32:0x010a, B:34:0x0113, B:36:0x011b, B:39:0x016b, B:41:0x0171, B:47:0x017f, B:49:0x019c, B:51:0x01a8, B:53:0x01b6, B:54:0x01bb), top: B:99:0x0105 }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x024e A[Catch: all -> 0x0298, TryCatch #4 {all -> 0x0298, blocks: (B:78:0x023e, B:80:0x024e, B:81:0x0252), top: B:95:0x023e }] */
        @Override // com.bytedance.sdk.component.b.a.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.bytedance.sdk.component.b.a.b r23, com.bytedance.sdk.component.b.a.m r24) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 736
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: x2.b.a.a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
        }
    }
}
