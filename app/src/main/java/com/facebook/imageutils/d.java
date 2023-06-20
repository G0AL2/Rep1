package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamProcessor.java */
/* loaded from: classes.dex */
class d {
    public static int a(InputStream inputStream, int i10, boolean z10) throws IOException {
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IOException("no more bytes");
            }
            if (z10) {
                i11 = (read & 255) << (i13 * 8);
            } else {
                i12 <<= 8;
                i11 = read & 255;
            }
            i12 |= i11;
        }
        return i12;
    }
}
