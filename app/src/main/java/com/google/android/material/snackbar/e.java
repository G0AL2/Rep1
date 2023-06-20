package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes3.dex */
class e {

    /* renamed from: e  reason: collision with root package name */
    private static e f22522e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f22523a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f22524b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f22525c;

    /* renamed from: d  reason: collision with root package name */
    private c f22526d;

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes3.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarManager.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarManager.java */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<b> f22528a;

        /* renamed from: b  reason: collision with root package name */
        int f22529b;

        /* renamed from: c  reason: collision with root package name */
        boolean f22530c;

        boolean a(b bVar) {
            return bVar != null && this.f22528a.get() == bVar;
        }
    }

    private e() {
    }

    private boolean a(c cVar, int i10) {
        b bVar = cVar.f22528a.get();
        if (bVar != null) {
            this.f22524b.removeCallbacksAndMessages(cVar);
            bVar.a(i10);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b() {
        if (f22522e == null) {
            f22522e = new e();
        }
        return f22522e;
    }

    private boolean d(b bVar) {
        c cVar = this.f22525c;
        return cVar != null && cVar.a(bVar);
    }

    private void g(c cVar) {
        int i10 = cVar.f22529b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f22524b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f22524b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    void c(c cVar) {
        synchronized (this.f22523a) {
            if (this.f22525c == cVar || this.f22526d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.f22523a) {
            if (d(bVar)) {
                c cVar = this.f22525c;
                if (!cVar.f22530c) {
                    cVar.f22530c = true;
                    this.f22524b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f22523a) {
            if (d(bVar)) {
                c cVar = this.f22525c;
                if (cVar.f22530c) {
                    cVar.f22530c = false;
                    g(cVar);
                }
            }
        }
    }
}
