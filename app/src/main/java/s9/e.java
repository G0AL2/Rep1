package s9;

import ea.n0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import m8.h;
import r9.g;
import r9.j;
import r9.k;
import s9.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CeaDecoder.java */
/* loaded from: classes2.dex */
public abstract class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<b> f36899a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<k> f36900b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue<b> f36901c;

    /* renamed from: d  reason: collision with root package name */
    private b f36902d;

    /* renamed from: e  reason: collision with root package name */
    private long f36903e;

    /* renamed from: f  reason: collision with root package name */
    private long f36904f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CeaDecoder.java */
    /* loaded from: classes2.dex */
    public static final class b extends j implements Comparable<b> {

        /* renamed from: j  reason: collision with root package name */
        private long f36905j;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: v */
        public int compareTo(b bVar) {
            if (l() != bVar.l()) {
                return l() ? 1 : -1;
            }
            long j10 = this.f34292e - bVar.f34292e;
            if (j10 == 0) {
                j10 = this.f36905j - bVar.f36905j;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CeaDecoder.java */
    /* loaded from: classes2.dex */
    public static final class c extends k {

        /* renamed from: e  reason: collision with root package name */
        private h.a<c> f36906e;

        public c(h.a<c> aVar) {
            this.f36906e = aVar;
        }

        @Override // m8.h
        public final void o() {
            this.f36906e.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f36899a.add(new b());
        }
        this.f36900b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f36900b.add(new c(new h.a() { // from class: s9.d
                @Override // m8.h.a
                public final void a(h hVar) {
                    e.this.n((e.c) hVar);
                }
            }));
        }
        this.f36901c = new PriorityQueue<>();
    }

    private void m(b bVar) {
        bVar.g();
        this.f36899a.add(bVar);
    }

    @Override // r9.g
    public void a(long j10) {
        this.f36903e = j10;
    }

    protected abstract r9.f e();

    protected abstract void f(j jVar);

    @Override // m8.d
    public void flush() {
        this.f36904f = 0L;
        this.f36903e = 0L;
        while (!this.f36901c.isEmpty()) {
            m((b) n0.j(this.f36901c.poll()));
        }
        b bVar = this.f36902d;
        if (bVar != null) {
            m(bVar);
            this.f36902d = null;
        }
    }

    @Override // m8.d
    /* renamed from: g */
    public j d() throws r9.h {
        ea.a.f(this.f36902d == null);
        if (this.f36899a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f36899a.pollFirst();
        this.f36902d = pollFirst;
        return pollFirst;
    }

    @Override // m8.d
    /* renamed from: h */
    public k b() throws r9.h {
        if (this.f36900b.isEmpty()) {
            return null;
        }
        while (!this.f36901c.isEmpty() && ((b) n0.j(this.f36901c.peek())).f34292e <= this.f36903e) {
            b bVar = (b) n0.j(this.f36901c.poll());
            if (bVar.l()) {
                k kVar = (k) n0.j(this.f36900b.pollFirst());
                kVar.d(4);
                m(bVar);
                return kVar;
            }
            f(bVar);
            if (k()) {
                r9.f e10 = e();
                k kVar2 = (k) n0.j(this.f36900b.pollFirst());
                kVar2.p(bVar.f34292e, e10, Long.MAX_VALUE);
                m(bVar);
                return kVar2;
            }
            m(bVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k i() {
        return this.f36900b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long j() {
        return this.f36903e;
    }

    protected abstract boolean k();

    @Override // m8.d
    /* renamed from: l */
    public void c(j jVar) throws r9.h {
        ea.a.a(jVar == this.f36902d);
        b bVar = (b) jVar;
        if (bVar.k()) {
            m(bVar);
        } else {
            long j10 = this.f36904f;
            this.f36904f = 1 + j10;
            bVar.f36905j = j10;
            this.f36901c.add(bVar);
        }
        this.f36902d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(k kVar) {
        kVar.g();
        this.f36900b.add(kVar);
    }

    @Override // m8.d
    public void release() {
    }
}
