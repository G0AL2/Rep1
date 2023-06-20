package b9;

import android.media.MediaCodec;

/* compiled from: MediaCodecDecoderException.java */
/* loaded from: classes2.dex */
public class m extends m8.f {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(java.lang.Throwable r3, b9.n r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L4
            r4 = 0
            goto L6
        L4:
            java.lang.String r4 = r4.f4950a
        L6:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r0 = r4.length()
            java.lang.String r1 = "Decoder failed: "
            if (r0 == 0) goto L17
            java.lang.String r4 = r1.concat(r4)
            goto L1c
        L17:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L1c:
            r2.<init>(r4, r3)
            int r4 = ea.n0.f29709a
            r0 = 21
            if (r4 < r0) goto L28
            a(r3)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.m.<init>(java.lang.Throwable, b9.n):void");
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
