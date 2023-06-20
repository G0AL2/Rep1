package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final IntentSender f734a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f735b;

    /* renamed from: c  reason: collision with root package name */
    private final int f736c;

    /* renamed from: d  reason: collision with root package name */
    private final int f737d;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<IntentSenderRequest> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private IntentSender f738a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f739b;

        /* renamed from: c  reason: collision with root package name */
        private int f740c;

        /* renamed from: d  reason: collision with root package name */
        private int f741d;

        public b(IntentSender intentSender) {
            this.f738a = intentSender;
        }

        public IntentSenderRequest a() {
            return new IntentSenderRequest(this.f738a, this.f739b, this.f740c, this.f741d);
        }

        public b b(Intent intent) {
            this.f739b = intent;
            return this;
        }

        public b c(int i10, int i11) {
            this.f741d = i10;
            this.f740c = i11;
            return this;
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f734a = intentSender;
        this.f735b = intent;
        this.f736c = i10;
        this.f737d = i11;
    }

    public Intent c() {
        return this.f735b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f736c;
    }

    public int f() {
        return this.f737d;
    }

    public IntentSender g() {
        return this.f734a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f734a, i10);
        parcel.writeParcelable(this.f735b, i10);
        parcel.writeInt(this.f736c);
        parcel.writeInt(this.f737d);
    }

    IntentSenderRequest(Parcel parcel) {
        this.f734a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f735b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f736c = parcel.readInt();
        this.f737d = parcel.readInt();
    }
}
