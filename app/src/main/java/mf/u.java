package mf;

import com.inmobi.media.fq;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Options.kt */
/* loaded from: classes3.dex */
public final class u extends fe.b<i> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final a f34489d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final i[] f34490b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f34491c;

    /* compiled from: Options.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        private final void a(long j10, f fVar, int i10, List<? extends i> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            f fVar2;
            int i17 = i10;
            if (i11 < i12) {
                for (int i18 = i11; i18 < i12; i18++) {
                    if (!(list.get(i18).A() >= i17)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                i iVar = list.get(i11);
                i iVar2 = list.get(i12 - 1);
                if (i17 == iVar.A()) {
                    int i19 = i11 + 1;
                    i13 = i19;
                    i14 = list2.get(i11).intValue();
                    iVar = list.get(i19);
                } else {
                    i13 = i11;
                    i14 = -1;
                }
                if (iVar.k(i17) != iVar2.k(i17)) {
                    int i20 = 1;
                    for (int i21 = i13 + 1; i21 < i12; i21++) {
                        if (list.get(i21 - 1).k(i17) != list.get(i21).k(i17)) {
                            i20++;
                        }
                    }
                    long c10 = j10 + c(fVar) + 2 + (i20 * 2);
                    fVar.writeInt(i20);
                    fVar.writeInt(i14);
                    for (int i22 = i13; i22 < i12; i22++) {
                        byte k10 = list.get(i22).k(i17);
                        if (i22 == i13 || k10 != list.get(i22 - 1).k(i17)) {
                            fVar.writeInt(k10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
                        }
                    }
                    f fVar3 = new f();
                    while (i13 < i12) {
                        byte k11 = list.get(i13).k(i17);
                        int i23 = i13 + 1;
                        int i24 = i23;
                        while (true) {
                            if (i24 >= i12) {
                                i15 = i12;
                                break;
                            } else if (k11 != list.get(i24).k(i17)) {
                                i15 = i24;
                                break;
                            } else {
                                i24++;
                            }
                        }
                        if (i23 == i15 && i17 + 1 == list.get(i13).A()) {
                            fVar.writeInt(list2.get(i13).intValue());
                            i16 = i15;
                            fVar2 = fVar3;
                        } else {
                            fVar.writeInt(((int) (c10 + c(fVar3))) * (-1));
                            i16 = i15;
                            fVar2 = fVar3;
                            a(c10, fVar3, i17 + 1, list, i13, i15, list2);
                        }
                        fVar3 = fVar2;
                        i13 = i16;
                    }
                    fVar.t(fVar3);
                    return;
                }
                int min = Math.min(iVar.A(), iVar2.A());
                int i25 = 0;
                for (int i26 = i17; i26 < min && iVar.k(i26) == iVar2.k(i26); i26++) {
                    i25++;
                }
                long c11 = j10 + c(fVar) + 2 + i25 + 1;
                fVar.writeInt(-i25);
                fVar.writeInt(i14);
                int i27 = i17 + i25;
                while (i17 < i27) {
                    fVar.writeInt(iVar.k(i17) & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (i27 == list.get(i13).A()) {
                        fVar.writeInt(list2.get(i13).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                f fVar4 = new f();
                fVar.writeInt(((int) (c(fVar4) + c11)) * (-1));
                a(c11, fVar4, i27, list, i13, i12, list2);
                fVar.t(fVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void b(a aVar, long j10, f fVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0L : j10, fVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(f fVar) {
            return fVar.C0() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final mf.u d(mf.i... r17) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mf.u.a.d(mf.i[]):mf.u");
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    public /* synthetic */ u(i[] iVarArr, int[] iArr, qe.g gVar) {
        this(iVarArr, iArr);
    }

    public static final u l(i... iVarArr) {
        return f34489d.d(iVarArr);
    }

    @Override // fe.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return f((i) obj);
        }
        return false;
    }

    @Override // fe.a
    public int e() {
        return this.f34490b.length;
    }

    public /* bridge */ boolean f(i iVar) {
        return super.contains(iVar);
    }

    @Override // fe.b, java.util.List
    /* renamed from: g */
    public i get(int i10) {
        return this.f34490b[i10];
    }

    public final i[] h() {
        return this.f34490b;
    }

    public final int[] i() {
        return this.f34491c;
    }

    @Override // fe.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return j((i) obj);
        }
        return -1;
    }

    public /* bridge */ int j(i iVar) {
        return super.indexOf(iVar);
    }

    public /* bridge */ int k(i iVar) {
        return super.lastIndexOf(iVar);
    }

    @Override // fe.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return k((i) obj);
        }
        return -1;
    }

    private u(i[] iVarArr, int[] iArr) {
        this.f34490b = iVarArr;
        this.f34491c = iArr;
    }
}
