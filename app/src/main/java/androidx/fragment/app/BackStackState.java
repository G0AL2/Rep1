package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.t;
import androidx.lifecycle.i;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f2959a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<String> f2960b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f2961c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f2962d;

    /* renamed from: e  reason: collision with root package name */
    final int f2963e;

    /* renamed from: f  reason: collision with root package name */
    final String f2964f;

    /* renamed from: g  reason: collision with root package name */
    final int f2965g;

    /* renamed from: h  reason: collision with root package name */
    final int f2966h;

    /* renamed from: i  reason: collision with root package name */
    final CharSequence f2967i;

    /* renamed from: j  reason: collision with root package name */
    final int f2968j;

    /* renamed from: k  reason: collision with root package name */
    final CharSequence f2969k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList<String> f2970l;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList<String> f2971m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f2972n;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    public BackStackState(androidx.fragment.app.a aVar) {
        int size = aVar.f3189a.size();
        this.f2959a = new int[size * 5];
        if (aVar.f3195g) {
            this.f2960b = new ArrayList<>(size);
            this.f2961c = new int[size];
            this.f2962d = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                t.a aVar2 = aVar.f3189a.get(i10);
                int i12 = i11 + 1;
                this.f2959a[i11] = aVar2.f3205a;
                ArrayList<String> arrayList = this.f2960b;
                Fragment fragment = aVar2.f3206b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f2959a;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f3207c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f3208d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f3209e;
                iArr[i15] = aVar2.f3210f;
                this.f2961c[i10] = aVar2.f3211g.ordinal();
                this.f2962d[i10] = aVar2.f3212h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.f2963e = aVar.f3194f;
            this.f2964f = aVar.f3196h;
            this.f2965g = aVar.f3085s;
            this.f2966h = aVar.f3197i;
            this.f2967i = aVar.f3198j;
            this.f2968j = aVar.f3199k;
            this.f2969k = aVar.f3200l;
            this.f2970l = aVar.f3201m;
            this.f2971m = aVar.f3202n;
            this.f2972n = aVar.f3203o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public androidx.fragment.app.a c(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f2959a.length) {
            t.a aVar2 = new t.a();
            int i12 = i10 + 1;
            aVar2.f3205a = this.f2959a[i10];
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2959a[i12]);
            }
            String str = this.f2960b.get(i11);
            if (str != null) {
                aVar2.f3206b = fragmentManager.g0(str);
            } else {
                aVar2.f3206b = null;
            }
            aVar2.f3211g = i.c.values()[this.f2961c[i11]];
            aVar2.f3212h = i.c.values()[this.f2962d[i11]];
            int[] iArr = this.f2959a;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f3207c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f3208d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f3209e = i18;
            int i19 = iArr[i17];
            aVar2.f3210f = i19;
            aVar.f3190b = i14;
            aVar.f3191c = i16;
            aVar.f3192d = i18;
            aVar.f3193e = i19;
            aVar.f(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f3194f = this.f2963e;
        aVar.f3196h = this.f2964f;
        aVar.f3085s = this.f2965g;
        aVar.f3195g = true;
        aVar.f3197i = this.f2966h;
        aVar.f3198j = this.f2967i;
        aVar.f3199k = this.f2968j;
        aVar.f3200l = this.f2969k;
        aVar.f3201m = this.f2970l;
        aVar.f3202n = this.f2971m;
        aVar.f3203o = this.f2972n;
        aVar.r(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2959a);
        parcel.writeStringList(this.f2960b);
        parcel.writeIntArray(this.f2961c);
        parcel.writeIntArray(this.f2962d);
        parcel.writeInt(this.f2963e);
        parcel.writeString(this.f2964f);
        parcel.writeInt(this.f2965g);
        parcel.writeInt(this.f2966h);
        TextUtils.writeToParcel(this.f2967i, parcel, 0);
        parcel.writeInt(this.f2968j);
        TextUtils.writeToParcel(this.f2969k, parcel, 0);
        parcel.writeStringList(this.f2970l);
        parcel.writeStringList(this.f2971m);
        parcel.writeInt(this.f2972n ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f2959a = parcel.createIntArray();
        this.f2960b = parcel.createStringArrayList();
        this.f2961c = parcel.createIntArray();
        this.f2962d = parcel.createIntArray();
        this.f2963e = parcel.readInt();
        this.f2964f = parcel.readString();
        this.f2965g = parcel.readInt();
        this.f2966h = parcel.readInt();
        this.f2967i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2968j = parcel.readInt();
        this.f2969k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2970l = parcel.createStringArrayList();
        this.f2971m = parcel.createStringArrayList();
        this.f2972n = parcel.readInt() != 0;
    }
}
