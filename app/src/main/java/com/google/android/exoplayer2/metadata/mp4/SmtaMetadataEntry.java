package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j8.b2;
import j8.p1;
import mb.b;

/* loaded from: classes2.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f21231a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21232b;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<SmtaMetadataEntry> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SmtaMetadataEntry[] newArray(int i10) {
            return new SmtaMetadataEntry[i10];
        }
    }

    /* synthetic */ SmtaMetadataEntry(Parcel parcel, a aVar) {
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
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f21231a == smtaMetadataEntry.f21231a && this.f21232b == smtaMetadataEntry.f21232b;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + b.a(this.f21231a)) * 31) + this.f21232b;
    }

    public String toString() {
        float f10 = this.f21231a;
        int i10 = this.f21232b;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f21231a);
        parcel.writeInt(this.f21232b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }

    public SmtaMetadataEntry(float f10, int i10) {
        this.f21231a = f10;
        this.f21232b = i10;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.f21231a = parcel.readFloat();
        this.f21232b = parcel.readInt();
    }
}
