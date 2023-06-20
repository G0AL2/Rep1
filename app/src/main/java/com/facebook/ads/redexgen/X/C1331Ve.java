package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.applovin.mediation.MaxErrorCode;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ve  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1331Ve implements F4 {
    public static String[] A06 = {"0vmpU1QtAhI6qjIdcVId", "klBv", "qKjW3ego541fEYihs", "NuBFx4EY8fIgWeMvZ", "vAKBh2R", "FoB4J1nu", "9b5WU1uKCw6g3SYcMdOb", "twQXN8Z"};
    public final C0979Hi A00;
    public final I4 A01;
    public final C1317Uq A02;
    public final C1008In A04;
    public final I9 A03 = new I9();
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C1331Ve(Uri uri, String str, F5 f52) {
        this.A00 = new C0979Hi(uri, 0L, -1L, str, 0);
        this.A01 = f52.A00();
        this.A02 = f52.A01(false);
        this.A04 = f52.A02();
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void A4t() throws InterruptedException, IOException {
        this.A04.A00(MaxErrorCode.NETWORK_ERROR);
        try {
            IA.A03(this.A00, this.A01, this.A02, new byte[131072], this.A04, MaxErrorCode.NETWORK_ERROR, this.A03, this.A05, true);
            C1008In c1008In = this.A04;
            String[] strArr = A06;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "qX3fQQGAY3dTsBjdyBPn";
            strArr2[6] = "Z0TFAaYyqvVnxMY9deNw";
            c1008In.A03(MaxErrorCode.NETWORK_ERROR);
        } catch (Throwable th) {
            this.A04.A03(MaxErrorCode.NETWORK_ERROR);
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final float A6P() {
        long j10 = this.A03.A01;
        if (j10 == -1) {
            return -1.0f;
        }
        return (((float) this.A03.A00()) * 100.0f) / ((float) j10);
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final long A6Q() {
        return this.A03.A00();
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void cancel() {
        this.A05.set(true);
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void remove() {
        IA.A05(this.A01, IA.A02(this.A00));
    }
}
