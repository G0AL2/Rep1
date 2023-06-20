package cb;

/* loaded from: classes3.dex */
public abstract class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final gb.p<?> f5432a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        this.f5432a = null;
    }

    public f(gb.p<?> pVar) {
        this.f5432a = pVar;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final gb.p<?> b() {
        return this.f5432a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            gb.p<?> pVar = this.f5432a;
            if (pVar != null) {
                pVar.d(e10);
            }
        }
    }
}
