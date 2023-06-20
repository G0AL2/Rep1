package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final Handler f671a = null;

    /* renamed from: b  reason: collision with root package name */
    android.support.v4.os.a f672b;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ResultReceiver> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    /* loaded from: classes.dex */
    class b extends a.AbstractBinderC0030a {
        b() {
        }

        @Override // android.support.v4.os.a
        public void n(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f671a;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                resultReceiver.c(i10, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f674a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f675b;

        c(int i10, Bundle bundle) {
            this.f674a = i10;
            this.f675b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.c(this.f674a, this.f675b);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f672b = a.AbstractBinderC0030a.X(parcel.readStrongBinder());
    }

    protected void c(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f672b == null) {
                this.f672b = new b();
            }
            parcel.writeStrongBinder(this.f672b.asBinder());
        }
    }
}
