package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f21180b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21181c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21182d;

    /* renamed from: e  reason: collision with root package name */
    public final long f21183e;

    /* renamed from: f  reason: collision with root package name */
    public final long f21184f;

    /* renamed from: g  reason: collision with root package name */
    private final Id3Frame[] f21185g;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<ChapterFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f21180b = str;
        this.f21181c = i10;
        this.f21182d = i11;
        this.f21183e = j10;
        this.f21184f = j11;
        this.f21185g = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f21181c == chapterFrame.f21181c && this.f21182d == chapterFrame.f21182d && this.f21183e == chapterFrame.f21183e && this.f21184f == chapterFrame.f21184f && n0.c(this.f21180b, chapterFrame.f21180b) && Arrays.equals(this.f21185g, chapterFrame.f21185g);
    }

    public int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21181c) * 31) + this.f21182d) * 31) + ((int) this.f21183e)) * 31) + ((int) this.f21184f)) * 31;
        String str = this.f21180b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21180b);
        parcel.writeInt(this.f21181c);
        parcel.writeInt(this.f21182d);
        parcel.writeLong(this.f21183e);
        parcel.writeLong(this.f21184f);
        parcel.writeInt(this.f21185g.length);
        for (Id3Frame id3Frame : this.f21185g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f21180b = (String) n0.j(parcel.readString());
        this.f21181c = parcel.readInt();
        this.f21182d = parcel.readInt();
        this.f21183e = parcel.readLong();
        this.f21184f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f21185g = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f21185g[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
