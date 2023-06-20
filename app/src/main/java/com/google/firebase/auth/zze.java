package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzxe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "DefaultOAuthCredentialCreator")
/* loaded from: classes3.dex */
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new q0();
    @SafeParcelable.Field(getter = "getProvider", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f23368a;
    @SafeParcelable.Field(getter = "getIdToken", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f23369b;
    @SafeParcelable.Field(getter = "getAccessToken", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private final String f23370c;
    @SafeParcelable.Field(getter = "getWebSignInCredential", id = 4)

    /* renamed from: d  reason: collision with root package name */
    private final zzxe f23371d;
    @SafeParcelable.Field(getter = "getPendingToken", id = 5)

    /* renamed from: e  reason: collision with root package name */
    private final String f23372e;
    @SafeParcelable.Field(getter = "getSecret", id = 6)

    /* renamed from: f  reason: collision with root package name */
    private final String f23373f;
    @SafeParcelable.Field(getter = "getRawNonce", id = 7)

    /* renamed from: g  reason: collision with root package name */
    private final String f23374g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) zzxe zzxeVar, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6) {
        this.f23368a = zzae.zzc(str);
        this.f23369b = str2;
        this.f23370c = str3;
        this.f23371d = zzxeVar;
        this.f23372e = str4;
        this.f23373f = str5;
        this.f23374g = str6;
    }

    public static zze l1(zzxe zzxeVar) {
        Preconditions.checkNotNull(zzxeVar, "Must specify a non-null webSignInCredential");
        return new zze(null, null, null, zzxeVar, null, null, null);
    }

    public static zze m1(String str, String str2, String str3, String str4, String str5) {
        Preconditions.checkNotEmpty(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zze(str, str2, str3, null, str4, str5, null);
    }

    public static zzxe n1(zze zzeVar, String str) {
        Preconditions.checkNotNull(zzeVar);
        zzxe zzxeVar = zzeVar.f23371d;
        return zzxeVar != null ? zzxeVar : new zzxe(zzeVar.f23369b, zzeVar.f23370c, zzeVar.f23368a, null, zzeVar.f23373f, null, str, zzeVar.f23372e, zzeVar.f23374g);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String j1() {
        return this.f23368a;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential k1() {
        return new zze(this.f23368a, this.f23369b, this.f23370c, this.f23371d, this.f23372e, this.f23373f, this.f23374g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23368a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f23369b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f23370c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f23371d, i10, false);
        SafeParcelWriter.writeString(parcel, 5, this.f23372e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f23373f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f23374g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
