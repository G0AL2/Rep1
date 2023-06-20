package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public abstract class ReviewInfo implements Parcelable {
    public static ReviewInfo e(PendingIntent pendingIntent) {
        return new a(pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract PendingIntent c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(c(), 0);
    }
}
