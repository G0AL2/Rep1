package gb;

/* loaded from: classes3.dex */
final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f30788a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f30789b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(i iVar, e eVar) {
        this.f30789b = iVar;
        this.f30788a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        a aVar;
        a aVar2;
        obj = this.f30789b.f30791b;
        synchronized (obj) {
            aVar = this.f30789b.f30792c;
            if (aVar != null) {
                aVar2 = this.f30789b.f30792c;
                aVar2.a(this.f30788a);
            }
        }
    }
}
