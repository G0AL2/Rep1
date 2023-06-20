package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.Ur  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1318Ur implements InterfaceC0973Hc {
    public static String[] A0B = {"w20bAWjYMNQBWlbon1lxwLvvC2Wc6aDw", "lwUY3oAzCyDGvzazHVXOHQ3zY7kbNweW", "UaweMkDBVxVyODuJAIk0oAizBiXulMgw", "HCwWhWYnSwS9lU8hovQ66gM", "BSrpyguVpFJpaQafc1NdT7mO3uIgLmFW", "PMiNqiQ4kgs0VWuHsJy6tm47yNuoSJAG", "LFxM2Smyc2PeWHZihlec1nFmzNKIeMAJ", "CwFpegEhQfdxfTMnj3Ot7m2"};
    public long A00;
    public long A01;
    public C0979Hi A02;
    public C1011Iq A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final I4 A09;
    public final boolean A0A;

    public C1318Ur(I4 i42, long j10) {
        this(i42, j10, 20480, true);
    }

    public C1318Ur(I4 i42, long j10, int i10, boolean z10) {
        this.A09 = (I4) IK.A01(i42);
        this.A08 = j10;
        this.A07 = i10;
        this.A0A = z10;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            boolean success = this.A0A;
            if (success) {
                this.A05.getFD().sync();
            }
            C1020Iz.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A44(file);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            C1020Iz.A0X(this.A06);
            this.A06 = null;
            File file2 = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A44(file2);
            } else {
                file2.delete();
            }
            throw th;
        }
    }

    private void A01() throws IOException {
        long min;
        if (this.A02.A02 == -1) {
            min = this.A08;
        } else {
            long j10 = this.A02.A02;
            long maxLength = this.A00;
            long j11 = j10 - maxLength;
            long maxLength2 = this.A08;
            min = Math.min(j11, maxLength2);
        }
        I4 i42 = this.A09;
        String str = this.A02.A05;
        long maxLength3 = this.A02.A01;
        this.A04 = i42.AEx(str, this.A00 + maxLength3, min);
        this.A05 = new FileOutputStream(this.A04);
        int i10 = this.A07;
        if (i10 > 0) {
            C1011Iq c1011Iq = this.A03;
            if (c1011Iq == null) {
                this.A03 = new C1011Iq(this.A05, i10);
            } else {
                c1011Iq.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0973Hc
    public final void ACy(C0979Hi c0979Hi) throws C1319Us {
        if (c0979Hi.A02 == -1 && !c0979Hi.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = c0979Hi;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e10) {
            throw new C1319Us(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0973Hc
    public final void close() throws C1319Us {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e10) {
            throw new C1319Us(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0973Hc
    public final void write(byte[] bArr, int bytesToWrite, int i10) throws C1319Us {
        if (this.A02 == null) {
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            try {
                int i12 = (this.A01 > this.A08 ? 1 : (this.A01 == this.A08 ? 0 : -1));
                if (A0B[0].charAt(30) != 'D') {
                    throw new RuntimeException();
                }
                A0B[6] = "jgYsfafqQwydOQ8BdugE0IR3OVOgVMqo";
                if (i12 == 0) {
                    A00();
                    A01();
                }
                int min = (int) Math.min(i10 - i11, this.A08 - this.A01);
                this.A06.write(bArr, bytesToWrite + i11, min);
                i11 += min;
                this.A01 += min;
                this.A00 += min;
            } catch (IOException e10) {
                throw new C1319Us(e10);
            }
        }
    }
}
