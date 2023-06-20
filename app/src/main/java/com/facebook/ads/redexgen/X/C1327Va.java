package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Va  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1327Va implements InterfaceC0987Hs {
    public static String[] A0C = {"nBGgOhUJr5w54zk2FcSY", "YYZuUd", "gwBohD1o6c6DfEcFdJm47xfjaEoVukk3", "3TNnSL", "hJWvKqQqk09hkKqv49F3L8Ilz7Jhye22", "G8FOHrMAxxSNQBngbaVWxtAhYQnldn5N", "v6FRbmkBAKb4FwdIpHjrHHJWg4k1tULi", "7hirQzfzNIRD79h7knAyc8"};
    public long A00;
    public long A02;
    public C0979Hi A03;
    public final Uri A05;
    public final FU A07;
    public final InterfaceC0975He A08;
    public final IQ A09;
    public volatile boolean A0A;
    public final /* synthetic */ CE A0B;
    public final C0865Cj A06 = new C0865Cj();
    public boolean A04 = true;
    public long A01 = -1;

    public C1327Va(CE ce2, Uri uri, InterfaceC0975He interfaceC0975He, FU fu, IQ iq) {
        this.A0B = ce2;
        this.A05 = (Uri) IK.A01(uri);
        this.A08 = (InterfaceC0975He) IK.A01(interfaceC0975He);
        this.A07 = (FU) IK.A01(fu);
        this.A09 = iq;
    }

    public final void A04(long j10, long j11) {
        this.A06.A00 = j10;
        this.A02 = j11;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0987Hs
    public final void A3y() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0987Hs
    public final void A8m() throws IOException, InterruptedException {
        int i10 = 0;
        while (i10 == 0) {
            boolean z10 = this.A0A;
            if (A0C[0].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "6lKOSY";
            strArr[1] = "aO7eUD";
            if (!z10) {
                InterfaceC0861Cd interfaceC0861Cd = null;
                try {
                    long j10 = this.A06.A00;
                    this.A03 = new C0979Hi(this.A05, j10, -1L, CE.A08(this.A0B));
                    this.A01 = this.A08.ACw(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += j10;
                    }
                    C1370Wu c1370Wu = new C1370Wu(this.A08, j10, this.A01);
                    InterfaceC0860Cc A02 = this.A07.A02(c1370Wu, this.A08.A7k());
                    if (this.A04) {
                        A02.AEL(j10, this.A02);
                        this.A04 = false;
                    }
                    while (i10 == 0 && !this.A0A) {
                        this.A09.A00();
                        i10 = A02.ADX(c1370Wu, this.A06);
                        if (c1370Wu.A7F() > CE.A03(this.A0B) + j10) {
                            j10 = c1370Wu.A7F();
                            this.A09.A01();
                            CE.A04(this.A0B).post(CE.A06(this.A0B));
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else {
                        this.A06.A00 = c1370Wu.A7F();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C1020Iz.A0W(this.A08);
                } catch (Throwable th) {
                    if (i10 != 1 && 0 != 0) {
                        this.A06.A00 = interfaceC0861Cd.A7F();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C1020Iz.A0W(this.A08);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
