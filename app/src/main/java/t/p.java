package t;

import s.d;
import s.e;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f37059a;

    /* renamed from: b  reason: collision with root package name */
    s.e f37060b;

    /* renamed from: c  reason: collision with root package name */
    m f37061c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f37062d;

    /* renamed from: e  reason: collision with root package name */
    g f37063e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f37064f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f37065g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f37066h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f37067i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f37068j = b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37069a;

        static {
            int[] iArr = new int[d.b.values().length];
            f37069a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37069a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37069a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37069a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37069a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(s.e eVar) {
        this.f37060b = eVar;
    }

    private void l(int i10, int i11) {
        int i12;
        int i13 = this.f37059a;
        if (i13 == 0) {
            this.f37063e.d(g(i11, i10));
        } else if (i13 == 1) {
            this.f37063e.d(Math.min(g(this.f37063e.f37041m, i10), i11));
        } else if (i13 == 2) {
            s.e I = this.f37060b.I();
            if (I != null) {
                g gVar = (i10 == 0 ? I.f36617d : I.f36619e).f37063e;
                if (gVar.f37029j) {
                    s.e eVar = this.f37060b;
                    this.f37063e.d(g((int) ((gVar.f37026g * (i10 == 0 ? eVar.f36656y : eVar.B)) + 0.5f), i10));
                }
            }
        } else if (i13 != 3) {
        } else {
            s.e eVar2 = this.f37060b;
            p pVar = eVar2.f36617d;
            e.b bVar = pVar.f37062d;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f37059a == 3) {
                n nVar = eVar2.f36619e;
                if (nVar.f37062d == bVar2 && nVar.f37059a == 3) {
                    return;
                }
            }
            if (i10 == 0) {
                pVar = eVar2.f36619e;
            }
            if (pVar.f37063e.f37029j) {
                float t10 = eVar2.t();
                if (i10 == 1) {
                    i12 = (int) ((pVar.f37063e.f37026g / t10) + 0.5f);
                } else {
                    i12 = (int) ((t10 * pVar.f37063e.f37026g) + 0.5f);
                }
                this.f37063e.d(i12);
            }
        }
    }

    @Override // t.d
    public void a(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f37031l.add(fVar2);
        fVar.f37025f = i10;
        fVar2.f37030k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f37031l.add(fVar2);
        fVar.f37031l.add(this.f37063e);
        fVar.f37027h = i10;
        fVar.f37028i = gVar;
        fVar2.f37030k.add(fVar);
        gVar.f37030k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            s.e eVar = this.f37060b;
            int i12 = eVar.f36655x;
            max = Math.max(eVar.f36654w, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            s.e eVar2 = this.f37060b;
            int i13 = eVar2.A;
            max = Math.max(eVar2.f36657z, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f h(s.d dVar) {
        s.d dVar2 = dVar.f36595f;
        if (dVar2 == null) {
            return null;
        }
        s.e eVar = dVar2.f36593d;
        int i10 = a.f37069a[dVar2.f36594e.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return eVar.f36619e.f37067i;
                    }
                    return eVar.f36619e.f37050k;
                }
                return eVar.f36619e.f37066h;
            }
            return eVar.f36617d.f37067i;
        }
        return eVar.f36617d.f37066h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f i(s.d dVar, int i10) {
        s.d dVar2 = dVar.f36595f;
        if (dVar2 == null) {
            return null;
        }
        s.e eVar = dVar2.f36593d;
        p pVar = i10 == 0 ? eVar.f36617d : eVar.f36619e;
        int i11 = a.f37069a[dVar2.f36594e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f37067i;
        }
        return pVar.f37066h;
    }

    public long j() {
        g gVar = this.f37063e;
        if (gVar.f37029j) {
            return gVar.f37026g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f37065g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m();

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(d dVar, s.d dVar2, s.d dVar3, int i10) {
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f37029j && h11.f37029j) {
            int e10 = h10.f37026g + dVar2.e();
            int e11 = h11.f37026g - dVar3.e();
            int i11 = e11 - e10;
            if (!this.f37063e.f37029j && this.f37062d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f37063e;
            if (gVar.f37029j) {
                if (gVar.f37026g == i11) {
                    this.f37066h.d(e10);
                    this.f37067i.d(e11);
                    return;
                }
                s.e eVar = this.f37060b;
                float w10 = i10 == 0 ? eVar.w() : eVar.P();
                if (h10 == h11) {
                    e10 = h10.f37026g;
                    e11 = h11.f37026g;
                    w10 = 0.5f;
                }
                this.f37066h.d((int) (e10 + 0.5f + (((e11 - e10) - this.f37063e.f37026g) * w10)));
                this.f37067i.d(this.f37066h.f37026g + this.f37063e.f37026g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
