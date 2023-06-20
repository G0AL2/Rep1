package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzt  reason: invalid package */
/* loaded from: classes2.dex */
public class zzzt extends IOException {
    private zzaaq zza;

    public zzzt(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzs zza() {
        return new zzzs("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzt zzb() {
        return new zzzt("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzt zzc() {
        return new zzzt("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzt zzd() {
        return new zzzt("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzt zze() {
        return new zzzt("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzt zzf() {
        return new zzzt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzt zzg() {
        return new zzzt("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzt zzi() {
        return new zzzt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzzt zzh(zzaaq zzaaqVar) {
        this.zza = zzaaqVar;
        return this;
    }

    public zzzt(String str) {
        super(str);
        this.zza = null;
    }
}
