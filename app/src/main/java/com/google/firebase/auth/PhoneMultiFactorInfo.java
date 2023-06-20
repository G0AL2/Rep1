package com.google.firebase.auth;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zznd;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "PhoneMultiFactorInfoCreator")
/* loaded from: classes3.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new j0();
    @SafeParcelable.Field(getter = "getUid", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f23238a;
    @SafeParcelable.Field(getter = "getDisplayName", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f23239b;
    @SafeParcelable.Field(getter = "getEnrollmentTimestamp", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private final long f23240c;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 4)

    /* renamed from: d  reason: collision with root package name */
    private final String f23241d;

    @SafeParcelable.Constructor
    public PhoneMultiFactorInfo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) long j10, @SafeParcelable.Param(id = 4) String str3) {
        this.f23238a = Preconditions.checkNotEmpty(str);
        this.f23239b = str2;
        this.f23240c = j10;
        this.f23241d = Preconditions.checkNotEmpty(str3);
    }

    public String e() {
        return this.f23238a;
    }

    public String getDisplayName() {
        return this.f23239b;
    }

    public String getPhoneNumber() {
        return this.f23241d;
    }

    public long j1() {
        return this.f23240c;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f23238a);
            jSONObject.putOpt("displayName", this.f23239b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f23240c));
            jSONObject.putOpt("phoneNumber", this.f23241d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zznd(e10);
        }
    }

    @Override // android.os.Parcelable
    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, e(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeLong(parcel, 3, j1());
        SafeParcelWriter.writeString(parcel, 4, getPhoneNumber(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
