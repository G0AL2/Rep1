package com.facebook.ads.redexgen.X;

import android.content.Context;

/* loaded from: assets/audience_network.dex */
public final class V6 implements InterfaceC0974Hd {
    public final Context A00;
    public final InterfaceC0974Hd A01;
    public final I0<? super InterfaceC0975He> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public V6(Context context, I0<? super InterfaceC0975He> i02, InterfaceC0974Hd interfaceC0974Hd) {
        this.A00 = context.getApplicationContext();
        this.A02 = i02;
        this.A01 = interfaceC0974Hd;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public V6(Context context, String str, I0<? super InterfaceC0975He> i02) {
        this(context, i02, new C2N(str, i02));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0974Hd
    /* renamed from: A00 */
    public final V7 A4E() {
        return new V7(this.A00, this.A02, this.A01.A4E());
    }
}
