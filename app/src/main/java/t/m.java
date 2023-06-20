package t;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: c  reason: collision with root package name */
    public static int f37047c;

    /* renamed from: a  reason: collision with root package name */
    p f37048a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<p> f37049b = new ArrayList<>();

    public m(p pVar, int i10) {
        this.f37048a = null;
        f37047c++;
        this.f37048a = pVar;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f37023d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f37030k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f37030k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f37023d != pVar) {
                    j11 = Math.min(j11, c(fVar2, fVar2.f37025f + j10));
                }
            }
        }
        if (fVar == pVar.f37067i) {
            long j12 = j10 - pVar.j();
            return Math.min(Math.min(j11, c(pVar.f37066h, j12)), j12 - pVar.f37066h.f37025f);
        }
        return j11;
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f37023d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f37030k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f37030k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f37023d != pVar) {
                    j11 = Math.max(j11, d(fVar2, fVar2.f37025f + j10));
                }
            }
        }
        if (fVar == pVar.f37066h) {
            long j12 = j10 + pVar.j();
            return Math.max(Math.max(j11, d(pVar.f37067i, j12)), j12 - pVar.f37067i.f37025f);
        }
        return j11;
    }

    public void a(p pVar) {
        this.f37049b.add(pVar);
    }

    public long b(s.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f37048a;
        if (pVar instanceof c) {
            if (((c) pVar).f37064f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f36617d : fVar.f36619e).f37066h;
        f fVar3 = (i10 == 0 ? fVar.f36617d : fVar.f36619e).f37067i;
        boolean contains = pVar.f37066h.f37031l.contains(fVar2);
        boolean contains2 = this.f37048a.f37067i.f37031l.contains(fVar3);
        long j11 = this.f37048a.j();
        if (contains && contains2) {
            long d10 = d(this.f37048a.f37066h, 0L);
            long c10 = c(this.f37048a.f37067i, 0L);
            long j12 = d10 - j11;
            p pVar2 = this.f37048a;
            int i12 = pVar2.f37067i.f37025f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f37066h.f37025f;
            long j13 = ((-c10) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float o10 = pVar2.f37060b.o(i10);
            float f10 = (float) (o10 > 0.0f ? (((float) j13) / o10) + (((float) j12) / (1.0f - o10)) : 0L);
            long j14 = (f10 * o10) + 0.5f + j11 + (f10 * (1.0f - o10)) + 0.5f;
            p pVar3 = this.f37048a;
            j10 = pVar3.f37066h.f37025f + j14;
            i11 = pVar3.f37067i.f37025f;
        } else if (contains) {
            f fVar4 = this.f37048a.f37066h;
            return Math.max(d(fVar4, fVar4.f37025f), this.f37048a.f37066h.f37025f + j11);
        } else if (contains2) {
            f fVar5 = this.f37048a.f37067i;
            return Math.max(-c(fVar5, fVar5.f37025f), (-this.f37048a.f37067i.f37025f) + j11);
        } else {
            p pVar4 = this.f37048a;
            j10 = pVar4.f37066h.f37025f + pVar4.j();
            i11 = this.f37048a.f37067i.f37025f;
        }
        return j10 - i11;
    }
}
