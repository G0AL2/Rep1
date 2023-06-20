package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KS extends ImageView implements Q7 {
    public static byte[] A05;
    public static String[] A06 = {"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    public static final int A07;
    @Nullable
    public QK A00;
    public final Paint A01;
    public final C1400Xy A02;
    public final C1036Jp A03;
    public final AbstractC1049Kc A04;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    static {
        A06();
        A07 = (int) (Lr.A00 * 4.0f);
    }

    public KS(C1400Xy c1400Xy, C1036Jp c1036Jp) {
        super(c1400Xy);
        this.A04 = new AbstractC1049Kc() { // from class: com.facebook.ads.redexgen.X.7n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(C1050Kd c1050Kd) {
                KS.this.A09();
            }
        };
        this.A03 = c1036Jp;
        this.A02 = c1400Xy;
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        int i10 = A07;
        setPadding(i10, i10, i10, i10);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new QL(this));
    }

    private void A04() {
        setImageBitmap(C1095Mb.A01(EnumC1094Ma.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(C1095Mb.A01(EnumC1094Ma.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        QK qk = this.A00;
        if (qk != null) {
            float volume = qk.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A8o(QK qk) {
        this.A00 = qk;
        QK qk2 = this.A00;
        if (qk2 != null) {
            qk2.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void AFG(QK qk) {
        QK qk2 = this.A00;
        if (qk2 != null) {
            qk2.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.A01);
        super.onDraw(canvas);
    }
}
