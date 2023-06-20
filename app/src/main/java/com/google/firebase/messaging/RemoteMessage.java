package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.d;
import java.util.Map;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new m0();
    @SafeParcelable.Field(id = 2)

    /* renamed from: a  reason: collision with root package name */
    Bundle f23436a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f23437b;

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f23436a = bundle;
    }

    public Map<String, String> getData() {
        if (this.f23437b == null) {
            this.f23437b = d.a.a(this.f23436a);
        }
        return this.f23437b;
    }

    public long getSentTime() {
        Object obj = this.f23436a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
                return 0L;
            }
        }
        return 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        m0.c(this, parcel, i10);
    }
}
