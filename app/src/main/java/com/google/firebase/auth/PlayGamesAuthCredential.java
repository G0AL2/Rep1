package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzxe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "PlayGamesAuthCredentialCreator")
/* loaded from: classes3.dex */
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new k0();
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f23242a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PlayGamesAuthCredential(@SafeParcelable.Param(id = 1) String str) {
        this.f23242a = Preconditions.checkNotEmpty(str);
    }

    public static zzxe l1(PlayGamesAuthCredential playGamesAuthCredential, String str) {
        Preconditions.checkNotNull(playGamesAuthCredential);
        return new zzxe(null, null, playGamesAuthCredential.j1(), null, null, playGamesAuthCredential.f23242a, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String j1() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential k1() {
        return new PlayGamesAuthCredential(this.f23242a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23242a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
