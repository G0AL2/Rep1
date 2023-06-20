package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzd  reason: invalid package */
/* loaded from: classes2.dex */
final class zzzd {
    private static final zzzd zzb = new zzzd(true);
    final zzabp zza = new zzabf(16);
    private boolean zzc;
    private boolean zzd;

    private zzzd() {
    }

    public static zzzd zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzd(com.google.android.gms.internal.p002firebaseauthapi.zzzc r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.firebase-auth-api.zzacj r0 = r4.zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzzr.zze(r5)
            com.google.android.gms.internal.firebase-auth-api.zzacj r1 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zza
            com.google.android.gms.internal.firebase-auth-api.zzack r1 = com.google.android.gms.internal.p002firebaseauthapi.zzack.INT
            com.google.android.gms.internal.firebase-auth-api.zzack r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaaq
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzzv
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzzn
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzyi
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.zzacj r4 = r4.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzack r4 = r4.zza()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzzd.zzd(com.google.android.gms.internal.firebase-auth-api.zzzc, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzzd zzzdVar = new zzzd();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzzdVar.zzc((zzzc) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzzdVar.zzc((zzzc) entry.getKey(), entry.getValue());
        }
        zzzdVar.zzd = this.zzd;
        return zzzdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzzd) {
            return this.zza.equals(((zzzd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzzc zzzcVar, Object obj) {
        if (zzzcVar.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    zzd(zzzcVar, arrayList.get(i10));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzd(zzzcVar, obj);
        }
        if (obj instanceof zzzv) {
            this.zzd = true;
        }
        this.zza.put(zzzcVar, obj);
    }

    private zzzd(boolean z10) {
        zzb();
        zzb();
    }
}
