package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final Parcelable f2827a;

    /* renamed from: b  reason: collision with root package name */
    public static final AbsSavedState f2826b = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    /* loaded from: classes.dex */
    static class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f2826b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public AbsSavedState[] newArray(int i10) {
            return new AbsSavedState[i10];
        }
    }

    public final Parcelable c() {
        return this.f2827a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f2827a, i10);
    }

    private AbsSavedState() {
        this.f2827a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2827a = parcelable == f2826b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2827a = readParcelable == null ? f2826b : readParcelable;
    }
}
