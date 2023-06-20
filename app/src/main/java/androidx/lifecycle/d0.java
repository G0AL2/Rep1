package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.i;

/* compiled from: ServiceLifecycleDispatcher.java */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final q f3370a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3371b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f3372c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceLifecycleDispatcher.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final q f3373a;

        /* renamed from: b  reason: collision with root package name */
        final i.b f3374b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3375c = false;

        a(q qVar, i.b bVar) {
            this.f3373a = qVar;
            this.f3374b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3375c) {
                return;
            }
            this.f3373a.h(this.f3374b);
            this.f3375c = true;
        }
    }

    public d0(p pVar) {
        this.f3370a = new q(pVar);
    }

    private void f(i.b bVar) {
        a aVar = this.f3372c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f3370a, bVar);
        this.f3372c = aVar2;
        this.f3371b.postAtFrontOfQueue(aVar2);
    }

    public i a() {
        return this.f3370a;
    }

    public void b() {
        f(i.b.ON_START);
    }

    public void c() {
        f(i.b.ON_CREATE);
    }

    public void d() {
        f(i.b.ON_STOP);
        f(i.b.ON_DESTROY);
    }

    public void e() {
        f(i.b.ON_START);
    }
}
