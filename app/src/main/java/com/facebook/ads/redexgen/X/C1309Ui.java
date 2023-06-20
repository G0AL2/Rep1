package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.Ui  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1309Ui implements IX {
    public final Handler A00;

    public C1309Ui(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.IX
    public final Looper A6v() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.IX
    public final Message A9k(int i10, int i11, int i12) {
        return this.A00.obtainMessage(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.IX
    public final Message A9l(int i10, int i11, int i12, Object obj) {
        return this.A00.obtainMessage(i10, i11, i12, obj);
    }

    @Override // com.facebook.ads.redexgen.X.IX
    public final Message A9m(int i10, Object obj) {
        return this.A00.obtainMessage(i10, obj);
    }

    @Override // com.facebook.ads.redexgen.X.IX
    public final void ADw(int i10) {
        this.A00.removeMessages(i10);
    }

    @Override // com.facebook.ads.redexgen.X.IX
    public final boolean AER(int i10) {
        return this.A00.sendEmptyMessage(i10);
    }

    @Override // com.facebook.ads.redexgen.X.IX
    public final boolean AES(int i10, long j10) {
        return this.A00.sendEmptyMessageAtTime(i10, j10);
    }
}
