package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class S2 extends C4H<C1246Rw> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    @Nullable
    public InterfaceC1110Mq A04;
    public String A05;
    public List<C1172Pa> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C7U A09;
    public final C1400Xy A0A;
    public final InterfaceC1028Jh A0B;
    public final MK A0C;
    public final SB A0D;
    public final C1220Qw A0E;

    public S2(C1400Xy c1400Xy, List<C1172Pa> list, AnonymousClass18 anonymousClass18, InterfaceC1028Jh interfaceC1028Jh, C7U c7u, C1220Qw c1220Qw, MK mk, InterfaceC1110Mq interfaceC1110Mq, String str, int i10, int i11, int i12, int i13, SB sb2) {
        this.A0A = c1400Xy;
        this.A0B = interfaceC1028Jh;
        this.A09 = c7u;
        this.A0E = c1220Qw;
        this.A0C = mk;
        this.A04 = interfaceC1110Mq;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A05 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0D = sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C1246Rw A06(ViewGroup viewGroup, int i10) {
        return new C1246Rw(C1168Ow.A00(new C1154Oi(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0J(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C1246Rw c1246Rw, int i10) {
        c1246Rw.A0l(this.A06.get(i10), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }
}
