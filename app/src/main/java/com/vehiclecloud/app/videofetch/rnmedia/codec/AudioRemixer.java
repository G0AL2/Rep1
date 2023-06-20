package com.vehiclecloud.app.videofetch.rnmedia.codec;

import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public interface AudioRemixer {
    public static final AudioRemixer DOWNMIX = new AudioRemixer() { // from class: com.vehiclecloud.app.videofetch.rnmedia.codec.AudioRemixer.1
        private static final int SIGNED_SHORT_LIMIT = 32768;
        private static final int UNSIGNED_SHORT_MAX = 65535;

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.AudioRemixer
        public void remix(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
            int i10;
            int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
            for (int i11 = 0; i11 < min; i11++) {
                int i12 = shortBuffer.get() + SIGNED_SHORT_LIMIT;
                int i13 = shortBuffer.get() + SIGNED_SHORT_LIMIT;
                int i14 = UNSIGNED_SHORT_MAX;
                if (i12 >= SIGNED_SHORT_LIMIT && i13 >= SIGNED_SHORT_LIMIT) {
                    i10 = (((i12 + i13) * 2) - ((i12 * i13) / SIGNED_SHORT_LIMIT)) - UNSIGNED_SHORT_MAX;
                } else {
                    i10 = (i12 * i13) / SIGNED_SHORT_LIMIT;
                }
                if (i10 != 65536) {
                    i14 = i10;
                }
                shortBuffer2.put((short) (i14 - SIGNED_SHORT_LIMIT));
            }
        }
    };
    public static final AudioRemixer UPMIX = new AudioRemixer() { // from class: com.vehiclecloud.app.videofetch.rnmedia.codec.AudioRemixer.2
        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.AudioRemixer
        public void remix(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
            int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
            for (int i10 = 0; i10 < min; i10++) {
                short s10 = shortBuffer.get();
                shortBuffer2.put(s10);
                shortBuffer2.put(s10);
            }
        }
    };
    public static final AudioRemixer PASSTHROUGH = new AudioRemixer() { // from class: com.vehiclecloud.app.videofetch.rnmedia.codec.AudioRemixer.3
        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.AudioRemixer
        public void remix(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
            shortBuffer2.put(shortBuffer);
        }
    };

    void remix(ShortBuffer shortBuffer, ShortBuffer shortBuffer2);
}
