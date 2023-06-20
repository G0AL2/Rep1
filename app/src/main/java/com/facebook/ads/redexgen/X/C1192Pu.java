package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Pu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1192Pu extends AbstractC07859c<AnonymousClass88> {
    public final /* synthetic */ AnonymousClass89 A00;

    public C1192Pu(AnonymousClass89 anonymousClass89) {
        this.A00 = anonymousClass89;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A00 */
    public final void A03(AnonymousClass88 anonymousClass88) {
        int A00 = anonymousClass88.A00();
        int A01 = anonymousClass88.A01();
        if (this.A00.A00 > 0 && A00 == A01 && A01 > this.A00.A00) {
            return;
        }
        if (A01 < A00 + 500) {
            if (A01 == 0) {
                AnonymousClass89 anonymousClass89 = this.A00;
                anonymousClass89.A0d(anonymousClass89.A00);
                return;
            }
            this.A00.A0d(A01);
            return;
        }
        this.A00.A0d(A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    public final Class<AnonymousClass88> A01() {
        return AnonymousClass88.class;
    }
}
