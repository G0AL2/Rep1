package y2;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import y2.h;
import y2.i;
import y2.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DownloadTask.java */
/* loaded from: classes.dex */
public class b extends y2.a {

    /* renamed from: o  reason: collision with root package name */
    private final int f39143o;

    /* renamed from: p  reason: collision with root package name */
    private final InterfaceC0543b f39144p;

    /* renamed from: q  reason: collision with root package name */
    final Object f39145q;

    /* renamed from: r  reason: collision with root package name */
    final Object f39146r;

    /* renamed from: s  reason: collision with root package name */
    private volatile h.a f39147s;

    /* renamed from: t  reason: collision with root package name */
    private volatile b3.b f39148t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadTask.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f39149a;

        /* renamed from: b  reason: collision with root package name */
        String f39150b;

        /* renamed from: c  reason: collision with root package name */
        k f39151c;

        /* renamed from: d  reason: collision with root package name */
        z2.a f39152d;

        /* renamed from: e  reason: collision with root package name */
        a3.c f39153e;

        /* renamed from: f  reason: collision with root package name */
        List<i.b> f39154f;

        /* renamed from: g  reason: collision with root package name */
        int f39155g;

        /* renamed from: h  reason: collision with root package name */
        i f39156h;

        /* renamed from: i  reason: collision with root package name */
        InterfaceC0543b f39157i;

        /* renamed from: j  reason: collision with root package name */
        Object f39158j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i10) {
            this.f39155g = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a b(a3.c cVar) {
            if (cVar != null) {
                this.f39153e = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a c(Object obj) {
            this.f39158j = obj;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a d(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f39149a = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a e(List<i.b> list) {
            this.f39154f = list;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a f(InterfaceC0543b interfaceC0543b) {
            this.f39157i = interfaceC0543b;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a g(i iVar) {
            this.f39156h = iVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a h(k kVar) {
            if (kVar != null) {
                this.f39151c = kVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a i(z2.a aVar) {
            if (aVar != null) {
                this.f39152d = aVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b j() {
            if (this.f39152d != null && this.f39153e != null && !TextUtils.isEmpty(this.f39149a) && !TextUtils.isEmpty(this.f39150b) && this.f39151c != null) {
                return new b(this);
            }
            throw new IllegalArgumentException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a k(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f39150b = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }
    }

    /* compiled from: DownloadTask.java */
    /* renamed from: y2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0543b {
        void a(b bVar);
    }

    b(a aVar) {
        super(aVar.f39152d, aVar.f39153e);
        this.f39143o = aVar.f39155g;
        this.f39144p = aVar.f39157i;
        this.f39145q = this;
        this.f39135g = aVar.f39149a;
        this.f39136h = aVar.f39150b;
        this.f39134f = aVar.f39154f;
        this.f39138j = aVar.f39151c;
        this.f39137i = aVar.f39156h;
        this.f39146r = aVar.f39158j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0187, code lost:
        r13 = y2.e.f39190d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0189, code lost:
        if (r13 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018b, code lost:
        android.util.Log.w("TAG_PROXY_DownloadTask", "download, more data received, currentCacheFileSize: " + r5 + ", max: " + r12.f39143o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ab, code lost:
        f3.a.m(r6.g());
        r4.b();
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b8, code lost:
        if (r13 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ba, code lost:
        android.util.Log.w("TAG_PROXY_DownloadTask", "cancel call");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c1, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c6, code lost:
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cb, code lost:
        if (y2.e.f39190d == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cd, code lost:
        android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d4, code lost:
        f3.a.m(r6.g());
        r4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01de, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l(y2.k.a r13) throws java.io.IOException, y2.h.a, b3.a, b3.b {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.b.l(y2.k$a):void");
    }

    private boolean o() throws b3.a {
        while (this.f39138j.a()) {
            i();
            k.a b10 = this.f39138j.b();
            try {
                l(b10);
                return true;
            } catch (b3.b e10) {
                this.f39148t = e10;
                return false;
            } catch (b3.c e11) {
                b10.a();
                e(Boolean.valueOf(k()), this.f39135g, e11);
            } catch (IOException e12) {
                if (e12 instanceof SocketTimeoutException) {
                    b10.b();
                }
                if (!f()) {
                    e(Boolean.valueOf(k()), this.f39135g, e12);
                }
            } catch (h.a e13) {
                this.f39147s = e13;
                e(Boolean.valueOf(k()), this.f39135g, e13);
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h.a m() {
        return this.f39147s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b3.b n() {
        return this.f39148t;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f39129a.a(this.f39136h);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            o();
        } catch (Throwable unused) {
        }
        this.f39132d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.f39129a.b(this.f39136h);
        InterfaceC0543b interfaceC0543b = this.f39144p;
        if (interfaceC0543b != null) {
            interfaceC0543b.a(this);
        }
    }
}
