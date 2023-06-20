package f0;

import android.graphics.Typeface;
import android.os.Handler;
import f0.e;
import f0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final f.c f29895a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f29896b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: f0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0374a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.c f29897a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f29898b;

        RunnableC0374a(a aVar, f.c cVar, Typeface typeface) {
            this.f29897a = cVar;
            this.f29898b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29897a.b(this.f29898b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.c f29899a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29900b;

        b(a aVar, f.c cVar, int i10) {
            this.f29899a = cVar;
            this.f29900b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29899a.a(this.f29900b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(f.c cVar, Handler handler) {
        this.f29895a = cVar;
        this.f29896b = handler;
    }

    private void a(int i10) {
        this.f29896b.post(new b(this, this.f29895a, i10));
    }

    private void c(Typeface typeface) {
        this.f29896b.post(new RunnableC0374a(this, this.f29895a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.C0375e c0375e) {
        if (c0375e.a()) {
            c(c0375e.f29922a);
        } else {
            a(c0375e.f29923b);
        }
    }
}
