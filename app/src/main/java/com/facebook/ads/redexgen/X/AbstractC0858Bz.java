package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0858Bz extends X0<C0856Bx, AbstractC0848Bp, GZ> implements VS {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{63, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 78, 79, 77, 89, 78, 79, 10, 79, 92, 92, 89, 92};
    }

    public abstract GY A0b(byte[] bArr, int i10, boolean z10) throws GZ;

    public AbstractC0858Bz(String str) {
        super(new C0856Bx[2], new AbstractC0848Bp[2]);
        this.A00 = str;
        A0Y(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.X0
    /* renamed from: A0E */
    public final GZ A0W(C0856Bx c0856Bx, AbstractC0848Bp abstractC0848Bp, boolean z10) {
        try {
            ByteBuffer byteBuffer = c0856Bx.A01;
            abstractC0848Bp.A09(((X2) c0856Bx).A00, A0b(byteBuffer.array(), byteBuffer.limit(), z10), c0856Bx.A00);
            abstractC0848Bp.A01(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (GZ e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.X0
    /* renamed from: A0F */
    public final GZ A0X(Throwable th) {
        return new GZ(A0I(0, 23, 109), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.X0
    /* renamed from: A0G */
    public final C0856Bx A0T() {
        return new C0856Bx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.X0
    /* renamed from: A0H */
    public final AbstractC0848Bp A0V() {
        return new AbstractC0848Bp(this) { // from class: com.facebook.ads.redexgen.X.34
            public final AbstractC0858Bz A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0848Bp
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.X0
    /* renamed from: A0c */
    public final void A0a(AbstractC0848Bp abstractC0848Bp) {
        super.A0a(abstractC0848Bp);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void AEg(long j10) {
    }
}
