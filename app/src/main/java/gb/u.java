package gb;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
final class u implements c, b {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f30813a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ u(byte[] bArr) {
    }

    public final void a() throws InterruptedException {
        this.f30813a.await();
    }

    @Override // gb.b
    public final void onFailure(Exception exc) {
        this.f30813a.countDown();
    }

    @Override // gb.c
    public final void onSuccess(Object obj) {
        this.f30813a.countDown();
    }
}
