package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f21186b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f21187c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f21188d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f21189e;

    /* renamed from: f  reason: collision with root package name */
    private final Id3Frame[] f21190f;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<ChapterTocFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ChapterTocFrame[] newArray(int i10) {
            return new ChapterTocFrame[i10];
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f21186b = str;
        this.f21187c = z10;
        this.f21188d = z11;
        this.f21189e = strArr;
        this.f21190f = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f21187c == chapterTocFrame.f21187c && this.f21188d == chapterTocFrame.f21188d && n0.c(this.f21186b, chapterTocFrame.f21186b) && Arrays.equals(this.f21189e, chapterTocFrame.f21189e) && Arrays.equals(this.f21190f, chapterTocFrame.f21190f);
    }

    public int hashCode() {
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f21187c ? 1 : 0)) * 31) + (this.f21188d ? 1 : 0)) * 31;
        String str = this.f21186b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21186b);
        parcel.writeByte(this.f21187c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21188d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f21189e);
        parcel.writeInt(this.f21190f.length);
        for (Id3Frame id3Frame : this.f21190f) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f21186b = (String) n0.j(parcel.readString());
        this.f21187c = parcel.readByte() != 0;
        this.f21188d = parcel.readByte() != 0;
        this.f21189e = (String[]) n0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f21190f = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f21190f[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
