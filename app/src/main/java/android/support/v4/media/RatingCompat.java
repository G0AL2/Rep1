package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f632a;

    /* renamed from: b  reason: collision with root package name */
    private final float f633b;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    RatingCompat(int i10, float f10) {
        this.f632a = i10;
        this.f633b = f10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f632a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f632a);
        sb2.append(" rating=");
        float f10 = this.f633b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f632a);
        parcel.writeFloat(this.f633b);
    }
}
