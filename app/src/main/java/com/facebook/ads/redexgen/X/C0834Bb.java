package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Bb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0834Bb {
    public static String[] A06 = {"W1h", "J3B5KCEbjjwmRuC3OBjGZe6Vqq", "m9qFzMc74R8svEUC9gqMjQn", "jgNIoR8qAkaEc7us150M5yTFbz", "3ys", "w1u", "bbeJnzocKvEAyVfPIveapdYFC3HTaXea", "5a1"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    @Nullable
    public final BZ A05;

    public C0834Bb(AudioTrack audioTrack) {
        if (C1020Iz.A02 >= 19) {
            this.A05 = new BZ(audioTrack);
            A05();
            return;
        }
        this.A05 = null;
        A00(3);
    }

    private void A00(int i10) {
        this.A00 = i10;
        if (i10 == 0) {
            this.A03 = 0L;
            this.A01 = -1L;
            this.A02 = System.nanoTime() / 1000;
            this.A04 = 5000L;
        } else if (i10 == 1) {
            this.A04 = 5000L;
        } else if (i10 == 2 || i10 == 3) {
            this.A04 = 10000000L;
        } else if (i10 == 4) {
            this.A04 = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }

    public final long A01() {
        BZ bz = this.A05;
        if (bz != null) {
            return bz.A00();
        }
        return -1L;
    }

    public final long A02() {
        BZ bz = this.A05;
        if (bz != null) {
            return bz.A01();
        }
        return -9223372036854775807L;
    }

    public final void A03() {
        if (this.A00 == 4) {
            A05();
        }
    }

    public final void A04() {
        A00(4);
    }

    public final void A05() {
        if (this.A05 != null) {
            A00(0);
        }
    }

    public final boolean A06() {
        int i10 = this.A00;
        return i10 == 1 || i10 == 2;
    }

    public final boolean A07() {
        return this.A00 == 2;
    }

    public final boolean A08(long timestampPositionFrames) {
        BZ bz = this.A05;
        if (bz == null || timestampPositionFrames - this.A03 < this.A04) {
            return false;
        }
        this.A03 = timestampPositionFrames;
        boolean A02 = bz.A02();
        int i10 = this.A00;
        if (i10 == 0) {
            if (A02) {
                if (this.A05.A01() >= this.A02) {
                    this.A01 = this.A05.A00();
                    String[] strArr = A06;
                    if (strArr[1].length() != strArr[3].length()) {
                        A00(1);
                        return A02;
                    }
                    String[] strArr2 = A06;
                    strArr2[5] = "X7O";
                    strArr2[4] = "dhv";
                    A00(1);
                    return A02;
                }
                return false;
            } else if (timestampPositionFrames - this.A02 > 500000) {
                A00(3);
                return A02;
            } else {
                return A02;
            }
        } else if (i10 == 1) {
            if (A02) {
                if (this.A05.A00() > this.A01) {
                    A00(2);
                    return A02;
                }
                return A02;
            }
            A05();
            return A02;
        } else if (i10 == 2) {
            if (!A02) {
                A05();
                return A02;
            }
            return A02;
        } else if (i10 == 3) {
            if (A02) {
                A05();
                return A02;
            }
            return A02;
        } else {
            String[] strArr3 = A06;
            if (strArr3[0].length() != strArr3[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A06;
            strArr4[5] = "KBr";
            strArr4[4] = "FWj";
            if (i10 == 4) {
                return A02;
            }
            throw new IllegalStateException();
        }
    }
}
