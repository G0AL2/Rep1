package e0;

import android.os.Build;
import android.os.CancellationSignal;

/* compiled from: CancellationSignal.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f29473a;

    /* renamed from: b  reason: collision with root package name */
    private a f29474b;

    /* renamed from: c  reason: collision with root package name */
    private Object f29475c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29476d;

    /* compiled from: CancellationSignal.java */
    /* loaded from: classes.dex */
    public interface a {
        void onCancel();
    }

    private void f() {
        while (this.f29476d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f29473a) {
                return;
            }
            this.f29473a = true;
            this.f29476d = true;
            a aVar = this.f29474b;
            Object obj = this.f29475c;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f29476d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f29476d = false;
                notifyAll();
            }
        }
    }

    public Object b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f29475c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f29475c = cancellationSignal;
                if (this.f29473a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f29475c;
        }
        return obj;
    }

    public boolean c() {
        boolean z10;
        synchronized (this) {
            z10 = this.f29473a;
        }
        return z10;
    }

    public void d(a aVar) {
        synchronized (this) {
            f();
            if (this.f29474b == aVar) {
                return;
            }
            this.f29474b = aVar;
            if (this.f29473a && aVar != null) {
                aVar.onCancel();
            }
        }
    }

    public void e() {
        if (c()) {
            throw new i();
        }
    }
}
