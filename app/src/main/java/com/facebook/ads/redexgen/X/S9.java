package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class S9 extends C4H<S3> {
    public int A00;
    public int A01;
    public int A02;
    @Nullable
    public InterfaceC1110Mq A03;
    public String A04;
    public List<C1172Pa> A05;
    public final SparseBooleanArray A06 = new SparseBooleanArray();
    public final AnonymousClass18 A07;
    public final C7U A08;
    public final C1400Xy A09;
    public final InterfaceC1028Jh A0A;
    public final MK A0B;
    public final SB A0C;
    public final C1018Ix A0D;
    public final C1220Qw A0E;

    public S9(C1400Xy c1400Xy, List<C1172Pa> list, AnonymousClass18 anonymousClass18, InterfaceC1028Jh interfaceC1028Jh, C7U c7u, C1220Qw c1220Qw, MK mk, InterfaceC1110Mq interfaceC1110Mq, String str, SB sb2, C1018Ix c1018Ix) {
        this.A09 = c1400Xy;
        this.A0A = interfaceC1028Jh;
        this.A08 = c7u;
        this.A0E = c1220Qw;
        this.A0B = mk;
        this.A03 = interfaceC1110Mq;
        this.A07 = anonymousClass18;
        this.A05 = list;
        this.A04 = str;
        this.A0C = sb2;
        this.A0D = c1018Ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    @Nullable
    /* renamed from: A01 */
    public final S3 A06(ViewGroup viewGroup, int i10) {
        InterfaceC1110Mq interfaceC1110Mq = this.A03;
        if (interfaceC1110Mq == null || this.A00 == 0) {
            return null;
        }
        return new S3(OO.A01(new C1154Oi(this.A09, this.A0A, interfaceC1110Mq, this.A07, null, this.A0E, this.A0B).A0I(this.A0D).A0J(), this.A04, this.A0C), this.A06, this.A0E, this.A05.size(), this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(S3 s32, int i10) {
        s32.A0l(this.A05.get(i10), this.A0A, this.A08, this.A0B, this.A04, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A05.size();
    }

    public final void A0F(int i10, int i11, int i12) {
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
    }
}
