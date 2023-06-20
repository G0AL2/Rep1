package b5;

/* compiled from: FixedNumberBitmapFramePreparationStrategy.java */
/* loaded from: classes.dex */
public class d implements a {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f4831b = d.class;

    /* renamed from: a  reason: collision with root package name */
    private final int f4832a;

    public d() {
        this(3);
    }

    @Override // b5.a
    public void a(b bVar, z4.b bVar2, y4.a aVar, int i10) {
        for (int i11 = 1; i11 <= this.f4832a; i11++) {
            int a10 = (i10 + i11) % aVar.a();
            if (z3.a.u(2)) {
                z3.a.x(f4831b, "Preparing frame %d, last drawn: %d", Integer.valueOf(a10), Integer.valueOf(i10));
            }
            if (!bVar.a(bVar2, aVar, a10)) {
                return;
            }
        }
    }

    public d(int i10) {
        this.f4832a = i10;
    }
}
