package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.Arrays;

@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public final class JD {
    public static byte[] A0C;
    public static String[] A0D = {"i0Plrx2Nq5R", "0KClt8Z9EM", "nQMuIj2OsVJHQqYmqvawjMpASRVzc92c", "WLkeStMKuRlseW4hkxDKryqccASBMssv", "75mbZl2wj9Oc7L4cfBN0ornHxJ7x4bV4", "cDdFi4obBr6Dm4LziWqhdJNE9f6gL2cC", "Y", "1LOEfBfCv2OZoty488nnb7WvOOH1XlhR"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final JB A0A;
    public final JC A0B;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{109, 96, 122, 121, 101, 104, 112, 120, 102, 97, 107, 96, 120};
    }

    static {
        A04();
    }

    public JD() {
        this(null);
    }

    public JD(@Nullable Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 115));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = C1020Iz.A02 >= 17 ? A01(context) : null;
            this.A0B = JC.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public static long A00(long vsyncCount, long j10, long snappedBeforeNs) {
        long snappedTimeNs;
        long snappedTimeNs2 = j10 + (snappedBeforeNs * ((vsyncCount - j10) / snappedBeforeNs));
        if (vsyncCount <= snappedTimeNs2) {
            snappedTimeNs = snappedTimeNs2 - snappedBeforeNs;
        } else {
            snappedTimeNs = snappedTimeNs2;
            snappedTimeNs2 += snappedBeforeNs;
        }
        return snappedTimeNs2 - vsyncCount < vsyncCount - snappedTimeNs ? snappedTimeNs2 : snappedTimeNs;
    }

    @TargetApi(17)
    private JB A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 117));
        if (displayManager == null) {
            return null;
        }
        return new JB(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            double defaultDisplayRefreshRate = defaultDisplay.getRefreshRate();
            double d10 = 1.0E9d / defaultDisplayRefreshRate;
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0D[0] = "cQjBVfAMAaWJXkNWf";
            this.A06 = (long) d10;
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j10, long j11) {
        return Math.abs((j11 - this.A05) - (j10 - this.A04)) > 20000000;
    }

    public final long A07(long j10, long j11) {
        long j12 = 1000 * j10;
        long j13 = j12;
        long adjustedReleaseTimeNs = j11;
        if (this.A08) {
            if (j10 != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            long j14 = this.A01;
            if (j14 >= 6) {
                long j15 = this.A00 + ((j12 - this.A04) / j14);
                if (!A06(j15, j11)) {
                    long adjustedFrameTimeNs = this.A04;
                    adjustedReleaseTimeNs = (this.A05 + j15) - adjustedFrameTimeNs;
                    j13 = j15;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j12, j11)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j12;
            this.A05 = j11;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j10;
        this.A03 = j13;
        JC jc2 = this.A0B;
        if (jc2 == null || this.A06 == -9223372036854775807L) {
            return adjustedReleaseTimeNs;
        }
        long j16 = jc2.A04;
        if (j16 == -9223372036854775807L) {
            return adjustedReleaseTimeNs;
        }
        long adjustedFrameTimeNs2 = this.A06;
        long adjustedReleaseTimeNs2 = A00(adjustedReleaseTimeNs, j16, adjustedFrameTimeNs2);
        long adjustedFrameTimeNs3 = this.A07;
        return adjustedReleaseTimeNs2 - adjustedFrameTimeNs3;
    }

    public final void A08() {
        if (this.A09 != null) {
            JB jb2 = this.A0A;
            if (jb2 != null) {
                jb2.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            JB jb2 = this.A0A;
            if (jb2 != null) {
                jb2.A00();
            }
            A03();
        }
    }
}
