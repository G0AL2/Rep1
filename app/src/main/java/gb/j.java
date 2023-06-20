package gb;

/* loaded from: classes3.dex */
final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f30793a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f30794b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(k kVar, e eVar) {
        this.f30794b = kVar;
        this.f30793a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        b bVar;
        b bVar2;
        obj = this.f30794b.f30796b;
        synchronized (obj) {
            bVar = this.f30794b.f30797c;
            if (bVar != null) {
                bVar2 = this.f30794b.f30797c;
                bVar2.onFailure(this.f30793a.d());
            }
        }
    }
}
