package m8;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import m8.f;
import m8.g;
import m8.h;

/* compiled from: SimpleDecoder.java */
/* loaded from: classes2.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f34302a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f34303b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<I> f34304c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<O> f34305d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final I[] f34306e;

    /* renamed from: f  reason: collision with root package name */
    private final O[] f34307f;

    /* renamed from: g  reason: collision with root package name */
    private int f34308g;

    /* renamed from: h  reason: collision with root package name */
    private int f34309h;

    /* renamed from: i  reason: collision with root package name */
    private I f34310i;

    /* renamed from: j  reason: collision with root package name */
    private E f34311j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f34312k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f34313l;

    /* renamed from: m  reason: collision with root package name */
    private int f34314m;

    /* compiled from: SimpleDecoder.java */
    /* loaded from: classes2.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(I[] iArr, O[] oArr) {
        this.f34306e = iArr;
        this.f34308g = iArr.length;
        for (int i10 = 0; i10 < this.f34308g; i10++) {
            this.f34306e[i10] = g();
        }
        this.f34307f = oArr;
        this.f34309h = oArr.length;
        for (int i11 = 0; i11 < this.f34309h; i11++) {
            this.f34307f[i11] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f34302a = aVar;
        aVar.start();
    }

    private boolean f() {
        return !this.f34304c.isEmpty() && this.f34309h > 0;
    }

    private boolean k() throws InterruptedException {
        E i10;
        synchronized (this.f34303b) {
            while (!this.f34313l && !f()) {
                this.f34303b.wait();
            }
            if (this.f34313l) {
                return false;
            }
            I removeFirst = this.f34304c.removeFirst();
            O[] oArr = this.f34307f;
            int i11 = this.f34309h - 1;
            this.f34309h = i11;
            O o10 = oArr[i11];
            boolean z10 = this.f34312k;
            this.f34312k = false;
            if (removeFirst.l()) {
                o10.d(4);
            } else {
                if (removeFirst.k()) {
                    o10.d(RecyclerView.UNDEFINED_DURATION);
                }
                try {
                    i10 = j(removeFirst, o10, z10);
                } catch (OutOfMemoryError e10) {
                    i10 = i(e10);
                } catch (RuntimeException e11) {
                    i10 = i(e11);
                }
                if (i10 != null) {
                    synchronized (this.f34303b) {
                        this.f34311j = i10;
                    }
                    return false;
                }
            }
            synchronized (this.f34303b) {
                if (this.f34312k) {
                    o10.o();
                } else if (o10.k()) {
                    this.f34314m++;
                    o10.o();
                } else {
                    this.f34314m = 0;
                    this.f34305d.addLast(o10);
                }
                q(removeFirst);
            }
            return true;
        }
    }

    private void n() {
        if (f()) {
            this.f34303b.notify();
        }
    }

    private void o() throws f {
        E e10 = this.f34311j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void q(I i10) {
        i10.g();
        I[] iArr = this.f34306e;
        int i11 = this.f34308g;
        this.f34308g = i11 + 1;
        iArr[i11] = i10;
    }

    private void s(O o10) {
        o10.g();
        O[] oArr = this.f34307f;
        int i10 = this.f34309h;
        this.f34309h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (k());
    }

    @Override // m8.d
    public final void flush() {
        synchronized (this.f34303b) {
            this.f34312k = true;
            this.f34314m = 0;
            I i10 = this.f34310i;
            if (i10 != null) {
                q(i10);
                this.f34310i = null;
            }
            while (!this.f34304c.isEmpty()) {
                q(this.f34304c.removeFirst());
            }
            while (!this.f34305d.isEmpty()) {
                this.f34305d.removeFirst().o();
            }
        }
    }

    protected abstract I g();

    protected abstract O h();

    protected abstract E i(Throwable th);

    protected abstract E j(I i10, O o10, boolean z10);

    @Override // m8.d
    /* renamed from: l */
    public final I d() throws f {
        I i10;
        synchronized (this.f34303b) {
            o();
            ea.a.f(this.f34310i == null);
            int i11 = this.f34308g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f34306e;
                int i12 = i11 - 1;
                this.f34308g = i12;
                i10 = iArr[i12];
            }
            this.f34310i = i10;
        }
        return i10;
    }

    @Override // m8.d
    /* renamed from: m */
    public final O b() throws f {
        synchronized (this.f34303b) {
            o();
            if (this.f34305d.isEmpty()) {
                return null;
            }
            return this.f34305d.removeFirst();
        }
    }

    @Override // m8.d
    /* renamed from: p */
    public final void c(I i10) throws f {
        synchronized (this.f34303b) {
            o();
            ea.a.a(i10 == this.f34310i);
            this.f34304c.addLast(i10);
            n();
            this.f34310i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(O o10) {
        synchronized (this.f34303b) {
            s(o10);
            n();
        }
    }

    @Override // m8.d
    public void release() {
        synchronized (this.f34303b) {
            this.f34313l = true;
            this.f34303b.notify();
        }
        try {
            this.f34302a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(int i10) {
        ea.a.f(this.f34308g == this.f34306e.length);
        for (I i11 : this.f34306e) {
            i11.p(i10);
        }
    }
}
