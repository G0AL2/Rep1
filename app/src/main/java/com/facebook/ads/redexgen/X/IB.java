package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class IB {
    public static byte[] A05;
    public static String[] A06 = {"MBceJWRKAgeQJNY3ZRBdRhYJgpL3jkFQ", "518xlpwWcjlWASul8lHAahT8PqQVPF3u", "9RLjFZMlaqPSYVxgrCr3N29CAF4vaCFh", "Nd9PnywG3g8LluWsmNbg8PXBjZKSlX8G", "s", "C1TdeuC5gtnvKYkq95Rq", "MkXsOhuicHq9DXlwRCZefot2VxsvXJH1", "VJm3srbtmlXEw3gKHWc"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C1314Un A00 = C1314Un.A04;
    public final TreeSet<C1312Ul> A04 = new TreeSet<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{70, 0, 7, 15, 10, 3, 2, 72, 58, 110, 117, 58, 0, 55, 60, 51, 63, 59, 60, 53, 114, 61, 52, 114};
    }

    static {
        A02();
    }

    public IB(int i10, String str) {
        this.A02 = i10;
        this.A03 = str;
    }

    public static IB A00(int id2, DataInputStream dataInputStream) throws IOException {
        IB ib2 = new IB(dataInputStream.readInt(), dataInputStream.readUTF());
        if (id2 < 2) {
            long readLong = dataInputStream.readLong();
            IG mutations = new IG();
            IF.A05(mutations, readLong);
            ib2.A0F(mutations);
        } else {
            C1314Un A00 = C1314Un.A00(dataInputStream);
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[1] = "w2ExrNvXNhLYBLEt12rGyqcfRXmaXRhw";
            ib2.A00 = A00;
        }
        return ib2;
    }

    public final int A03(int result) {
        int hashCode = (this.A02 * 31) + this.A03.hashCode();
        if (result < 2) {
            long A00 = IF.A00(this.A00);
            return (hashCode * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (hashCode * 31) + this.A00.hashCode();
    }

    public final long A04(long queryEndPosition, long currentEndPosition) {
        C1312Ul A062 = A06(queryEndPosition);
        if (A062.A01()) {
            long j10 = -Math.min(A062.A02() ? Long.MAX_VALUE : A062.A01, currentEndPosition);
            if (A06[3].charAt(14) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "ZNj15xTvoSD0UBJTiXr";
            strArr[5] = "u99g5dbJfvVcRXaISwTW";
            return j10;
        }
        long j11 = queryEndPosition + currentEndPosition;
        long j12 = A062.A02 + A062.A01;
        if (j12 < j11) {
            for (C1312Ul c1312Ul : this.A04.tailSet(A062, false)) {
                if (c1312Ul.A02 > j12) {
                    break;
                }
                j12 = Math.max(j12, c1312Ul.A02 + c1312Ul.A01);
                if (j12 >= j11) {
                    break;
                }
            }
        }
        return Math.min(j12 - queryEndPosition, currentEndPosition);
    }

    public final IE A05() {
        return this.A00;
    }

    public final C1312Ul A06(long j10) {
        C1312Ul A01 = C1312Ul.A01(this.A03, j10);
        C1312Ul floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j10) {
            return floor;
        }
        C1312Ul ceiling = this.A04.ceiling(A01);
        if (ceiling == null) {
            return C1312Ul.A02(this.A03, j10);
        }
        return C1312Ul.A03(this.A03, j10, ceiling.A02 - j10);
    }

    public final C1312Ul A07(C1312Ul c1312Ul) throws I2 {
        IK.A04(this.A04.remove(c1312Ul));
        C1312Ul A08 = c1312Ul.A08(this.A02);
        if (c1312Ul.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new I2(A01(12, 12, 78) + c1312Ul.A03 + A01(8, 4, 6) + A08.A03 + A01(0, 8, 122));
    }

    public final TreeSet<C1312Ul> A08() {
        return this.A04;
    }

    public final void A09(C1312Ul c1312Ul) {
        this.A04.add(c1312Ul);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z10) {
        this.A01 = z10;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(I8 i82) {
        if (this.A04.remove(i82)) {
            i82.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(IG ig) {
        C1314Un c1314Un = this.A00;
        this.A00 = this.A00.A08(ig);
        return !this.A00.equals(c1314Un);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IB ib2 = (IB) obj;
        if (this.A02 == ib2.A02 && this.A03.equals(ib2.A03)) {
            TreeSet<C1312Ul> treeSet = this.A04;
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[4] = "qw9AeUbTiw";
            if (treeSet.equals(ib2.A04) && this.A00.equals(ib2.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (A03(Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31) + this.A04.hashCode();
    }
}
