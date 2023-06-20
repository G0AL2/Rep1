package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.e;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h implements Handler.Callback, m.a, n.a {
    public c A;
    public long B;
    public a C;
    public a D;
    public a E;
    public p F;

    /* renamed from: a  reason: collision with root package name */
    public final n[] f19058a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.a[] f19059b;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g f19060c;

    /* renamed from: d  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.c f19061d;

    /* renamed from: e  reason: collision with root package name */
    public final q f19062e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f19063f;

    /* renamed from: g  reason: collision with root package name */
    public final HandlerThread f19064g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f19065h;

    /* renamed from: i  reason: collision with root package name */
    public final e f19066i;

    /* renamed from: j  reason: collision with root package name */
    public final p.c f19067j;

    /* renamed from: k  reason: collision with root package name */
    public final p.b f19068k;

    /* renamed from: l  reason: collision with root package name */
    public b f19069l;

    /* renamed from: m  reason: collision with root package name */
    public m f19070m;

    /* renamed from: n  reason: collision with root package name */
    public n f19071n;

    /* renamed from: o  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g f19072o;

    /* renamed from: p  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.n f19073p;

    /* renamed from: q  reason: collision with root package name */
    public n[] f19074q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f19075r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f19076s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f19077t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f19078u;

    /* renamed from: v  reason: collision with root package name */
    public int f19079v = 1;

    /* renamed from: w  reason: collision with root package name */
    public int f19080w;

    /* renamed from: x  reason: collision with root package name */
    public int f19081x;

    /* renamed from: y  reason: collision with root package name */
    public long f19082y;

    /* renamed from: z  reason: collision with root package name */
    public int f19083z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.source.m f19084a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f19085b;

        /* renamed from: c  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.source.o[] f19086c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f19087d;

        /* renamed from: e  reason: collision with root package name */
        public final long f19088e;

        /* renamed from: f  reason: collision with root package name */
        public int f19089f;

        /* renamed from: g  reason: collision with root package name */
        public long f19090g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f19091h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f19092i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f19093j;

        /* renamed from: k  reason: collision with root package name */
        public a f19094k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f19095l;

        /* renamed from: m  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f19096m;

        /* renamed from: n  reason: collision with root package name */
        public final n[] f19097n;

        /* renamed from: o  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.a[] f19098o;

        /* renamed from: p  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g f19099p;

        /* renamed from: q  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.c f19100q;

        /* renamed from: r  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.source.n f19101r;

        /* renamed from: s  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f19102s;

        public a(n[] nVarArr, com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, long j10, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar, Object obj, int i10, boolean z10, long j11) {
            this.f19097n = nVarArr;
            this.f19098o = aVarArr;
            this.f19088e = j10;
            this.f19099p = gVar;
            this.f19100q = cVar;
            this.f19101r = nVar;
            this.f19085b = com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(obj);
            this.f19089f = i10;
            this.f19091h = z10;
            this.f19090g = j11;
            this.f19086c = new com.fyber.inneractive.sdk.player.exoplayer2.source.o[nVarArr.length];
            this.f19087d = new boolean[nVarArr.length];
            this.f19084a = nVar.a(i10, cVar.a(), j11);
        }

        public long a() {
            return this.f19088e - this.f19090g;
        }

        public boolean b() {
            return this.f19092i && (!this.f19093j || this.f19084a.d() == Long.MIN_VALUE);
        }

        public void c() {
            try {
                this.f19101r.a(this.f19084a);
            } catch (RuntimeException e10) {
                Log.e("ExoPlayerImplInternal", "Period release failed.", e10);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean d() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
            /*
                r6 = this;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g r0 = r6.f19099p
                com.fyber.inneractive.sdk.player.exoplayer2.a[] r1 = r6.f19098o
                com.fyber.inneractive.sdk.player.exoplayer2.source.m r2 = r6.f19084a
                com.fyber.inneractive.sdk.player.exoplayer2.source.s r2 = r2.b()
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r0 = r0.a(r1, r2)
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r1 = r6.f19102s
                r0.getClass()
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L18
                goto L25
            L18:
                r4 = 0
            L19:
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r0.f19371b
                int r5 = r5.f19367a
                if (r4 >= r5) goto L2a
                boolean r5 = r0.a(r1, r4)
                if (r5 != 0) goto L27
            L25:
                r1 = 0
                goto L2b
            L27:
                int r4 = r4 + 1
                goto L19
            L2a:
                r1 = 1
            L2b:
                if (r1 == 0) goto L2e
                return r3
            L2e:
                r6.f19096m = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.h.a.d():boolean");
        }

        public long a(long j10, boolean z10, boolean[] zArr) {
            int i10;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f fVar = this.f19096m.f19371b;
            int i11 = 0;
            while (true) {
                boolean z11 = true;
                if (i11 >= fVar.f19367a) {
                    break;
                }
                boolean[] zArr2 = this.f19087d;
                if (z10 || !this.f19096m.a(this.f19102s, i11)) {
                    z11 = false;
                }
                zArr2[i11] = z11;
                i11++;
            }
            long a10 = this.f19084a.a((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[]) fVar.f19368b.clone(), this.f19087d, this.f19086c, zArr, j10);
            this.f19102s = this.f19096m;
            this.f19093j = false;
            int i12 = 0;
            while (true) {
                com.fyber.inneractive.sdk.player.exoplayer2.source.o[] oVarArr = this.f19086c;
                if (i12 >= oVarArr.length) {
                    break;
                }
                if (oVarArr[i12] != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(fVar.f19368b[i12] != null);
                    this.f19093j = true;
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(fVar.f19368b[i12] == null);
                }
                i12++;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.c cVar = this.f19100q;
            n[] nVarArr = this.f19097n;
            s sVar = this.f19096m.f19370a;
            cVar.f18110f = 0;
            for (int i13 = 0; i13 < nVarArr.length; i13++) {
                if (fVar.f19368b[i13] != null) {
                    int i14 = cVar.f18110f;
                    int k10 = nVarArr[i13].k();
                    int i15 = u.f19606a;
                    if (k10 == 0) {
                        i10 = 16777216;
                    } else if (k10 == 1) {
                        i10 = 3538944;
                    } else if (k10 == 2) {
                        i10 = 13107200;
                    } else if (k10 != 3 && k10 != 4) {
                        throw new IllegalStateException();
                    } else {
                        i10 = 131072;
                    }
                    cVar.f18110f = i14 + i10;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = cVar.f18105a;
            int i16 = cVar.f18110f;
            synchronized (kVar) {
                boolean z12 = i16 < kVar.f19473e;
                kVar.f19473e = i16;
                if (z12) {
                    kVar.b();
                }
            }
            return a10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f19103a;

        /* renamed from: b  reason: collision with root package name */
        public final long f19104b;

        /* renamed from: c  reason: collision with root package name */
        public volatile long f19105c;

        /* renamed from: d  reason: collision with root package name */
        public volatile long f19106d;

        public b(int i10, long j10) {
            this.f19103a = i10;
            this.f19104b = j10;
            this.f19105c = j10;
            this.f19106d = j10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final p f19107a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19108b;

        /* renamed from: c  reason: collision with root package name */
        public final long f19109c;

        public c(p pVar, int i10, long j10) {
            this.f19107a = pVar;
            this.f19108b = i10;
            this.f19109c = j10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final p f19110a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f19111b;

        /* renamed from: c  reason: collision with root package name */
        public final b f19112c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19113d;

        public d(p pVar, Object obj, b bVar, int i10) {
            this.f19110a = pVar;
            this.f19111b = obj;
            this.f19112c = bVar;
            this.f19113d = i10;
        }
    }

    public h(n[] nVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.c cVar, boolean z10, Handler handler, b bVar, e eVar) {
        this.f19058a = nVarArr;
        this.f19060c = gVar;
        this.f19061d = cVar;
        this.f19076s = z10;
        this.f19065h = handler;
        this.f19069l = bVar;
        this.f19066i = eVar;
        this.f19059b = new com.fyber.inneractive.sdk.player.exoplayer2.a[nVarArr.length];
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            nVarArr[i10].a(i10);
            this.f19059b[i10] = nVarArr[i10].m();
        }
        this.f19062e = new q();
        this.f19074q = new n[0];
        this.f19067j = new p.c();
        this.f19068k = new p.b();
        this.f19070m = m.f19141d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f19064g = handlerThread;
        handlerThread.start();
        this.f19063f = new Handler(handlerThread.getLooper(), this);
    }

    public void a(com.fyber.inneractive.sdk.player.exoplayer2.source.p pVar) {
        this.f19063f.obtainMessage(9, (com.fyber.inneractive.sdk.player.exoplayer2.source.m) pVar).sendToTarget();
    }

    public final void b(c cVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.F == null) {
            this.f19083z++;
            this.A = cVar;
            return;
        }
        Pair<Integer, Long> a10 = a(cVar);
        if (a10 == null) {
            b bVar = new b(0, 0L);
            this.f19069l = bVar;
            this.f19065h.obtainMessage(4, 1, 0, bVar).sendToTarget();
            this.f19069l = new b(0, -9223372036854775807L);
            a(4);
            b(false);
            return;
        }
        int i10 = cVar.f19109c == -9223372036854775807L ? 1 : 0;
        int intValue = ((Integer) a10.first).intValue();
        long longValue = ((Long) a10.second).longValue();
        try {
            b bVar2 = this.f19069l;
            if (intValue == bVar2.f19103a && longValue / 1000 == bVar2.f19105c / 1000) {
                return;
            }
            long b10 = b(intValue, longValue);
            int i11 = i10 | (longValue == b10 ? 0 : 1);
            b bVar3 = new b(intValue, b10);
            this.f19069l = bVar3;
            this.f19065h.obtainMessage(4, i11, 0, bVar3).sendToTarget();
        } finally {
            b bVar4 = new b(intValue, longValue);
            this.f19069l = bVar4;
            this.f19065h.obtainMessage(4, i10, 0, bVar4).sendToTarget();
        }
    }

    public final void c(boolean z10) {
        if (this.f19078u != z10) {
            this.f19078u = z10;
            this.f19065h.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void d(boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.f19077t = false;
        this.f19076s = z10;
        if (!z10) {
            h();
            i();
            b(false);
            return;
        }
        int i10 = this.f19079v;
        if (i10 == 3) {
            f();
            this.f19063f.sendEmptyMessage(2);
        } else if (i10 == 2) {
            this.f19063f.sendEmptyMessage(2);
        }
    }

    public final void e() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar = this.E;
        if (aVar == null) {
            return;
        }
        boolean z10 = true;
        while (aVar != null && aVar.f19092i) {
            if (aVar.d()) {
                if (z10) {
                    a aVar2 = this.D;
                    a aVar3 = this.E;
                    boolean z11 = aVar2 != aVar3;
                    a(aVar3.f19094k);
                    a aVar4 = this.E;
                    aVar4.f19094k = null;
                    this.C = aVar4;
                    this.D = aVar4;
                    boolean[] zArr = new boolean[this.f19058a.length];
                    long a10 = aVar4.a(this.f19069l.f19105c, z11, zArr);
                    if (a10 != this.f19069l.f19105c) {
                        this.f19069l.f19105c = a10;
                        b(a10);
                    }
                    boolean[] zArr2 = new boolean[this.f19058a.length];
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        n[] nVarArr = this.f19058a;
                        if (i10 >= nVarArr.length) {
                            break;
                        }
                        n nVar = nVarArr[i10];
                        zArr2[i10] = nVar.a() != 0;
                        com.fyber.inneractive.sdk.player.exoplayer2.source.o oVar = this.E.f19086c[i10];
                        if (oVar != null) {
                            i11++;
                        }
                        if (zArr2[i10]) {
                            if (oVar != nVar.n()) {
                                if (nVar == this.f19071n) {
                                    if (oVar == null) {
                                        this.f19062e.a(this.f19072o);
                                    }
                                    this.f19072o = null;
                                    this.f19071n = null;
                                }
                                a(nVar);
                                nVar.l();
                            } else if (zArr[i10]) {
                                nVar.a(this.B);
                            }
                        }
                        i10++;
                    }
                    this.f19065h.obtainMessage(3, aVar.f19096m).sendToTarget();
                    a(zArr2, i11);
                } else {
                    this.C = aVar;
                    for (a aVar5 = aVar.f19094k; aVar5 != null; aVar5 = aVar5.f19094k) {
                        aVar5.c();
                    }
                    a aVar6 = this.C;
                    aVar6.f19094k = null;
                    if (aVar6.f19092i) {
                        long max = Math.max(aVar6.f19090g, this.B - aVar6.a());
                        a aVar7 = this.C;
                        aVar7.a(max, false, new boolean[aVar7.f19097n.length]);
                    }
                }
                b();
                i();
                this.f19063f.sendEmptyMessage(2);
                return;
            }
            if (aVar == this.D) {
                z10 = false;
            }
            aVar = aVar.f19094k;
        }
    }

    public final void f() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.f19077t = false;
        q qVar = this.f19062e;
        if (!qVar.f19599a) {
            qVar.f19601c = SystemClock.elapsedRealtime();
            qVar.f19599a = true;
        }
        for (n nVar : this.f19074q) {
            nVar.f();
        }
    }

    public final void g() {
        b(true);
        this.f19061d.a(true);
        a(1);
    }

    public final void h() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        q qVar = this.f19062e;
        if (qVar.f19599a) {
            qVar.a(qVar.o());
            qVar.f19599a = false;
        }
        for (n nVar : this.f19074q) {
            a(nVar);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.n) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    d(message.arg1 != 0);
                    return true;
                case 2:
                    a();
                    return true;
                case 3:
                    b((c) message.obj);
                    return true;
                case 4:
                    a((m) message.obj);
                    return true;
                case 5:
                    g();
                    return true;
                case 6:
                    d();
                    return true;
                case 7:
                    a((Pair) message.obj);
                    return true;
                case 8:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.m) message.obj);
                    return true;
                case 9:
                    com.fyber.inneractive.sdk.player.exoplayer2.source.m mVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.m) message.obj;
                    a aVar = this.C;
                    if (aVar != null && aVar.f19084a == mVar) {
                        b();
                    }
                    return true;
                case 10:
                    e();
                    return true;
                case 11:
                    a((e.c[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.d e10) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e10);
            this.f19065h.obtainMessage(8, e10).sendToTarget();
            g();
            return true;
        } catch (IOException e11) {
            Log.e("ExoPlayerImplInternal", "Source error.", e11);
            this.f19065h.obtainMessage(8, new com.fyber.inneractive.sdk.player.exoplayer2.d(0, null, e11, -1)).sendToTarget();
            g();
            return true;
        } catch (RuntimeException e12) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e12);
            this.f19065h.obtainMessage(8, new com.fyber.inneractive.sdk.player.exoplayer2.d(2, null, e12, -1)).sendToTarget();
            g();
            return true;
        }
    }

    public final void i() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar = this.E;
        if (aVar == null) {
            return;
        }
        long f10 = aVar.f19084a.f();
        if (f10 != -9223372036854775807L) {
            b(f10);
        } else {
            n nVar = this.f19071n;
            if (nVar != null && !nVar.b()) {
                long o10 = this.f19072o.o();
                this.B = o10;
                this.f19062e.a(o10);
            } else {
                this.B = this.f19062e.o();
            }
            f10 = this.B - this.E.a();
        }
        this.f19069l.f19105c = f10;
        this.f19082y = SystemClock.elapsedRealtime() * 1000;
        long d10 = this.f19074q.length == 0 ? Long.MIN_VALUE : this.E.f19084a.d();
        b bVar = this.f19069l;
        if (d10 == Long.MIN_VALUE) {
            d10 = this.F.a(this.E.f19089f, this.f19068k, false).f19222d;
        }
        bVar.f19106d = d10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n.a
    public void a(p pVar, Object obj) {
        this.f19063f.obtainMessage(7, Pair.create(pVar, obj)).sendToTarget();
    }

    public final void a(int i10) {
        if (this.f19079v != i10) {
            this.f19079v = i10;
            this.f19065h.obtainMessage(1, i10, 0).sendToTarget();
        }
    }

    public final void c() throws IOException {
        a aVar = this.C;
        if (aVar == null || aVar.f19092i) {
            return;
        }
        a aVar2 = this.D;
        if (aVar2 == null || aVar2.f19094k == aVar) {
            for (n nVar : this.f19074q) {
                if (!nVar.g()) {
                    return;
                }
            }
            this.C.f19084a.e();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar, boolean z10) {
        this.f19065h.sendEmptyMessage(0);
        b(true);
        this.f19061d.a(false);
        if (z10) {
            this.f19069l = new b(0, -9223372036854775807L);
        }
        this.f19073p = nVar;
        nVar.a(this.f19066i, true, (n.a) this);
        a(2);
        this.f19063f.sendEmptyMessage(2);
    }

    public final void d() {
        b(true);
        this.f19061d.a(true);
        a(1);
        synchronized (this) {
            this.f19075r = true;
            notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x015a A[LOOP:2: B:63:0x015a->B:67:0x016a, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws com.fyber.inneractive.sdk.player.exoplayer2.d, java.io.IOException {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.h.a():void");
    }

    public final long b(int i10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar;
        h();
        this.f19077t = false;
        a(2);
        a aVar2 = this.E;
        if (aVar2 == null) {
            a aVar3 = this.C;
            if (aVar3 != null) {
                aVar3.c();
            }
            aVar = null;
        } else {
            aVar = null;
            while (aVar2 != null) {
                if (aVar2.f19089f == i10 && aVar2.f19092i) {
                    aVar = aVar2;
                } else {
                    aVar2.c();
                }
                aVar2 = aVar2.f19094k;
            }
        }
        a aVar4 = this.E;
        if (aVar4 != aVar || aVar4 != this.D) {
            for (n nVar : this.f19074q) {
                nVar.l();
            }
            this.f19074q = new n[0];
            this.f19072o = null;
            this.f19071n = null;
            this.E = null;
        }
        if (aVar != null) {
            aVar.f19094k = null;
            this.C = aVar;
            this.D = aVar;
            b(aVar);
            a aVar5 = this.E;
            if (aVar5.f19093j) {
                j10 = aVar5.f19084a.b(j10);
            }
            b(j10);
            b();
        } else {
            this.C = null;
            this.D = null;
            this.E = null;
            b(j10);
        }
        this.f19063f.sendEmptyMessage(2);
        return j10;
    }

    public final void b(long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar = this.E;
        long a10 = j10 + (aVar == null ? 60000000L : aVar.a());
        this.B = a10;
        this.f19062e.a(a10);
        for (n nVar : this.f19074q) {
            nVar.a(this.B);
        }
    }

    public final void b(boolean z10) {
        n[] nVarArr;
        this.f19063f.removeMessages(2);
        this.f19077t = false;
        q qVar = this.f19062e;
        if (qVar.f19599a) {
            qVar.a(qVar.o());
            qVar.f19599a = false;
        }
        this.f19072o = null;
        this.f19071n = null;
        this.B = 60000000L;
        for (n nVar : this.f19074q) {
            try {
                a(nVar);
                nVar.l();
            } catch (com.fyber.inneractive.sdk.player.exoplayer2.d | RuntimeException e10) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e10);
            }
        }
        this.f19074q = new n[0];
        a aVar = this.E;
        if (aVar == null) {
            aVar = this.C;
        }
        a(aVar);
        this.C = null;
        this.D = null;
        this.E = null;
        c(false);
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar2 = this.f19073p;
            if (nVar2 != null) {
                nVar2.b();
                this.f19073p = null;
            }
            this.F = null;
        }
    }

    public final void b(Object obj, int i10) {
        this.f19065h.obtainMessage(6, new d(this.F, obj, this.f19069l, i10)).sendToTarget();
    }

    public final void b() {
        a aVar = this.C;
        long a10 = !aVar.f19092i ? 0L : aVar.f19084a.a();
        if (a10 == Long.MIN_VALUE) {
            c(false);
            return;
        }
        long a11 = this.B - this.C.a();
        boolean a12 = this.f19061d.a(a10 - a11);
        c(a12);
        if (a12) {
            a aVar2 = this.C;
            aVar2.f19095l = false;
            aVar2.f19084a.a(a11);
            return;
        }
        this.C.f19095l = true;
    }

    public final void b(a aVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.E == aVar) {
            return;
        }
        boolean[] zArr = new boolean[this.f19058a.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            n[] nVarArr = this.f19058a;
            if (i10 < nVarArr.length) {
                n nVar = nVarArr[i10];
                zArr[i10] = nVar.a() != 0;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = aVar.f19096m.f19371b.f19368b[i10];
                if (eVar != null) {
                    i11++;
                }
                if (zArr[i10] && (eVar == null || (nVar.h() && nVar.n() == this.E.f19086c[i10]))) {
                    if (nVar == this.f19071n) {
                        this.f19062e.a(this.f19072o);
                        this.f19072o = null;
                        this.f19071n = null;
                    }
                    a(nVar);
                    nVar.l();
                }
                i10++;
            } else {
                this.E = aVar;
                this.f19065h.obtainMessage(3, aVar.f19096m).sendToTarget();
                a(zArr, i11);
                return;
            }
        }
    }

    public final void a(long j10, long j11) {
        this.f19063f.removeMessages(2);
        long elapsedRealtime = (j10 + j11) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f19063f.sendEmptyMessage(2);
        } else {
            this.f19063f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final void a(m mVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar = this.f19072o;
        if (gVar != null) {
            mVar = gVar.a(mVar);
        } else {
            q qVar = this.f19062e;
            if (qVar.f19599a) {
                qVar.a(qVar.o());
            }
            qVar.f19602d = mVar;
        }
        this.f19070m = mVar;
        this.f19065h.obtainMessage(7, mVar).sendToTarget();
    }

    public final void a(e.c[] cVarArr) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        try {
            for (e.c cVar : cVarArr) {
                cVar.f18135a.a(cVar.f18136b, cVar.f18137c);
            }
            if (this.f19073p != null) {
                this.f19063f.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.f19081x++;
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f19081x++;
                notifyAll();
                throw th;
            }
        }
    }

    public final void a(n nVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (nVar.a() == 2) {
            nVar.d();
        }
    }

    public final boolean a(long j10) {
        a aVar;
        return j10 == -9223372036854775807L || this.f19069l.f19105c < j10 || ((aVar = this.E.f19094k) != null && aVar.f19092i);
    }

    public final boolean a(boolean z10) {
        long d10;
        a aVar = this.C;
        if (!aVar.f19092i) {
            d10 = aVar.f19090g;
        } else {
            d10 = aVar.f19084a.d();
        }
        if (d10 == Long.MIN_VALUE) {
            a aVar2 = this.C;
            if (aVar2.f19091h) {
                return true;
            }
            d10 = this.F.a(aVar2.f19089f, this.f19068k, false).f19222d;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.c cVar = this.f19061d;
        long a10 = d10 - (this.B - this.C.a());
        long j10 = z10 ? cVar.f18109e : cVar.f18108d;
        return j10 <= 0 || a10 >= j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.util.Pair<com.fyber.inneractive.sdk.player.exoplayer2.p, java.lang.Object> r13) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.h.a(android.util.Pair):void");
    }

    public final void a(Object obj, int i10) {
        this.f19069l = new b(0, 0L);
        b(obj, i10);
        this.f19069l = new b(0, -9223372036854775807L);
        a(4);
        b(false);
    }

    public final int a(int i10, p pVar, p pVar2) {
        int i11 = -1;
        while (i11 == -1 && i10 < pVar.a() - 1) {
            i10++;
            i11 = pVar2.a(pVar.a(i10, this.f19068k, true).f19220b);
        }
        return i11;
    }

    public final Pair<Integer, Long> a(c cVar) {
        p pVar = cVar.f19107a;
        if (pVar.c()) {
            pVar = this.F;
        }
        try {
            Pair<Integer, Long> a10 = a(pVar, cVar.f19108b, cVar.f19109c, 0L);
            p pVar2 = this.F;
            if (pVar2 == pVar) {
                return a10;
            }
            int a11 = pVar2.a(pVar.a(((Integer) a10.first).intValue(), this.f19068k, true).f19220b);
            if (a11 != -1) {
                return Pair.create(Integer.valueOf(a11), a10.second);
            }
            int a12 = a(((Integer) a10.first).intValue(), pVar, this.F);
            if (a12 != -1) {
                return a(this.F.a(a12, this.f19068k, false).f19221c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new k(this.F, cVar.f19108b, cVar.f19109c);
        }
    }

    public final Pair<Integer, Long> a(int i10, long j10) {
        return a(this.F, i10, j10, 0L);
    }

    public final Pair<Integer, Long> a(p pVar, int i10, long j10, long j11) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i10, 0, pVar.b());
        pVar.a(i10, this.f19067j, false, j11);
        if (j10 == -9223372036854775807L) {
            j10 = this.f19067j.f19228e;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        p.c cVar = this.f19067j;
        int i11 = cVar.f19226c;
        long j12 = cVar.f19230g + j10;
        long j13 = pVar.a(i11, this.f19068k, false).f19222d;
        while (j13 != -9223372036854775807L && j12 >= j13 && i11 < this.f19067j.f19227d) {
            j12 -= j13;
            i11++;
            j13 = pVar.a(i11, this.f19068k, false).f19222d;
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(j12));
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.m mVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar = this.C;
        if (aVar == null || aVar.f19084a != mVar) {
            return;
        }
        aVar.f19092i = true;
        aVar.d();
        aVar.f19090g = aVar.a(aVar.f19090g, false, new boolean[aVar.f19097n.length]);
        if (this.E == null) {
            a aVar2 = this.C;
            this.D = aVar2;
            b(aVar2.f19090g);
            b(this.D);
        }
        b();
    }

    public final void a(a aVar) {
        while (aVar != null) {
            aVar.c();
            aVar = aVar.f19094k;
        }
    }

    public final void a(boolean[] zArr, int i10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.f19074q = new n[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            n[] nVarArr = this.f19058a;
            if (i11 >= nVarArr.length) {
                return;
            }
            n nVar = nVarArr[i11];
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = this.E.f19096m.f19371b.f19368b[i11];
            if (eVar != null) {
                int i13 = i12 + 1;
                this.f19074q[i12] = nVar;
                if (nVar.a() == 0) {
                    o oVar = this.E.f19096m.f19373d[i11];
                    boolean z10 = this.f19076s && this.f19079v == 3;
                    boolean z11 = !zArr[i11] && z10;
                    int f10 = eVar.f();
                    i[] iVarArr = new i[f10];
                    for (int i14 = 0; i14 < f10; i14++) {
                        iVarArr[i14] = eVar.a(i14);
                    }
                    a aVar = this.E;
                    nVar.a(oVar, iVarArr, aVar.f19086c[i11], this.B, z11, aVar.a());
                    com.fyber.inneractive.sdk.player.exoplayer2.util.g j10 = nVar.j();
                    if (j10 != null) {
                        if (this.f19072o == null) {
                            this.f19072o = j10;
                            this.f19071n = nVar;
                            j10.a(this.f19070m);
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(2, null, new IllegalStateException("Multiple renderer media clocks enabled."), -1);
                        }
                    }
                    if (z10) {
                        nVar.f();
                    }
                }
                i12 = i13;
            }
            i11++;
        }
    }
}
