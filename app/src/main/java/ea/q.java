package ea;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ea.l;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ListenerSet.java */
/* loaded from: classes2.dex */
public final class q<T> {

    /* renamed from: a */
    private final ea.c f29727a;

    /* renamed from: b */
    private final n f29728b;

    /* renamed from: c */
    private final b<T> f29729c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<c<T>> f29730d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f29731e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f29732f;

    /* renamed from: g */
    private boolean f29733g;

    /* compiled from: ListenerSet.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        void b(T t10);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes2.dex */
    public interface b<T> {
        void a(T t10, l lVar);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes2.dex */
    public static final class c<T> {

        /* renamed from: a */
        public final T f29734a;

        /* renamed from: b */
        private l.b f29735b = new l.b();

        /* renamed from: c */
        private boolean f29736c;

        /* renamed from: d */
        private boolean f29737d;

        public c(T t10) {
            this.f29734a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f29737d) {
                return;
            }
            if (i10 != -1) {
                this.f29735b.a(i10);
            }
            this.f29736c = true;
            aVar.b(this.f29734a);
        }

        public void b(b<T> bVar) {
            if (this.f29737d || !this.f29736c) {
                return;
            }
            l e10 = this.f29735b.e();
            this.f29735b = new l.b();
            this.f29736c = false;
            bVar.a(this.f29734a, e10);
        }

        public void c(b<T> bVar) {
            this.f29737d = true;
            if (this.f29736c) {
                bVar.a(this.f29734a, this.f29735b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f29734a.equals(((c) obj).f29734a);
        }

        public int hashCode() {
            return this.f29734a.hashCode();
        }
    }

    public q(Looper looper, ea.c cVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, cVar, bVar);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        h(copyOnWriteArraySet, i10, aVar);
    }

    public static /* synthetic */ boolean b(q qVar, Message message) {
        return qVar.g(message);
    }

    public boolean g(Message message) {
        Iterator<c<T>> it = this.f29730d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f29729c);
            if (this.f29728b.b(0)) {
                return true;
            }
        }
        return true;
    }

    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        if (this.f29733g) {
            return;
        }
        ea.a.e(t10);
        this.f29730d.add(new c<>(t10));
    }

    public q<T> d(Looper looper, ea.c cVar, b<T> bVar) {
        return new q<>(this.f29730d, looper, cVar, bVar);
    }

    public q<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f29727a, bVar);
    }

    public void f() {
        if (this.f29732f.isEmpty()) {
            return;
        }
        if (!this.f29728b.b(0)) {
            n nVar = this.f29728b;
            nVar.h(nVar.a(0));
        }
        boolean z10 = !this.f29731e.isEmpty();
        this.f29731e.addAll(this.f29732f);
        this.f29732f.clear();
        if (z10) {
            return;
        }
        while (!this.f29731e.isEmpty()) {
            this.f29731e.peekFirst().run();
            this.f29731e.removeFirst();
        }
    }

    public void i(final int i10, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f29730d);
        this.f29732f.add(new Runnable() { // from class: ea.p
            @Override // java.lang.Runnable
            public final void run() {
                q.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        Iterator<c<T>> it = this.f29730d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f29729c);
        }
        this.f29730d.clear();
        this.f29733g = true;
    }

    public void k(T t10) {
        Iterator<c<T>> it = this.f29730d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f29734a.equals(t10)) {
                next.c(this.f29729c);
                this.f29730d.remove(next);
            }
        }
    }

    public void l(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }

    private q(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, ea.c cVar, b<T> bVar) {
        this.f29727a = cVar;
        this.f29730d = copyOnWriteArraySet;
        this.f29729c = bVar;
        this.f29731e = new ArrayDeque<>();
        this.f29732f = new ArrayDeque<>();
        this.f29728b = cVar.b(looper, new Handler.Callback() { // from class: ea.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return q.b(q.this, message);
            }
        });
    }
}
