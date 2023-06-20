package r9;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import jb.s;

/* compiled from: ExoplayerCuesDecoder.java */
/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final c f36517a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final j f36518b = new j();

    /* renamed from: c  reason: collision with root package name */
    private final Deque<k> f36519c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private int f36520d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36521e;

    /* compiled from: ExoplayerCuesDecoder.java */
    /* loaded from: classes2.dex */
    class a extends k {
        a() {
        }

        @Override // m8.h
        public void o() {
            d.this.i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoplayerCuesDecoder.java */
    /* loaded from: classes2.dex */
    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        private final long f36523a;

        /* renamed from: b  reason: collision with root package name */
        private final s<r9.b> f36524b;

        public b(long j10, s<r9.b> sVar) {
            this.f36523a = j10;
            this.f36524b = sVar;
        }

        @Override // r9.f
        public int a(long j10) {
            return this.f36523a > j10 ? 0 : -1;
        }

        @Override // r9.f
        public List<r9.b> b(long j10) {
            return j10 >= this.f36523a ? this.f36524b : s.t();
        }

        @Override // r9.f
        public long c(int i10) {
            ea.a.a(i10 == 0);
            return this.f36523a;
        }

        @Override // r9.f
        public int f() {
            return 1;
        }
    }

    public d() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f36519c.addFirst(new a());
        }
        this.f36520d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(k kVar) {
        ea.a.f(this.f36519c.size() < 2);
        ea.a.a(!this.f36519c.contains(kVar));
        kVar.g();
        this.f36519c.addFirst(kVar);
    }

    @Override // r9.g
    public void a(long j10) {
    }

    @Override // m8.d
    /* renamed from: f */
    public j d() throws h {
        ea.a.f(!this.f36521e);
        if (this.f36520d != 0) {
            return null;
        }
        this.f36520d = 1;
        return this.f36518b;
    }

    @Override // m8.d
    public void flush() {
        ea.a.f(!this.f36521e);
        this.f36518b.g();
        this.f36520d = 0;
    }

    @Override // m8.d
    /* renamed from: g */
    public k b() throws h {
        ea.a.f(!this.f36521e);
        if (this.f36520d != 2 || this.f36519c.isEmpty()) {
            return null;
        }
        k removeFirst = this.f36519c.removeFirst();
        if (this.f36518b.l()) {
            removeFirst.d(4);
        } else {
            j jVar = this.f36518b;
            removeFirst.p(this.f36518b.f34292e, new b(jVar.f34292e, this.f36517a.a(((ByteBuffer) ea.a.e(jVar.f34290c)).array())), 0L);
        }
        this.f36518b.g();
        this.f36520d = 0;
        return removeFirst;
    }

    @Override // m8.d
    /* renamed from: h */
    public void c(j jVar) throws h {
        ea.a.f(!this.f36521e);
        ea.a.f(this.f36520d == 1);
        ea.a.a(this.f36518b == jVar);
        this.f36520d = 2;
    }

    @Override // m8.d
    public void release() {
        this.f36521e = true;
    }
}
