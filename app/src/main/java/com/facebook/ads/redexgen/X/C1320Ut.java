package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ut  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1320Ut implements InterfaceC0975He {
    public static String[] A04 = {"jlvJAgNeHWnJa3dPhRRd4EpOWMdB4X8x", "basxIWwUdkqjCj33WkHPX1XLcRlnz9UL", "EJ8jlkQXjQdwyr2PvL7NnSmrIKvSoKH9", "vRfpY4dXxgFvSAkqLCYO6SFKljAHuCzv", "ygfsCaK9ODNV1JdDOAbtF6as7T2mwjea", "kZYhIpAIarjEuyurYojB34Vr8jYSU6r4", "j4JmDL8bElApoe2AoNbHhKsqdvNkVwQT", "xpYPLrN7DnWMQWubBysNzF9"};
    public long A00;
    public boolean A01;
    public final InterfaceC0973Hc A02;
    public final InterfaceC0975He A03;

    public C1320Ut(InterfaceC0975He interfaceC0975He, InterfaceC0973Hc interfaceC0973Hc) {
        this.A03 = (InterfaceC0975He) IK.A01(interfaceC0975He);
        this.A02 = (InterfaceC0973Hc) IK.A01(interfaceC0973Hc);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final Uri A7k() {
        return this.A03.A7k();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final long ACw(C0979Hi dataSpec) throws IOException {
        this.A00 = this.A03.ACw(dataSpec);
        if (this.A00 == 0) {
            return 0L;
        }
        int i10 = (dataSpec.A02 > (-1L) ? 1 : (dataSpec.A02 == (-1L) ? 0 : -1));
        if (A04[4].charAt(25) != 'd') {
            A04[4] = "5eBqCtKJCfmd3joSOHW3VJl5u39JA8K8";
            if (i10 == 0 && this.A00 != -1) {
                dataSpec = new C0979Hi(dataSpec.A04, dataSpec.A01, dataSpec.A03, this.A00, dataSpec.A05, dataSpec.A00);
            }
            this.A01 = true;
            this.A02.ACy(dataSpec);
            return this.A00;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i10, i11);
        if (read > 0) {
            this.A02.write(bArr, i10, read);
            long j10 = this.A00;
            if (j10 != -1) {
                long j11 = read;
                if (A04[2].charAt(20) == 'R') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[0] = "pjLm1ZauVMrHAqpQAI7gN0n14eRh7O52";
                strArr[5] = "T96N4GskjcbGLsEcsrwL44bvdnkYKV6X";
                this.A00 = j10 - j11;
            }
        }
        return read;
    }
}
