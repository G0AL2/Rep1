package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* loaded from: assets/audience_network.dex */
public final class BZ {
    public static String[] A05 = {"hXzwgj", "m5NHdl", "qaeI79kuvzi26y0bJn0wV18LiAlk", "tfG9iZSRQiNj2EvVRPJnhc19jSuMT", "6UoLmsiSnH1csk5w0bo3HPjstPvv", "sXlBQQpxGRnN1JuvhdqTM94Gwv6TjVhN", "1KeZnMOcsYgFpR4R", "C7V0rXn61lsPUJHMKH"};
    public long A00;
    public long A01;
    public long A02;
    public final AudioTimestamp A03 = new AudioTimestamp();
    public final AudioTrack A04;

    public BZ(AudioTrack audioTrack) {
        this.A04 = audioTrack;
    }

    public final long A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A03.nanoTime / 1000;
    }

    public final boolean A02() {
        boolean timestamp = this.A04.getTimestamp(this.A03);
        if (timestamp) {
            long j10 = this.A03.framePosition;
            long j11 = this.A01;
            if (A05[0].length() != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[4] = "0BH9Jyesuik9e3e5zlyEkDvQUoD8";
            strArr[2] = "w9RQ6alnYa022c0FTfswjmfCm3D8";
            if (j11 > j10) {
                this.A02++;
            }
            this.A01 = j10;
            long rawPositionFrames = this.A02;
            this.A00 = (rawPositionFrames << 32) + j10;
        }
        return timestamp;
    }
}
