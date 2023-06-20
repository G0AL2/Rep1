package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f646a;

    /* renamed from: b  reason: collision with root package name */
    public int f647b;

    /* renamed from: c  reason: collision with root package name */
    public int f648c;

    /* renamed from: d  reason: collision with root package name */
    public int f649d;

    /* renamed from: e  reason: collision with root package name */
    public int f650e;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f646a = parcel.readInt();
        this.f648c = parcel.readInt();
        this.f649d = parcel.readInt();
        this.f650e = parcel.readInt();
        this.f647b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f646a);
        parcel.writeInt(this.f648c);
        parcel.writeInt(this.f649d);
        parcel.writeInt(this.f650e);
        parcel.writeInt(this.f647b);
    }
}
