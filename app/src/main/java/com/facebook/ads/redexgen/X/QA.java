package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class QA extends AbstractC07859c<AnonymousClass84> {
    public final /* synthetic */ AnonymousClass89 A00;

    public QA(AnonymousClass89 anonymousClass89) {
        this.A00 = anonymousClass89;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A00 */
    public final void A03(AnonymousClass84 anonymousClass84) {
        QK qk;
        QK qk2;
        int A00 = anonymousClass84.A00();
        if (this.A00.A00 > 0) {
            qk = this.A00.A0B;
            if (A00 == qk.getDuration()) {
                qk2 = this.A00.A0B;
                if (qk2.getDuration() > this.A00.A00) {
                    return;
                }
            }
        }
        this.A00.A0e(A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    public final Class<AnonymousClass84> A01() {
        return AnonymousClass84.class;
    }
}
