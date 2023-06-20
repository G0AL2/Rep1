package kotlinx.coroutines.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadContext.kt */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f33494a;

    /* renamed from: b  reason: collision with root package name */
    private int f33495b;

    /* renamed from: c  reason: collision with root package name */
    private final ie.g f33496c;

    public b0(ie.g gVar, int i10) {
        qe.k.g(gVar, "context");
        this.f33496c = gVar;
        this.f33494a = new Object[i10];
    }

    public final void a(Object obj) {
        Object[] objArr = this.f33494a;
        int i10 = this.f33495b;
        this.f33495b = i10 + 1;
        objArr[i10] = obj;
    }

    public final ie.g b() {
        return this.f33496c;
    }

    public final void c() {
        this.f33495b = 0;
    }

    public final Object d() {
        Object[] objArr = this.f33494a;
        int i10 = this.f33495b;
        this.f33495b = i10 + 1;
        return objArr[i10];
    }
}
