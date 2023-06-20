package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<FragmentState> f3062a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<String> f3063b;

    /* renamed from: c  reason: collision with root package name */
    BackStackState[] f3064c;

    /* renamed from: d  reason: collision with root package name */
    int f3065d;

    /* renamed from: e  reason: collision with root package name */
    String f3066e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<String> f3067f;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<Bundle> f3068g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f3069h;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f3066e = null;
        this.f3067f = new ArrayList<>();
        this.f3068g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f3062a);
        parcel.writeStringList(this.f3063b);
        parcel.writeTypedArray(this.f3064c, i10);
        parcel.writeInt(this.f3065d);
        parcel.writeString(this.f3066e);
        parcel.writeStringList(this.f3067f);
        parcel.writeTypedList(this.f3068g);
        parcel.writeTypedList(this.f3069h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3066e = null;
        this.f3067f = new ArrayList<>();
        this.f3068g = new ArrayList<>();
        this.f3062a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3063b = parcel.createStringArrayList();
        this.f3064c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3065d = parcel.readInt();
        this.f3066e = parcel.readString();
        this.f3067f = parcel.createStringArrayList();
        this.f3068g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3069h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
