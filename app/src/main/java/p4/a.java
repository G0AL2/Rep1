package p4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import h5.b;
import java.io.Closeable;
import o4.i;
import w5.h;
import y3.k;
import y3.n;

/* compiled from: ImagePerfControllerListener2.java */
/* loaded from: classes.dex */
public class a extends h5.a<h> implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final f4.b f35502a;

    /* renamed from: b  reason: collision with root package name */
    private final i f35503b;

    /* renamed from: c  reason: collision with root package name */
    private final o4.h f35504c;

    /* renamed from: d  reason: collision with root package name */
    private final n<Boolean> f35505d;

    /* renamed from: e  reason: collision with root package name */
    private final n<Boolean> f35506e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f35507f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagePerfControllerListener2.java */
    /* renamed from: p4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class HandlerC0474a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final o4.h f35508a;

        public HandlerC0474a(Looper looper, o4.h hVar) {
            super(looper);
            this.f35508a = hVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            i iVar = (i) k.g(message.obj);
            int i10 = message.what;
            if (i10 == 1) {
                this.f35508a.a(iVar, message.arg1);
            } else if (i10 != 2) {
            } else {
                this.f35508a.b(iVar, message.arg1);
            }
        }
    }

    public a(f4.b bVar, i iVar, o4.h hVar, n<Boolean> nVar, n<Boolean> nVar2) {
        this.f35502a = bVar;
        this.f35503b = iVar;
        this.f35504c = hVar;
        this.f35505d = nVar;
        this.f35506e = nVar2;
    }

    private void A(i iVar, long j10) {
        iVar.A(false);
        iVar.t(j10);
        U(iVar, 2);
    }

    private boolean O() {
        boolean booleanValue = this.f35505d.get().booleanValue();
        if (booleanValue && this.f35507f == null) {
            q();
        }
        return booleanValue;
    }

    private void T(i iVar, int i10) {
        if (O()) {
            Message obtainMessage = ((Handler) k.g(this.f35507f)).obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i10;
            obtainMessage.obj = iVar;
            this.f35507f.sendMessage(obtainMessage);
            return;
        }
        this.f35504c.a(iVar, i10);
    }

    private void U(i iVar, int i10) {
        if (O()) {
            Message obtainMessage = ((Handler) k.g(this.f35507f)).obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = i10;
            obtainMessage.obj = iVar;
            this.f35507f.sendMessage(obtainMessage);
            return;
        }
        this.f35504c.b(iVar, i10);
    }

    private synchronized void q() {
        if (this.f35507f != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
        handlerThread.start();
        this.f35507f = new HandlerC0474a((Looper) k.g(handlerThread.getLooper()), this.f35504c);
    }

    private i w() {
        return this.f35506e.get().booleanValue() ? new i() : this.f35503b;
    }

    public void C(i iVar, long j10) {
        iVar.A(true);
        iVar.z(j10);
        U(iVar, 1);
    }

    public void L() {
        w().b();
    }

    @Override // h5.a, h5.b
    public void b(String str, b.a aVar) {
        long now = this.f35502a.now();
        i w10 = w();
        w10.m(aVar);
        w10.h(str);
        int a10 = w10.a();
        if (a10 != 3 && a10 != 5 && a10 != 6) {
            w10.e(now);
            T(w10, 4);
        }
        A(w10, now);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        L();
    }

    @Override // h5.a, h5.b
    public void d(String str, Object obj, b.a aVar) {
        long now = this.f35502a.now();
        i w10 = w();
        w10.c();
        w10.k(now);
        w10.h(str);
        w10.d(obj);
        w10.m(aVar);
        T(w10, 0);
        C(w10, now);
    }

    @Override // h5.a, h5.b
    public void e(String str, Throwable th, b.a aVar) {
        long now = this.f35502a.now();
        i w10 = w();
        w10.m(aVar);
        w10.f(now);
        w10.h(str);
        w10.l(th);
        T(w10, 5);
        A(w10, now);
    }

    @Override // h5.a, h5.b
    /* renamed from: y */
    public void h(String str, h hVar, b.a aVar) {
        long now = this.f35502a.now();
        i w10 = w();
        w10.m(aVar);
        w10.g(now);
        w10.r(now);
        w10.h(str);
        w10.n(hVar);
        T(w10, 3);
    }

    @Override // h5.a, h5.b
    /* renamed from: z */
    public void a(String str, h hVar) {
        long now = this.f35502a.now();
        i w10 = w();
        w10.j(now);
        w10.h(str);
        w10.n(hVar);
        T(w10, 2);
    }
}
