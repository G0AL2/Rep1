package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzxe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "GithubAuthCredentialCreator")
/* loaded from: classes3.dex */
public class GithubAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new i1();
    @SafeParcelable.Field(getter = "getToken", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private String f23227a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GithubAuthCredential(@SafeParcelable.Param(id = 1) String str) {
        this.f23227a = Preconditions.checkNotEmpty(str);
    }

    public static zzxe l1(GithubAuthCredential githubAuthCredential, String str) {
        Preconditions.checkNotNull(githubAuthCredential);
        return new zzxe(null, githubAuthCredential.f23227a, githubAuthCredential.j1(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String j1() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential k1() {
        return new GithubAuthCredential(this.f23227a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23227a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
