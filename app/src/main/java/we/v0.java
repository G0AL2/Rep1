package we;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class v0 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f38662a;

    public v0(boolean z10) {
        this.f38662a = z10;
    }

    @Override // we.d1
    public boolean a() {
        return this.f38662a;
    }

    @Override // we.d1
    public t1 d() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(a() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
