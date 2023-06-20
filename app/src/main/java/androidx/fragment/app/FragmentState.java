package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final String f3070a;

    /* renamed from: b  reason: collision with root package name */
    final String f3071b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f3072c;

    /* renamed from: d  reason: collision with root package name */
    final int f3073d;

    /* renamed from: e  reason: collision with root package name */
    final int f3074e;

    /* renamed from: f  reason: collision with root package name */
    final String f3075f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f3076g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f3077h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f3078i;

    /* renamed from: j  reason: collision with root package name */
    final Bundle f3079j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f3080k;

    /* renamed from: l  reason: collision with root package name */
    final int f3081l;

    /* renamed from: m  reason: collision with root package name */
    Bundle f3082m;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState(Fragment fragment) {
        this.f3070a = fragment.getClass().getName();
        this.f3071b = fragment.mWho;
        this.f3072c = fragment.mFromLayout;
        this.f3073d = fragment.mFragmentId;
        this.f3074e = fragment.mContainerId;
        this.f3075f = fragment.mTag;
        this.f3076g = fragment.mRetainInstance;
        this.f3077h = fragment.mRemoving;
        this.f3078i = fragment.mDetached;
        this.f3079j = fragment.mArguments;
        this.f3080k = fragment.mHidden;
        this.f3081l = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3070a);
        sb2.append(" (");
        sb2.append(this.f3071b);
        sb2.append(")}:");
        if (this.f3072c) {
            sb2.append(" fromLayout");
        }
        if (this.f3074e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3074e));
        }
        String str = this.f3075f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f3075f);
        }
        if (this.f3076g) {
            sb2.append(" retainInstance");
        }
        if (this.f3077h) {
            sb2.append(" removing");
        }
        if (this.f3078i) {
            sb2.append(" detached");
        }
        if (this.f3080k) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3070a);
        parcel.writeString(this.f3071b);
        parcel.writeInt(this.f3072c ? 1 : 0);
        parcel.writeInt(this.f3073d);
        parcel.writeInt(this.f3074e);
        parcel.writeString(this.f3075f);
        parcel.writeInt(this.f3076g ? 1 : 0);
        parcel.writeInt(this.f3077h ? 1 : 0);
        parcel.writeInt(this.f3078i ? 1 : 0);
        parcel.writeBundle(this.f3079j);
        parcel.writeInt(this.f3080k ? 1 : 0);
        parcel.writeBundle(this.f3082m);
        parcel.writeInt(this.f3081l);
    }

    FragmentState(Parcel parcel) {
        this.f3070a = parcel.readString();
        this.f3071b = parcel.readString();
        this.f3072c = parcel.readInt() != 0;
        this.f3073d = parcel.readInt();
        this.f3074e = parcel.readInt();
        this.f3075f = parcel.readString();
        this.f3076g = parcel.readInt() != 0;
        this.f3077h = parcel.readInt() != 0;
        this.f3078i = parcel.readInt() != 0;
        this.f3079j = parcel.readBundle();
        this.f3080k = parcel.readInt() != 0;
        this.f3082m = parcel.readBundle();
        this.f3081l = parcel.readInt();
    }
}
