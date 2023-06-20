package z8;

import android.util.SparseArray;
import j8.p1;
import java.util.ArrayList;
import java.util.List;
import z8.i0;

/* compiled from: DefaultTsPayloadReaderFactory.java */
/* loaded from: classes2.dex */
public final class j implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f40259a;

    /* renamed from: b  reason: collision with root package name */
    private final List<p1> f40260b;

    public j(int i10) {
        this(i10, jb.s.t());
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<p1> e(i0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f40260b;
        }
        ea.a0 a0Var = new ea.a0(bVar.f40253d);
        List<p1> list = this.f40260b;
        while (a0Var.a() > 0) {
            int D = a0Var.D();
            int e10 = a0Var.e() + a0Var.D();
            if (D == 134) {
                list = new ArrayList<>();
                int D2 = a0Var.D() & 31;
                for (int i11 = 0; i11 < D2; i11++) {
                    String A = a0Var.A(3);
                    int D3 = a0Var.D();
                    boolean z10 = (D3 & 128) != 0;
                    if (z10) {
                        i10 = D3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte D4 = (byte) a0Var.D();
                    a0Var.Q(1);
                    List<byte[]> list2 = null;
                    if (z10) {
                        list2 = ea.d.b((D4 & 64) != 0);
                    }
                    list.add(new p1.b().e0(str).V(A).F(i10).T(list2).E());
                }
            }
            a0Var.P(e10);
        }
        return list;
    }

    private boolean f(int i10) {
        return (i10 & this.f40259a) != 0;
    }

    @Override // z8.i0.c
    public SparseArray<i0> a() {
        return new SparseArray<>();
    }

    @Override // z8.i0.c
    public i0 b(int i10, i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f40251b));
            }
            if (i10 != 21) {
                if (i10 == 27) {
                    if (f(4)) {
                        return null;
                    }
                    return new w(new p(c(bVar), f(1), f(8)));
                } else if (i10 != 36) {
                    if (i10 != 89) {
                        if (i10 != 138) {
                            if (i10 != 172) {
                                if (i10 != 257) {
                                    if (i10 != 134) {
                                        if (i10 != 135) {
                                            switch (i10) {
                                                case 15:
                                                    if (f(2)) {
                                                        return null;
                                                    }
                                                    return new w(new i(false, bVar.f40251b));
                                                case 16:
                                                    return new w(new o(d(bVar)));
                                                case 17:
                                                    if (f(2)) {
                                                        return null;
                                                    }
                                                    return new w(new s(bVar.f40251b));
                                                default:
                                                    switch (i10) {
                                                        case 128:
                                                            break;
                                                        case 129:
                                                            break;
                                                        case 130:
                                                            if (!f(64)) {
                                                                return null;
                                                            }
                                                            break;
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return new w(new c(bVar.f40251b));
                                    } else if (f(16)) {
                                        return null;
                                    } else {
                                        return new c0(new v("application/x-scte35"));
                                    }
                                }
                                return new c0(new v("application/vnd.dvb.ait"));
                            }
                            return new w(new f(bVar.f40251b));
                        }
                        return new w(new k(bVar.f40251b));
                    }
                    return new w(new l(bVar.f40252c));
                } else {
                    return new w(new q(c(bVar)));
                }
            }
            return new w(new r());
        }
        return new w(new n(d(bVar)));
    }

    public j(int i10, List<p1> list) {
        this.f40259a = i10;
        this.f40260b = list;
    }
}
