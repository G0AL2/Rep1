package com.facebook.ads.internal.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0902Ej;
import com.facebook.ads.redexgen.X.F4;
import com.facebook.ads.redexgen.X.F5;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class DownloadAction {
    public static byte[] A05;
    public final int A00;
    public final Uri A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-55, -67, 14, 47, -32, 36, 37, 51, 37, 50, 41, 33, 44, 41, 58, 37, 50, -32, 38, 47, 53, 46, 36, -32, 38, 47, 50, -6};
    }

    public abstract F4 A07(F5 f52);

    public abstract void A08(DataOutputStream dataOutputStream) throws IOException;

    /* loaded from: assets/audience_network.dex */
    public static abstract class Deserializer {
        public final int A00;
        public final String A01;

        public abstract DownloadAction A01(int i10, DataInputStream dataInputStream) throws IOException;

        public Deserializer(String str, int i10) {
            this.A01 = str;
            this.A00 = i10;
        }
    }

    public DownloadAction(String str, int i10, Uri uri, boolean z10, @Nullable byte[] bArr) {
        this.A02 = str;
        this.A00 = i10;
        this.A01 = uri;
        this.A03 = z10;
        this.A04 = bArr == null ? new byte[0] : bArr;
    }

    public static DownloadAction A00(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String readUTF = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (readUTF.equals(deserializer.A01) && deserializer.A00 >= readInt) {
                return deserializer.A01(readInt, dataInputStream);
            }
        }
        throw new C0902Ej(A01(2, 26, 85) + readUTF + A01(0, 2, 50) + readInt);
    }

    public static void A03(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.A02);
        dataOutputStream.writeInt(downloadAction.A00);
        downloadAction.A08(dataOutputStream);
        dataOutputStream.flush();
    }

    public boolean A09(DownloadAction downloadAction) {
        return this.A01.equals(downloadAction.A01);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAction that = (DownloadAction) obj;
        return this.A02.equals(that.A02) && this.A00 == that.A00 && this.A01.equals(that.A01) && this.A03 == that.A03 && Arrays.equals(this.A04, that.A04);
    }

    public int hashCode() {
        int result = Arrays.hashCode(this.A04);
        return (((this.A01.hashCode() * 31) + (this.A03 ? 1 : 0)) * 31) + result;
    }
}
