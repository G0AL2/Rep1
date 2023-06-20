package com.facebook.ads.internal.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.redexgen.X.C1020Iz;
import com.facebook.ads.redexgen.X.EK;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EventMessage implements Metadata.Entry {
    public static byte[] A07;
    public static String[] A08 = {"fI4iAzL5lef8p1l193S44ECw2CTR58PV", "PdcvVVpipS6hUQhj2QTj9ERyUh60iiHN", "EOSwTSd5S9U7JglFfn0dhffzbuhXMmK1", "haNv", "Ulgz86IvhOryvjaDBipPmbHdN9m", "N2EMP7r4iYju0PAa3PtG28933ln8Xs5x", "AAsm7xr2kPY6q5HtGh7X2lqqgUdz", "jmIOYTUiVmOkUuU2MI2jE9iOaLGYApKk"};
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final byte[] A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{92, 80, -103, -108, 109, -105, -117, -31, -52, -41, -32, -48, -88, -55, -47, -41, -53, -66, -92, -9, -25, -20, -23, -15, -23, -63};
    }

    static {
        A01();
        CREATOR = new EK();
    }

    public EventMessage(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A06 = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr, long j12) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = j10;
        this.A02 = j11;
        this.A06 = bArr;
        this.A03 = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.A03 == eventMessage.A03) {
            long j10 = this.A01;
            long j11 = eventMessage.A01;
            String[] strArr = A08;
            if (strArr[1].charAt(7) != strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "JZnOfrviSGR8gsT1IR6uUEQvndglfTl5";
            strArr2[7] = "Hy3jtE4i4RZSyY9TlZC2h4MkAjfybT5F";
            if (j10 == j11 && this.A02 == eventMessage.A02 && C1020Iz.A0g(this.A04, eventMessage.A04) && C1020Iz.A0g(this.A05, eventMessage.A05) && Arrays.equals(this.A06, eventMessage.A06)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i10 = 17 * 31;
            String str = this.A04;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.A05;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.A03;
            long j11 = this.A01;
            int result = (int) (j11 ^ (j11 >>> 32));
            long j12 = this.A02;
            int result2 = Arrays.hashCode(this.A06);
            this.A00 = ((((((((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + result) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + result2;
        }
        return this.A00;
    }

    public final String toString() {
        return A00(13, 13, 88) + this.A04 + A00(0, 5, 4) + this.A02 + A00(5, 8, 63) + this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A06);
    }
}
