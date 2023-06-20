package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f14464a;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<WrappedParcelable> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public WrappedParcelable[] newArray(int i10) {
            return new WrappedParcelable[i10];
        }
    }

    protected WrappedParcelable(Parcel parcel) {
        this.f14464a = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.f14464a;
        if (bArr != null) {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Parcelable readParcelable = obtain.readParcelable(classLoader);
            obtain.recycle();
            return readParcelable;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f14464a);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f14464a = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.f14464a = bArr;
    }
}
