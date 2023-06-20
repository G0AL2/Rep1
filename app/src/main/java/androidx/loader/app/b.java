package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.h;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.p;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.loader.app.a;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f3422c = false;

    /* renamed from: a  reason: collision with root package name */
    private final p f3423a;

    /* renamed from: b  reason: collision with root package name */
    private final c f3424b;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends w<D> implements c.InterfaceC0065c<D> {

        /* renamed from: l  reason: collision with root package name */
        private final int f3425l;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f3426m;

        /* renamed from: n  reason: collision with root package name */
        private final androidx.loader.content.c<D> f3427n;

        /* renamed from: o  reason: collision with root package name */
        private p f3428o;

        /* renamed from: p  reason: collision with root package name */
        private C0063b<D> f3429p;

        /* renamed from: q  reason: collision with root package name */
        private androidx.loader.content.c<D> f3430q;

        a(int i10, Bundle bundle, androidx.loader.content.c<D> cVar, androidx.loader.content.c<D> cVar2) {
            this.f3425l = i10;
            this.f3426m = bundle;
            this.f3427n = cVar;
            this.f3430q = cVar2;
            cVar.registerListener(i10, this);
        }

        @Override // androidx.loader.content.c.InterfaceC0065c
        public void a(androidx.loader.content.c<D> cVar, D d10) {
            if (b.f3422c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(d10);
                return;
            }
            if (b.f3422c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(d10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void k() {
            if (b.f3422c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f3427n.startLoading();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void l() {
            if (b.f3422c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f3427n.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void n(x<? super D> xVar) {
            super.n(xVar);
            this.f3428o = null;
            this.f3429p = null;
        }

        @Override // androidx.lifecycle.w, androidx.lifecycle.LiveData
        public void o(D d10) {
            super.o(d10);
            androidx.loader.content.c<D> cVar = this.f3430q;
            if (cVar != null) {
                cVar.reset();
                this.f3430q = null;
            }
        }

        androidx.loader.content.c<D> p(boolean z10) {
            if (b.f3422c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f3427n.cancelLoad();
            this.f3427n.abandon();
            C0063b<D> c0063b = this.f3429p;
            if (c0063b != null) {
                n(c0063b);
                if (z10) {
                    c0063b.d();
                }
            }
            this.f3427n.unregisterListener(this);
            if ((c0063b != null && !c0063b.c()) || z10) {
                this.f3427n.reset();
                return this.f3430q;
            }
            return this.f3427n;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3425l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3426m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3427n);
            androidx.loader.content.c<D> cVar = this.f3427n;
            cVar.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f3429p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f3429p);
                C0063b<D> c0063b = this.f3429p;
                c0063b.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().dataToString(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        androidx.loader.content.c<D> r() {
            return this.f3427n;
        }

        void s() {
            p pVar = this.f3428o;
            C0063b<D> c0063b = this.f3429p;
            if (pVar == null || c0063b == null) {
                return;
            }
            super.n(c0063b);
            i(pVar, c0063b);
        }

        androidx.loader.content.c<D> t(p pVar, a.InterfaceC0062a<D> interfaceC0062a) {
            C0063b<D> c0063b = new C0063b<>(this.f3427n, interfaceC0062a);
            i(pVar, c0063b);
            C0063b<D> c0063b2 = this.f3429p;
            if (c0063b2 != null) {
                n(c0063b2);
            }
            this.f3428o = pVar;
            this.f3429p = c0063b;
            return this.f3427n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f3425l);
            sb2.append(" : ");
            h0.b.a(this.f3427n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0063b<D> implements x<D> {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.loader.content.c<D> f3431a;

        /* renamed from: b  reason: collision with root package name */
        private final a.InterfaceC0062a<D> f3432b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3433c = false;

        C0063b(androidx.loader.content.c<D> cVar, a.InterfaceC0062a<D> interfaceC0062a) {
            this.f3431a = cVar;
            this.f3432b = interfaceC0062a;
        }

        @Override // androidx.lifecycle.x
        public void a(D d10) {
            if (b.f3422c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f3431a + ": " + this.f3431a.dataToString(d10));
            }
            this.f3432b.onLoadFinished(this.f3431a, d10);
            this.f3433c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f3433c);
        }

        boolean c() {
            return this.f3433c;
        }

        void d() {
            if (this.f3433c) {
                if (b.f3422c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f3431a);
                }
                this.f3432b.onLoaderReset(this.f3431a);
            }
        }

        public String toString() {
            return this.f3432b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class c extends e0 {

        /* renamed from: e  reason: collision with root package name */
        private static final f0.b f3434e = new a();

        /* renamed from: c  reason: collision with root package name */
        private h<a> f3435c = new h<>();

        /* renamed from: d  reason: collision with root package name */
        private boolean f3436d = false;

        /* compiled from: LoaderManagerImpl.java */
        /* loaded from: classes.dex */
        static class a implements f0.b {
            a() {
            }

            @Override // androidx.lifecycle.f0.b
            public <T extends e0> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c h(g0 g0Var) {
            return (c) new f0(g0Var, f3434e).a(c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.e0
        public void d() {
            super.d();
            int k10 = this.f3435c.k();
            for (int i10 = 0; i10 < k10; i10++) {
                this.f3435c.m(i10).p(true);
            }
            this.f3435c.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3435c.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f3435c.k(); i10++) {
                    a m10 = this.f3435c.m(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3435c.i(i10));
                    printWriter.print(": ");
                    printWriter.println(m10.toString());
                    m10.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            this.f3436d = false;
        }

        <D> a<D> i(int i10) {
            return this.f3435c.e(i10);
        }

        boolean j() {
            return this.f3436d;
        }

        void k() {
            int k10 = this.f3435c.k();
            for (int i10 = 0; i10 < k10; i10++) {
                this.f3435c.m(i10).s();
            }
        }

        void l(int i10, a aVar) {
            this.f3435c.j(i10, aVar);
        }

        void m() {
            this.f3436d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(p pVar, g0 g0Var) {
        this.f3423a = pVar;
        this.f3424b = c.h(g0Var);
    }

    private <D> androidx.loader.content.c<D> e(int i10, Bundle bundle, a.InterfaceC0062a<D> interfaceC0062a, androidx.loader.content.c<D> cVar) {
        try {
            this.f3424b.m();
            androidx.loader.content.c<D> onCreateLoader = interfaceC0062a.onCreateLoader(i10, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                }
                a aVar = new a(i10, bundle, onCreateLoader, cVar);
                if (f3422c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar);
                }
                this.f3424b.l(i10, aVar);
                this.f3424b.g();
                return aVar.t(this.f3423a, interfaceC0062a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f3424b.g();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3424b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public <D> androidx.loader.content.c<D> c(int i10, Bundle bundle, a.InterfaceC0062a<D> interfaceC0062a) {
        if (!this.f3424b.j()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> i11 = this.f3424b.i(i10);
                if (f3422c) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
                }
                if (i11 == null) {
                    return e(i10, bundle, interfaceC0062a, null);
                }
                if (f3422c) {
                    Log.v("LoaderManager", "  Re-using existing loader " + i11);
                }
                return i11.t(this.f3423a, interfaceC0062a);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f3424b.k();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        h0.b.a(this.f3423a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
