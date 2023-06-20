package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f708a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f709b;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ActivityResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    public ActivityResult(int i10, Intent intent) {
        this.f708a = i10;
        this.f709b = intent;
    }

    public static String f(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent c() {
        return this.f709b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f708a;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f(this.f708a) + ", data=" + this.f709b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f708a);
        parcel.writeInt(this.f709b == null ? 0 : 1);
        Intent intent = this.f709b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f708a = parcel.readInt();
        this.f709b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
