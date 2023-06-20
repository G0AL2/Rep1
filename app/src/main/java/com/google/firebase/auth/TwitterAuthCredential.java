package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzxe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "TwitterAuthCredentialCreator")
/* loaded from: classes3.dex */
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new l0();
    @SafeParcelable.Field(getter = "getToken", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private String f23243a;
    @SafeParcelable.Field(getter = "getSecret", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private String f23244b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public TwitterAuthCredential(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.f23243a = Preconditions.checkNotEmpty(str);
        this.f23244b = Preconditions.checkNotEmpty(str2);
    }

    public static zzxe l1(TwitterAuthCredential twitterAuthCredential, String str) {
        Preconditions.checkNotNull(twitterAuthCredential);
        return new zzxe(null, twitterAuthCredential.f23243a, twitterAuthCredential.j1(), null, twitterAuthCredential.f23244b, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String j1() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential k1() {
        return new TwitterAuthCredential(this.f23243a, this.f23244b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23243a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f23244b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
