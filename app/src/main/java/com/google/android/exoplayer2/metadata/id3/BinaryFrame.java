package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f21179b;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<BinaryFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BinaryFrame[] newArray(int i10) {
            return new BinaryFrame[i10];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f21179b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f21198a.equals(binaryFrame.f21198a) && Arrays.equals(this.f21179b, binaryFrame.f21179b);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21198a.hashCode()) * 31) + Arrays.hashCode(this.f21179b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21198a);
        parcel.writeByteArray(this.f21179b);
    }

    BinaryFrame(Parcel parcel) {
        super((String) n0.j(parcel.readString()));
        this.f21179b = (byte[]) n0.j(parcel.createByteArray());
    }
}
