package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Ch {
    public final C1004Ij A00 = new C1004Ij(10);

    @Nullable
    public final Metadata A00(InterfaceC0861Cd interfaceC0861Cd, @Nullable ES es) throws IOException, InterruptedException {
        int i10 = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC0861Cd.AD7(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                if (this.A00.A0G() != C1335Vk.A03) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int i11 = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i11];
                    byte[] id3Data = this.A00.A00;
                    System.arraycopy(id3Data, 0, bArr, 0, 10);
                    interfaceC0861Cd.AD7(bArr, 10, A0D);
                    metadata = new C1335Vk(es).A0O(bArr, i11);
                } else {
                    interfaceC0861Cd.A3K(A0D);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC0861Cd.AEB();
        interfaceC0861Cd.A3K(i10);
        return metadata;
    }
}
