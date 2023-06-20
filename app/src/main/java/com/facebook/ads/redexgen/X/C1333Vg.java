package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1333Vg extends DownloadAction.Deserializer {
    public C1333Vg(String str, int i10) {
        super(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction.Deserializer
    /* renamed from: A00 */
    public final C1332Vf A01(int i10, DataInputStream dataInputStream) throws IOException {
        Uri parse = Uri.parse(dataInputStream.readUTF());
        boolean readBoolean = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        return new C1332Vf(parse, readBoolean, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
    }
}
