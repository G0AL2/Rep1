package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "DefaultFirebaseUserMetadataCreator")
/* loaded from: classes3.dex */
public final class zzz implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzz> CREATOR = new sb.d();
    @SafeParcelable.Field(getter = "getLastSignInTimestamp", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final long f23321a;
    @SafeParcelable.Field(getter = "getCreationTimestamp", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private final long f23322b;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(id = 1) long j10, @SafeParcelable.Param(id = 2) long j11) {
        this.f23321a = j10;
        this.f23322b = j11;
    }

    @Override // com.google.firebase.auth.FirebaseUserMetadata
    public final long A() {
        return this.f23322b;
    }

    @Override // com.google.firebase.auth.FirebaseUserMetadata
    public final long L() {
        return this.f23321a;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f23321a);
            jSONObject.put("creationTimestamp", this.f23322b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f23321a);
        SafeParcelWriter.writeLong(parcel, 2, this.f23322b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
