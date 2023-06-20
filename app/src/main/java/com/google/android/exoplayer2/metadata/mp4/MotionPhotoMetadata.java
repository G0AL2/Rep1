package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j8.b2;
import j8.p1;
import mb.f;

/* loaded from: classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f21222a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21223b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21224c;

    /* renamed from: d  reason: collision with root package name */
    public final long f21225d;

    /* renamed from: e  reason: collision with root package name */
    public final long f21226e;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<MotionPhotoMetadata> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MotionPhotoMetadata[] newArray(int i10) {
            return new MotionPhotoMetadata[i10];
        }
    }

    /* synthetic */ MotionPhotoMetadata(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void Z0(b2.b bVar) {
        c9.a.c(this, bVar);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] c1() {
        return c9.a.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f21222a == motionPhotoMetadata.f21222a && this.f21223b == motionPhotoMetadata.f21223b && this.f21224c == motionPhotoMetadata.f21224c && this.f21225d == motionPhotoMetadata.f21225d && this.f21226e == motionPhotoMetadata.f21226e;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + f.a(this.f21222a)) * 31) + f.a(this.f21223b)) * 31) + f.a(this.f21224c)) * 31) + f.a(this.f21225d)) * 31) + f.a(this.f21226e);
    }

    public String toString() {
        long j10 = this.f21222a;
        long j11 = this.f21223b;
        long j12 = this.f21224c;
        long j13 = this.f21225d;
        long j14 = this.f21226e;
        StringBuilder sb2 = new StringBuilder(218);
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(j10);
        sb2.append(", photoSize=");
        sb2.append(j11);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(j12);
        sb2.append(", videoStartPosition=");
        sb2.append(j13);
        sb2.append(", videoSize=");
        sb2.append(j14);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f21222a);
        parcel.writeLong(this.f21223b);
        parcel.writeLong(this.f21224c);
        parcel.writeLong(this.f21225d);
        parcel.writeLong(this.f21226e);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.f21222a = j10;
        this.f21223b = j11;
        this.f21224c = j12;
        this.f21225d = j13;
        this.f21226e = j14;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.f21222a = parcel.readLong();
        this.f21223b = parcel.readLong();
        this.f21224c = parcel.readLong();
        this.f21225d = parcel.readLong();
        this.f21226e = parcel.readLong();
    }
}
