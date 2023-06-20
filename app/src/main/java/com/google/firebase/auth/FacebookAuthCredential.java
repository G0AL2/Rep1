package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzxe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "FacebookAuthCredentialCreator")
/* loaded from: classes3.dex */
public class FacebookAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new s0();
    @SafeParcelable.Field(getter = "getAccessToken", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f23209a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public FacebookAuthCredential(@SafeParcelable.Param(id = 1) String str) {
        this.f23209a = Preconditions.checkNotEmpty(str);
    }

    public static zzxe l1(FacebookAuthCredential facebookAuthCredential, String str) {
        Preconditions.checkNotNull(facebookAuthCredential);
        return new zzxe(null, facebookAuthCredential.f23209a, facebookAuthCredential.j1(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String j1() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential k1() {
        return new FacebookAuthCredential(this.f23209a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23209a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
