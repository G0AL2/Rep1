package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C1020Iz;
import com.facebook.ads.redexgen.X.EO;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ChapterFrame extends Id3Frame {
    public static byte[] A06;
    public static String[] A07 = {"GWf8uKqsfvaGUlkt0BhXFWoASdgMsHRN", "1uUtSVmrf1POvzM4cm1EH", "ZO7MghhsAapkkjefU321avSkRWZWBMAu", "GT5gZr6sKzf9s3UvJF0bkk", "G1LpoTCkaTmfFLDCiyRgtkZuciVWUChZ", "TJO8eIHQYE6Bw6RKRlnJr", "gl6", "UcHnHjLRU0SMjCpK61vZZpBDqAm68hmZ"};
    public static final Parcelable.Creator<ChapterFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Id3Frame[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A07;
            if (strArr[2].charAt(7) != strArr[0].charAt(7)) {
                throw new RuntimeException();
            }
            A07[7] = "hk5Yo8HG0iFyBsfqJ1cZvcD46s4xS3Im";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
            i13++;
        }
    }

    public static void A01() {
        A06 = new byte[]{-8, -3, -10, 5};
    }

    static {
        A01();
        CREATOR = new EO();
    }

    public ChapterFrame(Parcel parcel) {
        super(A00(0, 4, 75));
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        this.A05 = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.A05[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 75));
        this.A04 = str;
        this.A01 = i10;
        this.A00 = i11;
        this.A03 = j10;
        this.A02 = j11;
        this.A05 = id3FrameArr;
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
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
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.A01 == chapterFrame.A01 && this.A00 == chapterFrame.A00 && this.A03 == chapterFrame.A03 && this.A02 == chapterFrame.A02 && C1020Iz.A0g(this.A04, chapterFrame.A04)) {
            Id3Frame[] id3FrameArr = this.A05;
            Id3Frame[] id3FrameArr2 = chapterFrame.A05;
            String[] strArr = A07;
            if (strArr[2].charAt(7) != strArr[0].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "CDR";
            strArr2[3] = "u0ZPA012b2bRTkfI4ipvZt";
            if (Arrays.equals(id3FrameArr, id3FrameArr2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int result2 = (int) this.A02;
        int i10 = ((((((((17 * 31) + this.A01) * 31) + result) * 31) + ((int) this.A03)) * 31) + result2) * 31;
        String str = this.A04;
        int result3 = str != null ? str.hashCode() : 0;
        return i10 + result3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Id3Frame[] id3FrameArr;
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A05.length);
        for (Id3Frame subFrame : this.A05) {
            parcel.writeParcelable(subFrame, 0);
        }
    }
}
