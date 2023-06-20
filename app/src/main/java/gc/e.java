package gc;

/* compiled from: SettingsData.java */
/* loaded from: classes3.dex */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final a f30818a;

    /* renamed from: b  reason: collision with root package name */
    public final c f30819b;

    /* renamed from: c  reason: collision with root package name */
    public final b f30820c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30821d;

    public e(long j10, a aVar, c cVar, b bVar, int i10, int i11) {
        this.f30821d = j10;
        this.f30818a = aVar;
        this.f30819b = cVar;
        this.f30820c = bVar;
    }

    @Override // gc.d
    public b a() {
        return this.f30820c;
    }

    @Override // gc.d
    public c b() {
        return this.f30819b;
    }

    public a c() {
        return this.f30818a;
    }

    public long d() {
        return this.f30821d;
    }

    public boolean e(long j10) {
        return this.f30821d < j10;
    }
}
