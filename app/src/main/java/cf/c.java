package cf;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ pe.a f5506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pe.a aVar, String str, boolean z10, String str2, boolean z11) {
        super(str2, z11);
        this.f5506e = aVar;
    }

    @Override // cf.a
    public long f() {
        this.f5506e.invoke();
        return -1L;
    }
}
