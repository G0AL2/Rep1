package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class JJ implements Runnable {
    public static String[] A05 = {"DJpTE", "hjmigejYKbOgwmfvV1nc5iE8IDOYmXil", "2YKNaj9Qlm", "qxfanbBXI2ZjoCTgG7w8KuDdJjLlXH62", "XtZaZ3wYkBKmpvCnemS2yQk1T2uyfDPG", "Gw99gcoZxN", "lvDFpJS29mpdODJdSJz5AdBwktpN", "hlGH8f80A3YyARPnHLcSnfRHIOI89tOr"};
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ JM A04;

    public JJ(JM jm, int i10, int i11, int i12, float f10) {
        this.A04 = jm;
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JN jn;
        if (L0.A02(this)) {
            return;
        }
        try {
            jn = this.A04.A01;
            jn.ACq(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            if (A05[0].length() != 5) {
                throw new RuntimeException();
            }
            A05[3] = "OXxSdVemaS9DNqMoLNSyLFOeF9oFC1IL";
            L0.A00(th, this);
        }
    }
}
