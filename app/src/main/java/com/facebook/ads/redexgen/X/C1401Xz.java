package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Xz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1401Xz implements InterfaceC1207Qj {
    public static byte[] A04;
    public static String[] A05 = {"YemVV2CAzinSYko79pvdFyiaYh6Ax0NW", "FtFCRkuseyQck6qipAKyAgz81MNc63Vq", "zQJLp3VKHBLQ3ByylDAuuS44tkTO3MMG", "42Yp5AyXW20j54q75pN0MZ83oMgNP5AR", "H6ih9Bh2z", "6YmusGfII7QcqEjcRVkg771Wm5bkMvFZ", "MrQdRQonl4dLBaJwcA8", "V6zsFfxQuHmo6VBO3CkkHMQL74uZQLm4"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C7P A02;
    public final /* synthetic */ C7Q A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{24, 3, 6, 3, 2, 26, 3, 62, 33, 44, 45, 39};
    }

    static {
        A01();
    }

    public C1401Xz(C7P c7p, C7Q c7q, long j10, long j11) {
        this.A02 = c7p;
        this.A03 = c7q;
        this.A00 = j10;
        this.A01 = j11;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1207Qj
    public final void AAY(boolean z10) {
        C8U c8u;
        BlockingQueue blockingQueue;
        C8U c8u2;
        Map map;
        C8U c8u3;
        c8u = this.A02.A01.A04;
        if (C7X.A06(c8u)) {
            C7W c7w = new C7W(this.A03.A06, this.A03.A07, A00(7, 5, 22), this.A03.A02, this.A03.A08);
            c8u2 = this.A02.A01.A04;
            C7X.A04(c8u2, c7w, z10);
            if (!z10) {
                c8u3 = this.A02.A01.A04;
                C7X.A05(c8u3, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 22), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            map = C7U.A0G;
            if (A05[1].charAt(13) == 'O') {
                throw new RuntimeException();
            }
            A05[1] = "tpujksKgYg5a3fdXCIDkrfoMaur1s0eW";
            map.put(c7w.A04, c7w);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1207Qj
    public final void AAk(@Nullable Throwable th) {
        C8U c8u;
        BlockingQueue blockingQueue;
        C8U c8u2;
        c8u = this.A02.A01.A04;
        if (C7X.A06(c8u)) {
            c8u2 = this.A02.A01.A04;
            String str = this.A03.A06;
            String str2 = this.A03.A07;
            String str3 = this.A03.A08;
            String str4 = this.A03.A02;
            String th2 = th != null ? th.toString() : A00(0, 7, 51);
            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A01);
            String[] strArr = A05;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "AayJnSlXKOYoed0ZHJ3UlPrg44Go7inE";
            strArr2[7] = "t2uUu9WqhkybHrBNVhVVT1YnAGopOKs6";
            C7X.A05(c8u2, str, str2, str3, A00(7, 5, 22), str4, 2119, th2, null, valueOf, null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
