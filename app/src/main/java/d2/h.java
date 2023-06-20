package d2;

/* compiled from: Mask.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final a f28959a;

    /* renamed from: b  reason: collision with root package name */
    private final c2.h f28960b;

    /* renamed from: c  reason: collision with root package name */
    private final c2.d f28961c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f28962d;

    /* compiled from: Mask.java */
    /* loaded from: classes.dex */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public h(a aVar, c2.h hVar, c2.d dVar, boolean z10) {
        this.f28959a = aVar;
        this.f28960b = hVar;
        this.f28961c = dVar;
        this.f28962d = z10;
    }

    public a a() {
        return this.f28959a;
    }

    public c2.h b() {
        return this.f28960b;
    }

    public c2.d c() {
        return this.f28961c;
    }

    public boolean d() {
        return this.f28962d;
    }
}
