package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.89  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass89 extends OI {
    public int A00;
    public boolean A01;
    public final AbstractC07859c<AnonymousClass88> A02;
    public final AbstractC07859c<AnonymousClass85> A03;
    public final AbstractC07859c<C1092Ly> A04;
    public final AbstractC07859c<AnonymousClass84> A05;
    public final AbstractC07859c<L1> A06;
    public final AbstractC07859c<C1064Ku> A07;
    public final AbstractC07859c<C1062Kr> A08;
    public final AbstractC07859c<C1048Kb> A09;
    public final AbstractC07859c<C1047Ka> A0A;
    public final QK A0B;
    public final L4 A0C;
    public final AbstractC1049Kc A0D;

    public AnonymousClass89(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, QK qk, String str) {
        this(c1400Xy, interfaceC1028Jh, qk, new ArrayList(), str);
    }

    public AnonymousClass89(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, QK qk, String str, @Nullable Bundle bundle) {
        this(c1400Xy, interfaceC1028Jh, qk, new ArrayList(), str, bundle, null);
    }

    public AnonymousClass89(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, QK qk, String str, @Nullable Map<String, String> extraParams) {
        this(c1400Xy, interfaceC1028Jh, qk, new ArrayList(), str, null, extraParams);
    }

    public AnonymousClass89(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, QK qk, List<C2A> list, String str) {
        super(c1400Xy, interfaceC1028Jh, qk, list, str, !qk.A0h(), new C1145Nz(c1400Xy, qk));
        this.A0D = new AbstractC1049Kc() { // from class: com.facebook.ads.redexgen.X.8C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(C1050Kd c1050Kd) {
                AnonymousClass89.this.A0Z();
            }
        };
        this.A07 = new QD(this);
        this.A03 = new QC(this);
        this.A04 = new QB(this);
        this.A05 = new QA(this);
        this.A02 = new C1192Pu(this);
        this.A06 = new PW(this);
        this.A09 = new PV(this);
        this.A0A = new C1161Op(this);
        this.A08 = new QF(this);
        this.A0C = new L4() { // from class: com.facebook.ads.redexgen.X.8D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(LG lg) {
                QK qk2;
                AnonymousClass89 anonymousClass89 = AnonymousClass89.this;
                qk2 = anonymousClass89.A0B;
                anonymousClass89.A00 = qk2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = qk;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public AnonymousClass89(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, QK qk, List<C2A> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> extraParams) {
        super(c1400Xy, interfaceC1028Jh, qk, list, str, !qk.A0h(), bundle, extraParams, new C1145Nz(c1400Xy, qk));
        this.A0D = new AbstractC1049Kc() { // from class: com.facebook.ads.redexgen.X.8C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(C1050Kd c1050Kd) {
                AnonymousClass89.this.A0Z();
            }
        };
        this.A07 = new QD(this);
        this.A03 = new QC(this);
        this.A04 = new QB(this);
        this.A05 = new QA(this);
        this.A02 = new C1192Pu(this);
        this.A06 = new PW(this);
        this.A09 = new PV(this);
        this.A0A = new C1161Op(this);
        this.A08 = new QF(this);
        this.A0C = new L4() { // from class: com.facebook.ads.redexgen.X.8D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(LG lg) {
                QK qk2;
                AnonymousClass89 anonymousClass89 = AnonymousClass89.this;
                qk2 = anonymousClass89.A0B;
                anonymousClass89.A00 = qk2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = qk;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0g() {
        QE qe2 = new QE(this);
        if (this.A0B.A0l()) {
            MM.A00(qe2);
        } else {
            this.A0B.getStateHandler().post(qe2);
        }
    }
}
