package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzxe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "GoogleAuthCredentialCreator")
/* loaded from: classes3.dex */
public class GoogleAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new f0();
    @SafeParcelable.Field(getter = "getIdToken", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f23228a;
    @SafeParcelable.Field(getter = "getAccessToken", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f23229b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GoogleAuthCredential(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f23228a = str;
        this.f23229b = str2;
    }

    public static zzxe l1(GoogleAuthCredential googleAuthCredential, String str) {
        Preconditions.checkNotNull(googleAuthCredential);
        return new zzxe(googleAuthCredential.f23228a, googleAuthCredential.f23229b, googleAuthCredential.j1(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String j1() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential k1() {
        return new GoogleAuthCredential(this.f23228a, this.f23229b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23228a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f23229b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
