package gb;

/* loaded from: classes3.dex */
final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f30798a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f30799b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(m mVar, e eVar) {
        this.f30799b = mVar;
        this.f30798a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f30799b.f30801b;
        synchronized (obj) {
            cVar = this.f30799b.f30802c;
            if (cVar != null) {
                cVar2 = this.f30799b.f30802c;
                cVar2.onSuccess(this.f30798a.e());
            }
        }
    }
}
