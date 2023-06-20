package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class TC extends C4H<S3> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1110Mq A03;
    public C1220Qw A04;
    public String A05;
    public List<C1172Pa> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C7U A09;
    public final C1400Xy A0A;
    public final InterfaceC1028Jh A0B;
    public final UB A0C;
    public final MK A0D;
    public final AI A0E;
    public final C1018Ix A0F;

    public TC(C1400Xy c1400Xy, List<C1172Pa> list, AnonymousClass18 anonymousClass18, InterfaceC1028Jh interfaceC1028Jh, UB ub2, InterfaceC1110Mq interfaceC1110Mq, String str, AI ai, @Nullable C1018Ix c1018Ix) {
        this.A0A = c1400Xy;
        this.A0B = interfaceC1028Jh;
        this.A0C = ub2;
        this.A09 = ub2.A10();
        this.A04 = ub2.A1A();
        this.A0D = ub2.A19();
        this.A03 = interfaceC1110Mq;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A05 = str;
        this.A0E = ai;
        this.A0F = c1018Ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final S3 A06(ViewGroup viewGroup, int i10) {
        return new S3(OO.A00(new C1154Oi(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0J(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(S3 s32, int i10) {
        s32.A0m(this.A04);
        s32.A0l(this.A06.get(i10), this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i10, int i11, int i12) {
        boolean z10 = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (z10) {
            A07();
        }
    }

    public final void A0G(C1220Qw c1220Qw) {
        this.A04 = c1220Qw;
    }
}
