package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface g {

    /* loaded from: classes2.dex */
    public interface a {
        g a();
    }

    int a(byte[] bArr, int i10, int i11) throws IOException;

    long a(j jVar) throws IOException;

    Uri a();

    void close() throws IOException;
}
