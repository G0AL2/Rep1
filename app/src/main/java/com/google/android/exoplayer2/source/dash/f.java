package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import da.i;
import ea.n0;
import j8.j2;
import j8.p1;
import j8.q1;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p8.a0;
import p8.z;

/* compiled from: PlayerEmsgHandler.java */
/* loaded from: classes2.dex */
public final class f implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final da.b f21383a;

    /* renamed from: b  reason: collision with root package name */
    private final b f21384b;

    /* renamed from: f  reason: collision with root package name */
    private m9.c f21388f;

    /* renamed from: g  reason: collision with root package name */
    private long f21389g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21390h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21391i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f21392j;

    /* renamed from: e  reason: collision with root package name */
    private final TreeMap<Long, Long> f21387e = new TreeMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Handler f21386d = n0.x(this);

    /* renamed from: c  reason: collision with root package name */
    private final e9.a f21385c = new e9.a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f21393a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21394b;

        public a(long j10, long j11) {
            this.f21393a = j10;
            this.f21394b = j11;
        }
    }

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(long j10);

        void b();
    }

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: classes2.dex */
    public final class c implements a0 {

        /* renamed from: a  reason: collision with root package name */
        private final i9.n0 f21395a;

        /* renamed from: b  reason: collision with root package name */
        private final q1 f21396b = new q1();

        /* renamed from: c  reason: collision with root package name */
        private final c9.d f21397c = new c9.d();

        /* renamed from: d  reason: collision with root package name */
        private long f21398d = -9223372036854775807L;

        c(da.b bVar) {
            this.f21395a = i9.n0.l(bVar);
        }

        private c9.d g() {
            this.f21397c.g();
            if (this.f21395a.S(this.f21396b, this.f21397c, 0, false) == -4) {
                this.f21397c.q();
                return this.f21397c;
            }
            return null;
        }

        private void k(long j10, long j11) {
            f.this.f21386d.sendMessage(f.this.f21386d.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f21395a.K(false)) {
                c9.d g10 = g();
                if (g10 != null) {
                    long j10 = g10.f34292e;
                    Metadata a10 = f.this.f21385c.a(g10);
                    if (a10 != null) {
                        EventMessage eventMessage = (EventMessage) a10.f(0);
                        if (f.h(eventMessage.f21148a, eventMessage.f21149b)) {
                            m(j10, eventMessage);
                        }
                    }
                }
            }
            this.f21395a.s();
        }

        private void m(long j10, EventMessage eventMessage) {
            long f10 = f.f(eventMessage);
            if (f10 == -9223372036854775807L) {
                return;
            }
            k(j10, f10);
        }

        @Override // p8.a0
        public /* synthetic */ void a(ea.a0 a0Var, int i10) {
            z.b(this, a0Var, i10);
        }

        @Override // p8.a0
        public int b(i iVar, int i10, boolean z10, int i11) throws IOException {
            return this.f21395a.c(iVar, i10, z10);
        }

        @Override // p8.a0
        public /* synthetic */ int c(i iVar, int i10, boolean z10) {
            return z.a(this, iVar, i10, z10);
        }

        @Override // p8.a0
        public void d(p1 p1Var) {
            this.f21395a.d(p1Var);
        }

        @Override // p8.a0
        public void e(long j10, int i10, int i11, int i12, a0.a aVar) {
            this.f21395a.e(j10, i10, i11, i12, aVar);
            l();
        }

        @Override // p8.a0
        public void f(ea.a0 a0Var, int i10, int i11) {
            this.f21395a.a(a0Var, i10);
        }

        public boolean h(long j10) {
            return f.this.j(j10);
        }

        public void i(k9.f fVar) {
            long j10 = this.f21398d;
            if (j10 == -9223372036854775807L || fVar.f33392h > j10) {
                this.f21398d = fVar.f33392h;
            }
            f.this.m(fVar);
        }

        public boolean j(k9.f fVar) {
            long j10 = this.f21398d;
            return f.this.n(j10 != -9223372036854775807L && j10 < fVar.f33391g);
        }

        public void n() {
            this.f21395a.T();
        }
    }

    public f(m9.c cVar, b bVar, da.b bVar2) {
        this.f21388f = cVar;
        this.f21384b = bVar;
        this.f21383a = bVar2;
    }

    private Map.Entry<Long, Long> e(long j10) {
        return this.f21387e.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(EventMessage eventMessage) {
        try {
            return n0.J0(n0.D(eventMessage.f21152e));
        } catch (j2 unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f21387e.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f21387e.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f21387e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f21390h) {
            this.f21391i = true;
            this.f21390h = false;
            this.f21384b.b();
        }
    }

    private void l() {
        this.f21384b.a(this.f21389g);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f21387e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f21388f.f34339h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f21392j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f21393a, aVar.f21394b);
        return true;
    }

    boolean j(long j10) {
        m9.c cVar = this.f21388f;
        boolean z10 = false;
        if (cVar.f34335d) {
            if (this.f21391i) {
                return true;
            }
            Map.Entry<Long, Long> e10 = e(cVar.f34339h);
            if (e10 != null && e10.getValue().longValue() < j10) {
                this.f21389g = e10.getKey().longValue();
                l();
                z10 = true;
            }
            if (z10) {
                i();
            }
            return z10;
        }
        return false;
    }

    public c k() {
        return new c(this.f21383a);
    }

    void m(k9.f fVar) {
        this.f21390h = true;
    }

    boolean n(boolean z10) {
        if (this.f21388f.f34335d) {
            if (this.f21391i) {
                return true;
            }
            if (z10) {
                i();
                return true;
            }
            return false;
        }
        return false;
    }

    public void o() {
        this.f21392j = true;
        this.f21386d.removeCallbacksAndMessages(null);
    }

    public void q(m9.c cVar) {
        this.f21391i = false;
        this.f21389g = -9223372036854775807L;
        this.f21388f = cVar;
        p();
    }
}
