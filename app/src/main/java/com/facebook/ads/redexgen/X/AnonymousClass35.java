package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.35  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass35 extends E4 implements Handler.Callback {
    public static String[] A0B = {"03Bqi0KbTszfVpZRuJU3ds8C", "k1GP5ixeRS7AgIgDUeTgx", "4NCpljRKbMpI7nrSCbEL8iNDtCMdRKX", "14neR4MzrfGB8mqjKcaUOPf9qenZk", "2yEqk33zpOnAOPOYE0N2JJzqUjZjGZ3w", "pyvhSQAAYlr5mafzJ0Hik2RvaYh4S", "eoJA2AjfdFBVMgfGYGogvo8ECKzj9gDa", "xUrUxSkwRZIOD3qEvYK8t45D"};
    public int A00;
    public int A01;
    public EG A02;
    public boolean A03;
    public final Handler A04;
    public final AZ A05;
    public final EI A06;
    public final DJ A07;
    public final EJ A08;
    public final long[] A09;
    public final Metadata[] A0A;

    public AnonymousClass35(EJ ej, Looper looper) {
        this(ej, looper, EI.A00);
    }

    public AnonymousClass35(EJ ej, Looper looper, EI ei) {
        super(4);
        this.A08 = (EJ) IK.A01(ej);
        this.A04 = looper == null ? null : new Handler(looper, this);
        this.A06 = (EI) IK.A01(ei);
        this.A05 = new AZ();
        this.A07 = new DJ();
        this.A0A = new Metadata[5];
        this.A09 = new long[5];
    }

    private void A00() {
        Arrays.fill(this.A0A, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A01(Metadata metadata) {
        Handler handler = this.A04;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            A02(metadata);
        }
    }

    private void A02(Metadata metadata) {
        this.A08.ABY(metadata);
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A12() {
        A00();
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A15(long j10, boolean z10) {
        A00();
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A17(Format[] formatArr, long j10) throws AM {
        this.A02 = this.A06.A4F(formatArr[0]);
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A8R() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A8c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void ADz(long j10, long j11) throws AM {
        if (!this.A03 && this.A00 < 5) {
            this.A07.A07();
            if (A10(this.A05, this.A07, false) == -4) {
                if (this.A07.A04()) {
                    this.A03 = true;
                } else if (!this.A07.A03()) {
                    DJ dj = this.A07;
                    String[] strArr = A0B;
                    if (strArr[0].length() != strArr[7].length()) {
                        String[] strArr2 = A0B;
                        strArr2[6] = "oJNy7wvRq4TsnN4Ik7JOHneCelTjV3TM";
                        strArr2[4] = "4f5lGS7X1G5JYf6Usji5tJWLoKljCGYJ";
                        dj.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                    } else {
                        String[] strArr3 = A0B;
                        strArr3[0] = "JrbxqibW71vJtGIxmKNzu0gc";
                        strArr3[7] = "aBslXCcOqyoFcXReLJb0k0eg";
                        dj.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                    }
                    try {
                        int i10 = (this.A01 + this.A00) % 5;
                        this.A0A[i10] = this.A02.A4h(this.A07);
                        this.A09[i10] = ((X2) this.A07).A00;
                        this.A00++;
                    } catch (EH e10) {
                        throw AM.A01(e10, A0y());
                    }
                }
            }
        }
        int i11 = this.A00;
        String[] strArr4 = A0B;
        if (strArr4[0].length() != strArr4[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr5 = A0B;
        strArr5[2] = "FI5ou6JhGKfNQASG6lr2Dh53KdKmMJ1";
        strArr5[1] = "8nK6Ac79BLzTFAHCrRK9v";
        if (i11 > 0) {
            long[] jArr = this.A09;
            int i12 = this.A01;
            if (jArr[i12] <= j10) {
                A01(this.A0A[i12]);
                Metadata[] metadataArr = this.A0A;
                int i13 = this.A01;
                metadataArr[i13] = null;
                this.A01 = (i13 + 1) % 5;
                this.A00--;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0828Au
    public final int AF7(Format format) {
        if (this.A06.AF8(format)) {
            return E4.A0x(null, format.A0H) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A02((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
