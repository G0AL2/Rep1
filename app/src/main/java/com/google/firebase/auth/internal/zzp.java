package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;
import sb.n0;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "DefaultAdditionalUserInfoCreator")
/* loaded from: classes3.dex */
public final class zzp implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzp> CREATOR = new n0();
    @SafeParcelable.Field(getter = "getProviderId", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f23293a;
    @SafeParcelable.Field(getter = "getRawUserInfo", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f23294b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f23295c;
    @SafeParcelable.Field(getter = "isNewUser", id = 3)

    /* renamed from: d  reason: collision with root package name */
    private final boolean f23296d;

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) boolean z10) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.f23293a = str;
        this.f23294b = str2;
        this.f23295c = c.c(str2);
        this.f23296d = z10;
    }

    public zzp(boolean z10) {
        this.f23296d = z10;
        this.f23294b = null;
        this.f23293a = null;
        this.f23295c = null;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final Map<String, Object> N0() {
        return this.f23295c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final boolean h0() {
        return this.f23296d;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String q() {
        return this.f23293a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23293a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f23294b, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f23296d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String z0() {
        if ("github.com".equals(this.f23293a)) {
            return (String) this.f23295c.get(AppLovinEventTypes.USER_LOGGED_IN);
        }
        if ("twitter.com".equals(this.f23293a)) {
            return (String) this.f23295c.get("screen_name");
        }
        return null;
    }
}
